package t5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f6904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f6905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f6906d;

    public c(d dVar, Context context, TextPaint textPaint, r rVar) {
        this.f6906d = dVar;
        this.f6903a = context;
        this.f6904b = textPaint;
        this.f6905c = rVar;
    }

    @Override // r2.r
    public final void G(int i) {
        this.f6905c.G(i);
    }

    @Override // r2.r
    public final void H(Typeface typeface, boolean z3) {
        this.f6906d.f(this.f6903a, this.f6904b, typeface);
        this.f6905c.H(typeface, z3);
    }
}
