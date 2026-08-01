package h0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2412a;

    /* renamed from: b, reason: collision with root package name */
    public int f2413b;

    /* renamed from: c, reason: collision with root package name */
    public int f2414c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2415e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2416f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2417g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2418j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2419k;

    /* renamed from: l, reason: collision with root package name */
    public int f2420l;

    /* renamed from: m, reason: collision with root package name */
    public long f2421m;

    /* renamed from: n, reason: collision with root package name */
    public int f2422n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2417g ? this.f2413b - this.f2414c : this.f2415e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2412a + ", mData=null, mItemCount=" + this.f2415e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2413b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2414c + ", mStructureChanged=" + this.f2416f + ", mInPreLayout=" + this.f2417g + ", mRunSimpleAnimations=" + this.f2418j + ", mRunPredictiveAnimations=" + this.f2419k + '}';
    }
}
