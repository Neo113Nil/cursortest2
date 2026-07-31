package L;

import android.app.ActivityManager;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ ActivityManager.TaskDescription c(String str, int i2) {
        return new ActivityManager.TaskDescription(str, 0, i2);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder k(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout p(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
