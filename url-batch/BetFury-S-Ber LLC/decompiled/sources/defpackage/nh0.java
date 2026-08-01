package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class nh0 extends mc0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ mc0 c;
    public final /* synthetic */ oh0 d;

    public nh0(oh0 oh0Var, Context context, TextPaint textPaint, mc0 mc0Var) {
        this.d = oh0Var;
        this.a = context;
        this.b = textPaint;
        this.c = mc0Var;
    }

    @Override // defpackage.mc0
    public final void i(int i) {
        this.c.i(i);
    }

    @Override // defpackage.mc0
    public final void j(Typeface typeface, boolean z) {
        this.d.f(this.a, this.b, typeface);
        this.c.j(typeface, z);
    }
}
