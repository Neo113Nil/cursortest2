package dev.chrisbanes.haze;

import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.WindowId;
import androidx.collection.LongSetKt;
import androidx.collection.MutableObjectLongMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.zzg;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import nl.dionsegijn.konfetti.emitters.RenderSystem;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class HazeEffectNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, LayoutAwareModifierNode, ObserverModifierNode, DrawModifierNode, TraversableNode {
    public final float alpha;
    public final MutableObjectLongMap areaOffsets;
    public final Lazy areaPreDrawListener$delegate;
    public List areas;
    public final long backgroundColor;
    public BlurEffect blurEffect;
    public final float blurRadius;
    public final RectangleShapeKt$RectangleShape$1 blurredEdgeTreatment;
    public HazeStyle compositionLocalStyle;
    public final Lazy contentDrawArea$delegate;
    public int dirtyTracker = 0;
    public final HazeTint fallbackTint;
    public final HazeInputScale$None inputScale;
    public long layerOffset;
    public long layerSize;
    public final float noiseFactor;
    public long positionOnScreen;
    public Rect rootBoundsOnScreen;
    public long size;
    public HazeState state;
    public HazeStyle style;
    public final EmptyList tints;
    public WindowId windowId;

    public HazeEffectNode(HazeState hazeState, HazeStyle hazeStyle) {
        this.state = hazeState;
        HazeEffectNodeKt.resolveBlurEnabled(this);
        this.inputScale = HazeInputScale$None.INSTANCE;
        this.compositionLocalStyle = HazeStyle.Unspecified;
        this.style = hazeStyle;
        this.positionOnScreen = 9205357640488583168L;
        this.rootBoundsOnScreen = Rect.Zero;
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap();
        mutableObjectLongMap.metadata = ScatterMapKt.EmptyGroup;
        mutableObjectLongMap.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        mutableObjectLongMap.values = LongSetKt.EmptyLongArray;
        mutableObjectLongMap.initializeStorage(ScatterMapKt.unloadedCapacity(6));
        this.areaOffsets = mutableObjectLongMap;
        this.size = 9205357640488583168L;
        this.layerSize = 9205357640488583168L;
        this.layerOffset = 0L;
        this.blurRadius = Float.NaN;
        this.noiseFactor = -1.0f;
        this.backgroundColor = Color.Unspecified;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.tints = emptyList;
        this.fallbackTint = HazeTint.Unspecified;
        this.alpha = 1.0f;
        this.areas = emptyList;
        this.contentDrawArea$delegate = LazyKt.lazy(new HazeStyleKt$$ExternalSyntheticLambda0(5));
        this.blurEffect = new ScrimBlurEffect(this);
        this.blurredEdgeTreatment = HazeDefaults.blurredEdgeTreatment;
        this.areaPreDrawListener$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Choreographers$$ExternalSyntheticLambda1(this, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0003, B:8:0x000c, B:10:0x0019, B:12:0x001f, B:14:0x0023, B:16:0x002d, B:17:0x0038, B:20:0x003c, B:22:0x0046, B:27:0x0064, B:29:0x007d, B:30:0x0080, B:32:0x004f, B:33:0x0086), top: B:2:0x0003 }] */
    @Override // androidx.compose.ui.node.DrawModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        try {
            if (!isAttached()) {
                this.dirtyTracker = 0;
                return;
            }
            if (canvasDrawScope.mo753getSizeNHjbRc() == 9205357640488583168L || this.layerSize == 9205357640488583168L) {
                HazeKt.drawContentSafely(layoutNodeDrawScope);
            } else if (this.state != null) {
                if (!this.areas.isEmpty()) {
                    HazeKt.updateBlurEffectIfNeeded(this, layoutNodeDrawScope);
                    this.blurEffect.drawEffect(layoutNodeDrawScope);
                }
                HazeKt.drawContentSafely(layoutNodeDrawScope);
            } else {
                GraphicsLayer contentLayer = getContentDrawArea().getContentLayer();
                if (contentLayer != null) {
                    if (contentLayer.isReleased) {
                        contentLayer = null;
                    }
                    if (contentLayer != null) {
                        layoutNodeDrawScope.m876recordJVtK1S4(Countries.m3990toIntSizeuvyYCjk(canvasDrawScope.mo753getSizeNHjbRc()), contentLayer, new HazeEffectNode$$ExternalSyntheticLambda2(layoutNodeDrawScope));
                        HazeKt.updateBlurEffectIfNeeded(this, layoutNodeDrawScope);
                        if (this.blurEffect instanceof ScrimBlurEffect) {
                            SizeKt.drawLayer(layoutNodeDrawScope, contentLayer);
                        }
                        this.blurEffect.drawEffect(layoutNodeDrawScope);
                    }
                }
                contentLayer = ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).graphicsContext.createGraphicsLayer();
                getContentDrawArea().contentLayer$delegate.setValue(contentLayer);
                layoutNodeDrawScope.m876recordJVtK1S4(Countries.m3990toIntSizeuvyYCjk(canvasDrawScope.mo753getSizeNHjbRc()), contentLayer, new HazeEffectNode$$ExternalSyntheticLambda2(layoutNodeDrawScope));
                HazeKt.updateBlurEffectIfNeeded(this, layoutNodeDrawScope);
                if (this.blurEffect instanceof ScrimBlurEffect) {
                }
                this.blurEffect.drawEffect(layoutNodeDrawScope);
            }
            this.dirtyTracker = 0;
        } catch (Throwable th) {
            this.dirtyTracker = 0;
            throw th;
        }
    }

    public final HazeArea getContentDrawArea() {
        return (HazeArea) this.contentDrawArea$delegate.getValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return HazeTraversableNodeKeys.Effect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        onPositioned(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        DepthSortedSetKt.observeReads(this, new RenderSystem.AnonymousClass1(0, this, HazeEffectNode.class, "updateEffect", "updateEffect()V", 0, 10));
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if ((this.positionOnScreen & 9223372034707292159L) == 9205357640488583168L) {
                onPositioned(layoutCoordinates);
            }
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void onPositioned(LayoutCoordinates layoutCoordinates) {
        if (isAttached()) {
            layoutCoordinates.getClass();
            long mo842localToScreenMKHz9U = layoutCoordinates.mo842localToScreenMKHz9U(0L);
            if (!Offset.m622equalsimpl0(mo842localToScreenMKHz9U, this.positionOnScreen)) {
                this.dirtyTracker |= 4;
                this.positionOnScreen = mo842localToScreenMKHz9U;
            }
            long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(layoutCoordinates.mo838getSizeYbymL2g());
            if (!Size.m639equalsimpl0(m3991toSizeozmzZPI, this.size)) {
                this.dirtyTracker |= 16;
                this.size = m3991toSizeozmzZPI;
            }
            this.windowId = ((View) DepthSortedSetKt.currentValueOf(this, AndroidCompositionLocals_androidKt.LocalView)).getWindowId();
            LayoutCoordinates findRootCoordinates = ValueInsets.findRootCoordinates(layoutCoordinates);
            Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(findRootCoordinates.mo842localToScreenMKHz9U(0L), Countries.m3991toSizeozmzZPI(findRootCoordinates.mo838getSizeYbymL2g()));
            if (!m1180Recttz77jQw.equals(this.rootBoundsOnScreen)) {
                this.dirtyTracker |= 4;
                this.rootBoundsOnScreen = m1180Recttz77jQw;
            }
            updateEffect();
        }
    }

    public final void onStyleChanged(HazeStyle hazeStyle, HazeStyle hazeStyle2) {
        if (!Intrinsics.areEqual(hazeStyle != null ? hazeStyle.tints : null, hazeStyle2.tints)) {
            this.dirtyTracker |= 512;
        }
        if (!Intrinsics.areEqual(hazeStyle != null ? hazeStyle.fallbackTint : null, hazeStyle2.fallbackTint)) {
            this.dirtyTracker |= 512;
        }
        if (!Intrinsics.areEqual(hazeStyle != null ? new Color(hazeStyle.backgroundColor) : null, new Color(hazeStyle2.backgroundColor))) {
            this.dirtyTracker |= 256;
        }
        if (!Intrinsics.areEqual(hazeStyle != null ? Float.valueOf(hazeStyle.noiseFactor) : null, Float.valueOf(hazeStyle2.noiseFactor))) {
            this.dirtyTracker |= 64;
        }
        if (Intrinsics.areEqual(hazeStyle != null ? new Dp(hazeStyle.blurRadius) : null, new Dp(hazeStyle2.blurRadius))) {
            return;
        }
        this.dirtyTracker |= 32;
    }

    public final void setAreas$haze_release(List list) {
        Lazy lazy;
        list.getClass();
        if (list.equals(this.areas)) {
            return;
        }
        this.dirtyTracker |= PKIFailureInfo.certRevoked;
        Iterator it = this.areas.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            lazy = this.areaPreDrawListener$delegate;
            if (!hasNext) {
                break;
            } else {
                ((HazeArea) it.next()).preDrawListeners.remove((HazeEffectNode$areaPreDrawListener$2$1) lazy.getValue());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((HazeArea) it2.next()).preDrawListeners.add((HazeEffectNode$areaPreDrawListener$2$1) lazy.getValue());
        }
        this.areas = list;
    }

    public final void setBlurEffect$haze_release(BlurEffect blurEffect) {
        blurEffect.getClass();
        if (blurEffect.equals(this.blurEffect)) {
            return;
        }
        this.blurEffect.cleanup();
        this.blurEffect = blurEffect;
    }

    /* renamed from: setLayerOffset-k-4lQ0M$haze_release, reason: not valid java name */
    public final void m4107setLayerOffsetk4lQ0M$haze_release(long j) {
        if (Offset.m622equalsimpl0(j, this.layerOffset)) {
            return;
        }
        this.dirtyTracker |= 32768;
        this.layerOffset = j;
    }

    /* renamed from: setLayerSize-uvyYCjk$haze_release, reason: not valid java name */
    public final void m4108setLayerSizeuvyYCjk$haze_release(long j) {
        if (Size.m639equalsimpl0(j, this.layerSize)) {
            return;
        }
        this.dirtyTracker |= 16384;
        this.layerSize = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0302, code lost:
    
        if (((r3[r12 >> 3] >> ((r12 & 7) << 3)) & r28) >= r18) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0304, code lost:
    
        r13 = r4[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0306, code lost:
    
        if (r13 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0308, code lost:
    
        r15 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x030f, code lost:
    
        r15 = r15 * (-862048943);
        r15 = r15 ^ (r15 << 16);
        r0 = r1.findFirstAvailableSlot(r15 >>> 7);
        r27 = r2;
        r26 = r3;
        r2 = r15 & 127;
        r15 = r0 >> 3;
        r30 = (r0 & 7) << 3;
        r2 = (r27[r15] & (~(r28 << r30))) | (r2 << r30);
        r27[r15] = r2;
        r27[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r7[r0] = r13;
        r8[r0] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x034d, code lost:
    
        r12 = r12 + 1;
        r3 = r26;
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x030d, code lost:
    
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0349, code lost:
    
        r27 = r2;
        r26 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d4, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x016e, code lost:
    
        r33 = r4;
        r34 = r5;
        r35 = r12;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
    
        if (((((~r8) << 6) & r8) & r16) == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0152, code lost:
    
        r2 = r1.findFirstAvailableSlot(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0158, code lost:
    
        if (r1.growthLimit != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016c, code lost:
    
        if (((r1.metadata[r2 >> 3] >> ((r2 & 7) << 3)) & r28) != 254) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
    
        r2 = r1._capacity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017c, code lost:
    
        if (r2 <= 8) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017e, code lost:
    
        r18 = 128;
        r6 = r1._size;
        r3 = kotlin.ULong.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0190, code lost:
    
        if (java.lang.Long.compareUnsigned(r6 * 32, r2 * 25) > 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0192, code lost:
    
        r2 = r1.metadata;
        r3 = r1._capacity;
        r7 = r1.keys;
        r8 = r1.values;
        r6 = (r3 + 7) >> 3;
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a0, code lost:
    
        if (r9 >= r6) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a2, code lost:
    
        r35 = r12;
        r12 = r2[r9] & r16;
        r2[r9] = ((~r12) + (r12 >>> r35)) & (-72340172838076674L);
        r9 = r9 + 1;
        r13 = r13;
        r4 = r4;
        r5 = r5;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c5, code lost:
    
        r33 = r4;
        r34 = r5;
        r35 = r12;
        r21 = r13;
        r4 = kotlin.collections.ArraysKt___ArraysKt.getLastIndex(r2);
        r5 = r4 - 1;
        r2[r5] = (r2[r5] & 72057594037927935L) | (-72057594037927936L);
        r2[r4] = r2[r19];
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e8, code lost:
    
        if (r4 == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ea, code lost:
    
        r5 = r4 >> 3;
        r9 = (r4 & 7) << 3;
        r12 = (r2[r5] >> r9) & r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f7, code lost:
    
        if (r12 != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fe, code lost:
    
        if (r12 == 254) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0201, code lost:
    
        r6 = r7[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0203, code lost:
    
        if (r6 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0205, code lost:
    
        r6 = r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020c, code lost:
    
        r6 = r6 * r21;
        r6 = ((r6 << 16) ^ r6) >>> 7;
        r13 = r1.findFirstAvailableSlot(r6);
        r6 = r6 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0226, code lost:
    
        if ((((r13 - r6) & r3) / 8) != (((r4 - r6) & r3) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0228, code lost:
    
        r6 = r3;
        r2[r5] = (r2[r5] & (~(r28 << r9))) | ((r12 & 127) << r9);
        r2[r2.length - 1] = (r2[r19] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0245, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0247, code lost:
    
        r6 = r3;
        r15 = r4;
        r3 = r13 >> 3;
        r41 = r2[r3];
        r4 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0257, code lost:
    
        if (((r41 >> r4) & r28) != 128) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0259, code lost:
    
        r2[r3] = (r41 & (~(r28 << r4))) | ((r12 & 127) << r4);
        r2[r5] = (r2[r5] & (~(r28 << r9))) | (128 << r9);
        r7[r13] = r7[r15];
        r7[r15] = r23;
        r8[r13] = r8[r15];
        r8[r15] = 0;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b0, code lost:
    
        r2[r2.length - 1] = (r2[r19] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028a, code lost:
    
        r2[r3] = (r41 & (~(r28 << r4))) | ((r12 & 127) << r4);
        r3 = r7[r13];
        r7[r13] = r7[r15];
        r7[r15] = r3;
        r3 = r8[r13];
        r8[r13] = r8[r15];
        r8[r15] = r3;
        r4 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020a, code lost:
    
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02be, code lost:
    
        r1.growthLimit = androidx.collection.ScatterMapKt.loadedCapacity(r1._capacity) - r1._size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0356, code lost:
    
        r2 = r1.findFirstAvailableSlot(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x035a, code lost:
    
        r1._size++;
        r0 = r1.growthLimit;
        r3 = r1.metadata;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0372, code lost:
    
        if (((r5 >> r7) & r28) != r18) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0375, code lost:
    
        r22 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0377, code lost:
    
        r1.growthLimit = r0 - r22;
        r0 = r1._capacity;
        r5 = (r5 & (~(r28 << r7))) | (r10 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r0) + (r0 & 7)) >> 3] = r5;
        r0 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02cb, code lost:
    
        r33 = r4;
        r34 = r5;
        r35 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02d7, code lost:
    
        r2 = androidx.collection.ScatterMapKt.nextCapacity(r1._capacity);
        r3 = r1.metadata;
        r4 = r1.keys;
        r5 = r1.values;
        r6 = r1._capacity;
        r1.initializeStorage(r2);
        r2 = r1.metadata;
        r7 = r1.keys;
        r8 = r1.values;
        r9 = r1._capacity;
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02f2, code lost:
    
        if (r12 >= r6) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateAreaOffsets() {
        long j;
        Object obj;
        long j2;
        long j3;
        Iterator it;
        HazeArea hazeArea;
        char c;
        int i;
        HazeEffectNode hazeEffectNode = this;
        MutableObjectLongMap mutableObjectLongMap = hazeEffectNode.areaOffsets;
        if (mutableObjectLongMap._size == hazeEffectNode.areas.size()) {
            List<HazeArea> list = hazeEffectNode.areas;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (HazeArea hazeArea2 : list) {
                long m625minusMKHz9U = Offset.m625minusMKHz9U(hazeEffectNode.positionOnScreen, hazeArea2.m4106getPositionOnScreenF1C5BW0());
                if (mutableObjectLongMap.findKeyIndex(hazeArea2) >= 0) {
                    int findKeyIndex = mutableObjectLongMap.findKeyIndex(hazeArea2);
                    if (findKeyIndex < 0) {
                        throw new NoSuchElementException("There is no key " + hazeArea2 + " in the map");
                    }
                    if (mutableObjectLongMap.values[findKeyIndex] != m625minusMKHz9U) {
                    }
                }
            }
            return;
        }
        hazeEffectNode.dirtyTracker |= 8;
        int i2 = 0;
        mutableObjectLongMap._size = 0;
        long[] jArr = mutableObjectLongMap.metadata;
        long j4 = 255;
        char c2 = 7;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L);
            long[] jArr2 = mutableObjectLongMap.metadata;
            int i3 = mutableObjectLongMap._capacity;
            int i4 = i3 >> 3;
            long j5 = 255 << ((i3 & 7) << 3);
            j = -9187201950435737472L;
            jArr2[i4] = (jArr2[i4] & (~j5)) | j5;
        } else {
            j = -9187201950435737472L;
        }
        Object obj2 = null;
        ArraysKt___ArraysJvmKt.fill(mutableObjectLongMap.keys, 0, mutableObjectLongMap._capacity, null);
        mutableObjectLongMap.growthLimit = ScatterMapKt.loadedCapacity(mutableObjectLongMap._capacity) - mutableObjectLongMap._size;
        Iterator it2 = hazeEffectNode.areas.iterator();
        while (it2.hasNext()) {
            HazeArea hazeArea3 = (HazeArea) it2.next();
            long m625minusMKHz9U2 = Offset.m625minusMKHz9U(hazeEffectNode.positionOnScreen, hazeArea3.m4106getPositionOnScreenF1C5BW0());
            int i5 = -862048943;
            int hashCode = hazeArea3.hashCode() * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = mutableObjectLongMap._capacity;
            int i10 = i7 & i9;
            int i11 = i2;
            while (true) {
                long[] jArr3 = mutableObjectLongMap.metadata;
                int i12 = i10 >> 3;
                obj = obj2;
                int i13 = (i10 & 7) << 3;
                int i14 = 1;
                j2 = j4;
                long j6 = (jArr3[i12] >>> i13) | ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                char c3 = c2;
                j3 = m625minusMKHz9U2;
                long j7 = i8;
                char c4 = c3;
                long j8 = j6 ^ (j7 * 72340172838076673L);
                long j9 = (j8 - 72340172838076673L) & (~j8) & j;
                while (true) {
                    if (j9 == 0) {
                        break;
                    }
                    int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j9) >> 3)) & i9;
                    if (Intrinsics.areEqual(mutableObjectLongMap.keys[numberOfTrailingZeros], hazeArea3)) {
                        it = it2;
                        hazeArea = hazeArea3;
                        c = c4;
                        i = numberOfTrailingZeros;
                        break;
                    }
                    j9 &= j9 - 1;
                }
                i11 += 8;
                i10 = (i10 + i11) & i9;
                obj2 = obj;
                m625minusMKHz9U2 = j3;
                j4 = j2;
                c2 = c4;
            }
            if (i < 0) {
                i = ~i;
            }
            mutableObjectLongMap.keys[i] = hazeArea;
            mutableObjectLongMap.values[i] = j3;
            hazeEffectNode = this;
            i2 = i11;
            obj2 = obj;
            j4 = j2;
            it2 = it;
            c2 = c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[Catch: all -> 0x0321, TryCatch #0 {all -> 0x0321, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0024, B:8:0x002b, B:11:0x0041, B:12:0x0049, B:15:0x0051, B:19:0x0066, B:21:0x0070, B:23:0x0076, B:26:0x0082, B:28:0x0086, B:30:0x008c, B:31:0x008e, B:32:0x00a6, B:34:0x00af, B:36:0x00b7, B:38:0x00bd, B:39:0x00f8, B:44:0x013a, B:45:0x0140, B:47:0x0146, B:49:0x0158, B:52:0x016f, B:54:0x017a, B:56:0x0184, B:58:0x018a, B:60:0x0196, B:63:0x01a8, B:69:0x01db, B:71:0x01e6, B:72:0x01f3, B:74:0x01f9, B:76:0x0216, B:78:0x021f, B:80:0x0237, B:86:0x0250, B:87:0x027d, B:90:0x028e, B:93:0x029b, B:94:0x030d, B:98:0x031a, B:103:0x01d7, B:104:0x01ce, B:108:0x02c1, B:110:0x02c7, B:113:0x02cc, B:114:0x0303, B:116:0x0104, B:120:0x0109, B:122:0x0111, B:125:0x011b, B:126:0x011f, B:128:0x0125, B:136:0x00c8), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a A[Catch: all -> 0x0321, TryCatch #0 {all -> 0x0321, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0024, B:8:0x002b, B:11:0x0041, B:12:0x0049, B:15:0x0051, B:19:0x0066, B:21:0x0070, B:23:0x0076, B:26:0x0082, B:28:0x0086, B:30:0x008c, B:31:0x008e, B:32:0x00a6, B:34:0x00af, B:36:0x00b7, B:38:0x00bd, B:39:0x00f8, B:44:0x013a, B:45:0x0140, B:47:0x0146, B:49:0x0158, B:52:0x016f, B:54:0x017a, B:56:0x0184, B:58:0x018a, B:60:0x0196, B:63:0x01a8, B:69:0x01db, B:71:0x01e6, B:72:0x01f3, B:74:0x01f9, B:76:0x0216, B:78:0x021f, B:80:0x0237, B:86:0x0250, B:87:0x027d, B:90:0x028e, B:93:0x029b, B:94:0x030d, B:98:0x031a, B:103:0x01d7, B:104:0x01ce, B:108:0x02c1, B:110:0x02c7, B:113:0x02cc, B:114:0x0303, B:116:0x0104, B:120:0x0109, B:122:0x0111, B:125:0x011b, B:126:0x011f, B:128:0x0125, B:136:0x00c8), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031a A[Catch: all -> 0x0321, TRY_LEAVE, TryCatch #0 {all -> 0x0321, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0024, B:8:0x002b, B:11:0x0041, B:12:0x0049, B:15:0x0051, B:19:0x0066, B:21:0x0070, B:23:0x0076, B:26:0x0082, B:28:0x0086, B:30:0x008c, B:31:0x008e, B:32:0x00a6, B:34:0x00af, B:36:0x00b7, B:38:0x00bd, B:39:0x00f8, B:44:0x013a, B:45:0x0140, B:47:0x0146, B:49:0x0158, B:52:0x016f, B:54:0x017a, B:56:0x0184, B:58:0x018a, B:60:0x0196, B:63:0x01a8, B:69:0x01db, B:71:0x01e6, B:72:0x01f3, B:74:0x01f9, B:76:0x0216, B:78:0x021f, B:80:0x0237, B:86:0x0250, B:87:0x027d, B:90:0x028e, B:93:0x029b, B:94:0x030d, B:98:0x031a, B:103:0x01d7, B:104:0x01ce, B:108:0x02c1, B:110:0x02c7, B:113:0x02cc, B:114:0x0303, B:116:0x0104, B:120:0x0109, B:122:0x0111, B:125:0x011b, B:126:0x011f, B:128:0x0125, B:136:0x00c8), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateEffect() {
        Lazy lazy;
        List list;
        boolean z;
        float resolveBlurRadius;
        float f;
        long j;
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("HazeEffectNode-updateEffect"));
        try {
            if (isAttached()) {
                HazeStyle hazeStyle = (HazeStyle) DepthSortedSetKt.currentValueOf(this, HazeStyleKt.LocalHazeStyle);
                hazeStyle.getClass();
                if (!Intrinsics.areEqual(this.compositionLocalStyle, hazeStyle)) {
                    onStyleChanged(this.compositionLocalStyle, hazeStyle);
                    this.compositionLocalStyle = hazeStyle;
                }
                this.windowId = ((View) DepthSortedSetKt.currentValueOf(this, AndroidCompositionLocals_androidKt.LocalView)).getWindowId();
                boolean z2 = this.state != null;
                Iterator it = this.areas.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    lazy = this.areaPreDrawListener$delegate;
                    if (!hasNext) {
                        break;
                    } else {
                        ((HazeArea) it.next()).preDrawListeners.remove((HazeEffectNode$areaPreDrawListener$2$1) lazy.getValue());
                    }
                }
                if (z2) {
                    TraversableNode findNearestAncestor = DepthSortedSetKt.findNearestAncestor(this, HazeTraversableNodeKeys.Source);
                    HazeSourceNode hazeSourceNode = findNearestAncestor instanceof HazeSourceNode ? (HazeSourceNode) findNearestAncestor : null;
                    if (hazeSourceNode == null || !Intrinsics.areEqual(hazeSourceNode.state, this.state)) {
                        hazeSourceNode = null;
                    }
                    HazeState hazeState = this.state;
                    Iterable iterable = hazeState != null ? hazeState._areas : null;
                    if (iterable == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                    FilteringSequence filter = SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(iterable), new HazeEffectNode$$ExternalSyntheticLambda3(this, hazeSourceNode));
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = filter.iterator();
                    while (true) {
                        FilteringSequence$iterator$1 filteringSequence$iterator$1 = (FilteringSequence$iterator$1) it2;
                        if (!filteringSequence$iterator$1.hasNext()) {
                            break;
                        } else {
                            arrayList.add(filteringSequence$iterator$1.next());
                        }
                    }
                    int size = arrayList.size();
                    list = arrayList;
                    if (size > 1) {
                        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new LinkedHashTreeMap.AnonymousClass1(23));
                        list = arrayList;
                    }
                } else {
                    getContentDrawArea().size$delegate.setValue(new Size(this.size));
                    getContentDrawArea().positionOnScreen$delegate.setValue(new Offset(this.positionOnScreen));
                    getContentDrawArea().windowId = this.windowId;
                    list = CollectionsKt__CollectionsJVMKt.listOf(getContentDrawArea());
                }
                setAreas$haze_release(list);
                if (HazeEffectNodeKt.resolveBlurEnabled(this)) {
                    if (Build.VERSION.SDK_INT >= 32) {
                        List list2 = this.areas;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                if (!Intrinsics.areEqual(((HazeArea) it3.next()).windowId, this.windowId)) {
                                }
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        Iterator it4 = this.areas.iterator();
                        while (it4.hasNext()) {
                            ((HazeArea) it4.next()).preDrawListeners.add((HazeEffectNode$areaPreDrawListener$2$1) lazy.getValue());
                        }
                    }
                    updateAreaOffsets();
                    Density density = (Density) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalDensity);
                    resolveBlurRadius = HazeEffectNodeKt.resolveBlurRadius(this);
                    if (!Float.isNaN(resolveBlurRadius)) {
                        resolveBlurRadius = RecyclerView.DECELERATION_RATE;
                    }
                    float mo236toPx0680j_4 = density.mo236toPx0680j_4(resolveBlurRadius);
                    if (z2 || this.areas.isEmpty() || this.size == 9205357640488583168L || (this.positionOnScreen & 9223372034707292159L) == 9205357640488583168L) {
                        if (!z2) {
                            if (this.size != 9205357640488583168L && this.blurredEdgeTreatment == null) {
                                float f2 = 2.0f * mo236toPx0680j_4;
                                m4108setLayerSizeuvyYCjk$haze_release((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r1 >> 32)) + f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.size & BodyPartID.bodyIdMax)) + f2) & BodyPartID.bodyIdMax));
                                m4107setLayerOffsetk4lQ0M$haze_release((Float.floatToRawIntBits(mo236toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_4) & BodyPartID.bodyIdMax));
                            }
                        }
                        m4108setLayerSizeuvyYCjk$haze_release(this.size);
                        m4107setLayerOffsetk4lQ0M$haze_release(0L);
                    } else {
                        Density density2 = DepthSortedSetKt.requireLayoutNode(this).density;
                        float resolveBlurRadius2 = HazeEffectNodeKt.resolveBlurRadius(this);
                        if (Float.isNaN(resolveBlurRadius2)) {
                            resolveBlurRadius2 = RecyclerView.DECELERATION_RATE;
                        }
                        float mo236toPx0680j_42 = density2.mo236toPx0680j_4(resolveBlurRadius2);
                        Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(this.positionOnScreen, this.size);
                        Rect rect = new Rect(m1180Recttz77jQw.left - mo236toPx0680j_42, m1180Recttz77jQw.top - mo236toPx0680j_42, m1180Recttz77jQw.right + mo236toPx0680j_42, m1180Recttz77jQw.bottom + mo236toPx0680j_42);
                        long j2 = this.backgroundColor;
                        if (j2 == 16) {
                            j2 = this.style.backgroundColor;
                        }
                        if (j2 == 16) {
                            j2 = this.compositionLocalStyle.backgroundColor;
                        }
                        if (Color.m677getAlphaimpl(j2) <= 0.9f) {
                            float f3 = Float.NEGATIVE_INFINITY;
                            float f4 = Float.POSITIVE_INFINITY;
                            float f5 = Float.POSITIVE_INFINITY;
                            float f6 = Float.NEGATIVE_INFINITY;
                            for (HazeArea hazeArea : this.areas) {
                                Rect m1180Recttz77jQw2 = (((Size) hazeArea.size$delegate.getValue()).packedValue == 9205357640488583168L || (hazeArea.m4106getPositionOnScreenF1C5BW0() & 9223372034707292159L) == 9205357640488583168L) ? null : DBUtil.m1180Recttz77jQw(hazeArea.m4106getPositionOnScreenF1C5BW0(), ((Size) hazeArea.size$delegate.getValue()).packedValue);
                                if (m1180Recttz77jQw2 != null) {
                                    f4 = Math.min(f4, m1180Recttz77jQw2.left);
                                    f5 = Math.min(f5, m1180Recttz77jQw2.top);
                                    f3 = Math.max(f3, m1180Recttz77jQw2.right);
                                    f6 = Math.max(f6, m1180Recttz77jQw2.bottom);
                                }
                            }
                            f = RecyclerView.DECELERATION_RATE;
                            j = BodyPartID.bodyIdMax;
                            rect = new Rect(Math.max(rect.left, f4), Math.max(rect.top, f5), Math.min(rect.right, f3), Math.min(rect.bottom, f6));
                        } else {
                            f = RecyclerView.DECELERATION_RATE;
                            j = BodyPartID.bodyIdMax;
                        }
                        Rect intersect = rect.intersect(this.rootBoundsOnScreen);
                        float f7 = intersect.right - intersect.left;
                        if (f7 < f) {
                            f7 = f;
                        }
                        m4108setLayerSizeuvyYCjk$haze_release((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(intersect.bottom - intersect.top < f ? f : r3) & j));
                        m4107setLayerOffsetk4lQ0M$haze_release(Offset.m625minusMKHz9U(this.positionOnScreen, intersect.m636getTopLeftF1C5BW0()));
                    }
                    if ((this.dirtyTracker & 2097151) == 0) {
                        DepthSortedSetKt.invalidateDraw(this);
                    }
                }
                z = false;
                if (z) {
                }
                updateAreaOffsets();
                Density density3 = (Density) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalDensity);
                resolveBlurRadius = HazeEffectNodeKt.resolveBlurRadius(this);
                if (!Float.isNaN(resolveBlurRadius)) {
                }
                float mo236toPx0680j_43 = density3.mo236toPx0680j_4(resolveBlurRadius);
                if (z2) {
                }
                if (!z2) {
                }
                m4108setLayerSizeuvyYCjk$haze_release(this.size);
                m4107setLayerOffsetk4lQ0M$haze_release(0L);
                if ((this.dirtyTracker & 2097151) == 0) {
                }
            }
        } finally {
            Trace.endSection();
        }
    }
}
