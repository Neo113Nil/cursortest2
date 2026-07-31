package androidx.compose.ui.layout;

import U.q;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;
import r0.C0920q;
import r0.InterfaceC0884F;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(InterfaceC0884F interfaceC0884F) {
        Object t3 = interfaceC0884F.t();
        C0920q c0920q = t3 instanceof C0920q ? (C0920q) t3 : null;
        if (c0920q != null) {
            return c0920q.f8171q;
        }
        return null;
    }

    public static final q b(q qVar, InterfaceC0427f interfaceC0427f) {
        return qVar.i(new LayoutElement(interfaceC0427f));
    }

    public static final q c(q qVar, String str) {
        return qVar.i(new LayoutIdElement(str));
    }

    public static final q d(q qVar, InterfaceC0424c interfaceC0424c) {
        return qVar.i(new OnGloballyPositionedElement(interfaceC0424c));
    }

    public static final q e(q qVar, InterfaceC0424c interfaceC0424c) {
        return qVar.i(new OnSizeChangedModifier(interfaceC0424c));
    }
}
