package w1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.moyoung.dafit.module.common.utils.e0;
import java.io.File;

/* loaded from: classes2.dex */
public class j {
    public static final int DEFAULT_THUM_WATCH_FACE_HEIGHT = 140;
    public static final String DEFAULT_WATCH_FACE_BG_MD5 = "00000000000000000000000000000000";
    public static final int DEFAULT_WATCH_FACE_HEIGHT = 240;
    public static final int DEFAULT_WATCH_FACE_WIDTH = 240;
    public static final int WATCH_FACE_CONTENT_CLOSE = 0;
    public static final int WATCH_FACE_CONTENT_DATE = 1;
    public static final int WATCH_FACE_CONTENT_HEART_RATE = 3;
    public static final int WATCH_FACE_CONTENT_SLEEP = 2;
    public static final int WATCH_FACE_CONTENT_STEP = 4;
    public static final int WATCH_FACE_TEXT_BLACK_COLOR = 1;
    public static final int WATCH_FACE_TEXT_BLUE_COLOR = 6;
    public static final int[] WATCH_FACE_TEXT_COLOR_RGB565 = {65535, 0, 65219, 64585, 63488, 64988, 31, 15443, 2016};
    private static final int WATCH_FACE_TEXT_COLOR_SIZE = 9;
    public static final int WATCH_FACE_TEXT_GREEN_COLOR = 8;
    public static final int WATCH_FACE_TEXT_INDIGO_COLOR = 7;
    public static final int WATCH_FACE_TEXT_ORANGE_COLOR = 3;
    public static final int WATCH_FACE_TEXT_PURPLE_COLOR = 5;
    public static final int WATCH_FACE_TEXT_RED_COLOR = 4;
    public static final int WATCH_FACE_TEXT_WHITE_COLOR = 0;
    public static final int WATCH_FACE_TEXT_YELLOW_COLOR = 2;
    public static final int WATCH_FACE_TIME_BOTTOM = 1;
    public static final int WATCH_FACE_TIME_CUSTOM = 2;
    public static final int WATCH_FACE_TIME_TOP = 0;

    private j() {
    }

    @ColorInt
    private static int getColorInt(@ColorRes int i8) {
        int color = ContextCompat.getColor(com.moyoung.dafit.module.common.utils.d.get(), i8);
        return com.crrepa.band.my.ble.band.utils.a.getInstance().hasARGB() ? color : e0.rgb565(color);
    }

    public static WatchFace getDefaultWatchFace(String str, int i8) {
        com.orhanobut.logger.f.d("getDefaultWatchFace");
        WatchFace watchFace = new WatchFace();
        watchFace.setBroadcastName(str);
        watchFace.setIndex(Integer.valueOf(i8));
        watchFace.setTimeTopContent(0);
        watchFace.setTimeBottomComtent(1);
        watchFace.setTimePosition(0);
        watchFace.setTextColor(0);
        watchFace.setMd5("00000000000000000000000000000000");
        watchFace.setHeight(240);
        watchFace.setWidth(240);
        return watchFace;
    }

