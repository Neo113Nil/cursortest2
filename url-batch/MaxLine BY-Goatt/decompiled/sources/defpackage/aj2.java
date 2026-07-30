package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class aj2 extends zi2 {
    public static t10 b(Iterator it) {
        it.getClass();
        return new t10(new yv(2, it));
    }

    public static Sequence c(Object obj, Function1 function1) {
        return obj == null ? eh0.a : new ps2(new dj(12, obj), function1);
    }
}
