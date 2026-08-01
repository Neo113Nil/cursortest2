package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ov extends e20 {
    public final /* synthetic */ e a;
    public final /* synthetic */ pv b;

    public ov(pv pvVar, e eVar) {
        this.b = pvVar;
        this.a = eVar;
    }

    @Override // defpackage.e20
    public final void a(RecyclerView recyclerView, int i) {
        pv pvVar;
        sz szVar;
        RecyclerView recyclerView2;
        if (i != 0 || (szVar = (pvVar = this.b).m0) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pvVar.f0.getLayoutManager();
        View c = linearLayoutManager.e() ? sz.c(linearLayoutManager, szVar.e(linearLayoutManager)) : linearLayoutManager.d() ? sz.c(linearLayoutManager, szVar.d(linearLayoutManager)) : null;
        if (c != null) {
            q20 I = RecyclerView.I(c);
            int F = (I == null || (recyclerView2 = I.r) == null) ? -1 : recyclerView2.F(I);
            if (F != -1) {
                e eVar = this.a;
                pvVar.b0 = eVar.e(F);
                pvVar.k0.setText(eVar.e(F).c());
                pvVar.O(F);
            }
        }
        pvVar.N();
    }

    @Override // defpackage.e20
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int L0;
        pv pvVar = this.b;
        RecyclerView recyclerView2 = pvVar.f0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            L0 = N0 == null ? -1 : b20.H(N0);
        } else {
            L0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).L0();
        }
        sz szVar = pvVar.m0;
        e eVar = this.a;
        if (szVar == null) {
            pvVar.b0 = eVar.e(L0);
        }
        pvVar.k0.setText(eVar.e(L0).c());
        pvVar.O(L0);
    }
}
