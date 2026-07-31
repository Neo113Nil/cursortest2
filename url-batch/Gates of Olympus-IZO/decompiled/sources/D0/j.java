package D0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f512a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f513b;

    public j(boolean z3, boolean z4) {
        this.f512a = z3;
        this.f513b = z4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f512a);
        textPaint.setStrikeThruText(this.f513b);
    }
}
