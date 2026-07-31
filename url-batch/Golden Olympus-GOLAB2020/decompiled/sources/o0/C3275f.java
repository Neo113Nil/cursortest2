package o0;

import o0.C3271b;
import o0.C3276g;

/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3275f {

    /* renamed from: a, reason: collision with root package name */
    C3271b.r f41517a;

    /* renamed from: b, reason: collision with root package name */
    C3274e f41518b;

    /* renamed from: c, reason: collision with root package name */
    String f41519c;

    /* renamed from: d, reason: collision with root package name */
    C3276g.C3278b f41520d;

    /* renamed from: e, reason: collision with root package name */
    String f41521e;

    /* renamed from: f, reason: collision with root package name */
    C3276g.C3278b f41522f;

    public C3275f() {
        this.f41517a = null;
        this.f41518b = null;
        this.f41519c = null;
        this.f41520d = null;
        this.f41521e = null;
        this.f41522f = null;
    }

    public boolean a() {
        C3271b.r rVar = this.f41517a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean b() {
        return this.f41518b != null;
    }

    public boolean c() {
        return this.f41519c != null;
    }

    public boolean d() {
        return this.f41521e != null;
    }

    public boolean e() {
        return this.f41520d != null;
    }

    public boolean f() {
        return this.f41522f != null;
    }

    public C3275f g(float f4, float f5, float f6, float f7) {
        this.f41522f = new C3276g.C3278b(f4, f5, f6, f7);
        return this;
    }

    public C3275f(C3275f c3275f) {
        this.f41517a = null;
        this.f41518b = null;
        this.f41519c = null;
        this.f41520d = null;
        this.f41521e = null;
        this.f41522f = null;
        if (c3275f == null) {
            return;
        }
        this.f41517a = c3275f.f41517a;
        this.f41518b = c3275f.f41518b;
        this.f41520d = c3275f.f41520d;
        this.f41521e = c3275f.f41521e;
        this.f41522f = c3275f.f41522f;
    }
}
