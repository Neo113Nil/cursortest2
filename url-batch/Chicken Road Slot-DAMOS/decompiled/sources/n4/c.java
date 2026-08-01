package n4;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7037q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, boolean z10) {
        super(z10);
        this.f7037q = i3;
    }

    public static float[] j(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] k(String str) {
        return new int[]{((Number) f0.f7044b.d(str)).intValue()};
    }

    public static long[] l(String str) {
        return new long[]{((Number) f0.f7047e.d(str)).longValue()};
    }

    public static boolean[] m(String str) {
        return new boolean[]{((Boolean) f0.f7051k.d(str)).booleanValue()};
    }

    @Override // n4.f0
    public final Object a(String str, Bundle bundle) {
        switch (this.f7037q) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                c6.f.Q(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return kotlin.collections.w.w(booleanArray2);
                }
                c6.f.Q(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                c6.f.Q(str);
                throw null;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return kotlin.collections.w.s(floatArray2);
                }
                c6.f.Q(str);
                throw null;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                c6.f.Q(str);
                throw null;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return kotlin.collections.w.t(intArray2);
                }
                c6.f.Q(str);
                throw null;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                c6.f.Q(str);
                throw null;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return kotlin.collections.w.u(longArray2);
                }
                c6.f.Q(str);
                throw null;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                bundle.getClass();
                str.getClass();
                if (!a.a.k(str, bundle) || a.a.N(str, bundle)) {
                    return null;
                }
                return a.a.K(str, bundle);
            default:
                bundle.getClass();
                str.getClass();
                if (!a.a.k(str, bundle) || a.a.N(str, bundle)) {
                    return null;
                }
                return kotlin.collections.w.v(a.a.K(str, bundle));
        }
    }

    @Override // n4.f0
    public final String b() {
        switch (this.f7037q) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "List<Float>";
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return "integer[]";
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return "List<Int>";
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "long[]";
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "List<Long>";
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // n4.f0
    public final Object c(Object obj, String str) {
        switch (this.f7037q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return m(str);
                }
                boolean[] m10 = m(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(m10, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                d dVar = f0.f7051k;
                return list != null ? CollectionsKt.G(list, kotlin.collections.x.c(dVar.d(str))) : kotlin.collections.x.c(dVar.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return j(str);
                }
                float[] j = j(str);
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(j, 0, copyOf2, length2, 1);
                return copyOf2;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list2 = (List) obj;
                return list2 != null ? CollectionsKt.G(list2, kotlin.collections.x.c(Float.valueOf(Float.parseFloat(str)))) : kotlin.collections.x.c(Float.valueOf(Float.parseFloat(str)));
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return k(str);
                }
                int[] k10 = k(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(k10, 0, copyOf3, length3, 1);
                return copyOf3;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list3 = (List) obj;
                d dVar2 = f0.f7044b;
                return list3 != null ? CollectionsKt.G(list3, kotlin.collections.x.c(dVar2.d(str))) : kotlin.collections.x.c(dVar2.d(str));
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return l(str);
                }
                long[] l10 = l(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(l10, 0, copyOf4, length4, 1);
                return copyOf4;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list4 = (List) obj;
                d dVar3 = f0.f7047e;
                return list4 != null ? CollectionsKt.G(list4, kotlin.collections.x.c(dVar3.d(str))) : kotlin.collections.x.c(dVar3.d(str));
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                return (String[]) copyOf5;
            default:
                List list5 = (List) obj;
                return list5 != null ? CollectionsKt.G(list5, kotlin.collections.x.c(str)) : kotlin.collections.x.c(str);
        }
    }

    @Override // n4.f0
    public final Object d(String str) {
        switch (this.f7037q) {
            case 0:
                return m(str);
            case 1:
                return kotlin.collections.x.c(f0.f7051k.d(str));
            case 2:
                return j(str);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return kotlin.collections.x.c(Float.valueOf(Float.parseFloat(str)));
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return k(str);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return kotlin.collections.x.c(f0.f7044b.d(str));
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return l(str);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return kotlin.collections.x.c(f0.f7047e.d(str));
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new String[]{str};
            default:
                return kotlin.collections.x.c(str);
        }
    }

    @Override // n4.f0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f7037q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, zArr);
                    break;
                }
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, CollectionsKt.N(list));
                    break;
                }
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putFloatArray(str, fArr);
                    break;
                }
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    float[] fArr2 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        fArr2[i3] = ((Number) it.next()).floatValue();
                        i3++;
                    }
                    bundle.putFloatArray(str, fArr2);
                    break;
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putIntArray(str, iArr);
                    break;
                }
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, CollectionsKt.P(list3));
                    break;
                }
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putLongArray(str, jArr);
                    break;
                }
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    long[] jArr2 = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    int i10 = 0;
                    while (it2.hasNext()) {
                        jArr2[i10] = ((Number) it2.next()).longValue();
                        i10++;
                    }
                    bundle.putLongArray(str, jArr2);
                    break;
                }
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putStringArray(str, strArr);
                    break;
                }
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                    break;
                }
        }
    }

    @Override // n4.f0
    public final boolean g(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.f7037q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        boolArr2[i10] = Boolean.valueOf(zArr2[i10]);
                    }
                }
                return kotlin.collections.u.a(boolArr, boolArr2);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return kotlin.collections.u.a(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
            case 2:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        fArr[i11] = Float.valueOf(fArr2[i11]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i12 = 0; i12 < length4; i12++) {
                        fArr4[i12] = Float.valueOf(fArr3[i12]);
                    }
                }
                return kotlin.collections.u.a(fArr, fArr4);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return kotlin.collections.u.a(list3 != null ? (Float[]) list3.toArray(new Float[0]) : null, list4 != null ? (Float[]) list4.toArray(new Float[0]) : null);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i13 = 0; i13 < length5; i13++) {
                        numArr[i13] = Integer.valueOf(iArr[i13]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i14 = 0; i14 < length6; i14++) {
                        numArr2[i14] = Integer.valueOf(iArr2[i14]);
                    }
                }
                return kotlin.collections.u.a(numArr, numArr2);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return kotlin.collections.u.a(list5 != null ? (Integer[]) list5.toArray(new Integer[0]) : null, list6 != null ? (Integer[]) list6.toArray(new Integer[0]) : null);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i15 = 0; i15 < length7; i15++) {
                        lArr[i15] = Long.valueOf(jArr[i15]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i16 = 0; i16 < length8; i16++) {
                        lArr2[i16] = Long.valueOf(jArr2[i16]);
                    }
                }
                return kotlin.collections.u.a(lArr, lArr2);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return kotlin.collections.u.a(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return kotlin.collections.u.a((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return kotlin.collections.u.a(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }

    @Override // n4.e
    public final Object h() {
        switch (this.f7037q) {
            case 0:
                return new boolean[0];
            case 1:
                return j0.f5574d;
            case 2:
                return new float[0];
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return j0.f5574d;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return new int[0];
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return j0.f5574d;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new long[0];
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return j0.f5574d;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new String[0];
            default:
                return j0.f5574d;
        }
    }

    @Override // n4.e
    public final List i(Object obj) {
        List w6;
        List s3;
        List t6;
        List u2;
        switch (this.f7037q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null && (w6 = kotlin.collections.w.w(zArr)) != null) {
                    ArrayList arrayList = new ArrayList(kotlin.collections.z.j(w6, 10));
                    Iterator it = w6.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.z.j(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null && (s3 = kotlin.collections.w.s(fArr)) != null) {
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.z.j(s3, 10));
                    Iterator it3 = s3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(String.valueOf(((Number) it3.next()).floatValue()));
                    }
                    break;
                } else {
                    break;
                }
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.z.j(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(String.valueOf(((Number) it4.next()).floatValue()));
                    }
                    break;
                } else {
                    break;
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                int[] iArr = (int[]) obj;
                if (iArr != null && (t6 = kotlin.collections.w.t(iArr)) != null) {
                    ArrayList arrayList5 = new ArrayList(kotlin.collections.z.j(t6, 10));
                    Iterator it5 = t6.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(String.valueOf(((Number) it5.next()).intValue()));
                    }
                    break;
                } else {
                    break;
                }
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list3 = (List) obj;
                if (list3 != null) {
                    ArrayList arrayList6 = new ArrayList(kotlin.collections.z.j(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                    break;
                } else {
                    break;
                }
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                long[] jArr = (long[]) obj;
                if (jArr != null && (u2 = kotlin.collections.w.u(jArr)) != null) {
                    ArrayList arrayList7 = new ArrayList(kotlin.collections.z.j(u2, 10));
                    Iterator it7 = u2.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(String.valueOf(((Number) it7.next()).longValue()));
                    }
                    break;
                } else {
                    break;
                }
                break;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list4 = (List) obj;
                if (list4 != null) {
                    ArrayList arrayList8 = new ArrayList(kotlin.collections.z.j(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        arrayList8.add(String.valueOf(((Number) it8.next()).longValue()));
                    }
                    break;
                } else {
                    break;
                }
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList9 = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        str.getClass();
                        String encode = Uri.encode(str, null);
                        encode.getClass();
                        arrayList9.add(encode);
                    }
                    break;
                } else {
                    break;
                }
            default:
                List<String> list5 = (List) obj;
                if (list5 != null) {
                    ArrayList arrayList10 = new ArrayList(kotlin.collections.z.j(list5, 10));
                    for (String str2 : list5) {
                        str2.getClass();
                        String encode2 = Uri.encode(str2, null);
                        encode2.getClass();
                        arrayList10.add(encode2);
                    }
                    break;
                } else {
                    break;
                }
        }
        return j0.f5574d;
    }
}
