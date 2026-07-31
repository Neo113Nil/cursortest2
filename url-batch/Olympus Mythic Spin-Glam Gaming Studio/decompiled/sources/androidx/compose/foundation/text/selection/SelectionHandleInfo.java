package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SelectionHandles.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "Landroidx/compose/foundation/text/Handle;", "handle", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "<init>", "(Landroidx/compose/foundation/text/Handle;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text/Handle;", "getHandle", "()Landroidx/compose/foundation/text/Handle;", "J", "getPosition-F1C5BW0", "()J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectionHandleInfo {
    private final Handle handle;
    private final long position;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handle, j);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) other;
        return this.handle == selectionHandleInfo.handle && Offset.m1294equalsimpl0(this.position, selectionHandleInfo.position);
    }

    public int hashCode() {
        return (this.handle.hashCode() * 31) + Offset.m1299hashCodeimpl(this.position);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m1304toStringimpl(this.position)) + ')';
    }

    private SelectionHandleInfo(Handle handle, long j) {
        this.handle = handle;
        this.position = j;
    }
}
