package e0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2148a;

    /* renamed from: b, reason: collision with root package name */
    public int f2149b;

    /* renamed from: c, reason: collision with root package name */
    public int f2150c;

    /* renamed from: d, reason: collision with root package name */
    public int f2151d;

    /* renamed from: e, reason: collision with root package name */
    public int f2152e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2153f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2154g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2155j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2156k;

    /* renamed from: l, reason: collision with root package name */
    public int f2157l;

    /* renamed from: m, reason: collision with root package name */
    public long f2158m;

    /* renamed from: n, reason: collision with root package name */
    public int f2159n;

    public final void a(int i) {
        if ((this.f2151d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2151d));
    }

    public final int b() {
        return this.f2154g ? this.f2149b - this.f2150c : this.f2152e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2148a + ", mData=null, mItemCount=" + this.f2152e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2149b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2150c + ", mStructureChanged=" + this.f2153f + ", mInPreLayout=" + this.f2154g + ", mRunSimpleAnimations=" + this.f2155j + ", mRunPredictiveAnimations=" + this.f2156k + '}';
    }
}
