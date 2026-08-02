package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bpl implements fdt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bpl(bpr bprVar, bpc bpcVar, int i) {
        this.c = i;
        this.b = bprVar;
        this.a = bpcVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fdt
    public final void a(fwm fwmVar) {
        int i = this.c;
        if (i == 0) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((bpr) this.a).h(fwmVar, (bpc) it.next());
            }
            return;
        }
        if (i == 1) {
            ((bpr) this.b).h(fwmVar, (bpc) this.a);
            return;
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((bpr) this.a).h(fwmVar, (bpc) it2.next());
        }
    }

    public /* synthetic */ bpl(bpr bprVar, List list, int i) {
        this.c = i;
        this.a = bprVar;
        this.b = list;
    }
}
