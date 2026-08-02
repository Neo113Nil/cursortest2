package u0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f15467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15469c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15470d;

    public h(int i4, int i5, int i6, int i7) {
        this.f15467a = i4;
        this.f15468b = i5;
        this.f15469c = i6;
        this.f15470d = i7;
    }

    public final boolean a(int i4) {
        if (i4 == 1) {
            if (this.f15467a - this.f15468b <= 1) {
                return false;
            }
        } else if (this.f15469c - this.f15470d <= 1) {
            return false;
        }
        return true;
    }
}
