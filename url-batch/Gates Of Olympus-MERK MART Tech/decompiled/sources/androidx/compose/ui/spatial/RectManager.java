package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: RectManager.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u0010J5\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0010J\u000e\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0012J\u0006\u0010(\u001a\u00020\u0010J\u0016\u0010)\u001a\u0004\u0018\u00010\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ:\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u0002012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001002J:\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u0002012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001002J\u0010\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0001J\u000e\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0004J\u001e\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0012J\u000e\u0010<\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0004J\u0018\u0010=\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020\u0012J\u0015\u0010?\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b@\u0010AJ\f\u0010B\u001a\u00020\u0010*\u00020\u0004H\u0002J\u0010\u0010C\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0004H\u0002J\u0010\u0010F\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0004H\u0002J\u0014\u0010G\u001a\u00020\u0010*\u00020H2\u0006\u0010I\u001a\u00020EH\u0002J\f\u0010J\u001a\u00020\u0012*\u00020HH\u0002J\u0013\u0010K\u001a\u00020\u001c*\u00020\u0004H\u0002¢\u0006\u0004\bL\u0010AJ\u000e\u0010M\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0004J\u001d\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020!2\u0006\u0010P\u001a\u00020!H\u0000¢\u0006\u0002\bQJ7\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010T\u001a\u00020!2\u0006\u0010U\u001a\u00020!2\u0006\u0010V\u001a\u00020!2\u0006\u0010W\u001a\u00020!2\u0006\u0010X\u001a\u00020!H\u0000¢\u0006\u0002\bYJ1\u0010Z\u001a\u00020\u0012*\u0002012\u0006\u0010T\u001a\u00020!2\u0006\u0010U\u001a\u00020!2\u0006\u0010V\u001a\u00020!2\u0006\u0010W\u001a\u00020!H\u0000¢\u0006\u0002\b[J\u0019\u0010\\\u001a\u00020\u0012*\u00020\u00042\u0006\u0010]\u001a\u00020\u0004H\u0000¢\u0006\u0002\b^J\u000e\u0010_\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "layoutNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "<init>", "(Landroidx/collection/IntObjectMap;)V", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "throttledCallbacks", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "callbacks", "Landroidx/collection/MutableObjectList;", "Lkotlin/Function0;", "", "isDirty", "", "isScreenOrWindowDirty", "isFragmented", "dispatchToken", "scheduledDispatchDeadline", "", "dispatchLambda", "invalidate", "updateOffsets", "screenOffset", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "windowWidth", "", "windowHeight", "updateOffsets-gTq6Wqs", "(JJ[FII)V", "dispatchCallbacks", "scheduleDebounceCallback", "ensureSomethingScheduled", "removeScheduledCallback", "registerOnChangedCallback", "callback", "registerOnRectChangedCallback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "id", "throttleMillis", "debounceMillis", "node", "Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "registerOnGlobalLayoutCallback", "unregisterOnChangedCallback", "token", "invalidateCallbacksFor", "layoutNode", "updateFlagsFor", "focusable", "gesturable", "onLayoutLayerPositionalPropertiesChanged", "onLayoutPositionChanged", "forceUpdate", "getOffsetFromRectListFor", "getOffsetFromRectListFor-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "resetHasPositionalLayerTransformationsForSubtreeIfNeeded", "insertOrUpdateTransformedNodeSubhierarchy", "cachedRect", "Landroidx/compose/ui/geometry/MutableRect;", "insertOrUpdateTransformedNode", "boundingRectInRoot", "Landroidx/compose/ui/node/NodeCoordinator;", "rect", "hasPositionalLayerTransformations", "outerToInnerOffset", "outerToInnerOffset-Bjo55l4", "remove", "isTargetDrawnFirst", "targetId", "otherId", "isTargetDrawnFirst$ui", "findFocusableNodeFromRect", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "left", "top", "right", "bottom", "containerId", "findFocusableNodeFromRect$ui", "intersects", "intersects$ui", "isDescendantOf", "container", "isDescendantOf$ui", "unsetHasCallbacksFor", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final MutableObjectList<Function0<Unit>> callbacks;
    private final Function0<Unit> dispatchLambda;
    private Object dispatchToken;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final IntObjectMap<LayoutNode> layoutNodes;
    private final RectList rects;
    private long scheduledDispatchDeadline;
    private final ThrottledCallbacks throttledCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RectManager(IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RectManager.this.dispatchToken = null;
                RectManager rectManager = RectManager.this;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap);
    }

    public final RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    /* renamed from: updateOffsets-gTq6Wqs, reason: not valid java name */
    public final void m7434updateOffsetsgTq6Wqs(long screenOffset, long windowOffset, float[] viewToWindowMatrix, int windowWidth, int windowHeight) {
        int m7437analyzeComponents58bKbWc;
        m7437analyzeComponents58bKbWc = RectManagerKt.m7437analyzeComponents58bKbWc(viewToWindowMatrix);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((m7437analyzeComponents58bKbWc & 2) != 0) {
            viewToWindowMatrix = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m7451updateOffsetsLDcG7Xg(screenOffset, windowOffset, viewToWindowMatrix, windowWidth, windowHeight) || this.isScreenOrWindowDirty;
    }

    public final void dispatchCallbacks() {
        removeScheduledCallback();
        long currentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z = this.isDirty;
        boolean z2 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            MutableObjectList<Function0<Unit>> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((Function0) objArr[i2]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i3 = rectList.itemsSize;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j = jArr[i4 + 2];
                if ((((int) (j >> 60)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(33554431 & ((int) j), jArr[i4], jArr[i4 + 1], currentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(currentTimeMillis);
        }
        if (z2) {
            this.throttledCallbacks.fireGlobalChangeEntries(currentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(currentTimeMillis);
        if (this.throttledCallbacks.getMinDebounceDeadline() > 0) {
            scheduleDebounceCallback(true);
        }
    }

    public final void scheduleDebounceCallback(boolean ensureSomethingScheduled) {
        boolean z = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                Actual_androidKt.removePost(obj);
            }
            long currentTimeMillis = Actual_androidKt.currentTimeMillis();
            long max = Math.max(minDebounceDeadline, 16 + currentTimeMillis);
            this.scheduledDispatchDeadline = max;
            this.dispatchToken = Actual_androidKt.postDelayed(max - currentTimeMillis, this.dispatchLambda);
        }
    }

    public final void removeScheduledCallback() {
        Object obj = this.dispatchToken;
        if (obj != null) {
            Actual_androidKt.removePost(obj);
            this.dispatchToken = null;
        }
    }

    public final Object registerOnChangedCallback(Function0<Unit> callback) {
        this.callbacks.add(callback);
        return callback;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> callback) {
        DelegatableNode.RegistrationHandle registerOnRectChanged = this.throttledCallbacks.registerOnRectChanged(id, throttleMillis, debounceMillis, node, callback);
        if (DelegatableNodeKt.requireLayoutNode(node.getNode()).getAddedToRectList()) {
            this.rects.updateHasCallbacks(id, true);
        }
        invalidate();
        scheduleDebounceCallback(true);
        return registerOnRectChanged;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> callback) {
        return this.throttledCallbacks.registerOnGlobalChange(id, throttleMillis, debounceMillis, node, callback);
    }

    public final void unregisterOnChangedCallback(Object token) {
        if ((TypeIntrinsics.isFunctionOfArity(token, 0) ? (Function0) token : null) == null) {
            return;
        }
        this.callbacks.remove(token);
    }

    public final void invalidateCallbacksFor(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.isDirty = true;
            this.rects.markUpdated(layoutNode.getSemanticsId());
        }
        scheduleDebounceCallback(true);
    }

    public final void updateFlagsFor(LayoutNode layoutNode, boolean focusable, boolean gesturable) {
        if (layoutNode.isAttached()) {
            this.rects.updateFlagsFor(layoutNode.getSemanticsId(), focusable, gesturable);
        }
    }

    public final void onLayoutLayerPositionalPropertiesChanged(LayoutNode layoutNode) {
        boolean m7438isSetgyyYBs;
        if (layoutNode.isPlaced()) {
            long m7432outerToInnerOffsetBjo55l4 = m7432outerToInnerOffsetBjo55l4(layoutNode);
            m7438isSetgyyYBs = RectManagerKt.m7438isSetgyyYBs(m7432outerToInnerOffsetBjo55l4);
            if (m7438isSetgyyYBs) {
                layoutNode.m7079setOuterToInnerOffsetgyyYBs$ui(m7432outerToInnerOffsetBjo55l4);
                layoutNode.setOuterToInnerOffsetDirty$ui(false);
                MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
                LayoutNode[] layoutNodeArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    onLayoutPositionChanged$default(this, layoutNodeArr[i], false, 2, null);
                }
                invalidateCallbacksFor(layoutNode);
                return;
            }
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
        }
    }

    public static /* synthetic */ void onLayoutPositionChanged$default(RectManager rectManager, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        rectManager.onLayoutPositionChanged(layoutNode, z);
    }

    public final void onLayoutPositionChanged(LayoutNode layoutNode, boolean forceUpdate) {
        long m8365getMaxnOccac;
        boolean m7438isSetgyyYBs;
        long j;
        long j2;
        if (layoutNode.isPlaced()) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui != null && !parent$ui.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                if (parent$ui.getOuterToInnerOffsetDirty()) {
                    parent$ui.setOuterToInnerOffsetDirty$ui(false);
                    parent$ui.m7079setOuterToInnerOffsetgyyYBs$ui(m7432outerToInnerOffsetBjo55l4(parent$ui));
                }
                m8365getMaxnOccac = parent$ui.getOuterToInnerOffset();
            } else if (parent$ui == null) {
                m8365getMaxnOccac = IntOffset.INSTANCE.m8366getZeronOccac();
            } else {
                m8365getMaxnOccac = IntOffset.INSTANCE.m8365getMaxnOccac();
            }
            NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            m7438isSetgyyYBs = RectManagerKt.m7438isSetgyyYBs(m8365getMaxnOccac);
            if (m7438isSetgyyYBs && !hasPositionalLayerTransformations(outerCoordinator$ui)) {
                if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                    long m8359plusqkQi6aY = IntOffset.m8359plusqkQi6aY(m8365getMaxnOccac, outerCoordinator$ui.getPosition());
                    MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
                    int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
                    int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
                    long m8393constructorimpl = IntSize.m8393constructorimpl((measuredWidth << 32) | (measuredHeight & 4294967295L));
                    int semanticsId = layoutNode.getSemanticsId();
                    if (layoutNode.getAddedToRectList()) {
                        if (forceUpdate || !IntOffset.m8354equalsimpl0(m8359plusqkQi6aY, layoutNode.getLastOffsetFromParent()) || !IntSize.m8396equalsimpl0(m8393constructorimpl, layoutNode.getLastSize())) {
                            if (parent$ui != null) {
                                this.rects.moveBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m8355getXimpl(m8359plusqkQi6aY), IntOffset.m8356getYimpl(m8359plusqkQi6aY), measuredWidth, measuredHeight);
                            } else {
                                this.rects.move(semanticsId, IntOffset.m8355getXimpl(m8359plusqkQi6aY), IntOffset.m8356getYimpl(m8359plusqkQi6aY), IntOffset.m8355getXimpl(m8359plusqkQi6aY) + measuredWidth, IntOffset.m8356getYimpl(m8359plusqkQi6aY) + measuredHeight);
                            }
                            invalidate();
                        }
                        j = m8359plusqkQi6aY;
                        j2 = m8393constructorimpl;
                    } else {
                        layoutNode.setAddedToRectList$ui(true);
                        boolean m7125hasH91voCI$ui = layoutNode.getNodes().m7125hasH91voCI$ui(NodeKind.m7164constructorimpl(1024));
                        boolean m7125hasH91voCI$ui2 = layoutNode.getNodes().m7125hasH91voCI$ui(NodeKind.m7164constructorimpl(16));
                        boolean containsKey = this.throttledCallbacks.getRectChangedMap().containsKey(semanticsId);
                        if (parent$ui != null) {
                            j = m8359plusqkQi6aY;
                            j2 = m8393constructorimpl;
                            this.rects.insertBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m8355getXimpl(m8359plusqkQi6aY), IntOffset.m8356getYimpl(m8359plusqkQi6aY), measuredWidth, measuredHeight, m7125hasH91voCI$ui, m7125hasH91voCI$ui2, containsKey);
                        } else {
                            j = m8359plusqkQi6aY;
                            j2 = m8393constructorimpl;
                            RectList.insert$default(this.rects, semanticsId, IntOffset.m8355getXimpl(j), IntOffset.m8356getYimpl(j), IntOffset.m8355getXimpl(j) + measuredWidth, IntOffset.m8356getYimpl(j) + measuredHeight, 0, m7125hasH91voCI$ui, m7125hasH91voCI$ui2, containsKey, 0, 544, null);
                        }
                        invalidate();
                    }
                    layoutNode.m7078setLastSizeozmzZPI$ui(j2);
                    layoutNode.m7077setLastOffsetFromParentgyyYBs$ui(j);
                    return;
                }
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNode);
                return;
            }
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
        }
    }

    /* renamed from: getOffsetFromRectListFor-Bjo55l4, reason: not valid java name */
    public final long m7433getOffsetFromRectListForBjo55l4(LayoutNode layoutNode) {
        long topLeft = this.rects.getTopLeft(layoutNode.getSemanticsId());
        if (topLeft == Long.MAX_VALUE) {
            return IntOffset.INSTANCE.m8365getMaxnOccac();
        }
        return IntOffset.m8349constructorimpl((((int) topLeft) & 4294967295L) | (((int) (topLeft >> 32)) << 32));
    }

    private final void resetHasPositionalLayerTransformationsForSubtreeIfNeeded(LayoutNode layoutNode) {
        if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot() || hasPositionalLayerTransformations(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(false);
        if (layoutNode.getOuterToInnerOffsetDirty()) {
            layoutNode.m7079setOuterToInnerOffsetgyyYBs$ui(m7432outerToInnerOffsetBjo55l4(layoutNode));
            layoutNode.setOuterToInnerOffsetDirty$ui(false);
        }
        if (IntOffset.m8354equalsimpl0(layoutNode.getOuterToInnerOffset(), IntOffset.INSTANCE.m8365getMaxnOccac())) {
            return;
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNodeArr[i]);
        }
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        insertOrUpdateTransformedNode(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.isPlaced()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
            }
        }
    }

    private final void insertOrUpdateTransformedNode(LayoutNode layoutNode) {
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(true);
        layoutNode.m7077setLastOffsetFromParentgyyYBs$ui(IntOffset.INSTANCE.m8365getMaxnOccac());
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
        int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        boundingRectInRoot(outerCoordinator$ui, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        boolean addedToRectList = layoutNode.getAddedToRectList();
        layoutNode.setAddedToRectList$ui(true);
        if (!addedToRectList || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            RectList.insert$default(this.rects, semanticsId, left, top, right, bottom, parent$ui != null ? parent$ui.getSemanticsId() : -1, layoutNode.getNodes().m7125hasH91voCI$ui(NodeKind.m7164constructorimpl(1024)), layoutNode.getNodes().m7125hasH91voCI$ui(NodeKind.m7164constructorimpl(16)), this.throttledCallbacks.getRectChangedMap().containsKey(semanticsId), 0, 512, null);
        }
        invalidate();
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                long m7433getOffsetFromRectListForBjo55l4 = m7433getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m8354equalsimpl0(m7433getOffsetFromRectListForBjo55l4, IntOffset.INSTANCE.m8365getMaxnOccac())) {
                    float m8355getXimpl = IntOffset.m8355getXimpl(m7433getOffsetFromRectListForBjo55l4);
                    float m8356getYimpl = IntOffset.m8356getYimpl(m7433getOffsetFromRectListForBjo55l4);
                    mutableRect.m5133translatek4lQ0M(Offset.m5140constructorimpl((Float.floatToRawIntBits(m8356getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m8355getXimpl) << 32)));
                    return;
                }
            }
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] mo7221getUnderlyingMatrixsQKQjiQ = layer.mo7221getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m5664isIdentity58bKbWc(mo7221getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m5647mapimpl(mo7221getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long position = nodeCoordinator.getPosition();
            float m8355getXimpl2 = IntOffset.m8355getXimpl(position);
            float m8356getYimpl2 = IntOffset.m8356getYimpl(position);
            mutableRect.m5133translatek4lQ0M(Offset.m5140constructorimpl((Float.floatToRawIntBits(m8356getYimpl2) & 4294967295L) | (Float.floatToRawIntBits(m8355getXimpl2) << 32)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
        }
    }

    private final boolean hasPositionalLayerTransformations(NodeCoordinator nodeCoordinator) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        return (layer == null || MatrixKt.m5664isIdentity58bKbWc(layer.mo7221getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m7432outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long m8366getZeronOccac = IntOffset.INSTANCE.m8366getZeronOccac();
        for (NodeCoordinator innerCoordinator$ui = layoutNode.getInnerCoordinator$ui(); innerCoordinator$ui != null && innerCoordinator$ui != outerCoordinator$ui; innerCoordinator$ui = innerCoordinator$ui.getWrappedBy()) {
            if (hasPositionalLayerTransformations(innerCoordinator$ui)) {
                return IntOffset.INSTANCE.m8365getMaxnOccac();
            }
            m8366getZeronOccac = IntOffset.m8359plusqkQi6aY(m8366getZeronOccac, innerCoordinator$ui.getPosition());
        }
        return m8366getZeronOccac;
    }

    public final void remove(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.rects.remove(layoutNode.getSemanticsId());
            layoutNode.setAddedToRectList$ui(false);
            invalidate();
            this.isFragmented = true;
        }
    }

    public final boolean isTargetDrawnFirst$ui(int targetId, int otherId) {
        LayoutNode layoutNode;
        LayoutNode parent$ui;
        LayoutNode layoutNode2 = this.layoutNodes.get(targetId);
        if (layoutNode2 != null && (layoutNode = this.layoutNodes.get(otherId)) != null && layoutNode2.getDepth() != 0 && layoutNode.getDepth() != 0) {
            while (layoutNode2.getDepth() > layoutNode.getDepth()) {
                layoutNode2 = layoutNode2.getParent$ui();
                if (layoutNode2 == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            while (layoutNode.getDepth() > layoutNode2.getDepth()) {
                layoutNode = layoutNode.getParent$ui();
                if (layoutNode == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            LayoutNode layoutNode3 = layoutNode2;
            LayoutNode layoutNode4 = layoutNode3;
            LayoutNode layoutNode5 = layoutNode;
            while (layoutNode3 != layoutNode) {
                LayoutNode parent$ui2 = layoutNode3.getParent$ui();
                if (parent$ui2 == null || (parent$ui = layoutNode.getParent$ui()) == null) {
                    return false;
                }
                layoutNode5 = layoutNode;
                layoutNode = parent$ui;
                layoutNode4 = layoutNode3;
                layoutNode3 = parent$ui2;
            }
            if (layoutNode4.getMeasurePassDelegate$ui().getZIndex() == layoutNode5.getMeasurePassDelegate$ui().getZIndex()) {
                return layoutNode4.getPlaceOrder$ui() < layoutNode5.getPlaceOrder$ui();
            }
            if (layoutNode4.getMeasurePassDelegate$ui().getZIndex() < layoutNode5.getMeasurePassDelegate$ui().getZIndex()) {
                return true;
            }
        }
        return false;
    }

    public final FocusTargetModifierNode findFocusableNodeFromRect$ui(int left, int top, int right, int bottom, int containerId) {
        int i;
        LayoutNode layoutNode;
        char c;
        Modifier.Node node;
        int i2;
        LayoutNode layoutNode2;
        boolean z;
        int i3;
        LayoutNode layoutNode3;
        int i4;
        MutableVector mutableVector;
        SemanticsInfo requireSemanticsInfo;
        RectManager rectManager = this;
        LayoutNode layoutNode4 = rectManager.layoutNodes.get(containerId);
        if (layoutNode4 == null) {
            return null;
        }
        FocusTargetNode activeFocusTargetNode = LayoutNodeKt.requireOwner(layoutNode4).getFocusOwner().getActiveFocusTargetNode();
        int semanticsId = (activeFocusTargetNode == null || (requireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(activeFocusTargetNode)) == null) ? -1 : requireSemanticsInfo.getSemanticsId();
        RectList rectList = rectManager.rects;
        int i5 = top;
        long j = (i5 & 4294967295L) | (left << 32);
        long j2 = (bottom & 4294967295L) | (right << 32);
        long[] jArr = rectList.items;
        int i6 = rectList.itemsSize;
        int i7 = Integer.MAX_VALUE;
        FocusTargetNode focusTargetNode = null;
        int i8 = 0;
        while (i8 < jArr.length - 2 && i8 < i6) {
            int i9 = i8;
            long j3 = jArr[i8 + 2];
            boolean z2 = true;
            if ((((int) (j3 >> 61)) & 1) != 0) {
                if (((((j2 - jArr[i9]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i9 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    int i10 = ((int) j3) & 33554431;
                    LayoutNode layoutNode5 = rectManager.layoutNodes.get(i10);
                    if (layoutNode5 != null) {
                        if (semanticsId == i10) {
                            c = 65535;
                            if (semanticsId != -1) {
                                return null;
                            }
                        } else {
                            c = 65535;
                        }
                        if (layoutNode5.getDepth() >= i7 || !rectManager.isDescendantOf$ui(layoutNode5, layoutNode4)) {
                            i = i7;
                            layoutNode = layoutNode4;
                        } else {
                            NodeChain nodes = layoutNode5.getNodes();
                            int m7164constructorimpl = NodeKind.m7164constructorimpl(1024);
                            if ((nodes.getAggregateChildKindSet() & m7164constructorimpl) != 0) {
                                Modifier.Node head = nodes.getHead();
                                while (head != null) {
                                    if ((head.getKindSet() & m7164constructorimpl) != 0) {
                                        MutableVector mutableVector2 = null;
                                        node = head;
                                        while (node != null) {
                                            if (node instanceof FocusTargetNode) {
                                                i = i7;
                                                layoutNode = layoutNode4;
                                                break;
                                            }
                                            if ((node.getKindSet() & m7164constructorimpl) == 0 || !(node instanceof DelegatingNode)) {
                                                i2 = i7;
                                                layoutNode2 = layoutNode4;
                                                z = true;
                                            } else {
                                                Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                                                int i11 = 0;
                                                while (delegate != null) {
                                                    if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                                                        i11++;
                                                        i3 = i7;
                                                        if (i11 == 1) {
                                                            node = delegate;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                i4 = i11;
                                                                layoutNode3 = layoutNode4;
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            } else {
                                                                i4 = i11;
                                                                layoutNode3 = layoutNode4;
                                                                mutableVector = mutableVector2;
                                                            }
                                                            if (node != null) {
                                                                if (mutableVector != null) {
                                                                    mutableVector.add(node);
                                                                }
                                                                node = null;
                                                            }
                                                            if (mutableVector != null) {
                                                                mutableVector.add(delegate);
                                                            }
                                                            mutableVector2 = mutableVector;
                                                            i11 = i4;
                                                            delegate = delegate.getChild();
                                                            i7 = i3;
                                                            layoutNode4 = layoutNode3;
                                                        }
                                                    } else {
                                                        i3 = i7;
                                                    }
                                                    layoutNode3 = layoutNode4;
                                                    delegate = delegate.getChild();
                                                    i7 = i3;
                                                    layoutNode4 = layoutNode3;
                                                }
                                                i2 = i7;
                                                layoutNode2 = layoutNode4;
                                                z = true;
                                                if (i11 == 1) {
                                                    z2 = z;
                                                    i7 = i2;
                                                    layoutNode4 = layoutNode2;
                                                }
                                            }
                                            node = DelegatableNodeKt.pop(mutableVector2);
                                            z2 = z;
                                            i7 = i2;
                                            layoutNode4 = layoutNode2;
                                        }
                                    }
                                    i = i7;
                                    boolean z3 = z2;
                                    layoutNode = layoutNode4;
                                    if ((head.getAggregateChildKindSet() & m7164constructorimpl) == 0) {
                                        break;
                                    }
                                    head = head.getChild();
                                    z2 = z3;
                                    i7 = i;
                                    layoutNode4 = layoutNode;
                                }
                            }
                            i = i7;
                            layoutNode = layoutNode4;
                            node = null;
                            FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                            if (focusTargetNode2 != null) {
                                if (intersects$ui(focusTargetNode2, left, i5, right, bottom)) {
                                    i7 = layoutNode5.getDepth();
                                    focusTargetNode = focusTargetNode2;
                                    i8 = i9 + 3;
                                    rectManager = this;
                                    i5 = top;
                                    layoutNode4 = layoutNode;
                                }
                            }
                        }
                        i7 = i;
                        i8 = i9 + 3;
                        rectManager = this;
                        i5 = top;
                        layoutNode4 = layoutNode;
                    } else {
                        i = i7;
                        layoutNode = layoutNode4;
                    }
                    i7 = i;
                    i8 = i9 + 3;
                    rectManager = this;
                    i5 = top;
                    layoutNode4 = layoutNode;
                }
            }
            i = i7;
            layoutNode = layoutNode4;
            i7 = i;
            i8 = i9 + 3;
            rectManager = this;
            i5 = top;
            layoutNode4 = layoutNode;
        }
        return focusTargetNode;
    }

    public final boolean isDescendantOf$ui(LayoutNode layoutNode, LayoutNode layoutNode2) {
        int depth = layoutNode.getDepth() - layoutNode2.getDepth();
        if (depth <= 0) {
            return false;
        }
        for (int i = 0; i < depth; i++) {
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        }
        return layoutNode == layoutNode2;
    }

    public final void unsetHasCallbacksFor(LayoutNode layoutNode) {
        this.rects.updateHasCallbacks(layoutNode.getSemanticsId(), false);
    }

    public final boolean intersects$ui(DelegatableNode delegatableNode, int i, int i2, int i3, int i4) {
        NodeCoordinator m7015requireCoordinator64DMado = DelegatableNodeKt.m7015requireCoordinator64DMado(delegatableNode, NodeKind.m7164constructorimpl(1024));
        LayoutNode layoutNode = m7015requireCoordinator64DMado.getLayoutNode();
        if (Intrinsics.areEqual(m7015requireCoordinator64DMado, layoutNode.getOuterCoordinator$ui())) {
            return true;
        }
        long mo6855localToRootMKHz9U = layoutNode.getOuterCoordinator$ui().mo6855localToRootMKHz9U(LayoutCoordinates.m6851localPositionOfS_NoaFU$default(layoutNode.getOuterCoordinator$ui(), m7015requireCoordinator64DMado, 0L, false, 6, null));
        long mo6852getSizeYbymL2g = m7015requireCoordinator64DMado.mo6852getSizeYbymL2g();
        int round = Math.round(Float.intBitsToFloat((int) (mo6855localToRootMKHz9U >> 32)));
        int i5 = ((int) (mo6852getSizeYbymL2g >> 32)) + round;
        int round2 = Math.round(Float.intBitsToFloat((int) (mo6855localToRootMKHz9U & 4294967295L)));
        return i < i5 && i3 > round && i2 < ((int) (mo6852getSizeYbymL2g & 4294967295L)) + round2 && i4 > round2;
    }
}
