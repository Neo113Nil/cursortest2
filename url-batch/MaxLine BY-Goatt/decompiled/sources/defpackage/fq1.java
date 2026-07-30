package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fq1 extends iq1 {
    public final /* synthetic */ int e;

    public static float[] f(String str) {
        str.getClass();
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] g(String str) {
        str.getClass();
        return new int[]{((Number) iq1.a.d(str)).intValue()};
    }

    public static long[] h(String str) {
        str.getClass();
        return new long[]{((Number) iq1.b.d(str)).longValue()};
    }

    public static boolean[] i(String str) {
        str.getClass();
        return new boolean[]{((Boolean) iq1.c.d(str)).booleanValue()};
    }

    @Override // defpackage.iq1
    public final Object a(Bundle bundle, String str) {
        switch (this.e) {
            case 0:
                bundle.getClass();
                str.getClass();
                return (boolean[]) bundle.get(str);
            case 1:
                bundle.getClass();
                str.getClass();
                return (float[]) bundle.get(str);
            case 2:
                bundle.getClass();
                str.getClass();
                return (int[]) bundle.get(str);
            case 3:
                bundle.getClass();
                str.getClass();
                return (long[]) bundle.get(str);
            default:
                bundle.getClass();
                str.getClass();
                return (String[]) bundle.get(str);
        }
    }

    @Override // defpackage.iq1
    public final String b() {
        switch (this.e) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // defpackage.iq1
    public final Object c(Object obj, String str) {
        switch (this.e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return i(str);
                }
                boolean[] i = i(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(i, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return f(str);
                }
                float[] f = f(str);
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(f, 0, copyOf2, length2, 1);
                return copyOf2;
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return g(str);
                }
                int[] g = g(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(g, 0, copyOf3, length3, 1);
                return copyOf3;
            case 3:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return h(str);
                }
                long[] h = h(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(h, 0, copyOf4, length4, 1);
                return copyOf4;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, copyOf5, length5, 1);
                return (String[]) copyOf5;
        }
    }

    @Override // defpackage.iq1
    public final Object d(String str) {
        switch (this.e) {
            case 0:
                return i(str);
            case 1:
                return f(str);
            case 2:
                return g(str);
            case 3:
                return h(str);
            default:
                str.getClass();
                return new String[]{str};
        }
    }

    @Override // defpackage.iq1
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.e) {
            case 0:
                str.getClass();
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                str.getClass();
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 2:
                str.getClass();
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 3:
                str.getClass();
                bundle.putLongArray(str, (long[]) obj);
                break;
            default:
                str.getClass();
                bundle.putStringArray(str, (String[]) obj);
                break;
        }
    }
}
