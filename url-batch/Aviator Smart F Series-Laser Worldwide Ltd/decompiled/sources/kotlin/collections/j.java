package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;

/* loaded from: classes4.dex */
class j extends i {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean contentDeepEquals(T[] tArr, T[] tArr2) {
        boolean m513contentEqualslec5QzE;
        boolean m511contentEqualsKJPZfPQ;
        boolean m510contentEqualsFGO6Aew;
        boolean m512contentEqualskV0jMPg;
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            Object[] objArr = tArr[i8];
            Object[] objArr2 = tArr2[i8];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof y5.o) && (objArr2 instanceof y5.o)) {
                    m512contentEqualskV0jMPg = UArraysKt___UArraysKt.m512contentEqualskV0jMPg(((y5.o) objArr).m1623unboximpl(), ((y5.o) objArr2).m1623unboximpl());
                    if (!m512contentEqualskV0jMPg) {
                        return false;
                    }
                } else if ((objArr instanceof y5.v) && (objArr2 instanceof y5.v)) {
                    m510contentEqualsFGO6Aew = UArraysKt___UArraysKt.m510contentEqualsFGO6Aew(((y5.v) objArr).m1855unboximpl(), ((y5.v) objArr2).m1855unboximpl());
                    if (!m510contentEqualsFGO6Aew) {
                        return false;
                    }
                } else if ((objArr instanceof y5.q) && (objArr2 instanceof y5.q)) {
                    m511contentEqualsKJPZfPQ = UArraysKt___UArraysKt.m511contentEqualsKJPZfPQ(((y5.q) objArr).m1701unboximpl(), ((y5.q) objArr2).m1701unboximpl());
                    if (!m511contentEqualsKJPZfPQ) {
                        return false;
                    }
                } else if ((objArr instanceof y5.s) && (objArr2 instanceof y5.s)) {
                    m513contentEqualslec5QzE = UArraysKt___UArraysKt.m513contentEqualslec5QzE(((y5.s) objArr).m1779unboximpl(), ((y5.s) objArr2).m1779unboximpl());
                    if (!m513contentEqualslec5QzE) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.s.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final <T> String contentDeepToString(T[] tArr) {
        int coerceAtMost;
        if (tArr == null) {
            return "null";
        }
        coerceAtMost = j6.v.coerceAtMost(tArr.length, 429496729);
        StringBuilder sb = new StringBuilder((coerceAtMost * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        String m521contentToStringuLth9ew;
        String m519contentToStringXUkPCBk;
        String m520contentToStringd6D3K8;
        String m518contentToString2csIQuQ;
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i8];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
                sb.append(arrays);
            } else if (objArr instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays2, "toString(this)");
                sb.append(arrays2);
            } else if (objArr instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays3, "toString(this)");
                sb.append(arrays3);
            } else if (objArr instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays4, "toString(this)");
                sb.append(arrays4);
            } else if (objArr instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays5, "toString(this)");
                sb.append(arrays5);
            } else if (objArr instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays6, "toString(this)");
                sb.append(arrays6);
            } else if (objArr instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays7, "toString(this)");
                sb.append(arrays7);
            } else if (objArr instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays8, "toString(this)");
                sb.append(arrays8);
            } else if (objArr instanceof y5.o) {
                m518contentToString2csIQuQ = UArraysKt___UArraysKt.m518contentToString2csIQuQ(((y5.o) objArr).m1623unboximpl());
                sb.append(m518contentToString2csIQuQ);
            } else if (objArr instanceof y5.v) {
                m520contentToStringd6D3K8 = UArraysKt___UArraysKt.m520contentToStringd6D3K8(((y5.v) objArr).m1855unboximpl());
                sb.append(m520contentToStringd6D3K8);
            } else if (objArr instanceof y5.q) {
                m519contentToStringXUkPCBk = UArraysKt___UArraysKt.m519contentToStringXUkPCBk(((y5.q) objArr).m1701unboximpl());
                sb.append(m519contentToStringXUkPCBk);
            } else if (objArr instanceof y5.s) {
                m521contentToStringuLth9ew = UArraysKt___UArraysKt.m521contentToStringuLth9ew(((y5.s) objArr).m1779unboximpl());
                sb.append(m521contentToStringuLth9ew);
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    public static final <T> List<T> flatten(T[][] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        int i8 = 0;
        for (T[] tArr2 : tArr) {
            i8 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i8);
        for (T[] tArr3 : tArr) {
            v.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lf6/a;)TR; */
    private static final Object ifEmpty(Object[] objArr, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    private static final boolean isNullOrEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Pair<? extends T, ? extends R>[] pairArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return y5.h.to(arrayList, arrayList2);
    }
}
