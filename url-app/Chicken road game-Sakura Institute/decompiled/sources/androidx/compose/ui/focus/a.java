package androidx.compose.ui.focus;

import S.o;
import X.p;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(p pVar) {
        return new FocusRequesterElement(pVar);
    }

    public static final o b(o oVar, Function1 function1) {
        return oVar.h(new FocusChangedElement(function1));
    }
}
