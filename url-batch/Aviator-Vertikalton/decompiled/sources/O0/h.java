package O0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends n {
    public static final void f0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, W0.l lVar) {
        X0.f.e(charSequence, "separator");
        X0.f.e(charSequence2, "prefix");
        X0.f.e(charSequence3, "postfix");
        X0.f.e(charSequence4, "truncated");
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
                q1.l.c(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static byte[] g0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static List h0(List list) {
        X0.f.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : q1.d.M(list.get(0)) : q.f694a;
    }
}
