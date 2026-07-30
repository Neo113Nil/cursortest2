package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.location.BDLocation;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a {
    public static final int COLOR_NONE = 1122867;
    public static final int COLOR_SKIP = 1122868;
    public static final int[] LIBERTY_COLORS = {Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(GattError.GATT_PENDING, com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)};
    public static final int[] JOYFUL_COLORS = {Color.rgb(217, 80, TsExtractor.TS_STREAM_TYPE_DTS), Color.rgb(GattError.GATT_PRC_IN_PROGRESS, 149, 7), Color.rgb(GattError.GATT_PRC_IN_PROGRESS, SerialTrans.MTU_MAX, 120), Color.rgb(106, BDLocation.TypeServerError, 134), Color.rgb(53, 194, FAUEnum.PR_TIMEOUT)};
    public static final int[] PASTEL_COLORS = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, BDLocation.TypeServerDecryptError), Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)};
    public static final int[] COLORFUL_COLORS = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};
    public static final int[] VORDIPLOM_COLORS = {Color.rgb(PsExtractor.AUDIO_STREAM, 255, 140), Color.rgb(255, SerialTrans.MTU_MAX, 140), Color.rgb(255, FAUEnum.PR_ANIMATE_FAILED, 140), Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)};
    public static final int[] MATERIAL_COLORS = {rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")};

    public static int colorWithAlpha(int i8, int i9) {
        return (i8 & ViewCompat.MEASURED_SIZE_MASK) | ((i9 & 255) << 24);
    }

    public static List<Integer> createColors(Resources resources, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            arrayList.add(Integer.valueOf(resources.getColor(i8)));
        }
        return arrayList;
    }

    public static int getHoloBlue() {
        return Color.rgb(51, 181, 229);
    }

    public static int rgb(String str) {
        int parseLong = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, parseLong & 255);
    }

    public static List<Integer> createColors(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }
}
