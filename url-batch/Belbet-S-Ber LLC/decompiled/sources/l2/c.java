package l2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f2702o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextPaint f2703p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b4.d f2704q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f2705r;

    public c(d dVar, Context context, TextPaint textPaint, b4.d dVar2) {
        this.f2705r = dVar;
        this.f2702o = context;
        this.f2703p = textPaint;
        this.f2704q = dVar2;
    }

    @Override // b4.d
    public final void H(int i) {
        this.f2704q.H(i);
    }

    @Override // b4.d
    public final void I(Typeface typeface, boolean z4) {
        this.f2705r.f(this.f2702o, this.f2703p, typeface);
        this.f2704q.I(typeface, z4);
    }
}
