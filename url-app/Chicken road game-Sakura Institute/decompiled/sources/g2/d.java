package g2;

import B1.C0097d;
import android.os.Build;
import b2.C0518b;
import c2.C0538b;
import j2.C0712b;
import w2.C1294c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public G1.y f6683a;

    /* renamed from: b, reason: collision with root package name */
    public C1294c f6684b;

    /* renamed from: c, reason: collision with root package name */
    public C0538b f6685c;

    /* renamed from: d, reason: collision with root package name */
    public C0538b f6686d;

    /* renamed from: e, reason: collision with root package name */
    public C0097d f6687e;

    /* renamed from: f, reason: collision with root package name */
    public String f6688f;

    /* renamed from: g, reason: collision with root package name */
    public String f6689g;

    /* renamed from: h, reason: collision with root package name */
    public int f6690h;

    /* renamed from: i, reason: collision with root package name */
    public V1.f f6691i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6692j;

    /* renamed from: k, reason: collision with root package name */
    public y.t f6693k;

    public final C0712b a() {
        C0097d c0097d = this.f6687e;
        if (c0097d != null) {
            return (C0712b) c0097d.f987e;
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    public final C0097d b(String str) {
        return new C0097d(this.f6683a, str, (Object) null, 18);
    }

    public final y.t c() {
        if (this.f6693k == null) {
            synchronized (this) {
                this.f6693k = new y.t(this.f6691i);
            }
        }
        return this.f6693k;
    }

    public final void d() {
        if (this.f6683a == null) {
            c().getClass();
            int i2 = this.f6690h;
            G1.y yVar = new G1.y();
            yVar.f3165b = null;
            yVar.f3164a = i2;
            this.f6683a = yVar;
        }
        c();
        if (this.f6689g == null) {
            c().getClass();
            this.f6689g = "Firebase/5/21.0.0/" + (Build.VERSION.SDK_INT + "/Android");
        }
        if (this.f6684b == null) {
            c().getClass();
            this.f6684b = new C1294c(27);
        }
        if (this.f6687e == null) {
            y.t tVar = this.f6693k;
            tVar.getClass();
            this.f6687e = new C0097d(tVar, b("RunLoop"));
        }
        if (this.f6688f == null) {
            this.f6688f = "default";
        }
        H1.o.e(this.f6685c, "You must register an authTokenProvider before initializing Context.");
        H1.o.e(this.f6686d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final synchronized void e(String str) {
        if (this.f6692j) {
            throw new C0518b("Modifications to DatabaseConfig objects must occur before they are in use");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f6688f = str;
    }
}
