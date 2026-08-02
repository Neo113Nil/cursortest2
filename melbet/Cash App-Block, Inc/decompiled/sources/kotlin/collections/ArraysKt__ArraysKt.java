package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;

/* loaded from: classes.dex */
public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    public static boolean contentDeepEquals(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!contentDeepEquals((Object[]) obj, (Object[]) obj2)) {
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
                        } else if ((obj instanceof UByteArray) && (obj2 instanceof UByteArray)) {
                            if (!UArraysKt___UArraysKt.m4129contentEqualskV0jMPg(((UByteArray) obj).storage, ((UByteArray) obj2).storage)) {
                            }
                        } else if ((obj instanceof UShortArray) && (obj2 instanceof UShortArray)) {
                            if (!UArraysKt___UArraysKt.m4127contentEqualsFGO6Aew(((UShortArray) obj).storage, ((UShortArray) obj2).storage)) {
                            }
                        } else if ((obj instanceof UIntArray) && (obj2 instanceof UIntArray)) {
                            if (!UArraysKt___UArraysKt.m4128contentEqualsKJPZfPQ(((UIntArray) obj).storage, ((UIntArray) obj2).storage)) {
                            }
                        } else if ((obj instanceof ULongArray) && (obj2 instanceof ULongArray)) {
                            if (!UArraysKt___UArraysKt.m4130contentEqualslec5QzE(((ULongArray) obj).storage, ((ULongArray) obj2).storage)) {
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

    public static final void contentDeepToStringInternal$ArraysKt__ArraysKt(Object[] objArr, StringBuilder sb, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt((Object[]) obj, sb, arrayList);
            } else if (obj instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) obj);
                arrays.getClass();
                sb.append(arrays);
            } else if (obj instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) obj);
                arrays2.getClass();
                sb.append(arrays2);
            } else if (obj instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) obj);
                arrays3.getClass();
                sb.append(arrays3);
            } else if (obj instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) obj);
                arrays4.getClass();
                sb.append(arrays4);
            } else if (obj instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) obj);
                arrays5.getClass();
                sb.append(arrays5);
            } else if (obj instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) obj);
                arrays6.getClass();
                sb.append(arrays6);
            } else if (obj instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) obj);
                arrays7.getClass();
                sb.append(arrays7);
            } else if (obj instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) obj);
                arrays8.getClass();
                sb.append(arrays8);
            } else if (obj instanceof UByteArray) {
                sb.append(UArraysKt___UArraysKt.m4131contentToString2csIQuQ(((UByteArray) obj).storage));
            } else if (obj instanceof UShortArray) {
                sb.append(UArraysKt___UArraysKt.m4133contentToStringd6D3K8(((UShortArray) obj).storage));
            } else if (obj instanceof UIntArray) {
                sb.append(UArraysKt___UArraysKt.m4132contentToStringXUkPCBk(((UIntArray) obj).storage));
            } else if (obj instanceof ULongArray) {
                sb.append(UArraysKt___UArraysKt.m4134contentToStringuLth9ew(((ULongArray) obj).storage));
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        arrayList.remove(arrayList.size() - 1);
    }
}
