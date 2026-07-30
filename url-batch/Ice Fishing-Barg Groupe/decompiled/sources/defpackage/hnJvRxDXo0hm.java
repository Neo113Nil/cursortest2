package defpackage;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class hnJvRxDXo0hm {
    public static void OPXfSBeufaJ8(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static Icon PxuCJdSBwIXG(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void RAsUl2FVSrh6(View view) {
        view.setImportantForContentCapture(1);
    }

    public static CharSequence TSizfFm2Yiuu(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets Y1f8riQaR6yg(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void a92UlCVFR9N8(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void e9gEMXR7LXtO(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void lS5Rgt96tfkO(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static void rtx2ld2ELZv4(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
