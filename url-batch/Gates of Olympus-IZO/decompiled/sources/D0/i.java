package D0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class i extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f508a;

    /* renamed from: b, reason: collision with root package name */
    public final float f509b;

    /* renamed from: c, reason: collision with root package name */
    public final float f510c;

    /* renamed from: d, reason: collision with root package name */
    public final float f511d;

    public i(int i3, float f3, float f4, float f5) {
        this.f508a = i3;
        this.f509b = f3;
        this.f510c = f4;
        this.f511d = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f511d, this.f509b, this.f510c, this.f508a);
    }
}
