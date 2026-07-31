package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.ironsource.C4913ua;
import com.ironsource.X3;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CrashFileCollector.java */
/* loaded from: classes9.dex */
public final class b {
    private static volatile b b;
    private Context a;
    private C0066b f;
    private HashMap<String, C0066b> g;
    private List<File> c = new ArrayList();
    private List<File> d = new ArrayList();
    private int e = -1;
    private volatile boolean h = false;
    private Runnable i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b.this.f();
        }
    };
    private Runnable j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() {
            b.this.d();
        }
    };

    private b(Context context) {
        this.a = context;
    }

    public static b a() {
        if (b == null) {
            synchronized (b.class) {
                try {
                    if (b == null) {
                        b = new b(com.apm.insight.e.g());
                    }
                } finally {
                }
            }
        }
        return b;
    }

    /* compiled from: CrashFileCollector.java */
    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    static class C0066b {
        String a;
        a d;
        a e;
        List<a> b = new ArrayList();
        List<a> c = new ArrayList();
        boolean f = false;
        int g = 0;

        C0066b(String str) {
            this.a = str;
        }
    }

    /* compiled from: CrashFileCollector.java */
    static class a {
        File a;
        long b;
        long c;

        @Nullable
        CrashType d;
        String e;

        a(File file, @Nullable CrashType crashType) {
            this.b = -1L;
            this.c = -1L;
            this.a = file;
            this.d = crashType;
            this.e = file.getName();
        }

        a(File file, long j, @Nullable CrashType crashType) {
            this.c = -1L;
            this.a = file;
            this.b = j;
            this.d = crashType;
            this.e = file.getName();
        }
    }

    public final void a(boolean z) {
        if (!Npth.isStopUpload() && z) {
            if (this.f == null) {
                this.f = new C0066b("old_uuid");
                HashMap<String, C0066b> hashMap = new HashMap<>();
                this.g = hashMap;
                a(hashMap);
                a(this.g, this.f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.a));
                b(this.g);
                b(this.f, true, null);
                a(this.f, true, null);
                this.f = null;
                if (this.g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    public final void b() {
        try {
            if (!this.h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.h || this.g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.a)) {
            e();
        }
        if (this.e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.e = 1;
            } else {
                this.e = 0;
            }
        }
        boolean z = this.e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.a);
        Iterator<C0066b> it = this.g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z, fVar);
        }
        Iterator<C0066b> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z, fVar);
        }
        Iterator<C0066b> it3 = this.g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.a, it3.next().a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.h = true;
        this.g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.h) {
            return;
        }
        if (com.apm.insight.l.k.b(this.a) && (System.currentTimeMillis() - com.apm.insight.e.j() > 5000 || !com.apm.insight.e.i().isApmExists() || Npth.hasCrash())) {
            d();
        } else {
            m.a().a(this.i, 5000L);
        }
    }

    private void a(HashMap<String, C0066b> hashMap) {
        File[] listFiles = com.apm.insight.l.j.f(this.a).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith("G")) {
                    String name = file.getName();
                    C0066b c0066b = hashMap.get(name);
                    if (c0066b == null) {
                        c0066b = new C0066b(name);
                        hashMap.put(name, c0066b);
                    }
                    JSONArray a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = a2.length();
                    c0066b.g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), a2);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    private void b(HashMap<String, C0066b> hashMap) {
        File[] listFiles = com.apm.insight.l.j.d(this.a).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith("G")) {
                    String name = file.getName();
                    C0066b c0066b = hashMap.get(name);
                    if (c0066b == null) {
                        c0066b = new C0066b(name);
                        hashMap.put(name, c0066b);
                    }
                    c0066b.c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:10:0x0023, B:12:0x0031, B:15:0x0039, B:19:0x0041, B:23:0x0051, B:25:0x0057, B:27:0x005c, B:29:0x0068, B:31:0x0073, B:36:0x008d, B:50:0x00d7, B:52:0x00df, B:53:0x00e7, B:55:0x00f2, B:57:0x010a, B:60:0x00fc, B:62:0x0100, B:64:0x0108, B:65:0x00cf, B:66:0x00d2, B:67:0x00d5, B:68:0x00a6, B:71:0x00b0, B:74:0x00ba, B:78:0x0110, B:80:0x012d, B:34:0x007f), top: B:9:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:10:0x0023, B:12:0x0031, B:15:0x0039, B:19:0x0041, B:23:0x0051, B:25:0x0057, B:27:0x005c, B:29:0x0068, B:31:0x0073, B:36:0x008d, B:50:0x00d7, B:52:0x00df, B:53:0x00e7, B:55:0x00f2, B:57:0x010a, B:60:0x00fc, B:62:0x0100, B:64:0x0108, B:65:0x00cf, B:66:0x00d2, B:67:0x00d5, B:68:0x00a6, B:71:0x00b0, B:74:0x00ba, B:78:0x0110, B:80:0x012d, B:34:0x007f), top: B:9:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:10:0x0023, B:12:0x0031, B:15:0x0039, B:19:0x0041, B:23:0x0051, B:25:0x0057, B:27:0x005c, B:29:0x0068, B:31:0x0073, B:36:0x008d, B:50:0x00d7, B:52:0x00df, B:53:0x00e7, B:55:0x00f2, B:57:0x010a, B:60:0x00fc, B:62:0x0100, B:64:0x0108, B:65:0x00cf, B:66:0x00d2, B:67:0x00d5, B:68:0x00a6, B:71:0x00b0, B:74:0x00ba, B:78:0x0110, B:80:0x012d, B:34:0x007f), top: B:9:0x0023, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(HashMap<String, C0066b> hashMap, C0066b c0066b) {
        char c;
        CrashType crashType;
        C0066b c0066b2;
        a aVar;
        a aVar2;
        File[] listFiles = com.apm.insight.l.j.a(this.a).listFiles();
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        char c2 = 0;
        int i = 0;
        while (i < listFiles.length) {
            File file = listFiles[i];
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file);
                } else if (!com.apm.insight.l.f.e(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        String name = file.getName();
                        if (name.endsWith("G")) {
                            String[] split = name.split("_");
                            if (split.length < 5) {
                                c0066b.b.add(new a(file, null));
                            } else {
                                try {
                                    long parseLong = Long.parseLong(split[c2]);
                                    long parseLong2 = Long.parseLong(split[4]);
                                    String str = split[2];
                                    String str2 = split[1];
                                    int hashCode = str2.hashCode();
                                    if (hashCode == -1109843021) {
                                        if (str2.equals("launch")) {
                                            c = 0;
                                            if (c != 0) {
                                            }
                                            c0066b2 = hashMap.get(str);
                                            if (c0066b2 == null) {
                                            }
                                            aVar = new a(file, parseLong, crashType);
                                            aVar.c = parseLong2;
                                            aVar2 = c0066b2.d;
                                            if (aVar2 != null) {
                                            }
                                            c0066b2.d = aVar;
                                            c0066b2.b.add(aVar);
                                        }
                                        c = 65535;
                                        if (c != 0) {
                                        }
                                        c0066b2 = hashMap.get(str);
                                        if (c0066b2 == null) {
                                        }
                                        aVar = new a(file, parseLong, crashType);
                                        aVar.c = parseLong2;
                                        aVar2 = c0066b2.d;
                                        if (aVar2 != null) {
                                        }
                                        c0066b2.d = aVar;
                                        c0066b2.b.add(aVar);
                                    } else if (hashCode != 96741) {
                                        if (hashCode == 3254818 && str2.equals("java")) {
                                            c = 1;
                                            if (c != 0) {
                                                crashType = CrashType.LAUNCH;
                                            } else if (c == 1) {
                                                crashType = CrashType.JAVA;
                                            } else {
                                                crashType = c != 2 ? null : CrashType.ANR;
                                            }
                                            c0066b2 = hashMap.get(str);
                                            if (c0066b2 == null) {
                                                c0066b2 = new C0066b(str);
                                                hashMap.put(str, c0066b2);
                                            }
                                            aVar = new a(file, parseLong, crashType);
                                            aVar.c = parseLong2;
                                            aVar2 = c0066b2.d;
                                            if ((aVar2 != null || aVar2.b > aVar.b) && crashType != null && crashType != CrashType.ANR && !name.contains("ignore")) {
                                                c0066b2.d = aVar;
                                            }
                                            c0066b2.b.add(aVar);
                                        }
                                        c = 65535;
                                        if (c != 0) {
                                        }
                                        c0066b2 = hashMap.get(str);
                                        if (c0066b2 == null) {
                                        }
                                        aVar = new a(file, parseLong, crashType);
                                        aVar.c = parseLong2;
                                        aVar2 = c0066b2.d;
                                        if (aVar2 != null) {
                                        }
                                        c0066b2.d = aVar;
                                        c0066b2.b.add(aVar);
                                    } else {
                                        if (str2.equals("anr")) {
                                            c = 2;
                                            if (c != 0) {
                                            }
                                            c0066b2 = hashMap.get(str);
                                            if (c0066b2 == null) {
                                            }
                                            aVar = new a(file, parseLong, crashType);
                                            aVar.c = parseLong2;
                                            aVar2 = c0066b2.d;
                                            if (aVar2 != null) {
                                            }
                                            c0066b2.d = aVar;
                                            c0066b2.b.add(aVar);
                                        }
                                        c = 65535;
                                        if (c != 0) {
                                        }
                                        c0066b2 = hashMap.get(str);
                                        if (c0066b2 == null) {
                                        }
                                        aVar = new a(file, parseLong, crashType);
                                        aVar.c = parseLong2;
                                        aVar2 = c0066b2.d;
                                        if (aVar2 != null) {
                                        }
                                        c0066b2.d = aVar;
                                        c0066b2.b.add(aVar);
                                    }
                                } catch (Throwable unused) {
                                    c0066b.b.add(new a(file, null));
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(new RuntimeException("err format crashTime:".concat(name)), "NPTH_CATCH");
                                }
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
            i++;
            c2 = 0;
        }
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject b2 = aVar.b();
        if (b2 != null && b2.length() != 0) {
            return b2;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0155 A[Catch: all -> 0x0167, TryCatch #3 {all -> 0x0167, blocks: (B:55:0x0149, B:57:0x0155, B:59:0x0169), top: B:54:0x0149 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(final C0066b c0066b, boolean z, @Nullable com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        final File file;
        CrashType crashType;
        if (c0066b.b.isEmpty()) {
            return;
        }
        if (c0066b.e == null) {
            c0066b.e = c0066b.d;
        }
        for (Iterator<a> it2 = c0066b.b.iterator(); it2.hasNext(); it2 = it) {
            a next = it2.next();
            try {
                File file2 = next.a;
                CrashType crashType2 = next.d;
                it = it2;
                try {
                    final com.apm.insight.f.b a2 = a(file2, crashType2, c0066b.a, next.b, next.c);
                    if (a2 == null) {
                        com.apm.insight.l.f.a(file2);
                    } else {
                        JSONObject b2 = a2.b();
                        if (b2 == null) {
                            com.apm.insight.l.f.a(file2);
                        } else {
                            JSONObject optJSONObject = b2.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
                            if (optJSONObject == null) {
                                com.apm.insight.l.f.a(file2);
                            } else {
                                if (crashType2 == null) {
                                    file = file2;
                                    if (new File(file, file2.getName()).exists() || file.getName().split("_").length < 5) {
                                        if (e.b(a2.a(), b2.toString()).a()) {
                                            com.apm.insight.l.f.a(file);
                                        }
                                    }
                                } else {
                                    file = file2;
                                }
                                File a3 = com.apm.insight.entity.b.a(file);
                                if (!a3.exists()) {
                                    com.apm.insight.l.f.a(file);
                                } else {
                                    try {
                                        JSONArray jSONArray = new JSONArray(com.apm.insight.l.f.a(a3, "\n"));
                                        JSONObject optJSONObject2 = crashType2 == CrashType.LAUNCH ? ((JSONArray) b2.opt("data")).optJSONObject(0) : b2;
                                        if ((!z && c0066b.e != next) || next.e.contains("ignore")) {
                                            try {
                                                com.apm.insight.entity.a.a(optJSONObject2, "filters", C4913ua.b, String.valueOf(optJSONObject.opt(C4913ua.b)));
                                                crashType = crashType2;
                                                try {
                                                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "has_ignore", String.valueOf(next.e.contains("ignore")));
                                                    optJSONObject.put(C4913ua.b, 2010);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    com.apm.insight.c.a();
                                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "start_uuid", c0066b.a);
                                                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "leak_threads_count", String.valueOf(c0066b.g));
                                                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "crash_thread_name", optJSONObject2.optString("crash_thread_name", "unknown"));
                                                    com.apm.insight.entity.b.a(b2, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                                        @Override // com.apm.insight.entity.b.a
                                                        public final void a(JSONObject jSONObject) {
                                                            e.a(a2.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.a, c0066b.a));
                                                        }
                                                    });
                                                    if (!com.apm.insight.l.f.a(file)) {
                                                    }
                                                    c.a(crashType, b2);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                crashType = crashType2;
                                            }
                                        } else {
                                            crashType = crashType2;
                                            if (fVar != null && !fVar.a(optJSONObject2.optString("crash_md5", "default"))) {
                                                com.apm.insight.l.f.a(next.a);
                                            }
                                        }
                                        com.apm.insight.entity.a.a(optJSONObject2, "filters", "start_uuid", c0066b.a);
                                        com.apm.insight.entity.a.a(optJSONObject2, "filters", "leak_threads_count", String.valueOf(c0066b.g));
                                        com.apm.insight.entity.a.a(optJSONObject2, "filters", "crash_thread_name", optJSONObject2.optString("crash_thread_name", "unknown"));
                                        try {
                                            com.apm.insight.entity.b.a(b2, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                                @Override // com.apm.insight.entity.b.a
                                                public final void a(JSONObject jSONObject) {
                                                    e.a(a2.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.a, c0066b.a));
                                                }
                                            });
                                            if (!com.apm.insight.l.f.a(file)) {
                                                com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                            }
                                            c.a(crashType, b2);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            com.apm.insight.c.a();
                                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                            com.apm.insight.l.f.a(next.a);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                    com.apm.insight.l.f.a(next.a);
                }
            } catch (Throwable th5) {
                th = th5;
                it = it2;
            }
        }
    }

    private void b(final C0066b c0066b, boolean z, @Nullable com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        boolean z2;
        JSONObject a2;
        a aVar;
        if (c0066b.c.size() <= 1 && c0066b.c.isEmpty()) {
            c0066b.e = c0066b.d;
            return;
        }
        boolean b2 = com.apm.insight.l.k.b(this.a);
        c0066b.e = c0066b.d;
        com.apm.insight.nativecrash.a aVar2 = new com.apm.insight.nativecrash.a(this.a);
        Iterator<a> it2 = c0066b.c.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            final File file = next.a;
            try {
                aVar2.a(file);
                a2 = a(aVar2);
            } catch (Throwable th) {
                th = th;
                it = it2;
            }
            if (a2 == null || a2.length() == 0) {
                it = it2;
                z2 = b2;
                aVar2.i();
            } else if (a2.length() != 0) {
                if (!z) {
                    long optLong = a2.optLong("crash_time");
                    try {
                        aVar = c0066b.e;
                    } catch (Throwable th2) {
                        th = th2;
                        it = it2;
                        z2 = b2;
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        com.apm.insight.l.f.a(file);
                        b2 = z2;
                        it2 = it;
                    }
                    if (aVar == null) {
                        c0066b.e = next;
                        c0066b.f = true;
                        if (fVar == null || fVar.a("default")) {
                            it = it2;
                            z2 = b2;
                        } else {
                            aVar2.i();
                        }
                    } else {
                        it = it2;
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            z2 = b2;
                        }
                        if (c0066b.f) {
                            z2 = b2;
                        } else {
                            z2 = b2;
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                                com.apm.insight.c.a();
                                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                com.apm.insight.l.f.a(file);
                                b2 = z2;
                                it2 = it;
                            }
                            if (optLong < aVar.b) {
                                c0066b.e = next;
                                if (fVar != null && !fVar.a("default")) {
                                    aVar2.i();
                                    b2 = z2;
                                    it2 = it;
                                } else {
                                    a(file);
                                    c0066b.f = true;
                                }
                            }
                        }
                        com.apm.insight.entity.a.a(a2, "filters", C4913ua.b, String.valueOf(a2.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER).opt(C4913ua.b)));
                        a2.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER).put(C4913ua.b, 2010);
                    }
                } else {
                    it = it2;
                    z2 = b2;
                    if (fVar != null && !fVar.a("default")) {
                        aVar2.i();
                    }
                }
                com.apm.insight.entity.a.a(a2, "filters", "start_uuid", c0066b.a);
                com.apm.insight.entity.a.a(a2, "filters", "crash_thread_name", a2.optString("crash_thread_name", "unknown"));
                if (z2) {
                    try {
                        c.a aVar3 = new c.a(a2, CrashType.NATIVE);
                        com.apm.insight.entity.b.a(a2, com.apm.insight.entity.b.a(aVar3.c(), aVar3.a(), o.a().b(aVar3.b() == -1 ? System.currentTimeMillis() : aVar3.b())), new b.a() { // from class: com.apm.insight.k.b.4
                            @Override // com.apm.insight.entity.b.a
                            public final void a(JSONObject jSONObject) {
                                d.a();
                                d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.a, c0066b.a));
                            }
                        });
                        if (!aVar2.i()) {
                            aVar2.f();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        com.apm.insight.l.f.a(file);
                        b2 = z2;
                        it2 = it;
                    }
                }
                c.a(CrashType.NATIVE, a2);
            } else {
                it = it2;
                z2 = b2;
            }
            b2 = z2;
            it2 = it;
        }
    }

    private static boolean a(File file) {
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

    @Nullable
    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j, long j2) {
        com.apm.insight.f.b bVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.f.a(file);
                    return null;
                }
                boolean z = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.f.b(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        bVar = null;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                }
                com.apm.insight.f.b a2 = com.apm.insight.l.f.a(file, crashType);
                try {
                    JSONObject b2 = a2.b();
                    try {
                        if (a2.b() != null) {
                            if (crashType == CrashType.ANR) {
                                return a2;
                            }
                            b2.put("crash_time", j);
                            b2.put("app_start_time", j2);
                            JSONObject optJSONObject = b2.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
                            if (optJSONObject == null) {
                                optJSONObject = Header.a(j).f();
                            } else if (z) {
                                b2.remove(POBCTAOverlayData.KEY_CTA_HEADER);
                            }
                            String optString = optJSONObject.optString("sdk_version_name", null);
                            if (optString == null) {
                                optString = "2008-20250701130429";
                            }
                            com.apm.insight.entity.a.a(b2, "filters", "sdk_version", optString);
                            JSONArray optJSONArray = b2.optJSONArray("logcat");
                            if (optJSONArray == null || optJSONArray.length() == 0) {
                                b2.put("logcat", com.apm.insight.runtime.h.a(str));
                            }
                            com.apm.insight.entity.a.a(b2, "filters", "has_dump", "true");
                            com.apm.insight.entity.a.a(b2, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(b2, "logcat")));
                            com.apm.insight.entity.a.a(b2, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                            com.apm.insight.entity.a.a(b2, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                            com.apm.insight.entity.a.a(b2, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                            com.apm.insight.entity.a.a(b2, "filters", "is_64_devices", String.valueOf(Header.a()));
                            com.apm.insight.entity.a.a(b2, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                            com.apm.insight.entity.a.a(b2, "filters", "is_x86_devices", String.valueOf(Header.b()));
                            com.apm.insight.entity.a.a(b2, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                            com.apm.insight.entity.a.a(b2, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                            b2.put("launch_did", com.apm.insight.i.a.a(this.a));
                            b2.put("crash_uuid", file.getName());
                            try {
                                long parseLong = Long.parseLong(com.apm.insight.runtime.b.a(j, str));
                                com.apm.insight.entity.a.a(b2, "filters", "lastAliveTime", Math.abs(parseLong - j) < 60000 ? "< 60s" : "> 60s");
                                b2.put("lastAliveTime", String.valueOf(parseLong));
                            } catch (Throwable unused) {
                                b2.put("lastAliveTime", "unknown");
                                com.apm.insight.entity.a.a(b2, "filters", "lastAliveTime", "unknown");
                            }
                            b2.put("has_dump", "true");
                            if (b2.opt(X3.a.k) == null) {
                                com.apm.insight.e.g();
                                com.apm.insight.entity.a.a(b2, n.a());
                            }
                            if (Header.b(optJSONObject)) {
                                com.apm.insight.entity.a.a(b2, "filters", "unauthentic_version", "unauthentic_version");
                            }
                            com.apm.insight.entity.d.b(b2);
                            a2.b().put("upload_scene", "launch_scan");
                            if (z) {
                                JSONObject jSONObject = new JSONObject();
                                b2.put("event_type", "start_crash");
                                b2.put("stack", b2.remove("data"));
                                jSONObject.put("data", new JSONArray().put(b2));
                                jSONObject.put(POBCTAOverlayData.KEY_CTA_HEADER, optJSONObject);
                                a2.a(jSONObject);
                            } else {
                                b2.put("isJava", 1);
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                        return a2;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = a2;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            bVar = null;
        }
    }

    private void g() {
        File[] listFiles = com.apm.insight.l.j.i(this.a).listFiles();
        if (listFiles == null) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b c = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (c != null) {
                        if (c.b() != null) {
                            c.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), c.e(), c.d(), c.f(), c.g())) {
                            com.apm.insight.l.f.a(file);
                            String c2 = c.c();
                            if (!TextUtils.isEmpty(c2)) {
                                com.apm.insight.l.f.a(new File(c2));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            }
        }
    }
}
