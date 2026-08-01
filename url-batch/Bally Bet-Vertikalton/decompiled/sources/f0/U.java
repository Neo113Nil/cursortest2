package f0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1994a;

    /* renamed from: b, reason: collision with root package name */
    public int f1995b;

    /* renamed from: c, reason: collision with root package name */
    public int f1996c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1997e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1998f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1999g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2000j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2001k;

    /* renamed from: l, reason: collision with root package name */
    public int f2002l;

    /* renamed from: m, reason: collision with root package name */
    public long f2003m;

    /* renamed from: n, reason: collision with root package name */
    public int f2004n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f1999g ? this.f1995b - this.f1996c : this.f1997e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1994a + ", mData=null, mItemCount=" + this.f1997e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1995b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1996c + ", mStructureChanged=" + this.f1998f + ", mInPreLayout=" + this.f1999g + ", mRunSimpleAnimations=" + this.f2000j + ", mRunPredictiveAnimations=" + this.f2001k + '}';
    }
}
