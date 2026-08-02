package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ais extends wv {
    final /* synthetic */ ait a;

    public ais(ait aitVar) {
        this.a = aitVar;
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        ait aitVar = this.a;
        aitVar.e.c(view, aahVar);
        RecyclerView recyclerView = aitVar.d;
        int c = recyclerView.c(view);
        kr krVar = recyclerView.l;
        if (krVar instanceof aim) {
            ((aim) krVar).t(c);
        }
    }

    @Override // defpackage.wv
    public final boolean i(View view, int i, Bundle bundle) {
        return this.a.e.i(view, i, bundle);
    }
}
