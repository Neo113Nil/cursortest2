package kotlin.collections;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class u extends t {
    public static boolean a(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = objArr[i3];
                Object obj2 = objArr2[i3];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!a((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof hd.v) && (obj2 instanceof hd.v)) {
                            if (!Arrays.equals(((hd.v) obj).f4528d, ((hd.v) obj2).f4528d)) {
                            }
                        } else if ((obj instanceof hd.f0) && (obj2 instanceof hd.f0)) {
                            if (!Arrays.equals(((hd.f0) obj).f4504d, ((hd.f0) obj2).f4504d)) {
                            }
                        } else if ((obj instanceof hd.y) && (obj2 instanceof hd.y)) {
                            if (!Arrays.equals(((hd.y) obj).f4531d, ((hd.y) obj2).f4531d)) {
                            }
                        } else if ((obj instanceof hd.b0) && (obj2 instanceof hd.b0)) {
                            if (!Arrays.equals(((hd.b0) obj).f4497d, ((hd.b0) obj2).f4497d)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
