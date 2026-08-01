package Q0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d extends j {
    public static byte[] x0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static List y0(List list) {
        X0.e.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : q1.d.W(list.get(0)) : m.f664a;
    }
}
