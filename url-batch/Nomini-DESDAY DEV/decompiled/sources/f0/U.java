package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1988a;

    /* renamed from: b, reason: collision with root package name */
    public int f1989b;

    /* renamed from: c, reason: collision with root package name */
    public int f1990c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1991e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1992f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1993g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1994j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1995k;

    /* renamed from: l, reason: collision with root package name */
    public int f1996l;

    /* renamed from: m, reason: collision with root package name */
    public long f1997m;

    /* renamed from: n, reason: collision with root package name */
    public int f1998n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f1993g ? this.f1989b - this.f1990c : this.f1991e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1988a + ", mData=null, mItemCount=" + this.f1991e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1989b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1990c + ", mStructureChanged=" + this.f1992f + ", mInPreLayout=" + this.f1993g + ", mRunSimpleAnimations=" + this.f1994j + ", mRunPredictiveAnimations=" + this.f1995k + '}';
    }
}
