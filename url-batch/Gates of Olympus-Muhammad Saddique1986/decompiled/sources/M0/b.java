package M0;

import A.h;
import I.C0143d;
import I.C0156j0;
import I.F;
import I.W;
import K0.i;
import a0.C0241f;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b0.C0348q;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final C0348q f3452a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3453b;

    /* renamed from: c, reason: collision with root package name */
    public final C0156j0 f3454c = C0143d.K(new C0241f(9205357640488583168L), W.f2783i);

    /* renamed from: d, reason: collision with root package name */
    public final F f3455d = C0143d.D(new h(12, this));

    public b(C0348q c0348q, float f3) {
        this.f3452a = c0348q;
        this.f3453b = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        i.b(textPaint, this.f3453b);
        textPaint.setShader((Shader) this.f3455d.getValue());
    }
}
