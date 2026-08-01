package J0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import u1.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f327g;
    public final /* synthetic */ d h;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.h = dVar;
        this.f325e = context;
        this.f326f = textPaint;
        this.f327g = lVar;
    }

    @Override // u1.l
    public final void W(int i) {
        this.f327g.W(i);
    }

    @Override // u1.l
    public final void X(Typeface typeface, boolean z2) {
        this.h.g(this.f325e, this.f326f, typeface);
        this.f327g.X(typeface, z2);
    }
}
