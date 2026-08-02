package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fpf extends wv {
    final /* synthetic */ fpk a;

    public fpf(fpk fpkVar) {
        this.a = fpkVar;
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        super.c(view, aahVar);
        aahVar.g(1048576);
        aahVar.a.setDismissable(true);
    }

    @Override // defpackage.wv
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.i(view, i, bundle);
        }
        this.a.e(3);
        return true;
    }
}
