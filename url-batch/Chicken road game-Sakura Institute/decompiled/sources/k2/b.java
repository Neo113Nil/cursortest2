package k2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.lifecycle.r0;
import g0.d;
import g0.e0;
import g0.g1;
import g0.t0;
import i2.j;
import y0.f;
import z0.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: f, reason: collision with root package name */
    public final q f5342f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5343g;

    /* renamed from: h, reason: collision with root package name */
    public final g1 f5344h = d.J(new f(9205357640488583168L), t0.f3903k);

    /* renamed from: i, reason: collision with root package name */
    public final e0 f5345i = d.C(new r0(15, this));

    public b(q qVar, float f9) {
        this.f5342f = qVar;
        this.f5343g = f9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f5343g);
        textPaint.setShader((Shader) this.f5345i.getValue());
    }
}
