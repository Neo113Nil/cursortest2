package com.apm.insight.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.b.k;
import com.apm.insight.i;
import com.apm.insight.l.q;
import com.apm.insight.l.v;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.o;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    public static int a() {
        return 6;
    }

    private static void a(String str, String str2, String str3) {
        for (ICrashCallback iCrashCallback : o.a().d()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.NATIVE, str, str3, str2);
                } else {
                    iCrashCallback.onCrash(CrashType.NATIVE, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("main".equalsIgnoreCase(str)) {
            return v.a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int activeCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[activeCount + (activeCount / 2)];
        int enumerate = threadGroup.enumerate(threadArr);
        for (int i = 0; i < enumerate; i++) {
            String name = threadArr[i].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return v.a(threadArr[i].getStackTrace());
            }
        }
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = entry.getKey().getName();
                if (name2.equals(str) || name2.startsWith(str) || name2.endsWith(str)) {
                    return v.a(entry.getValue());
                }
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return "";
    }

    public static void onNativeCrash(final String str) {
        String c;
        String a;
        final long currentTimeMillis = System.currentTimeMillis();
        q.a((Object) "[onNativeCrash] enter");
        try {
            try {
                com.apm.insight.k.b.a().b();
                final File e = com.apm.insight.l.o.e(new File(com.apm.insight.l.o.a(), i.f()));
                com.apm.insight.entity.a a2 = f.a().a(CrashType.NATIVE, null, new c.a() { // from class: com.apm.insight.nativecrash.b.1
                    @Override // com.apm.insight.runtime.a.c.a
                    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
                        String str2;
                        String str3;
                        str2 = "true";
                        if (i != 1) {
                            if (i == 2) {
                                JSONArray c2 = g.b().c();
                                long uptimeMillis = SystemClock.uptimeMillis();
                                JSONObject a3 = g.b().a(uptimeMillis).a();
                                JSONArray a4 = k.a(100, uptimeMillis);
                                aVar.a("history_message", (Object) c2);
                                aVar.a("current_message", a3);
                                aVar.a("pending_messages", (Object) a4);
                                aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                                aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.b.a()));
                            } else if (i != 3) {
                                if (i == 4) {
                                    com.apm.insight.l.a.a(i.g(), aVar.h());
                                }
                            } else if (com.apm.insight.runtime.a.e()) {
                                aVar.a("all_thread_stacks", v.b(str));
                                str3 = "has_all_thread_stack";
                            }
                            return aVar;
                        }
                        String str4 = str;
                        if (str4 != null && str4.length() != 0) {
                            aVar.a("java_data", (Object) b.b(str));
                        }
                        str2 = Npth.hasCrashWhenNativeCrash() ? "true" : "false";
                        str3 = "crash_after_crash";
                        aVar.a(str3, str2);
                        return aVar;
                    }

                    @Override // com.apm.insight.runtime.a.c.a
                    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar, boolean z) {
                        try {
                            JSONObject h = aVar.h();
                            if (h.length() > 0) {
                                com.apm.insight.l.i.a(new File(e.getAbsolutePath() + '.' + i), h, false);
                            }
                        } catch (IOException e2) {
                            com.apm.insight.c.a().a("NPTH_CATCH", e2);
                        }
                        if (i == 0) {
                            com.apm.insight.a.a.a().b();
                            com.apm.insight.a.a.a().a(CrashType.NATIVE, currentTimeMillis, i.f());
                        }
                        return aVar;
                    }

                    @Override // com.apm.insight.runtime.a.c.a
                    public void a(Throwable th) {
                    }
                }, true);
                JSONObject h = a2.h();
                if (h != null && h.length() != 0) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j = currentTimeMillis2 - currentTimeMillis;
                    try {
                        h.put("java_end", currentTimeMillis2);
                        a2.b("crash_cost", String.valueOf(j));
                        a2.a("crash_cost", String.valueOf(j / 1000));
                    } catch (Throwable unused) {
                    }
                    File file = new File(e.getAbsolutePath() + ".tmp");
                    com.apm.insight.l.i.a(file, h, false);
                    file.renameTo(e);
                }
            } catch (Throwable unused2) {
                a("", null, str);
                return;
            }
        } catch (Throwable th) {
            try {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
                if (o.a().d().isEmpty()) {
                    return;
                }
                File file2 = new File(com.apm.insight.l.o.a(), i.f());
                e eVar = new e(file2);
                eVar.b(file2);
                c = eVar.c();
                a = eVar.a();
            } catch (Throwable th2) {
                try {
                    if (!o.a().d().isEmpty()) {
                        File file3 = new File(com.apm.insight.l.o.a(), i.f());
                        e eVar2 = new e(file3);
                        eVar2.b(file3);
                        a(eVar2.c(), eVar2.a(), str);
                    }
                } catch (Throwable unused3) {
                    a("", null, str);
                }
                throw th2;
            }
        }
        if (o.a().d().isEmpty()) {
            return;
        }
        File file4 = new File(com.apm.insight.l.o.a(), i.f());
        e eVar3 = new e(file4);
        eVar3.b(file4);
        c = eVar3.c();
        a = eVar3.a();
        a(c, a, str);
    }
}
