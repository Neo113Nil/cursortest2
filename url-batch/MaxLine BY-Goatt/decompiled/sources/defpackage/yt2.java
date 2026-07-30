package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yt2 extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public yt2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
