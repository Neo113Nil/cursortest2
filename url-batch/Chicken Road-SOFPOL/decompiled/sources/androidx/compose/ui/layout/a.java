package androidx.compose.ui.layout;

import p6.c;
import p6.f;
import u1.d0;
import u1.q;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(d0 d0Var) {
        Object g3 = d0Var.g();
        q qVar = g3 instanceof q ? (q) g3 : null;
        if (qVar != null) {
            return qVar.f7257r;
        }
        return null;
    }

    public static final m b(f fVar) {
        return new LayoutElement(fVar);
    }

    public static final m c(String str) {
        return new LayoutIdElement(str);
    }

    public static final m d(m mVar, c cVar) {
        return mVar.d(new OnSizeChangedModifier(cVar));
    }
}
