package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ja2 extends th0 {
    public static String POWyO8hTM6YC(String str) {
        return z32.yQRudnv4La6p(new hd2(new fl(2, str), new xw1(8, "    "), 1), "\n");
    }

    public static String i68hK7ahKtgp(String str) {
        Comparable comparable;
        String str2;
        List Nlhe969cAGO8 = ia2.Nlhe969cAGO8(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : Nlhe969cAGO8) {
            if (!ia2.fRTaYY6FBZcX((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!ov2.J54yh1s3n4Aq(str3.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i3));
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
        Nlhe969cAGO8.size();
        int size2 = Nlhe969cAGO8.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : Nlhe969cAGO8) {
            int i4 = i + 1;
            if (i < 0) {
                fx1.mFd1aGiJX24N();
                throw null;
            }
            String str4 = (String) obj3;
            if ((i == 0 || i == size2) && ia2.fRTaYY6FBZcX(str4)) {
                str2 = null;
            } else {
                str4.getClass();
                if (intValue < 0) {
                    u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(intValue, "Requested character count ", " is less than zero."));
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
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        zk.vfcx0XMziUg4(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String zf8DYfih6EZu(String str) {
        if (ia2.fRTaYY6FBZcX("|")) {
            u9.XL4ISE6Oc65B("marginPrefix must be non-blank string.");
            return null;
        }
        List Nlhe969cAGO8 = ia2.Nlhe969cAGO8(str);
        int length = str.length();
        Nlhe969cAGO8.size();
        int size = Nlhe969cAGO8.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : Nlhe969cAGO8) {
            int i2 = i + 1;
            if (i < 0) {
                fx1.mFd1aGiJX24N();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && ia2.fRTaYY6FBZcX(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ov2.J54yh1s3n4Aq(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && pa2.ngxnMNrpiKat(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        zk.vfcx0XMziUg4(arrayList, sb, null, 124);
        return sb.toString();
    }
}
