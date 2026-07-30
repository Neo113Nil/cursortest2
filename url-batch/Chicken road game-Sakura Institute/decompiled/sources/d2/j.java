package d2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f2587a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2588b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2589c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2590d;

    public j(int i7, float f9, float f10, float f11) {
        this.f2587a = i7;
        this.f2588b = f9;
        this.f2589c = f10;
        this.f2590d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f2590d, this.f2588b, this.f2589c, this.f2587a);
    }
}
