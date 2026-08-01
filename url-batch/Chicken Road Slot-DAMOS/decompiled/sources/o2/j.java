package o2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f7356a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7357b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7358c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7359d;

    public j(int i3, float f3, float f10, float f11) {
        this.f7356a = i3;
        this.f7357b = f3;
        this.f7358c = f10;
        this.f7359d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f7359d, this.f7357b, this.f7358c, this.f7356a);
    }
}
