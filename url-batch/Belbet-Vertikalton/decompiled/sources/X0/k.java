package X0;

import i1.InterfaceC0192l;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends q {
    public static final void o0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC0192l interfaceC0192l) {
        j1.h.e(charSequence, "separator");
        j1.h.e(charSequence2, "prefix");
        j1.h.e(charSequence3, "postfix");
        j1.h.e(charSequence4, "truncated");
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
                H1.l.c(sb, obj, interfaceC0192l);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static byte[] q0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void r0(Iterable iterable, AbstractCollection abstractCollection) {
        j1.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List s0(Iterable iterable) {
        ArrayList arrayList;
        j1.h.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        t tVar = t.f1385a;
        if (!z2) {
            if (z2) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                r0(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : H1.l.I(arrayList.get(0)) : tVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return tVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return H1.l.I(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }
}
