package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fmn extends fmp {
    final /* synthetic */ Context a;
    final /* synthetic */ TextPaint b;
    final /* synthetic */ fmp c;
    final /* synthetic */ fmo d;

    public fmn(fmo fmoVar, Context context, TextPaint textPaint, fmp fmpVar) {
        this.a = context;
        this.b = textPaint;
        this.c = fmpVar;
        this.d = fmoVar;
    }

    @Override // defpackage.fmp
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.fmp
    public final void b(Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
