package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1993a;

    /* renamed from: b, reason: collision with root package name */
    public int f1994b;

    /* renamed from: c, reason: collision with root package name */
    public int f1995c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1996e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1997f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1998g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1999j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2000k;

    /* renamed from: l, reason: collision with root package name */
    public int f2001l;

    /* renamed from: m, reason: collision with root package name */
    public long f2002m;

    /* renamed from: n, reason: collision with root package name */
    public int f2003n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f1998g ? this.f1994b - this.f1995c : this.f1996e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1993a + ", mData=null, mItemCount=" + this.f1996e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1994b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1995c + ", mStructureChanged=" + this.f1997f + ", mInPreLayout=" + this.f1998g + ", mRunSimpleAnimations=" + this.f1999j + ", mRunPredictiveAnimations=" + this.f2000k + '}';
    }
}
