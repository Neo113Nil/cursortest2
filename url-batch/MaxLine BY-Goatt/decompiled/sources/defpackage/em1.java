package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface em1 extends CoroutineContext.Element {
    Object B(Function1 function1, o30 o30Var);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default g getKey() {
        return qb2.W;
    }
}
