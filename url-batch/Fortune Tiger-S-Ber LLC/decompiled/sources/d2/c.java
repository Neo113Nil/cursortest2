package d2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends k3.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f1472f;
    public final /* synthetic */ TextPaint g;
    public final /* synthetic */ k3.d h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f1473i;

    public c(d dVar, Context context, TextPaint textPaint, k3.d dVar2) {
        this.f1473i = dVar;
        this.f1472f = context;
        this.g = textPaint;
        this.h = dVar2;
    }

    @Override // k3.d
    public final void R(int i4) {
        this.h.R(i4);
    }

    @Override // k3.d
    public final void S(Typeface typeface, boolean z3) {
        this.f1473i.f(this.f1472f, this.g, typeface);
        this.h.S(typeface, z3);
    }
}
