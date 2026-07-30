package androidx.compose.foundation.pager;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty0;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÞ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162#\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"21\u0010#\u001a-\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010$¢\u0006\u0002\b'¢\u0006\u0002\b(H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0081\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u0004\u001a\u00020\u000521\u0010#\u001a-\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010$¢\u0006\u0002\b'¢\u0006\u0002\b(2#\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100,H\u0003¢\u0006\u0002\u0010/\u001a\u0014\u00100\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Pager", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Pager-uYRUAWA", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZIFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "rememberPagerItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pageCount", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "dragDirectionDetector", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0221  */
    /* renamed from: Pager-uYRUAWA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m914PageruYRUAWA(final Modifier modifier, final PagerState pagerState, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final TargetedFlingBehavior targetedFlingBehavior, final boolean z2, int i, float f, final PageSize pageSize, final NestedScrollConnection nestedScrollConnection, final Function1<? super Integer, ? extends Object> function1, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        int i10;
        boolean z3;
        final int i11;
        final float f2;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(538371694);
        ComposerKt.sourceInformation(startRestartGroup, "C(Pager)P(5,13,1,11,6,2,14!1,10:c#ui.unit.Dp,9,8,4!1,15,12)111@5277L19,107@5162L134,113@5323L24,128@5906L19,115@5373L558,131@5957L92,136@6083L94,140@6237L7,141@6278L147,152@6576L277,166@7108L154,172@7425L7,165@7052L482,176@7548L385,148@6431L1730:LazyLayoutPager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(pagerState) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= startRestartGroup.changed(orientation) ? 16384 : 8192;
                }
                if ((i4 & 32) != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changed(targetedFlingBehavior) ? 131072 : 65536;
                }
                if ((i4 & 64) == 0) {
                    i12 = (1572864 & i2) == 0 ? startRestartGroup.changed(z2) ? 1048576 : 524288 : 1572864;
                    i6 = i4 & 128;
                    if (i6 == 0) {
                        i5 |= 12582912;
                        i7 = i;
                    } else {
                        i7 = i;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(i7) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i4 & 256;
                    if (i8 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i4 & 512) == 0) {
                        i5 |= 805306368;
                    } else if ((805306368 & i2) == 0) {
                        i5 |= startRestartGroup.changed(pageSize) ? 536870912 : 268435456;
                        if ((i4 & 1024) != 0) {
                            i9 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i9 = (startRestartGroup.changedInstance(nestedScrollConnection) ? 4 : 2) | i3;
                        } else {
                            i9 = i3;
                        }
                        if ((i4 & 2048) != 0) {
                            i9 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i9 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                            if ((i4 & 4096) == 0) {
                                i9 |= 384;
                            } else if ((i3 & 384) == 0) {
                                i9 |= startRestartGroup.changed(horizontal) ? 256 : 128;
                                if ((i4 & 8192) != 0) {
                                    i9 |= 3072;
                                } else if ((i3 & 3072) == 0) {
                                    i9 |= startRestartGroup.changed(vertical) ? 2048 : 1024;
                                    if ((i4 & 16384) == 0) {
                                        i9 |= 24576;
                                    } else if ((i3 & 24576) == 0) {
                                        i9 |= startRestartGroup.changed(snapPosition) ? 16384 : 8192;
                                        if ((i4 & 32768) != 0) {
                                            i9 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i9 |= startRestartGroup.changedInstance(function4) ? 131072 : 65536;
                                        }
                                        if ((i5 & 306783379) != 306783378 && (74899 & i9) == 74898 && startRestartGroup.getSkipping()) {
                                            startRestartGroup.skipToGroupEnd();
                                            f2 = f;
                                            composer2 = startRestartGroup;
                                            i11 = i7;
                                        } else {
                                            if (i6 != 0) {
                                                i7 = 0;
                                            }
                                            float m6299constructorimpl = i8 != 0 ? Dp.m6299constructorimpl(0) : f;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(538371694, i5, i9, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:101)");
                                            }
                                            if (i7 < 0) {
                                                throw new IllegalArgumentException(("beyondViewportPageCount should be greater than or equal to 0, you selected " + i7).toString());
                                            }
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1863502769, "CC(remember):LazyLayoutPager.kt#9igjgp");
                                            int i13 = i5 & 112;
                                            boolean z4 = i13 == 32;
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = (Function0) new Function0<Integer>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$pagerItemProvider$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Integer invoke() {
                                                        return Integer.valueOf(PagerState.this.getPageCount());
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            int i14 = i5 >> 3;
                                            int i15 = i14 & 14;
                                            int i16 = i9 >> 12;
                                            int i17 = i5;
                                            int i18 = i9;
                                            int i19 = i7;
                                            Function0<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda = rememberPagerItemProviderLambda(pagerState, function4, function1, (Function0) rememberedValue, startRestartGroup, i15 | (i16 & 112) | ((i9 << 3) & 896));
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1863522897, "CC(remember):LazyLayoutPager.kt#9igjgp");
                                            boolean z5 = i13 == 32;
                                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (z5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = (Function0) new Function0<Integer>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$measurePolicy$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Integer invoke() {
                                                        return Integer.valueOf(PagerState.this.getPageCount());
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            int i20 = i17 & 7168;
                                            int i21 = i17 >> 6;
                                            int i22 = i18 << 18;
                                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m924rememberPagerMeasurePolicy8u0NR3k = PagerMeasurePolicyKt.m924rememberPagerMeasurePolicy8u0NR3k(rememberPagerItemProviderLambda, pagerState, paddingValues, z, orientation, i19, m6299constructorimpl, pageSize, horizontal, vertical, snapPosition, coroutineScope, (Function0) rememberedValue3, startRestartGroup, (65520 & i17) | (i21 & 458752) | (3670016 & i21) | (29360128 & i21) | (i22 & 234881024) | (i22 & 1879048192), i16 & 14);
                                            if (orientation == Orientation.Vertical) {
                                                z3 = true;
                                                composer2 = startRestartGroup;
                                                i10 = i15;
                                            } else {
                                                composer2 = startRestartGroup;
                                                i10 = i15;
                                                z3 = false;
                                            }
                                            LazyLayoutSemanticState rememberPagerSemanticState = PagerSemanticsKt.rememberPagerSemanticState(pagerState, z3, composer2, i10);
                                            ComposerKt.sourceInformationMarkerStart(composer2, 1863528636, "CC(remember):LazyLayoutPager.kt#9igjgp");
                                            boolean z6 = (i13 == 32) | ((i17 & 458752) == 131072);
                                            Object rememberedValue4 = composer2.rememberedValue();
                                            if (z6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue4 = new PagerWrapperFlingBehavior(targetedFlingBehavior, pagerState);
                                                composer2.updateRememberedValue(rememberedValue4);
                                            }
                                            PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) rememberedValue4;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ProvidableCompositionLocal<BringIntoViewSpec> localBringIntoViewSpec = BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume = composer2.consume(localBringIntoViewSpec);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            BringIntoViewSpec bringIntoViewSpec = (BringIntoViewSpec) consume;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 1863534929, "CC(remember):LazyLayoutPager.kt#9igjgp");
                                            boolean changed = (i13 == 32) | composer2.changed(bringIntoViewSpec);
                                            Object rememberedValue5 = composer2.rememberedValue();
                                            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue5 = new PagerBringIntoViewSpec(pagerState, bringIntoViewSpec);
                                                composer2.updateRememberedValue(rememberedValue5);
                                            }
                                            PagerBringIntoViewSpec pagerBringIntoViewSpec = (PagerBringIntoViewSpec) rememberedValue5;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Modifier pagerSemantics = PagerKt.pagerSemantics(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(pagerState.getRemeasurementModifier()).then(pagerState.getAwaitLayoutModifier()), rememberPagerItemProviderLambda, rememberPagerSemanticState, orientation, z2, z, composer2, (i14 & 7168) | (57344 & i21) | ((i17 << 6) & 458752)), pagerState, orientation == Orientation.Vertical, coroutineScope, z2);
                                            LazyLayoutBeyondBoundsState rememberPagerBeyondBoundsState = PagerBeyondBoundsModifierKt.rememberPagerBeyondBoundsState(pagerState, i19, composer2, ((i17 >> 18) & 112) | i10);
                                            LazyLayoutBeyondBoundsInfo beyondBoundsInfo = pagerState.getBeyondBoundsInfo();
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer2.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            int i23 = i17 << 3;
                                            LazyLayoutKt.LazyLayout(rememberPagerItemProviderLambda, NestedScrollModifierKt.nestedScroll$default(dragDirectionDetector(ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(pagerSemantics, rememberPagerBeyondBoundsState, beyondBoundsInfo, z, (LayoutDirection) consume2, orientation, z2, composer2, (MutableVector.$stable << 6) | i20 | (i23 & 458752) | (i17 & 3670016)), pagerState, orientation, z2, z, pagerWrapperFlingBehavior, pagerState.getInternalInteractionSource(), pagerBringIntoViewSpec, composer2, (i21 & 896) | i13 | ((i17 >> 9) & 7168) | (i23 & 57344), 0), pagerState), nestedScrollConnection, null, 2, null), pagerState.getPrefetchState(), m924rememberPagerMeasurePolicy8u0NR3k, composer2, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            i11 = i19;
                                            f2 = m6299constructorimpl;
                                        }
                                        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup != null) {
                                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i24) {
                                                    LazyLayoutPagerKt.m914PageruYRUAWA(Modifier.this, pagerState, paddingValues, z, orientation, targetedFlingBehavior, z2, i11, f2, pageSize, nestedScrollConnection, function1, horizontal, vertical, snapPosition, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    if ((i4 & 32768) != 0) {
                                    }
                                    if ((i5 & 306783379) != 306783378) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (i7 < 0) {
                                    }
                                }
                                if ((i4 & 16384) == 0) {
                                }
                                if ((i4 & 32768) != 0) {
                                }
                                if ((i5 & 306783379) != 306783378) {
                                }
                                if (i6 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (i7 < 0) {
                                }
                            }
                            if ((i4 & 8192) != 0) {
                            }
                            if ((i4 & 16384) == 0) {
                            }
                            if ((i4 & 32768) != 0) {
                            }
                            if ((i5 & 306783379) != 306783378) {
                            }
                            if (i6 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (i7 < 0) {
                            }
                        }
                        if ((i4 & 4096) == 0) {
                        }
                        if ((i4 & 8192) != 0) {
                        }
                        if ((i4 & 16384) == 0) {
                        }
                        if ((i4 & 32768) != 0) {
                        }
                        if ((i5 & 306783379) != 306783378) {
                        }
                        if (i6 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (i7 < 0) {
                        }
                    }
                    if ((i4 & 1024) != 0) {
                    }
                    if ((i4 & 2048) != 0) {
                    }
                    if ((i4 & 4096) == 0) {
                    }
                    if ((i4 & 8192) != 0) {
                    }
                    if ((i4 & 16384) == 0) {
                    }
                    if ((i4 & 32768) != 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (i7 < 0) {
                    }
                }
                i5 |= i12;
                i6 = i4 & 128;
                if (i6 == 0) {
                }
                i8 = i4 & 256;
                if (i8 == 0) {
                }
                if ((i4 & 512) == 0) {
                }
                if ((i4 & 1024) != 0) {
                }
                if ((i4 & 2048) != 0) {
                }
                if ((i4 & 4096) == 0) {
                }
                if ((i4 & 8192) != 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((i4 & 32768) != 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (i7 < 0) {
                }
            }
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) == 0) {
            }
            i5 |= i12;
            i6 = i4 & 128;
            if (i6 == 0) {
            }
            i8 = i4 & 256;
            if (i8 == 0) {
            }
            if ((i4 & 512) == 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            if ((i4 & 4096) == 0) {
            }
            if ((i4 & 8192) != 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((i4 & 32768) != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (i7 < 0) {
            }
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) == 0) {
        }
        i5 |= i12;
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        i8 = i4 & 256;
        if (i8 == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        if ((i4 & 4096) == 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((i4 & 32768) != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (i7 < 0) {
        }
    }

    private static final Function0<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda(final PagerState pagerState, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function1<? super Integer, ? extends Object> function1, final Function0<Integer> function0, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1372505274, "C(rememberPagerItemProviderLambda)P(3,1)259@10522L33,260@10576L25,261@10613L677:LazyLayoutPager.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:258)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composer, (i >> 3) & 14);
        final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 6) & 14);
        ComposerKt.sourceInformationMarkerStart(composer, 1578864961, "CC(remember):LazyLayoutPager.kt#9igjgp");
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4) | composer.changed(rememberUpdatedState) | composer.changed(rememberUpdatedState2) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(function0)) || (i & 3072) == 2048);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new Function0<PagerLayoutIntervalContent>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PagerLayoutIntervalContent invoke() {
                    return new PagerLayoutIntervalContent(rememberUpdatedState.getValue(), rememberUpdatedState2.getValue(), function0.invoke().intValue());
                }
            });
            final State derivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new Function0<PagerLazyLayoutItemProvider>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PagerLazyLayoutItemProvider invoke() {
                    PagerLayoutIntervalContent value = derivedStateOf.getValue();
                    return new PagerLazyLayoutItemProvider(pagerState, value, new NearestRangeKeyIndexMap(pagerState.getNearestRange$foundation_release(), value));
                }
            });
            rememberedValue = (KProperty0) new PropertyReference0Impl(derivedStateOf2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        KProperty0 kProperty0 = (KProperty0) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return kProperty0;
    }

    private static final Modifier dragDirectionDetector(Modifier modifier, PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, pagerState, new LazyLayoutPagerKt$dragDirectionDetector$1(pagerState, null)));
    }
}
