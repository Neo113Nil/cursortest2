package E3;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static volatile j f658b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f659a;

    public j(int i7) {
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f659a = new HashMap();
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                this.f659a = new HashMap();
                break;
            default:
                this.f659a = new HashMap();
                break;
        }
    }

    public void a(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = this.f659a;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i7 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = l0.g.f5269b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i7 < zArr.length) {
                            boolArr[i7] = Boolean.valueOf(zArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = l0.g.f5269b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i7 < bArr.length) {
                            bArr2[i7] = Byte.valueOf(bArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = l0.g.f5269b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i7 < iArr.length) {
                            numArr[i7] = Integer.valueOf(iArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = l0.g.f5269b;
                        Long[] lArr = new Long[jArr.length];
                        while (i7 < jArr.length) {
                            lArr[i7] = Long.valueOf(jArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = l0.g.f5269b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i7 < fArr.length) {
                            fArr2[i7] = Float.valueOf(fArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = l0.g.f5269b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i7 < dArr.length) {
                            dArr2[i7] = Double.valueOf(dArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }
}
