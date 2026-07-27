package d2;

/* loaded from: classes.dex */
public final class j extends k {
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
        return new j(obj, obj2, iVar, iVar2);
    }

    @Override // d2.k
    public final int e() {
        return 1;
    }

    @Override // d2.i
    public final boolean o() {
        return true;
    }

    @Override // d2.i
    public final int size() {
        return this.f6081d.size() + this.f6080c.size() + 1;
    }
}
