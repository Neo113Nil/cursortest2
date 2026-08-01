package a;

import java.io.Serializable;

/* renamed from: a.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0038A implements W0.a, X0.d, Serializable, N0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient C0038A f887a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f888b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f889c = false;

    /* renamed from: d, reason: collision with root package name */
    public final int f890d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f891e;

    public C0038A(int i, Object obj) {
        this.f891e = i;
        this.f888b = obj;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f891e) {
            case 0:
                ((C0039B) this.f888b).d();
                break;
            default:
                ((C0039B) this.f888b).d();
                break;
        }
        return N0.e.f676c;
    }

    @Override // X0.d
    public final int b() {
        return 0;
    }

    public final X0.a d() {
        if (!this.f889c) {
            return X0.j.a(C0039B.class);
        }
        X0.j.f875a.getClass();
        return new X0.h();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0038A) {
            C0038A c0038a = (C0038A) obj;
            c0038a.getClass();
            return this.f890d == c0038a.f890d && this.f888b.equals(c0038a.f888b) && d().equals(c0038a.d());
        }
        if (!(obj instanceof C0038A)) {
            return false;
        }
        C0038A c0038a2 = this.f887a;
        if (c0038a2 == null) {
            X0.j.f875a.getClass();
            this.f887a = this;
            c0038a2 = this;
        }
        return obj.equals(c0038a2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        C0038A c0038a = this.f887a;
        if (c0038a == null) {
            X0.j.f875a.getClass();
            this.f887a = this;
            c0038a = this;
        }
        return c0038a != this ? c0038a.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
