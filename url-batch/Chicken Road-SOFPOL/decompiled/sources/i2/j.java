package i2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f3413a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3414b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3415c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3416d;

    public j(int i, float f6, float f8, float f9) {
        this.f3413a = i;
        this.f3414b = f6;
        this.f3415c = f8;
        this.f3416d = f9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f3416d, this.f3414b, this.f3415c, this.f3413a);
    }
}
