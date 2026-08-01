package b1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public int f839a;

    /* renamed from: b, reason: collision with root package name */
    public int f840b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f841d;

    /* renamed from: e, reason: collision with root package name */
    public int f842e;

    public final boolean a() {
        int i4 = this.f839a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f841d;
            int i7 = this.f840b;
            if (((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.f841d;
            int i9 = this.c;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f842e;
            int i11 = this.f840b;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f842e;
            int i13 = this.c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
