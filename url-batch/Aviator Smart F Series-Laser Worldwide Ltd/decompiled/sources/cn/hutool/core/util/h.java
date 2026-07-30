package cn.hutool.core.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.UniqueKeySet;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.text.StrJoiner;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class h extends g0 {
    @SafeVarargs
    public static <T> T[] addAll(T[]... tArr) {
        if (tArr.length == 1) {
            return tArr[0];
        }
        int i8 = 0;
        for (T[] tArr2 : tArr) {
            if (isNotEmpty((Object[]) tArr2)) {
                i8 += tArr2.length;
            }
        }
        T[] tArr3 = (T[]) newArray(tArr.getClass().getComponentType().getComponentType(), i8);
        int i9 = 0;
        for (T[] tArr4 : tArr) {
            if (isNotEmpty((Object[]) tArr4)) {
                System.arraycopy(tArr4, 0, tArr3, i9, tArr4.length);
                i9 += tArr4.length;
            }
        }
        return tArr3;
    }

    @SafeVarargs
    public static <T> T[] append(T[] tArr, T... tArr2) {
        return isEmpty((Object[]) tArr) ? tArr2 : (T[]) insert((Object[]) tArr, tArr.length, (Object[]) tArr2);
    }

    public static Object[] cast(Class<?> cls, Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument [arrayObj] is null !");
        }
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("Argument [arrayObj] is not array !");
        }
        if (cls == null) {
            return (Object[]) obj;
        }
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        Object[] objArr = (Object[]) obj;
        Object[] newArray = newArray(cls, objArr.length);
        System.arraycopy(objArr, 0, newArray, 0, objArr.length);
        return newArray;
    }

    public static <T> T[] clone(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    public static <T> boolean contains(T[] tArr, T t7) {
        return indexOf(tArr, t7) > -1;
    }

    public static <T> boolean containsAll(T[] tArr, T... tArr2) {
        for (T t7 : tArr2) {
            if (!contains(tArr, t7)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean containsAny(T[] tArr, T... tArr2) {
        for (T t7 : tArr2) {
            if (contains(tArr, t7)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(CharSequence[] charSequenceArr, CharSequence charSequence) {
        return indexOfIgnoreCase(charSequenceArr, charSequence) > -1;
    }

    public static Object copy(Object obj, int i8, Object obj2, int i9, int i10) {
        System.arraycopy(obj, i8, obj2, i9, i10);
        return obj2;
    }

    public static <T> T[] defaultIfEmpty(T[] tArr, T[] tArr2) {
        return isEmpty((Object[]) tArr) ? tArr2 : tArr;
    }

    public static <T> T[] distinct(T[] tArr) {
        if (isEmpty((Object[]) tArr)) {
            return tArr;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(tArr.length, 1.0f);
        Collections.addAll(linkedHashSet, tArr);
        return (T[]) toArray((Collection) linkedHashSet, (Class) getComponentType(tArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] edit(T[] tArr, cn.hutool.core.lang.z zVar) {
        if (zVar == null) {
            return tArr;
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t7 : tArr) {
            Object edit = zVar.edit(t7);
            if (edit != null) {
                arrayList.add(edit);
            }
        }
        return (T[]) arrayList.toArray(newArray(tArr.getClass().getComponentType(), arrayList.size()));
    }

    public static int emptyCount(Object... objArr) {
        if (!isNotEmpty(objArr)) {
            return 0;
        }
        int i8 = 0;
        for (Object obj : objArr) {
            if (e0.isEmpty(obj)) {
                i8++;
            }
        }
        return i8;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (hasNull(obj, obj2)) {
            return false;
        }
        cn.hutool.core.lang.q.isTrue(isArray(obj), "First is not a Array !", new Object[0]);
        cn.hutool.core.lang.q.isTrue(isArray(obj2), "Second is not a Array !", new Object[0]);
        return obj instanceof long[] ? Arrays.equals((long[]) obj, (long[]) obj2) : obj instanceof int[] ? Arrays.equals((int[]) obj, (int[]) obj2) : obj instanceof short[] ? Arrays.equals((short[]) obj, (short[]) obj2) : obj instanceof char[] ? Arrays.equals((char[]) obj, (char[]) obj2) : obj instanceof byte[] ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj instanceof double[] ? Arrays.equals((double[]) obj, (double[]) obj2) : obj instanceof float[] ? Arrays.equals((float[]) obj, (float[]) obj2) : obj instanceof boolean[] ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
    }

    public static <T> T[] filter(T[] tArr, final cn.hutool.core.lang.a0 a0Var) {
        return (tArr == null || a0Var == null) ? tArr : (T[]) edit(tArr, new cn.hutool.core.lang.z() { // from class: cn.hutool.core.util.d
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj) {
                Object lambda$filter$0;
                lambda$filter$0 = h.lambda$filter$0(cn.hutool.core.lang.a0.this, obj);
                return lambda$filter$0;
            }
        });
    }

    public static <T> T firstMatch(cn.hutool.core.lang.d0 d0Var, T... tArr) {
        int matchIndex = matchIndex(d0Var, tArr);
        if (matchIndex < 0) {
            return null;
        }
        return tArr[matchIndex];
    }

    public static <T> T firstNonNull(T... tArr) {
        return (T) firstMatch(new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.util.e
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return e0.isNotNull(obj);
            }
        }, tArr);
    }

    public static <T> T get(Object obj, int i8) {
        if (obj == null) {
            return null;
        }
        if (i8 < 0) {
            i8 += Array.getLength(obj);
        }
        try {
            return (T) Array.get(obj, i8);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] getAny(Object obj, int... iArr) {
        if (obj == null) {
            return null;
        }
        if (iArr == null) {
            return (T[]) newArray(obj.getClass().getComponentType(), 0);
        }
        T[] tArr = (T[]) newArray(obj.getClass().getComponentType(), iArr.length);
        for (int i8 = 0; i8 < iArr.length; i8++) {
            tArr[i8] = get(obj, iArr[i8]);
        }
        return tArr;
    }

    public static Class<?> getArrayType(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    public static Class<?> getComponentType(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getComponentType();
    }

    public static boolean hasEmpty(Object... objArr) {
        if (isNotEmpty(objArr)) {
            for (Object obj : objArr) {
                if (e0.isEmpty(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean hasNull(T... tArr) {
        if (isNotEmpty((Object[]) tArr)) {
            for (T t7 : tArr) {
                if (e0.isNull(t7)) {
                    return true;
                }
            }
        }
        return tArr == null;
    }

    public static <T> int indexOf(T[] tArr, final Object obj, int i8) {
        return matchIndex(new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.util.c
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj2) {
                boolean equal;
                equal = e0.equal(obj, obj2);
                return equal;
            }
        }, i8, tArr);
    }

    public static int indexOfIgnoreCase(CharSequence[] charSequenceArr, CharSequence charSequence) {
        if (charSequenceArr == null) {
            return -1;
        }
        for (int i8 = 0; i8 < charSequenceArr.length; i8++) {
            if (cn.hutool.core.text.l.equalsIgnoreCase(charSequenceArr[i8], charSequence)) {
                return i8;
            }
        }
        return -1;
    }

    public static <T> int indexOfSub(T[] tArr, T[] tArr2) {
        return indexOfSub(tArr, 0, tArr2);
    }

    public static <T> T[] insert(T[] tArr, int i8, T... tArr2) {
        return (T[]) ((Object[]) insert((Object) tArr, i8, (Object[]) tArr2));
    }

    public static boolean isAllEmpty(Object... objArr) {
        for (Object obj : objArr) {
            if (!e0.isEmpty(obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllNotEmpty(Object... objArr) {
        return !hasEmpty(objArr);
    }

    public static <T> boolean isAllNotNull(T... tArr) {
        return !hasNull(tArr);
    }

    public static <T> boolean isAllNull(T... tArr) {
        return firstNonNull(tArr) == null;
    }

    public static boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    public static <T> boolean isEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> boolean isNotEmpty(T[] tArr) {
        return (tArr == null || tArr.length == 0) ? false : true;
    }

    public static <T> boolean isSorted(T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null || comparator == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < tArr.length - 1) {
            T t7 = tArr[i8];
            i8++;
            if (comparator.compare(t7, tArr[i8]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<? super T>> boolean isSortedASC(T[] tArr) {
        if (tArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < tArr.length - 1) {
            T t7 = tArr[i8];
            i8++;
            if (t7.compareTo(tArr[i8]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<? super T>> boolean isSortedDESC(T[] tArr) {
        if (tArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < tArr.length - 1) {
            T t7 = tArr[i8];
            i8++;
            if (t7.compareTo(tArr[i8]) < 0) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean isSub(T[] tArr, T[] tArr2) {
        return indexOfSub(tArr, tArr2) > -1;
    }

    public static <T> String join(T[] tArr, CharSequence charSequence) {
        return join(tArr, charSequence, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$filter$0(cn.hutool.core.lang.a0 a0Var, Object obj) {
        if (a0Var.accept(obj)) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CharSequence lambda$join$5(cn.hutool.core.lang.z zVar, Object obj) {
        return String.valueOf(zVar.edit(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$nullToEmpty$2(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$removeNull$1(Object obj) {
        return obj;
    }

    public static <T> int lastIndexOf(T[] tArr, Object obj) {
        if (isEmpty((Object[]) tArr)) {
            return -1;
        }
        return lastIndexOf(tArr, obj, tArr.length - 1);
    }

    public static <T> int lastIndexOfSub(T[] tArr, T[] tArr2) {
        if (isEmpty((Object[]) tArr) || isEmpty((Object[]) tArr2)) {
            return -1;
        }
        return lastIndexOfSub(tArr, tArr.length - 1, tArr2);
    }

    public static int length(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, R> R[] map(T[] tArr, Class<R> cls, Function<? super T, ? extends R> function) {
        Object apply;
        R[] rArr = (R[]) newArray(cls, tArr.length);
        for (int i8 = 0; i8 < tArr.length; i8++) {
            apply = function.apply(tArr[i8]);
            rArr[i8] = apply;
        }
        return rArr;
    }

    public static <T, R> Set<R> mapToSet(T[] tArr, Function<? super T, ? extends R> function) {
        Stream stream;
        Stream map;
        Collector set;
        Object collect;
        stream = Arrays.stream(tArr);
        map = stream.map(function);
        set = Collectors.toSet();
        collect = map.collect(set);
        return (Set) collect;
    }

    public static <T> int matchIndex(cn.hutool.core.lang.d0 d0Var, T... tArr) {
        return matchIndex(d0Var, 0, tArr);
    }

    public static <T extends Comparable<? super T>> T max(T[] tArr) {
        return (T) max(tArr, null);
    }

    public static <T extends Comparable<? super T>> T min(T[] tArr) {
        return (T) min(tArr, null);
    }

    public static <T> T[] newArray(Class<?> cls, int i8) {
        return (T[]) ((Object[]) Array.newInstance(cls, i8));
    }

    public static String[] nullToEmpty(String[] strArr) {
        return (String[]) edit(strArr, new cn.hutool.core.lang.z() { // from class: cn.hutool.core.util.f
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj) {
                String lambda$nullToEmpty$2;
                lambda$nullToEmpty$2 = h.lambda$nullToEmpty$2((String) obj);
                return lambda$nullToEmpty$2;
            }
        });
    }

    public static <T> T[] remove(T[] tArr, int i8) {
        return (T[]) ((Object[]) g0.remove(tArr, i8));
    }

    public static <T extends CharSequence> T[] removeBlank(T[] tArr) {
        return (T[]) ((CharSequence[]) filter(tArr, new cn.hutool.core.collection.t()));
    }

    public static <T> T[] removeEle(T[] tArr, T t7) {
        return (T[]) remove((Object[]) tArr, indexOf(tArr, t7));
    }

    public static <T extends CharSequence> T[] removeEmpty(T[] tArr) {
        return (T[]) ((CharSequence[]) filter(tArr, new cn.hutool.core.collection.p()));
    }

    public static <T> T[] removeNull(T[] tArr) {
        return (T[]) edit(tArr, new cn.hutool.core.lang.z() { // from class: cn.hutool.core.util.a
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj) {
                Object lambda$removeNull$1;
                lambda$removeNull$1 = h.lambda$removeNull$1(obj);
                return lambda$removeNull$1;
            }
        });
    }

    public static <T> T[] replace(T[] tArr, int i8, T... tArr2) {
        if (isEmpty((Object[]) tArr2)) {
            return tArr;
        }
        if (isEmpty((Object[]) tArr)) {
            return tArr2;
        }
        if (i8 < 0) {
            return (T[]) insert((Object[]) tArr, 0, (Object[]) tArr2);
        }
        if (i8 >= tArr.length) {
            return (T[]) append((Object[]) tArr, (Object[]) tArr2);
        }
        if (tArr.length >= tArr2.length + i8) {
            System.arraycopy(tArr2, 0, tArr, i8, tArr2.length);
            return tArr;
        }
        T[] tArr3 = (T[]) newArray(tArr.getClass().getComponentType(), tArr2.length + i8);
        System.arraycopy(tArr, 0, tArr3, 0, i8);
        System.arraycopy(tArr2, 0, tArr3, i8, tArr2.length);
        return tArr3;
    }

    public static <T> T[] resize(T[] tArr, int i8, Class<?> cls) {
        if (i8 < 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) newArray(cls, i8);
        if (i8 > 0 && isNotEmpty((Object[]) tArr)) {
            System.arraycopy(tArr, 0, tArr2, 0, Math.min(tArr.length, i8));
        }
        return tArr2;
    }

    public static <T> T[] reverse(T[] tArr, int i8, int i9) {
        if (isEmpty((Object[]) tArr)) {
            return tArr;
        }
        int min = Math.min(tArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            T t7 = tArr[min];
            tArr[min] = tArr[max];
            tArr[max] = t7;
            min--;
        }
        return tArr;
    }

    public static <T> T[] setOrAppend(T[] tArr, int i8, T t7) {
        if (i8 < tArr.length) {
            Array.set(tArr, i8, t7);
            return tArr;
        }
        if (!isEmpty((Object[]) tArr)) {
            return (T[]) append((Object[]) tArr, t7);
        }
        Object[] newArray = newArray(t7.getClass(), 1);
        newArray[0] = t7;
        return (T[]) append((Object[]) tArr, newArray);
    }

    public static <T> T[] shuffle(T[] tArr) {
        return (T[]) shuffle(tArr, i0.getRandom());
    }

    public static <T> T[] sub(T[] tArr, int i8, int i9) {
        int length = length(tArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return (T[]) newArray(tArr.getClass().getComponentType(), 0);
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return (T[]) newArray(tArr.getClass().getComponentType(), 0);
        }
        return (T[]) Arrays.copyOfRange(tArr, i9, length);
    }

    public static <T> T[] swap(T[] tArr, int i8, int i9) {
        if (isEmpty((Object[]) tArr)) {
            throw new IllegalArgumentException("Array must not empty !");
        }
        T t7 = tArr[i8];
        tArr[i8] = tArr[i9];
        tArr[i9] = t7;
        return tArr;
    }

    public static byte[] toArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return Arrays.copyOfRange(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        }
        int position = byteBuffer.position();
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (isArray(obj)) {
            try {
                return Arrays.deepToString((Object[]) obj);
            } catch (Exception unused) {
            }
        }
        return obj.toString();
    }

    public static Object[] wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!isArray(obj)) {
            throw new UtilException(cn.hutool.core.text.l.format("[{}] is not Array!", obj.getClass()));
        }
        try {
            return (Object[]) obj;
        } catch (Exception e8) {
            String name = obj.getClass().getComponentType().getName();
            if (name.equals("double")) {
                return g0.wrap((double[]) obj);
            }
            if (name.equals("int")) {
                return g0.wrap((int[]) obj);
            }
            if (name.equals("byte")) {
                return g0.wrap((byte[]) obj);
            }
            if (name.equals("char")) {
                return g0.wrap((char[]) obj);
            }
            if (name.equals("long")) {
                return g0.wrap((long[]) obj);
            }
            if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                return g0.wrap((boolean[]) obj);
            }
            if (name.equals(TypedValues.Custom.S_FLOAT)) {
                return g0.wrap((float[]) obj);
            }
            if (name.equals("short")) {
                return g0.wrap((short[]) obj);
            }
            throw new UtilException(e8);
        }
    }

    public static <K, V> Map<K, V> zip(K[] kArr, V[] vArr, boolean z7) {
        if (isEmpty((Object[]) kArr) || isEmpty((Object[]) vArr)) {
            return null;
        }
        int min = Math.min(kArr.length, vArr.length);
        HashMap newHashMap = cn.hutool.core.map.h1.newHashMap(min, z7);
        for (int i8 = 0; i8 < min; i8++) {
            newHashMap.put(kArr[i8], vArr[i8]);
        }
        return newHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T clone(T t7) {
        if (t7 == 0 || !isArray(t7)) {
            return null;
        }
        Class<?> componentType = t7.getClass().getComponentType();
        if (!componentType.isPrimitive()) {
            return (T) ((Object[]) t7).clone();
        }
        int length = Array.getLength(t7);
        T t8 = (T) Array.newInstance(componentType, length);
        while (true) {
            int i8 = length - 1;
            if (length <= 0) {
                return t8;
            }
            Array.set(t8, i8, Array.get(t7, i8));
            length = i8;
        }
    }

    public static Object copy(Object obj, Object obj2, int i8) {
        System.arraycopy(obj, 0, obj2, 0, i8);
        return obj2;
    }

    public static Class<?> getComponentType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.getComponentType();
    }

    public static <T> int indexOf(T[] tArr, final Object obj) {
        return matchIndex(new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.util.b
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj2) {
                boolean equal;
                equal = e0.equal(obj, obj2);
                return equal;
            }
        }, tArr);
    }

    public static <T> int indexOfSub(T[] tArr, int i8, T[] tArr2) {
        if (!isEmpty((Object[]) tArr) && !isEmpty((Object[]) tArr2) && tArr2.length <= tArr.length) {
            int indexOf = indexOf(tArr, tArr2[0], i8);
            if (indexOf >= 0 && tArr2.length + indexOf <= tArr.length) {
                for (int i9 = 0; i9 < tArr2.length; i9++) {
                    if (!e0.equal(tArr[i9 + indexOf], tArr2[i9])) {
                        return indexOfSub(tArr, indexOf + 1, tArr2);
                    }
                }
                return indexOf;
            }
        }
        return -1;
    }

    public static <T> Object insert(Object obj, int i8, T... tArr) {
        if (isEmpty((Object[]) tArr)) {
            return obj;
        }
        if (isEmpty(obj)) {
            return tArr;
        }
        int length = length(obj);
        if (i8 < 0) {
            i8 = (i8 % length) + length;
        }
        Class<?> componentType = obj.getClass().getComponentType();
        Object convert = componentType.isPrimitive() ? cn.hutool.core.convert.d.convert((Class) obj.getClass(), (Object) tArr) : tArr;
        Object newInstance = Array.newInstance(componentType, Math.max(length, i8) + tArr.length);
        System.arraycopy(obj, 0, newInstance, 0, Math.min(length, i8));
        System.arraycopy(convert, 0, newInstance, i8, tArr.length);
        if (i8 < length) {
            System.arraycopy(obj, i8, newInstance, tArr.length + i8, length - i8);
        }
        return newInstance;
    }

    public static boolean isEmpty(Object obj) {
        if (obj != null) {
            return isArray(obj) && Array.getLength(obj) == 0;
        }
        return true;
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static <T> String join(T[] tArr, CharSequence charSequence, String str, String str2) {
        if (tArr == null) {
            return null;
        }
        return StrJoiner.of(charSequence, str, str2).setWrapElement(true).append((Object[]) tArr).toString();
    }

    public static <T> int matchIndex(cn.hutool.core.lang.d0 d0Var, int i8, T... tArr) {
        cn.hutool.core.lang.q.notNull(d0Var, "Matcher must be not null !", new Object[0]);
        if (!isNotEmpty((Object[]) tArr)) {
            return -1;
        }
        while (i8 < tArr.length) {
            if (d0Var.match(tArr[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static <T extends Comparable<? super T>> T max(T[] tArr, Comparator<T> comparator) {
        if (isEmpty((Object[]) tArr)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        T t7 = tArr[0];
        for (int i8 = 1; i8 < tArr.length; i8++) {
            if (cn.hutool.core.comparator.d.compare(t7, tArr[i8], comparator) < 0) {
                t7 = tArr[i8];
            }
        }
        return t7;
    }

    public static <T extends Comparable<? super T>> T min(T[] tArr, Comparator<T> comparator) {
        if (isEmpty((Object[]) tArr)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        T t7 = tArr[0];
        for (T t8 : tArr) {
            if (cn.hutool.core.comparator.d.compare(t7, t8, comparator) > 0) {
                t7 = t8;
            }
        }
        return t7;
    }

    public static Object[] newArray(int i8) {
        return new Object[i8];
    }

    public static <T> T[] shuffle(T[] tArr, Random random) {
        if (tArr != null && random != null && tArr.length > 1) {
            for (int length = tArr.length; length > 1; length--) {
                swap((Object[]) tArr, length - 1, random.nextInt(length));
            }
        }
        return tArr;
    }

    @SafeVarargs
    public static <T> Object append(Object obj, T... tArr) {
        return isEmpty(obj) ? tArr : insert(obj, length(obj), tArr);
    }

    public static <T extends Comparable<? super T>> boolean isSorted(T[] tArr) {
        return isSortedASC(tArr);
    }

    public static <T> int lastIndexOf(T[] tArr, Object obj, int i8) {
        if (!isNotEmpty((Object[]) tArr)) {
            return -1;
        }
        while (i8 >= 0) {
            if (e0.equal(obj, tArr[i8])) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    public static <T> int lastIndexOfSub(T[] tArr, int i8, T[] tArr2) {
        if (!isEmpty((Object[]) tArr) && !isEmpty((Object[]) tArr2) && tArr2.length <= tArr.length && i8 >= 0) {
            int lastIndexOf = lastIndexOf(tArr, tArr2[0]);
            if (lastIndexOf >= 0 && tArr2.length + lastIndexOf <= tArr.length) {
                for (int i9 = 0; i9 < tArr2.length; i9++) {
                    if (!e0.equal(tArr[i9 + lastIndexOf], tArr2[i9])) {
                        return lastIndexOfSub(tArr, lastIndexOf - 1, tArr2);
                    }
                }
                return lastIndexOf;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, R> R[] map(Object obj, Class<R> cls, Function<? super T, ? extends R> function) {
        Object apply;
        int length = length(obj);
        R[] rArr = (R[]) newArray(cls, length);
        for (int i8 = 0; i8 < length; i8++) {
            apply = function.apply(get(obj, i8));
            rArr[i8] = apply;
        }
        return rArr;
    }

    public static Object resize(Object obj, int i8) {
        if (i8 < 0) {
            return obj;
        }
        if (obj == null) {
            return null;
        }
        int length = length(obj);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i8);
        if (i8 > 0 && isNotEmpty(obj)) {
            System.arraycopy(obj, 0, newInstance, 0, Math.min(length, i8));
        }
        return newInstance;
    }

    public static <T, K> T[] distinct(T[] tArr, Function<T, K> function, boolean z7) {
        if (isEmpty((Object[]) tArr)) {
            return tArr;
        }
        UniqueKeySet uniqueKeySet = new UniqueKeySet(true, (Function) function);
        if (z7) {
            Collections.addAll(uniqueKeySet, tArr);
        } else {
            for (T t7 : tArr) {
                uniqueKeySet.addIfAbsent(t7);
            }
        }
        return (T[]) toArray((Collection) uniqueKeySet, (Class) getComponentType(tArr));
    }

    public static Object[] sub(Object obj, int i8, int i9) {
        return sub(obj, i8, i9, 1);
    }

    public static <K, V> Map<K, V> zip(K[] kArr, V[] vArr) {
        return zip(kArr, vArr, false);
    }

    public static <T> String join(T[] tArr, CharSequence charSequence, final cn.hutool.core.lang.z zVar) {
        return StrJoiner.of(charSequence).append(tArr, new Function() { // from class: cn.hutool.core.util.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                CharSequence lambda$join$5;
                lambda$join$5 = h.lambda$join$5(cn.hutool.core.lang.z.this, obj);
                return lambda$join$5;
            }
        }).toString();
    }

    public static Object[] sub(Object obj, int i8, int i9, int i10) {
        int length = length(obj);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new Object[0];
        }
        if (i8 <= i9) {
            int i11 = i9;
            i9 = i8;
            i8 = i11;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new Object[0];
        }
        if (i10 <= 1) {
            i10 = 1;
        }
        ArrayList arrayList = new ArrayList();
        while (i9 < length) {
            arrayList.add(get(obj, i9));
            i9 += i10;
        }
        return arrayList.toArray();
    }

    public static Object swap(Object obj, int i8, int i9) {
        if (!isEmpty(obj)) {
            Object obj2 = get(obj, i8);
            Array.set(obj, i8, Array.get(obj, i9));
            Array.set(obj, i9, obj2);
            return obj;
        }
        throw new IllegalArgumentException("Array must not empty !");
    }

    public static String join(Object obj, CharSequence charSequence) {
        if (obj == null) {
            return null;
        }
        if (isArray(obj)) {
            return StrJoiner.of(charSequence).append(obj).toString();
        }
        throw new IllegalArgumentException(cn.hutool.core.text.l.format("[{}] is not a Array!", obj.getClass()));
    }

    public static <T, R> List<R> map(T[] tArr, Function<? super T, ? extends R> function) {
        Stream stream;
        Stream map;
        Collector list;
        Object collect;
        stream = Arrays.stream(tArr);
        map = stream.map(function);
        list = Collectors.toList();
        collect = map.collect(list);
        return (List) collect;
    }

    public static <T> T[] reverse(T[] tArr) {
        return (T[]) reverse(tArr, 0, tArr.length);
    }

    public static <T> T[] resize(T[] tArr, int i8) {
        return (T[]) resize(tArr, i8, tArr.getClass().getComponentType());
    }

    public static Object setOrAppend(Object obj, int i8, Object obj2) {
        if (i8 < length(obj)) {
            Array.set(obj, i8, obj2);
            return obj;
        }
        return append(obj, obj2);
    }

    public static <T> T[] toArray(Iterator<T> it, Class<T> cls) {
        return (T[]) toArray((Collection) CollUtil.newArrayList(it), (Class) cls);
    }

    public static <T> T[] toArray(Iterable<T> iterable, Class<T> cls) {
        return (T[]) toArray(CollUtil.toCollection(iterable), (Class) cls);
    }

    public static <T> T[] toArray(Collection<T> collection, Class<T> cls) {
        return (T[]) collection.toArray(newArray(cls, 0));
    }
}
