package androidx.compose.foundation.layout;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "value", "", "constructor-impl", "(I)I", "plus", "sides", "plus-gK_yJZ4", "(II)I", "hasAny", "", "hasAny-bkgdKaI$foundation_layout", "(II)Z", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "valueToString", "valueToString-impl", "equals", "other", "hashCode", "Companion", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@JvmInline
/* loaded from: classes.dex */
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

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m899boximpl(int i) {
        return new WindowInsetsSides(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m900constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m901equalsimpl(int i, Object obj) {
        return (obj instanceof WindowInsetsSides) && i == ((WindowInsetsSides) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m902equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout, reason: not valid java name */
    public static final boolean m903hasAnybkgdKaI$foundation_layout(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m904hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object other) {
        return m901equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m904hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    private /* synthetic */ WindowInsetsSides(int i) {
        this.value = i;
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m905plusgK_yJZ4(int i, int i2) {
        return m900constructorimpl(i | i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m906toStringimpl(int i) {
        return "WindowInsetsSides(" + m907valueToStringimpl(i) + ')';
    }

    public String toString() {
        return m906toStringimpl(this.value);
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m907valueToStringimpl(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = Start;
        if ((i & i2) == i2) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i3 = Left;
        if ((i & i3) == i3) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i4 = Top;
        if ((i & i4) == i4) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i5 = End;
        if ((i & i5) == i5) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i6 = Right;
        if ((i & i6) == i6) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i7 = Bottom;
        if ((i & i7) == i7) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* compiled from: WindowInsets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0016\u0010\r\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0016\u0010\u0007R\u0013\u0010\u0017\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0018\u0010\u0007R\u0013\u0010\u0019\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007R\u0013\u0010\u001b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001c\u0010\u0007R\u0013\u0010\u001d\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "<init>", "()V", "AllowLeftInLtr", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "getAllowLeftInLtr-JoeWqyM$foundation_layout", "()I", "I", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout", "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout", "Start", "getStart-JoeWqyM", "End", "getEnd-JoeWqyM", "Top", "getTop-JoeWqyM", "Bottom", "getBottom-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "Horizontal", "getHorizontal-JoeWqyM", "Vertical", "getVertical-JoeWqyM", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m909getAllowLeftInLtrJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m911getAllowRightInLtrJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m910getAllowLeftInRtlJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m912getAllowRightInRtlJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m918getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m914getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m919getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m913getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m916getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m917getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m915getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m920getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }
    }

    static {
        int m900constructorimpl = m900constructorimpl(8);
        AllowLeftInLtr = m900constructorimpl;
        int m900constructorimpl2 = m900constructorimpl(4);
        AllowRightInLtr = m900constructorimpl2;
        int m900constructorimpl3 = m900constructorimpl(2);
        AllowLeftInRtl = m900constructorimpl3;
        int m900constructorimpl4 = m900constructorimpl(1);
        AllowRightInRtl = m900constructorimpl4;
        Start = m905plusgK_yJZ4(m900constructorimpl, m900constructorimpl4);
        End = m905plusgK_yJZ4(m900constructorimpl2, m900constructorimpl3);
        int m900constructorimpl5 = m900constructorimpl(16);
        Top = m900constructorimpl5;
        int m900constructorimpl6 = m900constructorimpl(32);
        Bottom = m900constructorimpl6;
        int m905plusgK_yJZ4 = m905plusgK_yJZ4(m900constructorimpl, m900constructorimpl3);
        Left = m905plusgK_yJZ4;
        int m905plusgK_yJZ42 = m905plusgK_yJZ4(m900constructorimpl2, m900constructorimpl4);
        Right = m905plusgK_yJZ42;
        Horizontal = m905plusgK_yJZ4(m905plusgK_yJZ4, m905plusgK_yJZ42);
        Vertical = m905plusgK_yJZ4(m900constructorimpl5, m900constructorimpl6);
    }
}
