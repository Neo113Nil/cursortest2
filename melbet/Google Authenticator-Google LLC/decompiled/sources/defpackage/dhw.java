package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhw {
    public static final int[] a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};

    static int a(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            i2 = i3 + 1;
            if (i >= a[i3]) {
                break;
            }
            i3 = i2;
        }
        return i2;
    }
}
