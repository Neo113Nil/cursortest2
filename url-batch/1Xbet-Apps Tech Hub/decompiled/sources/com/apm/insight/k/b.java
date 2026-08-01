package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.o;
import com.apm.insight.l.p;
import com.apm.insight.l.r;
import com.apm.insight.l.w;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import com.apm.insight.runtime.s;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    private static volatile b d;
    private Context c;
    private C0010b f;
    private HashMap<String, C0010b> g;
    List<File> a = new ArrayList();
    List<File> b = new ArrayList();
    private int e = -1;
    private volatile boolean h = false;
    private Runnable i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public void run() {
            b.this.g();
        }
    };
    private Runnable j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public void run() {
            b.this.e();
        }
    };

    static class a {
        File a;
        long b;
        long c;
        CrashType d;
        String e;

        a(File file, long j, CrashType crashType) {
            this.c = -1L;
            this.a = file;
            this.b = j;
            this.d = crashType;
            this.e = file.getName();
        }

        a(File file, CrashType crashType) {
            this.b = -1L;
            this.c = -1L;
            this.a = file;
            this.d = crashType;
            this.e = file.getName();
        }
    }

    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    static class C0010b {
        String a;
        a d;
        a e;
        List<a> b = new ArrayList();
        List<a> c = new ArrayList();
        boolean f = false;
        int g = 0;

        C0010b(String str) {
            this.a = str;
        }
    }

    private b(Context context) {
        this.c = context;
    }

    private com.apm.insight.entity.e a(File file, CrashType crashType, String str, long j, long j2) {
        com.apm.insight.entity.e eVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.i.a(file);
                    return null;
                }
                boolean z = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.i.d(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        eVar = null;
                        com.apm.insight.l.i.a(file);
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        return eVar;
                    }
                }
                com.apm.insight.entity.e a2 = com.apm.insight.l.i.a(file, crashType);
                try {
                    JSONObject b = a2.b();
                    if (a2.b() == null) {
                        com.apm.insight.l.i.a(file);
                    } else {
                        if (crashType == CrashType.ANR) {
                            return a2;
                        }
                        b.put("crash_time", j);
                        b.put("app_start_time", j2);
                        JSONObject optJSONObject = b.optJSONObject("header");
                        if (optJSONObject == null) {
                            optJSONObject = Header.a(this.c, j).f();
                        } else if (z) {
                            b.remove("header");
                        }
                        String optString = optJSONObject.optString("sdk_version_name", null);
                        if (optString == null) {
                            optString = "1.3.8.nourl-alpha.19";
                        }
                        com.apm.insight.entity.a.a(b, "filters", "sdk_version", optString);
                        if (com.apm.insight.l.i.a(b.optJSONArray("logcat"))) {
                            b.put("logcat", com.apm.insight.runtime.k.b(str));
                        }
                        com.apm.insight.entity.a.a(b, "filters", "has_dump", "true");
                        com.apm.insight.entity.a.a(b, "filters", "has_logcat", String.valueOf(!com.apm.insight.l.l.a(b, "logcat")));
                        com.apm.insight.entity.a.a(b, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                        com.apm.insight.entity.a.a(b, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                        com.apm.insight.entity.a.a(b, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.d(str)));
                        com.apm.insight.entity.a.a(b, "filters", "is_64_devices", String.valueOf(Header.a()));
                        com.apm.insight.entity.a.a(b, "filters", "is_64_runtime", String.valueOf(NativeImpl.e()));
                        com.apm.insight.entity.a.a(b, "filters", "is_x86_devices", String.valueOf(Header.b()));
                        com.apm.insight.entity.a.a(b, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.entity.a.a(str)));
                        com.apm.insight.entity.a.a(b, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.c.m()));
                        b.put("launch_did", com.apm.insight.i.a.a(this.c));
                        b.put("crash_uuid", file.getName());
                        b.put("jiffy", q.a.a());
                        try {
                            long parseLong = Long.parseLong(com.apm.insight.runtime.b.a(j, str));
                            com.apm.insight.entity.a.a(b, "filters", "lastAliveTime", Math.abs(parseLong - j) < 60000 ? "< 60s" : "> 60s");
                            b.put("lastAliveTime", String.valueOf(parseLong));
                        } catch (Throwable unused) {
                            b.put("lastAliveTime", EnvironmentCompat.MEDIA_UNKNOWN);
                            com.apm.insight.entity.a.a(b, "filters", "lastAliveTime", EnvironmentCompat.MEDIA_UNKNOWN);
                        }
                        b.put("has_dump", "true");
                        if (b.opt("storage") == null) {
                            com.apm.insight.entity.a.a(b, w.a(com.apm.insight.i.g()));
                        }
                        if (Header.b(optJSONObject)) {
                            com.apm.insight.entity.a.a(b, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        com.apm.insight.entity.d.b(b);
                        a2.b().put("upload_scene", "launch_scan");
                        if (z) {
                            JSONObject jSONObject = new JSONObject();
                            b.put("event_type", "start_crash");
                            b.put("stack", b.remove("data"));
                            jSONObject.put("data", new JSONArray().put(b));
                            jSONObject.put("header", optJSONObject);
                            a2.a(jSONObject);
                        } else {
                            b.put("isJava", 1);
                        }
                    }
                    return a2;
                } catch (Throwable th2) {
                    th = th2;
                    eVar = a2;
                    com.apm.insight.l.i.a(file);
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                    return eVar;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            eVar = null;
        }
    }

    public static b a() {
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b(com.apm.insight.i.g());
                }
            }
        }
        return d;
    }

    private JSONObject a(com.apm.insight.nativecrash.c cVar) {
        JSONObject d2 = cVar.d();
        if (d2 != null && d2.length() != 0) {
            return d2;
        }
        if (com.apm.insight.i.d()) {
            cVar.l();
        }
        if (!cVar.c()) {
            cVar.k();
            return null;
        }
        if (!cVar.f()) {
            cVar.k();
            return null;
        }
        if (cVar.g()) {
            cVar.k();
            return null;
        }
        cVar.e();
        return cVar.j();
    }

    private void a(C0010b c0010b) {
        com.apm.insight.l.i.a(o.a(this.c, c0010b.a));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(5:36|37|38|(1:40)(1:76)|41)|(2:70|(3:74|75|20))(5:45|46|47|48|49)|50|51|52|53|(1:55)|56|57|20) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0161, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:53:0x0140, B:55:0x014c, B:56:0x015b), top: B:52:0x0140 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(final C0010b c0010b, boolean z, com.apm.insight.runtime.h hVar) {
        Iterator<a> it;
        File file;
        CrashType crashType;
        final com.apm.insight.entity.e a2;
        JSONObject b;
        JSONObject optJSONObject;
        final File file2;
        JSONArray jSONArray;
        JSONObject optJSONObject2;
        CrashType crashType2;
        if (c0010b.b.isEmpty()) {
            return;
        }
        if (c0010b.e == null) {
            c0010b.e = c0010b.d;
        }
        for (Iterator<a> it2 = c0010b.b.iterator(); it2.hasNext(); it2 = it) {
            a next = it2.next();
            try {
                file = next.a;
                crashType = next.d;
                it = it2;
                try {
                    a2 = a(file, crashType, c0010b.a, next.b, next.c);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                    com.apm.insight.l.i.a(next.a);
                }
            } catch (Throwable th2) {
                th = th2;
                it = it2;
            }
            if (a2 != null && (b = a2.b()) != null && (optJSONObject = b.optJSONObject("header")) != null) {
                if (crashType == null) {
                    file2 = file;
                    if (new File(file2, file.getName()).exists() || file2.getName().split("_").length < 5) {
                        if (!e.b(a2.a(), b.toString()).a()) {
                        }
                        com.apm.insight.l.i.a(file2);
                    }
                } else {
                    file2 = file;
                }
                File a3 = com.apm.insight.entity.b.a(file2);
                if (a3.exists()) {
                    try {
                        jSONArray = new JSONArray(com.apm.insight.l.i.c(a3));
                        optJSONObject2 = crashType == CrashType.LAUNCH ? ((JSONArray) b.opt("data")).optJSONObject(0) : b;
                    } catch (Throwable unused) {
                    }
                    if ((z || c0010b.e == next) && !next.e.contains("ignore")) {
                        crashType2 = crashType;
                        if (hVar != null && !hVar.a(optJSONObject2.optString("crash_md5", "default"))) {
                            com.apm.insight.l.i.a(next.a);
                        }
                    } else {
                        try {
                            com.apm.insight.entity.a.a(optJSONObject2, "filters", "aid", String.valueOf(String.valueOf(optJSONObject.opt("aid"))));
                            crashType2 = crashType;
                            try {
                                com.apm.insight.entity.a.a(optJSONObject2, "filters", "has_ignore", String.valueOf(next.e.contains("ignore")));
                                optJSONObject.put("aid", 2010);
                            } catch (Throwable th3) {
                                th = th3;
                                com.apm.insight.c.a().a("NPTH_CATCH", th);
                                com.apm.insight.entity.a.a(optJSONObject2, "filters", "start_uuid", c0010b.a);
                                com.apm.insight.entity.a.a(optJSONObject2, "filters", "leak_threads_count", String.valueOf(c0010b.g));
                                com.apm.insight.entity.a.a(optJSONObject2, "filters", "crash_thread_name", optJSONObject2.optString("crash_thread_name", EnvironmentCompat.MEDIA_UNKNOWN));
                                r.a(b);
                                com.apm.insight.entity.b.a(b, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                    @Override // com.apm.insight.entity.b.a
                                    public void a(JSONObject jSONObject) {
                                        e.a(a2.a(), jSONObject.toString(), new File(file2, "logZip"), o.a(b.this.c, c0010b.a));
                                    }
                                });
                                if (!com.apm.insight.l.i.a(file2)) {
                                }
                                c.a(crashType2, b);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            crashType2 = crashType;
                        }
                    }
                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "start_uuid", c0010b.a);
                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "leak_threads_count", String.valueOf(c0010b.g));
                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "crash_thread_name", optJSONObject2.optString("crash_thread_name", EnvironmentCompat.MEDIA_UNKNOWN));
                    r.a(b);
                    com.apm.insight.entity.b.a(b, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                        @Override // com.apm.insight.entity.b.a
                        public void a(JSONObject jSONObject) {
                            e.a(a2.a(), jSONObject.toString(), new File(file2, "logZip"), o.a(b.this.c, c0010b.a));
                        }
                    });
                    if (!com.apm.insight.l.i.a(file2)) {
                        com.apm.insight.e.a.a().a(com.apm.insight.e.a.a.a(file2.getAbsolutePath()));
                    }
                    c.a(crashType2, b);
                }
                com.apm.insight.l.i.a(file2);
            }
            com.apm.insight.l.i.a(file);
        }
    }

    private void a(File file, C0010b c0010b) {
    }

    private void a(HashMap<String, C0010b> hashMap) {
        File[] listFiles = o.f(this.c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0010b c0010b = hashMap.get(name);
                    if (c0010b == null) {
                        c0010b = new C0010b(name);
                        hashMap.put(name, c0010b);
                    }
                    JSONArray a2 = com.apm.insight.nativecrash.d.a(o.l(file), o.m(file));
                    c0010b.g = a2.length();
                    if (c0010b.g > 0) {
                        try {
                            com.apm.insight.l.i.a(o.n(file), a2, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.i.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
                com.apm.insight.l.i.a(file);
            }
        }
    }

    private void a(HashMap<String, C0010b> hashMap, C0010b c0010b) {
        File[] listFiles = o.d(this.c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0010b c0010b2 = hashMap.get(name);
                    if (c0010b2 == null) {
                        c0010b2 = new C0010b(name);
                        hashMap.put(name, c0010b2);
                    }
                    c0010b2.c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.i.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
                com.apm.insight.l.i.a(file);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        if (r0.equals("launch") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(HashMap<String, C0010b> hashMap, C0010b c0010b, File file, String str) {
        if (!str.endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
            com.apm.insight.l.i.a(file);
            return;
        }
        String[] split = str.split("_");
        CrashType crashType = null;
        if (split.length < 5) {
            c0010b.b.add(new a(file, null));
            return;
        }
        boolean z = false;
        try {
            long parseLong = Long.parseLong(split[0]);
            long parseLong2 = Long.parseLong(split[4]);
            String str2 = split[2];
            String str3 = split[1];
            str3.hashCode();
            switch (str3.hashCode()) {
                case -1109843021:
                    break;
                case 96741:
                    if (str3.equals("anr")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 3254818:
                    if (str3.equals("java")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    crashType = CrashType.LAUNCH;
                    break;
                case true:
                    crashType = CrashType.ANR;
                    break;
                case true:
                    crashType = CrashType.JAVA;
                    break;
            }
            C0010b c0010b2 = hashMap.get(str2);
            if (c0010b2 == null) {
                c0010b2 = new C0010b(str2);
                hashMap.put(str2, c0010b2);
            }
            a aVar = new a(file, parseLong, crashType);
            aVar.c = parseLong2;
            if ((c0010b2.d == null || c0010b2.d.b > aVar.b) && crashType != null && crashType != CrashType.ANR && !str.contains("ignore")) {
                c0010b2.d = aVar;
            }
            c0010b2.b.add(aVar);
        } catch (Throwable unused) {
            c0010b.b.add(new a(file, null));
            com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err format crashTime:" + str));
        }
    }

    private boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private void b(final C0010b c0010b, boolean z, com.apm.insight.runtime.h hVar) {
        boolean z2;
        JSONObject a2;
        if (c0010b.c.size() <= 1 && c0010b.c.isEmpty()) {
            c0010b.e = c0010b.d;
            return;
        }
        boolean b = p.b(this.c);
        c0010b.e = c0010b.d;
        com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(this.c);
        for (a aVar : c0010b.c) {
            final File file = aVar.a;
            try {
                cVar.a(file);
                a2 = a(cVar);
            } catch (Throwable th) {
                th = th;
                z2 = b;
            }
            if (a2 != null && a2.length() != 0) {
                if (a2.length() != 0) {
                    if (z) {
                        z2 = b;
                        if (hVar != null && !hVar.a("default")) {
                            cVar.k();
                        }
                    } else {
                        long optLong = a2.optLong("crash_time");
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = b;
                        }
                        if (c0010b.e == null) {
                            c0010b.e = aVar;
                            c0010b.f = true;
                            if (hVar == null || hVar.a("default")) {
                                z2 = b;
                            } else {
                                cVar.k();
                            }
                        } else {
                            if (c0010b.f) {
                                z2 = b;
                            } else {
                                z2 = b;
                                try {
                                } catch (Throwable th3) {
                                    th = th3;
                                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                                    com.apm.insight.l.i.a(file);
                                    b = z2;
                                }
                                if (optLong < c0010b.e.b) {
                                    c0010b.e = aVar;
                                    if (hVar == null || hVar.a("default")) {
                                        if (!a(file)) {
                                            a(file, c0010b);
                                        }
                                        c0010b.f = true;
                                    } else {
                                        cVar.k();
                                        b = z2;
                                    }
                                }
                            }
                            com.apm.insight.entity.a.a(a2, "filters", "aid", String.valueOf(a2.optJSONObject("header").opt("aid")));
                            a2.optJSONObject("header").put("aid", 2010);
                        }
                    }
                    com.apm.insight.entity.a.a(a2, "filters", "start_uuid", c0010b.a);
                    com.apm.insight.entity.a.a(a2, "filters", "crash_thread_name", a2.optString("crash_thread_name", EnvironmentCompat.MEDIA_UNKNOWN));
                    if (z2) {
                        try {
                            c.a aVar2 = new c.a(a2, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(a2, com.apm.insight.entity.b.a(aVar2.c(), aVar2.a(), s.a().b(aVar2.b() == -1 ? System.currentTimeMillis() : aVar2.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public void a(JSONObject jSONObject) {
                                    d.a().a(jSONObject, file, o.a(b.this.c, c0010b.a));
                                }
                            });
                            if (!cVar.k()) {
                                cVar.h();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            com.apm.insight.l.i.a(file);
                            b = z2;
                        }
                    }
                    c.a(CrashType.NATIVE, a2);
                } else {
                    z2 = b;
                }
                b = z2;
            }
            z2 = b;
            cVar.k();
            b = z2;
        }
    }

    private void b(HashMap<String, C0010b> hashMap, C0010b c0010b) {
        File[] listFiles = o.a(this.c).listFiles();
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        for (File file : listFiles) {
            try {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (!com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                if (!com.apm.insight.l.i.g(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (!file.isFile()) {
                        a(hashMap, c0010b, file, file.getName());
                    }
                }
            }
            com.apm.insight.l.i.a(file);
        }
    }

    private void c(HashMap<String, C0010b> hashMap, C0010b c0010b) {
        com.apm.insight.l.i.a(o.b(this.c));
    }

    private void d() {
        if (this.f != null) {
            return;
        }
        this.f = new C0010b("old_uuid");
        HashMap<String, C0010b> hashMap = new HashMap<>();
        this.g = hashMap;
        a(hashMap);
        b(this.g, this.f);
        c(this.g, this.f);
        a(this.g, this.f);
        b(this.f, true, null);
        a(this.f, true, null);
        this.f = null;
        if (this.g.isEmpty()) {
            f();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.h || this.g == null) {
            return;
        }
        if (!p.b(this.c)) {
            f();
        }
        boolean h = h();
        com.apm.insight.runtime.h hVar = new com.apm.insight.runtime.h(this.c);
        Iterator<C0010b> it = this.g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), h, hVar);
        }
        Iterator<C0010b> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), h, hVar);
        }
        Iterator<C0010b> it3 = this.g.values().iterator();
        while (it3.hasNext()) {
            a(it3.next());
        }
        hVar.a();
        com.apm.insight.runtime.b.a();
        f();
    }

    private void f() {
        this.h = true;
        this.g = null;
        NativeImpl.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.h) {
            return;
        }
        if (!p.b(this.c) || (System.currentTimeMillis() - com.apm.insight.i.j() <= 5000 && com.apm.insight.i.i().isApmExists() && !Npth.hasCrash())) {
            com.apm.insight.runtime.p.b().a(this.i, 5000L);
        } else {
            e();
        }
    }

    private boolean h() {
        if (this.e == -1) {
            if (com.apm.insight.runtime.a.b() && com.apm.insight.runtime.a.g()) {
                this.e = 1;
            } else {
                this.e = 0;
            }
        }
        return this.e == 1;
    }

    private void i() {
        File[] listFiles = o.i(this.c).listFiles();
        if (listFiles == null) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a().a(file.getAbsolutePath());
            } else {
                try {
                    com.apm.insight.entity.e e = com.apm.insight.l.i.e(file.getAbsolutePath());
                    if (e != null) {
                        if (e.b() != null) {
                            e.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), e.e(), e.d(), e.f(), e.g())) {
                            com.apm.insight.l.i.a(file);
                            com.apm.insight.l.i.a(e.c());
                        }
                    } else {
                        com.apm.insight.l.i.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
            }
        }
    }

    public void a(boolean z) {
        if (!Npth.isStopUpload() && z) {
            d();
            i();
            com.apm.insight.c.a.a();
        }
    }

    public void b() {
        try {
            if (!this.h && com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                com.apm.insight.runtime.p.b().a(this.j);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean c() {
        return this.h;
    }
}
