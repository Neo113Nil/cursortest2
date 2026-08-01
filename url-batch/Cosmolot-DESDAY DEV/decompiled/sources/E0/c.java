package E0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import q1.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f173c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.d = dVar;
        this.f171a = context;
        this.f172b = textPaint;
        this.f173c = lVar;
    }

    @Override // q1.l
    public final void G(int i) {
        this.f173c.G(i);
    }

    @Override // q1.l
    public final void H(Typeface typeface, boolean z2) {
        this.d.g(this.f171a, this.f172b, typeface);
        this.f173c.H(typeface, z2);
    }
}
