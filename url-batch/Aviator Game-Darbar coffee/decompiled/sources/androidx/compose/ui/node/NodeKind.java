package androidx.compose.ui.node;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: NodeKind.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\f¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0086\f¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0003¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/NodeKind;", "T", "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "or", "other", "or-H91voCI", "(II)I", "or-impl", "equals", "", "hashCode", "toString", "", "ui"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@JvmInline
/* loaded from: classes.dex */
public final class NodeKind<T> {
    private final int mask;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m6501boximpl(int i) {
        return new NodeKind(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m6502constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6503equalsimpl(int i, Object obj) {
        return (obj instanceof NodeKind) && i == ((NodeKind) obj).m6509unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6504equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6505hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m6506orH91voCI(int i, int i2) {
        return i | i2;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m6507orimpl(int i, int i2) {
        return i | i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6508toStringimpl(int i) {
        return "NodeKind(mask=" + i + ')';
    }

    public boolean equals(Object other) {
        return m6503equalsimpl(this.mask, other);
    }

    public int hashCode() {
        return m6505hashCodeimpl(this.mask);
    }

    public String toString() {
        return m6508toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6509unboximpl() {
        return this.mask;
    }

    private /* synthetic */ NodeKind(int i) {
        this.mask = i;
    }

    public final int getMask() {
        return this.mask;
    }
}
