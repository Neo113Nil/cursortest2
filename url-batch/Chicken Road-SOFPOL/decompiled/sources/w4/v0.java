package w4;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8050a;

    /* renamed from: b, reason: collision with root package name */
    public int f8051b;

    /* renamed from: c, reason: collision with root package name */
    public int f8052c;

    /* renamed from: d, reason: collision with root package name */
    public int f8053d;

    /* renamed from: e, reason: collision with root package name */
    public int f8054e;

    public final boolean a() {
        int i = this.f8050a;
        int i8 = 2;
        if ((i & 7) != 0) {
            int i9 = this.f8053d;
            int i10 = this.f8051b;
            if (((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i11 = this.f8053d;
            int i12 = this.f8052c;
            if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i13 = this.f8054e;
            int i14 = this.f8051b;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i15 = this.f8054e;
            int i16 = this.f8052c;
            if (i15 > i16) {
                i8 = 1;
            } else if (i15 != i16) {
                i8 = 4;
            }
            if ((i & (i8 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
