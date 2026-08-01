package a;

import f1.InterfaceC0090a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0090a, g1.c, Serializable, U0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1241a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1242b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1243c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1244e;

    public w(int i, Object obj) {
        this.f1244e = i;
        this.f1242b = obj;
    }

    public final g1.a a() {
        if (!this.f1243c) {
            return g1.h.a(x.class);
        }
        g1.h.f2552a.getClass();
        return new g1.f();
    }

    @Override // f1.InterfaceC0090a
    public final Object b() {
        switch (this.f1244e) {
            case 0:
                ((x) this.f1242b).d();
                break;
            default:
                ((x) this.f1242b).d();
                break;
        }
        return U0.f.f904c;
    }

    @Override // g1.c
    public final int d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1242b.equals(wVar.f1242b) && a().equals(wVar.a());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1241a;
        if (wVar2 == null) {
            g1.h.f2552a.getClass();
            this.f1241a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        a();
        return (((a().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1241a;
        if (wVar == null) {
            g1.h.f2552a.getClass();
            this.f1241a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
