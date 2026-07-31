package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a=\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001a'\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\n\u001a'\u0010\u0013\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\n\u001a\u0013\u0010\u0014\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00000\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILkotlin/jvm/functions/Function1;)Z", "oneDimensionalFocusSearch", "forwardFocusSearch", "(Landroidx/compose/ui/focus/FocusModifier;Lkotlin/jvm/functions/Function1;)Z", "backwardFocusSearch", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;ILkotlin/jvm/functions/Function1;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "pickChildForForwardSearch", "pickChildForBackwardSearch", "isRoot", "(Landroidx/compose/ui/focus/FocusModifier;)Z", "Landroidx/compose/runtime/collection/MutableVector;", "", "sort", "(Landroidx/compose/runtime/collection/MutableVector;)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneDimensionalFocusSearchKt {

    /* compiled from: OneDimensionalFocusSearch.kt */
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

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m1269oneDimensionalFocusSearchOMvw8(FocusModifier oneDimensionalFocusSearch, int i, Function1 onFound) {
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1247equalsimpl0(i, companion.m1254getNextdhqQ8s())) {
            return forwardFocusSearch(oneDimensionalFocusSearch, onFound);
        }
        if (FocusDirection.m1247equalsimpl0(i, companion.m1256getPreviousdhqQ8s())) {
            return backwardFocusSearch(oneDimensionalFocusSearch, onFound);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean forwardFocusSearch(FocusModifier focusModifier, Function1 function1) {
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild != null) {
                    return forwardFocusSearch(focusedChild, function1) || m1268generateAndSearchChildren4C6V_qg(focusModifier, focusedChild, FocusDirection.INSTANCE.m1254getNextdhqQ8s(), function1);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            case 3:
            case 4:
            case 5:
                return pickChildForForwardSearch(focusModifier, function1);
            case 6:
                return ((Boolean) function1.invoke(focusModifier)).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean backwardFocusSearch(FocusModifier focusModifier, Function1 function1) {
        FocusStateImpl focusState = focusModifier.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[focusState.ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                switch (iArr[focusedChild.getFocusState().ordinal()]) {
                    case 1:
                        if (backwardFocusSearch(focusedChild, function1) || ((Boolean) function1.invoke(focusedChild)).booleanValue()) {
                            return true;
                        }
                        break;
                    case 2:
                        if (backwardFocusSearch(focusedChild, function1) || m1268generateAndSearchChildren4C6V_qg(focusModifier, focusedChild, FocusDirection.INSTANCE.m1256getPreviousdhqQ8s(), function1)) {
                            return true;
                        }
                        break;
                    case 3:
                    case 4:
                        return m1268generateAndSearchChildren4C6V_qg(focusModifier, focusedChild, FocusDirection.INSTANCE.m1256getPreviousdhqQ8s(), function1);
                    case 5:
                    case 6:
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
            case 4:
            case 5:
                return pickChildForBackwardSearch(focusModifier, function1);
            case 6:
                if (pickChildForBackwardSearch(focusModifier, function1) || ((Boolean) function1.invoke(focusModifier)).booleanValue()) {
                    return true;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m1268generateAndSearchChildren4C6V_qg(final FocusModifier focusModifier, final FocusModifier focusModifier2, final int i, final Function1 function1) {
        if (m1270searchChildren4C6V_qg(focusModifier, focusModifier2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m1243searchBeyondBoundsOMvw8(focusModifier, i, new Function1() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Boolean invoke(@NotNull BeyondBoundsLayout.BeyondBoundsScope searchBeyondBounds) {
                boolean m1270searchChildren4C6V_qg;
                Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
                m1270searchChildren4C6V_qg = OneDimensionalFocusSearchKt.m1270searchChildren4C6V_qg(FocusModifier.this, focusModifier2, i, function1);
                Boolean valueOf = Boolean.valueOf(m1270searchChildren4C6V_qg);
                if (m1270searchChildren4C6V_qg || !searchBeyondBounds.getHasMoreContent()) {
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
    public static final boolean m1270searchChildren4C6V_qg(FocusModifier focusModifier, FocusModifier focusModifier2, int i, Function1 function1) {
        if (focusModifier.getFocusState() != FocusStateImpl.ActiveParent && focusModifier.getFocusState() != FocusStateImpl.DeactivatedParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        sort(focusModifier.getChildren());
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m1247equalsimpl0(i, companion.m1254getNextdhqQ8s())) {
            if (!FocusDirection.m1247equalsimpl0(i, companion.m1256getPreviousdhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            MutableVector children = focusModifier.getChildren();
            IntRange intRange = new IntRange(0, children.getSize() - 1);
            int first = intRange.getFirst();
            int last = intRange.getLast();
            if (first <= last) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusModifier focusModifier3 = (FocusModifier) children.getContent()[last];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier3) && backwardFocusSearch(focusModifier3, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(children.getContent()[last], focusModifier2)) {
                        z = true;
                    }
                    if (last == first) {
                        break;
                    }
                    last--;
                }
            }
        } else {
            MutableVector children2 = focusModifier.getChildren();
            IntRange intRange2 = new IntRange(0, children2.getSize() - 1);
            int first2 = intRange2.getFirst();
            int last2 = intRange2.getLast();
            if (first2 <= last2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusModifier focusModifier4 = (FocusModifier) children2.getContent()[first2];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier4) && forwardFocusSearch(focusModifier4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(children2.getContent()[first2], focusModifier2)) {
                        z2 = true;
                    }
                    if (first2 == last2) {
                        break;
                    }
                    first2++;
                }
            }
        }
        if (FocusDirection.m1247equalsimpl0(i, FocusDirection.INSTANCE.m1254getNextdhqQ8s()) || focusModifier.getFocusState() == FocusStateImpl.DeactivatedParent || isRoot(focusModifier)) {
            return false;
        }
        return ((Boolean) function1.invoke(focusModifier)).booleanValue();
    }

    private static final boolean pickChildForForwardSearch(FocusModifier focusModifier, Function1 function1) {
        sort(focusModifier.getChildren());
        MutableVector children = focusModifier.getChildren();
        int size = children.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] content = children.getContent();
        int i = 0;
        do {
            FocusModifier focusModifier2 = (FocusModifier) content[i];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier2) && forwardFocusSearch(focusModifier2, function1)) {
                return true;
            }
            i++;
        } while (i < size);
        return false;
    }

    private static final boolean pickChildForBackwardSearch(FocusModifier focusModifier, Function1 function1) {
        sort(focusModifier.getChildren());
        MutableVector children = focusModifier.getChildren();
        int size = children.getSize();
        if (size <= 0) {
            return false;
        }
        int i = size - 1;
        Object[] content = children.getContent();
        do {
            FocusModifier focusModifier2 = (FocusModifier) content[i];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusModifier2) && backwardFocusSearch(focusModifier2, function1)) {
                return true;
            }
            i--;
        } while (i >= 0);
        return false;
    }

    private static final boolean isRoot(FocusModifier focusModifier) {
        return focusModifier.getParent() == null;
    }

    private static final void sort(MutableVector mutableVector) {
        mutableVector.sortWith(new Comparator() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$sort$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                LayoutNode layoutNode;
                LayoutNode layoutNode2;
                LayoutNodeWrapper layoutNodeWrapper = ((FocusModifier) obj).getLayoutNodeWrapper();
                Integer num = null;
                Integer valueOf = (layoutNodeWrapper == null || (layoutNode2 = layoutNodeWrapper.getLayoutNode()) == null) ? null : Integer.valueOf(layoutNode2.getPlaceOrder());
                LayoutNodeWrapper layoutNodeWrapper2 = ((FocusModifier) obj2).getLayoutNodeWrapper();
                if (layoutNodeWrapper2 != null && (layoutNode = layoutNodeWrapper2.getLayoutNode()) != null) {
                    num = Integer.valueOf(layoutNode.getPlaceOrder());
                }
                return ComparisonsKt.compareValues(valueOf, num);
            }
        });
    }
}
