package a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements W0.a, X0.c, Serializable, P0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1096a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1097b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1098c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1099e;

    public w(int i, Object obj) {
        this.f1099e = i;
        this.f1097b = obj;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1099e) {
            case 0:
                ((x) this.f1097b).d();
                break;
            default:
                ((x) this.f1097b).d();
                break;
        }
        return P0.d.f626c;
    }

    @Override // X0.c
    public final int b() {
        return 0;
    }

    public final X0.a d() {
        if (!this.f1098c) {
            return X0.h.a(x.class);
        }
        X0.h.f1021a.getClass();
        return new X0.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1097b.equals(wVar.f1097b) && d().equals(wVar.d());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1096a;
        if (wVar2 == null) {
            X0.h.f1021a.getClass();
            this.f1096a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1096a;
        if (wVar == null) {
            X0.h.f1021a.getClass();
            this.f1096a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
