package com.apm.insight.b;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.yandex.div.core.ScrollDirection;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LooperUtil.java */
/* loaded from: classes15.dex */
public final class j {
    private static MessageQueue a;
    private static Field b;
    private static Field c;

    public static MessageQueue a() {
        if (a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                a = Looper.myQueue();
            } else {
                a = mainLooper.getQueue();
            }
        }
        return a;
    }

    public static Message a(MessageQueue messageQueue) {
        Field field = b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                b = declaredField;
                declaredField.setAccessible(true);
                return (Message) b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static Message a(Message message) {
        Field field = c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField(ScrollDirection.NEXT);
                c = declaredField;
                declaredField.setAccessible(true);
                return (Message) c.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(message);
        } catch (Exception unused2) {
            return null;
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
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            Object obj = message.obj;
            if (obj != null) {
                jSONObject.put("obj", obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONArray a(long j) {
        MessageQueue a2 = a();
        JSONArray jSONArray = new JSONArray();
        if (a2 == null) {
            return jSONArray;
        }
        try {
            synchronized (a2) {
                try {
                    Message a3 = a(a2);
                    if (a3 == null) {
                        return jSONArray;
                    }
                    int i = 0;
                    int i2 = 0;
                    while (a3 != null && i < 100) {
                        i++;
                        i2++;
                        JSONObject a4 = a(a3, j);
                        try {
                            a4.put("id", i2);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(a4);
                        a3 = a(a3);
                    }
                    return jSONArray;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            return jSONArray;
        }
    }
}
