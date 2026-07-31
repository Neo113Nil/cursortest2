package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;

/* compiled from: IntRect.kt */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\rR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\rR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001c\u0010\rR\u001a\u0010!\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0015\u001a\u0004\b\u001f\u0010\r¨\u0006#"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getLeft$annotations", "()V", "getTop", "getTop$annotations", "getRight", "getRight$annotations", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IntRect {
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) other;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    public IntRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.top + ", " + this.right + ", " + this.bottom + ')';
    }
}
