package O0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H1.d f845g;
    public final /* synthetic */ d h;

    public c(d dVar, Context context, TextPaint textPaint, H1.d dVar2) {
        this.h = dVar;
        this.f843e = context;
        this.f844f = textPaint;
        this.f845g = dVar2;
    }

    @Override // H1.d
    public final void T(int i) {
        this.f845g.T(i);
    }

    @Override // H1.d
    public final void U(Typeface typeface, boolean z2) {
        this.h.g(this.f843e, this.f844f, typeface);
        this.f845g.U(typeface, z2);
    }
}
