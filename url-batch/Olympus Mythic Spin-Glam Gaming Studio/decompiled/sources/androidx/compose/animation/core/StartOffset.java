package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u001e\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B\u0014\b\u0002\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017\u0088\u0001\t\u0092\u0001\u00020\bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "", "offsetMillis", "Landroidx/compose/animation/core/StartOffsetType;", "offsetType", "constructor-impl", "(II)J", "", "value", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StartOffset {
    private final long value;

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m118constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m120equalsimpl(long j, Object obj) {
        return (obj instanceof StartOffset) && j == ((StartOffset) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m121equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m122hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m123toStringimpl(long j) {
        return "StartOffset(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m120equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m122hashCodeimpl(this.value);
    }

    public String toString() {
        return m123toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m117constructorimpl(int i, int i2) {
        return m118constructorimpl(i * i2);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m119constructorimpl$default(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.INSTANCE.m130getDelayEo1U57Q();
        }
        return m117constructorimpl(i, i2);
    }
}
