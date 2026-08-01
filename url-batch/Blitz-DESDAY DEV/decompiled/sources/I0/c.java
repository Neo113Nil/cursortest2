package I0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import z1.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f341c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.d = dVar;
        this.f339a = context;
        this.f340b = textPaint;
        this.f341c = lVar;
    }

    @Override // z1.l
    public final void d0(int i) {
        this.f341c.d0(i);
    }

    @Override // z1.l
    public final void e0(Typeface typeface, boolean z2) {
        this.d.g(this.f339a, this.f340b, typeface);
        this.f341c.e0(typeface, z2);
    }
}
