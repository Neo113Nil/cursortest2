package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fmm extends uw {
    final /* synthetic */ fmp a;
    final /* synthetic */ fmo b;

    public fmm(fmo fmoVar, fmp fmpVar) {
        this.a = fmpVar;
        this.b = fmoVar;
    }

    @Override // defpackage.uw
    public final void a(int i) {
        this.b.o = true;
        this.a.a(i);
    }

    @Override // defpackage.uw
    public final void b(Typeface typeface) {
        fmo fmoVar = this.b;
        fmoVar.m = Typeface.create(typeface, fmoVar.d);
        fmoVar.o = true;
        this.a.b(fmoVar.m, false);
    }
}
