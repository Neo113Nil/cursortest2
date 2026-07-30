package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class na extends hq0 {
    public static void D0aTLcX6Uhyo(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static char GlTbNTgfSMqy(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            rc1.RAsUl2FVSrh6("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        u9.XL4ISE6Oc65B("Array has more than one element.");
        return (char) 0;
    }

    public static Set HGgCfDnf0ga9(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return t50.rtx2ld2ELZv4;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            singleton.getClass();
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(w41.i68hK7ahKtgp(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static List HqMwxkFaipxD(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (length == 1) {
            return fx1.jJwa0q7P5wHq(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List IxJ9cAW40yOk(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (length == 1) {
            return fx1.jJwa0q7P5wHq(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static Float JLGWdXyAxbxj(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static void JTxCbbCwomzt(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void Nlhe969cAGO8(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static List OYiFbU3x63rc(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (length == 1) {
            return fx1.jJwa0q7P5wHq(objArr[0]);
        }
        List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static void PsecLrZVVK61(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void VzNxmvWisHL1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static Object cJeY36nTk9tz(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static Object[] fRTaYY6FBZcX(Object[] objArr, int i, int i2) {
        objArr.getClass();
        hq0.RfyTYNmI9Srp(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static /* synthetic */ void hVNtCUZb4tYH(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        VzNxmvWisHL1(objArr, objArr2, 0, i, i2);
    }

    public static int hnJvRxDXo0hm(Object[] objArr, Object obj) {
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

    public static Object iSxsmagYqzHM(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        rc1.RAsUl2FVSrh6("Array is empty.");
        return null;
    }

    public static boolean jJwa0q7P5wHq(int[] iArr, int i) {
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

    public static List mFd1aGiJX24N(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length == 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (length == 1) {
            return fx1.jJwa0q7P5wHq(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static /* synthetic */ void rxipThha848g(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        PsecLrZVVK61(iArr, iArr2, i, 0, i2);
    }

    public static List twy4zb2fCtqq(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (length == 1) {
            return fx1.jJwa0q7P5wHq(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static ArrayList uURZJOrwXbxn(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static byte[] uVlwi32qvXeJ(byte[] bArr, int i, int i2) {
        bArr.getClass();
        hq0.RfyTYNmI9Srp(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static int uy1Qfkdvj4xZ(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static void v6yxfmkxNKhL(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }
}
