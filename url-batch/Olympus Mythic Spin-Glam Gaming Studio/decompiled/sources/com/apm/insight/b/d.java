package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.b.h;
import com.apm.insight.l.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ANRUtils.java */
/* loaded from: classes14.dex */
public final class d {
    private static String a = null;
    private static long b = -1;
    private static boolean c;
    private static FileObserver d;
    private static ActivityManager.ProcessErrorStateInfo e;

    public static void a(final String str, final h.a aVar) {
        FileObserver fileObserver = d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i, @Nullable String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.a = aVar.a();
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            }
        };
        d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static JSONObject a() throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", m.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            return null;
        }
    }

    static String a(Context context) {
        if (SystemClock.uptimeMillis() - b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo a2 = com.apm.insight.l.a.a(context);
            if (a2 != null && Process.myPid() == a2.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = e;
                if (processErrorStateInfo != null && String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(a2.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(a2.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(a2.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(a2.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(a2.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(a2.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(a2.longMsg))) {
                    return null;
                }
                e = a2;
                a = null;
                b = SystemClock.uptimeMillis();
                c = false;
                if (!com.apm.insight.e.t()) {
                    return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("|------------- processErrorStateInfo--------------|\n");
                sb.append("condition: " + a2.condition + "\n");
                sb.append("processName: " + a2.processName + "\n");
                sb.append("pid: " + a2.pid + "\n");
                sb.append("uid: " + a2.uid + "\n");
                sb.append("tag: " + a2.tag + "\n");
                sb.append("shortMsg : " + a2.shortMsg + "\n");
                sb.append("longMsg : " + a2.longMsg + "\n");
                sb.append("-----------------------end----------------------------");
                return sb.toString();
            }
        } catch (Throwable unused) {
        }
        String str = a;
        if (str == null) {
            return null;
        }
        c = true;
        a = null;
        b = SystemClock.uptimeMillis();
        return str;
    }

    public static boolean b() {
        return c;
    }

    public static void c() {
        e = null;
    }
}
