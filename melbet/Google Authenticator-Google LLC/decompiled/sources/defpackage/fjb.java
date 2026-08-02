package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fjb extends wv {
    final /* synthetic */ int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fjc d;

    public fjb(fjc fjcVar, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.d = fjcVar;
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        super.c(view, aahVar);
        int i = this.a;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            fjj fjjVar = this.d.g;
            if (fjjVar.e.b(i3) == 2 || fjjVar.e.b(i3) == 3) {
                i2--;
            }
        }
        aahVar.r(brn.aa(i2, 1, 1, 1, this.b, view.isSelected()));
    }
}
