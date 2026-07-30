package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class kv2 {
    public static final byte[] PxuCJdSBwIXG = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        continue;
     */
    static {
        qh1 qh1Var = rh1.Companion;
        ah.Companion.getClass();
        ah[] ahVarArr = {zg.PxuCJdSBwIXG("efbbbf"), zg.PxuCJdSBwIXG("feff"), zg.PxuCJdSBwIXG("fffe0000"), zg.PxuCJdSBwIXG("fffe"), zg.PxuCJdSBwIXG("0000feff")};
        qh1Var.getClass();
        ArrayList arrayList = new ArrayList(new aa(ahVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(fx1.S2OOm9zPNm0h(arrayList, ahVarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((ah) arrayList.get(0)).TSizfFm2Yiuu() <= 0) {
            u9.XL4ISE6Oc65B("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            ah ahVar = (ah) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                ah ahVar2 = (ah) arrayList.get(i6);
                ahVar2.getClass();
                ahVar.getClass();
                if (ahVar2.RAsUl2FVSrh6(ahVar.TSizfFm2Yiuu(), ahVar)) {
                    if (ahVar2.TSizfFm2Yiuu() == ahVar.TSizfFm2Yiuu()) {
                        rc1.x50lh2ztY7Y5(ahVar2, "duplicate option: ");
                        return;
                    } else if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                        arrayList.remove(i6);
                        ((Number) arrayList2.remove(i6)).intValue();
                    } else {
                        i6++;
                    }
                }
            }
            i4 = i5;
        }
        yf yfVar = new yf();
        qh1.PxuCJdSBwIXG(0L, yfVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (yfVar.OPXfSBeufaJ8 / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = yfVar.readInt();
        }
    }

    public static final String[] OPXfSBeufaJ8(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final void PxuCJdSBwIXG(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int RAsUl2FVSrh6(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int TSizfFm2Yiuu(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int Y1f8riQaR6yg(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return TSizfFm2Yiuu(str, c, i, i2);
    }

    public static final int a92UlCVFR9N8(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (cs0.gPXPFXrUH4XX(charAt, 31) <= 0 || cs0.gPXPFXrUH4XX(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int cpQdD2nAriOS(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final int dgRBjINgWbAK(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final boolean e9gEMXR7LXtO(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int lS5Rgt96tfkO(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (ia2.D0aTLcX6Uhyo(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int rtx2ld2ELZv4(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final boolean wdg6QnbFHrFF(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int x50lh2ztY7Y5(ig igVar) {
        igVar.getClass();
        return (igVar.readByte() & 255) | ((igVar.readByte() & 255) << 16) | ((igVar.readByte() & 255) << 8);
    }
}
