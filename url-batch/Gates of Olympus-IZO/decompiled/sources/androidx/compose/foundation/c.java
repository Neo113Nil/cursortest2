package androidx.compose.foundation;

import I.Y0;
import U.g;
import U.l;
import n.Q;
import n.T;
import n.W;
import q.i;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f3610a = new Y0(T.f6031f);

    public static final l a(l lVar, i iVar, Q q2) {
        return q2 == null ? lVar : q2 instanceof W ? lVar.e(new IndicationModifierElement(iVar, (W) q2)) : lVar.e(new g(new J0.b(q2, 1, iVar)));
    }
}
