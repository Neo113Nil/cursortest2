package v0;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class b {
    public static final int FRIDAY = 5;
    public static final int MONDAY = 1;
    private static final int NON_REPEATING = 0;
    private static final int REPEAT_EVERYDAY = 127;
    private static final int REPEAT_WEEKDAY = 62;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 0;
    public static final int THURSDAY = 4;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;

    private b() {
    }

    private static String[] getWeekNameArray(Context context) {
        return new String[]{context.getString(R.string.sunday), context.getString(R.string.monday), context.getString(R.string.tuesday), context.getString(R.string.wednesday), context.getString(R.string.thursday), context.getString(R.string.friday), context.getString(R.string.saturday)};
    }

    public static boolean[] toRepeatArray(int i8) {
        boolean[] zArr = new boolean[7];
        String stringBuffer = new StringBuffer(Integer.toBinaryString(i8)).reverse().toString();
        int i9 = 0;
        while (i9 < stringBuffer.length()) {
            int i10 = i9 + 1;
            if (Integer.parseInt(stringBuffer.substring(i9, i10)) == 1) {
                zArr[i9] = true;
            }
            i9 = i10;
        }
        return zArr;
    }

    public static String toRepeatMessage(Context context, int i8) {
        if (i8 == 0) {
            return context.getString(R.string.once);
        }
        if (i8 == 62) {
            return context.getString(R.string.weekday);
        }
        if (i8 == 127) {
            return context.getString(R.string.everyday);
        }
        String[] weekNameArray = getWeekNameArray(context);
        String stringBuffer = new StringBuffer(Integer.toBinaryString(i8)).reverse().toString();
        f.d("repeatArray: " + stringBuffer);
        String string = context.getString(R.string.ton);
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        while (i9 < stringBuffer.length()) {
            try {
                int i10 = i9 + 1;
                if (Integer.parseInt(stringBuffer.substring(i9, i10)) == 1) {
                    sb.append(string);
                    sb.append(weekNameArray[i9]);
                }
                i9 = i10;
            } catch (Exception e8) {
                e8.printStackTrace();
                return null;
            }
        }
        return sb.substring(1);
    }

    public static int toRepeatNumber(boolean[] zArr) {
        if (zArr == null || zArr.length != 7) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < zArr.length; i9++) {
            if (zArr[i9]) {
                i8 = (int) (i8 + Math.pow(2.0d, i9));
            }
        }
        return i8;
    }
}
