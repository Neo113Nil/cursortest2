package dev.chrisbanes.haze;

import android.view.WindowId;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class HazeArea {
    public boolean contentDrawing;
    public WindowId windowId;
    public final ParcelableSnapshotMutableState positionOnScreen$delegate = Updater.mutableStateOf$default(new Offset(9205357640488583168L));
    public final ParcelableSnapshotMutableState size$delegate = Updater.mutableStateOf$default(new Size(9205357640488583168L));
    public final ParcelableSnapshotMutableFloatState zIndex$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final SnapshotStateSet preDrawListeners = new SnapshotStateSet();
    public final ParcelableSnapshotMutableState contentLayer$delegate = Updater.mutableStateOf$default(null);

    public final GraphicsLayer getContentLayer() {
        return (GraphicsLayer) this.contentLayer$delegate.getValue();
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m4106getPositionOnScreenF1C5BW0() {
        return ((Offset) this.positionOnScreen$delegate.getValue()).packedValue;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HazeArea(");
        sb.append("positionOnScreen=" + Offset.m628toStringimpl(m4106getPositionOnScreenF1C5BW0()) + ", ");
        sb.append("size=" + Size.m646toStringimpl(((Size) this.size$delegate.getValue()).packedValue) + ", ");
        sb.append("zIndex=" + this.zIndex$delegate.getFloatValue() + ", ");
        sb.append("contentLayer=" + getContentLayer() + ", ");
        sb.append("contentDrawing=" + this.contentDrawing);
        sb.append(")");
        return sb.toString();
    }
}
