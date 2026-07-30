package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.ai;
import defpackage.kr;
import defpackage.l91;
import defpackage.lr;
import defpackage.nh0;
import defpackage.nv;
import defpackage.qy0;
import defpackage.ry0;
import defpackage.yh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = ry0.STRING_FIELD_NUMBER, mv = {2, 2, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes.dex */
public class StringsKt__StringsKt extends c {
    public static final int f(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        IntRange intRange = new IntRange(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = intRange.e;
        if (!z2) {
            if (i2 > i3) {
                return -1;
            }
            int i4 = i2;
            while (!i(str, 0, charSequence, i4, str.length(), z)) {
                if (i4 == i3) {
                    return -1;
                }
                i4++;
            }
            return i4;
        }
        if (i2 > i3) {
            return -1;
        }
        int i5 = i2;
        while (true) {
            String str2 = (String) charSequence;
            int length3 = str.length();
            if (!z ? str.regionMatches(0, str2, i5, length3) : str.regionMatches(z, 0, str2, i5, length3)) {
                return i5;
            }
            if (i5 == i3) {
                return -1;
            }
            i5++;
        }
    }

    public static /* synthetic */ int g(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return f(charSequence, str, i, z);
    }

    public static final List h(String str) {
        nh0 nh0Var = new nh0(str);
        if (!nh0Var.hasNext()) {
            return nv.d;
        }
        Object next = nh0Var.next();
        if (!nh0Var.hasNext()) {
            return yh.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (nh0Var.hasNext()) {
            arrayList.add(nh0Var.next());
        }
        return arrayList;
    }

    public static final boolean i(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        int i4;
        char upperCase;
        char upperCase2;
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            for (0; i4 < i3; i4 + 1) {
                char charAt = charSequence.charAt(i + i4);
                char charAt2 = charSequence2.charAt(i2 + i4);
                i4 = (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i4 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static List split$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        int i3 = 0;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                if (i < 0) {
                    throw new IllegalArgumentException(qy0.i(i, "Limit must be non-negative, but was ").toString());
                }
                int f = f(charSequence, str, 0, z);
                if (f == -1 || i == 1) {
                    return yh.b(charSequence.toString());
                }
                boolean z2 = i > 0;
                int i4 = 10;
                if (z2 && i <= 10) {
                    i4 = i;
                }
                ArrayList arrayList = new ArrayList(i4);
                do {
                    arrayList.add(charSequence.subSequence(i3, f).toString());
                    i3 = str.length() + f;
                    if (z2 && arrayList.size() == i - 1) {
                        break;
                    }
                    f = f(charSequence, str, i3, z);
                } while (f != -1);
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                return arrayList;
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException(qy0.i(i, "Limit must be non-negative, but was ").toString());
        }
        List asList = Arrays.asList(strArr);
        asList.getClass();
        l91 l91Var = new l91(new lr(charSequence, i, new d(asList, z)));
        ArrayList arrayList2 = new ArrayList(ai.h(l91Var));
        Iterator it = l91Var.iterator();
        while (true) {
            kr krVar = (kr) it;
            if (!krVar.hasNext()) {
                return arrayList2;
            }
            IntRange intRange = (IntRange) krVar.next();
            intRange.getClass();
            arrayList2.add(charSequence.subSequence(intRange.d, intRange.e + 1).toString());
        }
    }
}
