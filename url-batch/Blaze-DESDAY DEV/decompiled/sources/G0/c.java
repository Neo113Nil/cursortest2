package G0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.d f257c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, z1.d dVar2) {
        this.d = dVar;
        this.f255a = context;
        this.f256b = textPaint;
        this.f257c = dVar2;
    }

    @Override // z1.d
    public final void c0(int i) {
        this.f257c.c0(i);
    }

    @Override // z1.d
    public final void d0(Typeface typeface, boolean z2) {
        this.d.g(this.f255a, this.f256b, typeface);
        this.f257c.d0(typeface, z2);
    }
}
