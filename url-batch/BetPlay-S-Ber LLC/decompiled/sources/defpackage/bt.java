package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bt extends qz {
    public final /* synthetic */ e a;
    public final /* synthetic */ ct b;

    public bt(ct ctVar, e eVar) {
        this.b = ctVar;
        this.a = eVar;
    }

    @Override // defpackage.qz
    public final void a(RecyclerView recyclerView, int i) {
        ct ctVar;
        bx bxVar;
        RecyclerView recyclerView2;
        if (i != 0 || (bxVar = (ctVar = this.b).t) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ctVar.m.getLayoutManager();
        View c = linearLayoutManager.e() ? bx.c(linearLayoutManager, bxVar.e(linearLayoutManager)) : linearLayoutManager.d() ? bx.c(linearLayoutManager, bxVar.d(linearLayoutManager)) : null;
        if (c != null) {
            c00 I = RecyclerView.I(c);
            int F = (I == null || (recyclerView2 = I.r) == null) ? -1 : recyclerView2.F(I);
            if (F != -1) {
                e eVar = this.a;
                ctVar.i = eVar.e(F);
                ctVar.r.setText(eVar.e(F).c());
                ctVar.l(F);
            }
        }
        ctVar.k();
    }

    @Override // defpackage.qz
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int L0;
        ct ctVar = this.b;
        RecyclerView recyclerView2 = ctVar.m;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, false, linearLayoutManager.v());
            L0 = N0 == null ? -1 : nz.H(N0);
        } else {
            L0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).L0();
        }
        bx bxVar = ctVar.t;
        e eVar = this.a;
        if (bxVar == null) {
            ctVar.i = eVar.e(L0);
        }
        ctVar.r.setText(eVar.e(L0).c());
        ctVar.l(L0);
    }
}
