package i2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f1813k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1814l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h.a f1815m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f1816n;

    public c(d dVar, Context context, TextPaint textPaint, h.a aVar) {
        this.f1816n = dVar;
        this.f1813k = context;
        this.f1814l = textPaint;
        this.f1815m = aVar;
    }

    @Override // h.a
    public final void U(int i) {
        this.f1815m.U(i);
    }

    @Override // h.a
    public final void V(Typeface typeface, boolean z3) {
        this.f1816n.f(this.f1813k, this.f1814l, typeface);
        this.f1815m.V(typeface, z3);
    }
}
