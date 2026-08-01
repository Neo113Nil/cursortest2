package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class o50 extends l70 {
    public final /* synthetic */ Context o;
    public final /* synthetic */ TextPaint p;
    public final /* synthetic */ l70 q;
    public final /* synthetic */ p50 r;

    public o50(p50 p50Var, Context context, TextPaint textPaint, l70 l70Var) {
        this.r = p50Var;
        this.o = context;
        this.p = textPaint;
        this.q = l70Var;
    }

    @Override // defpackage.l70
    public final void C(int i) {
        this.q.C(i);
    }

    @Override // defpackage.l70
    public final void E(Typeface typeface, boolean z) {
        this.r.f(this.o, this.p, typeface);
        this.q.E(typeface, z);
    }
}
