package androidx.compose.ui.focus;

import U.q;
import Z.p;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(p pVar) {
        return new FocusRequesterElement(pVar);
    }

    public static final q b(q qVar, InterfaceC0424c interfaceC0424c) {
        return qVar.i(new FocusChangedElement(interfaceC0424c));
    }
}
