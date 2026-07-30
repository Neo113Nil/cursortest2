package com.crrepa.band.my.model.band.provider;

import android.text.TextUtils;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class BandPresetWatchFaceProvider {
    public static final int[] DEFAULT_WATCH_FACE_LIST = {R.drawable.img_watchface_edit_preset_01, R.drawable.img_watchface_edit_preset_02, R.drawable.img_watchface_edit_preset_03, R.drawable.img_watchface_edit_preset_04, R.drawable.img_watchface_edit_preset_05};
    private static final String[] PRESET_WATCH_FACE_MD5 = {"c8a379bec663c5909ab19d4f352599b2", "7cbeb50524b7106be549a92d42404978", "e3a0c9dec31e3dea166e0627c1339786", "5928191e2cbb420fb00faf36fec84ea3", "e3bfa5d5a8d5f026188dd85ee0b91774"};
    public static final int PRESET_WATCH_FACE_NULL = -1;

    private BandPresetWatchFaceProvider() {
    }

    public static int getPresetWatchFaceIndex(String str) {
        int i8 = 0;
        while (true) {
            String[] strArr = PRESET_WATCH_FACE_MD5;
            if (i8 >= strArr.length) {
                return -1;
            }
            if (TextUtils.equals(str, strArr[i8])) {
                return i8;
            }
            i8++;
        }
    }

    public static String getPresetWatchFaceMd5(int i8) {
        return PRESET_WATCH_FACE_MD5[i8];
    }

    public static boolean isDefault(String str) {
        return TextUtils.equals(str, "00000000000000000000000000000000");
    }

    public static boolean isDressWatchFace(int i8) {
        return i8 == 4;
    }

    public static boolean isGalleryWatchface(int i8) {
        return i8 == 3;
    }

    public static boolean isPreset(String str) {
        return getPresetWatchFaceIndex(str) != -1;
    }
}
