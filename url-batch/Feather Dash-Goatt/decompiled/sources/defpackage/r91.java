package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r91 extends CharacterStyle implements UpdateAppearance {
    public final q91 d;
    public final float e;
    public final av0 g = gb0.F(new va1(9205357640488583168L));
    public final xr h = gb0.o(new i6(11, this));

    public r91(q91 q91Var, float f) {
        this.d = q91Var;
        this.e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        yr1.d0(textPaint, this.e);
        textPaint.setShader((Shader) this.h.getValue());
    }
}
