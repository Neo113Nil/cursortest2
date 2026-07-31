package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FilterQuality.kt */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getValue", "()I", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilterQuality {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m1476constructorimpl(0);
    private static final int Low = m1476constructorimpl(1);
    private static final int Medium = m1476constructorimpl(2);
    private static final int High = m1476constructorimpl(3);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1476constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1477equalsimpl(int i, Object obj) {
        return (obj instanceof FilterQuality) && i == ((FilterQuality) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1478equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1479hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1477equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1479hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    /* compiled from: FilterQuality.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/FilterQuality;", "None", "I", "getNone-f-v9h1I", "()I", "Low", "getLow-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m1483getNonefv9h1I() {
            return FilterQuality.None;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m1482getLowfv9h1I() {
            return FilterQuality.Low;
        }
    }

    public String toString() {
        return m1480toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1480toStringimpl(int i) {
        return m1478equalsimpl0(i, None) ? "None" : m1478equalsimpl0(i, Low) ? "Low" : m1478equalsimpl0(i, Medium) ? "Medium" : m1478equalsimpl0(i, High) ? "High" : "Unknown";
    }
}
