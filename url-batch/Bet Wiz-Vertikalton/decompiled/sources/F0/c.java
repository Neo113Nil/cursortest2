package F0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1.d f228g;
    public final /* synthetic */ d h;

    public c(d dVar, Context context, TextPaint textPaint, x1.d dVar2) {
        this.h = dVar;
        this.f226e = context;
        this.f227f = textPaint;
        this.f228g = dVar2;
    }

    @Override // x1.d
    public final void O(int i) {
        this.f228g.O(i);
    }

    @Override // x1.d
    public final void P(Typeface typeface, boolean z2) {
        this.h.g(this.f226e, this.f227f, typeface);
        this.f228g.P(typeface, z2);
    }
}
