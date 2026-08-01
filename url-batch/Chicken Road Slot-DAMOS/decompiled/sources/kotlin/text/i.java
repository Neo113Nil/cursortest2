package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.collections.z;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class i extends h {
    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        e eVar = new e(str);
        int i3 = 0;
        while (eVar.hasNext()) {
            String str2 = (String) eVar.next();
            str2.getClass();
            if (!StringsKt.r(str2)) {
                str2 = "    ".concat(str2);
            } else if (str2.length() < 4) {
                str2 = "    ";
            }
            i3++;
            if (i3 > 1) {
                sb2.append((CharSequence) "\n");
            }
            h.a(sb2, str2, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static String c(String str) {
        Comparable comparable;
        String str2;
        List s3 = StringsKt.s(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : s3) {
            if (!StringsKt.r((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z.j(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (!CharsKt.a(str3.charAt(i11))) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                i11 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i11));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        s3.size();
        int size2 = s3.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : s3) {
            int i12 = i3 + 1;
            if (i3 < 0) {
                y.i();
                throw null;
            }
            String str4 = (String) obj3;
            if ((i3 == 0 || i3 == size2) && StringsKt.r(str4)) {
                str2 = null;
            } else {
                str4.getClass();
                if (intValue < 0) {
                    a2.r.h(n0.l.f(intValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i3 = i12;
        }
        StringBuilder sb2 = new StringBuilder(length2);
        CollectionsKt.A(arrayList3, sb2, "\n", null, 124);
        return sb2.toString();
    }

    public static String d(String str) {
        if (StringsKt.r("|")) {
            a1.e("marginPrefix must be non-blank string.");
            return null;
        }
        List s3 = StringsKt.s(str);
        int length = str.length();
        s3.size();
        int size = s3.size() - 1;
        ArrayList arrayList = new ArrayList();
        Iterator it = s3.iterator();
        int i3 = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                CollectionsKt.A(arrayList, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i10 = i3 + 1;
            if (i3 < 0) {
                y.i();
                throw null;
            }
            String str3 = (String) next;
            if ((i3 != 0 && i3 != size) || !StringsKt.r(str3)) {
                int length2 = str3.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!CharsKt.a(str3.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && str3.startsWith("|", i11)) {
                    str2 = str3.substring("|".length() + i11);
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i3 = i10;
        }
    }
}
