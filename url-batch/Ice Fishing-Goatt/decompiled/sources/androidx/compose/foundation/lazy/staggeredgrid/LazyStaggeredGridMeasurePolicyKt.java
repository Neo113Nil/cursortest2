package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a)\u0010 \u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a!\u0010!\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"rememberStaggeredGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "rememberStaggeredGridMeasurePolicy-qKj4JfE", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "afterPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r25.changed(r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r25.changed(r20) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r25.changed(r11) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        r1 = (r2 | r6) | r25.changed(r24);
        r2 = r25.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        if (r1 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (r2 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0103, code lost:
    
        r2 = (kotlin.jvm.functions.Function2) r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
    
        androidx.compose.runtime.ComposerKt.traceEventEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0111, code lost:
    
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        r6 = r3;
        r7 = r11;
        r2 = (kotlin.jvm.functions.Function2) new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(r15, r6, r7, r16, r17, r18, r20, r22, r24);
        r25.updateRememberedValue(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        if ((r26 & 100663296) == 67108864) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m885rememberStaggeredGridMeasurePolicyqKj4JfE(final LazyStaggeredGridState lazyStaggeredGridState, final Function0<? extends LazyStaggeredGridItemProvider> function0, final PaddingValues paddingValues, final boolean z, Orientation orientation, final float f, float f2, final CoroutineScope coroutineScope, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final GraphicsContext graphicsContext, Composer composer, int i) {
        Orientation orientation2;
        boolean z2;
        boolean z3;
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider2;
        ComposerKt.sourceInformationMarkerStart(composer, 1630140849, "C(rememberStaggeredGridMeasurePolicy)P(9,4!1,7,6,5:c#ui.unit.Dp,2:c#ui.unit.Dp!1,8)50@2173L2923:LazyStaggeredGridMeasurePolicy.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630140849, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1650675918, "CC(remember):LazyStaggeredGridMeasurePolicy.kt#9igjgp");
        boolean z4 = false;
        boolean changed = composer.changed(lazyStaggeredGridState) | ((((i & 112) ^ 48) > 32 && composer.changed(function0)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i & 3072) == 2048);
        if (((57344 & i) ^ 24576) > 16384) {
            orientation2 = orientation;
        } else {
            orientation2 = orientation;
        }
        if ((i & 24576) != 16384) {
            z2 = false;
            boolean z5 = changed | z2;
            if (((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
            }
            if ((196608 & i) != 131072) {
                z3 = false;
                boolean z6 = z5 | z3 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576);
                if (((234881024 & i) ^ 100663296) > 67108864) {
                    lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
                } else {
                    lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
                }
            }
            z3 = true;
            boolean z62 = z5 | z3 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576);
            if (((234881024 & i) ^ 100663296) > 67108864) {
            }
        }
        z2 = true;
        boolean z52 = changed | z2;
        if (((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
        }
        if ((196608 & i) != 131072) {
        }
        z3 = true;
        boolean z622 = z52 | z3 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576);
        if (((234881024 & i) ^ 100663296) > 67108864) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i == 2) {
            return paddingValues.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
    }
}
