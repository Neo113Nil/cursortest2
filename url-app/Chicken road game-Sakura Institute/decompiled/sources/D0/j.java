package D0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f2155a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2156b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2157c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2158d;

    public j(int i2, float f4, float f5, float f6) {
        this.f2155a = i2;
        this.f2156b = f4;
        this.f2157c = f5;
        this.f2158d = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f2158d, this.f2156b, this.f2157c, this.f2155a);
    }
}
