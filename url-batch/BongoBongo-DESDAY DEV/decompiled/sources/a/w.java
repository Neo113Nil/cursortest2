package a;

import g1.InterfaceC0110a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0110a, h1.c, Serializable, V0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1287a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1288b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1289c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1290e;

    public w(int i, Object obj) {
        this.f1290e = i;
        this.f1288b = obj;
    }

    public final h1.a a() {
        if (!this.f1289c) {
            return h1.h.a(x.class);
        }
        h1.h.f2651a.getClass();
        return new h1.f();
    }

    @Override // g1.InterfaceC0110a
    public final Object b() {
        switch (this.f1290e) {
            case 0:
                ((x) this.f1288b).d();
                break;
            default:
                ((x) this.f1288b).d();
                break;
        }
        return V0.e.f946c;
    }

    @Override // h1.c
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
            return this.d == wVar.d && this.f1288b.equals(wVar.f1288b) && a().equals(wVar.a());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1287a;
        if (wVar2 == null) {
            h1.h.f2651a.getClass();
            this.f1287a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        a();
        return (((a().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1287a;
        if (wVar == null) {
            h1.h.f2651a.getClass();
            this.f1287a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
