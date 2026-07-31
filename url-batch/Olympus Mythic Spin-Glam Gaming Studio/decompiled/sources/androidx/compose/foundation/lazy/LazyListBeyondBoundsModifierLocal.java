package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: LazyBeyondBoundsModifier.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "currentInterval", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "direction", "addNextInterval-FR3nfPY", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "addNextInterval", "hasMoreContent-FR3nfPY", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;I)Z", "hasMoreContent", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "block", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "layout", "Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "Z", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "value", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
final class LazyListBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    private final LazyListBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final boolean reverseLayout;
    private final LazyListState state;

    /* compiled from: LazyBeyondBoundsModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BeyondBoundsLayout getValue() {
        return this;
    }

    public LazyListBeyondBoundsModifierLocal(LazyListState state, LazyListBeyondBoundsInfo beyondBoundsInfo, boolean z, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = z;
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval] */
    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public Object mo409layouto7g1Pn8(final int direction, Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = this.beyondBoundsInfo.addInterval(this.state.getFirstVisibleItemIndex(), ((LazyListItemInfo) CollectionsKt.last(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex());
        Object obj = null;
        while (obj == null && m408hasMoreContentFR3nfPY((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.element, direction)) {
            ?? m407addNextIntervalFR3nfPY = m407addNextIntervalFR3nfPY((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.element, direction);
            this.beyondBoundsInfo.removeInterval((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.element);
            ref$ObjectRef.element = m407addNextIntervalFR3nfPY;
            Remeasurement remeasurement$foundation_release = this.state.getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            obj = block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.LazyListBeyondBoundsModifierLocal$layout$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    boolean m408hasMoreContentFR3nfPY;
                    m408hasMoreContentFR3nfPY = LazyListBeyondBoundsModifierLocal.this.m408hasMoreContentFR3nfPY((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.element, direction);
                    return m408hasMoreContentFR3nfPY;
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.element);
        Remeasurement remeasurement$foundation_release2 = this.state.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release2 != null) {
            remeasurement$foundation_release2.forceRemeasure();
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r5.reverseLayout != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r5.reverseLayout != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r5.reverseLayout != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r5.reverseLayout != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r5.reverseLayout != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r5.reverseLayout != false) goto L4;
     */
    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final LazyListBeyondBoundsInfo.Interval m407addNextIntervalFR3nfPY(LazyListBeyondBoundsInfo.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (!BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(direction, companion.m1930getBeforehoxUOeE())) {
            if (!BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(direction, companion.m1929getAfterhoxUOeE())) {
                if (!BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(direction, companion.m1928getAbovehoxUOeE())) {
                    if (!BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(direction, companion.m1931getBelowhoxUOeE())) {
                        if (BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(direction, companion.m1932getLefthoxUOeE())) {
                            int i = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                }
                            }
                        } else {
                            if (!BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(direction, companion.m1933getRighthoxUOeE())) {
                                LazyBeyondBoundsModifierKt.unsupportedDirection();
                                throw new KotlinNothingValueException();
                            }
                            int i2 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                }
                            }
                        }
                    }
                }
                return this.beyondBoundsInfo.addInterval(start, end);
            }
            end++;
            return this.beyondBoundsInfo.addInterval(start, end);
        }
        start--;
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    private static final boolean hasMoreContent_FR3nfPY$hasMoreItemsBefore(LazyListBeyondBoundsInfo.Interval interval) {
        return interval.getStart() > 0;
    }

    private static final boolean hasMoreContent_FR3nfPY$hasMoreItemsAfter(LazyListBeyondBoundsInfo.Interval interval, LazyListBeyondBoundsModifierLocal lazyListBeyondBoundsModifierLocal) {
        return interval.getEnd() < lazyListBeyondBoundsModifierLocal.state.getLayoutInfo().getTotalItemsCount() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m408hasMoreContentFR3nfPY(LazyListBeyondBoundsInfo.Interval interval, int i) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(i, companion.m1930getBeforehoxUOeE())) {
            return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        if (BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(i, companion.m1929getAfterhoxUOeE())) {
            return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(i, companion.m1928getAbovehoxUOeE())) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        if (BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(i, companion.m1931getBelowhoxUOeE())) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(i, companion.m1932getLefthoxUOeE())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
            if (i2 == 1) {
                return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
            }
            if (i2 == 2) {
                return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!BeyondBoundsLayout.LayoutDirection.m1924equalsimpl0(i, companion.m1933getRighthoxUOeE())) {
            LazyBeyondBoundsModifierKt.unsupportedDirection();
            throw new KotlinNothingValueException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
        if (i3 == 1) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (i3 == 2) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        throw new NoWhenBranchMatchedException();
    }
}
