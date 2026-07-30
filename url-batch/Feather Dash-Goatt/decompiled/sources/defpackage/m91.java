package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class m91 extends k91 {
    public static yy c(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new yy(new yy(sequence, function1), new k61(8), 0);
    }

    public static List d(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return nv.d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return yh.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
