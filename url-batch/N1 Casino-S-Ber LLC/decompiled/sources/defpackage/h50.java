package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class h50 extends zo {
    public final /* synthetic */ Context r;
    public final /* synthetic */ TextPaint s;
    public final /* synthetic */ zo t;
    public final /* synthetic */ i50 u;

    public h50(i50 i50Var, Context context, TextPaint textPaint, zo zoVar) {
        this.u = i50Var;
        this.r = context;
        this.s = textPaint;
        this.t = zoVar;
    }

    @Override // defpackage.zo
    public final void B(int i) {
        this.t.B(i);
    }

    @Override // defpackage.zo
    public final void C(Typeface typeface, boolean z) {
        this.u.f(this.r, this.s, typeface);
        this.t.C(typeface, z);
    }
}
