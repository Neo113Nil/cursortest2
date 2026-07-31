package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Constraints.kt */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087@\u0018\u0000 12\u00020\u0001:\u00011B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u0013R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0011\u0010%\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u001a\u0010*\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u001c\u001a\u0004\b(\u0010$R\u001a\u0010-\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u001c\u001a\u0004\b+\u0010$R\u001a\u00100\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u001c\u001a\u0004\b.\u0010$\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "", "value", "constructor-impl", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "copy-Zbe2FdA", "(JIIII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getValue$annotations", "()V", "getFocusIndex-impl", "focusIndex", "getMinWidth-impl", "getMaxWidth-impl", "getMinHeight-impl", "getMaxHeight-impl", "getHasBoundedWidth-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedHeight-impl", "hasBoundedHeight", "getHasFixedWidth-impl", "getHasFixedWidth$annotations", "hasFixedWidth", "getHasFixedHeight-impl", "getHasFixedHeight$annotations", "hasFixedHeight", "isZero-impl", "isZero$annotations", "isZero", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Constraints {
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int[] MinHeightOffsets = {18, 20, 17, 15};
    private static final int[] WidthMask = {65535, 262143, 32767, 8191};
    private static final int[] HeightMask = {32767, 8191, 65535, 262143};

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m2475boximpl(long j) {
        return new Constraints(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2476constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2479equalsimpl(long j, Object obj) {
        return (obj instanceof Constraints) && j == ((Constraints) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2480equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m2481getFocusIndeximpl(long j) {
        return (int) (j & 3);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2490hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2479equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2490hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    private /* synthetic */ Constraints(long j) {
        this.value = j;
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m2489getMinWidthimpl(long j) {
        return ((int) (j >> 2)) & WidthMask[m2481getFocusIndeximpl(j)];
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m2487getMaxWidthimpl(long j) {
        int i = ((int) (j >> 33)) & WidthMask[m2481getFocusIndeximpl(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m2488getMinHeightimpl(long j) {
        int m2481getFocusIndeximpl = m2481getFocusIndeximpl(j);
        return ((int) (j >> MinHeightOffsets[m2481getFocusIndeximpl])) & HeightMask[m2481getFocusIndeximpl];
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m2486getMaxHeightimpl(long j) {
        int m2481getFocusIndeximpl = m2481getFocusIndeximpl(j);
        int i = ((int) (j >> (MinHeightOffsets[m2481getFocusIndeximpl] + 31))) & HeightMask[m2481getFocusIndeximpl];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m2483getHasBoundedWidthimpl(long j) {
        return (((int) (j >> 33)) & WidthMask[m2481getFocusIndeximpl(j)]) != 0;
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m2482getHasBoundedHeightimpl(long j) {
        int m2481getFocusIndeximpl = m2481getFocusIndeximpl(j);
        return (((int) (j >> (MinHeightOffsets[m2481getFocusIndeximpl] + 31))) & HeightMask[m2481getFocusIndeximpl]) != 0;
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m2485getHasFixedWidthimpl(long j) {
        return m2487getMaxWidthimpl(j) == m2489getMinWidthimpl(j);
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m2484getHasFixedHeightimpl(long j) {
        return m2486getMaxHeightimpl(j) == m2488getMinHeightimpl(j);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m2491isZeroimpl(long j) {
        return m2487getMaxWidthimpl(j) == 0 || m2486getMaxHeightimpl(j) == 0;
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m2478copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m2489getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m2487getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m2488getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m2486getMaxHeightimpl(j);
        }
        return m2477copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m2477copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (i3 < 0 || i < 0) {
            throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
        }
        if (i2 < i && i2 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        if (i4 < i3 && i4 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
        }
        return INSTANCE.m2494createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
    }

    public String toString() {
        return m2492toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2492toStringimpl(long j) {
        int m2487getMaxWidthimpl = m2487getMaxWidthimpl(j);
        String str = "Infinity";
        String valueOf = m2487getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m2487getMaxWidthimpl);
        int m2486getMaxHeightimpl = m2486getMaxHeightimpl(j);
        if (m2486getMaxHeightimpl != Integer.MAX_VALUE) {
            str = String.valueOf(m2486getMaxHeightimpl);
        }
        return "Constraints(minWidth = " + m2489getMinWidthimpl(j) + ", maxWidth = " + valueOf + ", minHeight = " + m2488getMinHeightimpl(j) + ", maxHeight = " + str + ')';
    }

    /* compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "FocusMask", "", "HeightMask", "", "Infinity", "", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "bitsNeedForSize", "size", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "createConstraints-Zbe2FdA$ui_unit_release", "(IIII)J", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m2495fixedJhjzzOo(int width, int height) {
            if (width < 0 || height < 0) {
                throw new IllegalArgumentException(("width(" + width + ") and height(" + height + ") must be >= 0").toString());
            }
            return m2494createConstraintsZbe2FdA$ui_unit_release(width, width, height, height);
        }

        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m2497fixedWidthOenEA2s(int width) {
            if (width < 0) {
                throw new IllegalArgumentException(("width(" + width + ") must be >= 0").toString());
            }
            return m2494createConstraintsZbe2FdA$ui_unit_release(width, width, 0, Integer.MAX_VALUE);
        }

        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m2496fixedHeightOenEA2s(int height) {
            if (height < 0) {
                throw new IllegalArgumentException(("height(" + height + ") must be >= 0").toString());
            }
            return m2494createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, height, height);
        }

        /* renamed from: createConstraints-Zbe2FdA$ui_unit_release, reason: not valid java name */
        public final long m2494createConstraintsZbe2FdA$ui_unit_release(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            long j;
            int i = maxHeight == Integer.MAX_VALUE ? minHeight : maxHeight;
            int bitsNeedForSize = bitsNeedForSize(i);
            int i2 = maxWidth == Integer.MAX_VALUE ? minWidth : maxWidth;
            int bitsNeedForSize2 = bitsNeedForSize(i2);
            if (bitsNeedForSize + bitsNeedForSize2 <= 31) {
                if (bitsNeedForSize2 == 13) {
                    j = 3;
                } else if (bitsNeedForSize2 == 18) {
                    j = 1;
                } else if (bitsNeedForSize2 == 15) {
                    j = 2;
                } else {
                    if (bitsNeedForSize2 != 16) {
                        throw new IllegalStateException("Should only have the provided constants.");
                    }
                    j = 0;
                }
                int i3 = maxWidth == Integer.MAX_VALUE ? 0 : maxWidth + 1;
                int i4 = maxHeight != Integer.MAX_VALUE ? maxHeight + 1 : 0;
                int i5 = Constraints.MinHeightOffsets[(int) j];
                return Constraints.m2476constructorimpl((i3 << 33) | j | (minWidth << 2) | (minHeight << i5) | (i4 << (i5 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i2 + " and height of " + i + " in Constraints");
        }

        private final int bitsNeedForSize(int size) {
            if (size < 8191) {
                return 13;
            }
            if (size < 32767) {
                return 15;
            }
            if (size < 65535) {
                return 16;
            }
            if (size < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + size + " in Constraints");
        }
    }
}
