package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u42 extends CharacterStyle implements UpdateAppearance {
    public final float OPXfSBeufaJ8;
    public final ty dgRBjINgWbAK;
    public final vf rtx2ld2ELZv4;
    public final mj1 wdg6QnbFHrFF;

    public u42(vf vfVar, float f) {
        this.rtx2ld2ELZv4 = vfVar;
        this.OPXfSBeufaJ8 = f;
        a62.Companion.getClass();
        this.wdg6QnbFHrFF = sj0.tmVwIGCQF4zR(new a62(9205357640488583168L));
        this.dgRBjINgWbAK = sj0.RfyTYNmI9Srp(new uy1(9, this));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        bs0.ozEBbv0hFTAB(textPaint, this.OPXfSBeufaJ8);
        textPaint.setShader((Shader) this.dgRBjINgWbAK.getValue());
    }
}
