package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxo extends dza {
    private final dxe a;
    private final ldt b;

    public dxo(dxe dxeVar, ldt ldtVar) {
        this.a = dxeVar;
        this.b = ldtVar;
    }

    private static final boolean d(jgr jgrVar) {
        if (jgrVar instanceof jgs) {
            return ((jgs) jgrVar).b == 3;
        }
        if (jgrVar instanceof jgx) {
            return true;
        }
        if (jgrVar instanceof jgz) {
            return false;
        }
        throw new koj();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        jfy jgqVar;
        dxp dxpVar = (dxp) obj;
        jfv jfvVar = (jfv) obj2;
        dxpVar.getClass();
        jfvVar.getClass();
        if (jfvVar.c.a() == 3) {
            ViewGroup viewGroup = dxpVar.c;
            viewGroup.setOnClickListener(null);
            viewGroup.setClickable(false);
            viewGroup.setFocusable(false);
            return;
        }
        ViewGroup viewGroup2 = dxpVar.c;
        viewGroup2.setFocusable(true);
        jgr jgrVar = jfvVar.b;
        if (jgrVar instanceof jgz) {
            jgqVar = jgy.a;
        } else if (jgrVar instanceof jgs) {
            jgqVar = new jgq(((jgs) jgrVar).b == 2);
        } else {
            if (!(jgrVar instanceof jgx)) {
                throw new koj();
            }
            jgqVar = new jgq(true);
        }
        this.b.p(viewGroup2, 90784, jgqVar);
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        dxp dxpVar = (dxp) obj;
        jfv jfvVar = (jfv) obj2;
        dxpVar.getClass();
        jfvVar.getClass();
        jgr jgrVar = jfvVar.b;
        if (jgrVar instanceof jgx) {
            dxpVar.c.setVisibility(8);
            dxpVar.h.setVisibility(8);
        } else if (jgrVar instanceof jgz) {
            this.a.c(dxpVar.b, jfvVar);
            dxpVar.c.setVisibility(0);
            dxpVar.h.setVisibility(8);
        } else {
            if (!(jgrVar instanceof jgs)) {
                throw new koj();
            }
            this.a.c(dxpVar.b, jfvVar);
            dxpVar.c.setVisibility(0);
            dxpVar.h.setVisibility(((jgs) jgrVar).b == 3 ? 0 : 8);
        }
        dxpVar.d.t(jfvVar.a);
        dxpVar.e.setVisibility(true != d(jgrVar) ? 8 : 0);
        dxpVar.g.t(jfvVar.d.a);
        dxpVar.f.setVisibility(true == d(jgrVar) ? 0 : 8);
        dxpVar.j.b = !r7.isEmpty();
        dxpVar.i.setVisibility(0);
        dxpVar.a.setVisibility(0);
    }
}
