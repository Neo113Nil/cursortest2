package a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements W0.a, X0.c, Serializable, P0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1094a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1095b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1096c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1097e;

    public w(int i, Object obj) {
        this.f1097e = i;
        this.f1095b = obj;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1097e) {
            case 0:
                ((x) this.f1095b).d();
                break;
            default:
                ((x) this.f1095b).d();
                break;
        }
        return P0.d.f627c;
    }

    @Override // X0.c
    public final int b() {
        return 0;
    }

    public final X0.a d() {
        if (!this.f1096c) {
            return X0.h.a(x.class);
        }
        X0.h.f1019a.getClass();
        return new X0.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1095b.equals(wVar.f1095b) && d().equals(wVar.d());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1094a;
        if (wVar2 == null) {
            X0.h.f1019a.getClass();
            this.f1094a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1094a;
        if (wVar == null) {
            X0.h.f1019a.getClass();
            this.f1094a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
