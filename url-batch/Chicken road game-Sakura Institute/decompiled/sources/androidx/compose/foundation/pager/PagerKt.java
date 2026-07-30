package androidx.compose.foundation.pager;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aâ\u0001\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010,\u001a\u00020\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0082\b\u001aL\u00100\u001a\u00020\u000b*\u00020\u001e2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000bH\u0000\u001a,\u00109\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"HorizontalPager", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "", "reverseLayout", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "VerticalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "currentPageOffset", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "currentPageOffsetFraction", "", "pageCount", "pagerSemantics", "isVertical", "scope", "Lkotlinx/coroutines/CoroutineScope;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerKt {
    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
    /* renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m918HorizontalPageroI3XNZo(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        int i22;
        int i23;
        TargetedFlingBehavior targetedFlingBehavior3;
        NestedScrollConnection nestedScrollConnection2;
        int i24;
        SnapPosition snapPosition2;
        TargetedFlingBehavior targetedFlingBehavior4;
        boolean z4;
        NestedScrollConnection nestedScrollConnection3;
        PageSize pageSize2;
        int i25;
        Alignment.Vertical vertical2;
        boolean z5;
        int i26;
        Function1<? super Integer, ? extends Object> function12;
        PaddingValues paddingValues2;
        float f3;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        final PaddingValues paddingValues3;
        final PageSize pageSize3;
        final int i27;
        final float f4;
        final Alignment.Vertical vertical3;
        final TargetedFlingBehavior targetedFlingBehavior5;
        final boolean z6;
        final boolean z7;
        final Function1<? super Integer, ? extends Object> function13;
        final NestedScrollConnection nestedScrollConnection4;
        final SnapPosition snapPosition3;
        ScopeUpdateScope endRestartGroup;
        int i28;
        int i29;
        Composer startRestartGroup = composer.startRestartGroup(1870896258);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPager)P(11,4,1,7!1,8:c#ui.unit.Dp,13!1,12,9!1,6,10)114@6534L28,118@6750L79,125@6952L661:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i30 = i4 & 2;
        if (i30 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(vertical) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i29 = 8388608;
                                    i5 |= i29;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i29 = 4194304;
                            i5 |= i29;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & 2048) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i28 = 32;
                                i17 |= i28;
                            }
                            i28 = 16;
                            i17 |= i28;
                        } else {
                            i18 = i16;
                        }
                        int i31 = i17;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                            i31 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i31 |= startRestartGroup.changed(snapPosition) ? 256 : 128;
                            if ((i4 & 8192) == 0) {
                                i31 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i31 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
                                if ((i15 & 306783379) == 306783378 || (i31 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i30 != 0 ? Modifier.INSTANCE : modifier2;
                                        PaddingValues m674PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(0)) : paddingValues;
                                        PageSize pageSize4 = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                        int i32 = i8 != 0 ? 0 : i9;
                                        float m6299constructorimpl = i10 != 0 ? Dp.m6299constructorimpl(0) : f2;
                                        Alignment.Vertical centerVertically = i11 != 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
                                        if ((i4 & 128) != 0) {
                                            i20 = i31;
                                            i23 = i18;
                                            z3 = false;
                                            i21 = i19;
                                            i22 = i14;
                                            targetedFlingBehavior3 = PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                            i15 &= -29360129;
                                        } else {
                                            i20 = i31;
                                            z3 = false;
                                            i21 = i19;
                                            i22 = i14;
                                            i23 = i18;
                                            targetedFlingBehavior3 = targetedFlingBehavior2;
                                        }
                                        boolean z8 = i12 != 0 ? true : z;
                                        if (i22 == 0) {
                                            z3 = z2;
                                        }
                                        Function1<? super Integer, ? extends Object> function14 = i23 != 0 ? null : function1;
                                        if ((i4 & 2048) != 0) {
                                            nestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, Orientation.Horizontal, startRestartGroup, (i15 & 14) | 432);
                                            i24 = i20 & (-113);
                                        } else {
                                            nestedScrollConnection2 = nestedScrollConnection;
                                            i24 = i20;
                                        }
                                        if (i21 != 0) {
                                            targetedFlingBehavior4 = targetedFlingBehavior3;
                                            z4 = z8;
                                            nestedScrollConnection3 = nestedScrollConnection2;
                                            i31 = i24;
                                            snapPosition2 = SnapPosition.Start.INSTANCE;
                                        } else {
                                            snapPosition2 = snapPosition;
                                            targetedFlingBehavior4 = targetedFlingBehavior3;
                                            z4 = z8;
                                            nestedScrollConnection3 = nestedScrollConnection2;
                                            i31 = i24;
                                        }
                                        pageSize2 = pageSize4;
                                        i25 = i32;
                                        vertical2 = centerVertically;
                                        z5 = z3;
                                        i26 = i15;
                                        function12 = function14;
                                        paddingValues2 = m674PaddingValues0680j_4;
                                        f3 = m6299constructorimpl;
                                        modifier3 = modifier5;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 128) != 0) {
                                            i15 &= -29360129;
                                        }
                                        if ((i4 & 2048) != 0) {
                                            i31 &= -113;
                                        }
                                        paddingValues2 = paddingValues;
                                        pageSize2 = pageSize;
                                        vertical2 = vertical;
                                        z4 = z;
                                        z5 = z2;
                                        nestedScrollConnection3 = nestedScrollConnection;
                                        snapPosition2 = snapPosition;
                                        i25 = i9;
                                        f3 = f2;
                                        modifier3 = modifier2;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        i26 = i15;
                                        function12 = function1;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1870896258, i26, i31, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)");
                                    }
                                    int i33 = i26 >> 6;
                                    int i34 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i33) | (i33 & 3670016);
                                    int i35 = i26 << 9;
                                    int i36 = i34 | (29360128 & i35) | (i35 & 234881024) | ((i26 << 18) & 1879048192);
                                    int i37 = ((i26 >> 9) & 7168) | ((i31 >> 3) & 14) | 384 | ((i31 << 3) & 112);
                                    int i38 = i31 << 6;
                                    composer2 = startRestartGroup;
                                    LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Horizontal, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical2, snapPosition2, function4, composer2, i36, i37 | (57344 & i38) | (i38 & 458752), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    paddingValues3 = paddingValues2;
                                    pageSize3 = pageSize2;
                                    i27 = i25;
                                    f4 = f3;
                                    vertical3 = vertical2;
                                    targetedFlingBehavior5 = targetedFlingBehavior4;
                                    z6 = z4;
                                    z7 = z5;
                                    function13 = function12;
                                    nestedScrollConnection4 = nestedScrollConnection3;
                                    snapPosition3 = snapPosition2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    paddingValues3 = paddingValues;
                                    vertical3 = vertical;
                                    z6 = z;
                                    function13 = function1;
                                    snapPosition3 = snapPosition;
                                    modifier4 = modifier2;
                                    composer2 = startRestartGroup;
                                    targetedFlingBehavior5 = targetedFlingBehavior2;
                                    z7 = z2;
                                    nestedScrollConnection4 = nestedScrollConnection;
                                    f4 = f2;
                                    i27 = i9;
                                    pageSize3 = pageSize;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
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

                                        public final void invoke(Composer composer3, int i39) {
                                            PagerKt.m918HorizontalPageroI3XNZo(PagerState.this, modifier4, paddingValues3, pageSize3, i27, f4, vertical3, targetedFlingBehavior5, z6, z7, function13, nestedScrollConnection4, snapPosition3, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i15 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i30 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if ((i4 & 128) != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 != 0) {
                            }
                            if ((i4 & 2048) != 0) {
                            }
                            if (i21 != 0) {
                            }
                            pageSize2 = pageSize4;
                            i25 = i32;
                            vertical2 = centerVertically;
                            z5 = z3;
                            i26 = i15;
                            function12 = function14;
                            paddingValues2 = m674PaddingValues0680j_4;
                            f3 = m6299constructorimpl;
                            modifier3 = modifier5;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i332 = i26 >> 6;
                            int i342 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i332) | (i332 & 3670016);
                            int i352 = i26 << 9;
                            int i362 = i342 | (29360128 & i352) | (i352 & 234881024) | ((i26 << 18) & 1879048192);
                            int i372 = ((i26 >> 9) & 7168) | ((i31 >> 3) & 14) | 384 | ((i31 << 3) & 112);
                            int i382 = i31 << 6;
                            composer2 = startRestartGroup;
                            LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Horizontal, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical2, snapPosition2, function4, composer2, i362, i372 | (57344 & i382) | (i382 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            paddingValues3 = paddingValues2;
                            pageSize3 = pageSize2;
                            i27 = i25;
                            f4 = f3;
                            vertical3 = vertical2;
                            targetedFlingBehavior5 = targetedFlingBehavior4;
                            z6 = z4;
                            z7 = z5;
                            function13 = function12;
                            nestedScrollConnection4 = nestedScrollConnection3;
                            snapPosition3 = snapPosition2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i4 & 8192) == 0) {
                        }
                        if ((i15 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i30 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((i4 & 128) != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 != 0) {
                        }
                        if ((i4 & 2048) != 0) {
                        }
                        if (i21 != 0) {
                        }
                        pageSize2 = pageSize4;
                        i25 = i32;
                        vertical2 = centerVertically;
                        z5 = z3;
                        i26 = i15;
                        function12 = function14;
                        paddingValues2 = m674PaddingValues0680j_4;
                        f3 = m6299constructorimpl;
                        modifier3 = modifier5;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i3322 = i26 >> 6;
                        int i3422 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i3322) | (i3322 & 3670016);
                        int i3522 = i26 << 9;
                        int i3622 = i3422 | (29360128 & i3522) | (i3522 & 234881024) | ((i26 << 18) & 1879048192);
                        int i3722 = ((i26 >> 9) & 7168) | ((i31 >> 3) & 14) | 384 | ((i31 << 3) & 112);
                        int i3822 = i31 << 6;
                        composer2 = startRestartGroup;
                        LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Horizontal, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical2, snapPosition2, function4, composer2, i3622, i3722 | (57344 & i3822) | (i3822 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        paddingValues3 = paddingValues2;
                        pageSize3 = pageSize2;
                        i27 = i25;
                        f4 = f3;
                        vertical3 = vertical2;
                        targetedFlingBehavior5 = targetedFlingBehavior4;
                        z6 = z4;
                        z7 = z5;
                        function13 = function12;
                        nestedScrollConnection4 = nestedScrollConnection3;
                        snapPosition3 = snapPosition2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i312 = i17;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    if ((i4 & 8192) == 0) {
                    }
                    if ((i15 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 != 0) {
                    }
                    if ((i4 & 2048) != 0) {
                    }
                    if (i21 != 0) {
                    }
                    pageSize2 = pageSize4;
                    i25 = i32;
                    vertical2 = centerVertically;
                    z5 = z3;
                    i26 = i15;
                    function12 = function14;
                    paddingValues2 = m674PaddingValues0680j_4;
                    f3 = m6299constructorimpl;
                    modifier3 = modifier5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i33222 = i26 >> 6;
                    int i34222 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i33222) | (i33222 & 3670016);
                    int i35222 = i26 << 9;
                    int i36222 = i34222 | (29360128 & i35222) | (i35222 & 234881024) | ((i26 << 18) & 1879048192);
                    int i37222 = ((i26 >> 9) & 7168) | ((i312 >> 3) & 14) | 384 | ((i312 << 3) & 112);
                    int i38222 = i312 << 6;
                    composer2 = startRestartGroup;
                    LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Horizontal, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical2, snapPosition2, function4, composer2, i36222, i37222 | (57344 & i38222) | (i38222 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    paddingValues3 = paddingValues2;
                    pageSize3 = pageSize2;
                    i27 = i25;
                    f4 = f3;
                    vertical3 = vertical2;
                    targetedFlingBehavior5 = targetedFlingBehavior4;
                    z6 = z4;
                    z7 = z5;
                    function13 = function12;
                    nestedScrollConnection4 = nestedScrollConnection3;
                    snapPosition3 = snapPosition2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i3122 = i17;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if ((i15 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i30 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (i12 != 0) {
                }
                if (i22 == 0) {
                }
                if (i23 != 0) {
                }
                if ((i4 & 2048) != 0) {
                }
                if (i21 != 0) {
                }
                pageSize2 = pageSize4;
                i25 = i32;
                vertical2 = centerVertically;
                z5 = z3;
                i26 = i15;
                function12 = function14;
                paddingValues2 = m674PaddingValues0680j_4;
                f3 = m6299constructorimpl;
                modifier3 = modifier5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i332222 = i26 >> 6;
                int i342222 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i332222) | (i332222 & 3670016);
                int i352222 = i26 << 9;
                int i362222 = i342222 | (29360128 & i352222) | (i352222 & 234881024) | ((i26 << 18) & 1879048192);
                int i372222 = ((i26 >> 9) & 7168) | ((i3122 >> 3) & 14) | 384 | ((i3122 << 3) & 112);
                int i382222 = i3122 << 6;
                composer2 = startRestartGroup;
                LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Horizontal, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical2, snapPosition2, function4, composer2, i362222, i372222 | (57344 & i382222) | (i382222 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                paddingValues3 = paddingValues2;
                pageSize3 = pageSize2;
                i27 = i25;
                f4 = f3;
                vertical3 = vertical2;
                targetedFlingBehavior5 = targetedFlingBehavior4;
                z6 = z4;
                z7 = z5;
                function13 = function12;
                nestedScrollConnection4 = nestedScrollConnection3;
                snapPosition3 = snapPosition2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i31222 = i17;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if ((i15 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i30 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i12 != 0) {
            }
            if (i22 == 0) {
            }
            if (i23 != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            if (i21 != 0) {
            }
            pageSize2 = pageSize4;
            i25 = i32;
            vertical2 = centerVertically;
            z5 = z3;
            i26 = i15;
            function12 = function14;
            paddingValues2 = m674PaddingValues0680j_4;
            f3 = m6299constructorimpl;
            modifier3 = modifier5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i3322222 = i26 >> 6;
            int i3422222 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i3322222) | (i3322222 & 3670016);
            int i3522222 = i26 << 9;
            int i3622222 = i3422222 | (29360128 & i3522222) | (i3522222 & 234881024) | ((i26 << 18) & 1879048192);
            int i3722222 = ((i26 >> 9) & 7168) | ((i31222 >> 3) & 14) | 384 | ((i31222 << 3) & 112);
            int i3822222 = i31222 << 6;
            composer2 = startRestartGroup;
            LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Horizontal, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical2, snapPosition2, function4, composer2, i3622222, i3722222 | (57344 & i3822222) | (i3822222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            paddingValues3 = paddingValues2;
            pageSize3 = pageSize2;
            i27 = i25;
            f4 = f3;
            vertical3 = vertical2;
            targetedFlingBehavior5 = targetedFlingBehavior4;
            z6 = z4;
            z7 = z5;
            function13 = function12;
            nestedScrollConnection4 = nestedScrollConnection3;
            snapPosition3 = snapPosition2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i312222 = i17;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if ((i15 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i30 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i12 != 0) {
        }
        if (i22 == 0) {
        }
        if (i23 != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        if (i21 != 0) {
        }
        pageSize2 = pageSize4;
        i25 = i32;
        vertical2 = centerVertically;
        z5 = z3;
        i26 = i15;
        function12 = function14;
        paddingValues2 = m674PaddingValues0680j_4;
        f3 = m6299constructorimpl;
        modifier3 = modifier5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i33222222 = i26 >> 6;
        int i34222222 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i33222222) | (i33222222 & 3670016);
        int i35222222 = i26 << 9;
        int i36222222 = i34222222 | (29360128 & i35222222) | (i35222222 & 234881024) | ((i26 << 18) & 1879048192);
        int i37222222 = ((i26 >> 9) & 7168) | ((i312222 >> 3) & 14) | 384 | ((i312222 << 3) & 112);
        int i38222222 = i312222 << 6;
        composer2 = startRestartGroup;
        LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Horizontal, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical2, snapPosition2, function4, composer2, i36222222, i37222222 | (57344 & i38222222) | (i38222222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        paddingValues3 = paddingValues2;
        pageSize3 = pageSize2;
        i27 = i25;
        f4 = f3;
        vertical3 = vertical2;
        targetedFlingBehavior5 = targetedFlingBehavior4;
        z6 = z4;
        z7 = z5;
        function13 = function12;
        nestedScrollConnection4 = nestedScrollConnection3;
        snapPosition3 = snapPosition2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
    /* renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m919VerticalPageroI3XNZo(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        int i22;
        int i23;
        TargetedFlingBehavior targetedFlingBehavior3;
        NestedScrollConnection nestedScrollConnection2;
        int i24;
        SnapPosition snapPosition2;
        TargetedFlingBehavior targetedFlingBehavior4;
        boolean z4;
        NestedScrollConnection nestedScrollConnection3;
        PageSize pageSize2;
        int i25;
        Alignment.Horizontal horizontal2;
        boolean z5;
        int i26;
        Function1<? super Integer, ? extends Object> function12;
        PaddingValues paddingValues2;
        float f3;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        final PaddingValues paddingValues3;
        final PageSize pageSize3;
        final int i27;
        final float f4;
        final Alignment.Horizontal horizontal3;
        final TargetedFlingBehavior targetedFlingBehavior5;
        final boolean z6;
        final boolean z7;
        final Function1<? super Integer, ? extends Object> function13;
        final NestedScrollConnection nestedScrollConnection4;
        final SnapPosition snapPosition3;
        ScopeUpdateScope endRestartGroup;
        int i28;
        int i29;
        Composer startRestartGroup = composer.startRestartGroup(909160706);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPager)P(12,5,1,8!1,9:c#ui.unit.Dp,3!1,13,10!1,7,11)201@11541L28,205@11757L77,212@11957L659:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i30 = i4 & 2;
        if (i30 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i29 = 8388608;
                                    i5 |= i29;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i29 = 4194304;
                            i5 |= i29;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & 2048) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i28 = 32;
                                i17 |= i28;
                            }
                            i28 = 16;
                            i17 |= i28;
                        } else {
                            i18 = i16;
                        }
                        int i31 = i17;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                            i31 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i31 |= startRestartGroup.changed(snapPosition) ? 256 : 128;
                            if ((i4 & 8192) == 0) {
                                i31 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i31 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
                                if ((i15 & 306783379) == 306783378 || (i31 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i30 != 0 ? Modifier.INSTANCE : modifier2;
                                        PaddingValues m674PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(0)) : paddingValues;
                                        PageSize pageSize4 = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                        int i32 = i8 != 0 ? 0 : i9;
                                        float m6299constructorimpl = i10 != 0 ? Dp.m6299constructorimpl(0) : f2;
                                        Alignment.Horizontal centerHorizontally = i11 != 0 ? Alignment.INSTANCE.getCenterHorizontally() : horizontal;
                                        if ((i4 & 128) != 0) {
                                            i20 = i31;
                                            i23 = i18;
                                            z3 = false;
                                            i21 = i19;
                                            i22 = i14;
                                            targetedFlingBehavior3 = PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                            i15 &= -29360129;
                                        } else {
                                            i20 = i31;
                                            z3 = false;
                                            i21 = i19;
                                            i22 = i14;
                                            i23 = i18;
                                            targetedFlingBehavior3 = targetedFlingBehavior2;
                                        }
                                        boolean z8 = i12 != 0 ? true : z;
                                        if (i22 == 0) {
                                            z3 = z2;
                                        }
                                        Function1<? super Integer, ? extends Object> function14 = i23 != 0 ? null : function1;
                                        if ((i4 & 2048) != 0) {
                                            nestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, Orientation.Vertical, startRestartGroup, (i15 & 14) | 432);
                                            i24 = i20 & (-113);
                                        } else {
                                            nestedScrollConnection2 = nestedScrollConnection;
                                            i24 = i20;
                                        }
                                        if (i21 != 0) {
                                            targetedFlingBehavior4 = targetedFlingBehavior3;
                                            z4 = z8;
                                            nestedScrollConnection3 = nestedScrollConnection2;
                                            i31 = i24;
                                            snapPosition2 = SnapPosition.Start.INSTANCE;
                                        } else {
                                            snapPosition2 = snapPosition;
                                            targetedFlingBehavior4 = targetedFlingBehavior3;
                                            z4 = z8;
                                            nestedScrollConnection3 = nestedScrollConnection2;
                                            i31 = i24;
                                        }
                                        pageSize2 = pageSize4;
                                        i25 = i32;
                                        horizontal2 = centerHorizontally;
                                        z5 = z3;
                                        i26 = i15;
                                        function12 = function14;
                                        paddingValues2 = m674PaddingValues0680j_4;
                                        f3 = m6299constructorimpl;
                                        modifier3 = modifier5;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 128) != 0) {
                                            i15 &= -29360129;
                                        }
                                        if ((i4 & 2048) != 0) {
                                            i31 &= -113;
                                        }
                                        paddingValues2 = paddingValues;
                                        pageSize2 = pageSize;
                                        horizontal2 = horizontal;
                                        z4 = z;
                                        z5 = z2;
                                        nestedScrollConnection3 = nestedScrollConnection;
                                        snapPosition2 = snapPosition;
                                        i25 = i9;
                                        f3 = f2;
                                        modifier3 = modifier2;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        i26 = i15;
                                        function12 = function1;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(909160706, i26, i31, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:211)");
                                    }
                                    int i33 = i26 >> 6;
                                    int i34 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i33) | (i33 & 3670016);
                                    int i35 = i26 << 9;
                                    int i36 = i34 | (29360128 & i35) | (i35 & 234881024) | ((i26 << 18) & 1879048192);
                                    int i37 = ((i26 >> 12) & 896) | ((i31 >> 3) & 14) | 3072 | ((i31 << 3) & 112);
                                    int i38 = i31 << 6;
                                    composer2 = startRestartGroup;
                                    LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Vertical, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, horizontal2, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i36, i37 | (57344 & i38) | (i38 & 458752), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    paddingValues3 = paddingValues2;
                                    pageSize3 = pageSize2;
                                    i27 = i25;
                                    f4 = f3;
                                    horizontal3 = horizontal2;
                                    targetedFlingBehavior5 = targetedFlingBehavior4;
                                    z6 = z4;
                                    z7 = z5;
                                    function13 = function12;
                                    nestedScrollConnection4 = nestedScrollConnection3;
                                    snapPosition3 = snapPosition2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    paddingValues3 = paddingValues;
                                    horizontal3 = horizontal;
                                    z6 = z;
                                    function13 = function1;
                                    nestedScrollConnection4 = nestedScrollConnection;
                                    modifier4 = modifier2;
                                    composer2 = startRestartGroup;
                                    targetedFlingBehavior5 = targetedFlingBehavior2;
                                    z7 = z2;
                                    snapPosition3 = snapPosition;
                                    f4 = f2;
                                    i27 = i9;
                                    pageSize3 = pageSize;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$VerticalPager$1
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

                                        public final void invoke(Composer composer3, int i39) {
                                            PagerKt.m919VerticalPageroI3XNZo(PagerState.this, modifier4, paddingValues3, pageSize3, i27, f4, horizontal3, targetedFlingBehavior5, z6, z7, function13, nestedScrollConnection4, snapPosition3, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i15 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i30 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if ((i4 & 128) != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 != 0) {
                            }
                            if ((i4 & 2048) != 0) {
                            }
                            if (i21 != 0) {
                            }
                            pageSize2 = pageSize4;
                            i25 = i32;
                            horizontal2 = centerHorizontally;
                            z5 = z3;
                            i26 = i15;
                            function12 = function14;
                            paddingValues2 = m674PaddingValues0680j_4;
                            f3 = m6299constructorimpl;
                            modifier3 = modifier5;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i332 = i26 >> 6;
                            int i342 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i332) | (i332 & 3670016);
                            int i352 = i26 << 9;
                            int i362 = i342 | (29360128 & i352) | (i352 & 234881024) | ((i26 << 18) & 1879048192);
                            int i372 = ((i26 >> 12) & 896) | ((i31 >> 3) & 14) | 3072 | ((i31 << 3) & 112);
                            int i382 = i31 << 6;
                            composer2 = startRestartGroup;
                            LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Vertical, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, horizontal2, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i362, i372 | (57344 & i382) | (i382 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            paddingValues3 = paddingValues2;
                            pageSize3 = pageSize2;
                            i27 = i25;
                            f4 = f3;
                            horizontal3 = horizontal2;
                            targetedFlingBehavior5 = targetedFlingBehavior4;
                            z6 = z4;
                            z7 = z5;
                            function13 = function12;
                            nestedScrollConnection4 = nestedScrollConnection3;
                            snapPosition3 = snapPosition2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i4 & 8192) == 0) {
                        }
                        if ((i15 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i30 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((i4 & 128) != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 != 0) {
                        }
                        if ((i4 & 2048) != 0) {
                        }
                        if (i21 != 0) {
                        }
                        pageSize2 = pageSize4;
                        i25 = i32;
                        horizontal2 = centerHorizontally;
                        z5 = z3;
                        i26 = i15;
                        function12 = function14;
                        paddingValues2 = m674PaddingValues0680j_4;
                        f3 = m6299constructorimpl;
                        modifier3 = modifier5;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i3322 = i26 >> 6;
                        int i3422 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i3322) | (i3322 & 3670016);
                        int i3522 = i26 << 9;
                        int i3622 = i3422 | (29360128 & i3522) | (i3522 & 234881024) | ((i26 << 18) & 1879048192);
                        int i3722 = ((i26 >> 12) & 896) | ((i31 >> 3) & 14) | 3072 | ((i31 << 3) & 112);
                        int i3822 = i31 << 6;
                        composer2 = startRestartGroup;
                        LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Vertical, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, horizontal2, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i3622, i3722 | (57344 & i3822) | (i3822 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        paddingValues3 = paddingValues2;
                        pageSize3 = pageSize2;
                        i27 = i25;
                        f4 = f3;
                        horizontal3 = horizontal2;
                        targetedFlingBehavior5 = targetedFlingBehavior4;
                        z6 = z4;
                        z7 = z5;
                        function13 = function12;
                        nestedScrollConnection4 = nestedScrollConnection3;
                        snapPosition3 = snapPosition2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i312 = i17;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    if ((i4 & 8192) == 0) {
                    }
                    if ((i15 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 != 0) {
                    }
                    if ((i4 & 2048) != 0) {
                    }
                    if (i21 != 0) {
                    }
                    pageSize2 = pageSize4;
                    i25 = i32;
                    horizontal2 = centerHorizontally;
                    z5 = z3;
                    i26 = i15;
                    function12 = function14;
                    paddingValues2 = m674PaddingValues0680j_4;
                    f3 = m6299constructorimpl;
                    modifier3 = modifier5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i33222 = i26 >> 6;
                    int i34222 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i33222) | (i33222 & 3670016);
                    int i35222 = i26 << 9;
                    int i36222 = i34222 | (29360128 & i35222) | (i35222 & 234881024) | ((i26 << 18) & 1879048192);
                    int i37222 = ((i26 >> 12) & 896) | ((i312 >> 3) & 14) | 3072 | ((i312 << 3) & 112);
                    int i38222 = i312 << 6;
                    composer2 = startRestartGroup;
                    LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Vertical, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, horizontal2, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i36222, i37222 | (57344 & i38222) | (i38222 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    paddingValues3 = paddingValues2;
                    pageSize3 = pageSize2;
                    i27 = i25;
                    f4 = f3;
                    horizontal3 = horizontal2;
                    targetedFlingBehavior5 = targetedFlingBehavior4;
                    z6 = z4;
                    z7 = z5;
                    function13 = function12;
                    nestedScrollConnection4 = nestedScrollConnection3;
                    snapPosition3 = snapPosition2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i3122 = i17;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if ((i15 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i30 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (i12 != 0) {
                }
                if (i22 == 0) {
                }
                if (i23 != 0) {
                }
                if ((i4 & 2048) != 0) {
                }
                if (i21 != 0) {
                }
                pageSize2 = pageSize4;
                i25 = i32;
                horizontal2 = centerHorizontally;
                z5 = z3;
                i26 = i15;
                function12 = function14;
                paddingValues2 = m674PaddingValues0680j_4;
                f3 = m6299constructorimpl;
                modifier3 = modifier5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i332222 = i26 >> 6;
                int i342222 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i332222) | (i332222 & 3670016);
                int i352222 = i26 << 9;
                int i362222 = i342222 | (29360128 & i352222) | (i352222 & 234881024) | ((i26 << 18) & 1879048192);
                int i372222 = ((i26 >> 12) & 896) | ((i3122 >> 3) & 14) | 3072 | ((i3122 << 3) & 112);
                int i382222 = i3122 << 6;
                composer2 = startRestartGroup;
                LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Vertical, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, horizontal2, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i362222, i372222 | (57344 & i382222) | (i382222 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                paddingValues3 = paddingValues2;
                pageSize3 = pageSize2;
                i27 = i25;
                f4 = f3;
                horizontal3 = horizontal2;
                targetedFlingBehavior5 = targetedFlingBehavior4;
                z6 = z4;
                z7 = z5;
                function13 = function12;
                nestedScrollConnection4 = nestedScrollConnection3;
                snapPosition3 = snapPosition2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i31222 = i17;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if ((i15 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i30 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i12 != 0) {
            }
            if (i22 == 0) {
            }
            if (i23 != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            if (i21 != 0) {
            }
            pageSize2 = pageSize4;
            i25 = i32;
            horizontal2 = centerHorizontally;
            z5 = z3;
            i26 = i15;
            function12 = function14;
            paddingValues2 = m674PaddingValues0680j_4;
            f3 = m6299constructorimpl;
            modifier3 = modifier5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i3322222 = i26 >> 6;
            int i3422222 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i3322222) | (i3322222 & 3670016);
            int i3522222 = i26 << 9;
            int i3622222 = i3422222 | (29360128 & i3522222) | (i3522222 & 234881024) | ((i26 << 18) & 1879048192);
            int i3722222 = ((i26 >> 12) & 896) | ((i31222 >> 3) & 14) | 3072 | ((i31222 << 3) & 112);
            int i3822222 = i31222 << 6;
            composer2 = startRestartGroup;
            LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Vertical, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, horizontal2, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i3622222, i3722222 | (57344 & i3822222) | (i3822222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            paddingValues3 = paddingValues2;
            pageSize3 = pageSize2;
            i27 = i25;
            f4 = f3;
            horizontal3 = horizontal2;
            targetedFlingBehavior5 = targetedFlingBehavior4;
            z6 = z4;
            z7 = z5;
            function13 = function12;
            nestedScrollConnection4 = nestedScrollConnection3;
            snapPosition3 = snapPosition2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i312222 = i17;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if ((i15 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i30 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i12 != 0) {
        }
        if (i22 == 0) {
        }
        if (i23 != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        if (i21 != 0) {
        }
        pageSize2 = pageSize4;
        i25 = i32;
        horizontal2 = centerHorizontally;
        z5 = z3;
        i26 = i15;
        function12 = function14;
        paddingValues2 = m674PaddingValues0680j_4;
        f3 = m6299constructorimpl;
        modifier3 = modifier5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i33222222 = i26 >> 6;
        int i34222222 = ((i26 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | (i26 & 896) | ((i26 >> 18) & 7168) | (458752 & i33222222) | (i33222222 & 3670016);
        int i35222222 = i26 << 9;
        int i36222222 = i34222222 | (29360128 & i35222222) | (i35222222 & 234881024) | ((i26 << 18) & 1879048192);
        int i37222222 = ((i26 >> 12) & 896) | ((i312222 >> 3) & 14) | 3072 | ((i312222 << 3) & 112);
        int i38222222 = i312222 << 6;
        composer2 = startRestartGroup;
        LazyLayoutPagerKt.m914PageruYRUAWA(modifier3, pagerState, paddingValues2, z5, Orientation.Vertical, targetedFlingBehavior4, z4, i25, f3, pageSize2, nestedScrollConnection3, function12, horizontal2, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i36222222, i37222222 | (57344 & i38222222) | (i38222222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        paddingValues3 = paddingValues2;
        pageSize3 = pageSize2;
        i27 = i25;
        f4 = f3;
        horizontal3 = horizontal2;
        targetedFlingBehavior5 = targetedFlingBehavior4;
        z6 = z4;
        z7 = z5;
        function13 = function12;
        nestedScrollConnection4 = nestedScrollConnection3;
        snapPosition3 = snapPosition2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final int currentPageOffset(SnapPosition snapPosition, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return MathKt.roundToInt(snapPosition.position(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    public static final Modifier pagerSemantics(Modifier modifier, final PagerState pagerState, final boolean z, final CoroutineScope coroutineScope, boolean z2) {
        if (z2) {
            return modifier.then(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    if (z) {
                        final PagerState pagerState2 = pagerState;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                boolean pagerSemantics$performBackwardPaging;
                                pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(PagerState.this, coroutineScope2);
                                return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                            }
                        }, 1, null);
                        final PagerState pagerState3 = pagerState;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                boolean pagerSemantics$performForwardPaging;
                                pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(PagerState.this, coroutineScope3);
                                return Boolean.valueOf(pagerSemantics$performForwardPaging);
                            }
                        }, 1, null);
                        return;
                    }
                    final PagerState pagerState4 = pagerState;
                    final CoroutineScope coroutineScope4 = coroutineScope;
                    SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            boolean pagerSemantics$performBackwardPaging;
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(PagerState.this, coroutineScope4);
                            return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                        }
                    }, 1, null);
                    final PagerState pagerState5 = pagerState;
                    final CoroutineScope coroutineScope5 = coroutineScope;
                    SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            boolean pagerSemantics$performForwardPaging;
                            pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(PagerState.this, coroutineScope5);
                            return Boolean.valueOf(pagerSemantics$performForwardPaging);
                        }
                    }, 1, null);
                }
            }, 1, null));
        }
        return modifier.then(Modifier.INSTANCE);
    }
}
