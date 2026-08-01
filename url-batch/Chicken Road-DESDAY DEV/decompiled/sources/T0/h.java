package T0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends n {
    public static final void x0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, a1.l lVar) {
        b1.d.e(charSequence, "separator");
        b1.d.e(charSequence2, "prefix");
        b1.d.e(charSequence3, "postfix");
        b1.d.e(charSequence4, "truncated");
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
                u1.l.f(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String y0(Collection collection, String str, String str2, String str3, a.o oVar, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            oVar = null;
        }
        b1.d.e(str4, "prefix");
        b1.d.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        x0(collection, sb, str, str4, str5, -1, "...", oVar);
        String sb2 = sb.toString();
        b1.d.d(sb2, "toString(...)");
        return sb2;
    }

    public static List z0(List list) {
        b1.d.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : u1.d.a0(list.get(0)) : q.f829a;
    }
}
