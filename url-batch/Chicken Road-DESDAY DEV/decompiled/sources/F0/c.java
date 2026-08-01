package F0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import u1.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f175g;
    public final /* synthetic */ d h;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.h = dVar;
        this.f173e = context;
        this.f174f = textPaint;
        this.f175g = lVar;
    }

    @Override // u1.l
    public final void M(int i) {
        this.f175g.M(i);
    }

    @Override // u1.l
    public final void N(Typeface typeface, boolean z2) {
        this.h.g(this.f173e, this.f174f, typeface);
        this.f175g.N(typeface, z2);
    }
}
