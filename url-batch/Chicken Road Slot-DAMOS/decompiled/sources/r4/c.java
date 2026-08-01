package r4;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.u;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.collections.z;
import n4.f0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends n4.e {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8148q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, boolean z10) {
        super(z10);
        this.f8148q = i3;
    }

    public static double[] j(String str) {
        return new double[]{Double.valueOf(Double.parseDouble(str)).doubleValue()};
    }

    @Override // n4.f0
    public final Object a(String str, Bundle bundle) {
        switch (this.f8148q) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                c6.f.Q(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return w.r(doubleArray2);
                }
                c6.f.Q(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                String[] K = a.a.K(str, bundle);
                ArrayList arrayList = new ArrayList(K.length);
                for (String str2 : K) {
                    arrayList.add((String) f0.f7054n.d(str2));
                }
                return (String[]) arrayList.toArray(new String[0]);
            default:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || a.a.N(str, bundle)) {
                    return null;
                }
                List v10 = w.v(a.a.K(str, bundle));
                ArrayList arrayList2 = new ArrayList(z.j(v10, 10));
                Iterator it = v10.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) f0.f7054n.d((String) it.next()));
                }
                return arrayList2;
        }
    }

    @Override // n4.f0
    public final String b() {
        switch (this.f8148q) {
            case 0:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n4.f0
    public final Object c(Object obj, String str) {
        switch (this.f8148q) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null) {
                    return j(str);
                }
                double[] j = j(str);
                int length = dArr.length;
                double[] copyOf = Arrays.copyOf(dArr, length + 1);
                System.arraycopy(j, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                return list != null ? CollectionsKt.G(list, x.c(Double.valueOf(Double.parseDouble(str)))) : x.c(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                n4.d dVar = f0.f7054n;
                if (strArr == null) {
                    return new String[]{dVar.d(str)};
                }
                String[] strArr2 = {dVar.d(str)};
                int length2 = strArr.length;
                Object[] copyOf2 = Arrays.copyOf(strArr, length2 + 1);
                System.arraycopy(strArr2, 0, copyOf2, length2, 1);
                return (String[]) copyOf2;
            default:
                List list2 = (List) obj;
                n4.d dVar2 = f0.f7054n;
                return list2 != null ? CollectionsKt.G(list2, x.c(dVar2.d(str))) : x.c(dVar2.d(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n4.f0
    public final Object d(String str) {
        switch (this.f8148q) {
            case 0:
                return j(str);
            case 1:
                return x.c(Double.valueOf(Double.parseDouble(str)));
            case 2:
                return new String[]{f0.f7054n.d(str)};
            default:
                return x.c(f0.f7054n.d(str));
        }
    }

    @Override // n4.f0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f8148q) {
            case 0:
                double[] dArr = (double[]) obj;
                str.getClass();
                if (dArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putDoubleArray(str, dArr);
                    break;
                }
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    double[] dArr2 = new double[list.size()];
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        dArr2[i3] = ((Number) it.next()).doubleValue();
                        i3++;
                    }
                    bundle.putDoubleArray(str, dArr2);
                    break;
                }
            case 2:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str2 : strArr) {
                        if (str2 == null) {
                            str2 = "null";
                        }
                        arrayList.add(str2);
                    }
                    String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                    break;
                }
            default:
                List<String> list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList(z.j(list2, 10));
                    for (String str3 : list2) {
                        if (str3 == null) {
                            str3 = "null";
                        }
                        arrayList2.add(str3);
                    }
                    String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                    strArr3.getClass();
                    bundle.putStringArray(str, strArr3);
                    break;
                }
        }
    }

    @Override // n4.f0
    public final boolean g(Object obj, Object obj2) {
        Double[] dArr;
        switch (this.f8148q) {
            case 0:
                double[] dArr2 = (double[]) obj;
                double[] dArr3 = (double[]) obj2;
                Double[] dArr4 = null;
                if (dArr2 != null) {
                    dArr = new Double[dArr2.length];
                    int length = dArr2.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        dArr[i3] = Double.valueOf(dArr2[i3]);
                    }
                } else {
                    dArr = null;
                }
                if (dArr3 != null) {
                    dArr4 = new Double[dArr3.length];
                    int length2 = dArr3.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        dArr4[i10] = Double.valueOf(dArr3[i10]);
                    }
                }
                return u.a(dArr, dArr4);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return u.a(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
            case 2:
                return u.a((String[]) obj, (String[]) obj2);
            default:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return u.a(list3 != null ? (String[]) list3.toArray(new String[0]) : null, list4 != null ? (String[]) list4.toArray(new String[0]) : null);
        }
    }

    @Override // n4.e
    public final Object h() {
        switch (this.f8148q) {
            case 0:
                return new double[0];
            case 1:
                return j0.f5574d;
            case 2:
                return new String[0];
            default:
                return j0.f5574d;
        }
    }

    @Override // n4.e
    public final List i(Object obj) {
        List r9;
        String str;
        String str2;
        switch (this.f8148q) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null && (r9 = w.r(dArr)) != null) {
                    ArrayList arrayList = new ArrayList(z.j(r9, 10));
                    Iterator it = r9.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(z.j(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList3 = new ArrayList(strArr.length);
                    for (String str3 : strArr) {
                        if (str3 != null) {
                            str = Uri.encode(str3, null);
                            str.getClass();
                        } else {
                            str = "null";
                        }
                        arrayList3.add(str);
                    }
                    break;
                } else {
                    break;
                }
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(z.j(list2, 10));
                    for (String str4 : list2) {
                        if (str4 != null) {
                            str2 = Uri.encode(str4, null);
                            str2.getClass();
                        } else {
                            str2 = "null";
                        }
                        arrayList4.add(str2);
                    }
                    break;
                } else {
                    break;
                }
        }
        return j0.f5574d;
    }
}
