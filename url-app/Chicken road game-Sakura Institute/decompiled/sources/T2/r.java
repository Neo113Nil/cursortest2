package T2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import z2.C1405I;
import z2.C1440x;

/* loaded from: classes.dex */
public class r extends o {
    public static g g(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        q predicate = q.f4053d;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new g(sVar);
    }

    public static Object h(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        f fVar = new f(gVar);
        if (fVar.hasNext()) {
            return fVar.next();
        }
        return null;
    }

    public static s i(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new s(sequence, transform, 1);
    }

    public static g j(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return g(new s(sequence, transform, 1));
    }

    public static List k(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return C1405I.f11931d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C1440x.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
