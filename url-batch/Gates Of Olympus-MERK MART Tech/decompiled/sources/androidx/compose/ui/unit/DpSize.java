package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Dp.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u001a\u0010\fJ\u0010\u0010\u001b\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u001c\u0010\fJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u001eH\u0087\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020!H\u0087\u0002¢\u0006\u0004\b\u001f\u0010\"J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u001eH\u0087\u0002¢\u0006\u0004\b$\u0010 J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020!H\u0087\u0002¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006-"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "width", "Landroidx/compose/ui/unit/Dp;", "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "(J)F", "height", "getHeight-D9Ej5fM$annotations", "getHeight-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "minus", "other", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "times", "", "times-Gh9hcWk", "(JI)J", "", "(JF)J", "div", "div-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "hashCode", "Companion", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m8316constructorimpl(0);
    private static final long Unspecified = m8316constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m8313boximpl(long j) {
        return new DpSize(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8316constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8321equalsimpl(long j, Object obj) {
        return (obj instanceof DpSize) && j == ((DpSize) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8322equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8324getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8326getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8327hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object other) {
        return m8321equalsimpl(this.packedValue, other);
    }

    public int hashCode() {
        return m8327hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m8318copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m8325getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m8323getHeightD9Ej5fM(j);
        }
        return m8317copyDwJknco(j, f, f2);
    }

    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m8328minuse_xh8Ic(long j, long j2) {
        float m8227constructorimpl = Dp.m8227constructorimpl(m8325getWidthD9Ej5fM(j) - m8325getWidthD9Ej5fM(j2));
        float m8227constructorimpl2 = Dp.m8227constructorimpl(m8323getHeightD9Ej5fM(j) - m8323getHeightD9Ej5fM(j2));
        return m8316constructorimpl((Float.floatToRawIntBits(m8227constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m8227constructorimpl2)));
    }

    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m8329pluse_xh8Ic(long j, long j2) {
        float m8227constructorimpl = Dp.m8227constructorimpl(m8325getWidthD9Ej5fM(j) + m8325getWidthD9Ej5fM(j2));
        float m8227constructorimpl2 = Dp.m8227constructorimpl(m8323getHeightD9Ej5fM(j) + m8323getHeightD9Ej5fM(j2));
        return m8316constructorimpl((Float.floatToRawIntBits(m8227constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m8227constructorimpl2)));
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m8314component1D9Ej5fM(long j) {
        return m8325getWidthD9Ej5fM(j);
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m8315component2D9Ej5fM(long j) {
        return m8323getHeightD9Ej5fM(j);
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m8331timesGh9hcWk(long j, int i) {
        float f = i;
        float m8227constructorimpl = Dp.m8227constructorimpl(m8325getWidthD9Ej5fM(j) * f);
        float m8227constructorimpl2 = Dp.m8227constructorimpl(m8323getHeightD9Ej5fM(j) * f);
        return m8316constructorimpl((Float.floatToRawIntBits(m8227constructorimpl) << 32) | (Float.floatToRawIntBits(m8227constructorimpl2) & 4294967295L));
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m8330timesGh9hcWk(long j, float f) {
        float m8227constructorimpl = Dp.m8227constructorimpl(m8325getWidthD9Ej5fM(j) * f);
        float m8227constructorimpl2 = Dp.m8227constructorimpl(m8323getHeightD9Ej5fM(j) * f);
        return m8316constructorimpl((Float.floatToRawIntBits(m8227constructorimpl) << 32) | (Float.floatToRawIntBits(m8227constructorimpl2) & 4294967295L));
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m8320divGh9hcWk(long j, int i) {
        float f = i;
        float m8227constructorimpl = Dp.m8227constructorimpl(m8325getWidthD9Ej5fM(j) / f);
        float m8227constructorimpl2 = Dp.m8227constructorimpl(m8323getHeightD9Ej5fM(j) / f);
        return m8316constructorimpl((Float.floatToRawIntBits(m8227constructorimpl) << 32) | (Float.floatToRawIntBits(m8227constructorimpl2) & 4294967295L));
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m8319divGh9hcWk(long j, float f) {
        float m8227constructorimpl = Dp.m8227constructorimpl(m8325getWidthD9Ej5fM(j) / f);
        float m8227constructorimpl2 = Dp.m8227constructorimpl(m8323getHeightD9Ej5fM(j) / f);
        return m8316constructorimpl((Float.floatToRawIntBits(m8227constructorimpl) << 32) | (Float.floatToRawIntBits(m8227constructorimpl2) & 4294967295L));
    }

    public String toString() {
        return m8332toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8332toStringimpl(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return ((Object) Dp.m8238toStringimpl(m8325getWidthD9Ej5fM(j))) + " x " + ((Object) Dp.m8238toStringimpl(m8323getHeightD9Ej5fM(j)));
        }
        return "DpSize.Unspecified";
    }

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/unit/DpSize;", "getZero-MYxV2XQ", "()J", "J", "Unspecified", "getUnspecified-MYxV2XQ", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m8335getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m8334getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m8325getWidthD9Ej5fM(long j) {
        return Dp.m8227constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m8323getHeightD9Ej5fM(long j) {
        return Dp.m8227constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m8317copyDwJknco(long j, float f, float f2) {
        return m8316constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }
}
