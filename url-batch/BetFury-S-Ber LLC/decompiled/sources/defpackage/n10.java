package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class n10 extends b30 {
    public jb0 l = new jb0();

    @Override // defpackage.ty
    public final void e() {
        Iterator it = this.l.iterator();
        while (true) {
            fb0 fb0Var = (fb0) it;
            if (!fb0Var.hasNext()) {
                return;
            }
            m10 m10Var = (m10) ((Map.Entry) fb0Var.next()).getValue();
            m10Var.a.d(m10Var);
        }
    }

    @Override // defpackage.ty
    public final void f() {
        Iterator it = this.l.iterator();
        while (true) {
            fb0 fb0Var = (fb0) it;
            if (!fb0Var.hasNext()) {
                return;
            } else {
                ((m10) ((Map.Entry) fb0Var.next()).getValue()).b();
            }
        }
    }

    public final void i(ty tyVar, lz lzVar) {
        Object obj;
        m10 m10Var = new m10(tyVar, lzVar);
        jb0 jb0Var = this.l;
        gb0 a = jb0Var.a(tyVar);
        if (a != null) {
            obj = a.g;
        } else {
            gb0 gb0Var = new gb0(tyVar, m10Var);
            jb0Var.i++;
            gb0 gb0Var2 = jb0Var.g;
            if (gb0Var2 == null) {
                jb0Var.f = gb0Var;
                jb0Var.g = gb0Var;
            } else {
                gb0Var2.h = gb0Var;
                gb0Var.i = gb0Var2;
                jb0Var.g = gb0Var;
            }
            obj = null;
        }
        m10 m10Var2 = (m10) obj;
        if (m10Var2 != null && m10Var2.b != lzVar) {
            s9.k("This source was already added with the different observer");
        } else if (m10Var2 == null && this.c > 0) {
            tyVar.d(m10Var);
        }
    }
}
