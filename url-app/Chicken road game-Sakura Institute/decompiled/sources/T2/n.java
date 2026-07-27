package T2;

import e.C0554e;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public class n extends k {
    public static a b(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return c(new J2.o(it));
    }

    public static a c(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (!(sequence instanceof a)) {
            sequence = new a(sequence);
        }
        return (a) sequence;
    }

    public static Sequence d() {
        return e.f4040a;
    }

    public static a e() {
        C0554e nextFunction = C0554e.f6146d;
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return c(new s(nextFunction, new l(1)));
    }

    public static Sequence f(Object obj, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? e.f4040a : new s(new m(obj), nextFunction);
    }
}
