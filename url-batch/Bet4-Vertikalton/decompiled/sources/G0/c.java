package G0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1.d f240c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, w1.d dVar2) {
        this.d = dVar;
        this.f238a = context;
        this.f239b = textPaint;
        this.f240c = dVar2;
    }

    @Override // w1.d
    public final void c0(int i) {
        this.f240c.c0(i);
    }

    @Override // w1.d
    public final void d0(Typeface typeface, boolean z2) {
        this.d.g(this.f238a, this.f239b, typeface);
        this.f240c.d0(typeface, z2);
    }
}
