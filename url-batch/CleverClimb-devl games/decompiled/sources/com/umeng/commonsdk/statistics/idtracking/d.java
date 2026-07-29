package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: IdTracker.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f9162a = 86400000;

    /* renamed from: b, reason: collision with root package name */
    public static d f9163b;
    private static Object j = new Object();

    /* renamed from: d, reason: collision with root package name */
    private File f9165d;
    private long f;
    private a i;

    /* renamed from: c, reason: collision with root package name */
    private final String f9164c = "umeng_it.cache";
    private com.umeng.commonsdk.statistics.proto.c e = null;
    private Set<com.umeng.commonsdk.statistics.idtracking.a> h = new HashSet();
    private long g = 86400000;

    public String c() {
        return null;
    }

    d(Context context) {
        this.i = null;
        this.f9165d = new File(context.getFilesDir(), "umeng_it.cache");
        this.i = new a(context);
        this.i.b();
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f9163b == null) {
                f9163b = new d(context);
                f9163b.a(new e(context));
                f9163b.a(new b(context));
                f9163b.a(new q(context));
                f9163b.a(new c(context));
                f9163b.a(new f(context));
                f9163b.a(new i());
                f9163b.a(new r(context));
                p pVar = new p(context);
                if (!TextUtils.isEmpty(pVar.f())) {
                    f9163b.a(pVar);
                }
                h hVar = new h(context);
                if (hVar.g()) {
                    f9163b.a(hVar);
                    f9163b.a(new g(context));
                    hVar.i();
                }
                if (SdkVersion.SDK_TYPE != 1) {
                    f9163b.a(new o(context));
                    f9163b.a(new l(context));
                    f9163b.a(new n(context));
                    f9163b.a(new m(context));
                    f9163b.a(new k(context));
                    f9163b.a(new j(context));
                }
                f9163b.e();
            }
            dVar = f9163b;
        }
        return dVar;
    }

    private boolean a(com.umeng.commonsdk.statistics.idtracking.a aVar) {
        if (this.i.a(aVar.b())) {
            return this.h.add(aVar);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.w("invalid domain: " + aVar.b());
        return false;
    }

    public void a(long j2) {
        this.g = j2;
    }

    public synchronized void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f >= this.g) {
            boolean z = false;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                if (aVar.c() && aVar.a()) {
                    z = true;
                    if (!aVar.c()) {
                        this.i.b(aVar.b());
                    }
                }
            }
            if (z) {
                g();
                this.i.a();
                f();
            }
            this.f = currentTimeMillis;
        }
    }

    public synchronized com.umeng.commonsdk.statistics.proto.c b() {
        return this.e;
    }

    private synchronized void g() {
        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
            if (aVar.c()) {
                if (aVar.d() != null) {
                    hashMap.put(aVar.b(), aVar.d());
                }
                if (aVar.e() != null && !aVar.e().isEmpty()) {
                    arrayList.addAll(aVar.e());
                }
            }
        }
        cVar.a(arrayList);
        cVar.a(hashMap);
        synchronized (this) {
            this.e = cVar;
        }
    }

    public synchronized void d() {
        boolean z = false;
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
            if (aVar.c() && aVar.e() != null && !aVar.e().isEmpty()) {
                aVar.a((List<com.umeng.commonsdk.statistics.proto.a>) null);
                z = true;
            }
        }
        if (z) {
            this.e.b(false);
            f();
        }
    }

    public synchronized void e() {
        com.umeng.commonsdk.statistics.proto.c h = h();
        if (h == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.h.size());
        synchronized (this) {
            this.e = h;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                aVar.a(this.e);
                if (!aVar.c()) {
                    arrayList.add(aVar);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.h.remove((com.umeng.commonsdk.statistics.idtracking.a) it.next());
            }
            g();
        }
    }

    public synchronized void f() {
        if (this.e != null) {
            a(this.e);
        }
    }

    private com.umeng.commonsdk.statistics.proto.c h() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (j) {
            if (!this.f9165d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f9165d);
                try {
                    try {
                        byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
                        new com.umeng.commonsdk.proguard.l().a(cVar, readStreamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return cVar;
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        HelperUtils.safeClose(fileInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    HelperUtils.safeClose(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
        }
    }

    private void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        byte[] a2;
        synchronized (j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        a2 = new com.umeng.commonsdk.proguard.r().a(cVar);
                    }
                    if (a2 != null) {
                        HelperUtils.writeFile(this.f9165d, a2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: IdTracker.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f9166a;

        /* renamed from: b, reason: collision with root package name */
        private Set<String> f9167b = new HashSet();

        public a(Context context) {
            this.f9166a = context;
        }

        public synchronized boolean a(String str) {
            return !this.f9167b.contains(str);
        }

        public synchronized void b(String str) {
            this.f9167b.add(str);
        }

        public void c(String str) {
            this.f9167b.remove(str);
        }

        public synchronized void a() {
            if (!this.f9167b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = this.f9167b.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f9166a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        public synchronized void b() {
            String[] split;
            String string = PreferenceWrapper.getDefault(this.f9166a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (split = string.split(",")) != null) {
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f9167b.add(str);
                    }
                }
            }
        }
    }
}
