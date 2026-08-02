package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lg extends kt {
    final /* synthetic */ RecyclerView a;

    public lg(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    final void d() {
        RecyclerView recyclerView = this.a;
        recyclerView.u = true;
        recyclerView.requestLayout();
    }

    @Override // defpackage.kt
    public final void o() {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        recyclerView.M.f = true;
        recyclerView.R(true);
        if (recyclerView.g.k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.kt
    public final void p(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        hq hqVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = hqVar.a;
        arrayList.add(hqVar.b(4, i, i2, obj));
        hqVar.c |= 4;
        if (arrayList.size() == 1) {
            d();
        }
    }

    @Override // defpackage.kt
    public final void q(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        hq hqVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = hqVar.a;
        arrayList.add(hqVar.b(1, i, i2, null));
        hqVar.c |= 1;
        if (arrayList.size() == 1) {
            d();
        }
    }

    @Override // defpackage.kt
    public final void r(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        hq hqVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = hqVar.a;
        arrayList.add(hqVar.b(2, i, i2, null));
        hqVar.c |= 2;
        if (arrayList.size() == 1) {
            d();
        }
    }

    @Override // defpackage.kt
    public final void t(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        hq hqVar = recyclerView.g;
        if (i == i2) {
            return;
        }
        ArrayList arrayList = hqVar.a;
        arrayList.add(hqVar.b(8, i, i2, null));
        hqVar.c |= 8;
        if (arrayList.size() == 1) {
            d();
        }
    }
}
