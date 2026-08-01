package androidx.activity;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean s(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
