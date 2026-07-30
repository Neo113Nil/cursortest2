package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zd extends yk {
    public final /* synthetic */ int BRwzKIf41E4i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(int i, boolean z) {
        super(z);
        this.BRwzKIf41E4i = i;
    }

    public static int[] OPXfSBeufaJ8(String str) {
        return new int[]{((Number) dc1.lS5Rgt96tfkO.Y1f8riQaR6yg(str)).intValue()};
    }

    public static boolean[] dgRBjINgWbAK(String str) {
        return new boolean[]{((Boolean) dc1.dgRBjINgWbAK.Y1f8riQaR6yg(str)).booleanValue()};
    }

    public static long[] wdg6QnbFHrFF(String str) {
        return new long[]{((Number) dc1.e9gEMXR7LXtO.Y1f8riQaR6yg(str)).longValue()};
    }

    @Override // defpackage.dc1
    public final Object PxuCJdSBwIXG(String str, Bundle bundle) {
        switch (this.BRwzKIf41E4i) {
            case 0:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 1:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return na.IxJ9cAW40yOk(booleanArray2);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 2:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 3:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return na.HqMwxkFaipxD(floatArray2);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 4:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 5:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 == null) {
                    xi0.ryVscX7ZL4Ux(str);
                    throw null;
                }
                int length = intArray2.length;
                if (length == 0) {
                    return p50.rtx2ld2ELZv4;
                }
                if (length == 1) {
                    return fx1.jJwa0q7P5wHq(Integer.valueOf(intArray2[0]));
                }
                ArrayList arrayList = new ArrayList(intArray2.length);
                for (int i : intArray2) {
                    arrayList.add(Integer.valueOf(i));
                }
                return arrayList;
            case 6:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 7:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return na.twy4zb2fCtqq(longArray2);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 8:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                return vi0.kpCQ9veP6n3I(str, bundle);
            default:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                return na.OYiFbU3x63rc(vi0.kpCQ9veP6n3I(str, bundle));
        }
    }

    @Override // defpackage.yk
    public final Object RAsUl2FVSrh6() {
        int i = this.BRwzKIf41E4i;
        p50 p50Var = p50.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                return new boolean[0];
            case 1:
                return p50Var;
            case 2:
                return new float[0];
            case 3:
                return p50Var;
            case 4:
                return new int[0];
            case 5:
                return p50Var;
            case 6:
                return new long[0];
            case 7:
                return p50Var;
            case 8:
                return new String[0];
            default:
                return p50Var;
        }
    }

    @Override // defpackage.dc1
    public final Object TSizfFm2Yiuu(Object obj, String str) {
        switch (this.BRwzKIf41E4i) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return dgRBjINgWbAK(str);
                }
                boolean[] dgRBjINgWbAK = dgRBjINgWbAK(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(dgRBjINgWbAK, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                ae aeVar = dc1.dgRBjINgWbAK;
                return list != null ? zk.wcHq2YQJmeHg(list, fx1.jJwa0q7P5wHq(aeVar.Y1f8riQaR6yg(str))) : fx1.jJwa0q7P5wHq(aeVar.Y1f8riQaR6yg(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, copyOf2, length2, 1);
                return copyOf2;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? zk.wcHq2YQJmeHg(list2, fx1.jJwa0q7P5wHq(Float.valueOf(Float.parseFloat(str)))) : fx1.jJwa0q7P5wHq(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return OPXfSBeufaJ8(str);
                }
                int[] OPXfSBeufaJ8 = OPXfSBeufaJ8(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(OPXfSBeufaJ8, 0, copyOf3, length3, 1);
                return copyOf3;
            case 5:
                List list3 = (List) obj;
                ae aeVar2 = dc1.lS5Rgt96tfkO;
                return list3 != null ? zk.wcHq2YQJmeHg(list3, fx1.jJwa0q7P5wHq(aeVar2.Y1f8riQaR6yg(str))) : fx1.jJwa0q7P5wHq(aeVar2.Y1f8riQaR6yg(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return wdg6QnbFHrFF(str);
                }
                long[] wdg6QnbFHrFF = wdg6QnbFHrFF(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(wdg6QnbFHrFF, 0, copyOf4, length4, 1);
                return copyOf4;
            case 7:
                List list4 = (List) obj;
                ae aeVar3 = dc1.e9gEMXR7LXtO;
                return list4 != null ? zk.wcHq2YQJmeHg(list4, fx1.jJwa0q7P5wHq(aeVar3.Y1f8riQaR6yg(str))) : fx1.jJwa0q7P5wHq(aeVar3.Y1f8riQaR6yg(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, copyOf5, length5, 1);
                return (String[]) copyOf5;
            default:
                List list5 = (List) obj;
                return list5 != null ? zk.wcHq2YQJmeHg(list5, fx1.jJwa0q7P5wHq(str)) : fx1.jJwa0q7P5wHq(str);
        }
    }

    @Override // defpackage.dc1
    public final Object Y1f8riQaR6yg(String str) {
        switch (this.BRwzKIf41E4i) {
            case 0:
                return dgRBjINgWbAK(str);
            case 1:
                return fx1.jJwa0q7P5wHq(dc1.dgRBjINgWbAK.Y1f8riQaR6yg(str));
            case 2:
                return new float[]{Float.parseFloat(str)};
            case 3:
                return fx1.jJwa0q7P5wHq(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return OPXfSBeufaJ8(str);
            case 5:
                return fx1.jJwa0q7P5wHq(dc1.lS5Rgt96tfkO.Y1f8riQaR6yg(str));
            case 6:
                return wdg6QnbFHrFF(str);
            case 7:
                return fx1.jJwa0q7P5wHq(dc1.e9gEMXR7LXtO.Y1f8riQaR6yg(str));
            case 8:
                return new String[]{str};
            default:
                return fx1.jJwa0q7P5wHq(str);
        }
    }

    @Override // defpackage.dc1
    public final void e9gEMXR7LXtO(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.BRwzKIf41E4i) {
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
                    bundle.putBooleanArray(str, zk.f(list));
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
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    float[] fArr2 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        fArr2[i] = ((Number) it.next()).floatValue();
                        i++;
                    }
                    bundle.putFloatArray(str, fArr2);
                    break;
                }
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putIntArray(str, iArr);
                    break;
                }
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, zk.h(list3));
                    break;
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putLongArray(str, jArr);
                    break;
                }
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    long[] jArr2 = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        jArr2[i] = ((Number) it2.next()).longValue();
                        i++;
                    }
                    bundle.putLongArray(str, jArr2);
                    break;
                }
            case 8:
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

    @Override // defpackage.dc1
    public final String lS5Rgt96tfkO() {
        switch (this.BRwzKIf41E4i) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, p50] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Iterable] */
    @Override // defpackage.yk
    public final List rtx2ld2ELZv4(Object obj) {
        int i = this.BRwzKIf41E4i;
        int i2 = 0;
        ?? r3 = p50.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    List IxJ9cAW40yOk = na.IxJ9cAW40yOk(zArr);
                    r3 = new ArrayList(al.KZw9XyiywG4x(IxJ9cAW40yOk, 10));
                    Iterator it = IxJ9cAW40yOk.iterator();
                    while (it.hasNext()) {
                        r3.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                    break;
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    r3 = new ArrayList(al.KZw9XyiywG4x(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        r3.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                    }
                    break;
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    List HqMwxkFaipxD = na.HqMwxkFaipxD(fArr);
                    r3 = new ArrayList(al.KZw9XyiywG4x(HqMwxkFaipxD, 10));
                    Iterator it3 = HqMwxkFaipxD.iterator();
                    while (it3.hasNext()) {
                        r3.add(String.valueOf(((Number) it3.next()).floatValue()));
                    }
                    break;
                }
                break;
            case 3:
                List list2 = (List) obj;
                if (list2 != null) {
                    r3 = new ArrayList(al.KZw9XyiywG4x(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        r3.add(String.valueOf(((Number) it4.next()).floatValue()));
                    }
                    break;
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int length = iArr.length;
                    if (length != 0) {
                        if (length != 1) {
                            r3 = new ArrayList(iArr.length);
                            int length2 = iArr.length;
                            while (i2 < length2) {
                                r3.add(Integer.valueOf(iArr[i2]));
                                i2++;
                            }
                        } else {
                            r3 = fx1.jJwa0q7P5wHq(Integer.valueOf(iArr[0]));
                        }
                    }
                    ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(r3, 10));
                    Iterator it5 = r3.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it5.next()).intValue()));
                    }
                    break;
                }
                break;
            case 5:
                List list3 = (List) obj;
                if (list3 != null) {
                    r3 = new ArrayList(al.KZw9XyiywG4x(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        r3.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                    break;
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    List twy4zb2fCtqq = na.twy4zb2fCtqq(jArr);
                    r3 = new ArrayList(al.KZw9XyiywG4x(twy4zb2fCtqq, 10));
                    Iterator it7 = twy4zb2fCtqq.iterator();
                    while (it7.hasNext()) {
                        r3.add(String.valueOf(((Number) it7.next()).longValue()));
                    }
                    break;
                }
                break;
            case 7:
                List list4 = (List) obj;
                if (list4 != null) {
                    r3 = new ArrayList(al.KZw9XyiywG4x(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        r3.add(String.valueOf(((Number) it8.next()).longValue()));
                    }
                    break;
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    r3 = new ArrayList(strArr.length);
                    int length3 = strArr.length;
                    while (i2 < length3) {
                        String str = strArr[i2];
                        str.getClass();
                        String encode = Uri.encode(str, null);
                        encode.getClass();
                        r3.add(encode);
                        i2++;
                    }
                    break;
                }
                break;
            default:
                List<String> list5 = (List) obj;
                if (list5 != null) {
                    r3 = new ArrayList(al.KZw9XyiywG4x(list5, 10));
                    for (String str2 : list5) {
                        str2.getClass();
                        String encode2 = Uri.encode(str2, null);
                        encode2.getClass();
                        r3.add(encode2);
                    }
                    break;
                }
                break;
        }
        return r3;
    }
}
