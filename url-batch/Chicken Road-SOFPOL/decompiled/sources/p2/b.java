package p2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.lifecycle.m0;
import e1.e;
import f1.b0;
import m0.e0;
import m0.h1;
import n2.j;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f5732d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5733e;

    /* renamed from: f, reason: collision with root package name */
    public final h1 f5734f = m0.b.q(new e(9205357640488583168L));

    /* renamed from: g, reason: collision with root package name */
    public final e0 f5735g = m0.b.n(new m0(8, this));

    public b(b0 b0Var, float f6) {
        this.f5732d = b0Var;
        this.f5733e = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.a(textPaint, this.f5733e);
        textPaint.setShader((Shader) this.f5735g.getValue());
    }
}
