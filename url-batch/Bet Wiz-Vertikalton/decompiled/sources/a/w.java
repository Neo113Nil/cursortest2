package a;

import d1.InterfaceC0081a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0081a, e1.c, Serializable, V0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1198a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1199b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1200c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1201e;

    public w(int i, Object obj) {
        this.f1201e = i;
        this.f1199b = obj;
    }

    @Override // d1.InterfaceC0081a
    public final Object a() {
        switch (this.f1201e) {
            case 0:
                ((x) this.f1199b).d();
                break;
            default:
                ((x) this.f1199b).d();
                break;
        }
        return V0.e.f878c;
    }

    @Override // e1.c
    public final int b() {
        return 0;
    }

    public final e1.a d() {
        if (!this.f1200c) {
            return e1.h.a(x.class);
        }
        e1.h.f2056a.getClass();
        return new e1.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1199b.equals(wVar.f1199b) && d().equals(wVar.d());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1198a;
        if (wVar2 == null) {
            e1.h.f2056a.getClass();
            this.f1198a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1198a;
        if (wVar == null) {
            e1.h.f2056a.getClass();
            this.f1198a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
