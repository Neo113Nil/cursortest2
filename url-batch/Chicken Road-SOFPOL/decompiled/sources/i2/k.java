package i2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3417a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3418b;

    public k(boolean z3, boolean z7) {
        this.f3417a = z3;
        this.f3418b = z7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f3417a);
        textPaint.setStrikeThruText(this.f3418b);
    }
}
