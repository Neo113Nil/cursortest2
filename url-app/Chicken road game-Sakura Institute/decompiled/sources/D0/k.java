package D0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2159a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2160b;

    public k(boolean z4, boolean z5) {
        this.f2159a = z4;
        this.f2160b = z5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f2159a);
        textPaint.setStrikeThruText(this.f2160b);
    }
}
