package com.crrepa.band.my.training.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.moyoung.dafit.module.common.utils.t;
import com.moyoung.dafit.module.common.utils.u;
import java.util.Date;

/* loaded from: classes3.dex */
public class q {
    private static final String ENDURE = "ENDURE";

    private q() {
    }

    public static String getGomoreTrainingName(int i8) {
        if (i8 < 0) {
            return HttpClient.ENDFLAG;
        }
        Resources resources = com.moyoung.dafit.module.common.utils.d.get().getResources();
        if (i8 == 131) {
            return resources.getString(R.string.training_names_climbing);
        }
        if (i8 == GpsTrainingModel.GpsTrainingType.WALKING.getValue()) {
            return resources.getString(R.string.training_names_walking);
        }
        if (i8 == GpsTrainingModel.GpsTrainingType.RUNNING.getValue()) {
            return resources.getString(R.string.training_names_running);
        }
        if (i8 == GpsTrainingModel.GpsTrainingType.CYCLING.getValue()) {
            return resources.getString(R.string.training_names_bicycle);
        }
        if (i8 == GpsTrainingModel.GpsTrainingType.TRAIL_RUNNING.getValue()) {
            return resources.getString(R.string.trail_running);
        }
        if (i8 == GpsTrainingModel.GpsTrainingType.ON_FOOT.getValue()) {
            return resources.getString(R.string.on_foot);
        }
        return null;
    }

    public static Drawable getHomeTrainingIcon(Context context, int i8) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.home_training_icons);
        if (obtainTypedArray.length() <= i8) {
            return null;
        }
        return obtainTypedArray.getDrawable(i8);
    }

    public static Drawable getTrainingIcon(Context context, int i8) {
        if (i8 == 131) {
            return context.getResources().getDrawable(R$drawable.ic_training_gps_climbing);
        }
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.training_icons);
        if (i8 < 0 || obtainTypedArray.length() <= i8) {
            return null;
        }
        return obtainTypedArray.getDrawable(i8);
    }

    public static int getTrainingIconId(Context context, int i8) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.training_icons);
        if (obtainTypedArray.length() <= i8) {
            return 0;
        }
        return obtainTypedArray.getResourceId(i8, 0);
    }

    public static String getTrainingName(Context context, int i8) {
        if (i8 == 131) {
            return "GPS" + context.getString(R.string.training_names_climbing);
        }
        if (i8 == 0 && TextUtils.equals(com.crrepa.band.my.ble.band.utils.a.getInstance().getName(), ENDURE) && u.isSimplified()) {
            return context.getString(R.string.walking);
        }
        String[] stringArray = context.getResources().getStringArray(R.array.training_names);
        if (i8 < 0 || stringArray.length <= i8) {
            return null;
        }
        return stringArray[i8];
    }

    public static String getTrainingNameByTrack(Context context, int i8) {
        if (i8 == 0 && TextUtils.equals(com.crrepa.band.my.ble.band.utils.a.getInstance().getName(), ENDURE) && u.isSimplified()) {
            return t.getStringByLocal(context, R.string.walking, "zh");
        }
        String[] stringArrayByLocal = t.getStringArrayByLocal(context, R.array.training_names, "zh");
        if (stringArrayByLocal.length <= i8) {
            return null;
        }
        return stringArrayByLocal[i8];
    }

    public static String getTrainingTime(Context context, Date date) {
        String string = context.getString(R.string.gps_training_time_format_24);
        if (BandTimeSystemProvider.is12HourTime()) {
            string = context.getString(R.string.gps_training_time_format_12);
        }
        return com.moyoung.dafit.module.common.utils.m.format(date, string);
    }
}
