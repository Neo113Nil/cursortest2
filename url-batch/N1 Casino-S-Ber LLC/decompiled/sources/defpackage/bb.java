package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bb extends hb {
    public static final void I0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, l40 l40Var) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            jw.c(sb, obj, l40Var);
        }
        sb.append(charSequence3);
    }

    public static byte[] J0(ArrayList arrayList) {
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

    public static List K0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        if (size == 0) {
            return di.f;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return o8.U(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
    }
}
