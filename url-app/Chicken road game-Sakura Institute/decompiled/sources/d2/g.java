package d2;

/* loaded from: classes.dex */
public final class g extends k {

    /* renamed from: e, reason: collision with root package name */
    public int f6076e;

    public g(Object obj, Object obj2, i iVar, i iVar2) {
        super(obj, obj2, iVar, iVar2);
        this.f6076e = -1;
    }

    @Override // d2.k
    public final k c(Object obj, Object obj2, i iVar, i iVar2) {
        if (obj == null) {
            obj = this.f6078a;
        }
        if (obj2 == null) {
            obj2 = this.f6079b;
        }
        if (iVar == null) {
            iVar = this.f6080c;
        }
        if (iVar2 == null) {
            iVar2 = this.f6081d;
        }
        return new g(obj, obj2, iVar, iVar2);
    }

    @Override // d2.k
    public final int e() {
        return 2;
    }

    @Override // d2.i
    public final boolean o() {
        return false;
    }

    @Override // d2.k
    public final void r(k kVar) {
        if (this.f6076e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f6080c = kVar;
    }

    @Override // d2.i
    public final int size() {
        if (this.f6076e == -1) {
            this.f6076e = this.f6081d.size() + this.f6080c.size() + 1;
        }
        return this.f6076e;
    }
}
