package b1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public int f956a;

    /* renamed from: b, reason: collision with root package name */
    public int f957b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f958d;

    /* renamed from: e, reason: collision with root package name */
    public int f959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f960f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f961i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f962j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f963k;

    /* renamed from: l, reason: collision with root package name */
    public int f964l;

    /* renamed from: m, reason: collision with root package name */
    public long f965m;

    /* renamed from: n, reason: collision with root package name */
    public int f966n;

    public final void a(int i4) {
        if ((this.f958d & i4) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f958d));
    }

    public final int b() {
        return this.g ? this.f957b - this.c : this.f959e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f956a + ", mData=null, mItemCount=" + this.f959e + ", mIsMeasuring=" + this.f961i + ", mPreviousLayoutItemCount=" + this.f957b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f960f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.f962j + ", mRunPredictiveAnimations=" + this.f963k + '}';
    }
}
