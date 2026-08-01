package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2058a;

    /* renamed from: b, reason: collision with root package name */
    public int f2059b;

    /* renamed from: c, reason: collision with root package name */
    public int f2060c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2061e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2062f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2063g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2064j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2065k;

    /* renamed from: l, reason: collision with root package name */
    public int f2066l;

    /* renamed from: m, reason: collision with root package name */
    public long f2067m;

    /* renamed from: n, reason: collision with root package name */
    public int f2068n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2063g ? this.f2059b - this.f2060c : this.f2061e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2058a + ", mData=null, mItemCount=" + this.f2061e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2059b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2060c + ", mStructureChanged=" + this.f2062f + ", mInPreLayout=" + this.f2063g + ", mRunSimpleAnimations=" + this.f2064j + ", mRunPredictiveAnimations=" + this.f2065k + '}';
    }
}
