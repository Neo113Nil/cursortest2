package w2;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.haibin.calendarview.Calendar;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class a {
    public static final int TEXT_BIG_SIZE = 22;
    public static final int TEXT_NORMAL_SIZE = 14;

    public static int getImageId(Context context, Calendar calendar) {
        Resources resources = context.getResources();
        return calendar.getSchemeColor() == resources.getColor(R.color.color_menstruation) ? R.drawable.physiological_period : calendar.getSchemeColor() == resources.getColor(R.color.color_prediction_menstruation) ? R.drawable.physiological_prediction : calendar.getSchemeColor() == resources.getColor(R.color.color_physiological_ovulation) ? R.drawable.physiological_ovulation : calendar.getSchemeColor() == resources.getColor(R.color.color_physiological_fertile) ? R.drawable.physiological_fertile : R.drawable.shape_period_blank;
    }

    public static int getSelectedColor(Context context, Calendar calendar) {
        int color = ContextCompat.getColor(context, R.color.color_menstruation);
        Resources resources = context.getResources();
        return calendar.getSchemeColor() == resources.getColor(R.color.color_physiological_ovulation) ? ContextCompat.getColor(context, R.color.color_physiological_ovulation) : calendar.getSchemeColor() == resources.getColor(R.color.color_physiological_fertile) ? ContextCompat.getColor(context, R.color.color_physiological_fertile) : color;
    }

    public static SpannableString getSpecifyString(int i8, String str) {
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        int i9 = 0;
        int i10 = 0;
        while (matcher.find()) {
            i9 = matcher.start();
            i10 = matcher.end() + 1;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i8), i9, i10, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(22, true), i9, i10, 33);
        return spannableString;
    }

    public static int getTodayIndex(Date date, List<Map.Entry<String, Calendar>> list) {
        int year = m.getYear(date);
        int month = m.getMonth(date);
        int dayOfMonth = m.getDayOfMonth(date);
        int i8 = 0;
        for (Map.Entry<String, Calendar> entry : list) {
            Calendar value = entry.getValue();
            if (year == value.getYear() && month == value.getMonth() && dayOfMonth == value.getDay()) {
                i8 = list.indexOf(entry);
            }
        }
        return i8;
    }
}
