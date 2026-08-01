package g1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1720a;

    /* renamed from: b, reason: collision with root package name */
    public int f1721b;

    /* renamed from: c, reason: collision with root package name */
    public int f1722c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1723e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1724f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1725g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1726j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1727k;

    /* renamed from: l, reason: collision with root package name */
    public int f1728l;

    /* renamed from: m, reason: collision with root package name */
    public long f1729m;

    /* renamed from: n, reason: collision with root package name */
    public int f1730n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f1725g ? this.f1721b - this.f1722c : this.f1723e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1720a + ", mData=null, mItemCount=" + this.f1723e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1721b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1722c + ", mStructureChanged=" + this.f1724f + ", mInPreLayout=" + this.f1725g + ", mRunSimpleAnimations=" + this.f1726j + ", mRunPredictiveAnimations=" + this.f1727k + '}';
    }
}
