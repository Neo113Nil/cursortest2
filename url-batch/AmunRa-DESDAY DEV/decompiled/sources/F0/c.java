package F0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import s1.l;

/* loaded from: classes.dex */
public final class c extends l {
    public final /* synthetic */ Context h;
    public final /* synthetic */ TextPaint i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f167j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f168k;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.f168k = dVar;
        this.h = context;
        this.i = textPaint;
        this.f167j = lVar;
    }

    @Override // s1.l
    public final void P(int i) {
        this.f167j.P(i);
    }

    @Override // s1.l
    public final void Q(Typeface typeface, boolean z2) {
        this.f168k.g(this.h, this.i, typeface);
        this.f167j.Q(typeface, z2);
    }
}
