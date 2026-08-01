package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class d {
    private static String a = null;
    private static long b = -1;
    private static boolean c = false;
    private static FileObserver d;
    private static ActivityManager.ProcessErrorStateInfo e;

    static String a(Context context, int i) {
        if (r.a(256)) {
            c = false;
            return "TEST_ANR_INFO";
        }
        if (SystemClock.uptimeMillis() - b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo a2 = com.apm.insight.l.a.a(context, i);
            if (a2 != null && Process.myPid() == a2.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = e;
                if (processErrorStateInfo != null && a.a(processErrorStateInfo, a2)) {
                    return null;
                }
                e = a2;
                a = null;
                b = SystemClock.uptimeMillis();
                c = false;
                return a.a(a2);
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

    public static JSONObject a(boolean z) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", v.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public static void a(final String str, final com.apm.insight.f fVar) {
        FileObserver fileObserver = d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str, Opcodes.L2I) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public void onEvent(int i, String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.a = fVar.a(str, str2);
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
            }
        };
        d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static boolean a() {
        return c;
    }

    public static void b() {
        e = null;
    }
}
