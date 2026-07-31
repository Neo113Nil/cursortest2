package B0;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final w f227a;

    /* renamed from: b, reason: collision with root package name */
    public final w f228b;

    /* renamed from: c, reason: collision with root package name */
    public final w f229c;

    /* renamed from: d, reason: collision with root package name */
    public final w f230d;

    public A(w wVar, w wVar2, w wVar3, w wVar4) {
        this.f227a = wVar;
        this.f228b = wVar2;
        this.f229c = wVar3;
        this.f230d = wVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A)) {
            return false;
        }
        A a3 = (A) obj;
        return Z1.i.a(this.f227a, a3.f227a) && Z1.i.a(this.f228b, a3.f228b) && Z1.i.a(this.f229c, a3.f229c) && Z1.i.a(this.f230d, a3.f230d);
    }

    public final int hashCode() {
        w wVar = this.f227a;
        int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        w wVar2 = this.f228b;
        int hashCode2 = (hashCode + (wVar2 != null ? wVar2.hashCode() : 0)) * 31;
        w wVar3 = this.f229c;
        int hashCode3 = (hashCode2 + (wVar3 != null ? wVar3.hashCode() : 0)) * 31;
        w wVar4 = this.f230d;
        return hashCode3 + (wVar4 != null ? wVar4.hashCode() : 0);
    }
}
