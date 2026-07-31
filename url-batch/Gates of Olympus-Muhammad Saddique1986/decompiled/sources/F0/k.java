package F0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1948a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1949b;

    public k(boolean z3, boolean z4) {
        this.f1948a = z3;
        this.f1949b = z4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f1948a);
        textPaint.setStrikeThruText(this.f1949b);
    }
}
