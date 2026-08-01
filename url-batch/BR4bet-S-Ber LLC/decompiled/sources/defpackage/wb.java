package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wb extends cc {
    public static final void m0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, h hVar) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            xf.a(sb, obj, hVar);
        }
        sb.append(charSequence3);
    }

    public static List n0(List list) {
        list.getClass();
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : kr.J(list.get(0)) : ik.f;
    }
}
