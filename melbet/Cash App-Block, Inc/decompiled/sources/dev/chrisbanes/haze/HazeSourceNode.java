package dev.chrisbanes.haze;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.zzg;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class HazeSourceNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, LayoutAwareModifierNode, DrawModifierNode, TraversableNode, ObserverModifierNode {
    public final HazeArea area;
    public StandaloneCoroutine preDrawJob;
    public HazeState state;

    public HazeSourceNode(HazeState hazeState) {
        HazeArea hazeArea = new HazeArea();
        this.area = hazeArea;
        hazeArea.zIndex$delegate.setFloatValue(RecyclerView.DECELERATION_RATE);
        this.state = hazeState;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        HazeArea hazeArea = this.area;
        try {
            hazeArea.contentDrawing = true;
            if (isAttached()) {
                if (MathKt__MathJVMKt.roundToInt(Size.m642getMinDimensionimpl(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc())) >= 1) {
                    GraphicsContext graphicsContext = (GraphicsContext) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalGraphicsContext);
                    GraphicsLayer contentLayer = hazeArea.getContentLayer();
                    if (contentLayer != null) {
                        if (contentLayer.isReleased) {
                            contentLayer = null;
                        }
                        if (contentLayer != null) {
                            layoutNodeDrawScope.m876recordJVtK1S4(Countries.m3990toIntSizeuvyYCjk(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc()), contentLayer, new HazeEffectNode$$ExternalSyntheticLambda2(layoutNodeDrawScope, contentLayer));
                            SizeKt.drawLayer(layoutNodeDrawScope, contentLayer);
                        }
                    }
                    contentLayer = graphicsContext.createGraphicsLayer();
                    hazeArea.contentLayer$delegate.setValue(contentLayer);
                    layoutNodeDrawScope.m876recordJVtK1S4(Countries.m3990toIntSizeuvyYCjk(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc()), contentLayer, new HazeEffectNode$$ExternalSyntheticLambda2(layoutNodeDrawScope, contentLayer));
                    SizeKt.drawLayer(layoutNodeDrawScope, contentLayer);
                } else {
                    HazeKt.drawContentSafely(layoutNodeDrawScope);
                }
            }
            hazeArea.contentDrawing = false;
            launchPreDraw();
        } catch (Throwable th) {
            hazeArea.contentDrawing = false;
            launchPreDraw();
            throw th;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return HazeTraversableNodeKeys.Source;
    }

    public final StandaloneCoroutine launchPreDraw() {
        return JobKt.launch$default(getCoroutineScope(), null, null, new HazeSourceNode$launchPreDraw$1(this, null, 0), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        ComponentActivity componentActivity;
        HazeState hazeState = this.state;
        hazeState.getClass();
        HazeArea hazeArea = this.area;
        hazeArea.getClass();
        hazeState._areas.add(hazeArea);
        Context context = (Context) DepthSortedSetKt.currentValueOf(this, AndroidCompositionLocals_androidKt.LocalContext);
        while (true) {
            if (!(context instanceof ComponentActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    componentActivity = null;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    context.getClass();
                }
            } else {
                componentActivity = (ComponentActivity) context;
                break;
            }
        }
        if (componentActivity != null) {
            JobKt.launch$default(getCoroutineScope(), null, null, new RxConvertKt$asFlow$1(componentActivity, this, null, 7), 3);
        }
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        HazeArea hazeArea = this.area;
        Recorder$$ExternalSyntheticOutline1.m(9205357640488583168L, hazeArea.positionOnScreen$delegate);
        hazeArea.size$delegate.setValue(new Size(9205357640488583168L));
        hazeArea.contentDrawing = false;
        GraphicsLayer contentLayer = hazeArea.getContentLayer();
        if (contentLayer != null) {
            ((GraphicsContext) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalGraphicsContext)).releaseGraphicsLayer(contentLayer);
        }
        hazeArea.contentLayer$delegate.setValue(null);
        HazeState hazeState = this.state;
        hazeState.getClass();
        hazeState._areas.remove(hazeArea);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        onPositioned$1(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        DepthSortedSetKt.observeReads(this, new Choreographers$$ExternalSyntheticLambda1(this, 14));
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if ((this.area.m4106getPositionOnScreenF1C5BW0() & 9223372034707292159L) == 9205357640488583168L) {
                onPositioned$1(layoutCoordinates);
            }
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void onPositioned$1(LayoutCoordinates layoutCoordinates) {
        if (isAttached()) {
            layoutCoordinates.getClass();
            long mo842localToScreenMKHz9U = layoutCoordinates.mo842localToScreenMKHz9U(0L);
            HazeArea hazeArea = this.area;
            hazeArea.positionOnScreen$delegate.setValue(new Offset(mo842localToScreenMKHz9U));
            hazeArea.size$delegate.setValue(new Size(Countries.m3991toSizeozmzZPI(layoutCoordinates.mo838getSizeYbymL2g())));
            hazeArea.windowId = ((View) DepthSortedSetKt.currentValueOf(this, AndroidCompositionLocals_androidKt.LocalView)).getWindowId();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        HazeArea hazeArea = this.area;
        Recorder$$ExternalSyntheticOutline1.m(9205357640488583168L, hazeArea.positionOnScreen$delegate);
        hazeArea.size$delegate.setValue(new Size(9205357640488583168L));
        hazeArea.contentDrawing = false;
    }
}
