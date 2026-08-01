package a;

import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final /* synthetic */ class w extends k1.a implements InterfaceC0170a, k1.d, p1.a, X0.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f1615g;
    public final int h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, false);
        this.i = i2;
        this.f1615g = i;
        this.h = 0;
    }

    public final p1.a b() {
        k1.i.f3246a.getClass();
        return this;
    }

    @Override // j1.InterfaceC0170a
    public final Object c() {
        switch (this.i) {
            case 0:
                ((x) this.f3234b).d();
                break;
            default:
                ((x) this.f3234b).d();
                break;
        }
        return X0.g.f1277c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return this.d.equals(wVar.d) && this.f3236e.equals(wVar.f3236e) && this.h == wVar.h && this.f1615g == wVar.f1615g && this.f3234b.equals(wVar.f3234b) && a().equals(wVar.a());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        p1.a aVar = this.f3233a;
        if (aVar == null) {
            b();
            this.f3233a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // k1.d
    public final int f() {
        return this.f1615g;
    }

    public final int hashCode() {
        a();
        return this.f3236e.hashCode() + ((this.d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        p1.a aVar = this.f3233a;
        if (aVar == null) {
            b();
            this.f3233a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.d;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
