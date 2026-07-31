package androidx.collection;

import kotlin.Metadata;

/* compiled from: IntIntPair.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b\u0088\u0001\u0010\u0092\u0001\u00020\u000f¨\u0006\u0016"}, d2 = {"Landroidx/collection/IntIntPair;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "packedValue", "J", "getFirst-impl", "first", "getSecond-impl", "second", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntIntPair {
    public final long packedValue;

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27equalsimpl(long j, Object obj) {
        return (obj instanceof IntIntPair) && j == ((IntIntPair) obj).getPackedValue();
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m28getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m29getSecondimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m27equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m30hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31toStringimpl(long j) {
        return '(' + m28getFirstimpl(j) + ", " + m29getSecondimpl(j) + ')';
    }

    public String toString() {
        return m31toStringimpl(this.packedValue);
    }
}
