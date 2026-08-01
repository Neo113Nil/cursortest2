package m;

import android.widget.TextView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class w {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i3, int i10, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i10, i11, i12);
    }

    public static void c(TextView textView, int[] iArr, int i3) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
