package androidx.compose.ui.text.android.animation;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;

/* compiled from: SegmentBreaker.kt */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0007R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/animation/Segment;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "startOffset", "I", "getStartOffset", "endOffset", "getEndOffset", "left", "getLeft", ViewHierarchyConstants.DIMENSION_TOP_KEY, "getTop", "right", "getRight", "bottom", "getBottom", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Segment {
    private final int bottom;
    private final int endOffset;
    private final int left;
    private final int right;
    private final int startOffset;
    private final int top;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return this.startOffset == segment.startOffset && this.endOffset == segment.endOffset && this.left == segment.left && this.top == segment.top && this.right == segment.right && this.bottom == segment.bottom;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.startOffset) * 31) + Integer.hashCode(this.endOffset)) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    public String toString() {
        return "Segment(startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
