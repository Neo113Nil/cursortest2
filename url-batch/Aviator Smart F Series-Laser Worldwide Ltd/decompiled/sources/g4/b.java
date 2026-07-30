package g4;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16669a = 161;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16670b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16671c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16672d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16673e = 10;

    private b() {
    }

    public static int a(int i8, int i9) {
        if (i9 < 161) {
            if (i8 != 130) {
                if (i8 != 131) {
                    return i8;
                }
                return 3;
            }
        } else {
            if (i8 == 4) {
                return 8;
            }
            if (i8 != 5) {
                if (i8 == 8) {
                    return 10;
                }
                if (i8 == 130) {
                    return 4;
                }
                if (i8 != 131) {
                    return i8;
                }
                return 5;
            }
        }
        return 2;
    }
}
