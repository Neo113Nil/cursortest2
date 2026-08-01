package x;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final o f10203b = new o(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10204a;

    public /* synthetic */ o(int i3) {
        this.f10204a = i3;
    }

    @Override // x.x
    public c2.i a(z.f fVar) {
        return new n(fVar);
    }

    public boolean equals(Object obj) {
        switch (this.f10204a) {
            case 0:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }

    @Override // x.x
    public int hashCode() {
        switch (this.f10204a) {
            case 0:
                return -1;
            default:
                return super.hashCode();
        }
    }
}
