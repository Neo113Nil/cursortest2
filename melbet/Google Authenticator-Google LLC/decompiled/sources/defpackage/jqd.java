package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqd implements agh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jqd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd a(Class cls) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? yk.d() : yk.d() : yk.d() : yk.d() : yk.d();
    }

    @Override // defpackage.agh
    public final agd b(Class cls, ago agoVar) {
        agd agdVar;
        jpy c;
        int i = this.b;
        if (i == 0) {
            jqg jqgVar = new jqg();
            jrm jrmVar = (jrm) agoVar.a(jrm.b);
            if (jrmVar == null) {
                jrmVar = jrm.a;
            }
            jrn jrnVar = (jrn) agoVar.a(jrl.d);
            bod bodVar = (bod) this.a;
            bodVar.a = afx.a(agoVar);
            bodVar.b = jqgVar;
            jrmVar.getClass();
            bodVar.c = jrmVar;
            if (jrnVar == null) {
                jrnVar = jrn.a;
            }
            bodVar.d = jrnVar;
            iwm.a(bodVar.a, afr.class);
            iwm.a(bodVar.b, jpv.class);
            iwm.a(bodVar.c, jrm.class);
            iwm.a(bodVar.d, jrn.class);
            bno bnoVar = new bno(bodVar.e, bodVar.a);
            koe koeVar = (koe) ((jqe) imq.a(bnoVar, jqe.class)).b().get(cls);
            krt krtVar = (krt) agoVar.a(jqf.a);
            Object obj = ((jqe) imq.a(bnoVar, jqe.class)).a().get(cls);
            if (obj == null) {
                if (krtVar != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (koeVar == null) {
                    throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                }
                agdVar = (agd) koeVar.b();
            } else {
                if (koeVar != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (krtVar == null) {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
                agdVar = (agd) krtVar.a(obj);
            }
            agdVar.t(new jqc(jqgVar, 0));
            return agdVar;
        }
        if (i == 1) {
            Object c2 = ((gko) this.a).c();
            jqw jqwVar = new jqw(agoVar);
            jrn jrnVar2 = (jrn) agoVar.a(glv.c);
            if (jrnVar2 == null) {
                jrnVar2 = jrn.a;
            }
            jrm jrmVar2 = (jrm) agoVar.a(gkr.a);
            if (jrmVar2 == null) {
                jrmVar2 = jrm.a;
            }
            return new gkl(c2, jqwVar, jrmVar2, jrnVar2);
        }
        if (i == 2) {
            jqw jqwVar2 = new jqw(agoVar);
            jrn jrnVar3 = (jrn) agoVar.a(jrl.a);
            gdy w = ((jqj) imr.a((Context) this.a, jqj.class)).w();
            w.c = jqwVar2;
            if (jrnVar3 == null) {
                jrnVar3 = jrn.a;
            }
            w.b = jrnVar3;
            iwm.a(w.c, jqw.class);
            iwm.a(w.b, jrn.class);
            return new jqk(new bna((bnl) w.a), jqwVar2);
        }
        if (i != 3) {
            jqw jqwVar3 = new jqw(agoVar);
            jrn jrnVar4 = (jrn) agoVar.a(jrl.c);
            Object obj2 = this.a;
            if (!(obj2 instanceof jrr)) {
                throw new IllegalStateException("ScreenRetainedComponent cannot be instantiated without a host");
            }
            bnz b = ((jqz) imq.a(((jqi) ((jrr) obj2).b()).b(), jqz.class)).b();
            b.a = jqwVar3;
            if (jrnVar4 == null) {
                jrnVar4 = jrn.a;
            }
            b.b = jrnVar4;
            iwm.a(b.a, jqw.class);
            iwm.a(b.b, jrn.class);
            return new jra(new bni(), jqwVar3);
        }
        jqw jqwVar4 = new jqw(agoVar);
        Object obj3 = this.a;
        Object obj4 = obj3;
        while (true) {
            if (obj4 == null) {
                bd bdVar = (bd) obj3;
                iwi.a(bdVar.Q() instanceof jrr, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", bdVar.Q().getClass());
                c = ((jqi) ((jrr) bdVar.Q()).b()).c();
                break;
            }
            if (obj4 instanceof jrr) {
                jrq b2 = ((jrr) obj4).b();
                if (b2 instanceof jqi) {
                    c = ((jqi) b2).c();
                    break;
                }
            }
            obj4 = ((bd) obj4).F;
        }
        jrn jrnVar5 = (jrn) agoVar.a(jrl.b);
        cmq b3 = ((jqr) imq.a(c, jqr.class)).b();
        b3.b = jqwVar4;
        if (jrnVar5 == null) {
            jrnVar5 = jrn.a;
        }
        b3.a = jrnVar5;
        iwm.a(b3.b, jqw.class);
        iwm.a(b3.a, jrn.class);
        return new jqs(new bne(), jqwVar4);
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd c(ktj ktjVar, ago agoVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? yk.c(this, ktjVar, agoVar) : yk.c(this, ktjVar, agoVar) : yk.c(this, ktjVar, agoVar) : yk.c(this, ktjVar, agoVar) : yk.c(this, ktjVar, agoVar);
    }
}