    public static int getWatchFaceContentResources(int i8) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isBluetrum() || com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            if (i8 == 1) {
                return R.drawable.watch_face_new_label_date;
            }
            if (i8 == 2) {
                return R.drawable.watch_face_new_label_sleep;
            }
            if (i8 == 3) {
                return R.drawable.watch_face_new_label_hr;
            }
            if (i8 != 4) {
                return -1;
            }
            return R.drawable.watch_face_new_label_steps;
        }
        if (i8 == 1) {
            return R.drawable.watch_face_date_vector;
        }
        if (i8 == 2) {
            return R.drawable.watch_face_sleep_vector;
        }
        if (i8 == 3) {
            return R.drawable.watch_face_hr_vector;
        }
        if (i8 != 4) {
            return -1;
        }
        return R.drawable.watch_face_steps_vector;
    }

    public static int getWatchFaceDateResources() {
        return (com.crrepa.band.my.ble.band.utils.a.getInstance().isBluetrum() || com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) ? R.drawable.watch_face_new_label_date : R.drawable.watch_face_date_vector;
    }

    public static File getWatchFaceFile(int i8, String str) {
        File customizeWatchFaceFile = com.crrepa.band.my.ble.band.utils.a.getInstance().getCustomizeWatchFaceFile(i8);
        return (!(customizeWatchFaceFile != null && customizeWatchFaceFile.exists()) || TextUtils.equals(str, "00000000000000000000000000000000")) ? com.crrepa.band.my.ble.band.utils.a.getInstance().getBandWatchFaceFile(i8) : customizeWatchFaceFile;
    }

    public static String getWatchFaceNewTimePosition(Context context, int i8) {
        return context.getResources().getStringArray(R.array.watch_face_new_position_array)[i8];
    }

    @SuppressLint({"NonConstantResourceId"})
    public static int getWatchFaceTextARGBColorIndex(int i8) {
        int[] watchFaceTextColorIntArray = getWatchFaceTextColorIntArray();
        for (int i9 = 0; i9 < watchFaceTextColorIntArray.length; i9++) {
            if (i8 == watchFaceTextColorIntArray[i9]) {
                return i9;
            }
        }
        return 0;
    }

    @SuppressLint({"NonConstantResourceId"})
    public static int getWatchFaceTextColorIndex(int i8) {
        int[] watchFaceTextColorIntArray = getWatchFaceTextColorIntArray();
        for (int i9 = 0; i9 < watchFaceTextColorIntArray.length; i9++) {
            if (i8 == watchFaceTextColorIntArray[i9]) {
                return i9;
            }
        }
        return 0;
    }

    @ColorInt
    public static int getWatchFaceTextColorInt(int i8) {
        return ContextCompat.getColor(com.moyoung.dafit.module.common.utils.d.get(), getWatchFaceTextColorRes(i8));
    }

    public static int[] getWatchFaceTextColorIntArray() {
        return new int[]{getColorInt(R.color.white), getColorInt(R.color.black), getColorInt(R.color.color_watch_face_text_yellow), getColorInt(R.color.color_watch_face_text_orange), getColorInt(R.color.color_watch_face_text_red), getColorInt(R.color.color_watch_face_text_purple), getColorInt(R.color.color_watch_face_text_blue), getColorInt(R.color.color_watch_face_text_indigo), getColorInt(R.color.color_watch_face_text_green)};
    }

    @ColorRes
    private static int getWatchFaceTextColorRes(int i8) {
        switch (i8) {
            case 1:
                return R.color.black;
            case 2:
                return R.color.color_watch_face_text_yellow;
            case 3:
                return R.color.color_watch_face_text_orange;
            case 4:
                return R.color.color_watch_face_text_red;
            case 5:
                return R.color.color_watch_face_text_purple;
            case 6:
                return R.color.color_watch_face_text_blue;
            case 7:
                return R.color.color_watch_face_text_indigo;
            case 8:
                return R.color.color_watch_face_text_green;
            default:
                return R.color.white;
        }
    }

    public static String getWatchFaceTimeContent(Context context, int i8) {
        String[] stringArray = context.getResources().getStringArray(R.array.watch_face_content_array);
        return stringArray[i8 % stringArray.length];
    }

    public static String getWatchFaceTimePosition(Context context, int i8) {
        String[] stringArray = context.getResources().getStringArray(R.array.watch_face_position_array);
        return stringArray[i8 % stringArray.length];
    }

    public static int getWatchFaceTimeResources() {
        return (com.crrepa.band.my.ble.band.utils.a.getInstance().isBluetrum() || com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) ? R.drawable.watch_face_new_label_time : R.drawable.watch_face_time_vector;
    }

    public static CRPWatchFaceLayoutInfo toCRPWatchFaceLayoutInfo(WatchFace watchFace) {
        if (watchFace == null) {
            return null;
        }
        CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo = new CRPWatchFaceLayoutInfo();
        cRPWatchFaceLayoutInfo.setTimePosition(watchFace.getTimePosition().intValue());
        cRPWatchFaceLayoutInfo.setTimeTopContent(watchFace.getTimeTopContent().intValue());
        cRPWatchFaceLayoutInfo.setTimeBottomContent(watchFace.getTimeBottomComtent().intValue());
        cRPWatchFaceLayoutInfo.setTextColor(getWatchFaceTextColorInt(watchFace.getTextColor().intValue()));
        cRPWatchFaceLayoutInfo.setBackgroundPictureMd5(watchFace.getMd5());
        return cRPWatchFaceLayoutInfo;
    }

    public static WatchFace toWatchFace(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        WatchFace watchFace = new WatchFace();
        watchFace.setMd5(cRPWatchFaceLayoutInfo.getBackgroundPictureMd5());
        watchFace.setTimePosition(Integer.valueOf(cRPWatchFaceLayoutInfo.getTimePosition()));
        watchFace.setTimeTopContent(Integer.valueOf(cRPWatchFaceLayoutInfo.getTimeTopContent()));
        watchFace.setTimeBottomComtent(Integer.valueOf(cRPWatchFaceLayoutInfo.getTimeBottomContent()));
        int height = cRPWatchFaceLayoutInfo.getHeight();
        int width = cRPWatchFaceLayoutInfo.getWidth();
        if (height == 0 || width == 0) {
            height = 240;
            width = 240;
        }
        watchFace.setHeight(Integer.valueOf(height));
        watchFace.setWidth(Integer.valueOf(width));
        watchFace.setThumHeight(Integer.valueOf(cRPWatchFaceLayoutInfo.getThumHeight()));
        watchFace.setThumWidth(Integer.valueOf(cRPWatchFaceLayoutInfo.getThumWidth()));
        watchFace.setCompressionType(Integer.valueOf(cRPWatchFaceLayoutInfo.getCompressionType().value()));
        int[] watchFaceTextColorIntArray = getWatchFaceTextColorIntArray();
        int textColor = cRPWatchFaceLayoutInfo.getTextColor();
        int i8 = 0;
        while (true) {
            if (i8 >= watchFaceTextColorIntArray.length) {
                i8 = 0;
                break;
            }
            if (textColor == watchFaceTextColorIntArray[i8]) {
                break;
            }
            i8++;
        }
        com.orhanobut.logger.f.d("toWatchFace textColor:%s colorIndex:%s", Integer.valueOf(textColor), Integer.valueOf(i8));
        watchFace.setTextColor(Integer.valueOf(i8));
        return watchFace;
    }
}
