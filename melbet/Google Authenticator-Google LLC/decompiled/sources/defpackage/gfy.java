package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfy extends kr {
    private final gzf a;
    private List e;
    private final ifn f;

    public gfy(gzf gzfVar, ifn ifnVar) {
        this.a = gzfVar;
        this.f = ifnVar;
    }

    @Override // defpackage.kr
    public final int a() {
        List list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kr
    public final int b(int i) {
        this.e.get(i);
        gfz gfzVar = (gfz) ((gzg) this.a).a;
        ifn ifnVar = this.f;
        ?? r0 = ifnVar.c;
        Integer num = (Integer) r0.get(gfzVar);
        if (num == null) {
            int i2 = ifnVar.b;
            ifnVar.b = i2 + 1;
            Integer valueOf = Integer.valueOf(i2);
            r0.put(gfzVar, valueOf);
            Object obj = ifnVar.a;
            valueOf.getClass();
            ((SparseArray) obj).put(i2, gfzVar);
            num = valueOf;
        }
        return num.intValue();
    }

    @Override // defpackage.kr
    public final long c(int i) {
        return -1L;
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        return new gfx(this.f.b(i).a(viewGroup));
    }

    @Override // defpackage.kr
    public final void j(RecyclerView recyclerView) {
        recyclerView.getLayoutParams();
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void k(lp lpVar, int i) {
        gfx gfxVar = (gfx) lpVar;
        gfz b = this.f.b(gfxVar.f);
        try {
            b.b((View) gfxVar.t, this.e.get(i));
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", b), e);
        }
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void n(lp lpVar) {
        gfx gfxVar = (gfx) lpVar;
        this.f.b(gfxVar.f);
        Object obj = gfxVar.t;
    }

    public final void t(List list) {
        fao.c();
        List list2 = this.e;
        this.e = list;
        if (list2 == null && list != null) {
            h(0, list.size());
        } else if (list2 == null || list != null) {
            e();
        } else {
            i(0, list2.size());
        }
    }
}
