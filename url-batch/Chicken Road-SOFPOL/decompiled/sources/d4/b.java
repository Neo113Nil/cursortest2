package d4;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean v(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
