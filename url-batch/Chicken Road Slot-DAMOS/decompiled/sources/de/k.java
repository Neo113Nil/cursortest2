package de;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class k extends i {
    public static a b(Iterator it) {
        it.getClass();
        return new a(new j(0, it));
    }

    public static Sequence c(Object obj, Function1 function1) {
        return obj == null ? b.f3703a : new d(new a1.b(8, obj), function1, 1);
    }
}
