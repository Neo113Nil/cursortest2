package k;

import android.widget.TextView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class t0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i4, int i5, int i6, int i7) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
    }

    public static void c(TextView textView, int[] iArr, int i4) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
