package kotlin.text;

import androidx.paging.internal.CopyOnWriteArrayList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    public static final Pair findAnyOf$StringsKt__StringsKt(CharSequence charSequence, Collection collection, int i, boolean z) {
        CharSequence charSequence2;
        Object obj;
        boolean z2;
        Object obj2;
        if (z || collection.size() != 1) {
            if (i < 0) {
                i = 0;
            }
            IntRange intRange = new IntRange(i, charSequence.length(), 1);
            boolean z3 = charSequence instanceof String;
            int i2 = intRange.step;
            int i3 = intRange.last;
            if (z3) {
                if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                    int i4 = i;
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = z;
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            boolean z4 = z;
                            boolean regionMatches = StringsKt__StringsJVMKt.regionMatches(0, i4, str.length(), str, (String) charSequence, z4);
                            z2 = z4;
                            if (regionMatches) {
                                break;
                            }
                            z = z2;
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (i4 == i3) {
                                break;
                            }
                            i4 += i2;
                            z = z2;
                        } else {
                            return new Pair(Integer.valueOf(i4), str2);
                        }
                    }
                }
            } else if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                int i5 = i;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence;
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str3 = (String) obj;
                        charSequence2 = charSequence;
                        if (regionMatchesImpl(str3, z, 0, charSequence2, i5, str3.length())) {
                            break;
                        }
                        charSequence = charSequence2;
                    }
                    String str4 = (String) obj;
                    if (str4 == null) {
                        if (i5 == i3) {
                            break;
                        }
                        i5 += i2;
                        charSequence = charSequence2;
                    } else {
                        return new Pair(Integer.valueOf(i5), str4);
                    }
                }
            }
        } else {
            String str5 = (String) CollectionsKt.single(collection);
            int indexOf$default = StringsKt.indexOf$default(charSequence, str5, i, false, 4);
            if (indexOf$default >= 0) {
                return new Pair(Integer.valueOf(indexOf$default), str5);
            }
        }
        return null;
    }

    public static final boolean hasSurrogatePairAt(int i, CharSequence charSequence) {
        charSequence.getClass();
        return i >= 0 && i <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static final int indexOf(int i, CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? indexOf$StringsKt__StringsKt(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int indexOf$StringsKt__StringsKt(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        IntProgression downTo;
        if (z2) {
            int lastIndex = StringsKt.getLastIndex(charSequence);
            if (i > lastIndex) {
                i = lastIndex;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            downTo = RangesKt___RangesKt.downTo(i, i2);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            downTo = new IntRange(i, i2, 1);
        }
        int i3 = downTo.step;
        int i4 = downTo.last;
        int i5 = downTo.first;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z3 = z;
                if (StringsKt__StringsJVMKt.regionMatches(0, i6, str.length(), str, (String) charSequence, z3)) {
                    return i6;
                }
                if (i6 == i4) {
                    return -1;
                }
                i6 += i3;
                z = z3;
            }
        } else {
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            int i7 = i5;
            while (true) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (regionMatchesImpl(charSequence4, z, 0, charSequence3, i7, charSequence2.length())) {
                    return i7;
                }
                if (i7 == i4) {
                    return -1;
                }
                i7 += i3;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static final int indexOfAny(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt___ArraysKt.single(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (CharsKt__CharKt.equals(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static DelimitedRangesSequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, final char[] cArr, int i) {
        requireNonNegativeLimit(i);
        return new DelimitedRangesSequence(charSequence, i, new Function2() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                charSequence2.getClass();
                int indexOfAny = StringsKt__StringsKt.indexOfAny(charSequence2, cArr, intValue, false);
                if (indexOfAny < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(indexOfAny), 1);
            }
        });
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2, int i3) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!CharsKt__CharKt.equals(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void requireNonNegativeLimit(int i) {
        if (i >= 0) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Limit must be non-negative, but was "));
    }

    public static final List split$StringsKt__StringsKt(int i, CharSequence charSequence, String str, boolean z) {
        requireNonNegativeLimit(i);
        int i2 = 0;
        int indexOf = indexOf(0, charSequence, str, z);
        if (indexOf == -1 || i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, indexOf).toString());
            i2 = str.length() + indexOf;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            indexOf = indexOf(i2, charSequence, str, z);
        } while (indexOf != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static List split$default(CharSequence charSequence, String[] strArr, final boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        strArr.getClass();
        int i3 = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return split$StringsKt__StringsKt(i, charSequence, str, z);
            }
        }
        requireNonNegativeLimit(i);
        final List asList = Arrays.asList(strArr);
        asList.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(new DelimitedRangesSequence(charSequence, i, new Function2() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                CharSequence charSequence2 = (CharSequence) obj2;
                int intValue = ((Integer) obj3).intValue();
                charSequence2.getClass();
                Pair findAnyOf$StringsKt__StringsKt = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(charSequence2, asList, intValue, z);
                if (findAnyOf$StringsKt__StringsKt != null) {
                    return new Pair(findAnyOf$StringsKt__StringsKt.first, Integer.valueOf(((String) findAnyOf$StringsKt__StringsKt.second).length()));
                }
                return null;
            }
        }), i3);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(copyOnWriteArrayList, 10));
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static boolean startsWith$default(CharSequence charSequence, String str) {
        str.getClass();
        charSequence.getClass();
        return charSequence instanceof String ? StringsKt__StringsJVMKt.startsWith(str, (String) charSequence, false) : regionMatchesImpl(str, false, 0, charSequence, 0, charSequence.length());
    }

    public static final String substring(CharSequence charSequence, IntRange intRange) {
        charSequence.getClass();
        intRange.getClass();
        return charSequence.subSequence(intRange.first, intRange.last + 1).toString();
    }
}
