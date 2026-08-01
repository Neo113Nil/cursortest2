package com.apm.insight.b;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.ktor.http.LinkHeader;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {
    private static MessageQueue a;
    private static Field b;
    private static Field c;

    protected static Message a(Message message) {
        Field field = c;
        if (field != null) {
            try {
                return (Message) field.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.Message").getDeclaredField(LinkHeader.Rel.Next);
            c = declaredField;
            declaredField.setAccessible(true);
            return (Message) c.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Message a(MessageQueue messageQueue) {
        Field field = b;
        if (field != null) {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            b = declaredField;
            declaredField.setAccessible(true);
            return (Message) b.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static MessageQueue a() {
        if (a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            a = mainLooper == Looper.myLooper() ? Looper.myQueue() : mainLooper.getQueue();
        }
        return a;
    }

    public static JSONArray a(int i, long j) {
        MessageQueue a2 = a();
        JSONArray jSONArray = new JSONArray();
        if (a2 == null) {
            return jSONArray;
        }
        try {
            synchronized (a2) {
                Message a3 = a(a2);
                if (a3 == null) {
                    return jSONArray;
                }
                int i2 = 0;
                int i3 = 0;
                while (a3 != null && i2 < i) {
                    i2++;
                    i3++;
                    JSONObject a4 = a(a3, j);
                    try {
                        a4.put(FacebookMediationAdapter.KEY_ID, i3);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(a4);
                    a3 = a(a3);
                }
                return jSONArray;
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return jSONArray;
        }
    }

    private static JSONObject a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put(TypedValues.AttributesType.S_TARGET, String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
