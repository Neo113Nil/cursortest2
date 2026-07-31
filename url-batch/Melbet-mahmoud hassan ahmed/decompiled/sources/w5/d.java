package w5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends c {
    public static <T> List<T> a(T[] tArr) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        List<T> a7 = f.a(tArr);
        kotlin.jvm.internal.i.c(a7, "asList(this)");
        return a7;
    }

    public static final <T> T[] b(T[] tArr, T[] tArr2, int i7, int i8, int i9) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        kotlin.jvm.internal.i.d(tArr2, "destination");
        System.arraycopy(tArr, i8, tArr2, i7, i9 - i8);
        return tArr2;
    }

    public static /* synthetic */ Object[] c(Object[] objArr, Object[] objArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return b(objArr, objArr2, i7, i8, i9);
    }

    public static <T> void d(T[] tArr, T t6, int i7, int i8) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        Arrays.fill(tArr, i7, i8, t6);
    }

    public static /* synthetic */ void e(Object[] objArr, Object obj, int i7, int i8, int i9, Object obj2) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = objArr.length;
        }
        d(objArr, obj, i7, i8);
    }

    public static final <T> void f(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.i.d(tArr, "<this>");
        kotlin.jvm.internal.i.d(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
