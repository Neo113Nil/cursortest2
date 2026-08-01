package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class db extends jb {
    public static final void d0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, u40 u40Var) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            j8.c(sb, obj, u40Var);
        }
        sb.append(charSequence3);
    }

    public static byte[] e0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static List f0(List list) {
        list.getClass();
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : l70.z(list.get(0)) : vh.f;
    }
}
