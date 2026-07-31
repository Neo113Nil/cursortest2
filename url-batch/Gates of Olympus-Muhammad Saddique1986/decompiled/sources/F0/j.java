package F0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f1944a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1945b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1946c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1947d;

    public j(int i3, float f3, float f4, float f5) {
        this.f1944a = i3;
        this.f1945b = f3;
        this.f1946c = f4;
        this.f1947d = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f1947d, this.f1945b, this.f1946c, this.f1944a);
    }
}
