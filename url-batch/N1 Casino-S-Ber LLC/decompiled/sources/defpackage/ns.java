package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ns extends bz {
    public final /* synthetic */ e a;
    public final /* synthetic */ os b;

    public ns(os osVar, e eVar) {
        this.b = osVar;
        this.a = eVar;
    }

    @Override // defpackage.bz
    public final void a(RecyclerView recyclerView, int i) {
        os osVar;
        ow owVar;
        if (i != 0 || (owVar = (osVar = this.b).m0) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) osVar.f0.getLayoutManager();
        View c = linearLayoutManager.e() ? ow.c(linearLayoutManager, owVar.e(linearLayoutManager)) : linearLayoutManager.d() ? ow.c(linearLayoutManager, owVar.d(linearLayoutManager)) : null;
        if (c != null) {
            nz J = RecyclerView.J(c);
            int b = J != null ? J.b() : -1;
            if (b != -1) {
                e eVar = this.a;
                osVar.b0 = eVar.g(b);
                osVar.k0.setText(eVar.g(b).c());
                osVar.O(b);
            }
        }
        osVar.N();
    }

    @Override // defpackage.bz
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int L0;
        os osVar = this.b;
        RecyclerView recyclerView2 = osVar.f0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            L0 = N0 == null ? -1 : xy.H(N0);
        } else {
            L0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).L0();
        }
        ow owVar = osVar.m0;
        e eVar = this.a;
        if (owVar == null) {
            osVar.b0 = eVar.g(L0);
        }
        osVar.k0.setText(eVar.g(L0).c());
        osVar.O(L0);
    }
}
