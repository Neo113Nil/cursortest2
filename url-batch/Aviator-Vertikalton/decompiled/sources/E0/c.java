package E0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import q1.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f181g;
    public final /* synthetic */ TextPaint h;
    public final /* synthetic */ l i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f182j;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.f182j = dVar;
        this.f181g = context;
        this.h = textPaint;
        this.i = lVar;
    }

    @Override // q1.l
    public final void R(int i) {
        this.i.R(i);
    }

    @Override // q1.l
    public final void S(Typeface typeface, boolean z2) {
        this.f182j.g(this.f181g, this.h, typeface);
        this.i.S(typeface, z2);
    }
}
