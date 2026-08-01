package v2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import j1.e;
import k1.m;
import n0.h;
import n0.j1;
import n0.y;
import t2.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public final m f9948d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9949e;

    /* renamed from: i, reason: collision with root package name */
    public final j1 f9950i = h.r(new e(9205357640488583168L));

    /* renamed from: r, reason: collision with root package name */
    public final y f9951r = h.o(new a1.b(25, this));

    public b(m mVar, float f3) {
        this.f9948d = mVar;
        this.f9949e = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        i.b(textPaint, this.f9949e);
        textPaint.setShader((Shader) this.f9951r.getValue());
    }
}
