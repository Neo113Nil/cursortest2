package d2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2591a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2592b;

    public k(boolean z8, boolean z9) {
        this.f2591a = z8;
        this.f2592b = z9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f2591a);
        textPaint.setStrikeThruText(this.f2592b);
    }
}
