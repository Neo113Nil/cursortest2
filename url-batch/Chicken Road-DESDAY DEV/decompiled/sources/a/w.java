package a;

import a1.InterfaceC0059a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0059a, b1.c, Serializable, S0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1154a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1155b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1156c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1157e;

    public w(int i, Object obj) {
        this.f1157e = i;
        this.f1155b = obj;
    }

    @Override // a1.InterfaceC0059a
    public final Object a() {
        switch (this.f1157e) {
            case 0:
                ((x) this.f1155b).d();
                break;
            default:
                ((x) this.f1155b).d();
                break;
        }
        return S0.f.f759c;
    }

    @Override // b1.c
    public final int b() {
        return 0;
    }

    public final b1.a d() {
        if (!this.f1156c) {
            return b1.h.a(x.class);
        }
        b1.h.f1572a.getClass();
        return new b1.f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1155b.equals(wVar.f1155b) && d().equals(wVar.d());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1154a;
        if (wVar2 == null) {
            b1.h.f1572a.getClass();
            this.f1154a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1154a;
        if (wVar == null) {
            b1.h.f1572a.getClass();
            this.f1154a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
