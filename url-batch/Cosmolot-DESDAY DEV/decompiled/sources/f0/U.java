package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1989a;

    /* renamed from: b, reason: collision with root package name */
    public int f1990b;

    /* renamed from: c, reason: collision with root package name */
    public int f1991c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1993f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1994g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1995j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1996k;

    /* renamed from: l, reason: collision with root package name */
    public int f1997l;

    /* renamed from: m, reason: collision with root package name */
    public long f1998m;

    /* renamed from: n, reason: collision with root package name */
    public int f1999n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f1994g ? this.f1990b - this.f1991c : this.f1992e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1989a + ", mData=null, mItemCount=" + this.f1992e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1990b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1991c + ", mStructureChanged=" + this.f1993f + ", mInPreLayout=" + this.f1994g + ", mRunSimpleAnimations=" + this.f1995j + ", mRunPredictiveAnimations=" + this.f1996k + '}';
    }
}
