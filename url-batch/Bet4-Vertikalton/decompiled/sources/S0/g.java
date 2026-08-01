package S0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g extends m {
    public static final void B0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, c1.l lVar) {
        d1.d.e(charSequence, "separator");
        d1.d.e(charSequence2, "prefix");
        d1.d.e(charSequence3, "postfix");
        d1.d.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : collection) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                h1.d.b(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static ArrayList C0(List list, List list2) {
        d1.d.e(list, "<this>");
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static byte[] D0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static List E0(Collection collection) {
        d1.d.e(collection, "<this>");
        int size = collection.size();
        if (size == 0) {
            return p.f795a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return w1.d.Y(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
    }
}
