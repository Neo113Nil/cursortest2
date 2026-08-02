package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fjs extends fmp {
    final /* synthetic */ fju a;

    public fjs(fju fjuVar) {
        this.a = fjuVar;
    }

    @Override // defpackage.fmp
    public final void a(int i) {
        fju fjuVar = this.a;
        fjuVar.c = true;
        fjt fjtVar = (fjt) fjuVar.d.get();
        if (fjtVar != null) {
            fjtVar.i();
        }
    }

    @Override // defpackage.fmp
    public final void b(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        fju fjuVar = this.a;
        fjuVar.c = true;
        fjt fjtVar = (fjt) fjuVar.d.get();
        if (fjtVar != null) {
            fjtVar.i();
        }
    }
}
