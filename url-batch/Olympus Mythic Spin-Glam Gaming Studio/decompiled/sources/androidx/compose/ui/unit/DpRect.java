package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;

/* compiled from: Dp.kt */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR)\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R)\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R)\u0010\u0019\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/Dp;", "left", "F", "getLeft-D9Ej5fM", "()F", "getLeft-D9Ej5fM$annotations", "()V", ViewHierarchyConstants.DIMENSION_TOP_KEY, "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "right", "getRight-D9Ej5fM", "getRight-D9Ej5fM$annotations", "bottom", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DpRect {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) other;
        return Dp.m2509equalsimpl0(this.left, dpRect.left) && Dp.m2509equalsimpl0(this.top, dpRect.top) && Dp.m2509equalsimpl0(this.right, dpRect.right) && Dp.m2509equalsimpl0(this.bottom, dpRect.bottom);
    }

    public int hashCode() {
        return (((((Dp.m2510hashCodeimpl(this.left) * 31) + Dp.m2510hashCodeimpl(this.top)) * 31) + Dp.m2510hashCodeimpl(this.right)) * 31) + Dp.m2510hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) Dp.m2511toStringimpl(this.left)) + ", top=" + ((Object) Dp.m2511toStringimpl(this.top)) + ", right=" + ((Object) Dp.m2511toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m2511toStringimpl(this.bottom)) + ')';
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }
}
