package K0;

import A3.e;
import G.C0192d;
import G.C0205j0;
import G.F;
import G.W;
import I0.j;
import Y.f;
import Z.N;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final N f3448a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3449b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205j0 f3450c = C0192d.K(new f(9205357640488583168L), W.f2779l);

    /* renamed from: d, reason: collision with root package name */
    public final F f3451d = C0192d.D(new e(7, this));

    public b(N n2, float f4) {
        this.f3448a = n2;
        this.f3449b = f4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f3449b);
        textPaint.setShader((Shader) this.f3451d.getValue());
    }
}
