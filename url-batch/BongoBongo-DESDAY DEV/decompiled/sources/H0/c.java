package H0;

import A1.m;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f302c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, m mVar) {
        this.d = dVar;
        this.f300a = context;
        this.f301b = textPaint;
        this.f302c = mVar;
    }

    @Override // A1.m
    public final void O(int i) {
        this.f302c.O(i);
    }

    @Override // A1.m
    public final void P(Typeface typeface, boolean z2) {
        this.d.g(this.f300a, this.f301b, typeface);
        this.f302c.P(typeface, z2);
    }
}
