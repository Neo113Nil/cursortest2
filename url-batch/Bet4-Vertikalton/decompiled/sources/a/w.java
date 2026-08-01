package a;

import c1.InterfaceC0085a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0085a, d1.c, Serializable, R0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1211a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1212b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1213c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1214e;

    public w(int i, Object obj) {
        this.f1214e = i;
        this.f1212b = obj;
    }

    public final d1.a a() {
        if (!this.f1213c) {
            return d1.h.a(x.class);
        }
        d1.h.f2020a.getClass();
        return new d1.f();
    }

    @Override // c1.InterfaceC0085a
    public final Object b() {
        switch (this.f1214e) {
            case 0:
                ((x) this.f1212b).d();
                break;
            default:
                ((x) this.f1212b).d();
                break;
        }
        return R0.f.f780c;
    }

    @Override // d1.c
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
            return this.d == wVar.d && this.f1212b.equals(wVar.f1212b) && a().equals(wVar.a());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1211a;
        if (wVar2 == null) {
            d1.h.f2020a.getClass();
            this.f1211a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        a();
        return (((a().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1211a;
        if (wVar == null) {
            d1.h.f2020a.getClass();
            this.f1211a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
