package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* compiled from: ItemIndex.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/grid/ItemIndex;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getValue", "()I", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemIndex {
    private final int value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ItemIndex m438boximpl(int i) {
        return new ItemIndex(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m439constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m440equalsimpl(int i, Object obj) {
        return (obj instanceof ItemIndex) && i == ((ItemIndex) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m441equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m442hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m443toStringimpl(int i) {
        return "ItemIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m440equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m442hashCodeimpl(this.value);
    }

    public String toString() {
        return m443toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    private /* synthetic */ ItemIndex(int i) {
        this.value = i;
    }
}
