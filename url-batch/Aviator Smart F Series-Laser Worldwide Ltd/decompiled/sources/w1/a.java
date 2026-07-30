package w1;

import androidx.annotation.NonNull;
import com.crrepa.band.my.model.band.ScreenSize;

/* loaded from: classes2.dex */
public class a {
    private static final int BAND_ICON_SIZE = 280;
    private static final String IMAGEVIEW_MODE = "?imageView2/1";
    private static final String IMAGE_HEIGHT = "/h/";
    private static final String IMAGE_WIDTH = "/w/";

    private a() {
    }

    @NonNull
    private static String formatBandImageUrl(String str, int i8, int i9) {
        return str + IMAGEVIEW_MODE + IMAGE_WIDTH + i8 + IMAGE_HEIGHT + i9;
    }

    public static String getIconUrl(String str) {
        return formatBandImageUrl(str, 280, 280);
    }

    public static String getWatchFaceUrl(String str, ScreenSize screenSize) {
        return screenSize == null ? str : formatBandImageUrl(str, screenSize.getWidth(), screenSize.getHeight());
    }
}
