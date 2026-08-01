package defpackage;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class x {
    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean s(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
