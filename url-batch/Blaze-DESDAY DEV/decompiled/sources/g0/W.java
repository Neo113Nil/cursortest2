package g0;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public int f2345a;

    /* renamed from: b, reason: collision with root package name */
    public int f2346b;

    /* renamed from: c, reason: collision with root package name */
    public int f2347c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2349f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2350g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2351j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2352k;

    /* renamed from: l, reason: collision with root package name */
    public int f2353l;

    /* renamed from: m, reason: collision with root package name */
    public long f2354m;

    /* renamed from: n, reason: collision with root package name */
    public int f2355n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2350g ? this.f2346b - this.f2347c : this.f2348e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2345a + ", mData=null, mItemCount=" + this.f2348e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2346b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2347c + ", mStructureChanged=" + this.f2349f + ", mInPreLayout=" + this.f2350g + ", mRunSimpleAnimations=" + this.f2351j + ", mRunPredictiveAnimations=" + this.f2352k + '}';
    }
}
