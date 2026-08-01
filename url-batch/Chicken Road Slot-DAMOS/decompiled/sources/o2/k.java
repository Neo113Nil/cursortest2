package o2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7360a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7361b;

    public k(boolean z10, boolean z11) {
        this.f7360a = z10;
        this.f7361b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f7360a);
        textPaint.setStrikeThruText(this.f7361b);
    }
}
