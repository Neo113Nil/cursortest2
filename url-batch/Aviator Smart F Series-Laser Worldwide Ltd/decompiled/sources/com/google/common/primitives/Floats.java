package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Floats extends FloatsMethodsForWeb {
    public static final int BYTES = 4;

    @GwtCompatible
    private static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Float) && Floats.indexOf(this.array, ((Float) obj).floatValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.array[this.start + i8] != floatArrayAsList.array[floatArrayAsList.start + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i8 = 1;
            for (int i9 = this.start; i9 < this.end; i9++) {
                i8 = (i8 * 31) + Floats.hashCode(this.array[i9]);
            }
            return i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int indexOf;
            if (!(obj instanceof Float) || (indexOf = Floats.indexOf(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int lastIndexOf;
            if (!(obj instanceof Float) || (lastIndexOf = Floats.lastIndexOf(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i8, int i9) {
            Preconditions.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            float[] fArr = this.array;
            int i10 = this.start;
            return new FloatArrayAsList(fArr, i8 + i10, i10 + i9);
        }

        float[] toFloatArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i8 = this.start;
            while (true) {
                i8++;
                if (i8 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.array[i8]);
            }
        }

        FloatArrayAsList(float[] fArr, int i8, int i9) {
            this.array = fArr;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i8) {
            Preconditions.checkElementIndex(i8, size());
            return Float.valueOf(this.array[this.start + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int i8, Float f8) {
            Preconditions.checkElementIndex(i8, size());
            float[] fArr = this.array;
            int i9 = this.start;
            float f9 = fArr[i9 + i8];
            fArr[i9 + i8] = ((Float) Preconditions.checkNotNull(f8)).floatValue();
            return Float.valueOf(f9);
        }
    }

    private static final class FloatConverter extends Converter<String, Float> implements Serializable {
        static final FloatConverter INSTANCE = new FloatConverter();
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Floats.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Float f8) {
            return f8.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Float doForward(String str) {
            return Float.valueOf(str);
        }
    }

    private enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                int compare = Float.compare(fArr[i8], fArr2[i8]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }
    }

    private Floats() {
    }

    public static List<Float> asList(float... fArr) {
        return fArr.length == 0 ? Collections.emptyList() : new FloatArrayAsList(fArr);
    }

    public static int compare(float f8, float f9) {
        return Float.compare(f8, f9);
    }

    public static float[] concat(float[]... fArr) {
        int i8 = 0;
        for (float[] fArr2 : fArr) {
            i8 += fArr2.length;
        }
        float[] fArr3 = new float[i8];
        int i9 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, i9, fArr4.length);
            i9 += fArr4.length;
        }
        return fArr3;
    }

    @Beta
    public static float constrainToRange(float f8, float f9, float f10) {
        if (f9 <= f10) {
            return Math.min(Math.max(f8, f9), f10);
        }
        throw new IllegalArgumentException(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Float.valueOf(f9), Float.valueOf(f10)));
    }

    public static boolean contains(float[] fArr, float f8) {
        for (float f9 : fArr) {
            if (f9 == f8) {
                return true;
            }
        }
        return false;
    }

    public static float[] ensureCapacity(float[] fArr, int i8, int i9) {
        Preconditions.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        Preconditions.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return fArr.length < i8 ? Arrays.copyOf(fArr, i8 + i9) : fArr;
    }

    public static int hashCode(float f8) {
        return Float.valueOf(f8).hashCode();
    }

    public static int indexOf(float[] fArr, float f8) {
        return indexOf(fArr, f8, 0, fArr.length);
    }

    public static boolean isFinite(float f8) {
        return Float.NEGATIVE_INFINITY < f8 && f8 < Float.POSITIVE_INFINITY;
    }

    public static String join(String str, float... fArr) {
        Preconditions.checkNotNull(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(fArr.length * 12);
        sb.append(fArr[0]);
        for (int i8 = 1; i8 < fArr.length; i8++) {
            sb.append(str);
            sb.append(fArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(float[] fArr, float f8) {
        return lastIndexOf(fArr, f8, 0, fArr.length);
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float max(float... fArr) {
        Preconditions.checkArgument(fArr.length > 0);
        float f8 = fArr[0];
        for (int i8 = 1; i8 < fArr.length; i8++) {
            f8 = Math.max(f8, fArr[i8]);
        }
        return f8;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float min(float... fArr) {
        Preconditions.checkArgument(fArr.length > 0);
        float f8 = fArr[0];
        for (int i8 = 1; i8 < fArr.length; i8++) {
            f8 = Math.min(f8, fArr[i8]);
        }
        return f8;
    }

    public static void reverse(float[] fArr) {
        Preconditions.checkNotNull(fArr);
        reverse(fArr, 0, fArr.length);
    }

    public static void sortDescending(float[] fArr) {
        Preconditions.checkNotNull(fArr);
        sortDescending(fArr, 0, fArr.length);
    }

    @Beta
    public static Converter<String, Float> stringConverter() {
        return FloatConverter.INSTANCE;
    }

    public static float[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof FloatArrayAsList) {
            return ((FloatArrayAsList) collection).toFloatArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i8 = 0; i8 < length; i8++) {
            fArr[i8] = ((Number) Preconditions.checkNotNull(array[i8])).floatValue();
        }
        return fArr;
    }

    @Beta
    @CheckForNull
    @GwtIncompatible
    public static Float tryParse(String str) {
        if (!Doubles.FLOATING_POINT_PATTERN.matcher(str).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(float[] fArr, float f8, int i8, int i9) {
        while (i8 < i9) {
            if (fArr[i8] == f8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(float[] fArr, float f8, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (fArr[i10] == f8) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(float[] fArr, float[] fArr2) {
        Preconditions.checkNotNull(fArr, "array");
        Preconditions.checkNotNull(fArr2, "target");
        if (fArr2.length == 0) {
            return 0;
        }
        int i8 = 0;
        while (i8 < (fArr.length - fArr2.length) + 1) {
            for (int i9 = 0; i9 < fArr2.length; i9++) {
                if (fArr[i8 + i9] != fArr2[i9]) {
                    break;
                }
            }
            return i8;
        }
        return -1;
    }

    public static void reverse(float[] fArr, int i8, int i9) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i8, i9, fArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            float f8 = fArr[i8];
            fArr[i8] = fArr[i10];
            fArr[i10] = f8;
            i8++;
        }
    }

    public static void sortDescending(float[] fArr, int i8, int i9) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i8, i9, fArr.length);
        Arrays.sort(fArr, i8, i9);
        reverse(fArr, i8, i9);
    }
}
