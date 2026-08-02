package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxs extends dza {
    private final ean a;
    private final dzy b;

    public dxs(ean eanVar, dzy dzyVar) {
        this.a = eanVar;
        this.b = dzyVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((fdp) obj).getClass();
        ((jgd) obj2).getClass();
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [hac, java.lang.Object] */
    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        fdp fdpVar = (fdp) obj;
        jgd jgdVar = (jgd) obj2;
        fdpVar.getClass();
        jgdVar.getClass();
        if (ksp.b(jgdVar, fdpVar.d)) {
            return;
        }
        fdpVar.d = jgdVar;
        ViewGroup viewGroup = (ViewGroup) fdpVar.c;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.getClass();
            childAt.setVisibility(8);
        }
        if (jgdVar instanceof jgv) {
            cfe cfeVar = (cfe) fdpVar.a.bB();
            ((ImageView) cfeVar.a).setVisibility(0);
            dzy dzyVar = this.b;
            cfeVar.getClass();
            dzyVar.c(cfeVar, ((jgv) jgdVar).a);
            return;
        }
        if (!(jgdVar instanceof jhr)) {
            throw new koj();
        }
        iyi iyiVar = (iyi) fdpVar.b.bB();
        ((TextView) iyiVar.b).setVisibility(0);
        ean eanVar = this.a;
        iyiVar.getClass();
        eanVar.c(iyiVar, ((jhr) jgdVar).a);
    }
}
