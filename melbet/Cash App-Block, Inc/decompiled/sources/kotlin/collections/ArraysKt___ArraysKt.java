package kotlin.collections;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__AppendableKt;

/* loaded from: classes.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static Sequence asSequence(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? EmptySequence.INSTANCE : new LinesSequence(objArr, 4);
    }

    public static boolean contains(long[] jArr, long j) {
        jArr.getClass();
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (j == jArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static List filterNotNull(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object first(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Array is empty.");
        return null;
    }

    public static Object firstOrNull(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static IntRange getIndices(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static int getLastIndex(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Integer getOrNull(int i, int[] iArr) {
        iArr.getClass();
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static int indexOf(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void joinTo(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            StringsKt__AppendableKt.appendElement(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static String joinToString$default(byte[] bArr, String str, Function1 function1, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            function1 = null;
        }
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static Object last(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Array is empty.");
        return null;
    }

    public static int lastIndexOf(Object[] objArr, Object obj) {
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Float lastOrNull(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static void reverse(Object[] objArr) {
        objArr.getClass();
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = objArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Object obj = objArr[i];
            objArr[i] = objArr[length2];
            objArr[length2] = obj;
            length2--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static Object single(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        a$$ExternalSyntheticBUOutline0.m$3("Array has more than one element.");
        return null;
    }

    public static byte[] sliceArray(byte[] bArr, IntRange intRange) {
        bArr.getClass();
        intRange.getClass();
        return intRange.isEmpty() ? new byte[0] : ArraysKt___ArraysJvmKt.copyOfRange(bArr, intRange.first, intRange.last + 1);
    }

    public static List sortedWith(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static int sum(int[] iArr) {
        iArr.getClass();
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static final void toCollection(Object[] objArr, java.util.AbstractSet abstractSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List toList(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static ArrayList toMutableList(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new ArrayAsCollection(objArr, false));
    }

    public static Set toSet(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.INSTANCE;
        }
        if (length == 1) {
            return SetsKt__SetsJVMKt.setOf(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(objArr.length));
        toCollection(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList zip(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static int first(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Array is empty.");
        return 0;
    }

    public static Object getOrNull(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static Character lastOrNull(char[] cArr) {
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static boolean contains(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean contains(Object[] objArr, Object obj) {
        objArr.getClass();
        return indexOf(objArr, obj) >= 0;
    }

    public static char single(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        a$$ExternalSyntheticBUOutline0.m$3("Array has more than one element.");
        return (char) 0;
    }

    public static boolean contains(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static List toList(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length != 1) {
            List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
            asList.getClass();
            return asList;
        }
        return CollectionsKt__CollectionsJVMKt.listOf(objArr[0]);
    }

    public static List toList(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length != 1) {
            ArrayList arrayList = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList.add(Long.valueOf(j));
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[0]));
    }

    public static List toList(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length != 1) {
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f : fArr) {
                arrayList.add(Float.valueOf(f));
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[0]));
    }

    public static List toList(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length != 1) {
            ArrayList arrayList = new ArrayList(zArr.length);
            for (boolean z : zArr) {
                arrayList.add(Boolean.valueOf(z));
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[0]));
    }

    public static String joinToString$default(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        joinTo(objArr, sb, str4, str5, str6, "...", function1);
        return sb.toString();
    }

    public static String joinToString$default(char[] cArr) {
        cArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (char c : cArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) " ");
            }
            sb.append(c);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
