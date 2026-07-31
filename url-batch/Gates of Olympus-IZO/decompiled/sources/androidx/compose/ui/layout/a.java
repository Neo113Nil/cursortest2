package androidx.compose.ui.layout;

import U.l;
import Y1.c;
import Y1.f;
import r0.C0839l;
import r0.z;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(z zVar) {
        Object r3 = zVar.r();
        C0839l c0839l = r3 instanceof C0839l ? (C0839l) r3 : null;
        if (c0839l != null) {
            return c0839l.f7149q;
        }
        return null;
    }

    public static final l b(f fVar) {
        return new LayoutElement(fVar);
    }

    public static final l c(String str) {
        return new LayoutIdElement(str);
    }

    public static final l d(l lVar, c cVar) {
        return lVar.e(new OnSizeChangedModifier(cVar));
    }
}
