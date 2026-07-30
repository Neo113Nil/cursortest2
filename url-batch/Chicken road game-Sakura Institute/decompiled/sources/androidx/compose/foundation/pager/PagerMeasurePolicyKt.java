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
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r34.changed(r27) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r34.changed(r28) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        if (r34.changed(r31) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (r34.changed(r33) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
    
        if (r34.changed(r26) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r34.changed(r22) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00cd  */
    /* renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m924rememberPagerMeasurePolicy8u0NR3k(final Function0<PagerLazyLayoutItemProvider> function0, final PagerState pagerState, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final int i, final float f, final PageSize pageSize, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final SnapPosition snapPosition, final CoroutineScope coroutineScope, final Function0<Integer> function02, Composer composer, int i2, int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1391419623, "C(rememberPagerMeasurePolicy)P(4,11,1,9,5!1,8:c#ui.unit.Dp,7,3,12,10)56@2301L6278:PagerMeasurePolicy.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1391419623, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 35232261, "CC(remember):PagerMeasurePolicy.kt#9igjgp");
        if (((i2 & 112) ^ 48) <= 32) {
        }
        if ((i2 & 48) != 32) {
            z2 = false;
            boolean z8 = z2 | ((((i2 & 896) ^ 384) <= 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) <= 2048 && composer.changed(z)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) <= 16384 && composer.changed(orientation)) || (i2 & 24576) == 16384) | ((((234881024 & i2) ^ 100663296) <= 67108864 && composer.changed(horizontal)) || (i2 & 100663296) == 67108864) | ((((1879048192 & i2) ^ 805306368) <= 536870912 && composer.changed(vertical)) || (i2 & 805306368) == 536870912);
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
            }
            if ((1572864 & i2) != 1048576) {
                z3 = false;
                boolean z9 = z8 | z3;
                if (((29360128 & i2) ^ 12582912) <= 8388608) {
                }
                if ((12582912 & i2) != 8388608) {
                    z4 = false;
                    boolean z10 = z9 | z4;
                    if (((i3 & 14) ^ 6) <= 4) {
                    }
                    if ((i3 & 6) != 4) {
                        z5 = false;
                        boolean z11 = z10 | z5;
                        if (((i3 & 896) ^ 384) <= 256) {
                        }
                        if ((i3 & 384) != 256) {
                            z6 = false;
                            boolean z12 = z6 | z11;
                            if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                z7 = false;
                                changed = z12 | z7 | composer.changed(coroutineScope);
                                rememberedValue = composer.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                            return m925invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final PagerMeasureResult m925invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                            int i4;
                                            int i5;
                                            int i6;
                                            int m6252getMaxWidthimpl;
                                            long IntOffset;
                                            ObservableScopeInvalidator.m855attachToScopeimpl(PagerState.this.m926getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                            boolean z13 = orientation == Orientation.Vertical;
                                            CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z13 ? Orientation.Vertical : Orientation.Horizontal);
                                            if (z13) {
                                                i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                            } else {
                                                i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            }
                                            if (z13) {
                                                i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                            } else {
                                                i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            }
                                            int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                                            int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                                            final int i9 = i7 + i8;
                                            final int i10 = i4 + i5;
                                            int i11 = z13 ? i9 : i10;
                                            if (z13 && !z) {
                                                i6 = i7;
                                            } else if (z13 && z) {
                                                i6 = i8;
                                            } else {
                                                i6 = (z13 || z) ? i5 : i4;
                                            }
                                            int i12 = i11 - i6;
                                            long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                                            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                            PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                            int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(f);
                                            if (z13) {
                                                m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                                            } else {
                                                m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                                            }
                                            if (!z || m6252getMaxWidthimpl > 0) {
                                                IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                            } else {
                                                if (!z13) {
                                                    i4 += m6252getMaxWidthimpl;
                                                }
                                                if (z13) {
                                                    i7 += m6252getMaxWidthimpl;
                                                }
                                                IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                            }
                                            long j2 = IntOffset;
                                            int coerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6252getMaxWidthimpl, i13), 0);
                                            PagerState.this.m930setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU) : coerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU) : coerceAtLeast, 5, null));
                                            PagerLazyLayoutItemProvider invoke = function0.invoke();
                                            Snapshot.Companion companion = Snapshot.INSTANCE;
                                            PagerState pagerState2 = PagerState.this;
                                            SnapPosition snapPosition2 = snapPosition;
                                            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                            try {
                                                int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                                int currentPageOffset = PagerKt.currentPageOffset(snapPosition2, m6252getMaxWidthimpl, coerceAtLeast, i13, i6, i12, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                                Unit unit = Unit.INSTANCE;
                                                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                int i14 = m6252getMaxWidthimpl;
                                                PagerMeasureResult m923measurePagerbmk8ZPk = PagerMeasureKt.m923measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i14, i6, i12, i13, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6271offsetNN6EwU, orientation, vertical, horizontal, z, j2, coerceAtLeast, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition, PagerState.this.m927getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                    }

                                                    public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                                    }
                                                });
                                                PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m923measurePagerbmk8ZPk, false, 2, null);
                                                return m923measurePagerbmk8ZPk;
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
                            z7 = true;
                            changed = z12 | z7 | composer.changed(coroutineScope);
                            rememberedValue = composer.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                    return m925invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                }

                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final PagerMeasureResult m925invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                    int i4;
                                    int i5;
                                    int i6;
                                    int m6252getMaxWidthimpl;
                                    long IntOffset;
                                    ObservableScopeInvalidator.m855attachToScopeimpl(PagerState.this.m926getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                    boolean z13 = orientation == Orientation.Vertical;
                                    CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z13 ? Orientation.Vertical : Orientation.Horizontal);
                                    if (z13) {
                                        i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                    } else {
                                        i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                    }
                                    if (z13) {
                                        i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                    } else {
                                        i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                    }
                                    int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                                    int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                                    final int i9 = i7 + i8;
                                    final int i10 = i4 + i5;
                                    int i11 = z13 ? i9 : i10;
                                    if (z13 && !z) {
                                        i6 = i7;
                                    } else if (z13 && z) {
                                        i6 = i8;
                                    } else {
                                        i6 = (z13 || z) ? i5 : i4;
                                    }
                                    int i12 = i11 - i6;
                                    long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                    PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                    int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(f);
                                    if (z13) {
                                        m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                                    } else {
                                        m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                                    }
                                    if (!z || m6252getMaxWidthimpl > 0) {
                                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                    } else {
                                        if (!z13) {
                                            i4 += m6252getMaxWidthimpl;
                                        }
                                        if (z13) {
                                            i7 += m6252getMaxWidthimpl;
                                        }
                                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                    }
                                    long j2 = IntOffset;
                                    int coerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6252getMaxWidthimpl, i13), 0);
                                    PagerState.this.m930setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU) : coerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU) : coerceAtLeast, 5, null));
                                    PagerLazyLayoutItemProvider invoke = function0.invoke();
                                    Snapshot.Companion companion = Snapshot.INSTANCE;
                                    PagerState pagerState2 = PagerState.this;
                                    SnapPosition snapPosition2 = snapPosition;
                                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                    try {
                                        int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                        int currentPageOffset = PagerKt.currentPageOffset(snapPosition2, m6252getMaxWidthimpl, coerceAtLeast, i13, i6, i12, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                        Unit unit = Unit.INSTANCE;
                                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                        int i14 = m6252getMaxWidthimpl;
                                        PagerMeasureResult m923measurePagerbmk8ZPk = PagerMeasureKt.m923measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i14, i6, i12, i13, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6271offsetNN6EwU, orientation, vertical, horizontal, z, j2, coerceAtLeast, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition, PagerState.this.m927getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                            }

                                            public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                            }
                                        });
                                        PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m923measurePagerbmk8ZPk, false, 2, null);
                                        return m923measurePagerbmk8ZPk;
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
                        z6 = true;
                        boolean z122 = z6 | z11;
                        if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                        }
                        z7 = true;
                        changed = z122 | z7 | composer.changed(coroutineScope);
                        rememberedValue = composer.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                return m925invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final PagerMeasureResult m925invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                int i4;
                                int i5;
                                int i6;
                                int m6252getMaxWidthimpl;
                                long IntOffset;
                                ObservableScopeInvalidator.m855attachToScopeimpl(PagerState.this.m926getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                boolean z13 = orientation == Orientation.Vertical;
                                CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z13 ? Orientation.Vertical : Orientation.Horizontal);
                                if (z13) {
                                    i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                } else {
                                    i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                }
                                if (z13) {
                                    i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                } else {
                                    i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                }
                                int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                                int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                                final int i9 = i7 + i8;
                                final int i10 = i4 + i5;
                                int i11 = z13 ? i9 : i10;
                                if (z13 && !z) {
                                    i6 = i7;
                                } else if (z13 && z) {
                                    i6 = i8;
                                } else {
                                    i6 = (z13 || z) ? i5 : i4;
                                }
                                int i12 = i11 - i6;
                                long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                                PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                                int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(f);
                                if (z13) {
                                    m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                                } else {
                                    m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                                }
                                if (!z || m6252getMaxWidthimpl > 0) {
                                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                } else {
                                    if (!z13) {
                                        i4 += m6252getMaxWidthimpl;
                                    }
                                    if (z13) {
                                        i7 += m6252getMaxWidthimpl;
                                    }
                                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                                }
                                long j2 = IntOffset;
                                int coerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6252getMaxWidthimpl, i13), 0);
                                PagerState.this.m930setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU) : coerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU) : coerceAtLeast, 5, null));
                                PagerLazyLayoutItemProvider invoke = function0.invoke();
                                Snapshot.Companion companion = Snapshot.INSTANCE;
                                PagerState pagerState2 = PagerState.this;
                                SnapPosition snapPosition2 = snapPosition;
                                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                try {
                                    int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                    int currentPageOffset = PagerKt.currentPageOffset(snapPosition2, m6252getMaxWidthimpl, coerceAtLeast, i13, i6, i12, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                    Unit unit = Unit.INSTANCE;
                                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                    int i14 = m6252getMaxWidthimpl;
                                    PagerMeasureResult m923measurePagerbmk8ZPk = PagerMeasureKt.m923measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i14, i6, i12, i13, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6271offsetNN6EwU, orientation, vertical, horizontal, z, j2, coerceAtLeast, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition, PagerState.this.m927getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                        }

                                        public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                        }
                                    });
                                    PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m923measurePagerbmk8ZPk, false, 2, null);
                                    return m923measurePagerbmk8ZPk;
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
                    z5 = true;
                    boolean z112 = z10 | z5;
                    if (((i3 & 896) ^ 384) <= 256) {
                    }
                    if ((i3 & 384) != 256) {
                    }
                    z6 = true;
                    boolean z1222 = z6 | z112;
                    if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                    }
                    z7 = true;
                    changed = z1222 | z7 | composer.changed(coroutineScope);
                    rememberedValue = composer.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                            return m925invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                        }

                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final PagerMeasureResult m925invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                            int i4;
                            int i5;
                            int i6;
                            int m6252getMaxWidthimpl;
                            long IntOffset;
                            ObservableScopeInvalidator.m855attachToScopeimpl(PagerState.this.m926getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                            boolean z13 = orientation == Orientation.Vertical;
                            CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z13 ? Orientation.Vertical : Orientation.Horizontal);
                            if (z13) {
                                i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                            } else {
                                i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                            }
                            if (z13) {
                                i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                            } else {
                                i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                            }
                            int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                            int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                            final int i9 = i7 + i8;
                            final int i10 = i4 + i5;
                            int i11 = z13 ? i9 : i10;
                            if (z13 && !z) {
                                i6 = i7;
                            } else if (z13 && z) {
                                i6 = i8;
                            } else {
                                i6 = (z13 || z) ? i5 : i4;
                            }
                            int i12 = i11 - i6;
                            long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                            PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                            int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(f);
                            if (z13) {
                                m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                            } else {
                                m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                            }
                            if (!z || m6252getMaxWidthimpl > 0) {
                                IntOffset = IntOffsetKt.IntOffset(i4, i7);
                            } else {
                                if (!z13) {
                                    i4 += m6252getMaxWidthimpl;
                                }
                                if (z13) {
                                    i7 += m6252getMaxWidthimpl;
                                }
                                IntOffset = IntOffsetKt.IntOffset(i4, i7);
                            }
                            long j2 = IntOffset;
                            int coerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6252getMaxWidthimpl, i13), 0);
                            PagerState.this.m930setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU) : coerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU) : coerceAtLeast, 5, null));
                            PagerLazyLayoutItemProvider invoke = function0.invoke();
                            Snapshot.Companion companion = Snapshot.INSTANCE;
                            PagerState pagerState2 = PagerState.this;
                            SnapPosition snapPosition2 = snapPosition;
                            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                                int currentPageOffset = PagerKt.currentPageOffset(snapPosition2, m6252getMaxWidthimpl, coerceAtLeast, i13, i6, i12, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                                Unit unit = Unit.INSTANCE;
                                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                int i14 = m6252getMaxWidthimpl;
                                PagerMeasureResult m923measurePagerbmk8ZPk = PagerMeasureKt.m923measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i14, i6, i12, i13, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6271offsetNN6EwU, orientation, vertical, horizontal, z, j2, coerceAtLeast, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition, PagerState.this.m927getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                    }

                                    public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                    }
                                });
                                PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m923measurePagerbmk8ZPk, false, 2, null);
                                return m923measurePagerbmk8ZPk;
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
                z4 = true;
                boolean z102 = z9 | z4;
                if (((i3 & 14) ^ 6) <= 4) {
                }
                if ((i3 & 6) != 4) {
                }
                z5 = true;
                boolean z1122 = z102 | z5;
                if (((i3 & 896) ^ 384) <= 256) {
                }
                if ((i3 & 384) != 256) {
                }
                z6 = true;
                boolean z12222 = z6 | z1122;
                if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                }
                z7 = true;
                changed = z12222 | z7 | composer.changed(coroutineScope);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return m925invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final PagerMeasureResult m925invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                        int i4;
                        int i5;
                        int i6;
                        int m6252getMaxWidthimpl;
                        long IntOffset;
                        ObservableScopeInvalidator.m855attachToScopeimpl(PagerState.this.m926getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                        boolean z13 = orientation == Orientation.Vertical;
                        CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z13 ? Orientation.Vertical : Orientation.Horizontal);
                        if (z13) {
                            i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        if (z13) {
                            i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                        } else {
                            i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        }
                        int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                        int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                        final int i9 = i7 + i8;
                        final int i10 = i4 + i5;
                        int i11 = z13 ? i9 : i10;
                        if (z13 && !z) {
                            i6 = i7;
                        } else if (z13 && z) {
                            i6 = i8;
                        } else {
                            i6 = (z13 || z) ? i5 : i4;
                        }
                        int i12 = i11 - i6;
                        long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                        PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                        int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(f);
                        if (z13) {
                            m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                        } else {
                            m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                        }
                        if (!z || m6252getMaxWidthimpl > 0) {
                            IntOffset = IntOffsetKt.IntOffset(i4, i7);
                        } else {
                            if (!z13) {
                                i4 += m6252getMaxWidthimpl;
                            }
                            if (z13) {
                                i7 += m6252getMaxWidthimpl;
                            }
                            IntOffset = IntOffsetKt.IntOffset(i4, i7);
                        }
                        long j2 = IntOffset;
                        int coerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6252getMaxWidthimpl, i13), 0);
                        PagerState.this.m930setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU) : coerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU) : coerceAtLeast, 5, null));
                        PagerLazyLayoutItemProvider invoke = function0.invoke();
                        Snapshot.Companion companion = Snapshot.INSTANCE;
                        PagerState pagerState2 = PagerState.this;
                        SnapPosition snapPosition2 = snapPosition;
                        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                            int currentPageOffset = PagerKt.currentPageOffset(snapPosition2, m6252getMaxWidthimpl, coerceAtLeast, i13, i6, i12, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                            Unit unit = Unit.INSTANCE;
                            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            int i14 = m6252getMaxWidthimpl;
                            PagerMeasureResult m923measurePagerbmk8ZPk = PagerMeasureKt.m923measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i14, i6, i12, i13, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6271offsetNN6EwU, orientation, vertical, horizontal, z, j2, coerceAtLeast, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition, PagerState.this.m927getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                }
                            });
                            PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m923measurePagerbmk8ZPk, false, 2, null);
                            return m923measurePagerbmk8ZPk;
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
            z3 = true;
            boolean z92 = z8 | z3;
            if (((29360128 & i2) ^ 12582912) <= 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            z4 = true;
            boolean z1022 = z92 | z4;
            if (((i3 & 14) ^ 6) <= 4) {
            }
            if ((i3 & 6) != 4) {
            }
            z5 = true;
            boolean z11222 = z1022 | z5;
            if (((i3 & 896) ^ 384) <= 256) {
            }
            if ((i3 & 384) != 256) {
            }
            z6 = true;
            boolean z122222 = z6 | z11222;
            if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
            }
            z7 = true;
            changed = z122222 | z7 | composer.changed(coroutineScope);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m925invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final PagerMeasureResult m925invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i4;
                    int i5;
                    int i6;
                    int m6252getMaxWidthimpl;
                    long IntOffset;
                    ObservableScopeInvalidator.m855attachToScopeimpl(PagerState.this.m926getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z13 = orientation == Orientation.Vertical;
                    CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z13 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z13) {
                        i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z13) {
                        i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                    int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                    final int i9 = i7 + i8;
                    final int i10 = i4 + i5;
                    int i11 = z13 ? i9 : i10;
                    if (z13 && !z) {
                        i6 = i7;
                    } else if (z13 && z) {
                        i6 = i8;
                    } else {
                        i6 = (z13 || z) ? i5 : i4;
                    }
                    int i12 = i11 - i6;
                    long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(f);
                    if (z13) {
                        m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                    } else {
                        m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                    }
                    if (!z || m6252getMaxWidthimpl > 0) {
                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                    } else {
                        if (!z13) {
                            i4 += m6252getMaxWidthimpl;
                        }
                        if (z13) {
                            i7 += m6252getMaxWidthimpl;
                        }
                        IntOffset = IntOffsetKt.IntOffset(i4, i7);
                    }
                    long j2 = IntOffset;
                    int coerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6252getMaxWidthimpl, i13), 0);
                    PagerState.this.m930setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU) : coerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU) : coerceAtLeast, 5, null));
                    PagerLazyLayoutItemProvider invoke = function0.invoke();
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    PagerState pagerState2 = PagerState.this;
                    SnapPosition snapPosition2 = snapPosition;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                        int currentPageOffset = PagerKt.currentPageOffset(snapPosition2, m6252getMaxWidthimpl, coerceAtLeast, i13, i6, i12, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        int i14 = m6252getMaxWidthimpl;
                        PagerMeasureResult m923measurePagerbmk8ZPk = PagerMeasureKt.m923measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i14, i6, i12, i13, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6271offsetNN6EwU, orientation, vertical, horizontal, z, j2, coerceAtLeast, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition, PagerState.this.m927getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                            }

                            public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                            }
                        });
                        PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m923measurePagerbmk8ZPk, false, 2, null);
                        return m923measurePagerbmk8ZPk;
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
        z2 = true;
        boolean z82 = z2 | ((((i2 & 896) ^ 384) <= 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) <= 2048 && composer.changed(z)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) <= 16384 && composer.changed(orientation)) || (i2 & 24576) == 16384) | ((((234881024 & i2) ^ 100663296) <= 67108864 && composer.changed(horizontal)) || (i2 & 100663296) == 67108864) | ((((1879048192 & i2) ^ 805306368) <= 536870912 && composer.changed(vertical)) || (i2 & 805306368) == 536870912);
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) != 1048576) {
        }
        z3 = true;
        boolean z922 = z82 | z3;
        if (((29360128 & i2) ^ 12582912) <= 8388608) {
        }
        if ((12582912 & i2) != 8388608) {
        }
        z4 = true;
        boolean z10222 = z922 | z4;
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
        }
        z5 = true;
        boolean z112222 = z10222 | z5;
        if (((i3 & 896) ^ 384) <= 256) {
        }
        if ((i3 & 384) != 256) {
        }
        z6 = true;
        boolean z1222222 = z6 | z112222;
        if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
        }
        z7 = true;
        changed = z1222222 | z7 | composer.changed(coroutineScope);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                return m925invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final PagerMeasureResult m925invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                int i4;
                int i5;
                int i6;
                int m6252getMaxWidthimpl;
                long IntOffset;
                ObservableScopeInvalidator.m855attachToScopeimpl(PagerState.this.m926getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                boolean z13 = orientation == Orientation.Vertical;
                CheckScrollableContainerConstraintsKt.m264checkScrollableContainerConstraintsK40F9xA(j, z13 ? Orientation.Vertical : Orientation.Horizontal);
                if (z13) {
                    i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo632calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i4 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                if (z13) {
                    i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.mo633calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                } else {
                    i5 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                }
                int i7 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getTop());
                int i8 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(paddingValues.getBottom());
                final int i9 = i7 + i8;
                final int i10 = i4 + i5;
                int i11 = z13 ? i9 : i10;
                if (z13 && !z) {
                    i6 = i7;
                } else if (z13 && z) {
                    i6 = i8;
                } else {
                    i6 = (z13 || z) ? i5 : i4;
                }
                int i12 = i11 - i6;
                long m6271offsetNN6EwU = ConstraintsKt.m6271offsetNN6EwU(j, -i10, -i9);
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                PagerState.this.setDensity$foundation_release(lazyLayoutMeasureScope2);
                int i13 = lazyLayoutMeasureScope.mo367roundToPx0680j_4(f);
                if (z13) {
                    m6252getMaxWidthimpl = Constraints.m6251getMaxHeightimpl(j) - i9;
                } else {
                    m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - i10;
                }
                if (!z || m6252getMaxWidthimpl > 0) {
                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                } else {
                    if (!z13) {
                        i4 += m6252getMaxWidthimpl;
                    }
                    if (z13) {
                        i7 += m6252getMaxWidthimpl;
                    }
                    IntOffset = IntOffsetKt.IntOffset(i4, i7);
                }
                long j2 = IntOffset;
                int coerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m6252getMaxWidthimpl, i13), 0);
                PagerState.this.m930setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6252getMaxWidthimpl(m6271offsetNN6EwU) : coerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6251getMaxHeightimpl(m6271offsetNN6EwU) : coerceAtLeast, 5, null));
                PagerLazyLayoutItemProvider invoke = function0.invoke();
                Snapshot.Companion companion = Snapshot.INSTANCE;
                PagerState pagerState2 = PagerState.this;
                SnapPosition snapPosition2 = snapPosition;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                    int currentPageOffset = PagerKt.currentPageOffset(snapPosition2, m6252getMaxWidthimpl, coerceAtLeast, i13, i6, i12, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                    Unit unit = Unit.INSTANCE;
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    int i14 = m6252getMaxWidthimpl;
                    PagerMeasureResult m923measurePagerbmk8ZPk = PagerMeasureKt.m923measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i14, i6, i12, i13, matchScrollPositionWithKey$foundation_release, currentPageOffset, m6271offsetNN6EwU, orientation, vertical, horizontal, z, j2, coerceAtLeast, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, PagerState.this.getPinnedPages(), PagerState.this.getBeyondBoundsInfo()), snapPosition, PagerState.this.m927getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                        }

                        public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                            return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m6269constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6268constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                        }
                    });
                    PagerState.applyMeasureResult$foundation_release$default(PagerState.this, m923measurePagerbmk8ZPk, false, 2, null);
                    return m923measurePagerbmk8ZPk;
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
}
