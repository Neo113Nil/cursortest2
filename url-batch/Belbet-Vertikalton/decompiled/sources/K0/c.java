package K0;

import H1.l;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextPaint f677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f678h;
    public final /* synthetic */ d i;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.i = dVar;
        this.f676f = context;
        this.f677g = textPaint;
        this.f678h = lVar;
    }

    @Override // H1.l
    public final void L(int i) {
        this.f678h.L(i);
    }

    @Override // H1.l
    public final void M(Typeface typeface, boolean z2) {
        this.i.g(this.f676f, this.f677g, typeface);
        this.f678h.M(typeface, z2);
    }
}
