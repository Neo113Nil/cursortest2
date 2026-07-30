package kotlin.collections.unsigned;

import com.github.mikephil.charting.utils.i;
import f6.l;
import j6.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.a1;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.collections.l0;
import kotlin.collections.x;
import kotlin.jvm.internal.s;
import kotlin.random.Random;
import y5.h;
import y5.n;
import y5.o;
import y5.p;
import y5.q;
import y5.r;
import y5.u;
import y5.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class UArraysKt___UArraysKt extends b {
    /* renamed from: all-JOV_ifY, reason: not valid java name */
    private static final boolean m466allJOV_ifY(byte[] all, l predicate) {
        s.checkNotNullParameter(all, "$this$all");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(all);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            if (!((Boolean) predicate.invoke(n.m1550boximpl(o.m1614getw2LRezQ(all, i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: all-MShoTSo, reason: not valid java name */
    private static final boolean m467allMShoTSo(long[] all, l predicate) {
        s.checkNotNullParameter(all, "$this$all");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(all);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            if (!((Boolean) predicate.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(all, i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: all-jgv0xPQ, reason: not valid java name */
    private static final boolean m468alljgv0xPQ(int[] all, l predicate) {
        s.checkNotNullParameter(all, "$this$all");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(all);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            if (!((Boolean) predicate.invoke(p.m1626boximpl(q.m1692getpVg5ArA(all, i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: all-xTcfx_M, reason: not valid java name */
    private static final boolean m469allxTcfx_M(short[] all, l predicate) {
        s.checkNotNullParameter(all, "$this$all");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(all);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            if (!((Boolean) predicate.invoke(u.m1782boximpl(v.m1846getMh2AYeg(all, i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: any--ajY-9A, reason: not valid java name */
    private static final boolean m470anyajY9A(int[] any) {
        boolean any2;
        s.checkNotNullParameter(any, "$this$any");
        any2 = ArraysKt___ArraysKt.any(any);
        return any2;
    }

    /* renamed from: any-GBYM_sE, reason: not valid java name */
    private static final boolean m471anyGBYM_sE(byte[] any) {
        boolean any2;
        s.checkNotNullParameter(any, "$this$any");
        any2 = ArraysKt___ArraysKt.any(any);
        return any2;
    }

    /* renamed from: any-JOV_ifY, reason: not valid java name */
    private static final boolean m472anyJOV_ifY(byte[] any, l predicate) {
        s.checkNotNullParameter(any, "$this$any");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(any);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            if (((Boolean) predicate.invoke(n.m1550boximpl(o.m1614getw2LRezQ(any, i8)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: any-MShoTSo, reason: not valid java name */
    private static final boolean m473anyMShoTSo(long[] any, l predicate) {
        s.checkNotNullParameter(any, "$this$any");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(any);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            if (((Boolean) predicate.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(any, i8)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: any-QwZRm1k, reason: not valid java name */
    private static final boolean m474anyQwZRm1k(long[] any) {
        boolean any2;
        s.checkNotNullParameter(any, "$this$any");
        any2 = ArraysKt___ArraysKt.any(any);
        return any2;
    }

    /* renamed from: any-jgv0xPQ, reason: not valid java name */
    private static final boolean m475anyjgv0xPQ(int[] any, l predicate) {
        s.checkNotNullParameter(any, "$this$any");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(any);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            if (((Boolean) predicate.invoke(p.m1626boximpl(q.m1692getpVg5ArA(any, i8)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: any-rL5Bavg, reason: not valid java name */
    private static final boolean m476anyrL5Bavg(short[] any) {
        boolean any2;
        s.checkNotNullParameter(any, "$this$any");
        any2 = ArraysKt___ArraysKt.any(any);
        return any2;
    }

    /* renamed from: any-xTcfx_M, reason: not valid java name */
    private static final boolean m477anyxTcfx_M(short[] any, l predicate) {
        s.checkNotNullParameter(any, "$this$any");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(any);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            if (((Boolean) predicate.invoke(u.m1782boximpl(v.m1846getMh2AYeg(any, i8)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: asByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m478asByteArrayGBYM_sE(byte[] asByteArray) {
        s.checkNotNullParameter(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    /* renamed from: asIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m479asIntArrayajY9A(int[] asIntArray) {
        s.checkNotNullParameter(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    /* renamed from: asLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m480asLongArrayQwZRm1k(long[] asLongArray) {
        s.checkNotNullParameter(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    /* renamed from: asShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m481asShortArrayrL5Bavg(short[] asShortArray) {
        s.checkNotNullParameter(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    private static final byte[] asUByteArray(byte[] bArr) {
        s.checkNotNullParameter(bArr, "<this>");
        return o.m1609constructorimpl(bArr);
    }

    private static final int[] asUIntArray(int[] iArr) {
        s.checkNotNullParameter(iArr, "<this>");
        return q.m1687constructorimpl(iArr);
    }

    private static final long[] asULongArray(long[] jArr) {
        s.checkNotNullParameter(jArr, "<this>");
        return y5.s.m1765constructorimpl(jArr);
    }

    private static final short[] asUShortArray(short[] sArr) {
        s.checkNotNullParameter(sArr, "<this>");
        return v.m1841constructorimpl(sArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: associateWith-JOV_ifY, reason: not valid java name */
    private static final <V> Map<n, V> m482associateWithJOV_ifY(byte[] associateWith, l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        s.checkNotNullParameter(associateWith, "$this$associateWith");
        s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(o.m1615getSizeimpl(associateWith));
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int m1615getSizeimpl = o.m1615getSizeimpl(associateWith);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(associateWith, i8);
            linkedHashMap.put(n.m1550boximpl(m1614getw2LRezQ), valueSelector.invoke(n.m1550boximpl(m1614getw2LRezQ)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: associateWith-MShoTSo, reason: not valid java name */
    private static final <V> Map<r, V> m483associateWithMShoTSo(long[] associateWith, l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        s.checkNotNullParameter(associateWith, "$this$associateWith");
        s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(y5.s.m1771getSizeimpl(associateWith));
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(associateWith);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(associateWith, i8);
            linkedHashMap.put(r.m1704boximpl(m1770getsVKNKU), valueSelector.invoke(r.m1704boximpl(m1770getsVKNKU)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: associateWith-jgv0xPQ, reason: not valid java name */
    private static final <V> Map<p, V> m484associateWithjgv0xPQ(int[] associateWith, l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        s.checkNotNullParameter(associateWith, "$this$associateWith");
        s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(q.m1693getSizeimpl(associateWith));
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int m1693getSizeimpl = q.m1693getSizeimpl(associateWith);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(associateWith, i8);
            linkedHashMap.put(p.m1626boximpl(m1692getpVg5ArA), valueSelector.invoke(p.m1626boximpl(m1692getpVg5ArA)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: associateWith-xTcfx_M, reason: not valid java name */
    private static final <V> Map<u, V> m485associateWithxTcfx_M(short[] associateWith, l valueSelector) {
        int mapCapacity;
        int coerceAtLeast;
        s.checkNotNullParameter(associateWith, "$this$associateWith");
        s.checkNotNullParameter(valueSelector, "valueSelector");
        mapCapacity = l0.mapCapacity(v.m1847getSizeimpl(associateWith));
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int m1847getSizeimpl = v.m1847getSizeimpl(associateWith);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(associateWith, i8);
            linkedHashMap.put(u.m1782boximpl(m1846getMh2AYeg), valueSelector.invoke(u.m1782boximpl(m1846getMh2AYeg)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: associateWithTo-4D70W2E, reason: not valid java name */
    private static final <V, M extends Map<? super p, ? super V>> M m486associateWithTo4D70W2E(int[] associateWithTo, M destination, l valueSelector) {
        s.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(valueSelector, "valueSelector");
        int m1693getSizeimpl = q.m1693getSizeimpl(associateWithTo);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(associateWithTo, i8);
            destination.put(p.m1626boximpl(m1692getpVg5ArA), valueSelector.invoke(p.m1626boximpl(m1692getpVg5ArA)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: associateWithTo-H21X9dk, reason: not valid java name */
    private static final <V, M extends Map<? super n, ? super V>> M m487associateWithToH21X9dk(byte[] associateWithTo, M destination, l valueSelector) {
        s.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(valueSelector, "valueSelector");
        int m1615getSizeimpl = o.m1615getSizeimpl(associateWithTo);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(associateWithTo, i8);
            destination.put(n.m1550boximpl(m1614getw2LRezQ), valueSelector.invoke(n.m1550boximpl(m1614getw2LRezQ)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: associateWithTo-X6OPwNk, reason: not valid java name */
    private static final <V, M extends Map<? super r, ? super V>> M m488associateWithToX6OPwNk(long[] associateWithTo, M destination, l valueSelector) {
        s.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(valueSelector, "valueSelector");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(associateWithTo);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(associateWithTo, i8);
            destination.put(r.m1704boximpl(m1770getsVKNKU), valueSelector.invoke(r.m1704boximpl(m1770getsVKNKU)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: associateWithTo-ciTST-8, reason: not valid java name */
    private static final <V, M extends Map<? super u, ? super V>> M m489associateWithTociTST8(short[] associateWithTo, M destination, l valueSelector) {
        s.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(valueSelector, "valueSelector");
        int m1847getSizeimpl = v.m1847getSizeimpl(associateWithTo);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(associateWithTo, i8);
            destination.put(u.m1782boximpl(m1846getMh2AYeg), valueSelector.invoke(u.m1782boximpl(m1846getMh2AYeg)));
        }
        return destination;
    }

    /* renamed from: component1--ajY-9A, reason: not valid java name */
    private static final int m490component1ajY9A(int[] component1) {
        s.checkNotNullParameter(component1, "$this$component1");
        return q.m1692getpVg5ArA(component1, 0);
    }

    /* renamed from: component1-GBYM_sE, reason: not valid java name */
    private static final byte m491component1GBYM_sE(byte[] component1) {
        s.checkNotNullParameter(component1, "$this$component1");
        return o.m1614getw2LRezQ(component1, 0);
    }

    /* renamed from: component1-QwZRm1k, reason: not valid java name */
    private static final long m492component1QwZRm1k(long[] component1) {
        s.checkNotNullParameter(component1, "$this$component1");
        return y5.s.m1770getsVKNKU(component1, 0);
    }

    /* renamed from: component1-rL5Bavg, reason: not valid java name */
    private static final short m493component1rL5Bavg(short[] component1) {
        s.checkNotNullParameter(component1, "$this$component1");
        return v.m1846getMh2AYeg(component1, 0);
    }

    /* renamed from: component2--ajY-9A, reason: not valid java name */
    private static final int m494component2ajY9A(int[] component2) {
        s.checkNotNullParameter(component2, "$this$component2");
        return q.m1692getpVg5ArA(component2, 1);
    }

    /* renamed from: component2-GBYM_sE, reason: not valid java name */
    private static final byte m495component2GBYM_sE(byte[] component2) {
        s.checkNotNullParameter(component2, "$this$component2");
        return o.m1614getw2LRezQ(component2, 1);
    }

    /* renamed from: component2-QwZRm1k, reason: not valid java name */
    private static final long m496component2QwZRm1k(long[] component2) {
        s.checkNotNullParameter(component2, "$this$component2");
        return y5.s.m1770getsVKNKU(component2, 1);
    }

    /* renamed from: component2-rL5Bavg, reason: not valid java name */
    private static final short m497component2rL5Bavg(short[] component2) {
        s.checkNotNullParameter(component2, "$this$component2");
        return v.m1846getMh2AYeg(component2, 1);
    }

    /* renamed from: component3--ajY-9A, reason: not valid java name */
    private static final int m498component3ajY9A(int[] component3) {
        s.checkNotNullParameter(component3, "$this$component3");
        return q.m1692getpVg5ArA(component3, 2);
    }

    /* renamed from: component3-GBYM_sE, reason: not valid java name */
    private static final byte m499component3GBYM_sE(byte[] component3) {
        s.checkNotNullParameter(component3, "$this$component3");
        return o.m1614getw2LRezQ(component3, 2);
    }

    /* renamed from: component3-QwZRm1k, reason: not valid java name */
    private static final long m500component3QwZRm1k(long[] component3) {
        s.checkNotNullParameter(component3, "$this$component3");
        return y5.s.m1770getsVKNKU(component3, 2);
    }

    /* renamed from: component3-rL5Bavg, reason: not valid java name */
    private static final short m501component3rL5Bavg(short[] component3) {
        s.checkNotNullParameter(component3, "$this$component3");
        return v.m1846getMh2AYeg(component3, 2);
    }

    /* renamed from: component4--ajY-9A, reason: not valid java name */
    private static final int m502component4ajY9A(int[] component4) {
        s.checkNotNullParameter(component4, "$this$component4");
        return q.m1692getpVg5ArA(component4, 3);
    }

    /* renamed from: component4-GBYM_sE, reason: not valid java name */
    private static final byte m503component4GBYM_sE(byte[] component4) {
        s.checkNotNullParameter(component4, "$this$component4");
        return o.m1614getw2LRezQ(component4, 3);
    }

    /* renamed from: component4-QwZRm1k, reason: not valid java name */
    private static final long m504component4QwZRm1k(long[] component4) {
        s.checkNotNullParameter(component4, "$this$component4");
        return y5.s.m1770getsVKNKU(component4, 3);
    }

    /* renamed from: component4-rL5Bavg, reason: not valid java name */
    private static final short m505component4rL5Bavg(short[] component4) {
        s.checkNotNullParameter(component4, "$this$component4");
        return v.m1846getMh2AYeg(component4, 3);
    }

    /* renamed from: component5--ajY-9A, reason: not valid java name */
    private static final int m506component5ajY9A(int[] component5) {
        s.checkNotNullParameter(component5, "$this$component5");
        return q.m1692getpVg5ArA(component5, 4);
    }

    /* renamed from: component5-GBYM_sE, reason: not valid java name */
    private static final byte m507component5GBYM_sE(byte[] component5) {
        s.checkNotNullParameter(component5, "$this$component5");
        return o.m1614getw2LRezQ(component5, 4);
    }

    /* renamed from: component5-QwZRm1k, reason: not valid java name */
    private static final long m508component5QwZRm1k(long[] component5) {
        s.checkNotNullParameter(component5, "$this$component5");
        return y5.s.m1770getsVKNKU(component5, 4);
    }

    /* renamed from: component5-rL5Bavg, reason: not valid java name */
    private static final short m509component5rL5Bavg(short[] component5) {
        s.checkNotNullParameter(component5, "$this$component5");
        return v.m1846getMh2AYeg(component5, 4);
    }

    /* renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m510contentEqualsFGO6Aew(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m511contentEqualsKJPZfPQ(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m512contentEqualskV0jMPg(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m513contentEqualslec5QzE(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    /* renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m514contentHashCode2csIQuQ(byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    /* renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m515contentHashCodeXUkPCBk(int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    /* renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m516contentHashCoded6D3K8(short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    /* renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m517contentHashCodeuLth9ew(long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(y5.o.m1607boximpl(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    /* renamed from: contentToString-2csIQuQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m518contentToString2csIQuQ(byte[] bArr) {
        String joinToString$default;
        return (bArr == null || joinToString$default == null) ? "null" : joinToString$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(y5.q.m1685boximpl(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    /* renamed from: contentToString-XUkPCBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m519contentToStringXUkPCBk(int[] iArr) {
        String joinToString$default;
        return (iArr == null || joinToString$default == null) ? "null" : joinToString$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(y5.v.m1839boximpl(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    /* renamed from: contentToString-d-6D3K8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m520contentToStringd6D3K8(short[] sArr) {
        String joinToString$default;
        return (sArr == null || joinToString$default == null) ? "null" : joinToString$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(y5.s.m1763boximpl(r9), ", ", "[", "]", 0, null, null, 56, null);
     */
    /* renamed from: contentToString-uLth9ew, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m521contentToStringuLth9ew(long[] jArr) {
        String joinToString$default;
        return (jArr == null || joinToString$default == null) ? "null" : joinToString$default;
    }

    /* renamed from: copyInto--B0-L2c, reason: not valid java name */
    private static final long[] m522copyIntoB0L2c(long[] copyInto, long[] destination, int i8, int i9, int i10) {
        s.checkNotNullParameter(copyInto, "$this$copyInto");
        s.checkNotNullParameter(destination, "destination");
        k.copyInto(copyInto, destination, i8, i9, i10);
        return destination;
    }

    /* renamed from: copyInto--B0-L2c$default, reason: not valid java name */
    static /* synthetic */ long[] m523copyIntoB0L2c$default(long[] copyInto, long[] destination, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = y5.s.m1771getSizeimpl(copyInto);
        }
        s.checkNotNullParameter(copyInto, "$this$copyInto");
        s.checkNotNullParameter(destination, "destination");
        k.copyInto(copyInto, destination, i8, i9, i10);
        return destination;
    }

    /* renamed from: copyInto-9-ak10g, reason: not valid java name */
    private static final short[] m524copyInto9ak10g(short[] copyInto, short[] destination, int i8, int i9, int i10) {
        s.checkNotNullParameter(copyInto, "$this$copyInto");
        s.checkNotNullParameter(destination, "destination");
        k.copyInto(copyInto, destination, i8, i9, i10);
        return destination;
    }

    /* renamed from: copyInto-9-ak10g$default, reason: not valid java name */
    static /* synthetic */ short[] m525copyInto9ak10g$default(short[] copyInto, short[] destination, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = v.m1847getSizeimpl(copyInto);
        }
        s.checkNotNullParameter(copyInto, "$this$copyInto");
        s.checkNotNullParameter(destination, "destination");
        k.copyInto(copyInto, destination, i8, i9, i10);
        return destination;
    }

    /* renamed from: copyInto-FUQE5sA, reason: not valid java name */
    private static final byte[] m526copyIntoFUQE5sA(byte[] copyInto, byte[] destination, int i8, int i9, int i10) {
        s.checkNotNullParameter(copyInto, "$this$copyInto");
        s.checkNotNullParameter(destination, "destination");
        k.copyInto(copyInto, destination, i8, i9, i10);
        return destination;
    }

    /* renamed from: copyInto-FUQE5sA$default, reason: not valid java name */
    static /* synthetic */ byte[] m527copyIntoFUQE5sA$default(byte[] copyInto, byte[] destination, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = o.m1615getSizeimpl(copyInto);
        }
        s.checkNotNullParameter(copyInto, "$this$copyInto");
        s.checkNotNullParameter(destination, "destination");
        k.copyInto(copyInto, destination, i8, i9, i10);
        return destination;
    }

    /* renamed from: copyInto-sIZ3KeM, reason: not valid java name */
    private static final int[] m528copyIntosIZ3KeM(int[] copyInto, int[] destination, int i8, int i9, int i10) {
        s.checkNotNullParameter(copyInto, "$this$copyInto");
        s.checkNotNullParameter(destination, "destination");
        k.copyInto(copyInto, destination, i8, i9, i10);
        return destination;
    }

    /* renamed from: copyInto-sIZ3KeM$default, reason: not valid java name */
    static /* synthetic */ int[] m529copyIntosIZ3KeM$default(int[] copyInto, int[] destination, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = q.m1693getSizeimpl(copyInto);
        }
        s.checkNotNullParameter(copyInto, "$this$copyInto");
        s.checkNotNullParameter(destination, "destination");
        k.copyInto(copyInto, destination, i8, i9, i10);
        return destination;
    }

    /* renamed from: copyOf--ajY-9A, reason: not valid java name */
    private static final int[] m530copyOfajY9A(int[] copyOf) {
        s.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        s.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return q.m1687constructorimpl(copyOf2);
    }

    /* renamed from: copyOf-GBYM_sE, reason: not valid java name */
    private static final byte[] m531copyOfGBYM_sE(byte[] copyOf) {
        s.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        s.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return o.m1609constructorimpl(copyOf2);
    }

    /* renamed from: copyOf-PpDY95g, reason: not valid java name */
    private static final byte[] m532copyOfPpDY95g(byte[] copyOf, int i8) {
        s.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] copyOf2 = Arrays.copyOf(copyOf, i8);
        s.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return o.m1609constructorimpl(copyOf2);
    }

    /* renamed from: copyOf-QwZRm1k, reason: not valid java name */
    private static final long[] m533copyOfQwZRm1k(long[] copyOf) {
        s.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        s.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return y5.s.m1765constructorimpl(copyOf2);
    }

    /* renamed from: copyOf-nggk6HY, reason: not valid java name */
    private static final short[] m534copyOfnggk6HY(short[] copyOf, int i8) {
        s.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] copyOf2 = Arrays.copyOf(copyOf, i8);
        s.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return v.m1841constructorimpl(copyOf2);
    }

    /* renamed from: copyOf-qFRl0hI, reason: not valid java name */
    private static final int[] m535copyOfqFRl0hI(int[] copyOf, int i8) {
        s.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] copyOf2 = Arrays.copyOf(copyOf, i8);
        s.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return q.m1687constructorimpl(copyOf2);
    }

    /* renamed from: copyOf-r7IrZao, reason: not valid java name */
    private static final long[] m536copyOfr7IrZao(long[] copyOf, int i8) {
        s.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] copyOf2 = Arrays.copyOf(copyOf, i8);
        s.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return y5.s.m1765constructorimpl(copyOf2);
    }

    /* renamed from: copyOf-rL5Bavg, reason: not valid java name */
    private static final short[] m537copyOfrL5Bavg(short[] copyOf) {
        s.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        s.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return v.m1841constructorimpl(copyOf2);
    }

    /* renamed from: copyOfRange--nroSd4, reason: not valid java name */
    private static final long[] m538copyOfRangenroSd4(long[] copyOfRange, int i8, int i9) {
        s.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return y5.s.m1765constructorimpl(k.copyOfRange(copyOfRange, i8, i9));
    }

    /* renamed from: copyOfRange-4UcCI2c, reason: not valid java name */
    private static final byte[] m539copyOfRange4UcCI2c(byte[] copyOfRange, int i8, int i9) {
        s.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return o.m1609constructorimpl(k.copyOfRange(copyOfRange, i8, i9));
    }

    /* renamed from: copyOfRange-Aa5vz7o, reason: not valid java name */
    private static final short[] m540copyOfRangeAa5vz7o(short[] copyOfRange, int i8, int i9) {
        s.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return v.m1841constructorimpl(k.copyOfRange(copyOfRange, i8, i9));
    }

    /* renamed from: copyOfRange-oBK06Vg, reason: not valid java name */
    private static final int[] m541copyOfRangeoBK06Vg(int[] copyOfRange, int i8, int i9) {
        s.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return q.m1687constructorimpl(k.copyOfRange(copyOfRange, i8, i9));
    }

    /* renamed from: count-JOV_ifY, reason: not valid java name */
    private static final int m542countJOV_ifY(byte[] count, l predicate) {
        s.checkNotNullParameter(count, "$this$count");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(count);
        int i8 = 0;
        for (int i9 = 0; i9 < m1615getSizeimpl; i9++) {
            if (((Boolean) predicate.invoke(n.m1550boximpl(o.m1614getw2LRezQ(count, i9)))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: count-MShoTSo, reason: not valid java name */
    private static final int m543countMShoTSo(long[] count, l predicate) {
        s.checkNotNullParameter(count, "$this$count");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(count);
        int i8 = 0;
        for (int i9 = 0; i9 < m1771getSizeimpl; i9++) {
            if (((Boolean) predicate.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(count, i9)))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: count-jgv0xPQ, reason: not valid java name */
    private static final int m544countjgv0xPQ(int[] count, l predicate) {
        s.checkNotNullParameter(count, "$this$count");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(count);
        int i8 = 0;
        for (int i9 = 0; i9 < m1693getSizeimpl; i9++) {
            if (((Boolean) predicate.invoke(p.m1626boximpl(q.m1692getpVg5ArA(count, i9)))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: count-xTcfx_M, reason: not valid java name */
    private static final int m545countxTcfx_M(short[] count, l predicate) {
        s.checkNotNullParameter(count, "$this$count");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(count);
        int i8 = 0;
        for (int i9 = 0; i9 < m1847getSizeimpl; i9++) {
            if (((Boolean) predicate.invoke(u.m1782boximpl(v.m1846getMh2AYeg(count, i9)))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<n> m546dropPpDY95g(byte[] drop, int i8) {
        int coerceAtLeast;
        s.checkNotNullParameter(drop, "$this$drop");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(o.m1615getSizeimpl(drop) - i8, 0);
            return m1074takeLastPpDY95g(drop, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<u> m547dropnggk6HY(short[] drop, int i8) {
        int coerceAtLeast;
        s.checkNotNullParameter(drop, "$this$drop");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(v.m1847getSizeimpl(drop) - i8, 0);
            return m1075takeLastnggk6HY(drop, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<p> m548dropqFRl0hI(int[] drop, int i8) {
        int coerceAtLeast;
        s.checkNotNullParameter(drop, "$this$drop");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(q.m1693getSizeimpl(drop) - i8, 0);
            return m1076takeLastqFRl0hI(drop, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<r> m549dropr7IrZao(long[] drop, int i8) {
        int coerceAtLeast;
        s.checkNotNullParameter(drop, "$this$drop");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(y5.s.m1771getSizeimpl(drop) - i8, 0);
            return m1077takeLastr7IrZao(drop, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<n> m550dropLastPpDY95g(byte[] dropLast, int i8) {
        int coerceAtLeast;
        s.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(o.m1615getSizeimpl(dropLast) - i8, 0);
            return m1070takePpDY95g(dropLast, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<u> m551dropLastnggk6HY(short[] dropLast, int i8) {
        int coerceAtLeast;
        s.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(v.m1847getSizeimpl(dropLast) - i8, 0);
            return m1071takenggk6HY(dropLast, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<p> m552dropLastqFRl0hI(int[] dropLast, int i8) {
        int coerceAtLeast;
        s.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(q.m1693getSizeimpl(dropLast) - i8, 0);
            return m1072takeqFRl0hI(dropLast, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<r> m553dropLastr7IrZao(long[] dropLast, int i8) {
        int coerceAtLeast;
        s.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(y5.s.m1771getSizeimpl(dropLast) - i8, 0);
            return m1073taker7IrZao(dropLast, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<n> m554dropLastWhileJOV_ifY(byte[] dropLastWhile, l predicate) {
        s.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(n.m1550boximpl(o.m1614getw2LRezQ(dropLastWhile, lastIndex)))).booleanValue()) {
                return m1070takePpDY95g(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: dropLastWhile-MShoTSo, reason: not valid java name */
    private static final List<r> m555dropLastWhileMShoTSo(long[] dropLastWhile, l predicate) {
        s.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(dropLastWhile, lastIndex)))).booleanValue()) {
                return m1073taker7IrZao(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: dropLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<p> m556dropLastWhilejgv0xPQ(int[] dropLastWhile, l predicate) {
        s.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(p.m1626boximpl(q.m1692getpVg5ArA(dropLastWhile, lastIndex)))).booleanValue()) {
                return m1072takeqFRl0hI(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: dropLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<u> m557dropLastWhilexTcfx_M(short[] dropLastWhile, l predicate) {
        s.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(u.m1782boximpl(v.m1846getMh2AYeg(dropLastWhile, lastIndex)))).booleanValue()) {
                return m1071takenggk6HY(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: dropWhile-JOV_ifY, reason: not valid java name */
    private static final List<n> m558dropWhileJOV_ifY(byte[] dropWhile, l predicate) {
        s.checkNotNullParameter(dropWhile, "$this$dropWhile");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1615getSizeimpl = o.m1615getSizeimpl(dropWhile);
        boolean z7 = false;
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(dropWhile, i8);
            if (z7) {
                arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
            } else if (!((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
                z7 = true;
            }
        }
        return arrayList;
    }

    /* renamed from: dropWhile-MShoTSo, reason: not valid java name */
    private static final List<r> m559dropWhileMShoTSo(long[] dropWhile, l predicate) {
        s.checkNotNullParameter(dropWhile, "$this$dropWhile");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(dropWhile);
        boolean z7 = false;
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(dropWhile, i8);
            if (z7) {
                arrayList.add(r.m1704boximpl(m1770getsVKNKU));
            } else if (!((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                arrayList.add(r.m1704boximpl(m1770getsVKNKU));
                z7 = true;
            }
        }
        return arrayList;
    }

    /* renamed from: dropWhile-jgv0xPQ, reason: not valid java name */
    private static final List<p> m560dropWhilejgv0xPQ(int[] dropWhile, l predicate) {
        s.checkNotNullParameter(dropWhile, "$this$dropWhile");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1693getSizeimpl = q.m1693getSizeimpl(dropWhile);
        boolean z7 = false;
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(dropWhile, i8);
            if (z7) {
                arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
            } else if (!((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
                z7 = true;
            }
        }
        return arrayList;
    }

    /* renamed from: dropWhile-xTcfx_M, reason: not valid java name */
    private static final List<u> m561dropWhilexTcfx_M(short[] dropWhile, l predicate) {
        s.checkNotNullParameter(dropWhile, "$this$dropWhile");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1847getSizeimpl = v.m1847getSizeimpl(dropWhile);
        boolean z7 = false;
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(dropWhile, i8);
            if (z7) {
                arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
            } else if (!((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
                z7 = true;
            }
        }
        return arrayList;
    }

    /* renamed from: elementAtOrElse-CVVdw08, reason: not valid java name */
    private static final short m562elementAtOrElseCVVdw08(short[] elementAtOrElse, int i8, l defaultValue) {
        s.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(elementAtOrElse)) ? ((u) defaultValue.invoke(Integer.valueOf(i8))).m1838unboximpl() : v.m1846getMh2AYeg(elementAtOrElse, i8);
    }

    /* renamed from: elementAtOrElse-QxvSvLU, reason: not valid java name */
    private static final int m563elementAtOrElseQxvSvLU(int[] elementAtOrElse, int i8, l defaultValue) {
        s.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(elementAtOrElse)) ? ((p) defaultValue.invoke(Integer.valueOf(i8))).m1684unboximpl() : q.m1692getpVg5ArA(elementAtOrElse, i8);
    }

    /* renamed from: elementAtOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m564elementAtOrElseXw8i6dc(long[] elementAtOrElse, int i8, l defaultValue) {
        s.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(elementAtOrElse)) ? ((r) defaultValue.invoke(Integer.valueOf(i8))).m1762unboximpl() : y5.s.m1770getsVKNKU(elementAtOrElse, i8);
    }

    /* renamed from: elementAtOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m565elementAtOrElsecOVybQ(byte[] elementAtOrElse, int i8, l defaultValue) {
        s.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(elementAtOrElse)) ? ((n) defaultValue.invoke(Integer.valueOf(i8))).m1606unboximpl() : o.m1614getw2LRezQ(elementAtOrElse, i8);
    }

    /* renamed from: elementAtOrNull-PpDY95g, reason: not valid java name */
    private static final n m566elementAtOrNullPpDY95g(byte[] elementAtOrNull, int i8) {
        s.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m686getOrNullPpDY95g(elementAtOrNull, i8);
    }

    /* renamed from: elementAtOrNull-nggk6HY, reason: not valid java name */
    private static final u m567elementAtOrNullnggk6HY(short[] elementAtOrNull, int i8) {
        s.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m687getOrNullnggk6HY(elementAtOrNull, i8);
    }

    /* renamed from: elementAtOrNull-qFRl0hI, reason: not valid java name */
    private static final p m568elementAtOrNullqFRl0hI(int[] elementAtOrNull, int i8) {
        s.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m688getOrNullqFRl0hI(elementAtOrNull, i8);
    }

    /* renamed from: elementAtOrNull-r7IrZao, reason: not valid java name */
    private static final r m569elementAtOrNullr7IrZao(long[] elementAtOrNull, int i8) {
        s.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m689getOrNullr7IrZao(elementAtOrNull, i8);
    }

    /* renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m570fill2fe2U9s(int[] fill, int i8, int i9, int i10) {
        s.checkNotNullParameter(fill, "$this$fill");
        k.fill(fill, i8, i9, i10);
    }

    /* renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m571fill2fe2U9s$default(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = q.m1693getSizeimpl(iArr);
        }
        m570fill2fe2U9s(iArr, i8, i9, i10);
    }

    /* renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m572fillEtDCXyQ(short[] fill, short s7, int i8, int i9) {
        s.checkNotNullParameter(fill, "$this$fill");
        k.fill(fill, s7, i8, i9);
    }

    /* renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m573fillEtDCXyQ$default(short[] sArr, short s7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = v.m1847getSizeimpl(sArr);
        }
        m572fillEtDCXyQ(sArr, s7, i8, i9);
    }

    /* renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m574fillK6DWlUc(long[] fill, long j8, int i8, int i9) {
        s.checkNotNullParameter(fill, "$this$fill");
        k.fill(fill, j8, i8, i9);
    }

    /* renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m575fillK6DWlUc$default(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = y5.s.m1771getSizeimpl(jArr);
        }
        m574fillK6DWlUc(jArr, j8, i8, i9);
    }

    /* renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m576fillWpHrYlw(byte[] fill, byte b8, int i8, int i9) {
        s.checkNotNullParameter(fill, "$this$fill");
        k.fill(fill, b8, i8, i9);
    }

    /* renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m577fillWpHrYlw$default(byte[] bArr, byte b8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = o.m1615getSizeimpl(bArr);
        }
        m576fillWpHrYlw(bArr, b8, i8, i9);
    }

    /* renamed from: filter-JOV_ifY, reason: not valid java name */
    private static final List<n> m578filterJOV_ifY(byte[] filter, l predicate) {
        s.checkNotNullParameter(filter, "$this$filter");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1615getSizeimpl = o.m1615getSizeimpl(filter);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(filter, i8);
            if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
            }
        }
        return arrayList;
    }

    /* renamed from: filter-MShoTSo, reason: not valid java name */
    private static final List<r> m579filterMShoTSo(long[] filter, l predicate) {
        s.checkNotNullParameter(filter, "$this$filter");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(filter);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(filter, i8);
            if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                arrayList.add(r.m1704boximpl(m1770getsVKNKU));
            }
        }
        return arrayList;
    }

    /* renamed from: filter-jgv0xPQ, reason: not valid java name */
    private static final List<p> m580filterjgv0xPQ(int[] filter, l predicate) {
        s.checkNotNullParameter(filter, "$this$filter");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1693getSizeimpl = q.m1693getSizeimpl(filter);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(filter, i8);
            if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
            }
        }
        return arrayList;
    }

    /* renamed from: filter-xTcfx_M, reason: not valid java name */
    private static final List<u> m581filterxTcfx_M(short[] filter, l predicate) {
        s.checkNotNullParameter(filter, "$this$filter");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1847getSizeimpl = v.m1847getSizeimpl(filter);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(filter, i8);
            if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
            }
        }
        return arrayList;
    }

    /* renamed from: filterIndexed-ELGow60, reason: not valid java name */
    private static final List<n> m582filterIndexedELGow60(byte[] filterIndexed, f6.p predicate) {
        s.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1615getSizeimpl = o.m1615getSizeimpl(filterIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(filterIndexed, i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    /* renamed from: filterIndexed-WyvcNBI, reason: not valid java name */
    private static final List<p> m583filterIndexedWyvcNBI(int[] filterIndexed, f6.p predicate) {
        s.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1693getSizeimpl = q.m1693getSizeimpl(filterIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(filterIndexed, i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    /* renamed from: filterIndexed-s8dVfGU, reason: not valid java name */
    private static final List<r> m584filterIndexeds8dVfGU(long[] filterIndexed, f6.p predicate) {
        s.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(filterIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(filterIndexed, i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                arrayList.add(r.m1704boximpl(m1770getsVKNKU));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    /* renamed from: filterIndexed-xzaTVY8, reason: not valid java name */
    private static final List<u> m585filterIndexedxzaTVY8(short[] filterIndexed, f6.p predicate) {
        s.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1847getSizeimpl = v.m1847getSizeimpl(filterIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(filterIndexed, i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    /* renamed from: filterIndexedTo--6EtJGI, reason: not valid java name */
    private static final <C extends Collection<? super p>> C m586filterIndexedTo6EtJGI(int[] filterIndexedTo, C destination, f6.p predicate) {
        s.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(filterIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(filterIndexedTo, i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                destination.add(p.m1626boximpl(m1692getpVg5ArA));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    /* renamed from: filterIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <C extends Collection<? super u>> C m587filterIndexedToQqktQ3k(short[] filterIndexedTo, C destination, f6.p predicate) {
        s.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(filterIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(filterIndexedTo, i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                destination.add(u.m1782boximpl(m1846getMh2AYeg));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    /* renamed from: filterIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <C extends Collection<? super n>> C m588filterIndexedToeNpIKz8(byte[] filterIndexedTo, C destination, f6.p predicate) {
        s.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(filterIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(filterIndexedTo, i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                destination.add(n.m1550boximpl(m1614getw2LRezQ));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    /* renamed from: filterIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <C extends Collection<? super r>> C m589filterIndexedTope2Q0Dw(long[] filterIndexedTo, C destination, f6.p predicate) {
        s.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(filterIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(filterIndexedTo, i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                destination.add(r.m1704boximpl(m1770getsVKNKU));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    /* renamed from: filterNot-JOV_ifY, reason: not valid java name */
    private static final List<n> m590filterNotJOV_ifY(byte[] filterNot, l predicate) {
        s.checkNotNullParameter(filterNot, "$this$filterNot");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1615getSizeimpl = o.m1615getSizeimpl(filterNot);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(filterNot, i8);
            if (!((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
            }
        }
        return arrayList;
    }

    /* renamed from: filterNot-MShoTSo, reason: not valid java name */
    private static final List<r> m591filterNotMShoTSo(long[] filterNot, l predicate) {
        s.checkNotNullParameter(filterNot, "$this$filterNot");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(filterNot);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(filterNot, i8);
            if (!((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                arrayList.add(r.m1704boximpl(m1770getsVKNKU));
            }
        }
        return arrayList;
    }

    /* renamed from: filterNot-jgv0xPQ, reason: not valid java name */
    private static final List<p> m592filterNotjgv0xPQ(int[] filterNot, l predicate) {
        s.checkNotNullParameter(filterNot, "$this$filterNot");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1693getSizeimpl = q.m1693getSizeimpl(filterNot);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(filterNot, i8);
            if (!((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
            }
        }
        return arrayList;
    }

    /* renamed from: filterNot-xTcfx_M, reason: not valid java name */
    private static final List<u> m593filterNotxTcfx_M(short[] filterNot, l predicate) {
        s.checkNotNullParameter(filterNot, "$this$filterNot");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1847getSizeimpl = v.m1847getSizeimpl(filterNot);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(filterNot, i8);
            if (!((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
            }
        }
        return arrayList;
    }

    /* renamed from: filterNotTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super r>> C m594filterNotToHqK1JgA(long[] filterNotTo, C destination, l predicate) {
        s.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(filterNotTo);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(filterNotTo, i8);
            if (!((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                destination.add(r.m1704boximpl(m1770getsVKNKU));
            }
        }
        return destination;
    }

    /* renamed from: filterNotTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super u>> C m595filterNotTooEOeDjA(short[] filterNotTo, C destination, l predicate) {
        s.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(filterNotTo);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(filterNotTo, i8);
            if (!((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                destination.add(u.m1782boximpl(m1846getMh2AYeg));
            }
        }
        return destination;
    }

    /* renamed from: filterNotTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super p>> C m596filterNotTowU5IKMo(int[] filterNotTo, C destination, l predicate) {
        s.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(filterNotTo);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(filterNotTo, i8);
            if (!((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                destination.add(p.m1626boximpl(m1692getpVg5ArA));
            }
        }
        return destination;
    }

    /* renamed from: filterNotTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super n>> C m597filterNotTowzUQCXU(byte[] filterNotTo, C destination, l predicate) {
        s.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(filterNotTo);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(filterNotTo, i8);
            if (!((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                destination.add(n.m1550boximpl(m1614getw2LRezQ));
            }
        }
        return destination;
    }

    /* renamed from: filterTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super r>> C m598filterToHqK1JgA(long[] filterTo, C destination, l predicate) {
        s.checkNotNullParameter(filterTo, "$this$filterTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(filterTo);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(filterTo, i8);
            if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                destination.add(r.m1704boximpl(m1770getsVKNKU));
            }
        }
        return destination;
    }

    /* renamed from: filterTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super u>> C m599filterTooEOeDjA(short[] filterTo, C destination, l predicate) {
        s.checkNotNullParameter(filterTo, "$this$filterTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(filterTo);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(filterTo, i8);
            if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                destination.add(u.m1782boximpl(m1846getMh2AYeg));
            }
        }
        return destination;
    }

    /* renamed from: filterTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super p>> C m600filterTowU5IKMo(int[] filterTo, C destination, l predicate) {
        s.checkNotNullParameter(filterTo, "$this$filterTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(filterTo);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(filterTo, i8);
            if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                destination.add(p.m1626boximpl(m1692getpVg5ArA));
            }
        }
        return destination;
    }

    /* renamed from: filterTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super n>> C m601filterTowzUQCXU(byte[] filterTo, C destination, l predicate) {
        s.checkNotNullParameter(filterTo, "$this$filterTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(filterTo);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(filterTo, i8);
            if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                destination.add(n.m1550boximpl(m1614getw2LRezQ));
            }
        }
        return destination;
    }

    /* renamed from: find-JOV_ifY, reason: not valid java name */
    private static final n m602findJOV_ifY(byte[] find, l predicate) {
        s.checkNotNullParameter(find, "$this$find");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(find);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(find, i8);
            if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                return n.m1550boximpl(m1614getw2LRezQ);
            }
        }
        return null;
    }

    /* renamed from: find-MShoTSo, reason: not valid java name */
    private static final r m603findMShoTSo(long[] find, l predicate) {
        s.checkNotNullParameter(find, "$this$find");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(find);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(find, i8);
            if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                return r.m1704boximpl(m1770getsVKNKU);
            }
        }
        return null;
    }

    /* renamed from: find-jgv0xPQ, reason: not valid java name */
    private static final p m604findjgv0xPQ(int[] find, l predicate) {
        s.checkNotNullParameter(find, "$this$find");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(find);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(find, i8);
            if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                return p.m1626boximpl(m1692getpVg5ArA);
            }
        }
        return null;
    }

    /* renamed from: find-xTcfx_M, reason: not valid java name */
    private static final u m605findxTcfx_M(short[] find, l predicate) {
        s.checkNotNullParameter(find, "$this$find");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(find);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(find, i8);
            if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                return u.m1782boximpl(m1846getMh2AYeg);
            }
        }
        return null;
    }

    /* renamed from: findLast-JOV_ifY, reason: not valid java name */
    private static final n m606findLastJOV_ifY(byte[] findLast, l predicate) {
        s.checkNotNullParameter(findLast, "$this$findLast");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(findLast) - 1;
        if (m1615getSizeimpl >= 0) {
            while (true) {
                int i8 = m1615getSizeimpl - 1;
                byte m1614getw2LRezQ = o.m1614getw2LRezQ(findLast, m1615getSizeimpl);
                if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                    return n.m1550boximpl(m1614getw2LRezQ);
                }
                if (i8 < 0) {
                    break;
                }
                m1615getSizeimpl = i8;
            }
        }
        return null;
    }

    /* renamed from: findLast-MShoTSo, reason: not valid java name */
    private static final r m607findLastMShoTSo(long[] findLast, l predicate) {
        s.checkNotNullParameter(findLast, "$this$findLast");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(findLast) - 1;
        if (m1771getSizeimpl >= 0) {
            while (true) {
                int i8 = m1771getSizeimpl - 1;
                long m1770getsVKNKU = y5.s.m1770getsVKNKU(findLast, m1771getSizeimpl);
                if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                    return r.m1704boximpl(m1770getsVKNKU);
                }
                if (i8 < 0) {
                    break;
                }
                m1771getSizeimpl = i8;
            }
        }
        return null;
    }

    /* renamed from: findLast-jgv0xPQ, reason: not valid java name */
    private static final p m608findLastjgv0xPQ(int[] findLast, l predicate) {
        s.checkNotNullParameter(findLast, "$this$findLast");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(findLast) - 1;
        if (m1693getSizeimpl >= 0) {
            while (true) {
                int i8 = m1693getSizeimpl - 1;
                int m1692getpVg5ArA = q.m1692getpVg5ArA(findLast, m1693getSizeimpl);
                if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                    return p.m1626boximpl(m1692getpVg5ArA);
                }
                if (i8 < 0) {
                    break;
                }
                m1693getSizeimpl = i8;
            }
        }
        return null;
    }

    /* renamed from: findLast-xTcfx_M, reason: not valid java name */
    private static final u m609findLastxTcfx_M(short[] findLast, l predicate) {
        s.checkNotNullParameter(findLast, "$this$findLast");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(findLast) - 1;
        if (m1847getSizeimpl >= 0) {
            while (true) {
                int i8 = m1847getSizeimpl - 1;
                short m1846getMh2AYeg = v.m1846getMh2AYeg(findLast, m1847getSizeimpl);
                if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                    return u.m1782boximpl(m1846getMh2AYeg);
                }
                if (i8 < 0) {
                    break;
                }
                m1847getSizeimpl = i8;
            }
        }
        return null;
    }

    /* renamed from: first--ajY-9A, reason: not valid java name */
    private static final int m610firstajY9A(int[] first) {
        int first2;
        s.checkNotNullParameter(first, "$this$first");
        first2 = ArraysKt___ArraysKt.first(first);
        return p.m1632constructorimpl(first2);
    }

    /* renamed from: first-GBYM_sE, reason: not valid java name */
    private static final byte m611firstGBYM_sE(byte[] first) {
        byte first2;
        s.checkNotNullParameter(first, "$this$first");
        first2 = ArraysKt___ArraysKt.first(first);
        return n.m1556constructorimpl(first2);
    }

    /* renamed from: first-JOV_ifY, reason: not valid java name */
    private static final byte m612firstJOV_ifY(byte[] first, l predicate) {
        s.checkNotNullParameter(first, "$this$first");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(first);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(first, i8);
            if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                return m1614getw2LRezQ;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: first-MShoTSo, reason: not valid java name */
    private static final long m613firstMShoTSo(long[] first, l predicate) {
        s.checkNotNullParameter(first, "$this$first");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(first);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(first, i8);
            if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                return m1770getsVKNKU;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: first-QwZRm1k, reason: not valid java name */
    private static final long m614firstQwZRm1k(long[] first) {
        long first2;
        s.checkNotNullParameter(first, "$this$first");
        first2 = ArraysKt___ArraysKt.first(first);
        return r.m1710constructorimpl(first2);
    }

    /* renamed from: first-jgv0xPQ, reason: not valid java name */
    private static final int m615firstjgv0xPQ(int[] first, l predicate) {
        s.checkNotNullParameter(first, "$this$first");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(first);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(first, i8);
            if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                return m1692getpVg5ArA;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: first-rL5Bavg, reason: not valid java name */
    private static final short m616firstrL5Bavg(short[] first) {
        short first2;
        s.checkNotNullParameter(first, "$this$first");
        first2 = ArraysKt___ArraysKt.first(first);
        return u.m1788constructorimpl(first2);
    }

    /* renamed from: first-xTcfx_M, reason: not valid java name */
    private static final short m617firstxTcfx_M(short[] first, l predicate) {
        s.checkNotNullParameter(first, "$this$first");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(first);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(first, i8);
            if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                return m1846getMh2AYeg;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final p m618firstOrNullajY9A(int[] firstOrNull) {
        s.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (q.m1695isEmptyimpl(firstOrNull)) {
            return null;
        }
        return p.m1626boximpl(q.m1692getpVg5ArA(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final n m619firstOrNullGBYM_sE(byte[] firstOrNull) {
        s.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (o.m1617isEmptyimpl(firstOrNull)) {
            return null;
        }
        return n.m1550boximpl(o.m1614getw2LRezQ(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-JOV_ifY, reason: not valid java name */
    private static final n m620firstOrNullJOV_ifY(byte[] firstOrNull, l predicate) {
        s.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(firstOrNull);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(firstOrNull, i8);
            if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                return n.m1550boximpl(m1614getw2LRezQ);
            }
        }
        return null;
    }

    /* renamed from: firstOrNull-MShoTSo, reason: not valid java name */
    private static final r m621firstOrNullMShoTSo(long[] firstOrNull, l predicate) {
        s.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(firstOrNull);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(firstOrNull, i8);
            if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                return r.m1704boximpl(m1770getsVKNKU);
            }
        }
        return null;
    }

    /* renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final r m622firstOrNullQwZRm1k(long[] firstOrNull) {
        s.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (y5.s.m1773isEmptyimpl(firstOrNull)) {
            return null;
        }
        return r.m1704boximpl(y5.s.m1770getsVKNKU(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-jgv0xPQ, reason: not valid java name */
    private static final p m623firstOrNulljgv0xPQ(int[] firstOrNull, l predicate) {
        s.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(firstOrNull);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(firstOrNull, i8);
            if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                return p.m1626boximpl(m1692getpVg5ArA);
            }
        }
        return null;
    }

    /* renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final u m624firstOrNullrL5Bavg(short[] firstOrNull) {
        s.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (v.m1849isEmptyimpl(firstOrNull)) {
            return null;
        }
        return u.m1782boximpl(v.m1846getMh2AYeg(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-xTcfx_M, reason: not valid java name */
    private static final u m625firstOrNullxTcfx_M(short[] firstOrNull, l predicate) {
        s.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(firstOrNull);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(firstOrNull, i8);
            if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                return u.m1782boximpl(m1846getMh2AYeg);
            }
        }
        return null;
    }

    /* renamed from: flatMap-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m626flatMapJOV_ifY(byte[] flatMap, l transform) {
        s.checkNotNullParameter(flatMap, "$this$flatMap");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m1615getSizeimpl = o.m1615getSizeimpl(flatMap);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(n.m1550boximpl(o.m1614getw2LRezQ(flatMap, i8))));
        }
        return arrayList;
    }

    /* renamed from: flatMap-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m627flatMapMShoTSo(long[] flatMap, l transform) {
        s.checkNotNullParameter(flatMap, "$this$flatMap");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(flatMap);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(flatMap, i8))));
        }
        return arrayList;
    }

    /* renamed from: flatMap-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m628flatMapjgv0xPQ(int[] flatMap, l transform) {
        s.checkNotNullParameter(flatMap, "$this$flatMap");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m1693getSizeimpl = q.m1693getSizeimpl(flatMap);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(p.m1626boximpl(q.m1692getpVg5ArA(flatMap, i8))));
        }
        return arrayList;
    }

    /* renamed from: flatMap-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m629flatMapxTcfx_M(short[] flatMap, l transform) {
        s.checkNotNullParameter(flatMap, "$this$flatMap");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m1847getSizeimpl = v.m1847getSizeimpl(flatMap);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(u.m1782boximpl(v.m1846getMh2AYeg(flatMap, i8))));
        }
        return arrayList;
    }

    /* renamed from: flatMapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m630flatMapIndexedELGow60(byte[] flatMapIndexed, f6.p transform) {
        s.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m1615getSizeimpl = o.m1615getSizeimpl(flatMapIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), n.m1550boximpl(o.m1614getw2LRezQ(flatMapIndexed, i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    /* renamed from: flatMapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m631flatMapIndexedWyvcNBI(int[] flatMapIndexed, f6.p transform) {
        s.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m1693getSizeimpl = q.m1693getSizeimpl(flatMapIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), p.m1626boximpl(q.m1692getpVg5ArA(flatMapIndexed, i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    /* renamed from: flatMapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m632flatMapIndexeds8dVfGU(long[] flatMapIndexed, f6.p transform) {
        s.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(flatMapIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), r.m1704boximpl(y5.s.m1770getsVKNKU(flatMapIndexed, i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    /* renamed from: flatMapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m633flatMapIndexedxzaTVY8(short[] flatMapIndexed, f6.p transform) {
        s.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m1847getSizeimpl = v.m1847getSizeimpl(flatMapIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), u.m1782boximpl(v.m1846getMh2AYeg(flatMapIndexed, i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    /* renamed from: flatMapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m634flatMapIndexedTo6EtJGI(int[] flatMapIndexedTo, C destination, f6.p transform) {
        s.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1693getSizeimpl = q.m1693getSizeimpl(flatMapIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), p.m1626boximpl(q.m1692getpVg5ArA(flatMapIndexedTo, i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    /* renamed from: flatMapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m635flatMapIndexedToQqktQ3k(short[] flatMapIndexedTo, C destination, f6.p transform) {
        s.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1847getSizeimpl = v.m1847getSizeimpl(flatMapIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), u.m1782boximpl(v.m1846getMh2AYeg(flatMapIndexedTo, i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    /* renamed from: flatMapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m636flatMapIndexedToeNpIKz8(byte[] flatMapIndexedTo, C destination, f6.p transform) {
        s.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1615getSizeimpl = o.m1615getSizeimpl(flatMapIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), n.m1550boximpl(o.m1614getw2LRezQ(flatMapIndexedTo, i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    /* renamed from: flatMapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m637flatMapIndexedTope2Q0Dw(long[] flatMapIndexedTo, C destination, f6.p transform) {
        s.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(flatMapIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), r.m1704boximpl(y5.s.m1770getsVKNKU(flatMapIndexedTo, i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    /* renamed from: flatMapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m638flatMapToHqK1JgA(long[] flatMapTo, C destination, l transform) {
        s.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(flatMapTo);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(flatMapTo, i8))));
        }
        return destination;
    }

    /* renamed from: flatMapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m639flatMapTooEOeDjA(short[] flatMapTo, C destination, l transform) {
        s.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1847getSizeimpl = v.m1847getSizeimpl(flatMapTo);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(u.m1782boximpl(v.m1846getMh2AYeg(flatMapTo, i8))));
        }
        return destination;
    }

    /* renamed from: flatMapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m640flatMapTowU5IKMo(int[] flatMapTo, C destination, l transform) {
        s.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1693getSizeimpl = q.m1693getSizeimpl(flatMapTo);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(p.m1626boximpl(q.m1692getpVg5ArA(flatMapTo, i8))));
        }
        return destination;
    }

    /* renamed from: flatMapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m641flatMapTowzUQCXU(byte[] flatMapTo, C destination, l transform) {
        s.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1615getSizeimpl = o.m1615getSizeimpl(flatMapTo);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(n.m1550boximpl(o.m1614getw2LRezQ(flatMapTo, i8))));
        }
        return destination;
    }

    /* renamed from: fold-A8wKCXQ, reason: not valid java name */
    private static final <R> R m642foldA8wKCXQ(long[] fold, R r8, f6.p operation) {
        s.checkNotNullParameter(fold, "$this$fold");
        s.checkNotNullParameter(operation, "operation");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(fold);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, r.m1704boximpl(y5.s.m1770getsVKNKU(fold, i8)));
        }
        return r8;
    }

    /* renamed from: fold-yXmHNn8, reason: not valid java name */
    private static final <R> R m643foldyXmHNn8(byte[] fold, R r8, f6.p operation) {
        s.checkNotNullParameter(fold, "$this$fold");
        s.checkNotNullParameter(operation, "operation");
        int m1615getSizeimpl = o.m1615getSizeimpl(fold);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, n.m1550boximpl(o.m1614getw2LRezQ(fold, i8)));
        }
        return r8;
    }

    /* renamed from: fold-zi1B2BA, reason: not valid java name */
    private static final <R> R m644foldzi1B2BA(int[] fold, R r8, f6.p operation) {
        s.checkNotNullParameter(fold, "$this$fold");
        s.checkNotNullParameter(operation, "operation");
        int m1693getSizeimpl = q.m1693getSizeimpl(fold);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, p.m1626boximpl(q.m1692getpVg5ArA(fold, i8)));
        }
        return r8;
    }

    /* renamed from: fold-zww5nb8, reason: not valid java name */
    private static final <R> R m645foldzww5nb8(short[] fold, R r8, f6.p operation) {
        s.checkNotNullParameter(fold, "$this$fold");
        s.checkNotNullParameter(operation, "operation");
        int m1847getSizeimpl = v.m1847getSizeimpl(fold);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, u.m1782boximpl(v.m1846getMh2AYeg(fold, i8)));
        }
        return r8;
    }

    /* renamed from: foldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m646foldIndexed3iWJZGE(byte[] foldIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        s.checkNotNullParameter(operation, "operation");
        int m1615getSizeimpl = o.m1615getSizeimpl(foldIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, n.m1550boximpl(o.m1614getw2LRezQ(foldIndexed, i8)));
            i8++;
            i9++;
        }
        return r8;
    }

    /* renamed from: foldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m647foldIndexedbzxtMww(short[] foldIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        s.checkNotNullParameter(operation, "operation");
        int m1847getSizeimpl = v.m1847getSizeimpl(foldIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, u.m1782boximpl(v.m1846getMh2AYeg(foldIndexed, i8)));
            i8++;
            i9++;
        }
        return r8;
    }

    /* renamed from: foldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m648foldIndexedmwnnOCs(long[] foldIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        s.checkNotNullParameter(operation, "operation");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(foldIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, r.m1704boximpl(y5.s.m1770getsVKNKU(foldIndexed, i8)));
            i8++;
            i9++;
        }
        return r8;
    }

    /* renamed from: foldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m649foldIndexedyVwIW0Q(int[] foldIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        s.checkNotNullParameter(operation, "operation");
        int m1693getSizeimpl = q.m1693getSizeimpl(foldIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, p.m1626boximpl(q.m1692getpVg5ArA(foldIndexed, i8)));
            i8++;
            i9++;
        }
        return r8;
    }

    /* renamed from: foldRight-A8wKCXQ, reason: not valid java name */
    private static final <R> R m650foldRightA8wKCXQ(long[] foldRight, R r8, f6.p operation) {
        s.checkNotNullParameter(foldRight, "$this$foldRight");
        s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(foldRight, lastIndex)), r8);
        }
        return r8;
    }

    /* renamed from: foldRight-yXmHNn8, reason: not valid java name */
    private static final <R> R m651foldRightyXmHNn8(byte[] foldRight, R r8, f6.p operation) {
        s.checkNotNullParameter(foldRight, "$this$foldRight");
        s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(n.m1550boximpl(o.m1614getw2LRezQ(foldRight, lastIndex)), r8);
        }
        return r8;
    }

    /* renamed from: foldRight-zi1B2BA, reason: not valid java name */
    private static final <R> R m652foldRightzi1B2BA(int[] foldRight, R r8, f6.p operation) {
        s.checkNotNullParameter(foldRight, "$this$foldRight");
        s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(p.m1626boximpl(q.m1692getpVg5ArA(foldRight, lastIndex)), r8);
        }
        return r8;
    }

    /* renamed from: foldRight-zww5nb8, reason: not valid java name */
    private static final <R> R m653foldRightzww5nb8(short[] foldRight, R r8, f6.p operation) {
        s.checkNotNullParameter(foldRight, "$this$foldRight");
        s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(u.m1782boximpl(v.m1846getMh2AYeg(foldRight, lastIndex)), r8);
        }
        return r8;
    }

    /* renamed from: foldRightIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m654foldRightIndexed3iWJZGE(byte[] foldRightIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), n.m1550boximpl(o.m1614getw2LRezQ(foldRightIndexed, lastIndex)), r8);
        }
        return r8;
    }

    /* renamed from: foldRightIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m655foldRightIndexedbzxtMww(short[] foldRightIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), u.m1782boximpl(v.m1846getMh2AYeg(foldRightIndexed, lastIndex)), r8);
        }
        return r8;
    }

    /* renamed from: foldRightIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m656foldRightIndexedmwnnOCs(long[] foldRightIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), r.m1704boximpl(y5.s.m1770getsVKNKU(foldRightIndexed, lastIndex)), r8);
        }
        return r8;
    }

    /* renamed from: foldRightIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m657foldRightIndexedyVwIW0Q(int[] foldRightIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), p.m1626boximpl(q.m1692getpVg5ArA(foldRightIndexed, lastIndex)), r8);
        }
        return r8;
    }

    /* renamed from: forEach-JOV_ifY, reason: not valid java name */
    private static final void m658forEachJOV_ifY(byte[] forEach, l action) {
        s.checkNotNullParameter(forEach, "$this$forEach");
        s.checkNotNullParameter(action, "action");
        int m1615getSizeimpl = o.m1615getSizeimpl(forEach);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            action.invoke(n.m1550boximpl(o.m1614getw2LRezQ(forEach, i8)));
        }
    }

    /* renamed from: forEach-MShoTSo, reason: not valid java name */
    private static final void m659forEachMShoTSo(long[] forEach, l action) {
        s.checkNotNullParameter(forEach, "$this$forEach");
        s.checkNotNullParameter(action, "action");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(forEach);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            action.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(forEach, i8)));
        }
    }

    /* renamed from: forEach-jgv0xPQ, reason: not valid java name */
    private static final void m660forEachjgv0xPQ(int[] forEach, l action) {
        s.checkNotNullParameter(forEach, "$this$forEach");
        s.checkNotNullParameter(action, "action");
        int m1693getSizeimpl = q.m1693getSizeimpl(forEach);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            action.invoke(p.m1626boximpl(q.m1692getpVg5ArA(forEach, i8)));
        }
    }

    /* renamed from: forEach-xTcfx_M, reason: not valid java name */
    private static final void m661forEachxTcfx_M(short[] forEach, l action) {
        s.checkNotNullParameter(forEach, "$this$forEach");
        s.checkNotNullParameter(action, "action");
        int m1847getSizeimpl = v.m1847getSizeimpl(forEach);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            action.invoke(u.m1782boximpl(v.m1846getMh2AYeg(forEach, i8)));
        }
    }

    /* renamed from: forEachIndexed-ELGow60, reason: not valid java name */
    private static final void m662forEachIndexedELGow60(byte[] forEachIndexed, f6.p action) {
        s.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        s.checkNotNullParameter(action, "action");
        int m1615getSizeimpl = o.m1615getSizeimpl(forEachIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            action.invoke(Integer.valueOf(i9), n.m1550boximpl(o.m1614getw2LRezQ(forEachIndexed, i8)));
            i8++;
            i9++;
        }
    }

    /* renamed from: forEachIndexed-WyvcNBI, reason: not valid java name */
    private static final void m663forEachIndexedWyvcNBI(int[] forEachIndexed, f6.p action) {
        s.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        s.checkNotNullParameter(action, "action");
        int m1693getSizeimpl = q.m1693getSizeimpl(forEachIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            action.invoke(Integer.valueOf(i9), p.m1626boximpl(q.m1692getpVg5ArA(forEachIndexed, i8)));
            i8++;
            i9++;
        }
    }

    /* renamed from: forEachIndexed-s8dVfGU, reason: not valid java name */
    private static final void m664forEachIndexeds8dVfGU(long[] forEachIndexed, f6.p action) {
        s.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        s.checkNotNullParameter(action, "action");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(forEachIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            action.invoke(Integer.valueOf(i9), r.m1704boximpl(y5.s.m1770getsVKNKU(forEachIndexed, i8)));
            i8++;
            i9++;
        }
    }

    /* renamed from: forEachIndexed-xzaTVY8, reason: not valid java name */
    private static final void m665forEachIndexedxzaTVY8(short[] forEachIndexed, f6.p action) {
        s.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        s.checkNotNullParameter(action, "action");
        int m1847getSizeimpl = v.m1847getSizeimpl(forEachIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            action.invoke(Integer.valueOf(i9), u.m1782boximpl(v.m1846getMh2AYeg(forEachIndexed, i8)));
            i8++;
            i9++;
        }
    }

    /* renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final m m666getIndicesajY9A(int[] indices) {
        m indices2;
        s.checkNotNullParameter(indices, "$this$indices");
        indices2 = ArraysKt___ArraysKt.getIndices(indices);
        return indices2;
    }

    /* renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m667getIndicesajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final m m668getIndicesGBYM_sE(byte[] indices) {
        m indices2;
        s.checkNotNullParameter(indices, "$this$indices");
        indices2 = ArraysKt___ArraysKt.getIndices(indices);
        return indices2;
    }

    /* renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m669getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final m m670getIndicesQwZRm1k(long[] indices) {
        m indices2;
        s.checkNotNullParameter(indices, "$this$indices");
        indices2 = ArraysKt___ArraysKt.getIndices(indices);
        return indices2;
    }

    /* renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m671getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final m m672getIndicesrL5Bavg(short[] indices) {
        m indices2;
        s.checkNotNullParameter(indices, "$this$indices");
        indices2 = ArraysKt___ArraysKt.getIndices(indices);
        return indices2;
    }

    /* renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m673getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m674getLastIndexajY9A(int[] lastIndex) {
        s.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m675getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m676getLastIndexGBYM_sE(byte[] lastIndex) {
        s.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m677getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m678getLastIndexQwZRm1k(long[] lastIndex) {
        s.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m679getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m680getLastIndexrL5Bavg(short[] lastIndex) {
        s.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt___ArraysKt.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m681getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    /* renamed from: getOrElse-CVVdw08, reason: not valid java name */
    private static final short m682getOrElseCVVdw08(short[] getOrElse, int i8, l defaultValue) {
        s.checkNotNullParameter(getOrElse, "$this$getOrElse");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(getOrElse)) ? ((u) defaultValue.invoke(Integer.valueOf(i8))).m1838unboximpl() : v.m1846getMh2AYeg(getOrElse, i8);
    }

    /* renamed from: getOrElse-QxvSvLU, reason: not valid java name */
    private static final int m683getOrElseQxvSvLU(int[] getOrElse, int i8, l defaultValue) {
        s.checkNotNullParameter(getOrElse, "$this$getOrElse");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(getOrElse)) ? ((p) defaultValue.invoke(Integer.valueOf(i8))).m1684unboximpl() : q.m1692getpVg5ArA(getOrElse, i8);
    }

    /* renamed from: getOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m684getOrElseXw8i6dc(long[] getOrElse, int i8, l defaultValue) {
        s.checkNotNullParameter(getOrElse, "$this$getOrElse");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(getOrElse)) ? ((r) defaultValue.invoke(Integer.valueOf(i8))).m1762unboximpl() : y5.s.m1770getsVKNKU(getOrElse, i8);
    }

    /* renamed from: getOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m685getOrElsecOVybQ(byte[] getOrElse, int i8, l defaultValue) {
        s.checkNotNullParameter(getOrElse, "$this$getOrElse");
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(getOrElse)) ? ((n) defaultValue.invoke(Integer.valueOf(i8))).m1606unboximpl() : o.m1614getw2LRezQ(getOrElse, i8);
    }

    /* renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final n m686getOrNullPpDY95g(byte[] getOrNull, int i8) {
        s.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return n.m1550boximpl(o.m1614getw2LRezQ(getOrNull, i8));
    }

    /* renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final u m687getOrNullnggk6HY(short[] getOrNull, int i8) {
        s.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return u.m1782boximpl(v.m1846getMh2AYeg(getOrNull, i8));
    }

    /* renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final p m688getOrNullqFRl0hI(int[] getOrNull, int i8) {
        s.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return p.m1626boximpl(q.m1692getpVg5ArA(getOrNull, i8));
    }

    /* renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final r m689getOrNullr7IrZao(long[] getOrNull, int i8) {
        s.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i8 < 0 || i8 > ArraysKt___ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return r.m1704boximpl(y5.s.m1770getsVKNKU(getOrNull, i8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: groupBy--_j2Y-Q, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m690groupBy_j2YQ(long[] groupBy, l keySelector, l valueTransform) {
        s.checkNotNullParameter(groupBy, "$this$groupBy");
        s.checkNotNullParameter(keySelector, "keySelector");
        s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(groupBy);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(groupBy, i8);
            Object invoke = keySelector.invoke(r.m1704boximpl(m1770getsVKNKU));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(r.m1704boximpl(m1770getsVKNKU)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: groupBy-3bBvP4M, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m691groupBy3bBvP4M(short[] groupBy, l keySelector, l valueTransform) {
        s.checkNotNullParameter(groupBy, "$this$groupBy");
        s.checkNotNullParameter(keySelector, "keySelector");
        s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1847getSizeimpl = v.m1847getSizeimpl(groupBy);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(groupBy, i8);
            Object invoke = keySelector.invoke(u.m1782boximpl(m1846getMh2AYeg));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(u.m1782boximpl(m1846getMh2AYeg)));
        }
        return linkedHashMap;
    }

    /* renamed from: groupBy-JOV_ifY, reason: not valid java name */
    private static final <K> Map<K, List<n>> m692groupByJOV_ifY(byte[] groupBy, l keySelector) {
        s.checkNotNullParameter(groupBy, "$this$groupBy");
        s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1615getSizeimpl = o.m1615getSizeimpl(groupBy);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(groupBy, i8);
            Object invoke = keySelector.invoke(n.m1550boximpl(m1614getw2LRezQ));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(n.m1550boximpl(m1614getw2LRezQ));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: groupBy-L4rlFek, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m693groupByL4rlFek(int[] groupBy, l keySelector, l valueTransform) {
        s.checkNotNullParameter(groupBy, "$this$groupBy");
        s.checkNotNullParameter(keySelector, "keySelector");
        s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1693getSizeimpl = q.m1693getSizeimpl(groupBy);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(groupBy, i8);
            Object invoke = keySelector.invoke(p.m1626boximpl(m1692getpVg5ArA));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(p.m1626boximpl(m1692getpVg5ArA)));
        }
        return linkedHashMap;
    }

    /* renamed from: groupBy-MShoTSo, reason: not valid java name */
    private static final <K> Map<K, List<r>> m694groupByMShoTSo(long[] groupBy, l keySelector) {
        s.checkNotNullParameter(groupBy, "$this$groupBy");
        s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(groupBy);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(groupBy, i8);
            Object invoke = keySelector.invoke(r.m1704boximpl(m1770getsVKNKU));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(r.m1704boximpl(m1770getsVKNKU));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: groupBy-bBsjw1Y, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m695groupBybBsjw1Y(byte[] groupBy, l keySelector, l valueTransform) {
        s.checkNotNullParameter(groupBy, "$this$groupBy");
        s.checkNotNullParameter(keySelector, "keySelector");
        s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1615getSizeimpl = o.m1615getSizeimpl(groupBy);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(groupBy, i8);
            Object invoke = keySelector.invoke(n.m1550boximpl(m1614getw2LRezQ));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(n.m1550boximpl(m1614getw2LRezQ)));
        }
        return linkedHashMap;
    }

    /* renamed from: groupBy-jgv0xPQ, reason: not valid java name */
    private static final <K> Map<K, List<p>> m696groupByjgv0xPQ(int[] groupBy, l keySelector) {
        s.checkNotNullParameter(groupBy, "$this$groupBy");
        s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1693getSizeimpl = q.m1693getSizeimpl(groupBy);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(groupBy, i8);
            Object invoke = keySelector.invoke(p.m1626boximpl(m1692getpVg5ArA));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(p.m1626boximpl(m1692getpVg5ArA));
        }
        return linkedHashMap;
    }

    /* renamed from: groupBy-xTcfx_M, reason: not valid java name */
    private static final <K> Map<K, List<u>> m697groupByxTcfx_M(short[] groupBy, l keySelector) {
        s.checkNotNullParameter(groupBy, "$this$groupBy");
        s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1847getSizeimpl = v.m1847getSizeimpl(groupBy);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(groupBy, i8);
            Object invoke = keySelector.invoke(u.m1782boximpl(m1846getMh2AYeg));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(u.m1782boximpl(m1846getMh2AYeg));
        }
        return linkedHashMap;
    }

    /* renamed from: groupByTo-4D70W2E, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<p>>> M m698groupByTo4D70W2E(int[] groupByTo, M destination, l keySelector) {
        s.checkNotNullParameter(groupByTo, "$this$groupByTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(keySelector, "keySelector");
        int m1693getSizeimpl = q.m1693getSizeimpl(groupByTo);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(groupByTo, i8);
            Object invoke = keySelector.invoke(p.m1626boximpl(m1692getpVg5ArA));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(p.m1626boximpl(m1692getpVg5ArA));
        }
        return destination;
    }

    /* renamed from: groupByTo-H21X9dk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<n>>> M m699groupByToH21X9dk(byte[] groupByTo, M destination, l keySelector) {
        s.checkNotNullParameter(groupByTo, "$this$groupByTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(keySelector, "keySelector");
        int m1615getSizeimpl = o.m1615getSizeimpl(groupByTo);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(groupByTo, i8);
            Object invoke = keySelector.invoke(n.m1550boximpl(m1614getw2LRezQ));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(n.m1550boximpl(m1614getw2LRezQ));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: groupByTo-JM6gNCM, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m700groupByToJM6gNCM(int[] groupByTo, M destination, l keySelector, l valueTransform) {
        s.checkNotNullParameter(groupByTo, "$this$groupByTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(keySelector, "keySelector");
        s.checkNotNullParameter(valueTransform, "valueTransform");
        int m1693getSizeimpl = q.m1693getSizeimpl(groupByTo);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(groupByTo, i8);
            Object invoke = keySelector.invoke(p.m1626boximpl(m1692getpVg5ArA));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(p.m1626boximpl(m1692getpVg5ArA)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: groupByTo-QxgOkWg, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m701groupByToQxgOkWg(long[] groupByTo, M destination, l keySelector, l valueTransform) {
        s.checkNotNullParameter(groupByTo, "$this$groupByTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(keySelector, "keySelector");
        s.checkNotNullParameter(valueTransform, "valueTransform");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(groupByTo);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(groupByTo, i8);
            Object invoke = keySelector.invoke(r.m1704boximpl(m1770getsVKNKU));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(r.m1704boximpl(m1770getsVKNKU)));
        }
        return destination;
    }

    /* renamed from: groupByTo-X6OPwNk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<r>>> M m702groupByToX6OPwNk(long[] groupByTo, M destination, l keySelector) {
        s.checkNotNullParameter(groupByTo, "$this$groupByTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(keySelector, "keySelector");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(groupByTo);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(groupByTo, i8);
            Object invoke = keySelector.invoke(r.m1704boximpl(m1770getsVKNKU));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(r.m1704boximpl(m1770getsVKNKU));
        }
        return destination;
    }

    /* renamed from: groupByTo-ciTST-8, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<u>>> M m703groupByTociTST8(short[] groupByTo, M destination, l keySelector) {
        s.checkNotNullParameter(groupByTo, "$this$groupByTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(keySelector, "keySelector");
        int m1847getSizeimpl = v.m1847getSizeimpl(groupByTo);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(groupByTo, i8);
            Object invoke = keySelector.invoke(u.m1782boximpl(m1846getMh2AYeg));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(u.m1782boximpl(m1846getMh2AYeg));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: groupByTo-q8RuPII, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m704groupByToq8RuPII(short[] groupByTo, M destination, l keySelector, l valueTransform) {
        s.checkNotNullParameter(groupByTo, "$this$groupByTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(keySelector, "keySelector");
        s.checkNotNullParameter(valueTransform, "valueTransform");
        int m1847getSizeimpl = v.m1847getSizeimpl(groupByTo);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(groupByTo, i8);
            Object invoke = keySelector.invoke(u.m1782boximpl(m1846getMh2AYeg));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(u.m1782boximpl(m1846getMh2AYeg)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: groupByTo-qOZmbk8, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m705groupByToqOZmbk8(byte[] groupByTo, M destination, l keySelector, l valueTransform) {
        s.checkNotNullParameter(groupByTo, "$this$groupByTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(keySelector, "keySelector");
        s.checkNotNullParameter(valueTransform, "valueTransform");
        int m1615getSizeimpl = o.m1615getSizeimpl(groupByTo);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(groupByTo, i8);
            Object invoke = keySelector.invoke(n.m1550boximpl(m1614getw2LRezQ));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(n.m1550boximpl(m1614getw2LRezQ)));
        }
        return destination;
    }

    /* renamed from: indexOf-3uqUaXg, reason: not valid java name */
    private static final int m706indexOf3uqUaXg(long[] indexOf, long j8) {
        s.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.indexOf(indexOf, j8);
    }

    /* renamed from: indexOf-XzdR7RA, reason: not valid java name */
    private static final int m707indexOfXzdR7RA(short[] indexOf, short s7) {
        s.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.indexOf(indexOf, s7);
    }

    /* renamed from: indexOf-gMuBH34, reason: not valid java name */
    private static final int m708indexOfgMuBH34(byte[] indexOf, byte b8) {
        s.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.indexOf(indexOf, b8);
    }

    /* renamed from: indexOf-uWY9BYg, reason: not valid java name */
    private static final int m709indexOfuWY9BYg(int[] indexOf, int i8) {
        s.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt___ArraysKt.indexOf(indexOf, i8);
    }

    /* renamed from: indexOfFirst-JOV_ifY, reason: not valid java name */
    private static final int m710indexOfFirstJOV_ifY(byte[] indexOfFirst, l predicate) {
        s.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        s.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(n.m1550boximpl(n.m1556constructorimpl(indexOfFirst[i8])))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    /* renamed from: indexOfFirst-MShoTSo, reason: not valid java name */
    private static final int m711indexOfFirstMShoTSo(long[] indexOfFirst, l predicate) {
        s.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        s.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(r.m1704boximpl(r.m1710constructorimpl(indexOfFirst[i8])))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    /* renamed from: indexOfFirst-jgv0xPQ, reason: not valid java name */
    private static final int m712indexOfFirstjgv0xPQ(int[] indexOfFirst, l predicate) {
        s.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        s.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(p.m1626boximpl(p.m1632constructorimpl(indexOfFirst[i8])))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    /* renamed from: indexOfFirst-xTcfx_M, reason: not valid java name */
    private static final int m713indexOfFirstxTcfx_M(short[] indexOfFirst, l predicate) {
        s.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        s.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(u.m1782boximpl(u.m1788constructorimpl(indexOfFirst[i8])))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    /* renamed from: indexOfLast-JOV_ifY, reason: not valid java name */
    private static final int m714indexOfLastJOV_ifY(byte[] indexOfLast, l predicate) {
        s.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        s.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i8 = length - 1;
            if (((Boolean) predicate.invoke(n.m1550boximpl(n.m1556constructorimpl(indexOfLast[length])))).booleanValue()) {
                return length;
            }
            if (i8 < 0) {
                return -1;
            }
            length = i8;
        }
    }

    /* renamed from: indexOfLast-MShoTSo, reason: not valid java name */
    private static final int m715indexOfLastMShoTSo(long[] indexOfLast, l predicate) {
        s.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        s.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i8 = length - 1;
            if (((Boolean) predicate.invoke(r.m1704boximpl(r.m1710constructorimpl(indexOfLast[length])))).booleanValue()) {
                return length;
            }
            if (i8 < 0) {
                return -1;
            }
            length = i8;
        }
    }

    /* renamed from: indexOfLast-jgv0xPQ, reason: not valid java name */
    private static final int m716indexOfLastjgv0xPQ(int[] indexOfLast, l predicate) {
        s.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        s.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i8 = length - 1;
            if (((Boolean) predicate.invoke(p.m1626boximpl(p.m1632constructorimpl(indexOfLast[length])))).booleanValue()) {
                return length;
            }
            if (i8 < 0) {
                return -1;
            }
            length = i8;
        }
    }

    /* renamed from: indexOfLast-xTcfx_M, reason: not valid java name */
    private static final int m717indexOfLastxTcfx_M(short[] indexOfLast, l predicate) {
        s.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        s.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i8 = length - 1;
            if (((Boolean) predicate.invoke(u.m1782boximpl(u.m1788constructorimpl(indexOfLast[length])))).booleanValue()) {
                return length;
            }
            if (i8 < 0) {
                return -1;
            }
            length = i8;
        }
    }

    /* renamed from: last--ajY-9A, reason: not valid java name */
    private static final int m718lastajY9A(int[] last) {
        int last2;
        s.checkNotNullParameter(last, "$this$last");
        last2 = ArraysKt___ArraysKt.last(last);
        return p.m1632constructorimpl(last2);
    }

    /* renamed from: last-GBYM_sE, reason: not valid java name */
    private static final byte m719lastGBYM_sE(byte[] last) {
        byte last2;
        s.checkNotNullParameter(last, "$this$last");
        last2 = ArraysKt___ArraysKt.last(last);
        return n.m1556constructorimpl(last2);
    }

    /* renamed from: last-JOV_ifY, reason: not valid java name */
    private static final byte m720lastJOV_ifY(byte[] last, l predicate) {
        s.checkNotNullParameter(last, "$this$last");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(last) - 1;
        if (m1615getSizeimpl >= 0) {
            while (true) {
                int i8 = m1615getSizeimpl - 1;
                byte m1614getw2LRezQ = o.m1614getw2LRezQ(last, m1615getSizeimpl);
                if (!((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    m1615getSizeimpl = i8;
                } else {
                    return m1614getw2LRezQ;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: last-MShoTSo, reason: not valid java name */
    private static final long m721lastMShoTSo(long[] last, l predicate) {
        s.checkNotNullParameter(last, "$this$last");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(last) - 1;
        if (m1771getSizeimpl >= 0) {
            while (true) {
                int i8 = m1771getSizeimpl - 1;
                long m1770getsVKNKU = y5.s.m1770getsVKNKU(last, m1771getSizeimpl);
                if (!((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    m1771getSizeimpl = i8;
                } else {
                    return m1770getsVKNKU;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: last-QwZRm1k, reason: not valid java name */
    private static final long m722lastQwZRm1k(long[] last) {
        long last2;
        s.checkNotNullParameter(last, "$this$last");
        last2 = ArraysKt___ArraysKt.last(last);
        return r.m1710constructorimpl(last2);
    }

    /* renamed from: last-jgv0xPQ, reason: not valid java name */
    private static final int m723lastjgv0xPQ(int[] last, l predicate) {
        s.checkNotNullParameter(last, "$this$last");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(last) - 1;
        if (m1693getSizeimpl >= 0) {
            while (true) {
                int i8 = m1693getSizeimpl - 1;
                int m1692getpVg5ArA = q.m1692getpVg5ArA(last, m1693getSizeimpl);
                if (!((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    m1693getSizeimpl = i8;
                } else {
                    return m1692getpVg5ArA;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: last-rL5Bavg, reason: not valid java name */
    private static final short m724lastrL5Bavg(short[] last) {
        short last2;
        s.checkNotNullParameter(last, "$this$last");
        last2 = ArraysKt___ArraysKt.last(last);
        return u.m1788constructorimpl(last2);
    }

    /* renamed from: last-xTcfx_M, reason: not valid java name */
    private static final short m725lastxTcfx_M(short[] last, l predicate) {
        s.checkNotNullParameter(last, "$this$last");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(last) - 1;
        if (m1847getSizeimpl >= 0) {
            while (true) {
                int i8 = m1847getSizeimpl - 1;
                short m1846getMh2AYeg = v.m1846getMh2AYeg(last, m1847getSizeimpl);
                if (!((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    m1847getSizeimpl = i8;
                } else {
                    return m1846getMh2AYeg;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: lastIndexOf-3uqUaXg, reason: not valid java name */
    private static final int m726lastIndexOf3uqUaXg(long[] lastIndexOf, long j8) {
        s.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, j8);
    }

    /* renamed from: lastIndexOf-XzdR7RA, reason: not valid java name */
    private static final int m727lastIndexOfXzdR7RA(short[] lastIndexOf, short s7) {
        s.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, s7);
    }

    /* renamed from: lastIndexOf-gMuBH34, reason: not valid java name */
    private static final int m728lastIndexOfgMuBH34(byte[] lastIndexOf, byte b8) {
        s.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, b8);
    }

    /* renamed from: lastIndexOf-uWY9BYg, reason: not valid java name */
    private static final int m729lastIndexOfuWY9BYg(int[] lastIndexOf, int i8) {
        s.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.lastIndexOf(lastIndexOf, i8);
    }

    /* renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final p m730lastOrNullajY9A(int[] lastOrNull) {
        s.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (q.m1695isEmptyimpl(lastOrNull)) {
            return null;
        }
        return p.m1626boximpl(q.m1692getpVg5ArA(lastOrNull, q.m1693getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final n m731lastOrNullGBYM_sE(byte[] lastOrNull) {
        s.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (o.m1617isEmptyimpl(lastOrNull)) {
            return null;
        }
        return n.m1550boximpl(o.m1614getw2LRezQ(lastOrNull, o.m1615getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-JOV_ifY, reason: not valid java name */
    private static final n m732lastOrNullJOV_ifY(byte[] lastOrNull, l predicate) {
        s.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(lastOrNull) - 1;
        if (m1615getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i8 = m1615getSizeimpl - 1;
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(lastOrNull, m1615getSizeimpl);
            if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                return n.m1550boximpl(m1614getw2LRezQ);
            }
            if (i8 < 0) {
                return null;
            }
            m1615getSizeimpl = i8;
        }
    }

    /* renamed from: lastOrNull-MShoTSo, reason: not valid java name */
    private static final r m733lastOrNullMShoTSo(long[] lastOrNull, l predicate) {
        s.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(lastOrNull) - 1;
        if (m1771getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i8 = m1771getSizeimpl - 1;
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(lastOrNull, m1771getSizeimpl);
            if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                return r.m1704boximpl(m1770getsVKNKU);
            }
            if (i8 < 0) {
                return null;
            }
            m1771getSizeimpl = i8;
        }
    }

    /* renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final r m734lastOrNullQwZRm1k(long[] lastOrNull) {
        s.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (y5.s.m1773isEmptyimpl(lastOrNull)) {
            return null;
        }
        return r.m1704boximpl(y5.s.m1770getsVKNKU(lastOrNull, y5.s.m1771getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-jgv0xPQ, reason: not valid java name */
    private static final p m735lastOrNulljgv0xPQ(int[] lastOrNull, l predicate) {
        s.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(lastOrNull) - 1;
        if (m1693getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i8 = m1693getSizeimpl - 1;
            int m1692getpVg5ArA = q.m1692getpVg5ArA(lastOrNull, m1693getSizeimpl);
            if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                return p.m1626boximpl(m1692getpVg5ArA);
            }
            if (i8 < 0) {
                return null;
            }
            m1693getSizeimpl = i8;
        }
    }

    /* renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final u m736lastOrNullrL5Bavg(short[] lastOrNull) {
        s.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (v.m1849isEmptyimpl(lastOrNull)) {
            return null;
        }
        return u.m1782boximpl(v.m1846getMh2AYeg(lastOrNull, v.m1847getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-xTcfx_M, reason: not valid java name */
    private static final u m737lastOrNullxTcfx_M(short[] lastOrNull, l predicate) {
        s.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(lastOrNull) - 1;
        if (m1847getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i8 = m1847getSizeimpl - 1;
            short m1846getMh2AYeg = v.m1846getMh2AYeg(lastOrNull, m1847getSizeimpl);
            if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                return u.m1782boximpl(m1846getMh2AYeg);
            }
            if (i8 < 0) {
                return null;
            }
            m1847getSizeimpl = i8;
        }
    }

    /* renamed from: map-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m738mapJOV_ifY(byte[] map, l transform) {
        s.checkNotNullParameter(map, "$this$map");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(o.m1615getSizeimpl(map));
        int m1615getSizeimpl = o.m1615getSizeimpl(map);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            arrayList.add(transform.invoke(n.m1550boximpl(o.m1614getw2LRezQ(map, i8))));
        }
        return arrayList;
    }

    /* renamed from: map-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m739mapMShoTSo(long[] map, l transform) {
        s.checkNotNullParameter(map, "$this$map");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(y5.s.m1771getSizeimpl(map));
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(map);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            arrayList.add(transform.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(map, i8))));
        }
        return arrayList;
    }

    /* renamed from: map-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m740mapjgv0xPQ(int[] map, l transform) {
        s.checkNotNullParameter(map, "$this$map");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(q.m1693getSizeimpl(map));
        int m1693getSizeimpl = q.m1693getSizeimpl(map);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            arrayList.add(transform.invoke(p.m1626boximpl(q.m1692getpVg5ArA(map, i8))));
        }
        return arrayList;
    }

    /* renamed from: map-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m741mapxTcfx_M(short[] map, l transform) {
        s.checkNotNullParameter(map, "$this$map");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(v.m1847getSizeimpl(map));
        int m1847getSizeimpl = v.m1847getSizeimpl(map);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            arrayList.add(transform.invoke(u.m1782boximpl(v.m1846getMh2AYeg(map, i8))));
        }
        return arrayList;
    }

    /* renamed from: mapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m742mapIndexedELGow60(byte[] mapIndexed, f6.p transform) {
        s.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(o.m1615getSizeimpl(mapIndexed));
        int m1615getSizeimpl = o.m1615getSizeimpl(mapIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), n.m1550boximpl(o.m1614getw2LRezQ(mapIndexed, i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    /* renamed from: mapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m743mapIndexedWyvcNBI(int[] mapIndexed, f6.p transform) {
        s.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(q.m1693getSizeimpl(mapIndexed));
        int m1693getSizeimpl = q.m1693getSizeimpl(mapIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), p.m1626boximpl(q.m1692getpVg5ArA(mapIndexed, i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    /* renamed from: mapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m744mapIndexeds8dVfGU(long[] mapIndexed, f6.p transform) {
        s.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(y5.s.m1771getSizeimpl(mapIndexed));
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(mapIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), r.m1704boximpl(y5.s.m1770getsVKNKU(mapIndexed, i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    /* renamed from: mapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m745mapIndexedxzaTVY8(short[] mapIndexed, f6.p transform) {
        s.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(v.m1847getSizeimpl(mapIndexed));
        int m1847getSizeimpl = v.m1847getSizeimpl(mapIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), u.m1782boximpl(v.m1846getMh2AYeg(mapIndexed, i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    /* renamed from: mapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m746mapIndexedTo6EtJGI(int[] mapIndexedTo, C destination, f6.p transform) {
        s.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1693getSizeimpl = q.m1693getSizeimpl(mapIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i9), p.m1626boximpl(q.m1692getpVg5ArA(mapIndexedTo, i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    /* renamed from: mapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m747mapIndexedToQqktQ3k(short[] mapIndexedTo, C destination, f6.p transform) {
        s.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1847getSizeimpl = v.m1847getSizeimpl(mapIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i9), u.m1782boximpl(v.m1846getMh2AYeg(mapIndexedTo, i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    /* renamed from: mapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m748mapIndexedToeNpIKz8(byte[] mapIndexedTo, C destination, f6.p transform) {
        s.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1615getSizeimpl = o.m1615getSizeimpl(mapIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i9), n.m1550boximpl(o.m1614getw2LRezQ(mapIndexedTo, i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    /* renamed from: mapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m749mapIndexedTope2Q0Dw(long[] mapIndexedTo, C destination, f6.p transform) {
        s.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(mapIndexedTo);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i9), r.m1704boximpl(y5.s.m1770getsVKNKU(mapIndexedTo, i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    /* renamed from: mapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m750mapToHqK1JgA(long[] mapTo, C destination, l transform) {
        s.checkNotNullParameter(mapTo, "$this$mapTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(mapTo);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            destination.add(transform.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(mapTo, i8))));
        }
        return destination;
    }

    /* renamed from: mapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m751mapTooEOeDjA(short[] mapTo, C destination, l transform) {
        s.checkNotNullParameter(mapTo, "$this$mapTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1847getSizeimpl = v.m1847getSizeimpl(mapTo);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            destination.add(transform.invoke(u.m1782boximpl(v.m1846getMh2AYeg(mapTo, i8))));
        }
        return destination;
    }

    /* renamed from: mapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m752mapTowU5IKMo(int[] mapTo, C destination, l transform) {
        s.checkNotNullParameter(mapTo, "$this$mapTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1693getSizeimpl = q.m1693getSizeimpl(mapTo);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            destination.add(transform.invoke(p.m1626boximpl(q.m1692getpVg5ArA(mapTo, i8))));
        }
        return destination;
    }

    /* renamed from: mapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m753mapTowzUQCXU(byte[] mapTo, C destination, l transform) {
        s.checkNotNullParameter(mapTo, "$this$mapTo");
        s.checkNotNullParameter(destination, "destination");
        s.checkNotNullParameter(transform, "transform");
        int m1615getSizeimpl = o.m1615getSizeimpl(mapTo);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            destination.add(transform.invoke(n.m1550boximpl(o.m1614getw2LRezQ(mapTo, i8))));
        }
        return destination;
    }

    /* renamed from: maxByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> n m754maxByOrNullJOV_ifY(byte[] maxByOrNull, l selector) {
        s.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(maxByOrNull)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(maxByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return n.m1550boximpl(m1614getw2LRezQ);
        }
        Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(maxByOrNull, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ2));
            if (comparable.compareTo(comparable2) < 0) {
                m1614getw2LRezQ = m1614getw2LRezQ2;
                comparable = comparable2;
            }
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: maxByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> r m755maxByOrNullMShoTSo(long[] maxByOrNull, l selector) {
        s.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(maxByOrNull)) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(maxByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return r.m1704boximpl(m1770getsVKNKU);
        }
        Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(maxByOrNull, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU2));
            if (comparable.compareTo(comparable2) < 0) {
                m1770getsVKNKU = m1770getsVKNKU2;
                comparable = comparable2;
            }
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: maxByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> p m756maxByOrNulljgv0xPQ(int[] maxByOrNull, l selector) {
        s.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxByOrNull)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(maxByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return p.m1626boximpl(m1692getpVg5ArA);
        }
        Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(maxByOrNull, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA2));
            if (comparable.compareTo(comparable2) < 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
                comparable = comparable2;
            }
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: maxByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> u m757maxByOrNullxTcfx_M(short[] maxByOrNull, l selector) {
        s.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(maxByOrNull)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(maxByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return u.m1782boximpl(m1846getMh2AYeg);
        }
        Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            short m1846getMh2AYeg2 = v.m1846getMh2AYeg(maxByOrNull, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg2));
            if (comparable.compareTo(comparable2) < 0) {
                m1846getMh2AYeg = m1846getMh2AYeg2;
                comparable = comparable2;
            }
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m759maxByOrThrowU(int[] maxBy, l selector) {
        s.checkNotNullParameter(maxBy, "$this$maxBy");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(maxBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return m1692getpVg5ArA;
        }
        Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(maxBy, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA2));
            if (comparable.compareTo(comparable2) < 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
                comparable = comparable2;
            }
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final double m762maxOfJOV_ifY(byte[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOf, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOf, it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final double m765maxOfMShoTSo(long[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOf, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOf, it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final double m768maxOfjgv0xPQ(int[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOf, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOf, it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final double m771maxOfxTcfx_M(short[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOf, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOf, it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m775maxOfOrNullJOV_ifY(byte[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfOrNull, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfOrNull, it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m778maxOfOrNullMShoTSo(long[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfOrNull, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfOrNull, it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m781maxOfOrNulljgv0xPQ(int[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfOrNull, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfOrNull, it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m784maxOfOrNullxTcfx_M(short[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfOrNull, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfOrNull, it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: maxOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m786maxOfWith5NtCtWE(long[] maxOfWith, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfWith, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfWith)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfWith, it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m787maxOfWithLTi4i_s(byte[] maxOfWith, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfWith, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfWith)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfWith, it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m788maxOfWithl8EHGbQ(short[] maxOfWith, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfWith, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfWith)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfWith, it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m789maxOfWithmyNOsp4(int[] maxOfWith, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfWith, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfWith)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfWith, it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m790maxOfWithOrNull5NtCtWE(long[] maxOfWithOrNull, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfWithOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m791maxOfWithOrNullLTi4i_s(byte[] maxOfWithOrNull, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfWithOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m792maxOfWithOrNulll8EHGbQ(short[] maxOfWithOrNull, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfWithOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m793maxOfWithOrNullmyNOsp4(int[] maxOfWithOrNull, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfWithOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final p m794maxOrNullajY9A(int[] maxOrNull) {
        int compare;
        s.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (q.m1695isEmptyimpl(maxOrNull)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(maxOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(maxOrNull, it.nextInt());
            compare = Integer.compare(m1692getpVg5ArA ^ Integer.MIN_VALUE, m1692getpVg5ArA2 ^ Integer.MIN_VALUE);
            if (compare < 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
            }
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final n m795maxOrNullGBYM_sE(byte[] maxOrNull) {
        s.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (o.m1617isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(maxOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(maxOrNull, it.nextInt());
            if (s.compare(m1614getw2LRezQ & 255, m1614getw2LRezQ2 & 255) < 0) {
                m1614getw2LRezQ = m1614getw2LRezQ2;
            }
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final r m796maxOrNullQwZRm1k(long[] maxOrNull) {
        int compare;
        s.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (y5.s.m1773isEmptyimpl(maxOrNull)) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(maxOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(maxOrNull, it.nextInt());
            compare = Long.compare(m1770getsVKNKU ^ Long.MIN_VALUE, m1770getsVKNKU2 ^ Long.MIN_VALUE);
            if (compare < 0) {
                m1770getsVKNKU = m1770getsVKNKU2;
            }
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final u m797maxOrNullrL5Bavg(short[] maxOrNull) {
        s.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (v.m1849isEmptyimpl(maxOrNull)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(maxOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            short m1846getMh2AYeg2 = v.m1846getMh2AYeg(maxOrNull, it.nextInt());
            if (s.compare(m1846getMh2AYeg & u.MAX_VALUE, 65535 & m1846getMh2AYeg2) < 0) {
                m1846getMh2AYeg = m1846getMh2AYeg2;
            }
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m799maxOrThrowU(int[] max) {
        int compare;
        s.checkNotNullParameter(max, "$this$max");
        if (q.m1695isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(max, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(max, it.nextInt());
            compare = Integer.compare(m1692getpVg5ArA ^ Integer.MIN_VALUE, m1692getpVg5ArA2 ^ Integer.MIN_VALUE);
            if (compare < 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
            }
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final n m802maxWithOrNullXMRcp5o(byte[] maxWithOrNull, Comparator<? super n> comparator) {
        s.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        if (o.m1617isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(maxWithOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(maxWithOrNull, it.nextInt());
            if (comparator.compare(n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(m1614getw2LRezQ2)) < 0) {
                m1614getw2LRezQ = m1614getw2LRezQ2;
            }
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final p m803maxWithOrNullYmdZ_VM(int[] maxWithOrNull, Comparator<? super p> comparator) {
        s.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        if (q.m1695isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(maxWithOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(maxWithOrNull, it.nextInt());
            if (comparator.compare(p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(m1692getpVg5ArA2)) < 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
            }
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final u m804maxWithOrNulleOHTfZs(short[] maxWithOrNull, Comparator<? super u> comparator) {
        s.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        if (v.m1849isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(maxWithOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            short m1846getMh2AYeg2 = v.m1846getMh2AYeg(maxWithOrNull, it.nextInt());
            if (comparator.compare(u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(m1846getMh2AYeg2)) < 0) {
                m1846getMh2AYeg = m1846getMh2AYeg2;
            }
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final r m805maxWithOrNullzrEWJaI(long[] maxWithOrNull, Comparator<? super r> comparator) {
        s.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        if (y5.s.m1773isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(maxWithOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(maxWithOrNull, it.nextInt());
            if (comparator.compare(r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(m1770getsVKNKU2)) < 0) {
                m1770getsVKNKU = m1770getsVKNKU2;
            }
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m807maxWithOrThrowU(int[] maxWith, Comparator<? super p> comparator) {
        s.checkNotNullParameter(maxWith, "$this$maxWith");
        s.checkNotNullParameter(comparator, "comparator");
        if (q.m1695isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(maxWith, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(maxWith, it.nextInt());
            if (comparator.compare(p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(m1692getpVg5ArA2)) < 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
            }
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: minByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> n m810minByOrNullJOV_ifY(byte[] minByOrNull, l selector) {
        s.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(minByOrNull)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(minByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return n.m1550boximpl(m1614getw2LRezQ);
        }
        Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(minByOrNull, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ2));
            if (comparable.compareTo(comparable2) > 0) {
                m1614getw2LRezQ = m1614getw2LRezQ2;
                comparable = comparable2;
            }
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: minByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> r m811minByOrNullMShoTSo(long[] minByOrNull, l selector) {
        s.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(minByOrNull)) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(minByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return r.m1704boximpl(m1770getsVKNKU);
        }
        Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(minByOrNull, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU2));
            if (comparable.compareTo(comparable2) > 0) {
                m1770getsVKNKU = m1770getsVKNKU2;
                comparable = comparable2;
            }
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: minByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> p m812minByOrNulljgv0xPQ(int[] minByOrNull, l selector) {
        s.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minByOrNull)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(minByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return p.m1626boximpl(m1692getpVg5ArA);
        }
        Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(minByOrNull, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA2));
            if (comparable.compareTo(comparable2) > 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
                comparable = comparable2;
            }
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: minByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> u m813minByOrNullxTcfx_M(short[] minByOrNull, l selector) {
        s.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(minByOrNull)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(minByOrNull, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return u.m1782boximpl(m1846getMh2AYeg);
        }
        Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            short m1846getMh2AYeg2 = v.m1846getMh2AYeg(minByOrNull, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg2));
            if (comparable.compareTo(comparable2) > 0) {
                m1846getMh2AYeg = m1846getMh2AYeg2;
                comparable = comparable2;
            }
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m815minByOrThrowU(int[] minBy, l selector) {
        s.checkNotNullParameter(minBy, "$this$minBy");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(minBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return m1692getpVg5ArA;
        }
        Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA));
        f0 it = new m(1, lastIndex).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(minBy, it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA2));
            if (comparable.compareTo(comparable2) > 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
                comparable = comparable2;
            }
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final double m818minOfJOV_ifY(byte[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOf, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOf, it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final double m821minOfMShoTSo(long[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOf, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOf, it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final double m824minOfjgv0xPQ(int[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOf, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOf, it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final double m827minOfxTcfx_M(short[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOf, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOf, it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m831minOfOrNullJOV_ifY(byte[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfOrNull, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfOrNull, it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m834minOfOrNullMShoTSo(long[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfOrNull, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfOrNull, it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m837minOfOrNulljgv0xPQ(int[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfOrNull, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfOrNull, it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m840minOfOrNullxTcfx_M(short[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfOrNull, 0)))).doubleValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfOrNull, it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: minOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m842minOfWith5NtCtWE(long[] minOfWith, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(minOfWith, "$this$minOfWith");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfWith, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfWith)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfWith, it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m843minOfWithLTi4i_s(byte[] minOfWith, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(minOfWith, "$this$minOfWith");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfWith, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfWith)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfWith, it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m844minOfWithl8EHGbQ(short[] minOfWith, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(minOfWith, "$this$minOfWith");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfWith, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfWith)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfWith, it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m845minOfWithmyNOsp4(int[] minOfWith, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(minOfWith, "$this$minOfWith");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfWith, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfWith)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfWith, it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m846minOfWithOrNull5NtCtWE(long[] minOfWithOrNull, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfWithOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m847minOfWithOrNullLTi4i_s(byte[] minOfWithOrNull, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfWithOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m848minOfWithOrNulll8EHGbQ(short[] minOfWithOrNull, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfWithOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m849minOfWithOrNullmyNOsp4(int[] minOfWithOrNull, Comparator<? super R> comparator, l selector) {
        s.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfWithOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    /* renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final p m850minOrNullajY9A(int[] minOrNull) {
        int compare;
        s.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (q.m1695isEmptyimpl(minOrNull)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(minOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(minOrNull, it.nextInt());
            compare = Integer.compare(m1692getpVg5ArA ^ Integer.MIN_VALUE, m1692getpVg5ArA2 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
            }
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final n m851minOrNullGBYM_sE(byte[] minOrNull) {
        s.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (o.m1617isEmptyimpl(minOrNull)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(minOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(minOrNull, it.nextInt());
            if (s.compare(m1614getw2LRezQ & 255, m1614getw2LRezQ2 & 255) > 0) {
                m1614getw2LRezQ = m1614getw2LRezQ2;
            }
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final r m852minOrNullQwZRm1k(long[] minOrNull) {
        int compare;
        s.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (y5.s.m1773isEmptyimpl(minOrNull)) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(minOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(minOrNull, it.nextInt());
            compare = Long.compare(m1770getsVKNKU ^ Long.MIN_VALUE, m1770getsVKNKU2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                m1770getsVKNKU = m1770getsVKNKU2;
            }
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final u m853minOrNullrL5Bavg(short[] minOrNull) {
        s.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (v.m1849isEmptyimpl(minOrNull)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(minOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            short m1846getMh2AYeg2 = v.m1846getMh2AYeg(minOrNull, it.nextInt());
            if (s.compare(m1846getMh2AYeg & u.MAX_VALUE, 65535 & m1846getMh2AYeg2) > 0) {
                m1846getMh2AYeg = m1846getMh2AYeg2;
            }
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m855minOrThrowU(int[] min) {
        int compare;
        s.checkNotNullParameter(min, "$this$min");
        if (q.m1695isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(min, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(min, it.nextInt());
            compare = Integer.compare(m1692getpVg5ArA ^ Integer.MIN_VALUE, m1692getpVg5ArA2 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
            }
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final n m858minWithOrNullXMRcp5o(byte[] minWithOrNull, Comparator<? super n> comparator) {
        s.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        if (o.m1617isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(minWithOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(minWithOrNull, it.nextInt());
            if (comparator.compare(n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(m1614getw2LRezQ2)) > 0) {
                m1614getw2LRezQ = m1614getw2LRezQ2;
            }
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final p m859minWithOrNullYmdZ_VM(int[] minWithOrNull, Comparator<? super p> comparator) {
        s.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        if (q.m1695isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(minWithOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(minWithOrNull, it.nextInt());
            if (comparator.compare(p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(m1692getpVg5ArA2)) > 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
            }
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final u m860minWithOrNulleOHTfZs(short[] minWithOrNull, Comparator<? super u> comparator) {
        s.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        if (v.m1849isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(minWithOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            short m1846getMh2AYeg2 = v.m1846getMh2AYeg(minWithOrNull, it.nextInt());
            if (comparator.compare(u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(m1846getMh2AYeg2)) > 0) {
                m1846getMh2AYeg = m1846getMh2AYeg2;
            }
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final r m861minWithOrNullzrEWJaI(long[] minWithOrNull, Comparator<? super r> comparator) {
        s.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        s.checkNotNullParameter(comparator, "comparator");
        if (y5.s.m1773isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(minWithOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(minWithOrNull, it.nextInt());
            if (comparator.compare(r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(m1770getsVKNKU2)) > 0) {
                m1770getsVKNKU = m1770getsVKNKU2;
            }
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m863minWithOrThrowU(int[] minWith, Comparator<? super p> comparator) {
        s.checkNotNullParameter(minWith, "$this$minWith");
        s.checkNotNullParameter(comparator, "comparator");
        if (q.m1695isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(minWith, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
        while (it.hasNext()) {
            int m1692getpVg5ArA2 = q.m1692getpVg5ArA(minWith, it.nextInt());
            if (comparator.compare(p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(m1692getpVg5ArA2)) > 0) {
                m1692getpVg5ArA = m1692getpVg5ArA2;
            }
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: none--ajY-9A, reason: not valid java name */
    private static final boolean m866noneajY9A(int[] none) {
        s.checkNotNullParameter(none, "$this$none");
        return q.m1695isEmptyimpl(none);
    }

    /* renamed from: none-GBYM_sE, reason: not valid java name */
    private static final boolean m867noneGBYM_sE(byte[] none) {
        s.checkNotNullParameter(none, "$this$none");
        return o.m1617isEmptyimpl(none);
    }

    /* renamed from: none-JOV_ifY, reason: not valid java name */
    private static final boolean m868noneJOV_ifY(byte[] none, l predicate) {
        s.checkNotNullParameter(none, "$this$none");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(none);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            if (((Boolean) predicate.invoke(n.m1550boximpl(o.m1614getw2LRezQ(none, i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: none-MShoTSo, reason: not valid java name */
    private static final boolean m869noneMShoTSo(long[] none, l predicate) {
        s.checkNotNullParameter(none, "$this$none");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(none);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            if (((Boolean) predicate.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(none, i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: none-QwZRm1k, reason: not valid java name */
    private static final boolean m870noneQwZRm1k(long[] none) {
        s.checkNotNullParameter(none, "$this$none");
        return y5.s.m1773isEmptyimpl(none);
    }

    /* renamed from: none-jgv0xPQ, reason: not valid java name */
    private static final boolean m871nonejgv0xPQ(int[] none, l predicate) {
        s.checkNotNullParameter(none, "$this$none");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(none);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            if (((Boolean) predicate.invoke(p.m1626boximpl(q.m1692getpVg5ArA(none, i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: none-rL5Bavg, reason: not valid java name */
    private static final boolean m872nonerL5Bavg(short[] none) {
        s.checkNotNullParameter(none, "$this$none");
        return v.m1849isEmptyimpl(none);
    }

    /* renamed from: none-xTcfx_M, reason: not valid java name */
    private static final boolean m873nonexTcfx_M(short[] none, l predicate) {
        s.checkNotNullParameter(none, "$this$none");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(none);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            if (((Boolean) predicate.invoke(u.m1782boximpl(v.m1846getMh2AYeg(none, i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: onEach-JOV_ifY, reason: not valid java name */
    private static final byte[] m874onEachJOV_ifY(byte[] onEach, l action) {
        s.checkNotNullParameter(onEach, "$this$onEach");
        s.checkNotNullParameter(action, "action");
        int m1615getSizeimpl = o.m1615getSizeimpl(onEach);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            action.invoke(n.m1550boximpl(o.m1614getw2LRezQ(onEach, i8)));
        }
        return onEach;
    }

    /* renamed from: onEach-MShoTSo, reason: not valid java name */
    private static final long[] m875onEachMShoTSo(long[] onEach, l action) {
        s.checkNotNullParameter(onEach, "$this$onEach");
        s.checkNotNullParameter(action, "action");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(onEach);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            action.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(onEach, i8)));
        }
        return onEach;
    }

    /* renamed from: onEach-jgv0xPQ, reason: not valid java name */
    private static final int[] m876onEachjgv0xPQ(int[] onEach, l action) {
        s.checkNotNullParameter(onEach, "$this$onEach");
        s.checkNotNullParameter(action, "action");
        int m1693getSizeimpl = q.m1693getSizeimpl(onEach);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            action.invoke(p.m1626boximpl(q.m1692getpVg5ArA(onEach, i8)));
        }
        return onEach;
    }

    /* renamed from: onEach-xTcfx_M, reason: not valid java name */
    private static final short[] m877onEachxTcfx_M(short[] onEach, l action) {
        s.checkNotNullParameter(onEach, "$this$onEach");
        s.checkNotNullParameter(action, "action");
        int m1847getSizeimpl = v.m1847getSizeimpl(onEach);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            action.invoke(u.m1782boximpl(v.m1846getMh2AYeg(onEach, i8)));
        }
        return onEach;
    }

    /* renamed from: onEachIndexed-ELGow60, reason: not valid java name */
    private static final byte[] m878onEachIndexedELGow60(byte[] onEachIndexed, f6.p action) {
        s.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        s.checkNotNullParameter(action, "action");
        int m1615getSizeimpl = o.m1615getSizeimpl(onEachIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1615getSizeimpl) {
            action.invoke(Integer.valueOf(i9), n.m1550boximpl(o.m1614getw2LRezQ(onEachIndexed, i8)));
            i8++;
            i9++;
        }
        return onEachIndexed;
    }

    /* renamed from: onEachIndexed-WyvcNBI, reason: not valid java name */
    private static final int[] m879onEachIndexedWyvcNBI(int[] onEachIndexed, f6.p action) {
        s.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        s.checkNotNullParameter(action, "action");
        int m1693getSizeimpl = q.m1693getSizeimpl(onEachIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1693getSizeimpl) {
            action.invoke(Integer.valueOf(i9), p.m1626boximpl(q.m1692getpVg5ArA(onEachIndexed, i8)));
            i8++;
            i9++;
        }
        return onEachIndexed;
    }

    /* renamed from: onEachIndexed-s8dVfGU, reason: not valid java name */
    private static final long[] m880onEachIndexeds8dVfGU(long[] onEachIndexed, f6.p action) {
        s.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        s.checkNotNullParameter(action, "action");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(onEachIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1771getSizeimpl) {
            action.invoke(Integer.valueOf(i9), r.m1704boximpl(y5.s.m1770getsVKNKU(onEachIndexed, i8)));
            i8++;
            i9++;
        }
        return onEachIndexed;
    }

    /* renamed from: onEachIndexed-xzaTVY8, reason: not valid java name */
    private static final short[] m881onEachIndexedxzaTVY8(short[] onEachIndexed, f6.p action) {
        s.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        s.checkNotNullParameter(action, "action");
        int m1847getSizeimpl = v.m1847getSizeimpl(onEachIndexed);
        int i8 = 0;
        int i9 = 0;
        while (i8 < m1847getSizeimpl) {
            action.invoke(Integer.valueOf(i9), u.m1782boximpl(v.m1846getMh2AYeg(onEachIndexed, i8)));
            i8++;
            i9++;
        }
        return onEachIndexed;
    }

    /* renamed from: plus-3uqUaXg, reason: not valid java name */
    private static final long[] m882plus3uqUaXg(long[] plus, long j8) {
        long[] plus2;
        s.checkNotNullParameter(plus, "$this$plus");
        plus2 = k.plus(plus, j8);
        return y5.s.m1765constructorimpl(plus2);
    }

    /* renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m883plusCFIt9YE(int[] plus, Collection<p> elements) {
        s.checkNotNullParameter(plus, "$this$plus");
        s.checkNotNullParameter(elements, "elements");
        int m1693getSizeimpl = q.m1693getSizeimpl(plus);
        int[] copyOf = Arrays.copyOf(plus, q.m1693getSizeimpl(plus) + elements.size());
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Iterator<p> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[m1693getSizeimpl] = it.next().m1684unboximpl();
            m1693getSizeimpl++;
        }
        return q.m1687constructorimpl(copyOf);
    }

    /* renamed from: plus-XzdR7RA, reason: not valid java name */
    private static final short[] m884plusXzdR7RA(short[] plus, short s7) {
        short[] plus2;
        s.checkNotNullParameter(plus, "$this$plus");
        plus2 = k.plus(plus, s7);
        return v.m1841constructorimpl(plus2);
    }

    /* renamed from: plus-ctEhBpI, reason: not valid java name */
    private static final int[] m885plusctEhBpI(int[] plus, int[] elements) {
        int[] plus2;
        s.checkNotNullParameter(plus, "$this$plus");
        s.checkNotNullParameter(elements, "elements");
        plus2 = k.plus(plus, elements);
        return q.m1687constructorimpl(plus2);
    }

    /* renamed from: plus-gMuBH34, reason: not valid java name */
    private static final byte[] m886plusgMuBH34(byte[] plus, byte b8) {
        byte[] plus2;
        s.checkNotNullParameter(plus, "$this$plus");
        plus2 = k.plus(plus, b8);
        return o.m1609constructorimpl(plus2);
    }

    /* renamed from: plus-kdPth3s, reason: not valid java name */
    private static final byte[] m887pluskdPth3s(byte[] plus, byte[] elements) {
        byte[] plus2;
        s.checkNotNullParameter(plus, "$this$plus");
        s.checkNotNullParameter(elements, "elements");
        plus2 = k.plus(plus, elements);
        return o.m1609constructorimpl(plus2);
    }

    /* renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m888pluskzHmqpY(long[] plus, Collection<r> elements) {
        s.checkNotNullParameter(plus, "$this$plus");
        s.checkNotNullParameter(elements, "elements");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(plus);
        long[] copyOf = Arrays.copyOf(plus, y5.s.m1771getSizeimpl(plus) + elements.size());
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Iterator<r> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[m1771getSizeimpl] = it.next().m1762unboximpl();
            m1771getSizeimpl++;
        }
        return y5.s.m1765constructorimpl(copyOf);
    }

    /* renamed from: plus-mazbYpA, reason: not valid java name */
    private static final short[] m889plusmazbYpA(short[] plus, short[] elements) {
        short[] plus2;
        s.checkNotNullParameter(plus, "$this$plus");
        s.checkNotNullParameter(elements, "elements");
        plus2 = k.plus(plus, elements);
        return v.m1841constructorimpl(plus2);
    }

    /* renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m890plusojwP5H8(short[] plus, Collection<u> elements) {
        s.checkNotNullParameter(plus, "$this$plus");
        s.checkNotNullParameter(elements, "elements");
        int m1847getSizeimpl = v.m1847getSizeimpl(plus);
        short[] copyOf = Arrays.copyOf(plus, v.m1847getSizeimpl(plus) + elements.size());
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Iterator<u> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[m1847getSizeimpl] = it.next().m1838unboximpl();
            m1847getSizeimpl++;
        }
        return v.m1841constructorimpl(copyOf);
    }

    /* renamed from: plus-uWY9BYg, reason: not valid java name */
    private static final int[] m891plusuWY9BYg(int[] plus, int i8) {
        int[] plus2;
        s.checkNotNullParameter(plus, "$this$plus");
        plus2 = k.plus(plus, i8);
        return q.m1687constructorimpl(plus2);
    }

    /* renamed from: plus-us8wMrg, reason: not valid java name */
    private static final long[] m892plusus8wMrg(long[] plus, long[] elements) {
        long[] plus2;
        s.checkNotNullParameter(plus, "$this$plus");
        s.checkNotNullParameter(elements, "elements");
        plus2 = k.plus(plus, elements);
        return y5.s.m1765constructorimpl(plus2);
    }

    /* renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m893plusxo_DsdI(byte[] plus, Collection<n> elements) {
        s.checkNotNullParameter(plus, "$this$plus");
        s.checkNotNullParameter(elements, "elements");
        int m1615getSizeimpl = o.m1615getSizeimpl(plus);
        byte[] copyOf = Arrays.copyOf(plus, o.m1615getSizeimpl(plus) + elements.size());
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Iterator<n> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[m1615getSizeimpl] = it.next().m1606unboximpl();
            m1615getSizeimpl++;
        }
        return o.m1609constructorimpl(copyOf);
    }

    /* renamed from: random--ajY-9A, reason: not valid java name */
    private static final int m894randomajY9A(int[] random) {
        s.checkNotNullParameter(random, "$this$random");
        return m895random2D5oskM(random, Random.Default);
    }

    /* renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m895random2D5oskM(int[] random, Random random2) {
        s.checkNotNullParameter(random, "$this$random");
        s.checkNotNullParameter(random2, "random");
        if (q.m1695isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return q.m1692getpVg5ArA(random, random2.nextInt(q.m1693getSizeimpl(random)));
    }

    /* renamed from: random-GBYM_sE, reason: not valid java name */
    private static final byte m896randomGBYM_sE(byte[] random) {
        s.checkNotNullParameter(random, "$this$random");
        return m899randomoSF2wD8(random, Random.Default);
    }

    /* renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m897randomJzugnMA(long[] random, Random random2) {
        s.checkNotNullParameter(random, "$this$random");
        s.checkNotNullParameter(random2, "random");
        if (y5.s.m1773isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return y5.s.m1770getsVKNKU(random, random2.nextInt(y5.s.m1771getSizeimpl(random)));
    }

    /* renamed from: random-QwZRm1k, reason: not valid java name */
    private static final long m898randomQwZRm1k(long[] random) {
        s.checkNotNullParameter(random, "$this$random");
        return m897randomJzugnMA(random, Random.Default);
    }

    /* renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m899randomoSF2wD8(byte[] random, Random random2) {
        s.checkNotNullParameter(random, "$this$random");
        s.checkNotNullParameter(random2, "random");
        if (o.m1617isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return o.m1614getw2LRezQ(random, random2.nextInt(o.m1615getSizeimpl(random)));
    }

    /* renamed from: random-rL5Bavg, reason: not valid java name */
    private static final short m900randomrL5Bavg(short[] random) {
        s.checkNotNullParameter(random, "$this$random");
        return m901randoms5X_as8(random, Random.Default);
    }

    /* renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m901randoms5X_as8(short[] random, Random random2) {
        s.checkNotNullParameter(random, "$this$random");
        s.checkNotNullParameter(random2, "random");
        if (v.m1849isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return v.m1846getMh2AYeg(random, random2.nextInt(v.m1847getSizeimpl(random)));
    }

    /* renamed from: randomOrNull--ajY-9A, reason: not valid java name */
    private static final p m902randomOrNullajY9A(int[] randomOrNull) {
        s.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m903randomOrNull2D5oskM(randomOrNull, Random.Default);
    }

    /* renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final p m903randomOrNull2D5oskM(int[] randomOrNull, Random random) {
        s.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        s.checkNotNullParameter(random, "random");
        if (q.m1695isEmptyimpl(randomOrNull)) {
            return null;
        }
        return p.m1626boximpl(q.m1692getpVg5ArA(randomOrNull, random.nextInt(q.m1693getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-GBYM_sE, reason: not valid java name */
    private static final n m904randomOrNullGBYM_sE(byte[] randomOrNull) {
        s.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m907randomOrNulloSF2wD8(randomOrNull, Random.Default);
    }

    /* renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final r m905randomOrNullJzugnMA(long[] randomOrNull, Random random) {
        s.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        s.checkNotNullParameter(random, "random");
        if (y5.s.m1773isEmptyimpl(randomOrNull)) {
            return null;
        }
        return r.m1704boximpl(y5.s.m1770getsVKNKU(randomOrNull, random.nextInt(y5.s.m1771getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-QwZRm1k, reason: not valid java name */
    private static final r m906randomOrNullQwZRm1k(long[] randomOrNull) {
        s.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m905randomOrNullJzugnMA(randomOrNull, Random.Default);
    }

    /* renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final n m907randomOrNulloSF2wD8(byte[] randomOrNull, Random random) {
        s.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        s.checkNotNullParameter(random, "random");
        if (o.m1617isEmptyimpl(randomOrNull)) {
            return null;
        }
        return n.m1550boximpl(o.m1614getw2LRezQ(randomOrNull, random.nextInt(o.m1615getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-rL5Bavg, reason: not valid java name */
    private static final u m908randomOrNullrL5Bavg(short[] randomOrNull) {
        s.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m909randomOrNulls5X_as8(randomOrNull, Random.Default);
    }

    /* renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final u m909randomOrNulls5X_as8(short[] randomOrNull, Random random) {
        s.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        s.checkNotNullParameter(random, "random");
        if (v.m1849isEmptyimpl(randomOrNull)) {
            return null;
        }
        return u.m1782boximpl(v.m1846getMh2AYeg(randomOrNull, random.nextInt(v.m1847getSizeimpl(randomOrNull))));
    }

    /* renamed from: reduce-ELGow60, reason: not valid java name */
    private static final byte m910reduceELGow60(byte[] reduce, f6.p operation) {
        s.checkNotNullParameter(reduce, "$this$reduce");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(reduce, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduce)).iterator();
        while (it.hasNext()) {
            m1614getw2LRezQ = ((n) operation.invoke(n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(o.m1614getw2LRezQ(reduce, it.nextInt())))).m1606unboximpl();
        }
        return m1614getw2LRezQ;
    }

    /* renamed from: reduce-WyvcNBI, reason: not valid java name */
    private static final int m911reduceWyvcNBI(int[] reduce, f6.p operation) {
        s.checkNotNullParameter(reduce, "$this$reduce");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(reduce, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduce)).iterator();
        while (it.hasNext()) {
            m1692getpVg5ArA = ((p) operation.invoke(p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(q.m1692getpVg5ArA(reduce, it.nextInt())))).m1684unboximpl();
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: reduce-s8dVfGU, reason: not valid java name */
    private static final long m912reduces8dVfGU(long[] reduce, f6.p operation) {
        s.checkNotNullParameter(reduce, "$this$reduce");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(reduce, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduce)).iterator();
        while (it.hasNext()) {
            m1770getsVKNKU = ((r) operation.invoke(r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(y5.s.m1770getsVKNKU(reduce, it.nextInt())))).m1762unboximpl();
        }
        return m1770getsVKNKU;
    }

    /* renamed from: reduce-xzaTVY8, reason: not valid java name */
    private static final short m913reducexzaTVY8(short[] reduce, f6.p operation) {
        s.checkNotNullParameter(reduce, "$this$reduce");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(reduce, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduce)).iterator();
        while (it.hasNext()) {
            m1846getMh2AYeg = ((u) operation.invoke(u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(v.m1846getMh2AYeg(reduce, it.nextInt())))).m1838unboximpl();
        }
        return m1846getMh2AYeg;
    }

    /* renamed from: reduceIndexed-D40WMg8, reason: not valid java name */
    private static final int m914reduceIndexedD40WMg8(int[] reduceIndexed, f6.q operation) {
        s.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(reduceIndexed, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m1692getpVg5ArA = ((p) operation.invoke(Integer.valueOf(nextInt), p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(q.m1692getpVg5ArA(reduceIndexed, nextInt)))).m1684unboximpl();
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: reduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m915reduceIndexedEOyYB1Y(byte[] reduceIndexed, f6.q operation) {
        s.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(reduceIndexed, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m1614getw2LRezQ = ((n) operation.invoke(Integer.valueOf(nextInt), n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(o.m1614getw2LRezQ(reduceIndexed, nextInt)))).m1606unboximpl();
        }
        return m1614getw2LRezQ;
    }

    /* renamed from: reduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m916reduceIndexedaLgx1Fo(short[] reduceIndexed, f6.q operation) {
        s.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(reduceIndexed, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m1846getMh2AYeg = ((u) operation.invoke(Integer.valueOf(nextInt), u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(v.m1846getMh2AYeg(reduceIndexed, nextInt)))).m1838unboximpl();
        }
        return m1846getMh2AYeg;
    }

    /* renamed from: reduceIndexed-z1zDJgo, reason: not valid java name */
    private static final long m917reduceIndexedz1zDJgo(long[] reduceIndexed, f6.q operation) {
        s.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(reduceIndexed, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m1770getsVKNKU = ((r) operation.invoke(Integer.valueOf(nextInt), r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(y5.s.m1770getsVKNKU(reduceIndexed, nextInt)))).m1762unboximpl();
        }
        return m1770getsVKNKU;
    }

    /* renamed from: reduceIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final p m918reduceIndexedOrNullD40WMg8(int[] reduceIndexedOrNull, f6.q operation) {
        s.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(reduceIndexedOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m1692getpVg5ArA = ((p) operation.invoke(Integer.valueOf(nextInt), p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(q.m1692getpVg5ArA(reduceIndexedOrNull, nextInt)))).m1684unboximpl();
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: reduceIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final n m919reduceIndexedOrNullEOyYB1Y(byte[] reduceIndexedOrNull, f6.q operation) {
        s.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(reduceIndexedOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m1614getw2LRezQ = ((n) operation.invoke(Integer.valueOf(nextInt), n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(o.m1614getw2LRezQ(reduceIndexedOrNull, nextInt)))).m1606unboximpl();
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: reduceIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final u m920reduceIndexedOrNullaLgx1Fo(short[] reduceIndexedOrNull, f6.q operation) {
        s.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(reduceIndexedOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m1846getMh2AYeg = ((u) operation.invoke(Integer.valueOf(nextInt), u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(v.m1846getMh2AYeg(reduceIndexedOrNull, nextInt)))).m1838unboximpl();
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: reduceIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final r m921reduceIndexedOrNullz1zDJgo(long[] reduceIndexedOrNull, f6.q operation) {
        s.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(reduceIndexedOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m1770getsVKNKU = ((r) operation.invoke(Integer.valueOf(nextInt), r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(y5.s.m1770getsVKNKU(reduceIndexedOrNull, nextInt)))).m1762unboximpl();
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: reduceOrNull-ELGow60, reason: not valid java name */
    private static final n m922reduceOrNullELGow60(byte[] reduceOrNull, f6.p operation) {
        s.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(reduceOrNull)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(reduceOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceOrNull)).iterator();
        while (it.hasNext()) {
            m1614getw2LRezQ = ((n) operation.invoke(n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(o.m1614getw2LRezQ(reduceOrNull, it.nextInt())))).m1606unboximpl();
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: reduceOrNull-WyvcNBI, reason: not valid java name */
    private static final p m923reduceOrNullWyvcNBI(int[] reduceOrNull, f6.p operation) {
        s.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(reduceOrNull)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(reduceOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceOrNull)).iterator();
        while (it.hasNext()) {
            m1692getpVg5ArA = ((p) operation.invoke(p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(q.m1692getpVg5ArA(reduceOrNull, it.nextInt())))).m1684unboximpl();
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: reduceOrNull-s8dVfGU, reason: not valid java name */
    private static final r m924reduceOrNulls8dVfGU(long[] reduceOrNull, f6.p operation) {
        s.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(reduceOrNull)) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(reduceOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceOrNull)).iterator();
        while (it.hasNext()) {
            m1770getsVKNKU = ((r) operation.invoke(r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(y5.s.m1770getsVKNKU(reduceOrNull, it.nextInt())))).m1762unboximpl();
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: reduceOrNull-xzaTVY8, reason: not valid java name */
    private static final u m925reduceOrNullxzaTVY8(short[] reduceOrNull, f6.p operation) {
        s.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(reduceOrNull)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(reduceOrNull, 0);
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(reduceOrNull)).iterator();
        while (it.hasNext()) {
            m1846getMh2AYeg = ((u) operation.invoke(u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(v.m1846getMh2AYeg(reduceOrNull, it.nextInt())))).m1838unboximpl();
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: reduceRight-ELGow60, reason: not valid java name */
    private static final byte m926reduceRightELGow60(byte[] reduceRight, f6.p operation) {
        s.checkNotNullParameter(reduceRight, "$this$reduceRight");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(reduceRight, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1614getw2LRezQ = ((n) operation.invoke(n.m1550boximpl(o.m1614getw2LRezQ(reduceRight, i8)), n.m1550boximpl(m1614getw2LRezQ))).m1606unboximpl();
        }
        return m1614getw2LRezQ;
    }

    /* renamed from: reduceRight-WyvcNBI, reason: not valid java name */
    private static final int m927reduceRightWyvcNBI(int[] reduceRight, f6.p operation) {
        s.checkNotNullParameter(reduceRight, "$this$reduceRight");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(reduceRight, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1692getpVg5ArA = ((p) operation.invoke(p.m1626boximpl(q.m1692getpVg5ArA(reduceRight, i8)), p.m1626boximpl(m1692getpVg5ArA))).m1684unboximpl();
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: reduceRight-s8dVfGU, reason: not valid java name */
    private static final long m928reduceRights8dVfGU(long[] reduceRight, f6.p operation) {
        s.checkNotNullParameter(reduceRight, "$this$reduceRight");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(reduceRight, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1770getsVKNKU = ((r) operation.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(reduceRight, i8)), r.m1704boximpl(m1770getsVKNKU))).m1762unboximpl();
        }
        return m1770getsVKNKU;
    }

    /* renamed from: reduceRight-xzaTVY8, reason: not valid java name */
    private static final short m929reduceRightxzaTVY8(short[] reduceRight, f6.p operation) {
        s.checkNotNullParameter(reduceRight, "$this$reduceRight");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(reduceRight, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1846getMh2AYeg = ((u) operation.invoke(u.m1782boximpl(v.m1846getMh2AYeg(reduceRight, i8)), u.m1782boximpl(m1846getMh2AYeg))).m1838unboximpl();
        }
        return m1846getMh2AYeg;
    }

    /* renamed from: reduceRightIndexed-D40WMg8, reason: not valid java name */
    private static final int m930reduceRightIndexedD40WMg8(int[] reduceRightIndexed, f6.q operation) {
        s.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(reduceRightIndexed, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1692getpVg5ArA = ((p) operation.invoke(Integer.valueOf(i8), p.m1626boximpl(q.m1692getpVg5ArA(reduceRightIndexed, i8)), p.m1626boximpl(m1692getpVg5ArA))).m1684unboximpl();
        }
        return m1692getpVg5ArA;
    }

    /* renamed from: reduceRightIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m931reduceRightIndexedEOyYB1Y(byte[] reduceRightIndexed, f6.q operation) {
        s.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(reduceRightIndexed, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1614getw2LRezQ = ((n) operation.invoke(Integer.valueOf(i8), n.m1550boximpl(o.m1614getw2LRezQ(reduceRightIndexed, i8)), n.m1550boximpl(m1614getw2LRezQ))).m1606unboximpl();
        }
        return m1614getw2LRezQ;
    }

    /* renamed from: reduceRightIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m932reduceRightIndexedaLgx1Fo(short[] reduceRightIndexed, f6.q operation) {
        s.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(reduceRightIndexed, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1846getMh2AYeg = ((u) operation.invoke(Integer.valueOf(i8), u.m1782boximpl(v.m1846getMh2AYeg(reduceRightIndexed, i8)), u.m1782boximpl(m1846getMh2AYeg))).m1838unboximpl();
        }
        return m1846getMh2AYeg;
    }

    /* renamed from: reduceRightIndexed-z1zDJgo, reason: not valid java name */
    private static final long m933reduceRightIndexedz1zDJgo(long[] reduceRightIndexed, f6.q operation) {
        s.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(reduceRightIndexed, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1770getsVKNKU = ((r) operation.invoke(Integer.valueOf(i8), r.m1704boximpl(y5.s.m1770getsVKNKU(reduceRightIndexed, i8)), r.m1704boximpl(m1770getsVKNKU))).m1762unboximpl();
        }
        return m1770getsVKNKU;
    }

    /* renamed from: reduceRightIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final p m934reduceRightIndexedOrNullD40WMg8(int[] reduceRightIndexedOrNull, f6.q operation) {
        s.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(reduceRightIndexedOrNull, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1692getpVg5ArA = ((p) operation.invoke(Integer.valueOf(i8), p.m1626boximpl(q.m1692getpVg5ArA(reduceRightIndexedOrNull, i8)), p.m1626boximpl(m1692getpVg5ArA))).m1684unboximpl();
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: reduceRightIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final n m935reduceRightIndexedOrNullEOyYB1Y(byte[] reduceRightIndexedOrNull, f6.q operation) {
        s.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(reduceRightIndexedOrNull, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1614getw2LRezQ = ((n) operation.invoke(Integer.valueOf(i8), n.m1550boximpl(o.m1614getw2LRezQ(reduceRightIndexedOrNull, i8)), n.m1550boximpl(m1614getw2LRezQ))).m1606unboximpl();
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: reduceRightIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final u m936reduceRightIndexedOrNullaLgx1Fo(short[] reduceRightIndexedOrNull, f6.q operation) {
        s.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(reduceRightIndexedOrNull, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1846getMh2AYeg = ((u) operation.invoke(Integer.valueOf(i8), u.m1782boximpl(v.m1846getMh2AYeg(reduceRightIndexedOrNull, i8)), u.m1782boximpl(m1846getMh2AYeg))).m1838unboximpl();
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: reduceRightIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final r m937reduceRightIndexedOrNullz1zDJgo(long[] reduceRightIndexedOrNull, f6.q operation) {
        s.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(reduceRightIndexedOrNull, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1770getsVKNKU = ((r) operation.invoke(Integer.valueOf(i8), r.m1704boximpl(y5.s.m1770getsVKNKU(reduceRightIndexedOrNull, i8)), r.m1704boximpl(m1770getsVKNKU))).m1762unboximpl();
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: reduceRightOrNull-ELGow60, reason: not valid java name */
    private static final n m938reduceRightOrNullELGow60(byte[] reduceRightOrNull, f6.p operation) {
        s.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(reduceRightOrNull, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1614getw2LRezQ = ((n) operation.invoke(n.m1550boximpl(o.m1614getw2LRezQ(reduceRightOrNull, i8)), n.m1550boximpl(m1614getw2LRezQ))).m1606unboximpl();
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: reduceRightOrNull-WyvcNBI, reason: not valid java name */
    private static final p m939reduceRightOrNullWyvcNBI(int[] reduceRightOrNull, f6.p operation) {
        s.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(reduceRightOrNull, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1692getpVg5ArA = ((p) operation.invoke(p.m1626boximpl(q.m1692getpVg5ArA(reduceRightOrNull, i8)), p.m1626boximpl(m1692getpVg5ArA))).m1684unboximpl();
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: reduceRightOrNull-s8dVfGU, reason: not valid java name */
    private static final r m940reduceRightOrNulls8dVfGU(long[] reduceRightOrNull, f6.p operation) {
        s.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(reduceRightOrNull, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1770getsVKNKU = ((r) operation.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(reduceRightOrNull, i8)), r.m1704boximpl(m1770getsVKNKU))).m1762unboximpl();
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: reduceRightOrNull-xzaTVY8, reason: not valid java name */
    private static final u m941reduceRightOrNullxzaTVY8(short[] reduceRightOrNull, f6.p operation) {
        s.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        s.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(reduceRightOrNull, lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            m1846getMh2AYeg = ((u) operation.invoke(u.m1782boximpl(v.m1846getMh2AYeg(reduceRightOrNull, i8)), u.m1782boximpl(m1846getMh2AYeg))).m1838unboximpl();
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: reverse--ajY-9A, reason: not valid java name */
    private static final void m942reverseajY9A(int[] reverse) {
        s.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    /* renamed from: reverse--nroSd4, reason: not valid java name */
    private static final void m943reversenroSd4(long[] reverse, int i8, int i9) {
        s.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i8, i9);
    }

    /* renamed from: reverse-4UcCI2c, reason: not valid java name */
    private static final void m944reverse4UcCI2c(byte[] reverse, int i8, int i9) {
        s.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i8, i9);
    }

    /* renamed from: reverse-Aa5vz7o, reason: not valid java name */
    private static final void m945reverseAa5vz7o(short[] reverse, int i8, int i9) {
        s.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i8, i9);
    }

    /* renamed from: reverse-GBYM_sE, reason: not valid java name */
    private static final void m946reverseGBYM_sE(byte[] reverse) {
        s.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    /* renamed from: reverse-QwZRm1k, reason: not valid java name */
    private static final void m947reverseQwZRm1k(long[] reverse) {
        s.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    /* renamed from: reverse-oBK06Vg, reason: not valid java name */
    private static final void m948reverseoBK06Vg(int[] reverse, int i8, int i9) {
        s.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse, i8, i9);
    }

    /* renamed from: reverse-rL5Bavg, reason: not valid java name */
    private static final void m949reverserL5Bavg(short[] reverse) {
        s.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt___ArraysKt.reverse(reverse);
    }

    /* renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<p> m950reversedajY9A(int[] reversed) {
        s.checkNotNullParameter(reversed, "$this$reversed");
        if (q.m1695isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<p> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) q.m1685boximpl(reversed));
        x.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<n> m951reversedGBYM_sE(byte[] reversed) {
        s.checkNotNullParameter(reversed, "$this$reversed");
        if (o.m1617isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<n> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) o.m1607boximpl(reversed));
        x.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<r> m952reversedQwZRm1k(long[] reversed) {
        s.checkNotNullParameter(reversed, "$this$reversed");
        if (y5.s.m1773isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<r> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) y5.s.m1763boximpl(reversed));
        x.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<u> m953reversedrL5Bavg(short[] reversed) {
        s.checkNotNullParameter(reversed, "$this$reversed");
        if (v.m1849isEmptyimpl(reversed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<u> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) v.m1839boximpl(reversed));
        x.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversedArray--ajY-9A, reason: not valid java name */
    private static final int[] m954reversedArrayajY9A(int[] reversedArray) {
        int[] reversedArray2;
        s.checkNotNullParameter(reversedArray, "$this$reversedArray");
        reversedArray2 = ArraysKt___ArraysKt.reversedArray(reversedArray);
        return q.m1687constructorimpl(reversedArray2);
    }

    /* renamed from: reversedArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m955reversedArrayGBYM_sE(byte[] reversedArray) {
        byte[] reversedArray2;
        s.checkNotNullParameter(reversedArray, "$this$reversedArray");
        reversedArray2 = ArraysKt___ArraysKt.reversedArray(reversedArray);
        return o.m1609constructorimpl(reversedArray2);
    }

    /* renamed from: reversedArray-QwZRm1k, reason: not valid java name */
    private static final long[] m956reversedArrayQwZRm1k(long[] reversedArray) {
        long[] reversedArray2;
        s.checkNotNullParameter(reversedArray, "$this$reversedArray");
        reversedArray2 = ArraysKt___ArraysKt.reversedArray(reversedArray);
        return y5.s.m1765constructorimpl(reversedArray2);
    }

    /* renamed from: reversedArray-rL5Bavg, reason: not valid java name */
    private static final short[] m957reversedArrayrL5Bavg(short[] reversedArray) {
        short[] reversedArray2;
        s.checkNotNullParameter(reversedArray, "$this$reversedArray");
        reversedArray2 = ArraysKt___ArraysKt.reversedArray(reversedArray);
        return v.m1841constructorimpl(reversedArray2);
    }

    /* renamed from: runningFold-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m958runningFoldA8wKCXQ(long[] runningFold, R r8, f6.p operation) {
        s.checkNotNullParameter(runningFold, "$this$runningFold");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(runningFold)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(y5.s.m1771getSizeimpl(runningFold) + 1);
        arrayList.add(r8);
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(runningFold);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, r.m1704boximpl(y5.s.m1770getsVKNKU(runningFold, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: runningFold-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m959runningFoldyXmHNn8(byte[] runningFold, R r8, f6.p operation) {
        s.checkNotNullParameter(runningFold, "$this$runningFold");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(runningFold)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(o.m1615getSizeimpl(runningFold) + 1);
        arrayList.add(r8);
        int m1615getSizeimpl = o.m1615getSizeimpl(runningFold);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, n.m1550boximpl(o.m1614getw2LRezQ(runningFold, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: runningFold-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m960runningFoldzi1B2BA(int[] runningFold, R r8, f6.p operation) {
        s.checkNotNullParameter(runningFold, "$this$runningFold");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(runningFold)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(q.m1693getSizeimpl(runningFold) + 1);
        arrayList.add(r8);
        int m1693getSizeimpl = q.m1693getSizeimpl(runningFold);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, p.m1626boximpl(q.m1692getpVg5ArA(runningFold, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: runningFold-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m961runningFoldzww5nb8(short[] runningFold, R r8, f6.p operation) {
        s.checkNotNullParameter(runningFold, "$this$runningFold");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(runningFold)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(v.m1847getSizeimpl(runningFold) + 1);
        arrayList.add(r8);
        int m1847getSizeimpl = v.m1847getSizeimpl(runningFold);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, u.m1782boximpl(v.m1846getMh2AYeg(runningFold, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: runningFoldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m962runningFoldIndexed3iWJZGE(byte[] runningFoldIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(runningFoldIndexed)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(o.m1615getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r8);
        int m1615getSizeimpl = o.m1615getSizeimpl(runningFoldIndexed);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, n.m1550boximpl(o.m1614getw2LRezQ(runningFoldIndexed, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: runningFoldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m963runningFoldIndexedbzxtMww(short[] runningFoldIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(runningFoldIndexed)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(v.m1847getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r8);
        int m1847getSizeimpl = v.m1847getSizeimpl(runningFoldIndexed);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, u.m1782boximpl(v.m1846getMh2AYeg(runningFoldIndexed, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: runningFoldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m964runningFoldIndexedmwnnOCs(long[] runningFoldIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(runningFoldIndexed)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(y5.s.m1771getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r8);
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(runningFoldIndexed);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, r.m1704boximpl(y5.s.m1770getsVKNKU(runningFoldIndexed, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: runningFoldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m965runningFoldIndexedyVwIW0Q(int[] runningFoldIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(runningFoldIndexed)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(q.m1693getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r8);
        int m1693getSizeimpl = q.m1693getSizeimpl(runningFoldIndexed);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, p.m1626boximpl(q.m1692getpVg5ArA(runningFoldIndexed, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: runningReduce-ELGow60, reason: not valid java name */
    private static final List<n> m966runningReduceELGow60(byte[] runningReduce, f6.p operation) {
        s.checkNotNullParameter(runningReduce, "$this$runningReduce");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(runningReduce)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(runningReduce, 0);
        ArrayList arrayList = new ArrayList(o.m1615getSizeimpl(runningReduce));
        arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
        int m1615getSizeimpl = o.m1615getSizeimpl(runningReduce);
        for (int i8 = 1; i8 < m1615getSizeimpl; i8++) {
            m1614getw2LRezQ = ((n) operation.invoke(n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(o.m1614getw2LRezQ(runningReduce, i8)))).m1606unboximpl();
            arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
        }
        return arrayList;
    }

    /* renamed from: runningReduce-WyvcNBI, reason: not valid java name */
    private static final List<p> m967runningReduceWyvcNBI(int[] runningReduce, f6.p operation) {
        s.checkNotNullParameter(runningReduce, "$this$runningReduce");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(runningReduce)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(runningReduce, 0);
        ArrayList arrayList = new ArrayList(q.m1693getSizeimpl(runningReduce));
        arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
        int m1693getSizeimpl = q.m1693getSizeimpl(runningReduce);
        for (int i8 = 1; i8 < m1693getSizeimpl; i8++) {
            m1692getpVg5ArA = ((p) operation.invoke(p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(q.m1692getpVg5ArA(runningReduce, i8)))).m1684unboximpl();
            arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
        }
        return arrayList;
    }

    /* renamed from: runningReduce-s8dVfGU, reason: not valid java name */
    private static final List<r> m968runningReduces8dVfGU(long[] runningReduce, f6.p operation) {
        s.checkNotNullParameter(runningReduce, "$this$runningReduce");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(runningReduce)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(runningReduce, 0);
        ArrayList arrayList = new ArrayList(y5.s.m1771getSizeimpl(runningReduce));
        arrayList.add(r.m1704boximpl(m1770getsVKNKU));
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(runningReduce);
        for (int i8 = 1; i8 < m1771getSizeimpl; i8++) {
            m1770getsVKNKU = ((r) operation.invoke(r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(y5.s.m1770getsVKNKU(runningReduce, i8)))).m1762unboximpl();
            arrayList.add(r.m1704boximpl(m1770getsVKNKU));
        }
        return arrayList;
    }

    /* renamed from: runningReduce-xzaTVY8, reason: not valid java name */
    private static final List<u> m969runningReducexzaTVY8(short[] runningReduce, f6.p operation) {
        s.checkNotNullParameter(runningReduce, "$this$runningReduce");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(runningReduce)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(runningReduce, 0);
        ArrayList arrayList = new ArrayList(v.m1847getSizeimpl(runningReduce));
        arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
        int m1847getSizeimpl = v.m1847getSizeimpl(runningReduce);
        for (int i8 = 1; i8 < m1847getSizeimpl; i8++) {
            m1846getMh2AYeg = ((u) operation.invoke(u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(v.m1846getMh2AYeg(runningReduce, i8)))).m1838unboximpl();
            arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
        }
        return arrayList;
    }

    /* renamed from: runningReduceIndexed-D40WMg8, reason: not valid java name */
    private static final List<p> m970runningReduceIndexedD40WMg8(int[] runningReduceIndexed, f6.q operation) {
        s.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(q.m1693getSizeimpl(runningReduceIndexed));
        arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
        int m1693getSizeimpl = q.m1693getSizeimpl(runningReduceIndexed);
        for (int i8 = 1; i8 < m1693getSizeimpl; i8++) {
            m1692getpVg5ArA = ((p) operation.invoke(Integer.valueOf(i8), p.m1626boximpl(m1692getpVg5ArA), p.m1626boximpl(q.m1692getpVg5ArA(runningReduceIndexed, i8)))).m1684unboximpl();
            arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
        }
        return arrayList;
    }

    /* renamed from: runningReduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final List<n> m971runningReduceIndexedEOyYB1Y(byte[] runningReduceIndexed, f6.q operation) {
        s.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(o.m1615getSizeimpl(runningReduceIndexed));
        arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
        int m1615getSizeimpl = o.m1615getSizeimpl(runningReduceIndexed);
        for (int i8 = 1; i8 < m1615getSizeimpl; i8++) {
            m1614getw2LRezQ = ((n) operation.invoke(Integer.valueOf(i8), n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(o.m1614getw2LRezQ(runningReduceIndexed, i8)))).m1606unboximpl();
            arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
        }
        return arrayList;
    }

    /* renamed from: runningReduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final List<u> m972runningReduceIndexedaLgx1Fo(short[] runningReduceIndexed, f6.q operation) {
        s.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(v.m1847getSizeimpl(runningReduceIndexed));
        arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
        int m1847getSizeimpl = v.m1847getSizeimpl(runningReduceIndexed);
        for (int i8 = 1; i8 < m1847getSizeimpl; i8++) {
            m1846getMh2AYeg = ((u) operation.invoke(Integer.valueOf(i8), u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(v.m1846getMh2AYeg(runningReduceIndexed, i8)))).m1838unboximpl();
            arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
        }
        return arrayList;
    }

    /* renamed from: runningReduceIndexed-z1zDJgo, reason: not valid java name */
    private static final List<r> m973runningReduceIndexedz1zDJgo(long[] runningReduceIndexed, f6.q operation) {
        s.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(y5.s.m1771getSizeimpl(runningReduceIndexed));
        arrayList.add(r.m1704boximpl(m1770getsVKNKU));
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(runningReduceIndexed);
        for (int i8 = 1; i8 < m1771getSizeimpl; i8++) {
            m1770getsVKNKU = ((r) operation.invoke(Integer.valueOf(i8), r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(y5.s.m1770getsVKNKU(runningReduceIndexed, i8)))).m1762unboximpl();
            arrayList.add(r.m1704boximpl(m1770getsVKNKU));
        }
        return arrayList;
    }

    /* renamed from: scan-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m974scanA8wKCXQ(long[] scan, R r8, f6.p operation) {
        s.checkNotNullParameter(scan, "$this$scan");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(scan)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(y5.s.m1771getSizeimpl(scan) + 1);
        arrayList.add(r8);
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(scan);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, r.m1704boximpl(y5.s.m1770getsVKNKU(scan, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: scan-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m975scanyXmHNn8(byte[] scan, R r8, f6.p operation) {
        s.checkNotNullParameter(scan, "$this$scan");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(scan)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(o.m1615getSizeimpl(scan) + 1);
        arrayList.add(r8);
        int m1615getSizeimpl = o.m1615getSizeimpl(scan);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, n.m1550boximpl(o.m1614getw2LRezQ(scan, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: scan-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m976scanzi1B2BA(int[] scan, R r8, f6.p operation) {
        s.checkNotNullParameter(scan, "$this$scan");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(scan)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(q.m1693getSizeimpl(scan) + 1);
        arrayList.add(r8);
        int m1693getSizeimpl = q.m1693getSizeimpl(scan);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, p.m1626boximpl(q.m1692getpVg5ArA(scan, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: scan-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m977scanzww5nb8(short[] scan, R r8, f6.p operation) {
        s.checkNotNullParameter(scan, "$this$scan");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(scan)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(v.m1847getSizeimpl(scan) + 1);
        arrayList.add(r8);
        int m1847getSizeimpl = v.m1847getSizeimpl(scan);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            r8 = (R) operation.invoke(r8, u.m1782boximpl(v.m1846getMh2AYeg(scan, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: scanIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m978scanIndexed3iWJZGE(byte[] scanIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (o.m1617isEmptyimpl(scanIndexed)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(o.m1615getSizeimpl(scanIndexed) + 1);
        arrayList.add(r8);
        int m1615getSizeimpl = o.m1615getSizeimpl(scanIndexed);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, n.m1550boximpl(o.m1614getw2LRezQ(scanIndexed, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: scanIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m979scanIndexedbzxtMww(short[] scanIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (v.m1849isEmptyimpl(scanIndexed)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(v.m1847getSizeimpl(scanIndexed) + 1);
        arrayList.add(r8);
        int m1847getSizeimpl = v.m1847getSizeimpl(scanIndexed);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, u.m1782boximpl(v.m1846getMh2AYeg(scanIndexed, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: scanIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m980scanIndexedmwnnOCs(long[] scanIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (y5.s.m1773isEmptyimpl(scanIndexed)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(y5.s.m1771getSizeimpl(scanIndexed) + 1);
        arrayList.add(r8);
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(scanIndexed);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, r.m1704boximpl(y5.s.m1770getsVKNKU(scanIndexed, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: scanIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m981scanIndexedyVwIW0Q(int[] scanIndexed, R r8, f6.q operation) {
        s.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        s.checkNotNullParameter(operation, "operation");
        if (q.m1695isEmptyimpl(scanIndexed)) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(q.m1693getSizeimpl(scanIndexed) + 1);
        arrayList.add(r8);
        int m1693getSizeimpl = q.m1693getSizeimpl(scanIndexed);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, p.m1626boximpl(q.m1692getpVg5ArA(scanIndexed, i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    /* renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m982shuffleajY9A(int[] shuffle) {
        s.checkNotNullParameter(shuffle, "$this$shuffle");
        m983shuffle2D5oskM(shuffle, Random.Default);
    }

    /* renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m983shuffle2D5oskM(int[] shuffle, Random random) {
        s.checkNotNullParameter(shuffle, "$this$shuffle");
        s.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            int m1692getpVg5ArA = q.m1692getpVg5ArA(shuffle, lastIndex);
            q.m1697setVXSXFK8(shuffle, lastIndex, q.m1692getpVg5ArA(shuffle, nextInt));
            q.m1697setVXSXFK8(shuffle, nextInt, m1692getpVg5ArA);
        }
    }

    /* renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m984shuffleGBYM_sE(byte[] shuffle) {
        s.checkNotNullParameter(shuffle, "$this$shuffle");
        m987shuffleoSF2wD8(shuffle, Random.Default);
    }

    /* renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m985shuffleJzugnMA(long[] shuffle, Random random) {
        s.checkNotNullParameter(shuffle, "$this$shuffle");
        s.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(shuffle, lastIndex);
            y5.s.m1775setk8EXiF4(shuffle, lastIndex, y5.s.m1770getsVKNKU(shuffle, nextInt));
            y5.s.m1775setk8EXiF4(shuffle, nextInt, m1770getsVKNKU);
        }
    }

    /* renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m986shuffleQwZRm1k(long[] shuffle) {
        s.checkNotNullParameter(shuffle, "$this$shuffle");
        m985shuffleJzugnMA(shuffle, Random.Default);
    }

    /* renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m987shuffleoSF2wD8(byte[] shuffle, Random random) {
        s.checkNotNullParameter(shuffle, "$this$shuffle");
        s.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(shuffle, lastIndex);
            o.m1619setVurrAj0(shuffle, lastIndex, o.m1614getw2LRezQ(shuffle, nextInt));
            o.m1619setVurrAj0(shuffle, nextInt, m1614getw2LRezQ);
        }
    }

    /* renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m988shufflerL5Bavg(short[] shuffle) {
        s.checkNotNullParameter(shuffle, "$this$shuffle");
        m989shuffles5X_as8(shuffle, Random.Default);
    }

    /* renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m989shuffles5X_as8(short[] shuffle, Random random) {
        s.checkNotNullParameter(shuffle, "$this$shuffle");
        s.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            short m1846getMh2AYeg = v.m1846getMh2AYeg(shuffle, lastIndex);
            v.m1851set01HTLdE(shuffle, lastIndex, v.m1846getMh2AYeg(shuffle, nextInt));
            v.m1851set01HTLdE(shuffle, nextInt, m1846getMh2AYeg);
        }
    }

    /* renamed from: single--ajY-9A, reason: not valid java name */
    private static final int m990singleajY9A(int[] single) {
        int single2;
        s.checkNotNullParameter(single, "$this$single");
        single2 = ArraysKt___ArraysKt.single(single);
        return p.m1632constructorimpl(single2);
    }

    /* renamed from: single-GBYM_sE, reason: not valid java name */
    private static final byte m991singleGBYM_sE(byte[] single) {
        byte single2;
        s.checkNotNullParameter(single, "$this$single");
        single2 = ArraysKt___ArraysKt.single(single);
        return n.m1556constructorimpl(single2);
    }

    /* renamed from: single-JOV_ifY, reason: not valid java name */
    private static final byte m992singleJOV_ifY(byte[] single, l predicate) {
        s.checkNotNullParameter(single, "$this$single");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(single);
        n nVar = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(single, i8);
            if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                if (z7) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                nVar = n.m1550boximpl(m1614getw2LRezQ);
                z7 = true;
            }
        }
        if (z7) {
            return nVar.m1606unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: single-MShoTSo, reason: not valid java name */
    private static final long m993singleMShoTSo(long[] single, l predicate) {
        s.checkNotNullParameter(single, "$this$single");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(single);
        r rVar = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(single, i8);
            if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                if (z7) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                rVar = r.m1704boximpl(m1770getsVKNKU);
                z7 = true;
            }
        }
        if (z7) {
            return rVar.m1762unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: single-QwZRm1k, reason: not valid java name */
    private static final long m994singleQwZRm1k(long[] single) {
        long single2;
        s.checkNotNullParameter(single, "$this$single");
        single2 = ArraysKt___ArraysKt.single(single);
        return r.m1710constructorimpl(single2);
    }

    /* renamed from: single-jgv0xPQ, reason: not valid java name */
    private static final int m995singlejgv0xPQ(int[] single, l predicate) {
        s.checkNotNullParameter(single, "$this$single");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(single);
        p pVar = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(single, i8);
            if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                if (z7) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                pVar = p.m1626boximpl(m1692getpVg5ArA);
                z7 = true;
            }
        }
        if (z7) {
            return pVar.m1684unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: single-rL5Bavg, reason: not valid java name */
    private static final short m996singlerL5Bavg(short[] single) {
        short single2;
        s.checkNotNullParameter(single, "$this$single");
        single2 = ArraysKt___ArraysKt.single(single);
        return u.m1788constructorimpl(single2);
    }

    /* renamed from: single-xTcfx_M, reason: not valid java name */
    private static final short m997singlexTcfx_M(short[] single, l predicate) {
        s.checkNotNullParameter(single, "$this$single");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(single);
        u uVar = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(single, i8);
            if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                if (z7) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uVar = u.m1782boximpl(m1846getMh2AYeg);
                z7 = true;
            }
        }
        if (z7) {
            return uVar.m1838unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final p m998singleOrNullajY9A(int[] singleOrNull) {
        s.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (q.m1693getSizeimpl(singleOrNull) == 1) {
            return p.m1626boximpl(q.m1692getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final n m999singleOrNullGBYM_sE(byte[] singleOrNull) {
        s.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (o.m1615getSizeimpl(singleOrNull) == 1) {
            return n.m1550boximpl(o.m1614getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-JOV_ifY, reason: not valid java name */
    private static final n m1000singleOrNullJOV_ifY(byte[] singleOrNull, l predicate) {
        s.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1615getSizeimpl = o.m1615getSizeimpl(singleOrNull);
        n nVar = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(singleOrNull, i8);
            if (((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                if (z7) {
                    return null;
                }
                nVar = n.m1550boximpl(m1614getw2LRezQ);
                z7 = true;
            }
        }
        if (z7) {
            return nVar;
        }
        return null;
    }

    /* renamed from: singleOrNull-MShoTSo, reason: not valid java name */
    private static final r m1001singleOrNullMShoTSo(long[] singleOrNull, l predicate) {
        s.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(singleOrNull);
        r rVar = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(singleOrNull, i8);
            if (((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                if (z7) {
                    return null;
                }
                rVar = r.m1704boximpl(m1770getsVKNKU);
                z7 = true;
            }
        }
        if (z7) {
            return rVar;
        }
        return null;
    }

    /* renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final r m1002singleOrNullQwZRm1k(long[] singleOrNull) {
        s.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (y5.s.m1771getSizeimpl(singleOrNull) == 1) {
            return r.m1704boximpl(y5.s.m1770getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-jgv0xPQ, reason: not valid java name */
    private static final p m1003singleOrNulljgv0xPQ(int[] singleOrNull, l predicate) {
        s.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1693getSizeimpl = q.m1693getSizeimpl(singleOrNull);
        p pVar = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(singleOrNull, i8);
            if (((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                if (z7) {
                    return null;
                }
                pVar = p.m1626boximpl(m1692getpVg5ArA);
                z7 = true;
            }
        }
        if (z7) {
            return pVar;
        }
        return null;
    }

    /* renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final u m1004singleOrNullrL5Bavg(short[] singleOrNull) {
        s.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (v.m1847getSizeimpl(singleOrNull) == 1) {
            return u.m1782boximpl(v.m1846getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-xTcfx_M, reason: not valid java name */
    private static final u m1005singleOrNullxTcfx_M(short[] singleOrNull, l predicate) {
        s.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        s.checkNotNullParameter(predicate, "predicate");
        int m1847getSizeimpl = v.m1847getSizeimpl(singleOrNull);
        u uVar = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(singleOrNull, i8);
            if (((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                if (z7) {
                    return null;
                }
                uVar = u.m1782boximpl(m1846getMh2AYeg);
                z7 = true;
            }
        }
        if (z7) {
            return uVar;
        }
        return null;
    }

    /* renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<r> m1006sliceF7u83W8(long[] slice, Iterable<Integer> indices) {
        s.checkNotNullParameter(slice, "$this$slice");
        s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(r.m1704boximpl(y5.s.m1770getsVKNKU(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<p> m1007sliceHwE9HBo(int[] slice, Iterable<Integer> indices) {
        s.checkNotNullParameter(slice, "$this$slice");
        s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(p.m1626boximpl(q.m1692getpVg5ArA(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<u> m1008sliceJGPC0M(short[] slice, Iterable<Integer> indices) {
        s.checkNotNullParameter(slice, "$this$slice");
        s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(u.m1782boximpl(v.m1846getMh2AYeg(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<n> m1009sliceJQknh5Q(byte[] slice, Iterable<Integer> indices) {
        s.checkNotNullParameter(slice, "$this$slice");
        s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(n.m1550boximpl(o.m1614getw2LRezQ(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<u> m1010sliceQ6IL4kU(short[] slice, m indices) {
        s.checkNotNullParameter(slice, "$this$slice");
        s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : b.m1133asListrL5Bavg(v.m1841constructorimpl(k.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<r> m1011sliceZRhS8yI(long[] slice, m indices) {
        s.checkNotNullParameter(slice, "$this$slice");
        s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : b.m1132asListQwZRm1k(y5.s.m1765constructorimpl(k.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<n> m1012slicec0bezYM(byte[] slice, m indices) {
        s.checkNotNullParameter(slice, "$this$slice");
        s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : b.m1131asListGBYM_sE(o.m1609constructorimpl(k.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<p> m1013slicetAntMlw(int[] slice, m indices) {
        s.checkNotNullParameter(slice, "$this$slice");
        s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : b.m1130asListajY9A(q.m1687constructorimpl(k.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m1014sliceArrayCFIt9YE(int[] sliceArray, Collection<Integer> indices) {
        int[] sliceArray2;
        s.checkNotNullParameter(sliceArray, "$this$sliceArray");
        s.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, (Collection<Integer>) indices);
        return q.m1687constructorimpl(sliceArray2);
    }

    /* renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m1015sliceArrayQ6IL4kU(short[] sliceArray, m indices) {
        short[] sliceArray2;
        s.checkNotNullParameter(sliceArray, "$this$sliceArray");
        s.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return v.m1841constructorimpl(sliceArray2);
    }

    /* renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m1016sliceArrayZRhS8yI(long[] sliceArray, m indices) {
        long[] sliceArray2;
        s.checkNotNullParameter(sliceArray, "$this$sliceArray");
        s.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return y5.s.m1765constructorimpl(sliceArray2);
    }

    /* renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m1017sliceArrayc0bezYM(byte[] sliceArray, m indices) {
        byte[] sliceArray2;
        s.checkNotNullParameter(sliceArray, "$this$sliceArray");
        s.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return o.m1609constructorimpl(sliceArray2);
    }

    /* renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m1018sliceArraykzHmqpY(long[] sliceArray, Collection<Integer> indices) {
        long[] sliceArray2;
        s.checkNotNullParameter(sliceArray, "$this$sliceArray");
        s.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, (Collection<Integer>) indices);
        return y5.s.m1765constructorimpl(sliceArray2);
    }

    /* renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m1019sliceArrayojwP5H8(short[] sliceArray, Collection<Integer> indices) {
        short[] sliceArray2;
        s.checkNotNullParameter(sliceArray, "$this$sliceArray");
        s.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, (Collection<Integer>) indices);
        return v.m1841constructorimpl(sliceArray2);
    }

    /* renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m1020sliceArraytAntMlw(int[] sliceArray, m indices) {
        int[] sliceArray2;
        s.checkNotNullParameter(sliceArray, "$this$sliceArray");
        s.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, indices);
        return q.m1687constructorimpl(sliceArray2);
    }

    /* renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m1021sliceArrayxo_DsdI(byte[] sliceArray, Collection<Integer> indices) {
        byte[] sliceArray2;
        s.checkNotNullParameter(sliceArray, "$this$sliceArray");
        s.checkNotNullParameter(indices, "indices");
        sliceArray2 = ArraysKt___ArraysKt.sliceArray(sliceArray, (Collection<Integer>) indices);
        return o.m1609constructorimpl(sliceArray2);
    }

    /* renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m1022sortajY9A(int[] sort) {
        s.checkNotNullParameter(sort, "$this$sort");
        if (q.m1693getSizeimpl(sort) > 1) {
            a1.m457sortArrayoBK06Vg(sort, 0, q.m1693getSizeimpl(sort));
        }
    }

    /* renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m1023sortnroSd4(long[] sort, int i8, int i9) {
        s.checkNotNullParameter(sort, "$this$sort");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, y5.s.m1771getSizeimpl(sort));
        a1.m454sortArraynroSd4(sort, i8, i9);
    }

    /* renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m1024sortnroSd4$default(long[] jArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = y5.s.m1771getSizeimpl(jArr);
        }
        m1023sortnroSd4(jArr, i8, i9);
    }

    /* renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m1025sort4UcCI2c(byte[] sort, int i8, int i9) {
        s.checkNotNullParameter(sort, "$this$sort");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, o.m1615getSizeimpl(sort));
        a1.m455sortArray4UcCI2c(sort, i8, i9);
    }

    /* renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m1026sort4UcCI2c$default(byte[] bArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = o.m1615getSizeimpl(bArr);
        }
        m1025sort4UcCI2c(bArr, i8, i9);
    }

    /* renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m1027sortAa5vz7o(short[] sort, int i8, int i9) {
        s.checkNotNullParameter(sort, "$this$sort");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, v.m1847getSizeimpl(sort));
        a1.m456sortArrayAa5vz7o(sort, i8, i9);
    }

    /* renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m1028sortAa5vz7o$default(short[] sArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = v.m1847getSizeimpl(sArr);
        }
        m1027sortAa5vz7o(sArr, i8, i9);
    }

    /* renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m1029sortGBYM_sE(byte[] sort) {
        s.checkNotNullParameter(sort, "$this$sort");
        if (o.m1615getSizeimpl(sort) > 1) {
            a1.m455sortArray4UcCI2c(sort, 0, o.m1615getSizeimpl(sort));
        }
    }

    /* renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m1030sortQwZRm1k(long[] sort) {
        s.checkNotNullParameter(sort, "$this$sort");
        if (y5.s.m1771getSizeimpl(sort) > 1) {
            a1.m454sortArraynroSd4(sort, 0, y5.s.m1771getSizeimpl(sort));
        }
    }

    /* renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m1031sortoBK06Vg(int[] sort, int i8, int i9) {
        s.checkNotNullParameter(sort, "$this$sort");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, q.m1693getSizeimpl(sort));
        a1.m457sortArrayoBK06Vg(sort, i8, i9);
    }

    /* renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m1032sortoBK06Vg$default(int[] iArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = q.m1693getSizeimpl(iArr);
        }
        m1031sortoBK06Vg(iArr, i8, i9);
    }

    /* renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m1033sortrL5Bavg(short[] sort) {
        s.checkNotNullParameter(sort, "$this$sort");
        if (v.m1847getSizeimpl(sort) > 1) {
            a1.m456sortArrayAa5vz7o(sort, 0, v.m1847getSizeimpl(sort));
        }
    }

    /* renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m1034sortDescendingajY9A(int[] sortDescending) {
        s.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (q.m1693getSizeimpl(sortDescending) > 1) {
            m1022sortajY9A(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m1035sortDescendingnroSd4(long[] sortDescending, int i8, int i9) {
        s.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1023sortnroSd4(sortDescending, i8, i9);
        ArraysKt___ArraysKt.reverse(sortDescending, i8, i9);
    }

    /* renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m1036sortDescending4UcCI2c(byte[] sortDescending, int i8, int i9) {
        s.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1025sort4UcCI2c(sortDescending, i8, i9);
        ArraysKt___ArraysKt.reverse(sortDescending, i8, i9);
    }

    /* renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m1037sortDescendingAa5vz7o(short[] sortDescending, int i8, int i9) {
        s.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1027sortAa5vz7o(sortDescending, i8, i9);
        ArraysKt___ArraysKt.reverse(sortDescending, i8, i9);
    }

    /* renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m1038sortDescendingGBYM_sE(byte[] sortDescending) {
        s.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (o.m1615getSizeimpl(sortDescending) > 1) {
            m1029sortGBYM_sE(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m1039sortDescendingQwZRm1k(long[] sortDescending) {
        s.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (y5.s.m1771getSizeimpl(sortDescending) > 1) {
            m1030sortQwZRm1k(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m1040sortDescendingoBK06Vg(int[] sortDescending, int i8, int i9) {
        s.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1031sortoBK06Vg(sortDescending, i8, i9);
        ArraysKt___ArraysKt.reverse(sortDescending, i8, i9);
    }

    /* renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m1041sortDescendingrL5Bavg(short[] sortDescending) {
        s.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (v.m1847getSizeimpl(sortDescending) > 1) {
            m1033sortrL5Bavg(sortDescending);
            ArraysKt___ArraysKt.reverse(sortDescending);
        }
    }

    /* renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<p> m1042sortedajY9A(int[] sorted) {
        s.checkNotNullParameter(sorted, "$this$sorted");
        int[] copyOf = Arrays.copyOf(sorted, sorted.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m1687constructorimpl = q.m1687constructorimpl(copyOf);
        m1022sortajY9A(m1687constructorimpl);
        return b.m1130asListajY9A(m1687constructorimpl);
    }

    /* renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<n> m1043sortedGBYM_sE(byte[] sorted) {
        s.checkNotNullParameter(sorted, "$this$sorted");
        byte[] copyOf = Arrays.copyOf(sorted, sorted.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m1609constructorimpl = o.m1609constructorimpl(copyOf);
        m1029sortGBYM_sE(m1609constructorimpl);
        return b.m1131asListGBYM_sE(m1609constructorimpl);
    }

    /* renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<r> m1044sortedQwZRm1k(long[] sorted) {
        s.checkNotNullParameter(sorted, "$this$sorted");
        long[] copyOf = Arrays.copyOf(sorted, sorted.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m1765constructorimpl = y5.s.m1765constructorimpl(copyOf);
        m1030sortQwZRm1k(m1765constructorimpl);
        return b.m1132asListQwZRm1k(m1765constructorimpl);
    }

    /* renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<u> m1045sortedrL5Bavg(short[] sorted) {
        s.checkNotNullParameter(sorted, "$this$sorted");
        short[] copyOf = Arrays.copyOf(sorted, sorted.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m1841constructorimpl = v.m1841constructorimpl(copyOf);
        m1033sortrL5Bavg(m1841constructorimpl);
        return b.m1133asListrL5Bavg(m1841constructorimpl);
    }

    /* renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m1046sortedArrayajY9A(int[] sortedArray) {
        s.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (q.m1695isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m1687constructorimpl = q.m1687constructorimpl(copyOf);
        m1022sortajY9A(m1687constructorimpl);
        return m1687constructorimpl;
    }

    /* renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m1047sortedArrayGBYM_sE(byte[] sortedArray) {
        s.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (o.m1617isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m1609constructorimpl = o.m1609constructorimpl(copyOf);
        m1029sortGBYM_sE(m1609constructorimpl);
        return m1609constructorimpl;
    }

    /* renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m1048sortedArrayQwZRm1k(long[] sortedArray) {
        s.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (y5.s.m1773isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m1765constructorimpl = y5.s.m1765constructorimpl(copyOf);
        m1030sortQwZRm1k(m1765constructorimpl);
        return m1765constructorimpl;
    }

    /* renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m1049sortedArrayrL5Bavg(short[] sortedArray) {
        s.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (v.m1849isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m1841constructorimpl = v.m1841constructorimpl(copyOf);
        m1033sortrL5Bavg(m1841constructorimpl);
        return m1841constructorimpl;
    }

    /* renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m1050sortedArrayDescendingajY9A(int[] sortedArrayDescending) {
        s.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (q.m1695isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m1687constructorimpl = q.m1687constructorimpl(copyOf);
        m1034sortDescendingajY9A(m1687constructorimpl);
        return m1687constructorimpl;
    }

    /* renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m1051sortedArrayDescendingGBYM_sE(byte[] sortedArrayDescending) {
        s.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (o.m1617isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m1609constructorimpl = o.m1609constructorimpl(copyOf);
        m1038sortDescendingGBYM_sE(m1609constructorimpl);
        return m1609constructorimpl;
    }

    /* renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m1052sortedArrayDescendingQwZRm1k(long[] sortedArrayDescending) {
        s.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (y5.s.m1773isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m1765constructorimpl = y5.s.m1765constructorimpl(copyOf);
        m1039sortDescendingQwZRm1k(m1765constructorimpl);
        return m1765constructorimpl;
    }

    /* renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m1053sortedArrayDescendingrL5Bavg(short[] sortedArrayDescending) {
        s.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (v.m1849isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m1841constructorimpl = v.m1841constructorimpl(copyOf);
        m1041sortDescendingrL5Bavg(m1841constructorimpl);
        return m1841constructorimpl;
    }

    /* renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<p> m1054sortedDescendingajY9A(int[] sortedDescending) {
        s.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m1687constructorimpl = q.m1687constructorimpl(copyOf);
        m1022sortajY9A(m1687constructorimpl);
        return m950reversedajY9A(m1687constructorimpl);
    }

    /* renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<n> m1055sortedDescendingGBYM_sE(byte[] sortedDescending) {
        s.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m1609constructorimpl = o.m1609constructorimpl(copyOf);
        m1029sortGBYM_sE(m1609constructorimpl);
        return m951reversedGBYM_sE(m1609constructorimpl);
    }

    /* renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<r> m1056sortedDescendingQwZRm1k(long[] sortedDescending) {
        s.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m1765constructorimpl = y5.s.m1765constructorimpl(copyOf);
        m1030sortQwZRm1k(m1765constructorimpl);
        return m952reversedQwZRm1k(m1765constructorimpl);
    }

    /* renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<u> m1057sortedDescendingrL5Bavg(short[] sortedDescending) {
        s.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m1841constructorimpl = v.m1841constructorimpl(copyOf);
        m1033sortrL5Bavg(m1841constructorimpl);
        return m953reversedrL5Bavg(m1841constructorimpl);
    }

    /* renamed from: sum--ajY-9A, reason: not valid java name */
    private static final int m1058sumajY9A(int[] sum) {
        int sum2;
        s.checkNotNullParameter(sum, "$this$sum");
        sum2 = ArraysKt___ArraysKt.sum(sum);
        return p.m1632constructorimpl(sum2);
    }

    /* renamed from: sum-GBYM_sE, reason: not valid java name */
    private static final int m1059sumGBYM_sE(byte[] sum) {
        s.checkNotNullParameter(sum, "$this$sum");
        int m1632constructorimpl = p.m1632constructorimpl(0);
        int m1615getSizeimpl = o.m1615getSizeimpl(sum);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            m1632constructorimpl = p.m1632constructorimpl(m1632constructorimpl + p.m1632constructorimpl(o.m1614getw2LRezQ(sum, i8) & 255));
        }
        return m1632constructorimpl;
    }

    /* renamed from: sum-QwZRm1k, reason: not valid java name */
    private static final long m1060sumQwZRm1k(long[] sum) {
        long sum2;
        s.checkNotNullParameter(sum, "$this$sum");
        sum2 = ArraysKt___ArraysKt.sum(sum);
        return r.m1710constructorimpl(sum2);
    }

    /* renamed from: sum-rL5Bavg, reason: not valid java name */
    private static final int m1061sumrL5Bavg(short[] sum) {
        s.checkNotNullParameter(sum, "$this$sum");
        int m1632constructorimpl = p.m1632constructorimpl(0);
        int m1847getSizeimpl = v.m1847getSizeimpl(sum);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            m1632constructorimpl = p.m1632constructorimpl(m1632constructorimpl + p.m1632constructorimpl(v.m1846getMh2AYeg(sum, i8) & u.MAX_VALUE));
        }
        return m1632constructorimpl;
    }

    /* renamed from: sumBy-JOV_ifY, reason: not valid java name */
    private static final int m1062sumByJOV_ifY(byte[] sumBy, l selector) {
        s.checkNotNullParameter(sumBy, "$this$sumBy");
        s.checkNotNullParameter(selector, "selector");
        int m1615getSizeimpl = o.m1615getSizeimpl(sumBy);
        int i8 = 0;
        for (int i9 = 0; i9 < m1615getSizeimpl; i9++) {
            i8 = p.m1632constructorimpl(i8 + ((p) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumBy, i9)))).m1684unboximpl());
        }
        return i8;
    }

    /* renamed from: sumBy-MShoTSo, reason: not valid java name */
    private static final int m1063sumByMShoTSo(long[] sumBy, l selector) {
        s.checkNotNullParameter(sumBy, "$this$sumBy");
        s.checkNotNullParameter(selector, "selector");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(sumBy);
        int i8 = 0;
        for (int i9 = 0; i9 < m1771getSizeimpl; i9++) {
            i8 = p.m1632constructorimpl(i8 + ((p) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(sumBy, i9)))).m1684unboximpl());
        }
        return i8;
    }

    /* renamed from: sumBy-jgv0xPQ, reason: not valid java name */
    private static final int m1064sumByjgv0xPQ(int[] sumBy, l selector) {
        s.checkNotNullParameter(sumBy, "$this$sumBy");
        s.checkNotNullParameter(selector, "selector");
        int m1693getSizeimpl = q.m1693getSizeimpl(sumBy);
        int i8 = 0;
        for (int i9 = 0; i9 < m1693getSizeimpl; i9++) {
            i8 = p.m1632constructorimpl(i8 + ((p) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumBy, i9)))).m1684unboximpl());
        }
        return i8;
    }

    /* renamed from: sumBy-xTcfx_M, reason: not valid java name */
    private static final int m1065sumByxTcfx_M(short[] sumBy, l selector) {
        s.checkNotNullParameter(sumBy, "$this$sumBy");
        s.checkNotNullParameter(selector, "selector");
        int m1847getSizeimpl = v.m1847getSizeimpl(sumBy);
        int i8 = 0;
        for (int i9 = 0; i9 < m1847getSizeimpl; i9++) {
            i8 = p.m1632constructorimpl(i8 + ((p) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumBy, i9)))).m1684unboximpl());
        }
        return i8;
    }

    /* renamed from: sumByDouble-JOV_ifY, reason: not valid java name */
    private static final double m1066sumByDoubleJOV_ifY(byte[] sumByDouble, l selector) {
        s.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        s.checkNotNullParameter(selector, "selector");
        int m1615getSizeimpl = o.m1615getSizeimpl(sumByDouble);
        double d8 = i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            d8 += ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumByDouble, i8)))).doubleValue();
        }
        return d8;
    }

    /* renamed from: sumByDouble-MShoTSo, reason: not valid java name */
    private static final double m1067sumByDoubleMShoTSo(long[] sumByDouble, l selector) {
        s.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        s.checkNotNullParameter(selector, "selector");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(sumByDouble);
        double d8 = i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            d8 += ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(sumByDouble, i8)))).doubleValue();
        }
        return d8;
    }

    /* renamed from: sumByDouble-jgv0xPQ, reason: not valid java name */
    private static final double m1068sumByDoublejgv0xPQ(int[] sumByDouble, l selector) {
        s.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        s.checkNotNullParameter(selector, "selector");
        int m1693getSizeimpl = q.m1693getSizeimpl(sumByDouble);
        double d8 = i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            d8 += ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumByDouble, i8)))).doubleValue();
        }
        return d8;
    }

    /* renamed from: sumByDouble-xTcfx_M, reason: not valid java name */
    private static final double m1069sumByDoublexTcfx_M(short[] sumByDouble, l selector) {
        s.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        s.checkNotNullParameter(selector, "selector");
        int m1847getSizeimpl = v.m1847getSizeimpl(sumByDouble);
        double d8 = i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            d8 += ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumByDouble, i8)))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(int[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1693getSizeimpl = q.m1693getSizeimpl(sumOf);
        double d8 = i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            d8 += ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumOf, i8)))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(int[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1693getSizeimpl = q.m1693getSizeimpl(sumOf);
        int i8 = 0;
        for (int i9 = 0; i9 < m1693getSizeimpl; i9++) {
            i8 += ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumOf, i9)))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(int[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1693getSizeimpl = q.m1693getSizeimpl(sumOf);
        long j8 = 0;
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            j8 += ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumOf, i8)))).longValue();
        }
        return j8;
    }

    public static final int sumOfUByte(n[] nVarArr) {
        s.checkNotNullParameter(nVarArr, "<this>");
        int i8 = 0;
        for (n nVar : nVarArr) {
            i8 = p.m1632constructorimpl(i8 + p.m1632constructorimpl(nVar.m1606unboximpl() & 255));
        }
        return i8;
    }

    private static final int sumOfUInt(int[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = p.m1632constructorimpl(0);
        int m1693getSizeimpl = q.m1693getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            m1632constructorimpl = p.m1632constructorimpl(m1632constructorimpl + ((p) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumOf, i8)))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(int[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = r.m1710constructorimpl(0L);
        int m1693getSizeimpl = q.m1693getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            m1710constructorimpl = r.m1710constructorimpl(m1710constructorimpl + ((r) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumOf, i8)))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final int sumOfUShort(u[] uVarArr) {
        s.checkNotNullParameter(uVarArr, "<this>");
        int i8 = 0;
        for (u uVar : uVarArr) {
            i8 = p.m1632constructorimpl(i8 + p.m1632constructorimpl(uVar.m1838unboximpl() & u.MAX_VALUE));
        }
        return i8;
    }

    /* renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<n> m1070takePpDY95g(byte[] take, int i8) {
        s.checkNotNullParameter(take, "$this$take");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= o.m1615getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(o.m1607boximpl(take));
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(n.m1550boximpl(o.m1614getw2LRezQ(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i8);
        int m1615getSizeimpl = o.m1615getSizeimpl(take);
        int i9 = 0;
        for (int i10 = 0; i10 < m1615getSizeimpl; i10++) {
            arrayList.add(n.m1550boximpl(o.m1614getw2LRezQ(take, i10)));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<u> m1071takenggk6HY(short[] take, int i8) {
        s.checkNotNullParameter(take, "$this$take");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= v.m1847getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(v.m1839boximpl(take));
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(u.m1782boximpl(v.m1846getMh2AYeg(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i8);
        int m1847getSizeimpl = v.m1847getSizeimpl(take);
        int i9 = 0;
        for (int i10 = 0; i10 < m1847getSizeimpl; i10++) {
            arrayList.add(u.m1782boximpl(v.m1846getMh2AYeg(take, i10)));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<p> m1072takeqFRl0hI(int[] take, int i8) {
        s.checkNotNullParameter(take, "$this$take");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= q.m1693getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(q.m1685boximpl(take));
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(p.m1626boximpl(q.m1692getpVg5ArA(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i8);
        int m1693getSizeimpl = q.m1693getSizeimpl(take);
        int i9 = 0;
        for (int i10 = 0; i10 < m1693getSizeimpl; i10++) {
            arrayList.add(p.m1626boximpl(q.m1692getpVg5ArA(take, i10)));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<r> m1073taker7IrZao(long[] take, int i8) {
        s.checkNotNullParameter(take, "$this$take");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i8 >= y5.s.m1771getSizeimpl(take)) {
            return CollectionsKt___CollectionsKt.toList(y5.s.m1763boximpl(take));
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(r.m1704boximpl(y5.s.m1770getsVKNKU(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i8);
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(take);
        int i9 = 0;
        for (int i10 = 0; i10 < m1771getSizeimpl; i10++) {
            arrayList.add(r.m1704boximpl(y5.s.m1770getsVKNKU(take, i10)));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<n> m1074takeLastPpDY95g(byte[] takeLast, int i8) {
        s.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int m1615getSizeimpl = o.m1615getSizeimpl(takeLast);
        if (i8 >= m1615getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(o.m1607boximpl(takeLast));
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(n.m1550boximpl(o.m1614getw2LRezQ(takeLast, m1615getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = m1615getSizeimpl - i8; i9 < m1615getSizeimpl; i9++) {
            arrayList.add(n.m1550boximpl(o.m1614getw2LRezQ(takeLast, i9)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<u> m1075takeLastnggk6HY(short[] takeLast, int i8) {
        s.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int m1847getSizeimpl = v.m1847getSizeimpl(takeLast);
        if (i8 >= m1847getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(v.m1839boximpl(takeLast));
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(u.m1782boximpl(v.m1846getMh2AYeg(takeLast, m1847getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = m1847getSizeimpl - i8; i9 < m1847getSizeimpl; i9++) {
            arrayList.add(u.m1782boximpl(v.m1846getMh2AYeg(takeLast, i9)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<p> m1076takeLastqFRl0hI(int[] takeLast, int i8) {
        s.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int m1693getSizeimpl = q.m1693getSizeimpl(takeLast);
        if (i8 >= m1693getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(q.m1685boximpl(takeLast));
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(p.m1626boximpl(q.m1692getpVg5ArA(takeLast, m1693getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = m1693getSizeimpl - i8; i9 < m1693getSizeimpl; i9++) {
            arrayList.add(p.m1626boximpl(q.m1692getpVg5ArA(takeLast, i9)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<r> m1077takeLastr7IrZao(long[] takeLast, int i8) {
        s.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(takeLast);
        if (i8 >= m1771getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(y5.s.m1763boximpl(takeLast));
        }
        if (i8 == 1) {
            return kotlin.collections.q.listOf(r.m1704boximpl(y5.s.m1770getsVKNKU(takeLast, m1771getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = m1771getSizeimpl - i8; i9 < m1771getSizeimpl; i9++) {
            arrayList.add(r.m1704boximpl(y5.s.m1770getsVKNKU(takeLast, i9)));
        }
        return arrayList;
    }

    /* renamed from: takeLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<n> m1078takeLastWhileJOV_ifY(byte[] takeLastWhile, l predicate) {
        s.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(n.m1550boximpl(o.m1614getw2LRezQ(takeLastWhile, lastIndex)))).booleanValue()) {
                return m546dropPpDY95g(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(o.m1607boximpl(takeLastWhile));
    }

    /* renamed from: takeLastWhile-MShoTSo, reason: not valid java name */
    private static final List<r> m1079takeLastWhileMShoTSo(long[] takeLastWhile, l predicate) {
        s.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(takeLastWhile, lastIndex)))).booleanValue()) {
                return m549dropr7IrZao(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(y5.s.m1763boximpl(takeLastWhile));
    }

    /* renamed from: takeLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<p> m1080takeLastWhilejgv0xPQ(int[] takeLastWhile, l predicate) {
        s.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(p.m1626boximpl(q.m1692getpVg5ArA(takeLastWhile, lastIndex)))).booleanValue()) {
                return m548dropqFRl0hI(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(q.m1685boximpl(takeLastWhile));
    }

    /* renamed from: takeLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<u> m1081takeLastWhilexTcfx_M(short[] takeLastWhile, l predicate) {
        s.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(u.m1782boximpl(v.m1846getMh2AYeg(takeLastWhile, lastIndex)))).booleanValue()) {
                return m547dropnggk6HY(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt___CollectionsKt.toList(v.m1839boximpl(takeLastWhile));
    }

    /* renamed from: takeWhile-JOV_ifY, reason: not valid java name */
    private static final List<n> m1082takeWhileJOV_ifY(byte[] takeWhile, l predicate) {
        s.checkNotNullParameter(takeWhile, "$this$takeWhile");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1615getSizeimpl = o.m1615getSizeimpl(takeWhile);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(takeWhile, i8);
            if (!((Boolean) predicate.invoke(n.m1550boximpl(m1614getw2LRezQ))).booleanValue()) {
                break;
            }
            arrayList.add(n.m1550boximpl(m1614getw2LRezQ));
        }
        return arrayList;
    }

    /* renamed from: takeWhile-MShoTSo, reason: not valid java name */
    private static final List<r> m1083takeWhileMShoTSo(long[] takeWhile, l predicate) {
        s.checkNotNullParameter(takeWhile, "$this$takeWhile");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(takeWhile);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(takeWhile, i8);
            if (!((Boolean) predicate.invoke(r.m1704boximpl(m1770getsVKNKU))).booleanValue()) {
                break;
            }
            arrayList.add(r.m1704boximpl(m1770getsVKNKU));
        }
        return arrayList;
    }

    /* renamed from: takeWhile-jgv0xPQ, reason: not valid java name */
    private static final List<p> m1084takeWhilejgv0xPQ(int[] takeWhile, l predicate) {
        s.checkNotNullParameter(takeWhile, "$this$takeWhile");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1693getSizeimpl = q.m1693getSizeimpl(takeWhile);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(takeWhile, i8);
            if (!((Boolean) predicate.invoke(p.m1626boximpl(m1692getpVg5ArA))).booleanValue()) {
                break;
            }
            arrayList.add(p.m1626boximpl(m1692getpVg5ArA));
        }
        return arrayList;
    }

    /* renamed from: takeWhile-xTcfx_M, reason: not valid java name */
    private static final List<u> m1085takeWhilexTcfx_M(short[] takeWhile, l predicate) {
        s.checkNotNullParameter(takeWhile, "$this$takeWhile");
        s.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m1847getSizeimpl = v.m1847getSizeimpl(takeWhile);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(takeWhile, i8);
            if (!((Boolean) predicate.invoke(u.m1782boximpl(m1846getMh2AYeg))).booleanValue()) {
                break;
            }
            arrayList.add(u.m1782boximpl(m1846getMh2AYeg));
        }
        return arrayList;
    }

    /* renamed from: toByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m1086toByteArrayGBYM_sE(byte[] toByteArray) {
        s.checkNotNullParameter(toByteArray, "$this$toByteArray");
        byte[] copyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: toIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m1087toIntArrayajY9A(int[] toIntArray) {
        s.checkNotNullParameter(toIntArray, "$this$toIntArray");
        int[] copyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: toLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m1088toLongArrayQwZRm1k(long[] toLongArray) {
        s.checkNotNullParameter(toLongArray, "$this$toLongArray");
        long[] copyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: toShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m1089toShortArrayrL5Bavg(short[] toShortArray) {
        s.checkNotNullParameter(toShortArray, "$this$toShortArray");
        short[] copyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final p[] m1090toTypedArrayajY9A(int[] toTypedArray) {
        s.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m1693getSizeimpl = q.m1693getSizeimpl(toTypedArray);
        p[] pVarArr = new p[m1693getSizeimpl];
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            pVarArr[i8] = p.m1626boximpl(q.m1692getpVg5ArA(toTypedArray, i8));
        }
        return pVarArr;
    }

    /* renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final n[] m1091toTypedArrayGBYM_sE(byte[] toTypedArray) {
        s.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m1615getSizeimpl = o.m1615getSizeimpl(toTypedArray);
        n[] nVarArr = new n[m1615getSizeimpl];
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            nVarArr[i8] = n.m1550boximpl(o.m1614getw2LRezQ(toTypedArray, i8));
        }
        return nVarArr;
    }

    /* renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final r[] m1092toTypedArrayQwZRm1k(long[] toTypedArray) {
        s.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(toTypedArray);
        r[] rVarArr = new r[m1771getSizeimpl];
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            rVarArr[i8] = r.m1704boximpl(y5.s.m1770getsVKNKU(toTypedArray, i8));
        }
        return rVarArr;
    }

    /* renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final u[] m1093toTypedArrayrL5Bavg(short[] toTypedArray) {
        s.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m1847getSizeimpl = v.m1847getSizeimpl(toTypedArray);
        u[] uVarArr = new u[m1847getSizeimpl];
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            uVarArr[i8] = u.m1782boximpl(v.m1846getMh2AYeg(toTypedArray, i8));
        }
        return uVarArr;
    }

    public static final byte[] toUByteArray(n[] nVarArr) {
        s.checkNotNullParameter(nVarArr, "<this>");
        int length = nVarArr.length;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr[i8] = nVarArr[i8].m1606unboximpl();
        }
        return o.m1609constructorimpl(bArr);
    }

    public static final int[] toUIntArray(p[] pVarArr) {
        s.checkNotNullParameter(pVarArr, "<this>");
        int length = pVarArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = pVarArr[i8].m1684unboximpl();
        }
        return q.m1687constructorimpl(iArr);
    }

    public static final long[] toULongArray(r[] rVarArr) {
        s.checkNotNullParameter(rVarArr, "<this>");
        int length = rVarArr.length;
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            jArr[i8] = rVarArr[i8].m1762unboximpl();
        }
        return y5.s.m1765constructorimpl(jArr);
    }

    public static final short[] toUShortArray(u[] uVarArr) {
        s.checkNotNullParameter(uVarArr, "<this>");
        int length = uVarArr.length;
        short[] sArr = new short[length];
        for (int i8 = 0; i8 < length; i8++) {
            sArr[i8] = uVarArr[i8].m1838unboximpl();
        }
        return v.m1841constructorimpl(sArr);
    }

    /* renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<c0> m1094withIndexajY9A(final int[] withIndex) {
        s.checkNotNullParameter(withIndex, "$this$withIndex");
        return new d0(new f6.a() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<p> invoke() {
                return q.m1696iteratorimpl(withIndex);
            }
        });
    }

    /* renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<c0> m1095withIndexGBYM_sE(final byte[] withIndex) {
        s.checkNotNullParameter(withIndex, "$this$withIndex");
        return new d0(new f6.a() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<n> invoke() {
                return o.m1618iteratorimpl(withIndex);
            }
        });
    }

    /* renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<c0> m1096withIndexQwZRm1k(final long[] withIndex) {
        s.checkNotNullParameter(withIndex, "$this$withIndex");
        return new d0(new f6.a() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<r> invoke() {
                return y5.s.m1774iteratorimpl(withIndex);
            }
        });
    }

    /* renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<c0> m1097withIndexrL5Bavg(final short[] withIndex) {
        s.checkNotNullParameter(withIndex, "$this$withIndex");
        return new d0(new f6.a() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<u> invoke() {
                return v.m1850iteratorimpl(withIndex);
            }
        });
    }

    /* renamed from: zip-7znnbtw, reason: not valid java name */
    private static final <R, V> List<V> m1098zip7znnbtw(int[] zip, Iterable<? extends R> other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int m1693getSizeimpl = q.m1693getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), m1693getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= m1693getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(p.m1626boximpl(q.m1692getpVg5ArA(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-8LME4QE, reason: not valid java name */
    private static final <R, V> List<V> m1099zip8LME4QE(long[] zip, R[] other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int min = Math.min(y5.s.m1771getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(zip, i8)), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<Pair<p, R>> m1100zipCE_24M(int[] zip, R[] other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(q.m1693getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            int m1692getpVg5ArA = q.m1692getpVg5ArA(zip, i8);
            arrayList.add(h.to(p.m1626boximpl(m1692getpVg5ArA), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<Pair<r, R>> m1101zipF7u83W8(long[] zip, Iterable<? extends R> other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), m1771getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= m1771getSizeimpl) {
                break;
            }
            arrayList.add(h.to(r.m1704boximpl(y5.s.m1770getsVKNKU(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<Pair<p, R>> m1102zipHwE9HBo(int[] zip, Iterable<? extends R> other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int m1693getSizeimpl = q.m1693getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), m1693getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= m1693getSizeimpl) {
                break;
            }
            arrayList.add(h.to(p.m1626boximpl(q.m1692getpVg5ArA(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-JAKpvQM, reason: not valid java name */
    private static final <V> List<V> m1103zipJAKpvQM(byte[] zip, byte[] other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int min = Math.min(o.m1615getSizeimpl(zip), o.m1615getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(n.m1550boximpl(o.m1614getw2LRezQ(zip, i8)), n.m1550boximpl(o.m1614getw2LRezQ(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<Pair<u, R>> m1104zipJGPC0M(short[] zip, Iterable<? extends R> other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int m1847getSizeimpl = v.m1847getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), m1847getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= m1847getSizeimpl) {
                break;
            }
            arrayList.add(h.to(u.m1782boximpl(v.m1846getMh2AYeg(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<Pair<n, R>> m1105zipJQknh5Q(byte[] zip, Iterable<? extends R> other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int m1615getSizeimpl = o.m1615getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), m1615getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= m1615getSizeimpl) {
                break;
            }
            arrayList.add(h.to(n.m1550boximpl(o.m1614getw2LRezQ(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-L83TJbI, reason: not valid java name */
    private static final <V> List<V> m1106zipL83TJbI(int[] zip, int[] other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int min = Math.min(q.m1693getSizeimpl(zip), q.m1693getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(p.m1626boximpl(q.m1692getpVg5ArA(zip, i8)), p.m1626boximpl(q.m1692getpVg5ArA(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-LuipOMY, reason: not valid java name */
    private static final <R, V> List<V> m1107zipLuipOMY(byte[] zip, R[] other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int min = Math.min(o.m1615getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(n.m1550boximpl(o.m1614getw2LRezQ(zip, i8)), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-PabeH-Q, reason: not valid java name */
    private static final <V> List<V> m1108zipPabeHQ(long[] zip, long[] other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int min = Math.min(y5.s.m1771getSizeimpl(zip), y5.s.m1771getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(zip, i8)), r.m1704boximpl(y5.s.m1770getsVKNKU(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-TUPTUsU, reason: not valid java name */
    private static final <R, V> List<V> m1109zipTUPTUsU(long[] zip, Iterable<? extends R> other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), m1771getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= m1771getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-UCnP4_w, reason: not valid java name */
    private static final <R, V> List<V> m1110zipUCnP4_w(byte[] zip, Iterable<? extends R> other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int m1615getSizeimpl = o.m1615getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), m1615getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= m1615getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(n.m1550boximpl(o.m1614getw2LRezQ(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-ZjwqOic, reason: not valid java name */
    private static final <R, V> List<V> m1111zipZjwqOic(int[] zip, R[] other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int min = Math.min(q.m1693getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(p.m1626boximpl(q.m1692getpVg5ArA(zip, i8)), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<Pair<p, p>> m1112zipctEhBpI(int[] zip, int[] other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(q.m1693getSizeimpl(zip), q.m1693getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(h.to(p.m1626boximpl(q.m1692getpVg5ArA(zip, i8)), p.m1626boximpl(q.m1692getpVg5ArA(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-ePBmRWY, reason: not valid java name */
    private static final <R, V> List<V> m1113zipePBmRWY(short[] zip, R[] other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int min = Math.min(v.m1847getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(u.m1782boximpl(v.m1846getMh2AYeg(zip, i8)), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<Pair<r, R>> m1114zipf7H3mmw(long[] zip, R[] other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(y5.s.m1771getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(zip, i8);
            arrayList.add(h.to(r.m1704boximpl(m1770getsVKNKU), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-gVVukQo, reason: not valid java name */
    private static final <V> List<V> m1115zipgVVukQo(short[] zip, short[] other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int min = Math.min(v.m1847getSizeimpl(zip), v.m1847getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(u.m1782boximpl(v.m1846getMh2AYeg(zip, i8)), u.m1782boximpl(v.m1846getMh2AYeg(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-kBb4a-s, reason: not valid java name */
    private static final <R, V> List<V> m1116zipkBb4as(short[] zip, Iterable<? extends R> other, f6.p transform) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        s.checkNotNullParameter(transform, "transform");
        int m1847getSizeimpl = v.m1847getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.collectionSizeOrDefault(other, 10), m1847getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= m1847getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(u.m1782boximpl(v.m1846getMh2AYeg(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<Pair<n, n>> m1117zipkdPth3s(byte[] zip, byte[] other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(o.m1615getSizeimpl(zip), o.m1615getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(h.to(n.m1550boximpl(o.m1614getw2LRezQ(zip, i8)), n.m1550boximpl(o.m1614getw2LRezQ(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<Pair<u, u>> m1118zipmazbYpA(short[] zip, short[] other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(v.m1847getSizeimpl(zip), v.m1847getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(h.to(u.m1782boximpl(v.m1846getMh2AYeg(zip, i8)), u.m1782boximpl(v.m1846getMh2AYeg(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<Pair<n, R>> m1119zipnl983wc(byte[] zip, R[] other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(o.m1615getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(zip, i8);
            arrayList.add(h.to(n.m1550boximpl(m1614getw2LRezQ), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<Pair<u, R>> m1120zipuaTIQ5s(short[] zip, R[] other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(v.m1847getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(zip, i8);
            arrayList.add(h.to(u.m1782boximpl(m1846getMh2AYeg), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<Pair<r, r>> m1121zipus8wMrg(long[] zip, long[] other) {
        s.checkNotNullParameter(zip, "$this$zip");
        s.checkNotNullParameter(other, "other");
        int min = Math.min(y5.s.m1771getSizeimpl(zip), y5.s.m1771getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(h.to(r.m1704boximpl(y5.s.m1770getsVKNKU(zip, i8)), r.m1704boximpl(y5.s.m1770getsVKNKU(other, i8))));
        }
        return arrayList;
    }

    private static final byte[] toUByteArray(byte[] bArr) {
        s.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return o.m1609constructorimpl(copyOf);
    }

    private static final int[] toUIntArray(int[] iArr) {
        s.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return q.m1687constructorimpl(copyOf);
    }

    private static final long[] toULongArray(long[] jArr) {
        s.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return y5.s.m1765constructorimpl(copyOf);
    }

    private static final short[] toUShortArray(short[] sArr) {
        s.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        s.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return v.m1841constructorimpl(copyOf);
    }

    private static final double sumOfDouble(long[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(sumOf);
        double d8 = i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            d8 += ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(sumOf, i8)))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(long[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(sumOf);
        int i8 = 0;
        for (int i9 = 0; i9 < m1771getSizeimpl; i9++) {
            i8 += ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(sumOf, i9)))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(long[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(sumOf);
        long j8 = 0;
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            j8 += ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(sumOf, i8)))).longValue();
        }
        return j8;
    }

    private static final int sumOfUInt(long[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = p.m1632constructorimpl(0);
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            m1632constructorimpl = p.m1632constructorimpl(m1632constructorimpl + ((p) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(sumOf, i8)))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(long[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = r.m1710constructorimpl(0L);
        int m1771getSizeimpl = y5.s.m1771getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            m1710constructorimpl = r.m1710constructorimpl(m1710constructorimpl + ((r) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(sumOf, i8)))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    private static final double sumOfDouble(byte[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1615getSizeimpl = o.m1615getSizeimpl(sumOf);
        double d8 = i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            d8 += ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumOf, i8)))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(byte[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1615getSizeimpl = o.m1615getSizeimpl(sumOf);
        int i8 = 0;
        for (int i9 = 0; i9 < m1615getSizeimpl; i9++) {
            i8 += ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumOf, i9)))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(byte[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1615getSizeimpl = o.m1615getSizeimpl(sumOf);
        long j8 = 0;
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            j8 += ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumOf, i8)))).longValue();
        }
        return j8;
    }

    private static final double sumOfDouble(short[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1847getSizeimpl = v.m1847getSizeimpl(sumOf);
        double d8 = i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            d8 += ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumOf, i8)))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(short[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1847getSizeimpl = v.m1847getSizeimpl(sumOf);
        int i8 = 0;
        for (int i9 = 0; i9 < m1847getSizeimpl; i9++) {
            i8 += ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumOf, i9)))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(short[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1847getSizeimpl = v.m1847getSizeimpl(sumOf);
        long j8 = 0;
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            j8 += ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumOf, i8)))).longValue();
        }
        return j8;
    }

    private static final int sumOfUInt(byte[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = p.m1632constructorimpl(0);
        int m1615getSizeimpl = o.m1615getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            m1632constructorimpl = p.m1632constructorimpl(m1632constructorimpl + ((p) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumOf, i8)))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(byte[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = r.m1710constructorimpl(0L);
        int m1615getSizeimpl = o.m1615getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            m1710constructorimpl = r.m1710constructorimpl(m1710constructorimpl + ((r) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumOf, i8)))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    /* renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final float m763maxOfJOV_ifY(byte[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (!o.m1617isEmptyimpl(maxOf)) {
            float floatValue = ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOf, 0)))).floatValue();
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOf, it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final float m766maxOfMShoTSo(long[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (!y5.s.m1773isEmptyimpl(maxOf)) {
            float floatValue = ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOf, 0)))).floatValue();
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOf, it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final float m769maxOfjgv0xPQ(int[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (!q.m1695isEmptyimpl(maxOf)) {
            float floatValue = ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOf, 0)))).floatValue();
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOf, it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final float m772maxOfxTcfx_M(short[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (!v.m1849isEmptyimpl(maxOf)) {
            float floatValue = ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOf, 0)))).floatValue();
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOf, it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m776maxOfOrNullJOV_ifY(byte[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfOrNull, 0)))).floatValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfOrNull, it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m779maxOfOrNullMShoTSo(long[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfOrNull, 0)))).floatValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfOrNull, it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m782maxOfOrNulljgv0xPQ(int[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfOrNull, 0)))).floatValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfOrNull, it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m785maxOfOrNullxTcfx_M(short[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfOrNull, 0)))).floatValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfOrNull, it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m800maxOrThrowU(long[] max) {
        int compare;
        s.checkNotNullParameter(max, "$this$max");
        if (!y5.s.m1773isEmptyimpl(max)) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(max, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(max, it.nextInt());
                compare = Long.compare(m1770getsVKNKU ^ Long.MIN_VALUE, m1770getsVKNKU2 ^ Long.MIN_VALUE);
                if (compare < 0) {
                    m1770getsVKNKU = m1770getsVKNKU2;
                }
            }
            return m1770getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m808maxWithOrThrowU(long[] maxWith, Comparator<? super r> comparator) {
        s.checkNotNullParameter(maxWith, "$this$maxWith");
        s.checkNotNullParameter(comparator, "comparator");
        if (!y5.s.m1773isEmptyimpl(maxWith)) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(maxWith, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(maxWith, it.nextInt());
                if (comparator.compare(r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(m1770getsVKNKU2)) < 0) {
                    m1770getsVKNKU = m1770getsVKNKU2;
                }
            }
            return m1770getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final float m819minOfJOV_ifY(byte[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (!o.m1617isEmptyimpl(minOf)) {
            float floatValue = ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOf, 0)))).floatValue();
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOf, it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final float m822minOfMShoTSo(long[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (!y5.s.m1773isEmptyimpl(minOf)) {
            float floatValue = ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOf, 0)))).floatValue();
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOf, it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final float m825minOfjgv0xPQ(int[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (!q.m1695isEmptyimpl(minOf)) {
            float floatValue = ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOf, 0)))).floatValue();
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOf, it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final float m828minOfxTcfx_M(short[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (!v.m1849isEmptyimpl(minOf)) {
            float floatValue = ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOf, 0)))).floatValue();
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOf, it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m832minOfOrNullJOV_ifY(byte[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfOrNull, 0)))).floatValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfOrNull, it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m835minOfOrNullMShoTSo(long[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfOrNull, 0)))).floatValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfOrNull, it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m838minOfOrNulljgv0xPQ(int[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfOrNull, 0)))).floatValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfOrNull, it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m841minOfOrNullxTcfx_M(short[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfOrNull, 0)))).floatValue();
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfOrNull, it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m856minOrThrowU(long[] min) {
        int compare;
        s.checkNotNullParameter(min, "$this$min");
        if (!y5.s.m1773isEmptyimpl(min)) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(min, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(min, it.nextInt());
                compare = Long.compare(m1770getsVKNKU ^ Long.MIN_VALUE, m1770getsVKNKU2 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    m1770getsVKNKU = m1770getsVKNKU2;
                }
            }
            return m1770getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m864minWithOrThrowU(long[] minWith, Comparator<? super r> comparator) {
        s.checkNotNullParameter(minWith, "$this$minWith");
        s.checkNotNullParameter(comparator, "comparator");
        if (!y5.s.m1773isEmptyimpl(minWith)) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(minWith, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(minWith, it.nextInt());
                if (comparator.compare(r.m1704boximpl(m1770getsVKNKU), r.m1704boximpl(m1770getsVKNKU2)) > 0) {
                    m1770getsVKNKU = m1770getsVKNKU2;
                }
            }
            return m1770getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m760maxByOrThrowU(long[] maxBy, l selector) {
        s.checkNotNullParameter(maxBy, "$this$maxBy");
        s.checkNotNullParameter(selector, "selector");
        if (!y5.s.m1773isEmptyimpl(maxBy)) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(maxBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return m1770getsVKNKU;
            }
            Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(maxBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU2));
                if (comparable.compareTo(comparable2) < 0) {
                    m1770getsVKNKU = m1770getsVKNKU2;
                    comparable = comparable2;
                }
            }
            return m1770getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m816minByOrThrowU(long[] minBy, l selector) {
        s.checkNotNullParameter(minBy, "$this$minBy");
        s.checkNotNullParameter(selector, "selector");
        if (!y5.s.m1773isEmptyimpl(minBy)) {
            long m1770getsVKNKU = y5.s.m1770getsVKNKU(minBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return m1770getsVKNKU;
            }
            Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(minBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU2));
                if (comparable.compareTo(comparable2) > 0) {
                    m1770getsVKNKU = m1770getsVKNKU2;
                    comparable = comparable2;
                }
            }
            return m1770getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    private static final int sumOfUInt(short[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = p.m1632constructorimpl(0);
        int m1847getSizeimpl = v.m1847getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            m1632constructorimpl = p.m1632constructorimpl(m1632constructorimpl + ((p) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumOf, i8)))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(short[] sumOf, l selector) {
        s.checkNotNullParameter(sumOf, "$this$sumOf");
        s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = r.m1710constructorimpl(0L);
        int m1847getSizeimpl = v.m1847getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            m1710constructorimpl = r.m1710constructorimpl(m1710constructorimpl + ((r) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumOf, i8)))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final int sumOfUInt(p[] pVarArr) {
        s.checkNotNullParameter(pVarArr, "<this>");
        int i8 = 0;
        for (p pVar : pVarArr) {
            i8 = p.m1632constructorimpl(i8 + pVar.m1684unboximpl());
        }
        return i8;
    }

    public static final long sumOfULong(r[] rVarArr) {
        s.checkNotNullParameter(rVarArr, "<this>");
        long j8 = 0;
        for (r rVar : rVarArr) {
            j8 = r.m1710constructorimpl(j8 + rVar.m1762unboximpl());
        }
        return j8;
    }

    /* renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m764maxOfJOV_ifY(byte[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (!o.m1617isEmptyimpl(maxOf)) {
            R r8 = (R) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOf, 0)));
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOf, it.nextInt())));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m767maxOfMShoTSo(long[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (!y5.s.m1773isEmptyimpl(maxOf)) {
            R r8 = (R) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOf, 0)));
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOf, it.nextInt())));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m770maxOfjgv0xPQ(int[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (!q.m1695isEmptyimpl(maxOf)) {
            R r8 = (R) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOf, 0)));
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOf, it.nextInt())));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m773maxOfxTcfx_M(short[] maxOf, l selector) {
        s.checkNotNullParameter(maxOf, "$this$maxOf");
        s.checkNotNullParameter(selector, "selector");
        if (!v.m1849isEmptyimpl(maxOf)) {
            R r8 = (R) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOf, 0)));
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOf)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOf, it.nextInt())));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m774maxOfOrNullJOV_ifY(byte[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(maxOfOrNull, it.nextInt())));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m777maxOfOrNullMShoTSo(long[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(maxOfOrNull, it.nextInt())));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m780maxOfOrNulljgv0xPQ(int[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(maxOfOrNull, it.nextInt())));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m783maxOfOrNullxTcfx_M(short[] maxOfOrNull, l selector) {
        s.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(maxOfOrNull, it.nextInt())));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m798maxOrThrowU(byte[] max) {
        s.checkNotNullParameter(max, "$this$max");
        if (!o.m1617isEmptyimpl(max)) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(max, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(max, it.nextInt());
                if (s.compare(m1614getw2LRezQ & 255, m1614getw2LRezQ2 & 255) < 0) {
                    m1614getw2LRezQ = m1614getw2LRezQ2;
                }
            }
            return m1614getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m806maxWithOrThrowU(byte[] maxWith, Comparator<? super n> comparator) {
        s.checkNotNullParameter(maxWith, "$this$maxWith");
        s.checkNotNullParameter(comparator, "comparator");
        if (!o.m1617isEmptyimpl(maxWith)) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(maxWith, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(maxWith, it.nextInt());
                if (comparator.compare(n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(m1614getw2LRezQ2)) < 0) {
                    m1614getw2LRezQ = m1614getw2LRezQ2;
                }
            }
            return m1614getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m820minOfJOV_ifY(byte[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (!o.m1617isEmptyimpl(minOf)) {
            R r8 = (R) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOf, 0)));
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOf, it.nextInt())));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m823minOfMShoTSo(long[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (!y5.s.m1773isEmptyimpl(minOf)) {
            R r8 = (R) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOf, 0)));
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOf, it.nextInt())));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m826minOfjgv0xPQ(int[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (!q.m1695isEmptyimpl(minOf)) {
            R r8 = (R) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOf, 0)));
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOf, it.nextInt())));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m829minOfxTcfx_M(short[] minOf, l selector) {
        s.checkNotNullParameter(minOf, "$this$minOf");
        s.checkNotNullParameter(selector, "selector");
        if (!v.m1849isEmptyimpl(minOf)) {
            R r8 = (R) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOf, 0)));
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOf)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOf, it.nextInt())));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m830minOfOrNullJOV_ifY(byte[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(minOfOrNull, it.nextInt())));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m833minOfOrNullMShoTSo(long[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (y5.s.m1773isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(y5.s.m1770getsVKNKU(minOfOrNull, it.nextInt())));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m836minOfOrNulljgv0xPQ(int[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(minOfOrNull, it.nextInt())));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m839minOfOrNullxTcfx_M(short[] minOfOrNull, l selector) {
        s.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R r8 = (R) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfOrNull, 0)));
        f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(minOfOrNull, it.nextInt())));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m854minOrThrowU(byte[] min) {
        s.checkNotNullParameter(min, "$this$min");
        if (!o.m1617isEmptyimpl(min)) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(min, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(min, it.nextInt());
                if (s.compare(m1614getw2LRezQ & 255, m1614getw2LRezQ2 & 255) > 0) {
                    m1614getw2LRezQ = m1614getw2LRezQ2;
                }
            }
            return m1614getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m862minWithOrThrowU(byte[] minWith, Comparator<? super n> comparator) {
        s.checkNotNullParameter(minWith, "$this$minWith");
        s.checkNotNullParameter(comparator, "comparator");
        if (!o.m1617isEmptyimpl(minWith)) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(minWith, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(minWith, it.nextInt());
                if (comparator.compare(n.m1550boximpl(m1614getw2LRezQ), n.m1550boximpl(m1614getw2LRezQ2)) > 0) {
                    m1614getw2LRezQ = m1614getw2LRezQ2;
                }
            }
            return m1614getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m758maxByOrThrowU(byte[] maxBy, l selector) {
        s.checkNotNullParameter(maxBy, "$this$maxBy");
        s.checkNotNullParameter(selector, "selector");
        if (!o.m1617isEmptyimpl(maxBy)) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(maxBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return m1614getw2LRezQ;
            }
            Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(maxBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ2));
                if (comparable.compareTo(comparable2) < 0) {
                    m1614getw2LRezQ = m1614getw2LRezQ2;
                    comparable = comparable2;
                }
            }
            return m1614getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m814minByOrThrowU(byte[] minBy, l selector) {
        s.checkNotNullParameter(minBy, "$this$minBy");
        s.checkNotNullParameter(selector, "selector");
        if (!o.m1617isEmptyimpl(minBy)) {
            byte m1614getw2LRezQ = o.m1614getw2LRezQ(minBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return m1614getw2LRezQ;
            }
            Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(minBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ2));
                if (comparable.compareTo(comparable2) > 0) {
                    m1614getw2LRezQ = m1614getw2LRezQ2;
                    comparable = comparable2;
                }
            }
            return m1614getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m801maxOrThrowU(short[] max) {
        s.checkNotNullParameter(max, "$this$max");
        if (!v.m1849isEmptyimpl(max)) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(max, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                short m1846getMh2AYeg2 = v.m1846getMh2AYeg(max, it.nextInt());
                if (s.compare(m1846getMh2AYeg & u.MAX_VALUE, 65535 & m1846getMh2AYeg2) < 0) {
                    m1846getMh2AYeg = m1846getMh2AYeg2;
                }
            }
            return m1846getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m809maxWithOrThrowU(short[] maxWith, Comparator<? super u> comparator) {
        s.checkNotNullParameter(maxWith, "$this$maxWith");
        s.checkNotNullParameter(comparator, "comparator");
        if (!v.m1849isEmptyimpl(maxWith)) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(maxWith, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                short m1846getMh2AYeg2 = v.m1846getMh2AYeg(maxWith, it.nextInt());
                if (comparator.compare(u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(m1846getMh2AYeg2)) < 0) {
                    m1846getMh2AYeg = m1846getMh2AYeg2;
                }
            }
            return m1846getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m857minOrThrowU(short[] min) {
        s.checkNotNullParameter(min, "$this$min");
        if (!v.m1849isEmptyimpl(min)) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(min, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                short m1846getMh2AYeg2 = v.m1846getMh2AYeg(min, it.nextInt());
                if (s.compare(m1846getMh2AYeg & u.MAX_VALUE, 65535 & m1846getMh2AYeg2) > 0) {
                    m1846getMh2AYeg = m1846getMh2AYeg2;
                }
            }
            return m1846getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m865minWithOrThrowU(short[] minWith, Comparator<? super u> comparator) {
        s.checkNotNullParameter(minWith, "$this$minWith");
        s.checkNotNullParameter(comparator, "comparator");
        if (!v.m1849isEmptyimpl(minWith)) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(minWith, 0);
            f0 it = new m(1, ArraysKt___ArraysKt.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                short m1846getMh2AYeg2 = v.m1846getMh2AYeg(minWith, it.nextInt());
                if (comparator.compare(u.m1782boximpl(m1846getMh2AYeg), u.m1782boximpl(m1846getMh2AYeg2)) > 0) {
                    m1846getMh2AYeg = m1846getMh2AYeg2;
                }
            }
            return m1846getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m761maxByOrThrowU(short[] maxBy, l selector) {
        s.checkNotNullParameter(maxBy, "$this$maxBy");
        s.checkNotNullParameter(selector, "selector");
        if (!v.m1849isEmptyimpl(maxBy)) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(maxBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
            if (lastIndex == 0) {
                return m1846getMh2AYeg;
            }
            Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                short m1846getMh2AYeg2 = v.m1846getMh2AYeg(maxBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg2));
                if (comparable.compareTo(comparable2) < 0) {
                    m1846getMh2AYeg = m1846getMh2AYeg2;
                    comparable = comparable2;
                }
            }
            return m1846getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m817minByOrThrowU(short[] minBy, l selector) {
        s.checkNotNullParameter(minBy, "$this$minBy");
        s.checkNotNullParameter(selector, "selector");
        if (!v.m1849isEmptyimpl(minBy)) {
            short m1846getMh2AYeg = v.m1846getMh2AYeg(minBy, 0);
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
            if (lastIndex == 0) {
                return m1846getMh2AYeg;
            }
            Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                short m1846getMh2AYeg2 = v.m1846getMh2AYeg(minBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg2));
                if (comparable.compareTo(comparable2) > 0) {
                    m1846getMh2AYeg = m1846getMh2AYeg2;
                    comparable = comparable2;
                }
            }
            return m1846getMh2AYeg;
        }
        throw new NoSuchElementException();
    }
}
