package n;

import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class X {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i2, int i5, int i7, int i8) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i5, i7, i8);
    }

    public static void c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
