package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextDirection.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "other", "hashCode", "Companion", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@JvmInline
/* loaded from: classes3.dex */
public final class TextDirection {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Ltr = m7411constructorimpl(1);
    private static final int Rtl = m7411constructorimpl(2);
    private static final int Content = m7411constructorimpl(3);
    private static final int ContentOrLtr = m7411constructorimpl(4);
    private static final int ContentOrRtl = m7411constructorimpl(5);
    private static final int Unspecified = m7411constructorimpl(0);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m7410boximpl(int i) {
        return new TextDirection(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7411constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7412equalsimpl(int i, Object obj) {
        return (obj instanceof TextDirection) && i == ((TextDirection) obj).m7416unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7413equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7414hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object other) {
        return m7412equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m7414hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7416unboximpl() {
        return this.value;
    }

    private /* synthetic */ TextDirection(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public String toString() {
        return m7415toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7415toStringimpl(int i) {
        return m7413equalsimpl0(i, Ltr) ? "Ltr" : m7413equalsimpl0(i, Rtl) ? "Rtl" : m7413equalsimpl0(i, Content) ? "Content" : m7413equalsimpl0(i, ContentOrLtr) ? "ContentOrLtr" : m7413equalsimpl0(i, ContentOrRtl) ? "ContentOrRtl" : m7413equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    /* compiled from: TextDirection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection$Companion;", "", "<init>", "()V", "Ltr", "Landroidx/compose/ui/text/style/TextDirection;", "getLtr-s_7X-co", "()I", "I", "Rtl", "getRtl-s_7X-co", "Content", "getContent-s_7X-co", "ContentOrLtr", "getContentOrLtr-s_7X-co", "ContentOrRtl", "getContentOrRtl-s_7X-co", "Unspecified", "getUnspecified-s_7X-co", "valueOf", "value", "", "valueOf-E8nx0Ws", "(I)I", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m7420getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m7421getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m7417getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m7418getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m7419getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m7422getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        /* renamed from: valueOf-E8nx0Ws, reason: not valid java name */
        public final int m7423valueOfE8nx0Ws(int value) {
            boolean z = false;
            if (value >= 0 && value < 6) {
                z = true;
            }
            if (!z) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + value + " is not recognized by TextDirection.");
            }
            return TextDirection.m7411constructorimpl(value);
        }
    }
}
