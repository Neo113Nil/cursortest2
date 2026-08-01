package a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Y0.a, Z0.c, Serializable, Q0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1129a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1130b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1131c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1132e;

    public w(int i, Object obj) {
        this.f1132e = i;
        this.f1130b = obj;
    }

    @Override // Y0.a
    public final Object a() {
        switch (this.f1132e) {
            case 0:
                ((x) this.f1130b).d();
                break;
            default:
                ((x) this.f1130b).d();
                break;
        }
        return Q0.e.f694c;
    }

    @Override // Z0.c
    public final int b() {
        return 0;
    }

    public final Z0.a d() {
        if (!this.f1131c) {
            return Z0.h.a(x.class);
        }
        Z0.h.f1068a.getClass();
        return new Z0.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1130b.equals(wVar.f1130b) && d().equals(wVar.d());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1129a;
        if (wVar2 == null) {
            Z0.h.f1068a.getClass();
            this.f1129a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1129a;
        if (wVar == null) {
            Z0.h.f1068a.getClass();
            this.f1129a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
