package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1991a;

    /* renamed from: b, reason: collision with root package name */
    public int f1992b;

    /* renamed from: c, reason: collision with root package name */
    public int f1993c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1994e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1995f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1996g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1997j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1998k;

    /* renamed from: l, reason: collision with root package name */
    public int f1999l;

    /* renamed from: m, reason: collision with root package name */
    public long f2000m;

    /* renamed from: n, reason: collision with root package name */
    public int f2001n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f1996g ? this.f1992b - this.f1993c : this.f1994e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1991a + ", mData=null, mItemCount=" + this.f1994e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1992b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1993c + ", mStructureChanged=" + this.f1995f + ", mInPreLayout=" + this.f1996g + ", mRunSimpleAnimations=" + this.f1997j + ", mRunPredictiveAnimations=" + this.f1998k + '}';
    }
}
