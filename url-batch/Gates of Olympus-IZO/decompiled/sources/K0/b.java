package K0;

import A2.l;
import I.C0089d;
import I.C0102j0;
import I.G;
import I.X;
import I0.j;
import a0.f;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b0.C0284q;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final C0284q f2655a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2656b;

    /* renamed from: c, reason: collision with root package name */
    public final C0102j0 f2657c = C0089d.J(new f(9205357640488583168L), X.f2228i);

    /* renamed from: d, reason: collision with root package name */
    public final G f2658d = C0089d.D(new l(11, this));

    public b(C0284q c0284q, float f3) {
        this.f2655a = c0284q;
        this.f2656b = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f2656b);
        textPaint.setShader((Shader) this.f2658d.getValue());
    }
}
