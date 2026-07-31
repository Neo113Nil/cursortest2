package androidx.compose.foundation;

import B.I;
import I.X0;
import U.q;
import n.U;
import n.W;
import n.Z;
import q.j;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final X0 f4788a = new X0(W.f7075f);

    public static final q a(q qVar, j jVar, U u3) {
        return u3 == null ? qVar : u3 instanceof Z ? qVar.i(new IndicationModifierElement(jVar, (Z) u3)) : U.a.b(qVar, new I(u3, 2, jVar));
    }
}
