package a;

import a1.InterfaceC0058a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0058a, b1.c, Serializable, S0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1168a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1169b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1170c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1171e;

    public w(int i, Object obj) {
        this.f1171e = i;
        this.f1169b = obj;
    }

    @Override // a1.InterfaceC0058a
    public final Object a() {
        switch (this.f1171e) {
            case 0:
                ((x) this.f1169b).d();
                break;
            default:
                ((x) this.f1169b).d();
                break;
        }
        return S0.d.f774c;
    }

    @Override // b1.c
    public final int b() {
        return 0;
    }

    public final b1.a d() {
        if (!this.f1170c) {
            return b1.h.a(x.class);
        }
        b1.h.f1588a.getClass();
        return new b1.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1169b.equals(wVar.f1169b) && d().equals(wVar.d());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1168a;
        if (wVar2 == null) {
            b1.h.f1588a.getClass();
            this.f1168a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1168a;
        if (wVar == null) {
            b1.h.f1588a.getClass();
            this.f1168a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
