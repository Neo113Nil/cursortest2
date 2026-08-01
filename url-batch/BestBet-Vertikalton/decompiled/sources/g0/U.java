package g0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2759a;

    /* renamed from: b, reason: collision with root package name */
    public int f2760b;

    /* renamed from: c, reason: collision with root package name */
    public int f2761c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2762e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2763f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2764g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2765j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2766k;

    /* renamed from: l, reason: collision with root package name */
    public int f2767l;

    /* renamed from: m, reason: collision with root package name */
    public long f2768m;

    /* renamed from: n, reason: collision with root package name */
    public int f2769n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2764g ? this.f2760b - this.f2761c : this.f2762e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2759a + ", mData=null, mItemCount=" + this.f2762e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2760b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2761c + ", mStructureChanged=" + this.f2763f + ", mInPreLayout=" + this.f2764g + ", mRunSimpleAnimations=" + this.f2765j + ", mRunPredictiveAnimations=" + this.f2766k + '}';
    }
}
