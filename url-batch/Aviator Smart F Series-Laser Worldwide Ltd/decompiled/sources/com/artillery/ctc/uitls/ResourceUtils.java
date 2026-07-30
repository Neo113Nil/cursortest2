package com.artillery.ctc.uitls;

import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import androidx.annotation.RawRes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;
import y.d;

@Keep
/* loaded from: classes.dex */
public final class ResourceUtils {
    private static final int BUFFER_SIZE = 8192;

    private ResourceUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean copyFileFromAssets(String str, String str2) {
        try {
            String[] list = d.a().getAssets().list(str);
            if (list == null || list.length <= 0) {
                return FileIOUtils.writeFileFromIS(str2, d.a().getAssets().open(str));
            }
            boolean z7 = true;
            for (String str3 : list) {
                z7 &= copyFileFromAssets(str + "/" + str3, str2 + "/" + str3);
            }
            return z7;
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean copyFileFromRaw(@RawRes int i8, String str) {
        return FileIOUtils.writeFileFromIS(str, d.a().getResources().openRawResource(i8));
    }

    public static int getAnimIdByName(String str) {
        return d.a().getResources().getIdentifier(str, "anim", d.a().getPackageName());
    }

    public static int getColorIdByName(String str) {
        return d.a().getResources().getIdentifier(str, "color", d.a().getPackageName());
    }

    public static int getDimenIdByName(String str) {
        return d.a().getResources().getIdentifier(str, "dimen", d.a().getPackageName());
    }

    public static Drawable getDrawable(@DrawableRes int i8) {
        return ContextCompat.getDrawable(d.a(), i8);
    }

    public static int getDrawableIdByName(String str) {
        return d.a().getResources().getIdentifier(str, "drawable", d.a().getPackageName());
    }

    public static int getIdByName(String str) {
        return d.a().getResources().getIdentifier(str, "id", d.a().getPackageName());
    }

    public static int getLayoutIdByName(String str) {
        return d.a().getResources().getIdentifier(str, TtmlNode.TAG_LAYOUT, d.a().getPackageName());
    }

    public static int getMenuIdByName(String str) {
        return d.a().getResources().getIdentifier(str, "menu", d.a().getPackageName());
    }

    public static int getMipmapIdByName(String str) {
        return d.a().getResources().getIdentifier(str, "mipmap", d.a().getPackageName());
    }

    public static int getStringIdByName(String str) {
        return d.a().getResources().getIdentifier(str, TypedValues.Custom.S_STRING, d.a().getPackageName());
    }

    public static int getStyleIdByName(String str) {
        return d.a().getResources().getIdentifier(str, TtmlNode.TAG_STYLE, d.a().getPackageName());
    }

    public static List<String> readAssets2List(String str) {
        return readAssets2List(str, "");
    }

    public static String readAssets2String(String str) {
        return readAssets2String(str, null);
    }

    public static List<String> readRaw2List(@RawRes int i8) {
        return readRaw2List(i8, "");
    }

    public static String readRaw2String(@RawRes int i8) {
        return readRaw2String(i8, null);
    }

    public static List<String> readAssets2List(String str, String str2) {
        try {
            return ConvertUtils.inputStream2Lines(d.a().getResources().getAssets().open(str), str2);
        } catch (IOException e8) {
            e8.printStackTrace();
            return Collections.emptyList();
        }
    }

    public static String readAssets2String(String str, String str2) {
        try {
            byte[] inputStream2Bytes = ConvertUtils.inputStream2Bytes(d.a().getAssets().open(str));
            if (inputStream2Bytes == null) {
                return "";
            }
            if (StringUtils.isSpace(str2)) {
                return new String(inputStream2Bytes);
            }
            try {
                return new String(inputStream2Bytes, str2);
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
                return "";
            }
        } catch (IOException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public static List<String> readRaw2List(@RawRes int i8, String str) {
        return ConvertUtils.inputStream2Lines(d.a().getResources().openRawResource(i8), str);
    }

    public static String readRaw2String(@RawRes int i8, String str) {
        byte[] inputStream2Bytes = ConvertUtils.inputStream2Bytes(d.a().getResources().openRawResource(i8));
        if (inputStream2Bytes == null) {
            return null;
        }
        if (StringUtils.isSpace(str)) {
            return new String(inputStream2Bytes);
        }
        try {
            return new String(inputStream2Bytes, str);
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return "";
        }
    }
}
