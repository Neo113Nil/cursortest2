package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Connector;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\u000f\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010(R\u001a\u0010\f\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010(\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Lkotlin/ULong;", "value", "constructor-impl", "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "()V", "getRed-impl", "(J)F", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Color {
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m1441boximpl(long j) {
        return new Color(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1442constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1446equalsimpl(long j, Object obj) {
        return (obj instanceof Color) && j == ((Color) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1447equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1453hashCodeimpl(long j) {
        return ULong.m8079hashCodeimpl(j);
    }

    public boolean equals(Object obj) {
        return m1446equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1453hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m1450getColorSpaceimpl(long j) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m8077constructorimpl(j & 63)];
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m1443convertvNxB06k(long j, ColorSpace colorSpace) {
        float[] m1468getComponents8_81llA;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        if (Intrinsics.areEqual(colorSpace, m1450getColorSpaceimpl(j))) {
            return j;
        }
        Connector m1647connectYBCOT_4$default = ColorSpaceKt.m1647connectYBCOT_4$default(m1450getColorSpaceimpl(j), colorSpace, 0, 2, null);
        m1468getComponents8_81llA = ColorKt.m1468getComponents8_81llA(j);
        m1647connectYBCOT_4$default.transform(m1468getComponents8_81llA);
        return ColorKt.Color(m1468getComponents8_81llA[0], m1468getComponents8_81llA[1], m1468getComponents8_81llA[2], m1468getComponents8_81llA[3], colorSpace);
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m1452getRedimpl(long j) {
        if (ULong.m8077constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m8077constructorimpl(ULong.m8077constructorimpl(j >>> 48) & 255))) / 255.0f;
        }
        return Float16.m1490toFloatimpl(Float16.m1486constructorimpl((short) ULong.m8077constructorimpl(ULong.m8077constructorimpl(j >>> 48) & 65535)));
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m1451getGreenimpl(long j) {
        if (ULong.m8077constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m8077constructorimpl(ULong.m8077constructorimpl(j >>> 40) & 255))) / 255.0f;
        }
        return Float16.m1490toFloatimpl(Float16.m1486constructorimpl((short) ULong.m8077constructorimpl(ULong.m8077constructorimpl(j >>> 32) & 65535)));
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m1449getBlueimpl(long j) {
        if (ULong.m8077constructorimpl(63 & j) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m8077constructorimpl(ULong.m8077constructorimpl(j >>> 32) & 255))) / 255.0f;
        }
        return Float16.m1490toFloatimpl(Float16.m1486constructorimpl((short) ULong.m8077constructorimpl(ULong.m8077constructorimpl(j >>> 16) & 65535)));
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m1448getAlphaimpl(long j) {
        float ulongToDouble;
        float f;
        if (ULong.m8077constructorimpl(63 & j) == 0) {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m8077constructorimpl(ULong.m8077constructorimpl(j >>> 56) & 255));
            f = 255.0f;
        } else {
            ulongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m8077constructorimpl(ULong.m8077constructorimpl(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return ulongToDouble / f;
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m1445copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m1448getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m1452getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m1451getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m1449getBlueimpl(j);
        }
        return m1444copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m1444copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m1450getColorSpaceimpl(j));
    }

    public String toString() {
        return m1454toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1454toStringimpl(long j) {
        return "Color(" + m1452getRedimpl(j) + ", " + m1451getGreenimpl(j) + ", " + m1449getBlueimpl(j) + ", " + m1448getAlphaimpl(j) + ", " + m1450getColorSpaceimpl(j).getName() + ')';
    }

    /* compiled from: Color.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR)\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR)\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR)\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR)\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR)\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR)\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR)\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "Black", "J", "getBlack-0d7_KjU", "()J", "getBlack-0d7_KjU$annotations", "Gray", "getGray-0d7_KjU", "getGray-0d7_KjU$annotations", "White", "getWhite-0d7_KjU", "getWhite-0d7_KjU$annotations", "Red", "getRed-0d7_KjU", "getRed-0d7_KjU$annotations", "Blue", "getBlue-0d7_KjU", "getBlue-0d7_KjU$annotations", "Yellow", "getYellow-0d7_KjU", "getYellow-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU", "getTransparent-0d7_KjU$annotations", "Unspecified", "getUnspecified-0d7_KjU", "getUnspecified-0d7_KjU$annotations", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m1456getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m1458getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m1462getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m1459getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m1457getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m1463getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m1460getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m1461getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }
    }
}
