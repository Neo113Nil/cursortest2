package com.crrepa.band.my.training.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.training.map.BaseMapTrainingActivity;
import com.moyoung.dafit.module.common.utils.s;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class e {
    public static double calculateElevation(List<Double> list) {
        int size = list.size();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        if (size < 2) {
            return com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        }
        double doubleValue = list.get(0).doubleValue();
        int i8 = 1;
        while (i8 < list.size() - 1) {
            double doubleValue2 = list.get(i8 - 1).doubleValue();
            double doubleValue3 = list.get(i8).doubleValue();
            int i9 = i8 + 1;
            double doubleValue4 = list.get(i9).doubleValue();
            if (doubleValue2 >= doubleValue3) {
                if (i8 == list.size() - 2 && doubleValue3 < doubleValue4) {
                    d8 += doubleValue4 - doubleValue3;
                }
                doubleValue = doubleValue3;
            } else if (doubleValue3 >= doubleValue4) {
                d8 += doubleValue3 - doubleValue;
            } else if (i8 == list.size() - 2) {
                d8 += doubleValue4 - doubleValue;
            }
            i8 = i9;
        }
        return d8;
    }

    public static String calculatePace(int i8, Date date, Date date2) {
        int i9;
        int i10;
        double d8 = i8 / 1000.0d;
        if (BandUnitSystemProvider.isImperialSystem()) {
            d8 *= 0.6200000047683716d;
        }
        if (d8 > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            double time = ((date2.getTime() - date.getTime()) / 1000) / d8;
            i9 = (int) (time / 60.0d);
            i10 = (int) (time % 60.0d);
        } else {
            i9 = 0;
            i10 = 0;
        }
        return formatPace(i9, i10);
    }

    @NonNull
    public static String formatPace(int i8) {
        int i9 = i8 / 60;
        return i9 > 59 ? BaseMapTrainingActivity.DEFAULT_PACE : com.moyoung.dafit.module.common.utils.d.get().getString(R.string.pace_format, com.moyoung.dafit.module.common.utils.n.format(i9, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN), com.moyoung.dafit.module.common.utils.n.format(i8 % 60, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN));
    }

    public static List<TrainingLocation> getTrainingPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return s.json2List(sb.toString(), TrainingLocation[].class);
                }
                sb.append(readLine);
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static String getTrainingTimeStr(Context context, int i8) {
        int i9 = i8 / 60;
        return context.getString(R.string.training_time_format, com.moyoung.dafit.module.common.utils.n.format(i9 / 60, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN), com.moyoung.dafit.module.common.utils.n.format(i9 % 60, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN), com.moyoung.dafit.module.common.utils.n.format(i8 % 60, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN));
    }

    public static boolean isGpsCycling(int i8) {
        return i8 == 32;
    }

    @NonNull
    public static String formatPace(int i8, int i9) {
        return com.moyoung.dafit.module.common.utils.d.get().getString(R.string.pace_format, com.moyoung.dafit.module.common.utils.n.format(i8, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN), com.moyoung.dafit.module.common.utils.n.format(i9, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN));
    }
}
