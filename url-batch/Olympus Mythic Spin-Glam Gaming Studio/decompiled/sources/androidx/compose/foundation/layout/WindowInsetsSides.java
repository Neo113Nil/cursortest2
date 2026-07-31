package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u001e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hasAny", "sides", "hasAny-bkgdKaI$foundation_layout_release", "(II)Z", "hashCode", "hashCode-impl", "plus", "plus-gK_yJZ4", "(II)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "valueToString", "valueToString-impl", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m375constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m376equalsimpl(int i, Object obj) {
        return (obj instanceof WindowInsetsSides) && i == ((WindowInsetsSides) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m377equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m378hasAnybkgdKaI$foundation_layout_release(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m379hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m376equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m379hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m380plusgK_yJZ4(int i, int i2) {
        return m375constructorimpl(i | i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m381toStringimpl(int i) {
        return "WindowInsetsSides(" + m382valueToStringimpl(i) + ')';
    }

    public String toString() {
        return m381toStringimpl(this.value);
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m382valueToStringimpl(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = Start;
        if ((i & i2) == i2) {
            m383valueToString_impl$lambda0$appendPlus(sb, "Start");
        }
        int i3 = Left;
        if ((i & i3) == i3) {
            m383valueToString_impl$lambda0$appendPlus(sb, "Left");
        }
        int i4 = Top;
        if ((i & i4) == i4) {
            m383valueToString_impl$lambda0$appendPlus(sb, "Top");
        }
        int i5 = End;
        if ((i & i5) == i5) {
            m383valueToString_impl$lambda0$appendPlus(sb, "End");
        }
        int i6 = Right;
        if ((i & i6) == i6) {
            m383valueToString_impl$lambda0$appendPlus(sb, "Right");
        }
        int i7 = Bottom;
        if ((i & i7) == i7) {
            m383valueToString_impl$lambda0$appendPlus(sb, "Bottom");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: valueToString_impl$lambda-0$appendPlus, reason: not valid java name */
    private static final void m383valueToString_impl$lambda0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* compiled from: WindowInsets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR#\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR#\u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR \u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "AllowLeftInLtr", "I", "getAllowLeftInLtr-JoeWqyM$foundation_layout_release", "()I", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout_release", "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout_release", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout_release", "Start", "getStart-JoeWqyM", "End", "getEnd-JoeWqyM", "Top", "getTop-JoeWqyM", "Bottom", "getBottom-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m385getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m387getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m386getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m388getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m393getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m390getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m394getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m389getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m391getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m392getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }
    }

    static {
        int m375constructorimpl = m375constructorimpl(8);
        AllowLeftInLtr = m375constructorimpl;
        int m375constructorimpl2 = m375constructorimpl(4);
        AllowRightInLtr = m375constructorimpl2;
        int m375constructorimpl3 = m375constructorimpl(2);
        AllowLeftInRtl = m375constructorimpl3;
        int m375constructorimpl4 = m375constructorimpl(1);
        AllowRightInRtl = m375constructorimpl4;
        Start = m380plusgK_yJZ4(m375constructorimpl, m375constructorimpl4);
        End = m380plusgK_yJZ4(m375constructorimpl2, m375constructorimpl3);
        int m375constructorimpl5 = m375constructorimpl(16);
        Top = m375constructorimpl5;
        int m375constructorimpl6 = m375constructorimpl(32);
        Bottom = m375constructorimpl6;
        int m380plusgK_yJZ4 = m380plusgK_yJZ4(m375constructorimpl, m375constructorimpl3);
        Left = m380plusgK_yJZ4;
        int m380plusgK_yJZ42 = m380plusgK_yJZ4(m375constructorimpl2, m375constructorimpl4);
        Right = m380plusgK_yJZ42;
        Horizontal = m380plusgK_yJZ4(m380plusgK_yJZ4, m380plusgK_yJZ42);
        Vertical = m380plusgK_yJZ4(m375constructorimpl5, m375constructorimpl6);
    }
}
