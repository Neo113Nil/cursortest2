package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2125a;

    /* renamed from: b, reason: collision with root package name */
    public int f2126b;

    /* renamed from: c, reason: collision with root package name */
    public int f2127c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2128e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2129f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2130g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2131j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2132k;

    /* renamed from: l, reason: collision with root package name */
    public int f2133l;

    /* renamed from: m, reason: collision with root package name */
    public long f2134m;

    /* renamed from: n, reason: collision with root package name */
    public int f2135n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2130g ? this.f2126b - this.f2127c : this.f2128e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2125a + ", mData=null, mItemCount=" + this.f2128e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2126b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2127c + ", mStructureChanged=" + this.f2129f + ", mInPreLayout=" + this.f2130g + ", mRunSimpleAnimations=" + this.f2131j + ", mRunPredictiveAnimations=" + this.f2132k + '}';
    }
}
