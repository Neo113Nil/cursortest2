package I2;

/* loaded from: classes3.dex */
abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final long f791a = Runtime.getRuntime().maxMemory();

    static int a(int i4) {
        int i5 = 1;
        if (i4 > 127) {
            int i6 = 1;
            while (true) {
                i4 >>>= 8;
                if (i4 == 0) {
                    break;
                }
                i6++;
            }
            for (int i7 = (i6 - 1) * 8; i7 >= 0; i7 -= 8) {
                i5++;
            }
        }
        return i5;
    }
}
