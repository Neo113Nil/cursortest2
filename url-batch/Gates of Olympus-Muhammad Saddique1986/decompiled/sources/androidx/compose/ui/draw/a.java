package androidx.compose.ui.draw;

import U.b;
import U.d;
import U.q;
import b0.C0344m;
import e2.InterfaceC0424c;
import g0.AbstractC0437b;
import r0.C0888J;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(InterfaceC0424c interfaceC0424c) {
        return new DrawBehindElement(interfaceC0424c);
    }

    public static final q b(q qVar, InterfaceC0424c interfaceC0424c) {
        return qVar.i(new DrawWithCacheElement(interfaceC0424c));
    }

    public static final q c(q qVar, InterfaceC0424c interfaceC0424c) {
        return qVar.i(new DrawWithContentElement(interfaceC0424c));
    }

    public static q d(float f3, int i3, d dVar, q qVar, C0344m c0344m, AbstractC0437b abstractC0437b, C0888J c0888j) {
        if ((i3 & 4) != 0) {
            dVar = b.f4465h;
        }
        d dVar2 = dVar;
        if ((i3 & 16) != 0) {
            f3 = 1.0f;
        }
        return qVar.i(new PainterElement(abstractC0437b, true, dVar2, c0888j, f3, c0344m));
    }
}
