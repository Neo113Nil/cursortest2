package com.apm.insight.g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.b.k;
import com.apm.insight.l.i;
import com.apm.insight.l.o;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements c {
    private Context a;

    public d(Context context) {
        this.a = context;
    }

    public static int a() {
        return 6;
    }

    @Override // com.apm.insight.g.c
    public void a(final long j, final Thread thread, final Throwable th, final String str, File file, final String str2, final boolean z) {
        final File file2 = new File(o.a(this.a), str);
        a.a().a(file2.getName());
        file2.mkdirs();
        i.f(file2);
        final boolean c = v.c(th);
        com.apm.insight.entity.a a = f.a().a(CrashType.JAVA, null, new c.a() { // from class: com.apm.insight.g.d.1
            long a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
                String str3;
                String valueOf;
                this.a = SystemClock.uptimeMillis();
                if (i == 0) {
                    aVar.a("data", (Object) v.a(th));
                    aVar.a("isOOM", Boolean.valueOf(c));
                    aVar.a("isJava", (Object) 1);
                    aVar.a("crash_time", Long.valueOf(j));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str4 = str2;
                    if (str4 != null) {
                        aVar.a("crash_md5", (Object) str4);
                        aVar.a("crash_md5", str2);
                        boolean z2 = z;
                        if (z2) {
                            str3 = "has_ignore";
                            valueOf = String.valueOf(z2);
                            aVar.a(str3, valueOf);
                        }
                    }
                } else if (i == 1) {
                    Thread thread2 = thread;
                    aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                    aVar.a("tid", Integer.valueOf(Process.myTid()));
                    aVar.a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                    aVar.a("crash_after_native", NativeImpl.d() ? "true" : "false");
                    a.a().a(thread, th, false, aVar);
                } else if (i == 2) {
                    if (c) {
                        com.apm.insight.l.a.a(d.this.a, aVar.h());
                    }
                    JSONArray c2 = g.b().c();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    JSONObject a2 = g.b().a(uptimeMillis).a();
                    JSONArray a3 = k.a(100, uptimeMillis);
                    aVar.a("history_message", (Object) c2);
                    aVar.a("current_message", a2);
                    aVar.a("pending_messages", (Object) a3);
                    aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                    valueOf = String.valueOf(com.apm.insight.c.b.a());
                    str3 = "npth_force_apm_crash";
                    aVar.a(str3, valueOf);
                } else if (i == 3) {
                    JSONObject b = v.b(Thread.currentThread().getName());
                    if (b != null) {
                        aVar.a("all_thread_stacks", b);
                    }
                    aVar.a("logcat", (Object) com.apm.insight.runtime.k.b(com.apm.insight.i.f()));
                } else if (i != 4) {
                    if (i == 5) {
                        aVar.a("crash_uuid", (Object) str);
                    }
                } else if (!c) {
                    com.apm.insight.l.a.a(d.this.a, aVar.h());
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar, boolean z2) {
                if (r.a(r.b(i))) {
                    return aVar;
                }
                try {
                    i.a(new File(file2, file2.getName() + "." + i), aVar.h(), false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public void a(Throwable th2) {
            }
        }, true);
        long currentTimeMillis = System.currentTimeMillis() - j;
        try {
            a.a("crash_type", "normal");
            a.b("crash_cost", String.valueOf(currentTimeMillis));
            a.a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
        if (r.a(4)) {
            return;
        }
        r.a(2048);
    }

    @Override // com.apm.insight.g.c
    public boolean a(Throwable th) {
        return true;
    }
}
