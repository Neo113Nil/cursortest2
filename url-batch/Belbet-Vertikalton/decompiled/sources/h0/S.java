package h0;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f2940a;

    /* renamed from: b, reason: collision with root package name */
    public int f2941b;

    /* renamed from: c, reason: collision with root package name */
    public int f2942c;

    /* renamed from: d, reason: collision with root package name */
    public int f2943d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2944f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2945g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2946h;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2947k;

    /* renamed from: l, reason: collision with root package name */
    public int f2948l;

    /* renamed from: m, reason: collision with root package name */
    public long f2949m;

    /* renamed from: n, reason: collision with root package name */
    public int f2950n;

    public final void a(int i) {
        if ((this.f2943d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2943d));
    }

    public final int b() {
        return this.f2945g ? this.f2941b - this.f2942c : this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2940a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2941b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2942c + ", mStructureChanged=" + this.f2944f + ", mInPreLayout=" + this.f2945g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f2947k + '}';
    }
}
