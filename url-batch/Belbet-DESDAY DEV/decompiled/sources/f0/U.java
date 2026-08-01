package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1992a;

    /* renamed from: b, reason: collision with root package name */
    public int f1993b;

    /* renamed from: c, reason: collision with root package name */
    public int f1994c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1995e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1996f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1997g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1998j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1999k;

    /* renamed from: l, reason: collision with root package name */
    public int f2000l;

    /* renamed from: m, reason: collision with root package name */
    public long f2001m;

    /* renamed from: n, reason: collision with root package name */
    public int f2002n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f1997g ? this.f1993b - this.f1994c : this.f1995e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1992a + ", mData=null, mItemCount=" + this.f1995e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1993b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1994c + ", mStructureChanged=" + this.f1996f + ", mInPreLayout=" + this.f1997g + ", mRunSimpleAnimations=" + this.f1998j + ", mRunPredictiveAnimations=" + this.f1999k + '}';
    }
}
