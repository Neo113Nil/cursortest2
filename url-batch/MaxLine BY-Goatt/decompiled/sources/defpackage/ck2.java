package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ck2 extends CharacterStyle implements UpdateAppearance {
    public final bk2 m;
    public final float n;
    public final lz1 o = ij2.j(new ql2(9205357640488583168L));
    public final ia0 p = ij2.f(new dj(14, this));

    public ck2(bk2 bk2Var, float f) {
        this.m = bk2Var;
        this.n = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        s03.L(textPaint, this.n);
        textPaint.setShader((Shader) this.p.getValue());
    }
}
