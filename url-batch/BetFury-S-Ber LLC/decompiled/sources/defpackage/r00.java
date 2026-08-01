package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class r00 extends l80 {
    public final /* synthetic */ e a;
    public final /* synthetic */ s00 b;

    public r00(s00 s00Var, e eVar) {
        this.b = s00Var;
        this.a = eVar;
    }

    @Override // defpackage.l80
    public final void a(RecyclerView recyclerView, int i) {
        s00 s00Var;
        j50 j50Var;
        if (i != 0 || (j50Var = (s00Var = this.b).m0) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) s00Var.f0.getLayoutManager();
        View c = linearLayoutManager.e() ? j50.c(linearLayoutManager, j50Var.e(linearLayoutManager)) : linearLayoutManager.d() ? j50.c(linearLayoutManager, j50Var.d(linearLayoutManager)) : null;
        if (c != null) {
            x80 J = RecyclerView.J(c);
            int b = J != null ? J.b() : -1;
            if (b != -1) {
                e eVar = this.a;
                s00Var.b0 = eVar.e(b);
                s00Var.k0.setText(eVar.e(b).c());
                s00Var.O(b);
            }
        }
        s00Var.N();
    }

    @Override // defpackage.l80
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int L0;
        s00 s00Var = this.b;
        RecyclerView recyclerView2 = s00Var.f0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            L0 = N0 == null ? -1 : h80.H(N0);
        } else {
            L0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).L0();
        }
        j50 j50Var = s00Var.m0;
        e eVar = this.a;
        if (j50Var == null) {
            s00Var.b0 = eVar.e(L0);
        }
        s00Var.k0.setText(eVar.e(L0).c());
        s00Var.O(L0);
    }
}
