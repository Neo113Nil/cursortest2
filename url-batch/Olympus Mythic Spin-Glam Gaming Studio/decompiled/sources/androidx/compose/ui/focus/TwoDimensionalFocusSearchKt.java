package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TwoDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a1\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0013\u0010 \u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010!\u001a\u0013\u0010#\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILkotlin/jvm/functions/Function1;)Z", "twoDimensionalFocusSearch", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;ILkotlin/jvm/functions/Function1;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusModifier;", "findBestCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "source", "rect1", "rect2", "beamBeats-I7lrPNg", "beamBeats", "topLeft", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "bottomRight", "activeNode", "(Landroidx/compose/ui/focus/FocusModifier;)Landroidx/compose/ui/focus/FocusModifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TwoDimensionalFocusSearchKt {

    /* compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m1278twoDimensionalFocusSearchOMvw8(FocusModifier twoDimensionalFocusSearch, int i, Function1 onFound) {
        Rect bottomRight;
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusStateImpl focusState = twoDimensionalFocusSearch.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[focusState.ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusedChild = twoDimensionalFocusSearch.getFocusedChild();
                if (focusedChild == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                switch (iArr[focusedChild.getFocusState().ordinal()]) {
                    case 1:
                    case 2:
                        return m1278twoDimensionalFocusSearchOMvw8(focusedChild, i, onFound) || m1275generateAndSearchChildren4C6V_qg(twoDimensionalFocusSearch, activeNode(focusedChild), i, onFound);
                    case 3:
                    case 4:
                        return m1275generateAndSearchChildren4C6V_qg(twoDimensionalFocusSearch, focusedChild, i, onFound);
                    case 5:
                    case 6:
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
            case 4:
                MutableVector activatedChildren = FocusTraversalKt.activatedChildren(twoDimensionalFocusSearch);
                if (activatedChildren.getSize() <= 1) {
                    FocusModifier focusModifier = (FocusModifier) (activatedChildren.isEmpty() ? null : activatedChildren.getContent()[0]);
                    if (focusModifier != null) {
                        return ((Boolean) onFound.invoke(focusModifier)).booleanValue();
                    }
                    return false;
                }
                FocusDirection.Companion companion = FocusDirection.INSTANCE;
                if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
                    bottomRight = topLeft(FocusTraversalKt.focusRect(twoDimensionalFocusSearch));
                } else {
                    if (!(FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s()))) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    bottomRight = bottomRight(FocusTraversalKt.focusRect(twoDimensionalFocusSearch));
                }
                FocusModifier m1274findBestCandidate4WY_MpI = m1274findBestCandidate4WY_MpI(activatedChildren, bottomRight, i);
                if (m1274findBestCandidate4WY_MpI != null) {
                    return ((Boolean) onFound.invoke(m1274findBestCandidate4WY_MpI)).booleanValue();
                }
                return false;
            case 5:
                return false;
            case 6:
                return ((Boolean) onFound.invoke(twoDimensionalFocusSearch)).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m1275generateAndSearchChildren4C6V_qg(final FocusModifier focusModifier, final FocusModifier focusModifier2, final int i, final Function1 function1) {
        if (m1277searchChildren4C6V_qg(focusModifier, focusModifier2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m1243searchBeyondBoundsOMvw8(focusModifier, i, new Function1() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Boolean invoke(@NotNull BeyondBoundsLayout.BeyondBoundsScope searchBeyondBounds) {
                boolean m1277searchChildren4C6V_qg;
                Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
                m1277searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m1277searchChildren4C6V_qg(FocusModifier.this, focusModifier2, i, function1);
                Boolean valueOf = Boolean.valueOf(m1277searchChildren4C6V_qg);
                if (m1277searchChildren4C6V_qg || !searchBeyondBounds.getHasMoreContent()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m1277searchChildren4C6V_qg(FocusModifier focusModifier, FocusModifier focusModifier2, int i, Function1 function1) {
        FocusModifier m1274findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusModifier[focusModifier.getChildren().getSize()], 0);
        mutableVector.addAll(mutableVector.getSize(), focusModifier.getChildren());
        while (mutableVector.isNotEmpty() && (m1274findBestCandidate4WY_MpI = m1274findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusModifier2), i)) != null) {
            if (!m1274findBestCandidate4WY_MpI.getFocusState().isDeactivated()) {
                return ((Boolean) function1.invoke(m1274findBestCandidate4WY_MpI)).booleanValue();
            }
            if (m1275generateAndSearchChildren4C6V_qg(m1274findBestCandidate4WY_MpI, focusModifier2, i, function1)) {
                return true;
            }
            mutableVector.remove(m1274findBestCandidate4WY_MpI);
        }
        return false;
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusModifier m1274findBestCandidate4WY_MpI(MutableVector mutableVector, Rect rect, int i) {
        Rect translate;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s())) {
            translate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
            translate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s())) {
            translate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            translate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        int size = mutableVector.getSize();
        FocusModifier focusModifier = null;
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                FocusModifier focusModifier2 = (FocusModifier) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier2)) {
                    Rect focusRect = FocusTraversalKt.focusRect(focusModifier2);
                    if (m1276isBetterCandidateI7lrPNg(focusRect, translate, rect, i)) {
                        focusModifier = focusModifier2;
                        translate = focusRect;
                    }
                }
                i2++;
            } while (i2 < size);
        }
        return focusModifier;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s())) {
            if ((rect2.getRight() <= rect.getRight() && rect2.getLeft() < rect.getRight()) || rect2.getLeft() <= rect.getLeft()) {
                return false;
            }
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
            if ((rect2.getLeft() >= rect.getLeft() && rect2.getRight() > rect.getLeft()) || rect2.getRight() >= rect.getRight()) {
                return false;
            }
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s())) {
            if ((rect2.getBottom() <= rect.getBottom() && rect2.getTop() < rect.getBottom()) || rect2.getTop() <= rect.getTop()) {
                return false;
            }
        } else {
            if (!FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if ((rect2.getTop() >= rect.getTop() && rect2.getBottom() > rect.getTop()) || rect2.getBottom() >= rect.getBottom()) {
                return false;
            }
        }
        return true;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s())) {
            if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i, Rect rect2) {
        float f;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
            f = 2;
            left = rect2.getTop() + (rect2.getHeight() / f);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!(FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = 2;
            left = rect2.getLeft() + (rect2.getWidth() / f);
            left2 = rect.getLeft();
            width = rect.getWidth();
        }
        return left - (left2 + (width / f));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        long abs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect));
        long abs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m1276isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3)) {
            return !isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) || m1272beamBeatsI7lrPNg(rect3, rect, rect2, i) || (!m1272beamBeatsI7lrPNg(rect3, rect2, rect, i) && isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2));
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!(FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s()))) {
            if (!(FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s())) {
            if (rect2.getLeft() < rect.getRight()) {
                return false;
            }
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
            if (rect2.getRight() > rect.getLeft()) {
                return false;
            }
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s())) {
            if (rect2.getTop() < rect.getBottom()) {
                return false;
            }
        } else {
            if (!FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (rect2.getBottom() > rect.getTop()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: beamBeats_I7lrPNg$majorAxisDistance-3, reason: not valid java name */
    private static final float m1273beamBeats_I7lrPNg$majorAxisDistance3(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s())) {
            if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s())) {
            if (FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f = bottom - bottom2;
            return Math.max(1.0f, f);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f = top - top2;
        return Math.max(1.0f, f);
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m1272beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect)) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (!FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s()) && !FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s()) && m1273beamBeats_I7lrPNg$majorAxisDistance3(rect2, i, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final FocusModifier activeNode(FocusModifier focusModifier) {
        if (focusModifier.getFocusState() != FocusStateImpl.ActiveParent && focusModifier.getFocusState() != FocusStateImpl.DeactivatedParent) {
            throw new IllegalStateException("Check failed.");
        }
        FocusModifier findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusModifier);
        if (findActiveFocusNode != null) {
            return findActiveFocusNode;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
