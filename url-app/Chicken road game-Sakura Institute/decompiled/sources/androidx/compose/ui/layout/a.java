package androidx.compose.ui.layout;

import L2.c;
import S.o;
import kotlin.jvm.functions.Function1;
import p0.C0981q;
import p0.InterfaceC0944E;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(InterfaceC0944E interfaceC0944E) {
        Object r2 = interfaceC0944E.r();
        C0981q c0981q = r2 instanceof C0981q ? (C0981q) r2 : null;
        if (c0981q != null) {
            return c0981q.f9055t;
        }
        return null;
    }

    public static final o b(c cVar) {
        return new LayoutElement(cVar);
    }

    public static final o c(o oVar, String str) {
        return oVar.h(new LayoutIdElement(str));
    }

    public static final o d(o oVar, Function1 function1) {
        return oVar.h(new OnGloballyPositionedElement(function1));
    }

    public static final o e(o oVar, Function1 function1) {
        return oVar.h(new OnSizeChangedModifier(function1));
    }
}
