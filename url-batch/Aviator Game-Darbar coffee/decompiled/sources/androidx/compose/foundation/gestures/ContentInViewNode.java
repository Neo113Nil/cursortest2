package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: ContentInViewNode.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001MB9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\fH\u0002J\u001e\u0010%\u001a\u00020&2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0096@¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\u0018J\u0017\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020&2\u0006\u0010+\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010-J\n\u00100\u001a\u0004\u0018\u00010\u000fH\u0002J\u0019\u00101\u001a\u00020&2\b\b\u0002\u00102\u001a\u000203H\u0002¢\u0006\u0004\b4\u0010-J\u001f\u00105\u001a\u0002062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00102\u001a\u000203H\u0002¢\u0006\u0004\b7\u00108J\n\u00109\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fH\u0002J'\u0010<\u001a\u00020\n*\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u001c2\b\b\u0002\u0010=\u001a\u000203H\u0002¢\u0006\u0004\b>\u0010?J'\u0010@\u001a\u00020A2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010=\u001a\u000203H\u0002¢\u0006\u0004\bC\u0010DJ\u001c\u0010E\u001a\u00020F*\u00020\u001c2\u0006\u0010G\u001a\u00020\u001cH\u0082\u0002¢\u0006\u0004\bH\u0010IJ\u001c\u0010E\u001a\u00020F*\u00020J2\u0006\u0010G\u001a\u00020JH\u0082\u0002¢\u0006\u0004\bK\u0010IJ \u0010L\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c@BX\u0080\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "reverseDirection", "", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getFocusedRect", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;Lkotlin/jvm/functions/Function0;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "focusedChild", "Landroidx/compose/ui/layout/LayoutCoordinates;", "trackingFocusedChild", "childWasMaxVisibleBeforeViewportShrunk", "value", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "getViewportSize-YbymL2g$foundation", "()J", "J", "isAnimationRunning", "calculateRectForParent", "localRect", "requireBringIntoViewSpec", "bringChildIntoView", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFocusBoundsChanged", "newBounds", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasuredLegacy", "onRemeasuredLegacy-ozmzZPI", "getFocusedChildBounds", "launchAnimation", "viewportAdjustmentForReverseScroll", "Landroidx/compose/ui/unit/IntOffset;", "launchAnimation--gyyYBs", "calculateScrollDelta", "", "calculateScrollDelta-I_oMVgE", "(Landroidx/compose/foundation/gestures/BringIntoViewSpec;J)F", "findBringIntoViewRequest", "computeDestination", "childBounds", "isMaxVisible", "containerOffset", "isMaxVisible--EQwtKw", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "containerSize", "relocationOffset-fbGrOKE", "(Landroidx/compose/ui/geometry/Rect;JJ)J", "compareTo", "", "other", "compareTo-TemP2vQ", "(JJ)I", "Landroidx/compose/ui/geometry/Size;", "compareTo-iLBOSCw", "update", "Request", "foundation"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean childWasMaxVisibleBeforeViewportShrunk;
    private LayoutCoordinates focusedChild;
    private Function0<Rect> getFocusedRect;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.INSTANCE.m7698getZeroYbymL2g();

    /* compiled from: ContentInViewNode.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z, BringIntoViewSpec bringIntoViewSpec, Function0<Rect> function0) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.getFocusedRect = function0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation, reason: not valid java name and from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect localRect) {
        if (IntSize.m7691equalsimpl0(this.viewportSize, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
            InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return computeDestination(localRect);
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Rect invoke = function0.invoke();
        if (invoke == null || m438isMaxVisibleEQwtKw$default(this, invoke, 0L, 0L, 3, null)) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            m440launchAnimationgyyYBs$default(this, 0L, 1, null);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates newBounds) {
        ContentInViewNode contentInViewNode;
        Rect focusedChildBounds;
        this.focusedChild = newBounds;
        if (!this.childWasMaxVisibleBeforeViewportShrunk || (focusedChildBounds = getFocusedChildBounds()) == null) {
            contentInViewNode = this;
        } else {
            contentInViewNode = this;
            if (!m438isMaxVisibleEQwtKw$default(contentInViewNode, focusedChildBounds, this.viewportSize, 0L, 2, null)) {
                contentInViewNode.trackingFocusedChild = true;
                m440launchAnimationgyyYBs$default(contentInViewNode, 0L, 1, null);
            }
        }
        contentInViewNode.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo396onRemeasuredozmzZPI(long size) {
        long m7661getZeronOccac;
        if (!ComposeFoundationFlags.isKeepInViewFocusObservationChangeEnabled) {
            m441onRemeasuredLegacyozmzZPI(size);
            return;
        }
        long j = this.viewportSize;
        this.viewportSize = size;
        if (m435compareToTemP2vQ(size, j) >= 0) {
            return;
        }
        if (!this.reverseDirection) {
            if (this.orientation == Orientation.Vertical) {
                m7661getZeronOccac = IntOffset.m7644constructorimpl((((int) (j & 4294967295L)) - ((int) (size & 4294967295L))) & 4294967295L);
            } else {
                m7661getZeronOccac = IntOffset.m7644constructorimpl((((int) (j >> 32)) - ((int) (size >> 32))) << 32);
            }
        } else {
            m7661getZeronOccac = IntOffset.INSTANCE.m7661getZeronOccac();
        }
        long j2 = m7661getZeronOccac;
        Rect invoke = this.getFocusedRect.invoke();
        if (invoke == null || this.isAnimationRunning || this.trackingFocusedChild || !m438isMaxVisibleEQwtKw$default(this, invoke, j, 0L, 2, null) || m438isMaxVisibleEQwtKw$default(this, invoke, 0L, j2, 1, null)) {
            return;
        }
        this.trackingFocusedChild = true;
        m439launchAnimationgyyYBs(j2);
    }

    /* renamed from: onRemeasuredLegacy-ozmzZPI, reason: not valid java name */
    private final void m441onRemeasuredLegacyozmzZPI(long size) {
        Rect focusedChildBounds;
        long j = this.viewportSize;
        this.viewportSize = size;
        if (m435compareToTemP2vQ(size, j) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (focusedChildBounds = getFocusedChildBounds()) == null || !m438isMaxVisibleEQwtKw$default(this, focusedChildBounds, j, 0L, 2, null)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        if (ComposeFoundationFlags.isKeepInViewFocusObservationChangeEnabled) {
            return this.getFocusedRect.invoke();
        }
        if (!getIsAttached()) {
            return null;
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return requireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    /* renamed from: launchAnimation--gyyYBs$default, reason: not valid java name */
    static /* synthetic */ void m440launchAnimationgyyYBs$default(ContentInViewNode contentInViewNode, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = IntOffset.INSTANCE.m7661getZeronOccac();
        }
        contentInViewNode.m439launchAnimationgyyYBs(j);
    }

    /* renamed from: launchAnimation--gyyYBs, reason: not valid java name */
    private final void m439launchAnimationgyyYBs(long viewportAdjustmentForReverseScroll) {
        BringIntoViewSpec requireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, new UpdatableAnimationState(requireBringIntoViewSpec().getScrollAnimationSpec()), requireBringIntoViewSpec, viewportAdjustmentForReverseScroll, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateScrollDelta-I_oMVgE, reason: not valid java name */
    public final float m434calculateScrollDeltaI_oMVgE(BringIntoViewSpec bringIntoViewSpec, long viewportAdjustmentForReverseScroll) {
        if (IntSize.m7691equalsimpl0(this.viewportSize, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            findBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long m7705toSizeozmzZPI = IntSizeKt.m7705toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getTop() - IntOffset.m7651getYimpl(viewportAdjustmentForReverseScroll), findBringIntoViewRequest.getBottom() - findBringIntoViewRequest.getTop(), Float.intBitsToFloat((int) (m7705toSizeozmzZPI & 4294967295L)));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getLeft() - IntOffset.m7650getXimpl(viewportAdjustmentForReverseScroll), findBringIntoViewRequest.getRight() - findBringIntoViewRequest.getLeft(), Float.intBitsToFloat((int) (m7705toSizeozmzZPI >> 32)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (true) {
                if (size < 0) {
                    break;
                }
                Rect invoke = ((Request) objArr[size]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (m436compareToiLBOSCw(invoke.m4527getSizeNHjbRc(), IntSizeKt.m7705toSizeozmzZPI(this.viewportSize)) <= 0) {
                        rect = invoke;
                    } else if (rect == null) {
                        return invoke;
                    }
                }
                size--;
            }
        }
        return rect;
    }

    private final Rect computeDestination(Rect childBounds) {
        return childBounds.m4531translatek4lQ0M(Offset.m4486constructorimpl(m442relocationOffsetfbGrOKE(childBounds, this.viewportSize, IntOffset.INSTANCE.m7661getZeronOccac()) ^ (-9223372034707292160L)));
    }

    /* renamed from: isMaxVisible--EQwtKw$default, reason: not valid java name */
    static /* synthetic */ boolean m438isMaxVisibleEQwtKw$default(ContentInViewNode contentInViewNode, Rect rect, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewNode.viewportSize;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = IntOffset.INSTANCE.m7661getZeronOccac();
        }
        return contentInViewNode.m437isMaxVisibleEQwtKw(rect, j3, j2);
    }

    /* renamed from: isMaxVisible--EQwtKw, reason: not valid java name */
    private final boolean m437isMaxVisibleEQwtKw(Rect rect, long j, long j2) {
        long m442relocationOffsetfbGrOKE = m442relocationOffsetfbGrOKE(rect, j, j2);
        return Math.abs(Float.intBitsToFloat((int) (m442relocationOffsetfbGrOKE >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (m442relocationOffsetfbGrOKE & 4294967295L))) <= 0.5f;
    }

    /* renamed from: relocationOffset-fbGrOKE, reason: not valid java name */
    private final long m442relocationOffsetfbGrOKE(Rect childBounds, long containerSize, long containerOffset) {
        long m7705toSizeozmzZPI = IntSizeKt.m7705toSizeozmzZPI(containerSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Offset.m4486constructorimpl((Float.floatToRawIntBits(requireBringIntoViewSpec().calculateScrollDistance(childBounds.getLeft() - IntOffset.m7650getXimpl(containerOffset), childBounds.getRight() - childBounds.getLeft(), Float.intBitsToFloat((int) (m7705toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        float calculateScrollDistance = requireBringIntoViewSpec().calculateScrollDistance(childBounds.getTop() - IntOffset.m7651getYimpl(containerOffset), childBounds.getBottom() - childBounds.getTop(), Float.intBitsToFloat((int) (m7705toSizeozmzZPI & 4294967295L)));
        return Offset.m4486constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(calculateScrollDistance) & 4294967295L));
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m435compareToTemP2vQ(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Intrinsics.compare((int) (j & 4294967295L), (int) (j2 & 4294967295L));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Intrinsics.compare((int) (j >> 32), (int) (j2 >> 32));
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m436compareToiLBOSCw(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Float.compare(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public final void update(Orientation orientation, boolean reverseDirection, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* compiled from: ContentInViewNode.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "currentBounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Request {
        public static final int $stable = 8;
        private final CancellableContinuation<Unit> continuation;
        private final Function0<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(Function0<Rect> function0, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.currentBounds = function0;
            this.continuation = cancellableContinuation;
        }

        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public final CancellableContinuation<Unit> getContinuation() {
            return this.continuation;
        }

        public String toString() {
            String str;
            CoroutineName coroutineName = (CoroutineName) this.continuation.get$context().get(CoroutineName.INSTANCE);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb = new StringBuilder("Request@");
            String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
            StringBuilder append = sb.append(num);
            if (name == null || (str = "[" + name + "](") == null) {
                str = "(";
            }
            return append.append(str).append("currentBounds()=").append(this.currentBounds.invoke()).append(", continuation=").append(this.continuation).append(')').toString();
        }
    }
}
