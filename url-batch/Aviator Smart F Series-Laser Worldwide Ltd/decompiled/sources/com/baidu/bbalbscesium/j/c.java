package com.baidu.bbalbscesium.j;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.Os;
import android.text.TextUtils;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.j.a;
import com.baidu.bbalbscesium.n.a;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends com.baidu.bbalbscesium.j.a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f4001i = "isc";

    /* renamed from: j, reason: collision with root package name */
    private static final int f4002j = 448;

    /* renamed from: k, reason: collision with root package name */
    private static final int f4003k = 256;

    /* renamed from: l, reason: collision with root package name */
    private static final int f4004l = 128;

    /* renamed from: m, reason: collision with root package name */
    private static final int f4005m = 64;

    /* renamed from: n, reason: collision with root package name */
    private static final int f4006n = 56;

    /* renamed from: o, reason: collision with root package name */
    private static final int f4007o = 32;

    /* renamed from: p, reason: collision with root package name */
    private static final int f4008p = 16;

    /* renamed from: q, reason: collision with root package name */
    private static final int f4009q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final int f4010r = 7;

    /* renamed from: s, reason: collision with root package name */
    private static final int f4011s = 4;

    /* renamed from: t, reason: collision with root package name */
    private static final int f4012t = 2;

    /* renamed from: u, reason: collision with root package name */
    private static final int f4013u = 1;

    /* renamed from: v, reason: collision with root package name */
    private static final int f4014v = -100;

    /* renamed from: g, reason: collision with root package name */
    a.C0047a f4015g;

    /* renamed from: h, reason: collision with root package name */
    private b f4016h;

    static class a {
        static boolean a(a.C0047a c0047a, com.baidu.bbalbscesium.n.a aVar) {
            if (Build.VERSION.SDK_INT < 23) {
                while (c0047a != null && !c0047a.b().equals(aVar.a())) {
                    c0047a.b().setExecutable(true, false);
                    c0047a = c0047a.d();
                }
                return true;
            }
            while (c0047a != null) {
                if (!a(c0047a.b())) {
                    return false;
                }
                c0047a = c0047a.d();
            }
            return a(aVar.a());
        }

        private static boolean a(File file) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    int i8 = Os.stat(file.getAbsolutePath()).st_mode;
                    if ((i8 & 1) == 0) {
                        Os.chmod(file.getAbsolutePath(), i8 | 1);
                    }
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }
    }

    class b {

        /* renamed from: b, reason: collision with root package name */
        private long f4018b;

        /* renamed from: c, reason: collision with root package name */
        private h.a f4019c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4020d;

        /* renamed from: f, reason: collision with root package name */
        private int f4022f;

        /* renamed from: a, reason: collision with root package name */
        private com.baidu.bbalbscesium.o.b f4017a = new com.baidu.bbalbscesium.o.b();

        /* renamed from: e, reason: collision with root package name */
        private boolean f4021e = true;

        b() {
        }

        public h.a a() {
            return this.f4019c;
        }

        public long b() {
            return this.f4018b;
        }

        public boolean c() {
            return a(c.this.f4015g.a("pub.dat", true));
        }

        public void a(long j8) {
            if (this.f4018b != j8) {
                this.f4018b = j8;
                this.f4020d = true;
            }
        }

        public void a(long j8, long j9) {
            if (this.f4017a.a(j8, j9)) {
                this.f4020d = true;
            }
        }

        public void a(h.a aVar) {
            if (aVar.equals(this.f4019c)) {
                return;
            }
            this.f4019c = aVar;
            this.f4020d = true;
        }

        public boolean a(PackageInfo packageInfo) {
            String a8 = c.this.f4015g.a(new File(packageInfo.applicationInfo.dataDir)).a("pub.dat", true);
            this.f4021e = false;
            return a(a8);
        }

        private boolean a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f4018b = jSONObject.getLong("pub_lst_ts");
                    this.f4019c = h.b(jSONObject.getString("pub_info"));
                    this.f4022f = jSONObject.getInt("d_form_ver");
                    this.f4020d = false;
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    /* renamed from: com.baidu.bbalbscesium.j.c$c, reason: collision with other inner class name */
    class C0045c extends a.c {

        /* renamed from: g, reason: collision with root package name */
        private int f4024g;

        /* renamed from: h, reason: collision with root package name */
        private String f4025h;

        /* renamed from: i, reason: collision with root package name */
        private long f4026i;

        /* renamed from: j, reason: collision with root package name */
        private long f4027j;

        /* renamed from: k, reason: collision with root package name */
        private long f4028k;

        /* renamed from: l, reason: collision with root package name */
        private h.a f4029l;

        public C0045c(String str) {
            super(c.this.f4015g, str);
        }

        public void a(b bVar) {
            a(bVar.a());
            b(bVar.b());
        }

        @Override // com.baidu.bbalbscesium.j.a.c
        public void b(JSONObject jSONObject) {
            jSONObject.put("pkg", this.f4025h);
            jSONObject.put("last_fe_ts", this.f4026i);
            jSONObject.put("tar_pkg_lst_pub_ts", this.f4027j);
            jSONObject.put("info", this.f4029l.f());
            jSONObject.put("tar_pkg_lst_up_ts", this.f4028k);
            jSONObject.put("d_form_ver", 1);
        }

        public h.a c() {
            return this.f4029l;
        }

        public long d() {
            return this.f4028k;
        }

        public String e() {
            return this.f4025h;
        }

        @Override // com.baidu.bbalbscesium.j.a.c
        public void a(JSONObject jSONObject) {
            this.f4025h = jSONObject.getString("pkg");
            this.f4027j = jSONObject.getInt("tar_pkg_lst_pub_ts");
            this.f4026i = jSONObject.getLong("last_fe_ts");
            this.f4029l = h.b(jSONObject.getString("info"));
            this.f4028k = jSONObject.getLong("tar_pkg_lst_up_ts");
            this.f4024g = jSONObject.getInt("d_form_ver");
        }

        public boolean b(long j8) {
            if (this.f4027j == j8) {
                return false;
            }
            this.f4027j = j8;
            a(true);
            return true;
        }

        public boolean c(long j8) {
            if (this.f4028k == j8) {
                return false;
            }
            this.f4028k = j8;
            a(true);
            return true;
        }

        public boolean a(long j8) {
            if (this.f4026i == j8) {
                return false;
            }
            this.f4026i = j8;
            a(true);
            return true;
        }

        public boolean a(h.a aVar) {
            if (aVar.equals(this.f4029l)) {
                return false;
            }
            this.f4029l = aVar;
            a(true);
            return true;
        }

        public boolean a(String str) {
            if (str.equals(this.f4025h)) {
                return false;
            }
            this.f4025h = str;
            a(true);
            return true;
        }
    }

    public c() {
        super("isc", com.baidu.bbalbscesium.j.b.f3998f);
        this.f4016h = new b();
    }

    private a.f b(a.e eVar, h.a aVar) {
        this.f4016h.c();
        this.f4015g.a();
        if (aVar.equals(this.f4016h.a())) {
            return a.f.d();
        }
        this.f4016h.a(aVar);
        this.f4016h.a(System.currentTimeMillis());
        return a.f.d();
    }

    private void c() {
        this.f4016h.a(a.a(this.f4015g, this.f3967a.f3972b) ? 1 : 2, 3L);
    }

    @Override // com.baidu.bbalbscesium.j.a
    public a.f a(a.e eVar, h.a aVar) {
        return a.f.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(File file, boolean z7) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Os.chmod(file.getAbsolutePath(), z7 ? 436 : 432);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        try {
            if (z7) {
                return file.setReadable(true, false);
            }
            return file.setReadable(false, false) && file.setReadable(true, true);
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // com.baidu.bbalbscesium.j.a
    public a.h a(String str, a.g gVar) {
        PackageInfo packageInfo;
        h.a a8;
        C0045c c0045c = null;
        try {
            packageInfo = this.f3967a.f3971a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return a.h.a(-2);
        }
        if (gVar.f3987a) {
            c0045c = new C0045c(str);
            c0045c.b();
            if (str.equals(c0045c.e()) && packageInfo.lastUpdateTime == c0045c.d()) {
                a8 = c0045c.c();
                return a.h.a(a8);
            }
        }
        b bVar = new b();
        if (!bVar.a(packageInfo)) {
            return a.h.a(-2);
        }
        if (gVar.f3987a && c0045c != null) {
            c0045c.a(bVar);
            c0045c.a(System.currentTimeMillis());
            c0045c.c(packageInfo.lastUpdateTime);
            c0045c.a(str);
            c0045c.a();
        }
        a8 = bVar.a();
        return a.h.a(a8);
    }

    @Override // com.baidu.bbalbscesium.j.a
    public void a(a.d dVar) {
        this.f4015g = this.f3968b.b("isc");
    }
}
