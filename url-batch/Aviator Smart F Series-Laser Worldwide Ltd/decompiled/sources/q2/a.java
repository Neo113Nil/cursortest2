package q2;

import android.content.Context;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.n;

/* loaded from: classes2.dex */
public class a {
    private static final int HOUR_MINUTE_NUMBER = 60;

    private a() {
    }

    private static String formatAnalysisTime(Context context, int i8) {
        StringBuilder sb = new StringBuilder();
        if (i8 < 60) {
            String string = context.getString(R.string.minute_unit);
            sb.append(i8);
            sb.append(string);
            return sb.toString();
        }
        String string2 = context.getString(R.string.hour);
        String string3 = context.getString(R.string.minute);
        int i9 = i8 / 60;
        int i10 = i8 % 60;
        sb.append(i9);
        sb.append(string2);
        if (i10 > 0) {
            sb.append(i10);
            sb.append(string3);
        }
        return sb.toString();
    }

    public static int getHeartRateAnalysisData(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static String getTrainingTime(Context context, int i8) {
        int i9;
        int i10;
        int i11;
        if (i8 > 0) {
            int i12 = i8 / 60;
            i11 = i12 / 60;
            i10 = i12 % 60;
            i9 = i8 % 60;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        return context.getString(R.string.training_time_format, n.format(i11, n.TWO_INTEGERS_PATTERN), n.format(i10, n.TWO_INTEGERS_PATTERN), n.format(i9, n.TWO_INTEGERS_PATTERN));
    }

    public static void setAnalysisTime(Context context, TextView textView, int i8) {
        textView.setText(formatAnalysisTime(context, i8));
    }
}
