package w4;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7989a;

    /* renamed from: b, reason: collision with root package name */
    public int f7990b;

    /* renamed from: c, reason: collision with root package name */
    public int f7991c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7992d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7993e;

    public o(int i) {
        this.f7989a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f7990b = -1;
                this.f7991c = Integer.MIN_VALUE;
                this.f7992d = false;
                this.f7993e = false;
                break;
        }
    }

    public String toString() {
        switch (this.f7989a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f7990b + ", mCoordinate=" + this.f7991c + ", mLayoutFromEnd=" + this.f7992d + ", mValid=" + this.f7993e + '}';
            default:
                return super.toString();
        }
    }
}
