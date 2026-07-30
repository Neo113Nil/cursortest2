package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PagerMeasurePolicy.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¡\u0001\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "pageCount", "rememberPagerMeasurePolicy-8u0NR3k", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r34.changed(r4) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r34.changed(r9) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r34.changed(r12) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        if (r34.changed(r13) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (r34.changed(r14) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        if (r34.changed(r5) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
    
        if (r34.changed(r3) == false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0098  */
    /* renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m916rememberPagerMeasurePolicy8u0NR3k(final Function0<PagerLazyLayoutItemProvider> function0, final PagerState pagerState, final PaddingValues paddingValues, final boolean z, Orientation orientation, int i, float f, PageSize pageSize, Alignment.Horizontal horizontal, Alignment.Vertical vertical, SnapPosition snapPosition, final CoroutineScope coroutineScope, final Function0<Integer> function02, Composer composer, int i2, int i3) {
        Orientation orientation2;
        boolean z2;
        Alignment.Horizontal horizontal2;
        boolean z3;
        Alignment.Vertical vertical2;
        boolean z4;
        float f2;
        boolean z5;
        PageSize pageSize2;
        boolean z6;
        SnapPosition snapPosition2;
        boolean z7;
        int i4;
        boolean z8;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1391419623, "C(rememberPagerMeasurePolicy)P(4,11,1,9,5!1,8:c#ui.unit.Dp,7,3,12,10)56@2301L6278:PagerMeasurePolicy.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1391419623, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 35232261, "CC(remember):PagerMeasurePolicy.kt#9igjgp");
        boolean z9 = ((((i2 & 112) ^ 48) > 32 && composer.changed(pagerState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048);
        if (((57344 & i2) ^ 24576) > 16384) {
            orientation2 = orientation;
        } else {
            orientation2 = orientation;
        }
        if ((i2 & 24576) != 16384) {
            z2 = false;
            boolean z10 = z9 | z2;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
            }
            if ((100663296 & i2) != 67108864) {
                z3 = false;
                boolean z11 = z10 | z3;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                }
                if ((805306368 & i2) != 536870912) {
                    z4 = false;
                    boolean z12 = z11 | z4;
                    if (((3670016 & i2) ^ 1572864) <= 1048576) {
                        f2 = f;
                    } else {
                        f2 = f;
                    }
                    if ((1572864 & i2) != 1048576) {
                        z5 = false;
                        boolean z13 = z12 | z5;
                        if (((29360128 & i2) ^ 12582912) > 8388608) {
                            pageSize2 = pageSize;
                        } else {
                            pageSize2 = pageSize;
                        }
                        if ((12582912 & i2) != 8388608) {
                            z6 = false;
                            boolean z14 = z13 | z6;
                            if (((i3 & 14) ^ 6) <= 4) {
                                snapPosition2 = snapPosition;
                            } else {
                                snapPosition2 = snapPosition;
                            }
                            if ((i3 & 6) != 4) {
                                z7 = false;
                                boolean z15 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14 | z7;
                                if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072) {
                                    i4 = i;
                                } else {
                                    i4 = i;
                                }
                                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                    z8 = false;
                                    changed = z15 | z8 | composer.changed(coroutineScope);
                                    rememberedValue = composer.rememberedValue();
                                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final int i5 = i4;
                                        final SnapPosition snapPosition3 = snapPosition2;
                                        final Alignment.Horizontal horizontal3 = horizontal2;
                                        final Alignment.Vertical vertical3 = vertical2;
                                        final float f3 = f2;
                                        final PageSize pageSize3 = pageSize2;
                                        final Orientation orientation3 = orientation2;
                                        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                                return m917invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final PagerMeasureResult m917invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                                int i6;
                                                int i7;
                                                int i8;
                                                int m6218getMaxWidthimpl;
                                                long IntOffset;
                                                ObservableScopeInvalidator.m847attachToScopeimpl(PagerState.this.m918getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                                boolean z16 = orientation3 == Orientation.Vertical;
                                                CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                                                PaddingValues paddingValues2 = paddingValues;
                                                if (z16) {
                                                    i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                                } else {
                                                    i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                                                }
                                                PaddingValues paddingValues3 = paddingValues;
                                                if (z16) {
                                                    i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                                } else {
                                                    i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                                                }
                                                int i9 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                                                int i10 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                                                int i11 = i7;
                                                final int i12 = i9 + i10;
                                                final int i13 = i6 + i11;
                                                int i14 = z16 ? i12 : i13;
                                                if (z16 && !z) {
                                                    i8 = i9;
                                                } else if (z16 && z) {
                                                    i8 = i10;
                                                } else {
                                                    i8 = (z16 || z) ? i11 : i6;
                                                }
                                                int i15 = i14 - i8;
                                                long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i13, -i12);
                                                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                                PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                                int i16 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(f3);
                                                if (z16) {
                                                    m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i12;
                                                } else {
                                                    m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i13;
                                                }
                                                if (!z || m6218getMaxWidthimpl > 0) {
                                                    IntOffset = IntOffsetKt.IntOffset(i6, i9);
                                                } else {
                                                    if (!z16) {
                                                        i6 += m6218getMaxWidthimpl;
                                                    }
                                                    if (z16) {
                                                        i9 += m6218getMaxWidthimpl;
                                                    }
                                                    IntOffset = IntOffsetKt.IntOffset(i6, i9);
                                                }
                                                long j2 = IntOffset;
                                                int coerceAtLeast = RangesKt.coerceAtLeast(pageSize3.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6218getMaxWidthimpl, i16), 0);
                                                PagerState.this.m922setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation3 == Orientation.Vertical ? Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU) : coerceAtLeast, 0, orientation3 != Orientation.Vertical ? Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU) : coerceAtLeast, 5, null));
                                                PagerLazyLayoutItemProvider invoke = function0.invoke();
                                                Snapshot.Companion companion = Snapshot.INSTANCE;
                                                PagerState pagerState2 = PagerState.this;
                                                SnapPosition snapPosition4 = snapPosition3;
                                                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                                try {
                                                    int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                                    int currentPageOffset = PagerKt.currentPageOffset(snapPosition4, m6218getMaxWidthimpl, coerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                                    Unit unit = Unit.INSTANCE;
                                                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                    int i17 = m6218getMaxWidthimpl;
                                                    int i18 = i8;
                                                    PagerMeasureResult m915measurePagerbmk8ZPk = PagerMeasureKt.m915measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i17, i18, i15, i16, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6237offsetNN6EwU, orientation3, vertical3, horizontal3, z, j2, coerceAtLeast, i5, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition3, PagerState.this.m919getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                        }

                                                        public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m6234constrainHeightK40F9xA(j, i20 + i12), MapsKt.emptyMap(), function1);
                                                        }
                                                    });
                                                    PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m915measurePagerbmk8ZPk, false, 2, null);
                                                    return m915measurePagerbmk8ZPk;
                                                } catch (Throwable th) {
                                                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                    throw th;
                                                }
                                            }
                                        };
                                        composer.updateRememberedValue(rememberedValue);
                                    }
                                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    return function2;
                                }
                                z8 = true;
                                changed = z15 | z8 | composer.changed(coroutineScope);
                                rememberedValue = composer.rememberedValue();
                                if (!changed) {
                                }
                                final int i52 = i4;
                                final SnapPosition snapPosition32 = snapPosition2;
                                final Alignment.Horizontal horizontal32 = horizontal2;
                                final Alignment.Vertical vertical32 = vertical2;
                                final float f32 = f2;
                                final PageSize pageSize32 = pageSize2;
                                final Orientation orientation32 = orientation2;
                                rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                        return m917invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final PagerMeasureResult m917invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                        int i6;
                                        int i7;
                                        int i8;
                                        int m6218getMaxWidthimpl;
                                        long IntOffset;
                                        ObservableScopeInvalidator.m847attachToScopeimpl(PagerState.this.m918getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                        boolean z16 = orientation32 == Orientation.Vertical;
                                        CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                                        PaddingValues paddingValues2 = paddingValues;
                                        if (z16) {
                                            i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                        } else {
                                            i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                                        }
                                        PaddingValues paddingValues3 = paddingValues;
                                        if (z16) {
                                            i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                        } else {
                                            i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                                        }
                                        int i9 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                                        int i10 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                                        int i11 = i7;
                                        final int i12 = i9 + i10;
                                        final int i13 = i6 + i11;
                                        int i14 = z16 ? i12 : i13;
                                        if (z16 && !z) {
                                            i8 = i9;
                                        } else if (z16 && z) {
                                            i8 = i10;
                                        } else {
                                            i8 = (z16 || z) ? i11 : i6;
                                        }
                                        int i15 = i14 - i8;
                                        long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i13, -i12);
                                        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                        PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                        int i16 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(f32);
                                        if (z16) {
                                            m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i12;
                                        } else {
                                            m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i13;
                                        }
                                        if (!z || m6218getMaxWidthimpl > 0) {
                                            IntOffset = IntOffsetKt.IntOffset(i6, i9);
                                        } else {
                                            if (!z16) {
                                                i6 += m6218getMaxWidthimpl;
                                            }
                                            if (z16) {
                                                i9 += m6218getMaxWidthimpl;
                                            }
                                            IntOffset = IntOffsetKt.IntOffset(i6, i9);
                                        }
                                        long j2 = IntOffset;
                                        int coerceAtLeast = RangesKt.coerceAtLeast(pageSize32.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6218getMaxWidthimpl, i16), 0);
                                        PagerState.this.m922setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation32 == Orientation.Vertical ? Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU) : coerceAtLeast, 0, orientation32 != Orientation.Vertical ? Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU) : coerceAtLeast, 5, null));
                                        PagerLazyLayoutItemProvider invoke = function0.invoke();
                                        Snapshot.Companion companion = Snapshot.INSTANCE;
                                        PagerState pagerState2 = PagerState.this;
                                        SnapPosition snapPosition4 = snapPosition32;
                                        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                        try {
                                            int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                            int currentPageOffset = PagerKt.currentPageOffset(snapPosition4, m6218getMaxWidthimpl, coerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                            Unit unit = Unit.INSTANCE;
                                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                            int i17 = m6218getMaxWidthimpl;
                                            int i18 = i8;
                                            PagerMeasureResult m915measurePagerbmk8ZPk = PagerMeasureKt.m915measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i17, i18, i15, i16, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6237offsetNN6EwU, orientation32, vertical32, horizontal32, z, j2, coerceAtLeast, i52, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition32, PagerState.this.m919getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                }

                                                public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m6234constrainHeightK40F9xA(j, i20 + i12), MapsKt.emptyMap(), function1);
                                                }
                                            });
                                            PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m915measurePagerbmk8ZPk, false, 2, null);
                                            return m915measurePagerbmk8ZPk;
                                        } catch (Throwable th) {
                                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                            throw th;
                                        }
                                    }
                                };
                                composer.updateRememberedValue(rememberedValue);
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                return function22;
                            }
                            z7 = true;
                            boolean z152 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14 | z7;
                            if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072) {
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                            }
                            z8 = true;
                            changed = z152 | z8 | composer.changed(coroutineScope);
                            rememberedValue = composer.rememberedValue();
                            if (!changed) {
                            }
                            final int i522 = i4;
                            final SnapPosition snapPosition322 = snapPosition2;
                            final Alignment.Horizontal horizontal322 = horizontal2;
                            final Alignment.Vertical vertical322 = vertical2;
                            final float f322 = f2;
                            final PageSize pageSize322 = pageSize2;
                            final Orientation orientation322 = orientation2;
                            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                    return m917invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                }

                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final PagerMeasureResult m917invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                    int i6;
                                    int i7;
                                    int i8;
                                    int m6218getMaxWidthimpl;
                                    long IntOffset;
                                    ObservableScopeInvalidator.m847attachToScopeimpl(PagerState.this.m918getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                    boolean z16 = orientation322 == Orientation.Vertical;
                                    CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                                    PaddingValues paddingValues2 = paddingValues;
                                    if (z16) {
                                        i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                    } else {
                                        i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                                    }
                                    PaddingValues paddingValues3 = paddingValues;
                                    if (z16) {
                                        i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                    } else {
                                        i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                                    }
                                    int i9 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                                    int i10 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                                    int i11 = i7;
                                    final int i12 = i9 + i10;
                                    final int i13 = i6 + i11;
                                    int i14 = z16 ? i12 : i13;
                                    if (z16 && !z) {
                                        i8 = i9;
                                    } else if (z16 && z) {
                                        i8 = i10;
                                    } else {
                                        i8 = (z16 || z) ? i11 : i6;
                                    }
                                    int i15 = i14 - i8;
                                    long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i13, -i12);
                                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                    PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                    int i16 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(f322);
                                    if (z16) {
                                        m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i12;
                                    } else {
                                        m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i13;
                                    }
                                    if (!z || m6218getMaxWidthimpl > 0) {
                                        IntOffset = IntOffsetKt.IntOffset(i6, i9);
                                    } else {
                                        if (!z16) {
                                            i6 += m6218getMaxWidthimpl;
                                        }
                                        if (z16) {
                                            i9 += m6218getMaxWidthimpl;
                                        }
                                        IntOffset = IntOffsetKt.IntOffset(i6, i9);
                                    }
                                    long j2 = IntOffset;
                                    int coerceAtLeast = RangesKt.coerceAtLeast(pageSize322.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6218getMaxWidthimpl, i16), 0);
                                    PagerState.this.m922setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation322 == Orientation.Vertical ? Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU) : coerceAtLeast, 0, orientation322 != Orientation.Vertical ? Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU) : coerceAtLeast, 5, null));
                                    PagerLazyLayoutItemProvider invoke = function0.invoke();
                                    Snapshot.Companion companion = Snapshot.INSTANCE;
                                    PagerState pagerState2 = PagerState.this;
                                    SnapPosition snapPosition4 = snapPosition322;
                                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                    try {
                                        int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                        int currentPageOffset = PagerKt.currentPageOffset(snapPosition4, m6218getMaxWidthimpl, coerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                        Unit unit = Unit.INSTANCE;
                                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                        int i17 = m6218getMaxWidthimpl;
                                        int i18 = i8;
                                        PagerMeasureResult m915measurePagerbmk8ZPk = PagerMeasureKt.m915measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i17, i18, i15, i16, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6237offsetNN6EwU, orientation322, vertical322, horizontal322, z, j2, coerceAtLeast, i522, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition322, PagerState.this.m919getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                            }

                                            public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m6234constrainHeightK40F9xA(j, i20 + i12), MapsKt.emptyMap(), function1);
                                            }
                                        });
                                        PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m915measurePagerbmk8ZPk, false, 2, null);
                                        return m915measurePagerbmk8ZPk;
                                    } catch (Throwable th) {
                                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                        throw th;
                                    }
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222 = (Function2) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            return function222;
                        }
                        z6 = true;
                        boolean z142 = z13 | z6;
                        if (((i3 & 14) ^ 6) <= 4) {
                        }
                        if ((i3 & 6) != 4) {
                        }
                        z7 = true;
                        boolean z1522 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(function02)) || (i3 & 384) == 256) | z142 | z7;
                        if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072) {
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                        }
                        z8 = true;
                        changed = z1522 | z8 | composer.changed(coroutineScope);
                        rememberedValue = composer.rememberedValue();
                        if (!changed) {
                        }
                        final int i5222 = i4;
                        final SnapPosition snapPosition3222 = snapPosition2;
                        final Alignment.Horizontal horizontal3222 = horizontal2;
                        final Alignment.Vertical vertical3222 = vertical2;
                        final float f3222 = f2;
                        final PageSize pageSize3222 = pageSize2;
                        final Orientation orientation3222 = orientation2;
                        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                return m917invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final PagerMeasureResult m917invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                int i6;
                                int i7;
                                int i8;
                                int m6218getMaxWidthimpl;
                                long IntOffset;
                                ObservableScopeInvalidator.m847attachToScopeimpl(PagerState.this.m918getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                boolean z16 = orientation3222 == Orientation.Vertical;
                                CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                                PaddingValues paddingValues2 = paddingValues;
                                if (z16) {
                                    i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                } else {
                                    i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                                }
                                PaddingValues paddingValues3 = paddingValues;
                                if (z16) {
                                    i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                } else {
                                    i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                                }
                                int i9 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                                int i10 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                                int i11 = i7;
                                final int i12 = i9 + i10;
                                final int i13 = i6 + i11;
                                int i14 = z16 ? i12 : i13;
                                if (z16 && !z) {
                                    i8 = i9;
                                } else if (z16 && z) {
                                    i8 = i10;
                                } else {
                                    i8 = (z16 || z) ? i11 : i6;
                                }
                                int i15 = i14 - i8;
                                long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i13, -i12);
                                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                int i16 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(f3222);
                                if (z16) {
                                    m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i12;
                                } else {
                                    m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i13;
                                }
                                if (!z || m6218getMaxWidthimpl > 0) {
                                    IntOffset = IntOffsetKt.IntOffset(i6, i9);
                                } else {
                                    if (!z16) {
                                        i6 += m6218getMaxWidthimpl;
                                    }
                                    if (z16) {
                                        i9 += m6218getMaxWidthimpl;
                                    }
                                    IntOffset = IntOffsetKt.IntOffset(i6, i9);
                                }
                                long j2 = IntOffset;
                                int coerceAtLeast = RangesKt.coerceAtLeast(pageSize3222.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6218getMaxWidthimpl, i16), 0);
                                PagerState.this.m922setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation3222 == Orientation.Vertical ? Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU) : coerceAtLeast, 0, orientation3222 != Orientation.Vertical ? Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU) : coerceAtLeast, 5, null));
                                PagerLazyLayoutItemProvider invoke = function0.invoke();
                                Snapshot.Companion companion = Snapshot.INSTANCE;
                                PagerState pagerState2 = PagerState.this;
                                SnapPosition snapPosition4 = snapPosition3222;
                                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                try {
                                    int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                    int currentPageOffset = PagerKt.currentPageOffset(snapPosition4, m6218getMaxWidthimpl, coerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                    Unit unit = Unit.INSTANCE;
                                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                    int i17 = m6218getMaxWidthimpl;
                                    int i18 = i8;
                                    PagerMeasureResult m915measurePagerbmk8ZPk = PagerMeasureKt.m915measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i17, i18, i15, i16, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6237offsetNN6EwU, orientation3222, vertical3222, horizontal3222, z, j2, coerceAtLeast, i5222, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition3222, PagerState.this.m919getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                        }

                                        public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m6234constrainHeightK40F9xA(j, i20 + i12), MapsKt.emptyMap(), function1);
                                        }
                                    });
                                    PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m915measurePagerbmk8ZPk, false, 2, null);
                                    return m915measurePagerbmk8ZPk;
                                } catch (Throwable th) {
                                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                    throw th;
                                }
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222 = (Function2) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        return function2222;
                    }
                    z5 = true;
                    boolean z132 = z12 | z5;
                    if (((29360128 & i2) ^ 12582912) > 8388608) {
                    }
                    if ((12582912 & i2) != 8388608) {
                    }
                    z6 = true;
                    boolean z1422 = z132 | z6;
                    if (((i3 & 14) ^ 6) <= 4) {
                    }
                    if ((i3 & 6) != 4) {
                    }
                    z7 = true;
                    boolean z15222 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(function02)) || (i3 & 384) == 256) | z1422 | z7;
                    if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                    }
                    z8 = true;
                    changed = z15222 | z8 | composer.changed(coroutineScope);
                    rememberedValue = composer.rememberedValue();
                    if (!changed) {
                    }
                    final int i52222 = i4;
                    final SnapPosition snapPosition32222 = snapPosition2;
                    final Alignment.Horizontal horizontal32222 = horizontal2;
                    final Alignment.Vertical vertical32222 = vertical2;
                    final float f32222 = f2;
                    final PageSize pageSize32222 = pageSize2;
                    final Orientation orientation32222 = orientation2;
                    rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                            return m917invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                        }

                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final PagerMeasureResult m917invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                            int i6;
                            int i7;
                            int i8;
                            int m6218getMaxWidthimpl;
                            long IntOffset;
                            ObservableScopeInvalidator.m847attachToScopeimpl(PagerState.this.m918getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                            boolean z16 = orientation32222 == Orientation.Vertical;
                            CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                            PaddingValues paddingValues2 = paddingValues;
                            if (z16) {
                                i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                            } else {
                                i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                            }
                            PaddingValues paddingValues3 = paddingValues;
                            if (z16) {
                                i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                            } else {
                                i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                            }
                            int i9 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                            int i10 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                            int i11 = i7;
                            final int i12 = i9 + i10;
                            final int i13 = i6 + i11;
                            int i14 = z16 ? i12 : i13;
                            if (z16 && !z) {
                                i8 = i9;
                            } else if (z16 && z) {
                                i8 = i10;
                            } else {
                                i8 = (z16 || z) ? i11 : i6;
                            }
                            int i15 = i14 - i8;
                            long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i13, -i12);
                            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                            PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                            int i16 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(f32222);
                            if (z16) {
                                m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i12;
                            } else {
                                m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i13;
                            }
                            if (!z || m6218getMaxWidthimpl > 0) {
                                IntOffset = IntOffsetKt.IntOffset(i6, i9);
                            } else {
                                if (!z16) {
                                    i6 += m6218getMaxWidthimpl;
                                }
                                if (z16) {
                                    i9 += m6218getMaxWidthimpl;
                                }
                                IntOffset = IntOffsetKt.IntOffset(i6, i9);
                            }
                            long j2 = IntOffset;
                            int coerceAtLeast = RangesKt.coerceAtLeast(pageSize32222.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6218getMaxWidthimpl, i16), 0);
                            PagerState.this.m922setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation32222 == Orientation.Vertical ? Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU) : coerceAtLeast, 0, orientation32222 != Orientation.Vertical ? Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU) : coerceAtLeast, 5, null));
                            PagerLazyLayoutItemProvider invoke = function0.invoke();
                            Snapshot.Companion companion = Snapshot.INSTANCE;
                            PagerState pagerState2 = PagerState.this;
                            SnapPosition snapPosition4 = snapPosition32222;
                            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                int currentPageOffset = PagerKt.currentPageOffset(snapPosition4, m6218getMaxWidthimpl, coerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                Unit unit = Unit.INSTANCE;
                                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                int i17 = m6218getMaxWidthimpl;
                                int i18 = i8;
                                PagerMeasureResult m915measurePagerbmk8ZPk = PagerMeasureKt.m915measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i17, i18, i15, i16, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6237offsetNN6EwU, orientation32222, vertical32222, horizontal32222, z, j2, coerceAtLeast, i52222, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition32222, PagerState.this.m919getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                    }

                                    public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m6234constrainHeightK40F9xA(j, i20 + i12), MapsKt.emptyMap(), function1);
                                    }
                                });
                                PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m915measurePagerbmk8ZPk, false, 2, null);
                                return m915measurePagerbmk8ZPk;
                            } catch (Throwable th) {
                                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                throw th;
                            }
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222 = (Function2) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    return function22222;
                }
                z4 = true;
                boolean z122 = z11 | z4;
                if (((3670016 & i2) ^ 1572864) <= 1048576) {
                }
                if ((1572864 & i2) != 1048576) {
                }
                z5 = true;
                boolean z1322 = z122 | z5;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                }
                if ((12582912 & i2) != 8388608) {
                }
                z6 = true;
                boolean z14222 = z1322 | z6;
                if (((i3 & 14) ^ 6) <= 4) {
                }
                if ((i3 & 6) != 4) {
                }
                z7 = true;
                boolean z152222 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(function02)) || (i3 & 384) == 256) | z14222 | z7;
                if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                }
                z8 = true;
                changed = z152222 | z8 | composer.changed(coroutineScope);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                final int i522222 = i4;
                final SnapPosition snapPosition322222 = snapPosition2;
                final Alignment.Horizontal horizontal322222 = horizontal2;
                final Alignment.Vertical vertical322222 = vertical2;
                final float f322222 = f2;
                final PageSize pageSize322222 = pageSize2;
                final Orientation orientation322222 = orientation2;
                rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m917invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final PagerMeasureResult m917invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                        int i6;
                        int i7;
                        int i8;
                        int m6218getMaxWidthimpl;
                        long IntOffset;
                        ObservableScopeInvalidator.m847attachToScopeimpl(PagerState.this.m918getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        boolean z16 = orientation322222 == Orientation.Vertical;
                        CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                        PaddingValues paddingValues2 = paddingValues;
                        if (z16) {
                            i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        PaddingValues paddingValues3 = paddingValues;
                        if (z16) {
                            i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        int i9 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                        int i10 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                        int i11 = i7;
                        final int i12 = i9 + i10;
                        final int i13 = i6 + i11;
                        int i14 = z16 ? i12 : i13;
                        if (z16 && !z) {
                            i8 = i9;
                        } else if (z16 && z) {
                            i8 = i10;
                        } else {
                            i8 = (z16 || z) ? i11 : i6;
                        }
                        int i15 = i14 - i8;
                        long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i13, -i12);
                        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                        PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                        int i16 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(f322222);
                        if (z16) {
                            m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i12;
                        } else {
                            m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i13;
                        }
                        if (!z || m6218getMaxWidthimpl > 0) {
                            IntOffset = IntOffsetKt.IntOffset(i6, i9);
                        } else {
                            if (!z16) {
                                i6 += m6218getMaxWidthimpl;
                            }
                            if (z16) {
                                i9 += m6218getMaxWidthimpl;
                            }
                            IntOffset = IntOffsetKt.IntOffset(i6, i9);
                        }
                        long j2 = IntOffset;
                        int coerceAtLeast = RangesKt.coerceAtLeast(pageSize322222.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6218getMaxWidthimpl, i16), 0);
                        PagerState.this.m922setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation322222 == Orientation.Vertical ? Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU) : coerceAtLeast, 0, orientation322222 != Orientation.Vertical ? Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU) : coerceAtLeast, 5, null));
                        PagerLazyLayoutItemProvider invoke = function0.invoke();
                        Snapshot.Companion companion = Snapshot.INSTANCE;
                        PagerState pagerState2 = PagerState.this;
                        SnapPosition snapPosition4 = snapPosition322222;
                        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                            int currentPageOffset = PagerKt.currentPageOffset(snapPosition4, m6218getMaxWidthimpl, coerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                            Unit unit = Unit.INSTANCE;
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            int i17 = m6218getMaxWidthimpl;
                            int i18 = i8;
                            PagerMeasureResult m915measurePagerbmk8ZPk = PagerMeasureKt.m915measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i17, i18, i15, i16, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6237offsetNN6EwU, orientation322222, vertical322222, horizontal322222, z, j2, coerceAtLeast, i522222, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition322222, PagerState.this.m919getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m6234constrainHeightK40F9xA(j, i20 + i12), MapsKt.emptyMap(), function1);
                                }
                            });
                            PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m915measurePagerbmk8ZPk, false, 2, null);
                            return m915measurePagerbmk8ZPk;
                        } catch (Throwable th) {
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            throw th;
                        }
                    }
                };
                composer.updateRememberedValue(rememberedValue);
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222222 = (Function2) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                return function222222;
            }
            z3 = true;
            boolean z112 = z10 | z3;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
            }
            if ((805306368 & i2) != 536870912) {
            }
            z4 = true;
            boolean z1222 = z112 | z4;
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
            }
            if ((1572864 & i2) != 1048576) {
            }
            z5 = true;
            boolean z13222 = z1222 | z5;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            z6 = true;
            boolean z142222 = z13222 | z6;
            if (((i3 & 14) ^ 6) <= 4) {
            }
            if ((i3 & 6) != 4) {
            }
            z7 = true;
            boolean z1522222 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(function02)) || (i3 & 384) == 256) | z142222 | z7;
            if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
            }
            z8 = true;
            changed = z1522222 | z8 | composer.changed(coroutineScope);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            final int i5222222 = i4;
            final SnapPosition snapPosition3222222 = snapPosition2;
            final Alignment.Horizontal horizontal3222222 = horizontal2;
            final Alignment.Vertical vertical3222222 = vertical2;
            final float f3222222 = f2;
            final PageSize pageSize3222222 = pageSize2;
            final Orientation orientation3222222 = orientation2;
            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m917invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final PagerMeasureResult m917invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i6;
                    int i7;
                    int i8;
                    int m6218getMaxWidthimpl;
                    long IntOffset;
                    ObservableScopeInvalidator.m847attachToScopeimpl(PagerState.this.m918getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z16 = orientation3222222 == Orientation.Vertical;
                    CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                    PaddingValues paddingValues2 = paddingValues;
                    if (z16) {
                        i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    PaddingValues paddingValues3 = paddingValues;
                    if (z16) {
                        i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i9 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                    int i10 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                    int i11 = i7;
                    final int i12 = i9 + i10;
                    final int i13 = i6 + i11;
                    int i14 = z16 ? i12 : i13;
                    if (z16 && !z) {
                        i8 = i9;
                    } else if (z16 && z) {
                        i8 = i10;
                    } else {
                        i8 = (z16 || z) ? i11 : i6;
                    }
                    int i15 = i14 - i8;
                    long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i13, -i12);
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    int i16 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(f3222222);
                    if (z16) {
                        m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i12;
                    } else {
                        m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i13;
                    }
                    if (!z || m6218getMaxWidthimpl > 0) {
                        IntOffset = IntOffsetKt.IntOffset(i6, i9);
                    } else {
                        if (!z16) {
                            i6 += m6218getMaxWidthimpl;
                        }
                        if (z16) {
                            i9 += m6218getMaxWidthimpl;
                        }
                        IntOffset = IntOffsetKt.IntOffset(i6, i9);
                    }
                    long j2 = IntOffset;
                    int coerceAtLeast = RangesKt.coerceAtLeast(pageSize3222222.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6218getMaxWidthimpl, i16), 0);
                    PagerState.this.m922setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation3222222 == Orientation.Vertical ? Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU) : coerceAtLeast, 0, orientation3222222 != Orientation.Vertical ? Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU) : coerceAtLeast, 5, null));
                    PagerLazyLayoutItemProvider invoke = function0.invoke();
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    PagerState pagerState2 = PagerState.this;
                    SnapPosition snapPosition4 = snapPosition3222222;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                        int currentPageOffset = PagerKt.currentPageOffset(snapPosition4, m6218getMaxWidthimpl, coerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        int i17 = m6218getMaxWidthimpl;
                        int i18 = i8;
                        PagerMeasureResult m915measurePagerbmk8ZPk = PagerMeasureKt.m915measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i17, i18, i15, i16, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6237offsetNN6EwU, orientation3222222, vertical3222222, horizontal3222222, z, j2, coerceAtLeast, i5222222, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition3222222, PagerState.this.m919getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                            }

                            public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m6234constrainHeightK40F9xA(j, i20 + i12), MapsKt.emptyMap(), function1);
                            }
                        });
                        PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m915measurePagerbmk8ZPk, false, 2, null);
                        return m915measurePagerbmk8ZPk;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222222 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function2222222;
        }
        z2 = true;
        boolean z102 = z9 | z2;
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) != 67108864) {
        }
        z3 = true;
        boolean z1122 = z102 | z3;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
        }
        if ((805306368 & i2) != 536870912) {
        }
        z4 = true;
        boolean z12222 = z1122 | z4;
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) != 1048576) {
        }
        z5 = true;
        boolean z132222 = z12222 | z5;
        if (((29360128 & i2) ^ 12582912) > 8388608) {
        }
        if ((12582912 & i2) != 8388608) {
        }
        z6 = true;
        boolean z1422222 = z132222 | z6;
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
        }
        z7 = true;
        boolean z15222222 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(function02)) || (i3 & 384) == 256) | z1422222 | z7;
        if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
        }
        z8 = true;
        changed = z15222222 | z8 | composer.changed(coroutineScope);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        final int i52222222 = i4;
        final SnapPosition snapPosition32222222 = snapPosition2;
        final Alignment.Horizontal horizontal32222222 = horizontal2;
        final Alignment.Vertical vertical32222222 = vertical2;
        final float f32222222 = f2;
        final PageSize pageSize32222222 = pageSize2;
        final Orientation orientation32222222 = orientation2;
        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                return m917invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final PagerMeasureResult m917invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                int i6;
                int i7;
                int i8;
                int m6218getMaxWidthimpl;
                long IntOffset;
                ObservableScopeInvalidator.m847attachToScopeimpl(PagerState.this.m918getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                boolean z16 = orientation32222222 == Orientation.Vertical;
                CheckScrollableContainerConstraintsKt.m256checkScrollableContainerConstraintsK40F9xA(j, z16 ? Orientation.Vertical : Orientation.Horizontal);
                PaddingValues paddingValues2 = paddingValues;
                if (z16) {
                    i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues2.mo624calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i6 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                PaddingValues paddingValues3 = paddingValues;
                if (z16) {
                    i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues3.mo625calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i7 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues3, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                int i9 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getTop());
                int i10 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(paddingValues.getBottom());
                int i11 = i7;
                final int i12 = i9 + i10;
                final int i13 = i6 + i11;
                int i14 = z16 ? i12 : i13;
                if (z16 && !z) {
                    i8 = i9;
                } else if (z16 && z) {
                    i8 = i10;
                } else {
                    i8 = (z16 || z) ? i11 : i6;
                }
                int i15 = i14 - i8;
                long m6237offsetNN6EwU = ConstraintsKt.m6237offsetNN6EwU(j, -i13, -i12);
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                int i16 = lazyLayoutMeasureScope.mo359roundToPx0680j_4(f32222222);
                if (z16) {
                    m6218getMaxWidthimpl = Constraints.m6217getMaxHeightimpl(j) - i12;
                } else {
                    m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j) - i13;
                }
                if (!z || m6218getMaxWidthimpl > 0) {
                    IntOffset = IntOffsetKt.IntOffset(i6, i9);
                } else {
                    if (!z16) {
                        i6 += m6218getMaxWidthimpl;
                    }
                    if (z16) {
                        i9 += m6218getMaxWidthimpl;
                    }
                    IntOffset = IntOffsetKt.IntOffset(i6, i9);
                }
                long j2 = IntOffset;
                int coerceAtLeast = RangesKt.coerceAtLeast(pageSize32222222.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6218getMaxWidthimpl, i16), 0);
                PagerState.this.m922setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation32222222 == Orientation.Vertical ? Constraints.m6218getMaxWidthimpl(m6237offsetNN6EwU) : coerceAtLeast, 0, orientation32222222 != Orientation.Vertical ? Constraints.m6217getMaxHeightimpl(m6237offsetNN6EwU) : coerceAtLeast, 5, null));
                PagerLazyLayoutItemProvider invoke = function0.invoke();
                Snapshot.Companion companion = Snapshot.INSTANCE;
                PagerState pagerState2 = PagerState.this;
                SnapPosition snapPosition4 = snapPosition32222222;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                    int currentPageOffset = PagerKt.currentPageOffset(snapPosition4, m6218getMaxWidthimpl, coerceAtLeast, i16, i8, i15, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                    Unit unit = Unit.INSTANCE;
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    int i17 = m6218getMaxWidthimpl;
                    int i18 = i8;
                    PagerMeasureResult m915measurePagerbmk8ZPk = PagerMeasureKt.m915measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i17, i18, i15, i16, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6237offsetNN6EwU, orientation32222222, vertical32222222, horizontal32222222, z, j2, coerceAtLeast, i52222222, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition32222222, PagerState.this.m919getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                        }

                        public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6235constrainWidthK40F9xA(j, i19 + i13), ConstraintsKt.m6234constrainHeightK40F9xA(j, i20 + i12), MapsKt.emptyMap(), function1);
                        }
                    });
                    PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m915measurePagerbmk8ZPk, false, 2, null);
                    return m915measurePagerbmk8ZPk;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
        };
        composer.updateRememberedValue(rememberedValue);
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222222 = (Function2) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function22222222;
    }
}
