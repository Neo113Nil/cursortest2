package L0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A.c f485g;
    public final /* synthetic */ d h;

    public c(d dVar, Context context, TextPaint textPaint, A.c cVar) {
        this.h = dVar;
        this.f483e = context;
        this.f484f = textPaint;
        this.f485g = cVar;
    }

    @Override // A.c
    public final void m0(int i) {
        this.f485g.m0(i);
    }

    @Override // A.c
    public final void n0(Typeface typeface, boolean z2) {
        this.h.g(this.f483e, this.f484f, typeface);
        this.f485g.n0(typeface, z2);
    }
}
