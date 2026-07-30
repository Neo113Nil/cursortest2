package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sr0 extends yk {
    public final /* synthetic */ int BRwzKIf41E4i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr0(int i, boolean z) {
        super(z);
        this.BRwzKIf41E4i = i;
    }

    @Override // defpackage.dc1
    public final Object PxuCJdSBwIXG(String str, Bundle bundle) {
        int i = this.BRwzKIf41E4i;
        ae aeVar = dc1.r3s1LDPKFs1S;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 1:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return na.mFd1aGiJX24N(doubleArray2);
                }
                xi0.ryVscX7ZL4Ux(str);
                throw null;
            case 2:
                if (!o0.pnx5pC0XzaCw(bundle, str, str) || vi0.EpkonXwzFgDB(str, bundle)) {
                    return null;
                }
                String[] kpCQ9veP6n3I = vi0.kpCQ9veP6n3I(str, bundle);
                ArrayList arrayList2 = new ArrayList(kpCQ9veP6n3I.length);
                for (String str2 : kpCQ9veP6n3I) {
                    arrayList2.add((String) aeVar.Y1f8riQaR6yg(str2));
                }
                return (String[]) arrayList2.toArray(new String[0]);
            default:
                if (o0.pnx5pC0XzaCw(bundle, str, str) && !vi0.EpkonXwzFgDB(str, bundle)) {
                    List OYiFbU3x63rc = na.OYiFbU3x63rc(vi0.kpCQ9veP6n3I(str, bundle));
                    arrayList = new ArrayList(al.KZw9XyiywG4x(OYiFbU3x63rc, 10));
                    Iterator it = OYiFbU3x63rc.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) aeVar.Y1f8riQaR6yg((String) it.next()));
                    }
                }
                return arrayList;
        }
    }

    @Override // defpackage.yk
    public final Object RAsUl2FVSrh6() {
        int i = this.BRwzKIf41E4i;
        p50 p50Var = p50.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                return new double[0];
            case 1:
                return p50Var;
            case 2:
                return new String[0];
            default:
                return p50Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dc1
    public final Object TSizfFm2Yiuu(Object obj, String str) {
        int i = this.BRwzKIf41E4i;
        ae aeVar = dc1.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null) {
                    return new double[]{Double.parseDouble(str)};
                }
                double[] dArr2 = {Double.parseDouble(str)};
                int length = dArr.length;
                double[] copyOf = Arrays.copyOf(dArr, length + 1);
                System.arraycopy(dArr2, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                return list != null ? zk.wcHq2YQJmeHg(list, fx1.jJwa0q7P5wHq(Double.valueOf(Double.parseDouble(str)))) : fx1.jJwa0q7P5wHq(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{aeVar.Y1f8riQaR6yg(str)};
                }
                String[] strArr2 = {aeVar.Y1f8riQaR6yg(str)};
                int length2 = strArr.length;
                Object[] copyOf2 = Arrays.copyOf(strArr, length2 + 1);
                System.arraycopy(strArr2, 0, copyOf2, length2, 1);
                return (String[]) copyOf2;
            default:
                List list2 = (List) obj;
                return list2 != null ? zk.wcHq2YQJmeHg(list2, fx1.jJwa0q7P5wHq(aeVar.Y1f8riQaR6yg(str))) : fx1.jJwa0q7P5wHq(aeVar.Y1f8riQaR6yg(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dc1
    public final Object Y1f8riQaR6yg(String str) {
        int i = this.BRwzKIf41E4i;
        ae aeVar = dc1.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new double[]{Double.parseDouble(str)};
            case 1:
                return fx1.jJwa0q7P5wHq(Double.valueOf(Double.parseDouble(str)));
            case 2:
                return new String[]{aeVar.Y1f8riQaR6yg(str)};
            default:
                return fx1.jJwa0q7P5wHq(aeVar.Y1f8riQaR6yg(str));
        }
    }

    @Override // defpackage.dc1
    public final void e9gEMXR7LXtO(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.BRwzKIf41E4i) {
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
                    while (it.hasNext()) {
                        dArr2[i] = ((Number) it.next()).doubleValue();
                        i++;
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
                    ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(list2, 10));
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

    @Override // defpackage.dc1
    public final String lS5Rgt96tfkO() {
        switch (this.BRwzKIf41E4i) {
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
    /* JADX WARN: Type inference failed for: r3v0, types: [p50] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // defpackage.yk
    public final List rtx2ld2ELZv4(Object obj) {
        String str;
        String str2;
        int i = this.BRwzKIf41E4i;
        ?? r3 = p50.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    List mFd1aGiJX24N = na.mFd1aGiJX24N(dArr);
                    r3 = new ArrayList(al.KZw9XyiywG4x(mFd1aGiJX24N, 10));
                    Iterator it = mFd1aGiJX24N.iterator();
                    while (it.hasNext()) {
                        r3.add(String.valueOf(((Number) it.next()).doubleValue()));
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
                        r3.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                    break;
                }
                break;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    r3 = new ArrayList(strArr.length);
                    for (String str3 : strArr) {
                        if (str3 != null) {
                            str = Uri.encode(str3, null);
                            str.getClass();
                        } else {
                            str = "null";
                        }
                        r3.add(str);
                    }
                    break;
                }
                break;
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    r3 = new ArrayList(al.KZw9XyiywG4x(list2, 10));
                    for (String str4 : list2) {
                        if (str4 != null) {
                            str2 = Uri.encode(str4, null);
                            str2.getClass();
                        } else {
                            str2 = "null";
                        }
                        r3.add(str2);
                    }
                    break;
                }
                break;
        }
        return r3;
    }
}
