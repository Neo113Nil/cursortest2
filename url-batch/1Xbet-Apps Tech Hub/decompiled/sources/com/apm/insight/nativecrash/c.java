package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.Header;
import com.apm.insight.i;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import com.apm.insight.l.s;
import com.apm.insight.l.v;
import com.apm.insight.l.w;
import com.apm.insight.runtime.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    private static Boolean d;
    private final Context a;
    private JSONObject b = null;
    private b c;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader;
            String readLine;
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    try {
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        return "";
                    } finally {
                        k.a(bufferedReader2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (readLine == null) {
                k.a(bufferedReader);
                return "";
            }
            if (!readLine.startsWith("[FATAL:jni_android.cc") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                k.a(bufferedReader);
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int indexOf = readLine.indexOf(" ttwebview:");
            sb.append("Caused by: ");
            sb.append("Please include Java exception stack in crash report");
            sb.append("\n");
            sb.append(readLine.substring(indexOf + 11));
            while (true) {
                sb.append("\n");
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null) {
                    String sb2 = sb.toString();
                    k.a(bufferedReader);
                    return sb2;
                }
                sb.append(readLine2);
            }
        }
    }

    private class b {
        private final com.apm.insight.nativecrash.e b;
        private final com.apm.insight.nativecrash.a c;
        private final File d;
        private final File e;

        public b(File file) {
            this.d = file;
            this.e = o.a(i.g(), file.getName());
            com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(file);
            this.c = aVar;
            com.apm.insight.nativecrash.e eVar = new com.apm.insight.nativecrash.e(file);
            this.b = eVar;
            if (aVar.a() && eVar.a() == null) {
                eVar.a(file);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001c A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:15:0x0008, B:17:0x000e, B:5:0x001c), top: B:14:0x0008 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long a() {
            String str;
            Map<String, String> c = this.c.c();
            if (c != null) {
                try {
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
                if (!c.isEmpty()) {
                    str = c.get("start_time");
                    if (str != null) {
                        return Long.parseLong(str);
                    }
                    return System.currentTimeMillis();
                }
            }
            str = null;
            if (str != null) {
            }
            return System.currentTimeMillis();
        }

        public File b() {
            return this.d;
        }

        public boolean c() {
            return this.c.a();
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$c, reason: collision with other inner class name */
    public class C0011c extends e {
        C0011c() {
            super();
            this.c = "Total FD Count:";
            this.b = o.i(c.this.c.b());
            this.d = ":";
            this.e = -2;
        }
    }

    public class d extends e {
        d() {
            super();
            this.c = "VmSize:";
            this.b = o.k(c.this.c.b());
            this.d = "\\s+";
            this.e = -1;
        }
    }

    public class e {
        protected File b;
        protected String c;
        protected String d;
        protected int e;

        public e() {
        }

        public int a() {
            int i;
            Throwable th;
            if (!this.b.exists() || !this.b.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.b));
                int i2 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i2 = a(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                k.a(bufferedReader);
                            }
                        }
                    }
                } while (i2 == -1);
                k.a(bufferedReader2);
                return i2;
            } catch (Throwable th3) {
                i = -1;
                th = th3;
            }
        }

        public int a(String str) {
            int i = this.e;
            if (!str.startsWith(this.c)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.d)[1].trim());
            } catch (NumberFormatException e) {
                com.apm.insight.c.a().a("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    public class f extends e {
        f() {
            super();
            this.c = "Total Threads Count:";
            this.b = o.j(c.this.c.b());
            this.d = ":";
            this.e = -2;
        }
    }

    public c(Context context) {
        this.a = context;
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    private void a(com.apm.insight.entity.a aVar) {
        aVar.a(n());
        aVar.a("is_native_crash", (Object) 1);
        aVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
        aVar.a("crash_uuid", (Object) this.c.b().getName());
        aVar.a("jiffy", Long.valueOf(q.a.a()));
    }

    private void a(Map<String, String> map) {
        map.put("has_fds_file", o.i(this.c.b()).exists() ? "true" : "false");
        File h = o.h(this.c.b());
        map.put("has_logcat_file", (!h.exists() || h.length() <= 128) ? "false" : "true");
        map.put("has_maps_file", o.d(this.c.b()).exists() ? "true" : "false");
        map.put("has_tombstone_file", o.b(this.c.b()).exists() ? "true" : "false");
        map.put("has_meminfo_file", o.k(this.c.b()).exists() ? "true" : "false");
        map.put("has_threads_file", o.j(this.c.b()).exists() ? "true" : "false");
    }

    private void b(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.d.b(aVar.h());
        HashMap hashMap = new HashMap();
        if (m()) {
            hashMap.put("is_root", "true");
            aVar.a("is_root", "true");
        } else {
            hashMap.put("is_root", "false");
            aVar.a("is_root", "false");
        }
        a(hashMap);
        int o = o();
        if (o > 0) {
            if (o > 960) {
                hashMap.put("fd_leak", "true");
            } else {
                hashMap.put("fd_leak", "false");
            }
            aVar.a("fd_count", Integer.valueOf(o));
        }
        int p = p();
        if (p > 0) {
            if (p > 350) {
                hashMap.put("threads_leak", "true");
            } else {
                hashMap.put("threads_leak", "false");
            }
            aVar.a("threads_count", Integer.valueOf(p));
        }
        int q = q();
        if (q > 0) {
            if (q > i()) {
                hashMap.put("memory_leak", "true");
            } else {
                hashMap.put("memory_leak", "false");
            }
            aVar.a("memory_size", Integer.valueOf(q));
        }
        hashMap.put("sdk_version", "1.3.8.nourl-alpha.19");
        hashMap.put("has_java_stack", String.valueOf(aVar.h().opt("java_data") != null));
        JSONArray a2 = com.apm.insight.nativecrash.d.a(o.l(this.c.d), o.m(this.c.d));
        hashMap.put("leak_threads_count", String.valueOf(a2.length()));
        if (a2.length() > 0) {
            try {
                com.apm.insight.l.i.a(o.n(this.c.d), a2, false);
            } catch (Throwable unused) {
            }
        }
        aVar.b();
        aVar.c();
        aVar.c(hashMap);
    }

    private void c(com.apm.insight.entity.a aVar) {
        Map<String, String> b2 = this.c.b.b();
        if (b2.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : b2.keySet()) {
            String a2 = a(b2.get(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str);
                jSONObject.put("lib_uuid", a2);
                jSONArray.put(jSONObject);
            } catch (JSONException e2) {
                com.apm.insight.c.a().a("NPTH_CATCH", e2);
            }
        }
        aVar.a("crash_lib_uuid", (Object) jSONArray);
    }

    private void d(com.apm.insight.entity.a aVar) {
        File e2 = o.e(this.c.b());
        if (!e2.exists() && this.b == null) {
            aVar.b(w.a(i.g()));
            aVar.a("has_callback", "false");
            return;
        }
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                jSONObject = new JSONObject(com.apm.insight.l.i.c(e2.getAbsolutePath()));
            }
            aVar.c(jSONObject);
            aVar.a("has_callback", "true");
            if (aVar.h().opt("storage") == null) {
                aVar.b(w.a(i.g()));
            }
            s.a(aVar, aVar.i(), CrashType.NATIVE);
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        long j = -1;
        long optLong = aVar.h().optLong("crash_time", -1L);
        long optLong2 = aVar.h().optLong("java_end", -1L);
        if (optLong2 != -1 && optLong != -1) {
            j = optLong2 - optLong;
        }
        try {
            aVar.b("total_cost", String.valueOf(j));
            aVar.a("total_cost", String.valueOf(j / 1000));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:11:0x0058, B:13:0x005e), top: B:10:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(com.apm.insight.entity.a aVar) {
        String a2;
        File o;
        File g = o.g(this.c.b());
        try {
            if (g.exists()) {
                try {
                    a2 = v.a(g.getAbsolutePath());
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
                o = o.o(this.c.b());
                if (o.exists()) {
                    String b2 = a.b(o);
                    a2 = !a2.isEmpty() ? a2 + "\n" + b2 : b2;
                }
                if (a2.isEmpty()) {
                    aVar.a("java_data", (Object) a2);
                    return;
                }
                return;
            }
            if (a2.isEmpty()) {
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
            return;
        }
        a2 = "";
        o = o.o(this.c.b());
        if (o.exists()) {
        }
    }

    private void f(com.apm.insight.entity.a aVar) {
        File a2 = o.a(this.c.b());
        if (a2.exists()) {
            try {
                aVar.a("native_log", (Object) com.apm.insight.l.i.b(com.apm.insight.l.i.a(a2.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    private void g(com.apm.insight.entity.a aVar) {
        File h = o.h(this.c.b());
        if (!h.exists()) {
            NativeImpl.a(h.getAbsolutePath(), String.valueOf(i.i().getLogcatDumpCount()), String.valueOf(i.i().getLogcatLevel()));
        }
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.c.c.c().get("pid") + " ";
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(h));
            try {
                if (h.length() > 512000) {
                    bufferedReader2.skip(h.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if ((readLine.length() > 32 ? readLine.substring(0, 31) : readLine).contains(str)) {
                        jSONArray.put(readLine);
                    }
                }
                k.a(bufferedReader2);
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                k.a(bufferedReader);
                aVar.a("logcat", (Object) jSONArray);
            }
        } catch (Throwable unused2) {
        }
        aVar.a("logcat", (Object) jSONArray);
    }

    private void h(com.apm.insight.entity.a aVar) {
        Map<String, String> a2 = a();
        if (a2 == null || aVar == null) {
            return;
        }
        String str = a2.get("process_name");
        if (str != null) {
            aVar.a("process_name", (Object) str);
        }
        String str2 = a2.get("start_time");
        if (str2 != null) {
            try {
                aVar.a(Long.decode(str2).longValue());
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
        String str3 = a2.get("pid");
        if (str3 != null) {
            try {
                aVar.a("pid", Long.decode(str3));
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        String str4 = a2.get("crash_thread_name");
        if (str4 != null) {
            aVar.a("crash_thread_name", (Object) str4);
        }
        String str5 = a2.get("crash_time");
        if (str5 != null) {
            try {
                aVar.a("crash_time", Long.decode(str5));
            } catch (Throwable th3) {
                com.apm.insight.c.a().a("NPTH_CATCH", th3);
            }
        }
        aVar.a("data", (Object) b());
    }

    public static long i() {
        if (NativeImpl.e()) {
            return Long.MAX_VALUE;
        }
        return Header.a() ? 3891200L : 2867200L;
    }

    public static boolean m() {
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i = 0; i < 11; i++) {
            try {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (new File(strArr[i]).exists()) {
                Boolean bool2 = true;
                d = bool2;
                return bool2.booleanValue();
            }
            continue;
        }
        Boolean bool3 = false;
        d = bool3;
        return bool3.booleanValue();
    }

    private Header n() {
        Header header = new Header(this.a);
        JSONObject a2 = com.apm.insight.runtime.s.a().a(this.c.a());
        if (a2 != null) {
            header.a(a2);
            header.d();
            header.e();
        }
        Header.b(header);
        return header;
    }

    private int o() {
        return new C0011c().a();
    }

    private int p() {
        return new f().a();
    }

    private int q() {
        return new d().a();
    }

    public Map<String, String> a() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c.c();
        }
        return null;
    }

    public void a(File file) {
        this.c = new b(file);
    }

    public String b() {
        b bVar = this.c;
        if (bVar == null) {
            return null;
        }
        String c = bVar.b.c();
        return (c == null || c.isEmpty()) ? this.c.c.b() : c;
    }

    public boolean c() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    public JSONObject d() {
        File f2 = o.f(this.c.b());
        if (!f2.exists()) {
            return null;
        }
        try {
            String c = com.apm.insight.l.i.c(f2.getAbsolutePath());
            if (c != null && !c.isEmpty()) {
                return new JSONObject(c);
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return null;
    }

    public void e() {
        try {
            File e2 = o.e(this.c.b());
            File file = new File(e2.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i = 0;
            if (e2.exists()) {
                while (i < com.apm.insight.nativecrash.b.a()) {
                    File file2 = new File(e2.getAbsolutePath() + '.' + i);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i++;
                }
                return;
            }
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            for (int i2 = 0; i2 < com.apm.insight.nativecrash.b.a(); i2++) {
                File file3 = new File(e2.getAbsolutePath() + '.' + i2);
                if (file3.exists()) {
                    try {
                        String c = com.apm.insight.l.i.c(file3.getAbsolutePath());
                        if (!TextUtils.isEmpty(c)) {
                            JSONObject jSONObject = new JSONObject(c);
                            if (jSONObject.length() > 0) {
                                aVar.c(jSONObject);
                            }
                        }
                    } catch (JSONException e3) {
                        com.apm.insight.c.a().a("NPTH_CATCH", e3);
                    }
                }
            }
            JSONObject h = aVar.h();
            try {
                if (h.length() != 0 && h.opt("storage") == null) {
                    com.apm.insight.entity.a.a(h, w.a(i.g()));
                }
            } catch (Throwable unused) {
            }
            if (h.length() != 0) {
                this.b = h;
                com.apm.insight.l.i.b(file, h, false);
                if (file.renameTo(e2)) {
                    while (i < com.apm.insight.nativecrash.b.a()) {
                        File file4 = new File(e2.getAbsolutePath() + '.' + i);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i++;
                    }
                }
            }
        } catch (IOException e4) {
            com.apm.insight.c.a().a("NPTH_CATCH", e4);
        }
    }

    public boolean f() {
        ICrashFilter b2 = i.b().b();
        if (b2 == null) {
            return true;
        }
        try {
            return b2.onNativeCrashFilter(b(), "");
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return true;
        }
    }

    public boolean g() {
        return com.apm.insight.e.a.a().a(o.f(this.c.b()).getAbsolutePath());
    }

    public void h() {
        com.apm.insight.e.a.a().a(com.apm.insight.e.a.a.a(o.f(this.c.b()).getAbsolutePath()));
    }

    public JSONObject j() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            a(aVar);
            h(aVar);
            c(aVar);
            d(aVar);
            e(aVar);
            g(aVar);
            f(aVar);
            b(aVar);
            File f2 = o.f(this.c.b());
            JSONObject h = aVar.h();
            com.apm.insight.l.i.a(f2, h, false);
            return h;
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public boolean k() {
        return com.apm.insight.l.i.a(this.c.b());
    }

    public void l() {
        try {
            com.apm.insight.l.i.c(this.c.b().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + i.g().getPackageName() + "/" + this.c.b().getName() + ".zip");
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }
}
