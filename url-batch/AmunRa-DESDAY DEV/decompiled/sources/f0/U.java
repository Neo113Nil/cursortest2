package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2057a;

    /* renamed from: b, reason: collision with root package name */
    public int f2058b;

    /* renamed from: c, reason: collision with root package name */
    public int f2059c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2060e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2061f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2062g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2063j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2064k;

    /* renamed from: l, reason: collision with root package name */
    public int f2065l;

    /* renamed from: m, reason: collision with root package name */
    public long f2066m;

    /* renamed from: n, reason: collision with root package name */
    public int f2067n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2062g ? this.f2058b - this.f2059c : this.f2060e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2057a + ", mData=null, mItemCount=" + this.f2060e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2058b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2059c + ", mStructureChanged=" + this.f2061f + ", mInPreLayout=" + this.f2062g + ", mRunSimpleAnimations=" + this.f2063j + ", mRunPredictiveAnimations=" + this.f2064k + '}';
    }
}
