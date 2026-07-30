package cn.hutool.core.comparator;

import cn.hutool.core.lang.n0;
import cn.hutool.core.text.l;
import cn.hutool.core.util.e0;
import cn.hutool.core.util.p0;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class VersionComparator implements Comparator<String>, Serializable {
    public static final VersionComparator INSTANCE = new VersionComparator();
    private static final long serialVersionUID = 8083701245147495562L;

    @Override // java.util.Comparator
    public int compare(String str, String str2) {
        if (e0.equal(str, str2)) {
            return 0;
        }
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        List<String> split = l.split((CharSequence) str, '.');
        List<String> split2 = l.split((CharSequence) str2, '.');
        int min = Math.min(split.size(), split2.size());
        int i8 = 0;
        for (int i9 = 0; i9 < min; i9++) {
            String str3 = split.get(i9);
            String str4 = split2.get(i9);
            int length = str3.length() - str4.length();
            if (length == 0) {
                i8 = str3.compareTo(str4);
            } else {
                Pattern pattern = n0.NUMBERS;
                i8 = cn.hutool.core.convert.d.toInt(p0.get(pattern, str3, 0), 0).intValue() - cn.hutool.core.convert.d.toInt(p0.get(pattern, str4, 0), 0).intValue();
                if (i8 == 0) {
                    i8 = length;
                }
            }
            if (i8 != 0) {
                break;
            }
        }
        return i8 != 0 ? i8 : split.size() - split2.size();
    }
}
