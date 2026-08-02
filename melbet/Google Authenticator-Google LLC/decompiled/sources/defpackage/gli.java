package defpackage;

import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gli implements agh {
    private final BiConsumer a;
    private final boc b;

    public gli(boc bocVar, BiConsumer biConsumer) {
        this.b = bocVar;
        this.a = biConsumer;
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd a(Class cls) {
        return yk.d();
    }

    @Override // defpackage.agh
    public final agd b(Class cls, ago agoVar) {
        this.a.accept(cls, agoVar);
        afr a = afx.a(agoVar);
        jqg jqgVar = new jqg();
        jrm jrmVar = (jrm) agoVar.a(jrm.b);
        if (jrmVar == null) {
            jrmVar = jrm.a;
        }
        jrn jrnVar = (jrn) agoVar.a(glv.d);
        if (jrnVar == null) {
            jrnVar = jrn.a;
        }
        boc bocVar = this.b;
        bocVar.a = a;
        bocVar.b = jqgVar;
        jrmVar.getClass();
        bocVar.c = jrmVar;
        bocVar.d = jrnVar;
        iwm.a(bocVar.a, afr.class);
        iwm.a(bocVar.b, jpv.class);
        iwm.a(bocVar.c, jrm.class);
        iwm.a(bocVar.d, jrn.class);
        koe koeVar = (koe) ((glf) imq.a(new bnn(), glf.class)).a().get(cls.getName());
        if (koeVar != null) {
            agd agdVar = (agd) koeVar.b();
            agdVar.t(new jqc(jqgVar, 1));
            return agdVar;
        }
        throw new IllegalStateException("Expected the @AccountViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @AccountViewModelMap but none was found.");
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd c(ktj ktjVar, ago agoVar) {
        return yk.c(this, ktjVar, agoVar);
    }
}
