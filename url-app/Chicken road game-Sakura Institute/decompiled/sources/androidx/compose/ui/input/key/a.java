package androidx.compose.ui.input.key;

import S.o;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(Function1 function1) {
        return new KeyInputElement(function1, null);
    }

    public static final o b(o oVar, Function1 function1) {
        return oVar.h(new KeyInputElement(null, function1));
    }
}
