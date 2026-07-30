package p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 implements y0 {

    /* renamed from: g, reason: collision with root package name */
    public static final i0 f7047g = new i0(0);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7048f;

    public /* synthetic */ i0(int i7) {
        this.f7048f = i7;
    }

    @Override // p1.y0
    public boolean a(Object obj, Object obj2) {
        return false;
    }

    public long b(long j8, long j9) {
        switch (this.f7048f) {
            case 1:
                float max = Math.max(y0.f.d(j9) / y0.f.d(j8), y0.f.b(j9) / y0.f.b(j8));
                return s0.a(max, max);
            case 2:
                float min = Math.min(y0.f.d(j9) / y0.f.d(j8), y0.f.b(j9) / y0.f.b(j8));
                return s0.a(min, min);
            default:
                if (y0.f.d(j8) <= y0.f.d(j9) && y0.f.b(j8) <= y0.f.b(j9)) {
                    return s0.a(1.0f, 1.0f);
                }
                float min2 = Math.min(y0.f.d(j9) / y0.f.d(j8), y0.f.b(j9) / y0.f.b(j8));
                return s0.a(min2, min2);
        }
    }

    @Override // p1.y0
    public void d(x0 x0Var) {
        x0Var.clear();
    }

    public String toString() {
        switch (this.f7048f) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
