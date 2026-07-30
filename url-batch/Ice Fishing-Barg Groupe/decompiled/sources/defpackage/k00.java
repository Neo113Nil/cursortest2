package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class k00 {
    public static int OPXfSBeufaJ8(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Handler PxuCJdSBwIXG(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static int RAsUl2FVSrh6(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int TSizfFm2Yiuu(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String Y1f8riQaR6yg(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int a92UlCVFR9N8(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static void dgRBjINgWbAK(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static int e9gEMXR7LXtO(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static List lS5Rgt96tfkO(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int rtx2ld2ELZv4(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static Uri wdg6QnbFHrFF(Object obj) {
        return ((Icon) obj).getUri();
    }
}
