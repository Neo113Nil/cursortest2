package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface tl1 extends vl1 {
    @Override // defpackage.vl1
    default boolean b(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // defpackage.vl1
    default Object d(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
