package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2100a;

    /* renamed from: b, reason: collision with root package name */
    public int f2101b;

    /* renamed from: c, reason: collision with root package name */
    public int f2102c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2103e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2104f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2105g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2106j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2107k;

    /* renamed from: l, reason: collision with root package name */
    public int f2108l;

    /* renamed from: m, reason: collision with root package name */
    public long f2109m;

    /* renamed from: n, reason: collision with root package name */
    public int f2110n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2105g ? this.f2101b - this.f2102c : this.f2103e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2100a + ", mData=null, mItemCount=" + this.f2103e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2101b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2102c + ", mStructureChanged=" + this.f2104f + ", mInPreLayout=" + this.f2105g + ", mRunSimpleAnimations=" + this.f2106j + ", mRunPredictiveAnimations=" + this.f2107k + '}';
    }
}
