package b2;

/* loaded from: classes2.dex */
public class b {
    public static String convertSecondsToTime(long j8) {
        if (j8 <= 0) {
            return "00:00";
        }
        int i8 = (int) j8;
        int i9 = i8 / 60;
        if (i9 < 60) {
            return unitFormat(i9) + ":" + unitFormat(i8 % 60);
        }
        int i10 = i9 / 60;
        if (i10 > 99) {
            return "99:59:59";
        }
        return unitFormat(i10) + ":" + unitFormat(i9 % 60) + ":" + unitFormat((int) ((j8 - (i10 * 3600)) - (r1 * 60)));
    }

    private static String unitFormat(int i8) {
        if (i8 < 0 || i8 >= 10) {
            return "" + i8;
        }
        return "0" + i8;
    }
}
