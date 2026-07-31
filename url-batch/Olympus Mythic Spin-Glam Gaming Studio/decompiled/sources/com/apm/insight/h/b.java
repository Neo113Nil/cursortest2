package com.apm.insight.h;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.n;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: NpthSoData.java */
/* loaded from: classes14.dex */
public final class b {
    private static HashMap<String, String> a;
    private Map<String, String> b;

    public static String a(String str) {
        return e.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static String a() {
        return e.g().getFilesDir() + "/apminsight/selflib/";
    }

    public static void b(final String str) {
        m.a().a(new Runnable() { // from class: com.apm.insight.h.b.1
            private boolean a = false;

            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                b.b();
                if (b.c(str)) {
                    return;
                }
                n.a("updateSo", str);
                File file = new File(b.a(str));
                file.getParentFile().mkdirs();
                if (file.exists()) {
                    file.delete();
                }
                String str3 = "doUnpackLibrary: " + str;
                if (e.i().isDebugMode()) {
                    Log.w("npth", str3);
                }
                try {
                    str2 = c.a(e.g(), str, file);
                } catch (Throwable th) {
                    n.a("updateSoError", str);
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                    str2 = null;
                }
                if (str2 == null) {
                    b.a.put(file.getName(), "2008-20250701130429");
                    try {
                        f.a(new File(e.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver"), "2008-20250701130429", false);
                    } catch (Throwable unused) {
                    }
                    n.a("updateSoSuccess", str);
                    return;
                }
                if (!this.a) {
                    this.a = true;
                    n.a("updateSoPostRetry", str);
                    m.a().a(this, 3000L);
                    return;
                }
                n.a("updateSoFailed", str);
            }
        });
    }

    static /* synthetic */ void b() {
        if (a == null) {
            a = new HashMap<>();
            File file = new File(e.g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            a.put(str.substring(0, str.length() - 4), f.a(file.getAbsolutePath() + "/" + str, "\n"));
                        } catch (Throwable th) {
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                        }
                    } else if (!str.endsWith(".so")) {
                        f.a(new File(file, str));
                    }
                }
            }
        }
    }

    static /* synthetic */ boolean c(String str) {
        return "2008-20250701130429".equals(a.get(str)) && new File(a(str)).exists();
    }

    public b(File file) {
        String a2;
        File c = com.apm.insight.l.j.c(file);
        if (!c.exists() || c.length() == 0 || (a2 = NativeImpl.a(c.getAbsolutePath())) == null) {
            return;
        }
        String[] split = a2.split("\n");
        this.b = new HashMap();
        for (String str : split) {
            String[] split2 = str.split("=");
            if (split2.length == 2) {
                this.b.put(split2[0], split2[1]);
            }
        }
    }

    public final boolean d() {
        Map<String, String> map = this.b;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.b.get("process_name")) || TextUtils.isEmpty(this.b.get("crash_thread_name")) || TextUtils.isEmpty(this.b.get("pid")) || TextUtils.isEmpty(this.b.get("tid")) || TextUtils.isEmpty(this.b.get("start_time")) || TextUtils.isEmpty(this.b.get("crash_time")) || TextUtils.isEmpty(this.b.get("signal_line"))) ? false : true;
    }

    @Nullable
    public final String e() {
        return this.b.get("signal_line");
    }

    public final Map<String, String> f() {
        return this.b;
    }
}
