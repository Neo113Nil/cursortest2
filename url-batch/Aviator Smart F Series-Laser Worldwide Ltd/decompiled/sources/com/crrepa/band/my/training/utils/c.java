package com.crrepa.band.my.training.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsLocation;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.moyoung.dafit.module.common.utils.s;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public class c {
    private static final int ANAEROBIC_SECONDS = 360;
    private static final String DEFAULT_PACE = "00'00''";
    private static final int MAX_SECONDS = 420;
    private static final int MEDIUM_SECONDS = 390;
    private static final int MIN_PACE = 200;
    private static final int MIN_SECONDS = 330;

    public static int calculateAveragePace(int i8, int i9) {
        double d8 = i8 / 1000.0d;
        if (BandUnitSystemProvider.isImperialSystem()) {
            d8 *= 0.6200000047683716d;
        }
        if (d8 > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return (int) (i9 / d8);
        }
        return 0;
    }

    @Nullable
    private static File creatPathFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(com.crrepa.band.my.a.getGpsTrainingDirPath());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        return file2;
    }

    @NonNull
    static String formatPace(int i8, int i9) {
        return com.moyoung.dafit.module.common.utils.n.format(i8, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN) + "'" + com.moyoung.dafit.module.common.utils.n.format(i9, com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN) + "''";
    }

    public static String getAveragePaceStr(int i8, int i9) {
        int i10;
        int i11;
        if (i8 > 0) {
            double calculateAveragePace = calculateAveragePace(i8, i9);
            i10 = (int) (calculateAveragePace / 60.0d);
            i11 = (int) (calculateAveragePace % 60.0d);
        } else {
            i10 = 0;
            i11 = 0;
        }
        return formatPace(i10, i11);
    }

    public static String getPaceStrBySeconds(int i8) {
        return formatPace(i8 / 60, i8 % 60);
    }

    public static List<GpsLocation> getRunLocationList(String str) {
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
                    return s.json2List(sb.toString(), GpsLocation[].class);
                }
                sb.append(readLine);
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static int resolvePaceToLineColor(float f8, boolean z7) {
        if (f8 == 0.0f) {
            return R.color.color_gps_finish_path_relax;
        }
        float f9 = 1000.0f / f8;
        if (z7) {
            f9 *= 1.6f;
        }
        return f9 >= 420.0f ? R.color.color_gps_finish_path_relax : (f9 >= 420.0f || f9 < 390.0f) ? (f9 >= 390.0f || f9 < 360.0f) ? (f9 >= 360.0f || f9 < 330.0f) ? R.color.color_gps_finish_path_stress : R.color.color_gps_finish_path_anaerobic : R.color.color_gps_finish_path_medium : R.color.color_gps_finish_path_marathon;
    }

    public static String speed2Pace(float f8, boolean z7) {
        if (f8 == 0.0f) {
            return DEFAULT_PACE;
        }
        float f9 = 1000.0f / f8;
        if (z7) {
            f9 *= 1.6f;
        }
        int i8 = (int) (f9 / 60.0f);
        return 200 < i8 ? DEFAULT_PACE : formatPace(i8, (int) (f9 % 60.0f));
    }

    public static File writeGpsPath(String str, String str2) {
        File file;
        try {
            file = creatPathFile(str);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                bufferedWriter.write(str2);
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e8) {
                e = e8;
                e.printStackTrace();
                return file;
            }
        } catch (IOException e9) {
            e = e9;
            file = null;
        }
        return file;
    }
}
