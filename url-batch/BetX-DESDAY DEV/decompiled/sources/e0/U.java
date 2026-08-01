package e0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2152a;

    /* renamed from: b, reason: collision with root package name */
    public int f2153b;

    /* renamed from: c, reason: collision with root package name */
    public int f2154c;

    /* renamed from: d, reason: collision with root package name */
    public int f2155d;

    /* renamed from: e, reason: collision with root package name */
    public int f2156e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2157f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2158g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2159j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2160k;

    /* renamed from: l, reason: collision with root package name */
    public int f2161l;

    /* renamed from: m, reason: collision with root package name */
    public long f2162m;

    /* renamed from: n, reason: collision with root package name */
    public int f2163n;

    public final void a(int i) {
        if ((this.f2155d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2155d));
    }

    public final int b() {
        return this.f2158g ? this.f2153b - this.f2154c : this.f2156e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2152a + ", mData=null, mItemCount=" + this.f2156e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2153b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2154c + ", mStructureChanged=" + this.f2157f + ", mInPreLayout=" + this.f2158g + ", mRunSimpleAnimations=" + this.f2159j + ", mRunPredictiveAnimations=" + this.f2160k + '}';
    }
}
