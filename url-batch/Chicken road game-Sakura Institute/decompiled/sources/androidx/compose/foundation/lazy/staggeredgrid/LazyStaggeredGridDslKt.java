package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;

/* compiled from: LazyStaggeredGridDsl.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0083\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\"\u001a%\u0010#\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010$\u001aÐ\u0001\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0'2%\b\n\u0010(\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u00142%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u00142%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u00010\u001423\b\u0004\u00100\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u000101¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00104\u001aÐ\u0001\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&052%\b\n\u0010(\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u00142%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u00142%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u00010\u001423\b\u0004\u00100\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u000101¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00106\u001a¤\u0002\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0'2:\b\n\u0010(\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u0001012:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,012:\b\n\u0010.\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u0001012H\b\u0004\u00100\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010;\u001a¤\u0002\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&052:\b\n\u0010(\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u0001012:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,012:\b\n\u0010.\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u0001012H\b\u0004\u00100\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"LazyHorizontalStaggeredGrid", "", "rows", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "columns", "verticalItemSpacing", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "items", "T", "", "key", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "", "contentType", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m877LazyVerticalStaggeredGridzadm560(final StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        int i6;
        float f2;
        int i7;
        int i8;
        Modifier.Companion companion;
        LazyStaggeredGridState lazyStaggeredGridState2;
        PaddingValues m674PaddingValues0680j_4;
        float m6299constructorimpl;
        Arrangement.HorizontalOrVertical m561spacedBy0680j_4;
        FlingBehavior flingBehavior2;
        boolean z4;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final boolean z5;
        boolean z6;
        Arrangement.Horizontal horizontal2;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1695323794);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyVerticalStaggeredGrid)P(!1,5,7,2,6,9:c#ui.unit.Dp,4,3,8)64@3068L32,69@3365L15,83@3878L67,73@3476L502:LazyStaggeredGridDsl.kt#fzvcnm");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changedInstance(lazyStaggeredGridState)) {
                    i10 = 256;
                    i3 |= i10;
                }
                i10 = 128;
                i3 |= i10;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i9 = 8388608;
                                i3 |= i9;
                            }
                            i9 = 4194304;
                            i3 |= i9;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                            if ((i3 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                                    if ((i2 & 4) == 0) {
                                        lazyStaggeredGridState2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                        i3 &= -897;
                                    } else {
                                        lazyStaggeredGridState2 = lazyStaggeredGridState;
                                    }
                                    m674PaddingValues0680j_4 = i4 == 0 ? PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(0)) : paddingValues2;
                                    if (i5 != 0) {
                                        z3 = false;
                                    }
                                    m6299constructorimpl = i6 == 0 ? Dp.m6299constructorimpl(0) : f2;
                                    m561spacedBy0680j_4 = i7 == 0 ? Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(0)) : horizontal;
                                    if ((i2 & 128) == 0) {
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i3 &= -29360129;
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                    }
                                    z4 = i8 == 0 ? true : z2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    companion = modifier;
                                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                                    m561spacedBy0680j_4 = horizontal;
                                    flingBehavior2 = flingBehavior;
                                    z4 = z2;
                                    m674PaddingValues0680j_4 = paddingValues2;
                                    m6299constructorimpl = f2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:72)");
                                }
                                int i12 = i3 >> 3;
                                int i13 = i3 << 3;
                                LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i12 & 896) | (i3 & 14) | ((i3 >> 15) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, ((i3 << 6) & 7168) | ((i3 >> 6) & 14) | 48 | (i13 & 57344) | (i13 & 458752) | (3670016 & i12) | (29360128 & i12) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                                z5 = z3;
                                z6 = z4;
                                float f4 = m6299constructorimpl;
                                horizontal2 = m561spacedBy0680j_4;
                                f3 = f4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier;
                                lazyStaggeredGridState3 = lazyStaggeredGridState;
                                flingBehavior2 = flingBehavior;
                                m674PaddingValues0680j_4 = paddingValues2;
                                z5 = z3;
                                f3 = f2;
                                horizontal2 = horizontal;
                                z6 = z2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier2 = companion;
                                final PaddingValues paddingValues3 = m674PaddingValues0680j_4;
                                final Arrangement.Horizontal horizontal3 = horizontal2;
                                final FlingBehavior flingBehavior3 = flingBehavior2;
                                final boolean z7 = z6;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i14) {
                                        LazyStaggeredGridDslKt.m877LazyVerticalStaggeredGridzadm560(StaggeredGridCells.this, modifier2, lazyStaggeredGridState3, paddingValues3, z5, f3, horizontal3, flingBehavior3, z7, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i2 & 4) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i122 = i3 >> 3;
                        int i132 = i3 << 3;
                        LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i122 & 896) | (i3 & 14) | ((i3 >> 15) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, ((i3 << 6) & 7168) | ((i3 >> 6) & 14) | 48 | (i132 & 57344) | (i132 & 458752) | (3670016 & i122) | (29360128 & i122) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        z5 = z3;
                        z6 = z4;
                        float f42 = m6299constructorimpl;
                        horizontal2 = m561spacedBy0680j_4;
                        f3 = f42;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1222 = i3 >> 3;
                    int i1322 = i3 << 3;
                    LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i1222 & 896) | (i3 & 14) | ((i3 >> 15) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, ((i3 << 6) & 7168) | ((i3 >> 6) & 14) | 48 | (i1322 & 57344) | (i1322 & 458752) | (3670016 & i1222) | (29360128 & i1222) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    z5 = z3;
                    z6 = z4;
                    float f422 = m6299constructorimpl;
                    horizontal2 = m561spacedBy0680j_4;
                    f3 = f422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i8 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i12222 = i3 >> 3;
                int i13222 = i3 << 3;
                LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i12222 & 896) | (i3 & 14) | ((i3 >> 15) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, ((i3 << 6) & 7168) | ((i3 >> 6) & 14) | 48 | (i13222 & 57344) | (i13222 & 458752) | (3670016 & i12222) | (29360128 & i12222) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                z5 = z3;
                z6 = z4;
                float f4222 = m6299constructorimpl;
                horizontal2 = m561spacedBy0680j_4;
                f3 = f4222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if ((i2 & 4) == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i8 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i122222 = i3 >> 3;
            int i132222 = i3 << 3;
            LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i122222 & 896) | (i3 & 14) | ((i3 >> 15) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, ((i3 << 6) & 7168) | ((i3 >> 6) & 14) | 48 | (i132222 & 57344) | (i132222 & 458752) | (3670016 & i122222) | (29360128 & i122222) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            z5 = z3;
            z6 = z4;
            float f42222 = m6299constructorimpl;
            horizontal2 = m561spacedBy0680j_4;
            f3 = f42222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i8 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1222222 = i3 >> 3;
        int i1322222 = i3 << 3;
        LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i1222222 & 896) | (i3 & 14) | ((i3 >> 15) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, ((i3 << 6) & 7168) | ((i3 >> 6) & 14) | 48 | (i1322222 & 57344) | (i1322222 & 458752) | (3670016 & i1222222) | (29360128 & i1222222) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        lazyStaggeredGridState3 = lazyStaggeredGridState2;
        z5 = z3;
        z6 = z4;
        float f422222 = m6299constructorimpl;
        horizontal2 = m561spacedBy0680j_4;
        f3 = f422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1267076841, "C(rememberColumnSlots)P(!1,2)94@4216L1114:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 463564400, "CC(remember):LazyStaggeredGridDsl.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m878invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m878invoke0kLqBqw(Density density, long j) {
                    if (Constraints.m6252getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
                    }
                    int m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j) - density.mo367roundToPx0680j_4(Dp.m6299constructorimpl(PaddingKt.calculateStartPadding(PaddingValues.this, LayoutDirection.Ltr) + PaddingKt.calculateEndPadding(PaddingValues.this, LayoutDirection.Ltr)));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] calculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, m6252getMaxWidthimpl, density.mo367roundToPx0680j_4(horizontal2.getSpacing()));
                    int[] iArr = new int[calculateCrossAxisCellSizes.length];
                    horizontal2.arrange(density, m6252getMaxWidthimpl, calculateCrossAxisCellSizes, LayoutDirection.Ltr, iArr);
                    return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m876LazyHorizontalStaggeredGridcJHQLPU(final StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        int i6;
        Arrangement.Vertical vertical2;
        int i7;
        int i8;
        Modifier.Companion companion;
        LazyStaggeredGridState lazyStaggeredGridState2;
        PaddingValues m674PaddingValues0680j_4;
        Arrangement.HorizontalOrVertical m561spacedBy0680j_4;
        float m6299constructorimpl;
        FlingBehavior flingBehavior2;
        boolean z4;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        float f2;
        final boolean z5;
        final Arrangement.Vertical vertical3;
        boolean z6;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-8666074);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyHorizontalStaggeredGrid)P(6,4,7,1,5,9,3:c#ui.unit.Dp,2,8)154@6993L32,159@7288L15,173@7803L59,163@7399L496:LazyStaggeredGridDsl.kt#fzvcnm");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changedInstance(lazyStaggeredGridState)) {
                    i10 = 256;
                    i3 |= i10;
                }
                i10 = 128;
                i3 |= i10;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        vertical2 = vertical;
                        i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i9 = 8388608;
                                i3 |= i9;
                            }
                            i9 = 4194304;
                            i3 |= i9;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                            if ((i3 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                                    if ((i2 & 4) == 0) {
                                        lazyStaggeredGridState2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                        i3 &= -897;
                                    } else {
                                        lazyStaggeredGridState2 = lazyStaggeredGridState;
                                    }
                                    m674PaddingValues0680j_4 = i4 == 0 ? PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(0)) : paddingValues2;
                                    if (i5 != 0) {
                                        z3 = false;
                                    }
                                    m561spacedBy0680j_4 = i6 == 0 ? Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(0)) : vertical2;
                                    m6299constructorimpl = i7 == 0 ? Dp.m6299constructorimpl(0) : f;
                                    if ((i2 & 128) == 0) {
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i3 &= -29360129;
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                    }
                                    z4 = i8 == 0 ? true : z2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    companion = modifier;
                                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                                    m6299constructorimpl = f;
                                    flingBehavior2 = flingBehavior;
                                    z4 = z2;
                                    m674PaddingValues0680j_4 = paddingValues2;
                                    m561spacedBy0680j_4 = vertical2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:162)");
                                }
                                int i12 = i3 >> 3;
                                int i13 = i3 << 6;
                                Arrangement.Vertical vertical4 = m561spacedBy0680j_4;
                                int i14 = i3 << 3;
                                LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i12 & 896) | (i3 & 14) | ((i3 >> 12) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, (i13 & 7168) | ((i3 >> 6) & 14) | 48 | (i14 & 57344) | (i14 & 458752) | (3670016 & i12) | (29360128 & i12) | (i13 & 234881024), (i3 >> 27) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                                f2 = m6299constructorimpl;
                                z5 = z3;
                                vertical3 = vertical4;
                                z6 = z4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier;
                                lazyStaggeredGridState3 = lazyStaggeredGridState;
                                flingBehavior2 = flingBehavior;
                                m674PaddingValues0680j_4 = paddingValues2;
                                z5 = z3;
                                vertical3 = vertical2;
                                f2 = f;
                                z6 = z2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier2 = companion;
                                final PaddingValues paddingValues3 = m674PaddingValues0680j_4;
                                final float f3 = f2;
                                final FlingBehavior flingBehavior3 = flingBehavior2;
                                final boolean z7 = z6;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i15) {
                                        LazyStaggeredGridDslKt.m876LazyHorizontalStaggeredGridcJHQLPU(StaggeredGridCells.this, modifier2, lazyStaggeredGridState3, paddingValues3, z5, vertical3, f3, flingBehavior3, z7, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i2 & 4) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i122 = i3 >> 3;
                        int i132 = i3 << 6;
                        Arrangement.Vertical vertical42 = m561spacedBy0680j_4;
                        int i142 = i3 << 3;
                        LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i122 & 896) | (i3 & 14) | ((i3 >> 12) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, (i132 & 7168) | ((i3 >> 6) & 14) | 48 | (i142 & 57344) | (i142 & 458752) | (3670016 & i122) | (29360128 & i122) | (i132 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        f2 = m6299constructorimpl;
                        z5 = z3;
                        vertical3 = vertical42;
                        z6 = z4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    vertical2 = vertical;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1222 = i3 >> 3;
                    int i1322 = i3 << 6;
                    Arrangement.Vertical vertical422 = m561spacedBy0680j_4;
                    int i1422 = i3 << 3;
                    LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i1222 & 896) | (i3 & 14) | ((i3 >> 12) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, (i1322 & 7168) | ((i3 >> 6) & 14) | 48 | (i1422 & 57344) | (i1422 & 458752) | (3670016 & i1222) | (29360128 & i1222) | (i1322 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    f2 = m6299constructorimpl;
                    z5 = z3;
                    vertical3 = vertical422;
                    z6 = z4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                vertical2 = vertical;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i8 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i12222 = i3 >> 3;
                int i13222 = i3 << 6;
                Arrangement.Vertical vertical4222 = m561spacedBy0680j_4;
                int i14222 = i3 << 3;
                LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i12222 & 896) | (i3 & 14) | ((i3 >> 12) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, (i13222 & 7168) | ((i3 >> 6) & 14) | 48 | (i14222 & 57344) | (i14222 & 458752) | (3670016 & i12222) | (29360128 & i12222) | (i13222 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                f2 = m6299constructorimpl;
                z5 = z3;
                vertical3 = vertical4222;
                z6 = z4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            vertical2 = vertical;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if ((i2 & 4) == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i8 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i122222 = i3 >> 3;
            int i132222 = i3 << 6;
            Arrangement.Vertical vertical42222 = m561spacedBy0680j_4;
            int i142222 = i3 << 3;
            LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i122222 & 896) | (i3 & 14) | ((i3 >> 12) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, (i132222 & 7168) | ((i3 >> 6) & 14) | 48 | (i142222 & 57344) | (i142222 & 458752) | (3670016 & i122222) | (29360128 & i122222) | (i132222 & 234881024), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            f2 = m6299constructorimpl;
            z5 = z3;
            vertical3 = vertical42222;
            z6 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        vertical2 = vertical;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i8 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1222222 = i3 >> 3;
        int i1322222 = i3 << 6;
        Arrangement.Vertical vertical422222 = m561spacedBy0680j_4;
        int i1422222 = i3 << 3;
        LazyStaggeredGridKt.m882LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m561spacedBy0680j_4, m674PaddingValues0680j_4, startRestartGroup, (i1222222 & 896) | (i3 & 14) | ((i3 >> 12) & 112)), companion, m674PaddingValues0680j_4, z3, flingBehavior2, z4, m6299constructorimpl, m561spacedBy0680j_4.getSpacing(), function1, startRestartGroup, (i1322222 & 7168) | ((i3 >> 6) & 14) | 48 | (i1422222 & 57344) | (i1422222 & 458752) | (3670016 & i1222222) | (29360128 & i1222222) | (i1322222 & 234881024), (i3 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        lazyStaggeredGridState3 = lazyStaggeredGridState2;
        f2 = m6299constructorimpl;
        z5 = z3;
        vertical3 = vertical422222;
        z6 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1532383053, "C(rememberRowSlots)P(1,2)184@8120L940:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1011137904, "CC(remember):LazyStaggeredGridDsl.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m879invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m879invoke0kLqBqw(Density density, long j) {
                    if (Constraints.m6251getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
                    }
                    int m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j) - density.mo367roundToPx0680j_4(Dp.m6299constructorimpl(PaddingValues.this.getTop() + PaddingValues.this.getBottom()));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] calculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, m6251getMaxHeightimpl, density.mo367roundToPx0680j_4(vertical2.getSpacing()));
                    int[] iArr = new int[calculateCrossAxisCellSizes.length];
                    vertical2.arrange(density, m6251getMaxHeightimpl, calculateCrossAxisCellSizes, iArr);
                    return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyGridStaggeredGridSlotsProvider;
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke((LazyStaggeredGridDslKt$items$1) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$1
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(function22, list), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(function22, list), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$6
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke((LazyStaggeredGridDslKt$items$6) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, objArr) : null, new LazyStaggeredGridDslKt$items$8(function12, objArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, objArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(function4, objArr)));
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyStaggeredGridScope.items(tArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, tArr) : null, new LazyStaggeredGridDslKt$items$8(function12, tArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(function4, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$6
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, objArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(function22, objArr), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(function5, objArr)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyStaggeredGridScope.items(tArr.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, tArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(function22, tArr), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(function5, tArr)));
    }
}
