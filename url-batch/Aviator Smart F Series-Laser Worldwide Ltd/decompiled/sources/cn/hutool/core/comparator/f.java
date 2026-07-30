package cn.hutool.core.comparator;

import java.util.Comparator;

/* loaded from: classes.dex */
public class f implements Comparator {
    public static final f INSTANCE = new f();

    @Override // java.util.Comparator
    public int compare(CharSequence charSequence, CharSequence charSequence2) {
        int compare = Integer.compare(charSequence.length(), charSequence2.length());
        return compare == 0 ? d.compare(charSequence.toString(), charSequence2.toString()) : compare;
    }
}
