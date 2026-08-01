package a;

import f1.InterfaceC0099a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0099a, g1.c, Serializable, W0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1296a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1297b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1298c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1299e;

    public w(int i, Object obj) {
        this.f1299e = i;
        this.f1297b = obj;
    }

    @Override // f1.InterfaceC0099a
    public final Object a() {
        switch (this.f1299e) {
            case 0:
                ((x) this.f1297b).d();
                break;
            default:
                ((x) this.f1297b).d();
                break;
        }
        return W0.e.f956c;
    }

    @Override // g1.c
    public final int b() {
        return 0;
    }

    public final g1.a d() {
        if (!this.f1298c) {
            return g1.h.a(x.class);
        }
        g1.h.f2366a.getClass();
        return new g1.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1297b.equals(wVar.f1297b) && d().equals(wVar.d());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1296a;
        if (wVar2 == null) {
            g1.h.f2366a.getClass();
            this.f1296a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1296a;
        if (wVar == null) {
            g1.h.f2366a.getClass();
            this.f1296a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
