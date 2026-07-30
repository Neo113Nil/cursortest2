package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k extends j {

    public static final class a extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ byte[] $this_asList;

        a(byte[] bArr) {
            this.$this_asList = bArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return contains(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return indexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return lastIndexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        public boolean contains(byte b8) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, b8);
        }

        @Override // kotlin.collections.b, java.util.List
        public Byte get(int i8) {
            return Byte.valueOf(this.$this_asList[i8]);
        }

        public int indexOf(byte b8) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, b8);
        }

        public int lastIndexOf(byte b8) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, b8);
        }
    }

    public static final class b extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ short[] $this_asList;

        b(short[] sArr) {
            this.$this_asList = sArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return contains(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return indexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return lastIndexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        public boolean contains(short s7) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, s7);
        }

        @Override // kotlin.collections.b, java.util.List
        public Short get(int i8) {
            return Short.valueOf(this.$this_asList[i8]);
        }

        public int indexOf(short s7) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, s7);
        }

        public int lastIndexOf(short s7) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, s7);
        }
    }

    public static final class c extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ int[] $this_asList;

        c(int[] iArr) {
            this.$this_asList = iArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return contains(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return indexOf(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return lastIndexOf(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean contains(int i8) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, i8);
        }

        @Override // kotlin.collections.b, java.util.List
        public Integer get(int i8) {
            return Integer.valueOf(this.$this_asList[i8]);
        }

        public int indexOf(int i8) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, i8);
        }

        public int lastIndexOf(int i8) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, i8);
        }
    }

    public static final class d extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ long[] $this_asList;

        d(long[] jArr) {
            this.$this_asList = jArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return contains(((Number) obj).longValue());
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return indexOf(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return lastIndexOf(((Number) obj).longValue());
            }
            return -1;
        }

        public boolean contains(long j8) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, j8);
        }

        @Override // kotlin.collections.b, java.util.List
        public Long get(int i8) {
            return Long.valueOf(this.$this_asList[i8]);
        }

        public int indexOf(long j8) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, j8);
        }

        public int lastIndexOf(long j8) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, j8);
        }
    }

    public static final class e extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ float[] $this_asList;

        e(float[] fArr) {
            this.$this_asList = fArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return contains(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return indexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return lastIndexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        public boolean contains(float f8) {
            for (float f9 : this.$this_asList) {
                if (Float.floatToIntBits(f9) == Float.floatToIntBits(f8)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.b, java.util.List
        public Float get(int i8) {
            return Float.valueOf(this.$this_asList[i8]);
        }

        public int indexOf(float f8) {
            float[] fArr = this.$this_asList;
            int length = fArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (Float.floatToIntBits(fArr[i8]) == Float.floatToIntBits(f8)) {
                    return i8;
                }
            }
            return -1;
        }

        public int lastIndexOf(float f8) {
            float[] fArr = this.$this_asList;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i8 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f8)) {
                    return length;
                }
                if (i8 < 0) {
                    return -1;
                }
                length = i8;
            }
        }
    }

    public static final class f extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ double[] $this_asList;

        f(double[] dArr) {
            this.$this_asList = dArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return contains(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return indexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return lastIndexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        public boolean contains(double d8) {
            for (double d9 : this.$this_asList) {
                if (Double.doubleToLongBits(d9) == Double.doubleToLongBits(d8)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.b, java.util.List
        public Double get(int i8) {
            return Double.valueOf(this.$this_asList[i8]);
        }

        public int indexOf(double d8) {
            double[] dArr = this.$this_asList;
            int length = dArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (Double.doubleToLongBits(dArr[i8]) == Double.doubleToLongBits(d8)) {
                    return i8;
                }
            }
            return -1;
        }

        public int lastIndexOf(double d8) {
            double[] dArr = this.$this_asList;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i8 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d8)) {
                    return length;
                }
                if (i8 < 0) {
                    return -1;
                }
                length = i8;
            }
        }
    }

    public static final class g extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ boolean[] $this_asList;

        g(boolean[] zArr) {
            this.$this_asList = zArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return contains(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return indexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return lastIndexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        public boolean contains(boolean z7) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, z7);
        }

        @Override // kotlin.collections.b, java.util.List
        public Boolean get(int i8) {
            return Boolean.valueOf(this.$this_asList[i8]);
        }

        public int indexOf(boolean z7) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, z7);
        }

        public int lastIndexOf(boolean z7) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, z7);
        }
    }

    public static final class h extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ char[] $this_asList;

        h(char[] cArr) {
            this.$this_asList = cArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return contains(((Character) obj).charValue());
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean contains(char c8) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, c8);
        }

        @Override // kotlin.collections.b, java.util.List
        public Character get(int i8) {
            return Character.valueOf(this.$this_asList[i8]);
        }

        public int indexOf(char c8) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, c8);
        }

        public int lastIndexOf(char c8) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, c8);
        }
    }

    public static <T> List<T> asList(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        List<T> asList = l.asList(tArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(asList, "asList(this)");
        return asList;
    }

    public static final <T> int binarySearch(T[] tArr, T t7, Comparator<? super T> comparator, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch(tArr, i8, i9, t7, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i8, i9);
    }

    private static final <T> boolean contentDeepEqualsInline(T[] tArr, T[] other) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return j.contentDeepEquals(tArr, other);
    }

    private static final <T> boolean contentDeepEqualsNullable(T[] tArr, T[] tArr2) {
        return b6.b.apiVersionIsAtLeast(1, 3, 0) ? j.contentDeepEquals(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    private static final <T> int contentDeepHashCodeInline(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return i.contentDeepHashCode(tArr);
    }

    private static final <T> int contentDeepHashCodeNullable(T[] tArr) {
        return b6.b.apiVersionIsAtLeast(1, 3, 0) ? i.contentDeepHashCode(tArr) : Arrays.deepHashCode(tArr);
    }

    private static final <T> String contentDeepToStringInline(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return j.contentDeepToString(tArr);
    }

    private static final <T> String contentDeepToStringNullable(T[] tArr) {
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return j.contentDeepToString(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(deepToString, "deepToString(this)");
        return deepToString;
    }

    private static final <T> boolean contentEquals(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    private static final <T> int contentHashCode(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    private static final <T> String contentToString(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static <T> T[] copyInto(T[] tArr, T[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        return copyInto(objArr, objArr2, i8, i9, i10);
    }

    private static final <T> T[] copyOf(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(tArr2, "copyOf(this, size)");
        return tArr2;
    }

    public static <T> T[] copyOfRange(T[] tArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    private static final <T> T[] copyOfRangeInline(T[] tArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return (T[]) copyOfRange(tArr, i8, i9);
        }
        if (i9 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(tArr2, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return tArr2;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + tArr.length);
    }

    private static final <T> T elementAt(T[] tArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return tArr[i8];
    }

    public static <T> void fill(T[] tArr, T t7, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i8, i9, t7);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        fill(objArr, obj, i8, i9);
    }

    public static final <R> List<R> filterIsInstance(Object[] objArr, Class<R> klass) {
        kotlin.jvm.internal.s.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(objArr, new ArrayList(), klass);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Object[] objArr, C destination, Class<R> klass) {
        kotlin.jvm.internal.s.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final /* synthetic */ Double max(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t7 = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(t7);
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                T t8 = tArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(t8);
                if (comparable.compareTo(comparable2) < 0) {
                    t7 = t8;
                    comparable = comparable2;
                }
            }
        }
        return t7;
    }

    public static final /* synthetic */ Object maxWith(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(objArr, comparator);
    }

    public static final /* synthetic */ Double min(Double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t7 = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(t7);
            f0 it = new j6.m(1, lastIndex).iterator();
            while (it.hasNext()) {
                T t8 = tArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(t8);
                if (comparable.compareTo(comparable2) > 0) {
                    t7 = t8;
                    comparable = comparable2;
                }
            }
        }
        return t7;
    }

    public static final /* synthetic */ Object minWith(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(objArr, comparator);
    }

    public static final <T> T[] plus(T[] tArr, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + 1);
        result[length] = t7;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    private static final <T> T[] plusElement(T[] tArr, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return (T[]) plus(tArr, t7);
    }

    public static final void sort(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = comparableArr.length;
        }
        sort(comparableArr, i8, i9);
    }

    public static final <T> void sortWith(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        sortWith(objArr, comparator, i8, i9);
    }

    private static final <T> BigDecimal sumOfBigDecimal(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (T t7 : tArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(t7));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final <T> BigInteger sumOfBigInteger(T[] tArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (T t7 : tArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(t7));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet());
    }

    public static final Byte[] toTypedArray(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = Byte.valueOf(bArr[i8]);
        }
        return bArr2;
    }

    public static final List<Byte> asList(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return new a(bArr);
    }

    public static final <T> int binarySearch(T[] tArr, T t7, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        return Arrays.binarySearch(tArr, i8, i9, t7);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        return binarySearch(objArr, obj, i8, i9);
    }

    private static final boolean contentEquals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private static final int contentHashCode(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    private static final String contentToString(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static byte[] copyInto(byte[] bArr, byte[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = bArr.length;
        }
        return copyInto(bArr, bArr2, i8, i9, i10);
    }

    private static final byte[] copyOf(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    private static final byte elementAt(byte[] bArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return bArr[i8];
    }

    public static void fill(byte[] bArr, byte b8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i8, i9, b8);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        fill(bArr, b8, i8, i9);
    }

    public static final /* synthetic */ Float max(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    public static final /* synthetic */ Byte maxWith(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    public static final /* synthetic */ Float min(Float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    public static final /* synthetic */ Byte minWith(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    public static final void sort(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = bArr.length;
        }
        sort(bArr, i8, i9);
    }

    public static final <T> void sortWith(T[] tArr, Comparator<? super T> comparator, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i8, i9, comparator);
    }

    public static final SortedSet<Byte> toSortedSet(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(bArr, new TreeSet());
    }

    public static final List<Short> asList(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return new b(sArr);
    }

    public static final int binarySearch(byte[] bArr, byte b8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return Arrays.binarySearch(bArr, i8, i9, b8);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return binarySearch(bArr, b8, i8, i9);
    }

    private static final boolean contentEquals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    private static final int contentHashCode(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    private static final String contentToString(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static short[] copyInto(short[] sArr, short[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(sArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = sArr.length;
        }
        return copyInto(sArr, sArr2, i8, i9, i10);
    }

    private static final short[] copyOf(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static byte[] copyOfRange(byte[] bArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    private static final short elementAt(short[] sArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return sArr[i8];
    }

    public static void fill(short[] sArr, short s7, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        Arrays.fill(sArr, i8, i9, s7);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = sArr.length;
        }
        fill(sArr, s7, i8, i9);
    }

    public static final /* synthetic */ Comparable max(Comparable[] comparableArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(comparableArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(comparableArr);
    }

    public static final /* synthetic */ Short maxWith(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static final /* synthetic */ Comparable min(Comparable[] comparableArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(comparableArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(comparableArr);
    }

    public static final /* synthetic */ Short minWith(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static final void sort(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = sArr.length;
        }
        sort(sArr, i8, i9);
    }

    public static final SortedSet<Short> toSortedSet(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(sArr, new TreeSet());
    }

    public static final List<Integer> asList(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return new c(iArr);
    }

    public static final int binarySearch(short[] sArr, short s7, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return Arrays.binarySearch(sArr, i8, i9, s7);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = sArr.length;
        }
        return binarySearch(sArr, s7, i8, i9);
    }

    private static final boolean contentEquals(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    private static final int contentHashCode(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    private static final String contentToString(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static int[] copyInto(int[] iArr, int[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        return copyInto(iArr, iArr2, i8, i9, i10);
    }

    private static final int[] copyOf(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    private static final int elementAt(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return iArr[i8];
    }

    public static void fill(int[] iArr, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i9, i10, i8);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = iArr.length;
        }
        fill(iArr, i8, i9, i10);
    }

    public static final /* synthetic */ Byte max(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(bArr);
    }

    public static final /* synthetic */ Integer maxWith(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    public static final /* synthetic */ Byte min(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(bArr);
    }

    public static final /* synthetic */ Integer minWith(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    public static final void sort(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = iArr.length;
        }
        sort(iArr, i8, i9);
    }

    private static final BigDecimal sumOfBigDecimal(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (byte b8 : bArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Byte.valueOf(b8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (byte b8 : bArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Byte.valueOf(b8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final SortedSet<Integer> toSortedSet(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(iArr, new TreeSet());
    }

    public static final Short[] toTypedArray(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            shArr[i8] = Short.valueOf(sArr[i8]);
        }
        return shArr;
    }

    public static final List<Long> asList(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return new d(jArr);
    }

    public static final int binarySearch(int[] iArr, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return Arrays.binarySearch(iArr, i9, i10, i8);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = iArr.length;
        }
        return binarySearch(iArr, i8, i9, i10);
    }

    private static final boolean contentEquals(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    private static final int contentHashCode(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    private static final String contentToString(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static long[] copyInto(long[] jArr, long[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = jArr.length;
        }
        return copyInto(jArr, jArr2, i8, i9, i10);
    }

    private static final long[] copyOf(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static short[] copyOfRange(short[] sArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    private static final long elementAt(long[] jArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return jArr[i8];
    }

    public static void fill(long[] jArr, long j8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i8, i9, j8);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = jArr.length;
        }
        fill(jArr, j8, i8, i9);
    }

    public static final /* synthetic */ Short max(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(sArr);
    }

    public static final /* synthetic */ Long maxWith(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    public static final /* synthetic */ Short min(short[] sArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(sArr);
    }

    public static final /* synthetic */ Long minWith(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    public static byte[] plus(byte[] bArr, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] result = Arrays.copyOf(bArr, length + 1);
        result[length] = b8;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final void sort(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = jArr.length;
        }
        sort(jArr, i8, i9);
    }

    public static final SortedSet<Long> toSortedSet(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(jArr, new TreeSet());
    }

    public static final List<Float> asList(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return new e(fArr);
    }

    public static final int binarySearch(long[] jArr, long j8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return Arrays.binarySearch(jArr, i8, i9, j8);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = jArr.length;
        }
        return binarySearch(jArr, j8, i8, i9);
    }

    private static final boolean contentEquals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    private static final int contentHashCode(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    private static final String contentToString(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static float[] copyInto(float[] fArr, float[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = fArr.length;
        }
        return copyInto(fArr, fArr2, i8, i9, i10);
    }

    private static final float[] copyOf(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    private static final float elementAt(float[] fArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return fArr[i8];
    }

    public static final void fill(float[] fArr, float f8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i8, i9, f8);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = fArr.length;
        }
        fill(fArr, f8, i8, i9);
    }

    public static final /* synthetic */ Integer max(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(iArr);
    }

    public static final /* synthetic */ Float maxWith(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    public static final /* synthetic */ Integer min(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(iArr);
    }

    public static final /* synthetic */ Float minWith(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    public static final void sort(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = fArr.length;
        }
        sort(fArr, i8, i9);
    }

    public static final SortedSet<Float> toSortedSet(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(fArr, new TreeSet());
    }

    public static final List<Double> asList(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return new f(dArr);
    }

    public static final int binarySearch(float[] fArr, float f8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i8, i9, f8);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = fArr.length;
        }
        return binarySearch(fArr, f8, i8, i9);
    }

    private static final boolean contentEquals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    private static final int contentHashCode(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    private static final String contentToString(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static final double[] copyInto(double[] dArr, double[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(dArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = dArr.length;
        }
        return copyInto(dArr, dArr2, i8, i9, i10);
    }

    private static final double[] copyOf(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static int[] copyOfRange(int[] iArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    private static final byte[] copyOfRangeInline(byte[] bArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(bArr, i8, i9);
        }
        if (i9 <= bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + bArr.length);
    }

    private static final double elementAt(double[] dArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return dArr[i8];
    }

    public static final void fill(double[] dArr, double d8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        Arrays.fill(dArr, i8, i9, d8);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = dArr.length;
        }
        fill(dArr, d8, i8, i9);
    }

    public static final /* synthetic */ Long max(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(jArr);
    }

    public static final /* synthetic */ Double maxWith(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    public static final /* synthetic */ Long min(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(jArr);
    }

    public static final /* synthetic */ Double minWith(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    public static final void sort(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = dArr.length;
        }
        sort(dArr, i8, i9);
    }

    private static final BigDecimal sumOfBigDecimal(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (short s7 : sArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Short.valueOf(s7)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (short s7 : sArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Short.valueOf(s7)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final SortedSet<Double> toSortedSet(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(dArr, new TreeSet());
    }

    public static final Integer[] toTypedArray(int[] iArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            numArr[i8] = Integer.valueOf(iArr[i8]);
        }
        return numArr;
    }

    public static final List<Boolean> asList(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return new g(zArr);
    }

    public static final int binarySearch(double[] dArr, double d8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return Arrays.binarySearch(dArr, i8, i9, d8);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = dArr.length;
        }
        return binarySearch(dArr, d8, i8, i9);
    }

    private static final boolean contentEquals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    private static final int contentHashCode(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    private static final String contentToString(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static final boolean[] copyInto(boolean[] zArr, boolean[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(zArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = zArr.length;
        }
        return copyInto(zArr, zArr2, i8, i9, i10);
    }

    private static final boolean[] copyOf(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    private static final boolean elementAt(boolean[] zArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return zArr[i8];
    }

    public static final void fill(boolean[] zArr, boolean z7, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i8, i9, z7);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = zArr.length;
        }
        fill(zArr, z7, i8, i9);
    }

    public static final /* synthetic */ Float max(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    public static final /* synthetic */ Boolean maxWith(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    public static final /* synthetic */ Float min(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    public static final /* synthetic */ Boolean minWith(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    private static final <T extends Comparable<? super T>> void sort(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        sort((Object[]) tArr);
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = cArr.length;
        }
        sort(cArr, i8, i9);
    }

    public static final SortedSet<Boolean> toSortedSet(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(zArr, new TreeSet());
    }

    public static final List<Character> asList(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return new h(cArr);
    }

    public static final int binarySearch(char[] cArr, char c8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return Arrays.binarySearch(cArr, i8, i9, c8);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = cArr.length;
        }
        return binarySearch(cArr, c8, i8, i9);
    }

    private static final boolean contentEquals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    private static final int contentHashCode(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    private static final String contentToString(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    public static final char[] copyInto(char[] cArr, char[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = cArr.length;
        }
        return copyInto(cArr, cArr2, i8, i9, i10);
    }

    private static final char[] copyOf(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static long[] copyOfRange(long[] jArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    private static final char elementAt(char[] cArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return cArr[i8];
    }

    public static final void fill(char[] cArr, char c8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        Arrays.fill(cArr, i8, i9, c8);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = cArr.length;
        }
        fill(cArr, c8, i8, i9);
    }

    public static final /* synthetic */ Double max(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b8);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte b9 = bArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b9));
            if (comparable.compareTo(comparable2) < 0) {
                b8 = b9;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b8);
    }

    public static final /* synthetic */ Character maxWith(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    public static final /* synthetic */ Double min(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b8 = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b8);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte b9 = bArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b9));
            if (comparable.compareTo(comparable2) > 0) {
                b8 = b9;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b8);
    }

    public static final /* synthetic */ Character minWith(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    public static short[] plus(short[] sArr, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        short[] result = Arrays.copyOf(sArr, length + 1);
        result[length] = s7;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final <T> void sort(T[] tArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = objArr.length;
        }
        sort(objArr, i8, i9);
    }

    public static final SortedSet<Character> toSortedSet(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(cArr, new TreeSet());
    }

    private static final byte[] copyOf(byte[] bArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final /* synthetic */ Character max(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(cArr);
    }

    public static final /* synthetic */ Character min(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(cArr);
    }

    public static final <T extends Comparable<? super T>> void sort(T[] tArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i8, i9);
    }

    private static final BigDecimal sumOfBigDecimal(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i8 : iArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Integer.valueOf(i8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i8 : iArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Integer.valueOf(i8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final <T> SortedSet<T> toSortedSet(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }

    public static final Long[] toTypedArray(long[] jArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            lArr[i8] = Long.valueOf(jArr[i8]);
        }
        return lArr;
    }

    private static final short[] copyOf(short[] sArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final float[] copyOfRange(float[] fArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final void sort(byte[] bArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        Arrays.sort(bArr, i8, i9);
    }

    private static final int[] copyOf(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final void sort(short[] sArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        Arrays.sort(sArr, i8, i9);
    }

    private static final long[] copyOf(long[] jArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final double[] copyOfRange(double[] dArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    private static final short[] copyOfRangeInline(short[] sArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(sArr, i8, i9);
        }
        if (i9 <= sArr.length) {
            short[] copyOfRange = Arrays.copyOfRange(sArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + sArr.length);
    }

    public static int[] plus(int[] iArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] result = Arrays.copyOf(iArr, length + 1);
        result[length] = i8;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static void sort(int[] iArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i8, i9);
    }

    private static final BigDecimal sumOfBigDecimal(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (long j8 : jArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Long.valueOf(j8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (long j8 : jArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Long.valueOf(j8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final Float[] toTypedArray(float[] fArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            fArr2[i8] = Float.valueOf(fArr[i8]);
        }
        return fArr2;
    }

    private static final float[] copyOf(float[] fArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static void sort(long[] jArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        Arrays.sort(jArr, i8, i9);
    }

    private static final double[] copyOf(double[] dArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final boolean[] copyOfRange(boolean[] zArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static void sort(float[] fArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        Arrays.sort(fArr, i8, i9);
    }

    private static final boolean[] copyOf(boolean[] zArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final void sort(double[] dArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        Arrays.sort(dArr, i8, i9);
    }

    private static final BigDecimal sumOfBigDecimal(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (float f8 : fArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Float.valueOf(f8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (float f8 : fArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Float.valueOf(f8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final Double[] toTypedArray(double[] dArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            dArr2[i8] = Double.valueOf(dArr[i8]);
        }
        return dArr2;
    }

    private static final char[] copyOf(char[] cArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final char[] copyOfRange(char[] cArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        i.copyOfRangeToIndexCheck(i9, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i8, i9);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static long[] plus(long[] jArr, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        long[] result = Arrays.copyOf(jArr, length + 1);
        result[length] = j8;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final void sort(char[] cArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        Arrays.sort(cArr, i8, i9);
    }

    private static final <T> T[] copyOf(T[] tArr, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <T> void sort(T[] tArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i8, i9);
    }

    private static final int[] copyOfRangeInline(int[] iArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(iArr, i8, i9);
        }
        if (i9 <= iArr.length) {
            int[] copyOfRange = Arrays.copyOfRange(iArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + iArr.length);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s7);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s7));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            short s8 = sArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s8));
            if (comparable.compareTo(comparable2) < 0) {
                s7 = s8;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s7);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s7 = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s7);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s7));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            short s8 = sArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s8));
            if (comparable.compareTo(comparable2) > 0) {
                s7 = s8;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s7);
    }

    private static final BigDecimal sumOfBigDecimal(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (double d8 : dArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Double.valueOf(d8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (double d8 : dArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Double.valueOf(d8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final Boolean[] toTypedArray(boolean[] zArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            boolArr[i8] = Boolean.valueOf(zArr[i8]);
        }
        return boolArr;
    }

    public static final float[] plus(float[] fArr, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] result = Arrays.copyOf(fArr, length + 1);
        result[length] = f8;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    private static final BigDecimal sumOfBigDecimal(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (boolean z7 : zArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Boolean.valueOf(z7)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (boolean z7 : zArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Boolean.valueOf(z7)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final Character[] toTypedArray(char[] cArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            chArr[i8] = Character.valueOf(cArr[i8]);
        }
        return chArr;
    }

    private static final long[] copyOfRangeInline(long[] jArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(jArr, i8, i9);
        }
        if (i9 <= jArr.length) {
            long[] copyOfRange = Arrays.copyOfRange(jArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + jArr.length);
    }

    public static final double[] plus(double[] dArr, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] result = Arrays.copyOf(dArr, length + 1);
        result[length] = d8;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    private static final BigDecimal sumOfBigDecimal(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (char c8 : cArr) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Character.valueOf(c8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (char c8 : cArr) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Character.valueOf(c8)));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i8);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
            if (comparable.compareTo(comparable2) < 0) {
                i8 = i9;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i8);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
            if (comparable.compareTo(comparable2) > 0) {
                i8 = i9;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final boolean[] plus(boolean[] zArr, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        boolean[] result = Arrays.copyOf(zArr, length + 1);
        result[length] = z7;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    private static final float[] copyOfRangeInline(float[] fArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(fArr, i8, i9);
        }
        if (i9 <= fArr.length) {
            float[] copyOfRange = Arrays.copyOfRange(fArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + fArr.length);
    }

    public static final char[] plus(char[] cArr, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        char[] result = Arrays.copyOf(cArr, length + 1);
        result[length] = c8;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    private static final double[] copyOfRangeInline(double[] dArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(dArr, i8, i9);
        }
        if (i9 <= dArr.length) {
            double[] copyOfRange = Arrays.copyOfRange(dArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + dArr.length);
    }

    public static final <T> T[] plus(T[] tArr, Collection<? extends T> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j8);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
            if (comparable.compareTo(comparable2) < 0) {
                j8 = j9;
                comparable = comparable2;
            }
        }
        return Long.valueOf(j8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j8);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
            if (comparable.compareTo(comparable2) > 0) {
                j8 = j9;
                comparable = comparable2;
            }
        }
        return Long.valueOf(j8);
    }

    public static final byte[] plus(byte[] bArr, Collection<Byte> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        byte[] result = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().byteValue();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    private static final boolean[] copyOfRangeInline(boolean[] zArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(zArr, i8, i9);
        }
        if (i9 <= zArr.length) {
            boolean[] copyOfRange = Arrays.copyOfRange(zArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + zArr.length);
    }

    public static final short[] plus(short[] sArr, Collection<Short> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        short[] result = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().shortValue();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    private static final char[] copyOfRangeInline(char[] cArr, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        if (b6.b.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(cArr, i8, i9);
        }
        if (i9 <= cArr.length) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i8, i9);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i9 + ", size: " + cArr.length);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f8);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
            if (comparable.compareTo(comparable2) < 0) {
                f8 = f9;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f8);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
            if (comparable.compareTo(comparable2) > 0) {
                f8 = f9;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f8);
    }

    public static final int[] plus(int[] iArr, Collection<Integer> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int[] result = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().intValue();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final long[] plus(long[] jArr, Collection<Long> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        long[] result = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().longValue();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final float[] plus(float[] fArr, Collection<Float> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        float[] result = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().floatValue();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d8);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            double d9 = dArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d9));
            if (comparable.compareTo(comparable2) < 0) {
                d8 = d9;
                comparable = comparable2;
            }
        }
        return Double.valueOf(d8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d8 = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d8);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            double d9 = dArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d9));
            if (comparable.compareTo(comparable2) > 0) {
                d8 = d9;
                comparable = comparable2;
            }
        }
        return Double.valueOf(d8);
    }

    public static final double[] plus(double[] dArr, Collection<Double> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        double[] result = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().doubleValue();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final boolean[] plus(boolean[] zArr, Collection<Boolean> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        boolean[] result = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().booleanValue();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z7 = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z7);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z7));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            boolean z8 = zArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z8));
            if (comparable.compareTo(comparable2) < 0) {
                z7 = z8;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z7);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z7 = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z7);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z7));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            boolean z8 = zArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z8));
            if (comparable.compareTo(comparable2) > 0) {
                z7 = z8;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z7);
    }

    public static final char[] plus(char[] cArr, Collection<Character> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        char[] result = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().charValue();
            length++;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final <T> T[] plus(T[] tArr, T[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static byte[] plus(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] result = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c8);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            char c9 = cArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c9));
            if (comparable.compareTo(comparable2) < 0) {
                c8 = c9;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c8);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c8 = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c8);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c8));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            char c9 = cArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c9));
            if (comparable.compareTo(comparable2) > 0) {
                c8 = c9;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c8);
    }

    public static short[] plus(short[] sArr, short[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] result = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static int[] plus(int[] iArr, int[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] result = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static long[] plus(long[] jArr, long[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] result = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final float[] plus(float[] fArr, float[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] result = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final double[] plus(double[] dArr, double[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] result = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final boolean[] plus(boolean[] zArr, boolean[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] result = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final char[] plus(char[] cArr, char[] elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] result = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
