package i5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends k {

    /* renamed from: e, reason: collision with root package name */
    public int f4942e;

    public g(Object obj, Object obj2, i iVar, i iVar2) {
        super(obj, obj2, iVar, iVar2);
        this.f4942e = -1;
    }

    @Override // i5.k
    public final k c(Object obj, Object obj2, i iVar, i iVar2) {
        if (obj == null) {
            obj = this.f4944a;
        }
        if (obj2 == null) {
            obj2 = this.f4945b;
        }
        if (iVar == null) {
            iVar = this.f4946c;
        }
        if (iVar2 == null) {
            iVar2 = this.f4947d;
        }
        return new g(obj, obj2, iVar, iVar2);
    }

    @Override // i5.k
    public final int f() {
        return 2;
    }

    @Override // i5.k
    public final void j(k kVar) {
        if (this.f4942e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f4946c = kVar;
    }

    @Override // i5.i
    public final boolean p() {
        return false;
    }

    @Override // i5.i
    public final int size() {
        if (this.f4942e == -1) {
            this.f4942e = this.f4947d.size() + this.f4946c.size() + 1;
        }
        return this.f4942e;
    }
}
