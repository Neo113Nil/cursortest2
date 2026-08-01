package f1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1536a;

    /* renamed from: b, reason: collision with root package name */
    public int f1537b;

    /* renamed from: c, reason: collision with root package name */
    public int f1538c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1539e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1540f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1541g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1542h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1543j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1544k;

    /* renamed from: l, reason: collision with root package name */
    public int f1545l;

    /* renamed from: m, reason: collision with root package name */
    public long f1546m;

    /* renamed from: n, reason: collision with root package name */
    public int f1547n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f1541g ? this.f1537b - this.f1538c : this.f1539e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1536a + ", mData=null, mItemCount=" + this.f1539e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1537b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1538c + ", mStructureChanged=" + this.f1540f + ", mInPreLayout=" + this.f1541g + ", mRunSimpleAnimations=" + this.f1543j + ", mRunPredictiveAnimations=" + this.f1544k + '}';
    }
}
