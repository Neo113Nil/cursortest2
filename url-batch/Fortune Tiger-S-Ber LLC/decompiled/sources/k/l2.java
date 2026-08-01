package k;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2590a;

    /* renamed from: b, reason: collision with root package name */
    public int f2591b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f2592d;

    /* renamed from: e, reason: collision with root package name */
    public int f2593e;

    /* renamed from: f, reason: collision with root package name */
    public int f2594f;
    public boolean g;
    public boolean h;

    public final void a(int i4, int i5) {
        this.c = i4;
        this.f2592d = i5;
        this.h = true;
        if (this.g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f2590a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f2591b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f2590a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f2591b = i5;
        }
    }
}
