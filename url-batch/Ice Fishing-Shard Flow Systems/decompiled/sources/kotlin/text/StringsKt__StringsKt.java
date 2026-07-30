package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.D;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes.dex */
public class StringsKt__StringsKt extends p {
    public static final int m(int i2, CharSequence charSequence, String string, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z7 || !(charSequence instanceof String)) ? n(charSequence, string, i2, charSequence.length(), z7, false) : ((String) charSequence).indexOf(string, i2);
    }

    public static final int n(CharSequence charSequence, CharSequence charSequence2, int i2, int i5, boolean z7, boolean z8) {
        kotlin.ranges.a aVar;
        if (z8) {
            int w4 = StringsKt.w(charSequence);
            if (i2 > w4) {
                i2 = w4;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            kotlin.ranges.a.f6172l.getClass();
            aVar = new kotlin.ranges.a(i2, i5, -1);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i5 > length) {
                i5 = length;
            }
            aVar = new IntRange(i2, i5, 1);
        }
        boolean z9 = charSequence instanceof String;
        int i7 = aVar.f6175i;
        int i8 = aVar.f6174e;
        int i9 = aVar.f6173d;
        if (!z9 || !(charSequence2 instanceof String)) {
            boolean z10 = z7;
            if ((i7 > 0 && i9 <= i8) || (i7 < 0 && i8 <= i9)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z11 = z10;
                    z10 = z11;
                    if (!p(charSequence4, 0, charSequence3, i9, charSequence2.length(), z11)) {
                        if (i9 == i8) {
                            break;
                        }
                        i9 += i7;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i9;
                    }
                }
            }
        } else if ((i7 > 0 && i9 <= i8) || (i7 < 0 && i8 <= i9)) {
            int i10 = i9;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z7;
                if (!p.h(0, i10, str.length(), str, (String) charSequence, z12)) {
                    if (i10 == i8) {
                        break;
                    }
                    i10 += i7;
                    z7 = z12;
                } else {
                    return i10;
                }
            }
        }
        return -1;
    }

    public static final int o(CharSequence charSequence, char[] chars, int i2, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.p.p(chars), i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int w4 = StringsKt.w(charSequence);
        if (i2 > w4) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i2);
            for (char c7 : chars) {
                if (a.b(c7, charAt, z7)) {
                    return i2;
                }
            }
            if (i2 == w4) {
                return -1;
            }
            i2++;
        }
    }

    public static final boolean p(CharSequence charSequence, int i2, CharSequence other, int i5, int i7, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i5 < 0 || i2 < 0 || i2 > charSequence.length() - i7 || i5 > other.length() - i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!a.b(charSequence.charAt(i2 + i8), other.charAt(i5 + i8), z7)) {
                return false;
            }
        }
        return true;
    }

    public static final void q(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C4.p.g(i2, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List r(int i2, CharSequence charSequence, String str, boolean z7) {
        q(i2);
        int i5 = 0;
        int m2 = m(0, charSequence, str, z7);
        if (m2 == -1 || i2 == 1) {
            return kotlin.collections.q.b(charSequence.toString());
        }
        boolean z8 = i2 > 0;
        int i7 = 10;
        if (z8 && i2 <= 10) {
            i7 = i2;
        }
        ArrayList arrayList = new ArrayList(i7);
        do {
            arrayList.add(charSequence.subSequence(i5, m2).toString());
            i5 = str.length() + m2;
            if (z8 && arrayList.size() == i2 - 1) {
                break;
            }
            m2 = m(i5, charSequence, str, z7);
        } while (m2 != -1);
        arrayList.add(charSequence.subSequence(i5, charSequence.length()).toString());
        return arrayList;
    }

    public static List split$default(CharSequence charSequence, String[] delimiters, final boolean z7, int i2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z7 = false;
        }
        if ((i5 & 4) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return r(i2, charSequence, str, z7);
            }
        }
        q(i2);
        final List b7 = kotlin.collections.o.b(delimiters);
        c cVar = new c(charSequence, i2, new Function2() { // from class: kotlin.text.q
            /* JADX WARN: Removed duplicated region for block: B:12:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x00ff A[RETURN] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj2, Object obj3) {
                Object obj4;
                Pair pair;
                boolean z8;
                Object obj5;
                CharSequence DelimitedRangesSequence = (CharSequence) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = b7;
                boolean z9 = z7;
                if (z9 || list.size() != 1) {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    IntRange intRange = new IntRange(intValue, DelimitedRangesSequence.length(), 1);
                    boolean z10 = DelimitedRangesSequence instanceof String;
                    int i7 = intRange.f6175i;
                    int i8 = intRange.f6174e;
                    if (z10) {
                        if ((i7 > 0 && intValue <= i8) || (i7 < 0 && i8 <= intValue)) {
                            int i9 = intValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z8 = z9;
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = it.next();
                                    String str2 = (String) obj5;
                                    z8 = z9;
                                    if (p.h(0, i9, str2.length(), str2, (String) DelimitedRangesSequence, z8)) {
                                        break;
                                    }
                                    z9 = z8;
                                }
                                String str3 = (String) obj5;
                                if (str3 == null) {
                                    if (i9 == i8) {
                                        break;
                                    }
                                    i9 += i7;
                                    z9 = z8;
                                } else {
                                    pair = new Pair(Integer.valueOf(i9), str3);
                                    break;
                                }
                            }
                            if (pair == null) {
                                return new Pair(pair.f6112d, Integer.valueOf(((String) pair.f6113e).length()));
                            }
                            return null;
                        }
                        pair = null;
                        if (pair == null) {
                        }
                    } else {
                        if ((i7 > 0 && intValue <= i8) || (i7 < 0 && i8 <= intValue)) {
                            int i10 = intValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj4 = null;
                                        break;
                                    }
                                    obj4 = it2.next();
                                    String str4 = (String) obj4;
                                    if (StringsKt__StringsKt.p(str4, 0, DelimitedRangesSequence, i10, str4.length(), z9)) {
                                        break;
                                    }
                                }
                                String str5 = (String) obj4;
                                if (str5 == null) {
                                    if (i10 == i8) {
                                        break;
                                    }
                                    i10 += i7;
                                } else {
                                    pair = new Pair(Integer.valueOf(i10), str5);
                                    break;
                                }
                            }
                            if (pair == null) {
                            }
                        }
                        pair = null;
                        if (pair == null) {
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str6 = (String) list.get(0);
                    int y7 = StringsKt.y(DelimitedRangesSequence, str6, intValue, false, 4);
                    if (y7 >= 0) {
                        pair = new Pair(Integer.valueOf(y7), str6);
                        if (pair == null) {
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                }
            }
        });
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        D d7 = new D(cVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.s.g(d7, 10));
        Iterator it = d7.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) bVar.next();
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(charSequence.subSequence(range.f6173d, range.f6174e + 1).toString());
        }
    }
}
