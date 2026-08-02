package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class eat {
    public final kzg a;
    public boolean b;
    public final jiw d;
    public final krt e;
    private final jiu g;
    private final jiu h;
    private final jiu i;
    private final krt j;
    private final krt k;
    private final krt l;
    private final ebb m;
    public final krt c = new dwd(this, 11);
    private final int f = View.generateViewId();

    public eat(ebb ebbVar, kzg kzgVar, jiw jiwVar, krt krtVar) {
        this.a = kzgVar;
        this.m = ebbVar;
        this.d = jiwVar;
        this.e = krtVar;
        jiu a = jiwVar.a(new dvm(7));
        this.g = a;
        jiu a2 = jiwVar.a(new dvm(8));
        this.h = a2;
        jiu a3 = jiwVar.a(new dvm(9));
        this.i = a3;
        Object obj = null;
        int i = 2;
        this.j = new ayb(this, a, obj, i);
        this.k = new ayb(this, a2, a, i);
        this.l = new ayb(this, a3, obj, i);
    }

    private static jgn d(hel helVar, jiu jiuVar, int i, boolean z) {
        if (helVar.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(ixc.w(helVar));
        Iterator<E> it = helVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(new jhh(str));
        }
        return new jgn(arrayList, jiuVar, i, z ? jhb.d : jhb.e, z ? new jgk(jhb.e) : new jgl(null), null, 1);
    }

    public eba a() {
        jie jieVar;
        char c;
        jin jinVar;
        ebg ebgVar;
        jir jirVar;
        Drawable drawable;
        String str;
        ebb ebbVar = this.m;
        if (ebbVar.a().booleanValue()) {
            if (ksp.b(ebbVar.d.a(), true)) {
                jieVar = jih.a;
            } else {
                ebi ebiVar = (ebi) ebbVar.h.a();
                ebd ebdVar = (ebd) ebbVar.i.a();
                if (ebiVar == null || ebdVar == null) {
                    jieVar = null;
                } else {
                    Drawable drawable2 = ebiVar.a;
                    jig jigVar = new jig(drawable2 != null ? new jfl(drawable2, ebiVar.c) : new jfn(ebiVar.b, ebiVar.c));
                    jhh jhhVar = new jhh(ebdVar.a);
                    jhb jhbVar = jhb.b;
                    jhq jhqVar = new jhq(jhhVar, jhbVar, 2, (Integer) 3, 16);
                    gzp gzpVar = (gzp) ebbVar.j.a();
                    jhq jhqVar2 = (gzpVar == null || (str = (String) gzpVar.e()) == null) ? null : new jhq(new jhh(str), jhb.c, 5, (Integer) 3, 16);
                    gzp gzpVar2 = (gzp) ebbVar.m.a();
                    jiq jiqVar = (gzpVar2 == null || (drawable = (Drawable) gzpVar2.e()) == null) ? null : new jiq(new jfl(drawable, false), 4);
                    gzp gzpVar3 = (gzp) ebbVar.p.a();
                    if (gzpVar3 == null || (ebgVar = (ebg) gzpVar3.e()) == null) {
                        c = 0;
                        jinVar = null;
                    } else {
                        ebd ebdVar2 = (ebd) ebgVar.a().e();
                        if (ebdVar2 != null) {
                            c = 0;
                            jhh jhhVar2 = new jhh(ebdVar2.a);
                            int i = true != ebgVar.b() ? 2 : 5;
                            if (ebgVar.b()) {
                                jhbVar = jhb.c;
                            }
                            jirVar = new jir(new jhq(jhhVar2, jhbVar, i, (Integer) 1, 16), null);
                        } else {
                            c = 0;
                            jirVar = null;
                        }
                        jin[] jinVarArr = new jin[2];
                        jinVarArr[c] = null;
                        jinVarArr[1] = jirVar;
                        jinVar = ilm.a(jinVarArr, 1);
                    }
                    if (jinVar != null && jiqVar != null) {
                        throw new IllegalArgumentException("TextualCard can't show both TrailingTitleData and TrailingImageData");
                    }
                    jin[] jinVarArr2 = new jin[3];
                    jinVarArr2[c] = jiqVar;
                    jinVarArr2[1] = jinVar;
                    jinVarArr2[2] = null;
                    jin a = ilm.a(jinVarArr2, 2);
                    hel helVar = (hel) ebbVar.k.a();
                    jgn d = helVar != null ? d(helVar, this.h, ebbVar.s.b, ksp.b(ebbVar.q.a(), true)) : null;
                    hel helVar2 = (hel) ebbVar.n.a();
                    jieVar = new jim(jigVar, jhqVar, jhqVar2, null, a, d, helVar2 != null ? d(helVar2, this.i, ebbVar.s.c, ksp.b(ebbVar.q.a(), true)) : null, 1, 0, 1560);
                }
            }
            if (jieVar != null) {
                return new eba(new jhy(jieVar, this.f, jhb.i, this.g, (kri) null, ebbVar.e, 16), null);
            }
        }
        return null;
    }

    public void b() {
        krt krtVar = this.c;
        eaw eawVar = new eaw(krtVar, 0);
        ebb ebbVar = this.m;
        ebbVar.c(eawVar);
        ebbVar.c.e(new eaw(this.j, 0));
        ebbVar.d.e(new eaw(krtVar, 0));
        ebbVar.h.e(new eaw(krtVar, 0));
        ebbVar.i.e(new eaw(krtVar, 0));
        ebbVar.j.e(new eaw(krtVar, 0));
        ebbVar.m.e(new eaw(krtVar, 0));
        ebbVar.p.e(new eaw(krtVar, 0));
        ebbVar.k.e(new eaw(krtVar, 0));
        ebbVar.l.e(new eaw(this.k, 0));
        ebbVar.n.e(new eaw(krtVar, 0));
        ebbVar.o.e(new eaw(this.l, 0));
        ebbVar.q.e(new eaw(krtVar, 0));
        ebbVar.b();
    }

    public void c() {
        krt krtVar = this.c;
        eaw eawVar = new eaw(krtVar, 0);
        ebb ebbVar = this.m;
        ebbVar.d(eawVar);
        ebbVar.c.h(new eaw(this.j, 0));
        ebbVar.d.h(new eaw(krtVar, 0));
        ebbVar.h.h(new eaw(krtVar, 0));
        ebbVar.i.h(new eaw(krtVar, 0));
        ebbVar.j.h(new eaw(krtVar, 0));
        ebbVar.m.h(new eaw(krtVar, 0));
        ebbVar.p.h(new eaw(krtVar, 0));
        ebbVar.k.h(new eaw(krtVar, 0));
        ebbVar.l.h(new eaw(this.k, 0));
        ebbVar.n.h(new eaw(krtVar, 0));
        ebbVar.o.h(new eaw(this.l, 0));
        ebbVar.q.h(new eaw(krtVar, 0));
        ebbVar.e();
        dvm dvmVar = new dvm(4);
        jiw jiwVar = this.d;
        jiwVar.c(this.g, dvmVar);
        jiwVar.c(this.h, new dvm(5));
        jiwVar.c(this.i, new dvm(6));
    }
}
