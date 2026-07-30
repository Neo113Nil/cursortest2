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

    /* JADX WARN: Removed duplicated region for block: B:101:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025e  */
    /* renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m910HorizontalPageroI3XNZo(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        PageSize pageSize2;
        int i8;
        final int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Vertical vertical2;
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
        PagerState pagerState2;
        int i21;
        int i22;
        NestedScrollConnection nestedScrollConnection2;
        final Function1<? super Integer, ? extends Object> function12;
        NestedScrollConnection nestedScrollConnection3;
        TargetedFlingBehavior targetedFlingBehavior3;
        PageSize pageSize3;
        int i23;
        int i24;
        float f3;
        int i25;
        boolean z3;
        Composer composer2;
        PaddingValues paddingValues2;
        Alignment.Vertical vertical3;
        SnapPosition snapPosition2;
        boolean z4;
        Modifier modifier3;
        Modifier modifier4;
        final PageSize pageSize4;
        final NestedScrollConnection nestedScrollConnection4;
        final boolean z5;
        final boolean z6;
        final float f4;
        final PaddingValues paddingValues3;
        final TargetedFlingBehavior targetedFlingBehavior4;
        final Alignment.Vertical vertical4;
        final SnapPosition snapPosition3;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        int i26;
        int i27;
        Composer startRestartGroup = composer.startRestartGroup(1870896258);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPager)P(11,4,1,7!1,8:c#ui.unit.Dp,13!1,12,9!1,6,10)114@6534L28,118@6750L79,125@6952L661:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i28 = i4 & 2;
        if (i28 != 0) {
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
                    pageSize2 = pageSize;
                    i5 |= startRestartGroup.changed(pageSize2) ? 2048 : 1024;
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
                            vertical2 = vertical;
                        } else {
                            vertical2 = vertical;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(vertical2) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i27 = 8388608;
                                    i5 |= i27;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i27 = 4194304;
                            i5 |= i27;
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
                                i26 = 32;
                                i17 |= i26;
                            }
                            i26 = 16;
                            i17 |= i26;
                        } else {
                            i18 = i16;
                        }
                        int i29 = i17;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                            i20 = i29 | 384;
                        } else {
                            int i30 = i29;
                            if ((i3 & 384) == 0) {
                                i30 |= startRestartGroup.changed(snapPosition) ? 256 : 128;
                            }
                            i20 = i30;
                        }
                        if ((i4 & 8192) != 0) {
                            i20 |= 3072;
                        } else if ((i3 & 3072) == 0) {
                            i20 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
                            if ((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier6 = i28 == 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues m666PaddingValues0680j_4 = i6 == 0 ? PaddingKt.m666PaddingValues0680j_4(Dp.m6265constructorimpl(0.0f)) : paddingValues;
                                    PageSize pageSize5 = i7 == 0 ? PageSize.Fill.INSTANCE : pageSize2;
                                    int i31 = i8 == 0 ? 0 : i9;
                                    float m6265constructorimpl = i10 == 0 ? Dp.m6265constructorimpl(0.0f) : f2;
                                    if (i11 != 0) {
                                        vertical2 = Alignment.INSTANCE.getCenterVertically();
                                    }
                                    if ((i4 & 128) == 0) {
                                        i21 = i19;
                                        i22 = i20;
                                        pagerState2 = pagerState;
                                        TargetedFlingBehavior flingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        i15 &= -29360129;
                                        targetedFlingBehavior2 = flingBehavior;
                                    } else {
                                        pagerState2 = pagerState;
                                        i21 = i19;
                                        i22 = i20;
                                    }
                                    boolean z7 = i12 == 0 ? true : z;
                                    boolean z8 = i14 == 0 ? false : z2;
                                    Function1<? super Integer, ? extends Object> function13 = i18 == 0 ? null : function1;
                                    if ((i4 & 2048) == 0) {
                                        nestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Horizontal, startRestartGroup, (i15 & 14) | 432);
                                        i22 &= -113;
                                    } else {
                                        nestedScrollConnection2 = nestedScrollConnection;
                                    }
                                    if (i21 == 0) {
                                        function12 = function13;
                                        nestedScrollConnection3 = nestedScrollConnection2;
                                        pageSize3 = pageSize5;
                                        i23 = i22;
                                        i24 = i31;
                                        f3 = m6265constructorimpl;
                                        i25 = i15;
                                        z3 = z8;
                                        composer2 = startRestartGroup;
                                        paddingValues2 = m666PaddingValues0680j_4;
                                        vertical3 = vertical2;
                                        z4 = z7;
                                        snapPosition2 = SnapPosition.Start.INSTANCE;
                                        targetedFlingBehavior3 = targetedFlingBehavior2;
                                    } else {
                                        function12 = function13;
                                        nestedScrollConnection3 = nestedScrollConnection2;
                                        targetedFlingBehavior3 = targetedFlingBehavior2;
                                        pageSize3 = pageSize5;
                                        i23 = i22;
                                        i24 = i31;
                                        f3 = m6265constructorimpl;
                                        i25 = i15;
                                        z3 = z8;
                                        composer2 = startRestartGroup;
                                        paddingValues2 = m666PaddingValues0680j_4;
                                        vertical3 = vertical2;
                                        snapPosition2 = snapPosition;
                                        z4 = z7;
                                    }
                                    modifier3 = modifier6;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 128) != 0) {
                                        i15 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i20 &= -113;
                                    }
                                    pagerState2 = pagerState;
                                    paddingValues2 = paddingValues;
                                    function12 = function1;
                                    nestedScrollConnection3 = nestedScrollConnection;
                                    i23 = i20;
                                    pageSize3 = pageSize2;
                                    composer2 = startRestartGroup;
                                    modifier3 = modifier2;
                                    vertical3 = vertical2;
                                    i25 = i15;
                                    z4 = z;
                                    z3 = z2;
                                    snapPosition2 = snapPosition;
                                    f3 = f2;
                                    i24 = i9;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    modifier4 = modifier3;
                                } else {
                                    modifier4 = modifier3;
                                    ComposerKt.traceEventStart(1870896258, i25, i23, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)");
                                }
                                int i32 = i23;
                                int i33 = i25 >> 6;
                                int i34 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i33 & 458752) | (i33 & 3670016);
                                int i35 = i25 << 9;
                                int i36 = i34 | (i35 & 29360128) | (i35 & 234881024) | ((i25 << 18) & 1879048192);
                                int i37 = ((i32 >> 3) & 14) | 384 | ((i32 << 3) & 112) | ((i25 >> 9) & 7168);
                                int i38 = i32 << 6;
                                int i39 = i37 | (i38 & 57344) | (i38 & 458752);
                                Modifier modifier7 = modifier4;
                                LazyLayoutPagerKt.m906PageruYRUAWA(modifier7, pagerState2, paddingValues2, z3, Orientation.Horizontal, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical3, snapPosition2, function4, composer2, i36, i39, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                pageSize4 = pageSize3;
                                nestedScrollConnection4 = nestedScrollConnection3;
                                z5 = z3;
                                z6 = z4;
                                f4 = f3;
                                paddingValues3 = paddingValues2;
                                targetedFlingBehavior4 = targetedFlingBehavior3;
                                i9 = i24;
                                vertical4 = vertical3;
                                snapPosition3 = snapPosition2;
                                modifier5 = modifier7;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z6 = z;
                                z5 = z2;
                                function12 = function1;
                                nestedScrollConnection4 = nestedScrollConnection;
                                snapPosition3 = snapPosition;
                                pageSize4 = pageSize2;
                                composer2 = startRestartGroup;
                                f4 = f2;
                                modifier5 = modifier2;
                                vertical4 = vertical2;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                paddingValues3 = paddingValues;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
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

                                    public final void invoke(Composer composer3, int i40) {
                                        PagerKt.m910HorizontalPageroI3XNZo(PagerState.this, modifier5, paddingValues3, pageSize4, i9, f4, vertical4, targetedFlingBehavior4, z6, z5, function12, nestedScrollConnection4, snapPosition3, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
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
                        if (i28 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((i4 & 128) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if ((i4 & 2048) == 0) {
                        }
                        if (i21 == 0) {
                        }
                        modifier3 = modifier6;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i322 = i23;
                        int i332 = i25 >> 6;
                        int i342 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i332 & 458752) | (i332 & 3670016);
                        int i352 = i25 << 9;
                        int i362 = i342 | (i352 & 29360128) | (i352 & 234881024) | ((i25 << 18) & 1879048192);
                        int i372 = ((i322 >> 3) & 14) | 384 | ((i322 << 3) & 112) | ((i25 >> 9) & 7168);
                        int i382 = i322 << 6;
                        int i392 = i372 | (i382 & 57344) | (i382 & 458752);
                        Modifier modifier72 = modifier4;
                        LazyLayoutPagerKt.m906PageruYRUAWA(modifier72, pagerState2, paddingValues2, z3, Orientation.Horizontal, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical3, snapPosition2, function4, composer2, i362, i392, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        pageSize4 = pageSize3;
                        nestedScrollConnection4 = nestedScrollConnection3;
                        z5 = z3;
                        z6 = z4;
                        f4 = f3;
                        paddingValues3 = paddingValues2;
                        targetedFlingBehavior4 = targetedFlingBehavior3;
                        i9 = i24;
                        vertical4 = vertical3;
                        snapPosition3 = snapPosition2;
                        modifier5 = modifier72;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
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
                    int i292 = i17;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    if ((i4 & 8192) != 0) {
                    }
                    if ((i15 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i28 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i4 & 128) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if ((i4 & 2048) == 0) {
                    }
                    if (i21 == 0) {
                    }
                    modifier3 = modifier6;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i3222 = i23;
                    int i3322 = i25 >> 6;
                    int i3422 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i3322 & 458752) | (i3322 & 3670016);
                    int i3522 = i25 << 9;
                    int i3622 = i3422 | (i3522 & 29360128) | (i3522 & 234881024) | ((i25 << 18) & 1879048192);
                    int i3722 = ((i3222 >> 3) & 14) | 384 | ((i3222 << 3) & 112) | ((i25 >> 9) & 7168);
                    int i3822 = i3222 << 6;
                    int i3922 = i3722 | (i3822 & 57344) | (i3822 & 458752);
                    Modifier modifier722 = modifier4;
                    LazyLayoutPagerKt.m906PageruYRUAWA(modifier722, pagerState2, paddingValues2, z3, Orientation.Horizontal, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical3, snapPosition2, function4, composer2, i3622, i3922, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    pageSize4 = pageSize3;
                    nestedScrollConnection4 = nestedScrollConnection3;
                    z5 = z3;
                    z6 = z4;
                    f4 = f3;
                    paddingValues3 = paddingValues2;
                    targetedFlingBehavior4 = targetedFlingBehavior3;
                    i9 = i24;
                    vertical4 = vertical3;
                    snapPosition3 = snapPosition2;
                    modifier5 = modifier722;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                pageSize2 = pageSize;
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
                int i2922 = i17;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                if ((i4 & 8192) != 0) {
                }
                if ((i15 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i28 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 != 0) {
                }
                if ((i4 & 128) == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i18 == 0) {
                }
                if ((i4 & 2048) == 0) {
                }
                if (i21 == 0) {
                }
                modifier3 = modifier6;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i32222 = i23;
                int i33222 = i25 >> 6;
                int i34222 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i33222 & 458752) | (i33222 & 3670016);
                int i35222 = i25 << 9;
                int i36222 = i34222 | (i35222 & 29360128) | (i35222 & 234881024) | ((i25 << 18) & 1879048192);
                int i37222 = ((i32222 >> 3) & 14) | 384 | ((i32222 << 3) & 112) | ((i25 >> 9) & 7168);
                int i38222 = i32222 << 6;
                int i39222 = i37222 | (i38222 & 57344) | (i38222 & 458752);
                Modifier modifier7222 = modifier4;
                LazyLayoutPagerKt.m906PageruYRUAWA(modifier7222, pagerState2, paddingValues2, z3, Orientation.Horizontal, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical3, snapPosition2, function4, composer2, i36222, i39222, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                pageSize4 = pageSize3;
                nestedScrollConnection4 = nestedScrollConnection3;
                z5 = z3;
                z6 = z4;
                f4 = f3;
                paddingValues3 = paddingValues2;
                targetedFlingBehavior4 = targetedFlingBehavior3;
                i9 = i24;
                vertical4 = vertical3;
                snapPosition3 = snapPosition2;
                modifier5 = modifier7222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            pageSize2 = pageSize;
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
            int i29222 = i17;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            if ((i4 & 8192) != 0) {
            }
            if ((i15 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i28 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 != 0) {
            }
            if ((i4 & 128) == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i18 == 0) {
            }
            if ((i4 & 2048) == 0) {
            }
            if (i21 == 0) {
            }
            modifier3 = modifier6;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i322222 = i23;
            int i332222 = i25 >> 6;
            int i342222 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i332222 & 458752) | (i332222 & 3670016);
            int i352222 = i25 << 9;
            int i362222 = i342222 | (i352222 & 29360128) | (i352222 & 234881024) | ((i25 << 18) & 1879048192);
            int i372222 = ((i322222 >> 3) & 14) | 384 | ((i322222 << 3) & 112) | ((i25 >> 9) & 7168);
            int i382222 = i322222 << 6;
            int i392222 = i372222 | (i382222 & 57344) | (i382222 & 458752);
            Modifier modifier72222 = modifier4;
            LazyLayoutPagerKt.m906PageruYRUAWA(modifier72222, pagerState2, paddingValues2, z3, Orientation.Horizontal, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical3, snapPosition2, function4, composer2, i362222, i392222, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            pageSize4 = pageSize3;
            nestedScrollConnection4 = nestedScrollConnection3;
            z5 = z3;
            z6 = z4;
            f4 = f3;
            paddingValues3 = paddingValues2;
            targetedFlingBehavior4 = targetedFlingBehavior3;
            i9 = i24;
            vertical4 = vertical3;
            snapPosition3 = snapPosition2;
            modifier5 = modifier72222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        pageSize2 = pageSize;
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
        int i292222 = i17;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if ((i15 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i28 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 != 0) {
        }
        if ((i4 & 128) == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i18 == 0) {
        }
        if ((i4 & 2048) == 0) {
        }
        if (i21 == 0) {
        }
        modifier3 = modifier6;
        composer2.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i3222222 = i23;
        int i3322222 = i25 >> 6;
        int i3422222 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i3322222 & 458752) | (i3322222 & 3670016);
        int i3522222 = i25 << 9;
        int i3622222 = i3422222 | (i3522222 & 29360128) | (i3522222 & 234881024) | ((i25 << 18) & 1879048192);
        int i3722222 = ((i3222222 >> 3) & 14) | 384 | ((i3222222 << 3) & 112) | ((i25 >> 9) & 7168);
        int i3822222 = i3222222 << 6;
        int i3922222 = i3722222 | (i3822222 & 57344) | (i3822222 & 458752);
        Modifier modifier722222 = modifier4;
        LazyLayoutPagerKt.m906PageruYRUAWA(modifier722222, pagerState2, paddingValues2, z3, Orientation.Horizontal, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, Alignment.INSTANCE.getCenterHorizontally(), vertical3, snapPosition2, function4, composer2, i3622222, i3922222, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        pageSize4 = pageSize3;
        nestedScrollConnection4 = nestedScrollConnection3;
        z5 = z3;
        z6 = z4;
        f4 = f3;
        paddingValues3 = paddingValues2;
        targetedFlingBehavior4 = targetedFlingBehavior3;
        i9 = i24;
        vertical4 = vertical3;
        snapPosition3 = snapPosition2;
        modifier5 = modifier722222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025e  */
    /* renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m911VerticalPageroI3XNZo(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        PageSize pageSize2;
        int i8;
        final int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Horizontal horizontal2;
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
        PagerState pagerState2;
        int i21;
        int i22;
        NestedScrollConnection nestedScrollConnection2;
        final Function1<? super Integer, ? extends Object> function12;
        NestedScrollConnection nestedScrollConnection3;
        Alignment.Horizontal horizontal3;
        TargetedFlingBehavior targetedFlingBehavior3;
        PageSize pageSize3;
        int i23;
        int i24;
        float f3;
        SnapPosition snapPosition2;
        boolean z3;
        Composer composer2;
        PaddingValues paddingValues2;
        int i25;
        boolean z4;
        Modifier modifier3;
        Modifier modifier4;
        final PageSize pageSize4;
        final SnapPosition snapPosition3;
        final boolean z5;
        final float f4;
        final TargetedFlingBehavior targetedFlingBehavior4;
        final Alignment.Horizontal horizontal4;
        final NestedScrollConnection nestedScrollConnection4;
        final boolean z6;
        final PaddingValues paddingValues3;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        int i26;
        int i27;
        Composer startRestartGroup = composer.startRestartGroup(909160706);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPager)P(12,5,1,8!1,9:c#ui.unit.Dp,3!1,13,10!1,7,11)201@11541L28,205@11757L77,212@11957L659:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i28 = i4 & 2;
        if (i28 != 0) {
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
                    pageSize2 = pageSize;
                    i5 |= startRestartGroup.changed(pageSize2) ? 2048 : 1024;
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
                            horizontal2 = horizontal;
                        } else {
                            horizontal2 = horizontal;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(horizontal2) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i27 = 8388608;
                                    i5 |= i27;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i27 = 4194304;
                            i5 |= i27;
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
                                i26 = 32;
                                i17 |= i26;
                            }
                            i26 = 16;
                            i17 |= i26;
                        } else {
                            i18 = i16;
                        }
                        int i29 = i17;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                            i20 = i29 | 384;
                        } else {
                            int i30 = i29;
                            if ((i3 & 384) == 0) {
                                i30 |= startRestartGroup.changed(snapPosition) ? 256 : 128;
                            }
                            i20 = i30;
                        }
                        if ((i4 & 8192) != 0) {
                            i20 |= 3072;
                        } else if ((i3 & 3072) == 0) {
                            i20 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
                            if ((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier6 = i28 == 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues m666PaddingValues0680j_4 = i6 == 0 ? PaddingKt.m666PaddingValues0680j_4(Dp.m6265constructorimpl(0.0f)) : paddingValues;
                                    PageSize pageSize5 = i7 == 0 ? PageSize.Fill.INSTANCE : pageSize2;
                                    int i31 = i8 == 0 ? 0 : i9;
                                    float m6265constructorimpl = i10 == 0 ? Dp.m6265constructorimpl(0.0f) : f2;
                                    if (i11 != 0) {
                                        horizontal2 = Alignment.INSTANCE.getCenterHorizontally();
                                    }
                                    if ((i4 & 128) == 0) {
                                        i21 = i19;
                                        i22 = i20;
                                        pagerState2 = pagerState;
                                        TargetedFlingBehavior flingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        i15 &= -29360129;
                                        targetedFlingBehavior2 = flingBehavior;
                                    } else {
                                        pagerState2 = pagerState;
                                        i21 = i19;
                                        i22 = i20;
                                    }
                                    boolean z7 = i12 == 0 ? true : z;
                                    boolean z8 = i14 == 0 ? false : z2;
                                    Function1<? super Integer, ? extends Object> function13 = i18 == 0 ? null : function1;
                                    if ((i4 & 2048) == 0) {
                                        nestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Vertical, startRestartGroup, (i15 & 14) | 432);
                                        i22 &= -113;
                                    } else {
                                        nestedScrollConnection2 = nestedScrollConnection;
                                    }
                                    if (i21 == 0) {
                                        function12 = function13;
                                        nestedScrollConnection3 = nestedScrollConnection2;
                                        horizontal3 = horizontal2;
                                        pageSize3 = pageSize5;
                                        i23 = i22;
                                        i24 = i31;
                                        f3 = m6265constructorimpl;
                                        z3 = z8;
                                        snapPosition2 = SnapPosition.Start.INSTANCE;
                                        composer2 = startRestartGroup;
                                        paddingValues2 = m666PaddingValues0680j_4;
                                        targetedFlingBehavior3 = targetedFlingBehavior2;
                                    } else {
                                        function12 = function13;
                                        nestedScrollConnection3 = nestedScrollConnection2;
                                        horizontal3 = horizontal2;
                                        targetedFlingBehavior3 = targetedFlingBehavior2;
                                        pageSize3 = pageSize5;
                                        i23 = i22;
                                        i24 = i31;
                                        f3 = m6265constructorimpl;
                                        snapPosition2 = snapPosition;
                                        z3 = z8;
                                        composer2 = startRestartGroup;
                                        paddingValues2 = m666PaddingValues0680j_4;
                                    }
                                    i25 = i15;
                                    z4 = z7;
                                    modifier3 = modifier6;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 128) != 0) {
                                        i15 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i20 &= -113;
                                    }
                                    pagerState2 = pagerState;
                                    paddingValues2 = paddingValues;
                                    function12 = function1;
                                    nestedScrollConnection3 = nestedScrollConnection;
                                    i23 = i20;
                                    pageSize3 = pageSize2;
                                    composer2 = startRestartGroup;
                                    modifier3 = modifier2;
                                    horizontal3 = horizontal2;
                                    i25 = i15;
                                    z4 = z;
                                    z3 = z2;
                                    snapPosition2 = snapPosition;
                                    f3 = f2;
                                    i24 = i9;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    modifier4 = modifier3;
                                } else {
                                    modifier4 = modifier3;
                                    ComposerKt.traceEventStart(909160706, i25, i23, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:211)");
                                }
                                int i32 = i23;
                                int i33 = i25 >> 6;
                                int i34 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i33 & 458752) | (i33 & 3670016);
                                int i35 = i25 << 9;
                                int i36 = i34 | (i35 & 29360128) | (i35 & 234881024) | ((i25 << 18) & 1879048192);
                                int i37 = ((i32 >> 3) & 14) | 3072 | ((i32 << 3) & 112) | ((i25 >> 12) & 896);
                                int i38 = i32 << 6;
                                int i39 = i37 | (i38 & 57344) | (i38 & 458752);
                                Modifier modifier7 = modifier4;
                                LazyLayoutPagerKt.m906PageruYRUAWA(modifier7, pagerState2, paddingValues2, z3, Orientation.Vertical, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, horizontal3, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i36, i39, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                pageSize4 = pageSize3;
                                snapPosition3 = snapPosition2;
                                z5 = z4;
                                f4 = f3;
                                targetedFlingBehavior4 = targetedFlingBehavior3;
                                i9 = i24;
                                horizontal4 = horizontal3;
                                nestedScrollConnection4 = nestedScrollConnection3;
                                z6 = z3;
                                paddingValues3 = paddingValues2;
                                modifier5 = modifier7;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z5 = z;
                                z6 = z2;
                                function12 = function1;
                                nestedScrollConnection4 = nestedScrollConnection;
                                snapPosition3 = snapPosition;
                                pageSize4 = pageSize2;
                                composer2 = startRestartGroup;
                                f4 = f2;
                                modifier5 = modifier2;
                                horizontal4 = horizontal2;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                paddingValues3 = paddingValues;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
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

                                    public final void invoke(Composer composer3, int i40) {
                                        PagerKt.m911VerticalPageroI3XNZo(PagerState.this, modifier5, paddingValues3, pageSize4, i9, f4, horizontal4, targetedFlingBehavior4, z5, z6, function12, nestedScrollConnection4, snapPosition3, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
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
                        if (i28 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((i4 & 128) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if ((i4 & 2048) == 0) {
                        }
                        if (i21 == 0) {
                        }
                        i25 = i15;
                        z4 = z7;
                        modifier3 = modifier6;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i322 = i23;
                        int i332 = i25 >> 6;
                        int i342 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i332 & 458752) | (i332 & 3670016);
                        int i352 = i25 << 9;
                        int i362 = i342 | (i352 & 29360128) | (i352 & 234881024) | ((i25 << 18) & 1879048192);
                        int i372 = ((i322 >> 3) & 14) | 3072 | ((i322 << 3) & 112) | ((i25 >> 12) & 896);
                        int i382 = i322 << 6;
                        int i392 = i372 | (i382 & 57344) | (i382 & 458752);
                        Modifier modifier72 = modifier4;
                        LazyLayoutPagerKt.m906PageruYRUAWA(modifier72, pagerState2, paddingValues2, z3, Orientation.Vertical, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, horizontal3, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i362, i392, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        pageSize4 = pageSize3;
                        snapPosition3 = snapPosition2;
                        z5 = z4;
                        f4 = f3;
                        targetedFlingBehavior4 = targetedFlingBehavior3;
                        i9 = i24;
                        horizontal4 = horizontal3;
                        nestedScrollConnection4 = nestedScrollConnection3;
                        z6 = z3;
                        paddingValues3 = paddingValues2;
                        modifier5 = modifier72;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
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
                    int i292 = i17;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    if ((i4 & 8192) != 0) {
                    }
                    if ((i15 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i28 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i4 & 128) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if ((i4 & 2048) == 0) {
                    }
                    if (i21 == 0) {
                    }
                    i25 = i15;
                    z4 = z7;
                    modifier3 = modifier6;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i3222 = i23;
                    int i3322 = i25 >> 6;
                    int i3422 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i3322 & 458752) | (i3322 & 3670016);
                    int i3522 = i25 << 9;
                    int i3622 = i3422 | (i3522 & 29360128) | (i3522 & 234881024) | ((i25 << 18) & 1879048192);
                    int i3722 = ((i3222 >> 3) & 14) | 3072 | ((i3222 << 3) & 112) | ((i25 >> 12) & 896);
                    int i3822 = i3222 << 6;
                    int i3922 = i3722 | (i3822 & 57344) | (i3822 & 458752);
                    Modifier modifier722 = modifier4;
                    LazyLayoutPagerKt.m906PageruYRUAWA(modifier722, pagerState2, paddingValues2, z3, Orientation.Vertical, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, horizontal3, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i3622, i3922, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    pageSize4 = pageSize3;
                    snapPosition3 = snapPosition2;
                    z5 = z4;
                    f4 = f3;
                    targetedFlingBehavior4 = targetedFlingBehavior3;
                    i9 = i24;
                    horizontal4 = horizontal3;
                    nestedScrollConnection4 = nestedScrollConnection3;
                    z6 = z3;
                    paddingValues3 = paddingValues2;
                    modifier5 = modifier722;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                pageSize2 = pageSize;
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
                int i2922 = i17;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                if ((i4 & 8192) != 0) {
                }
                if ((i15 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i28 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 != 0) {
                }
                if ((i4 & 128) == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i18 == 0) {
                }
                if ((i4 & 2048) == 0) {
                }
                if (i21 == 0) {
                }
                i25 = i15;
                z4 = z7;
                modifier3 = modifier6;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i32222 = i23;
                int i33222 = i25 >> 6;
                int i34222 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i33222 & 458752) | (i33222 & 3670016);
                int i35222 = i25 << 9;
                int i36222 = i34222 | (i35222 & 29360128) | (i35222 & 234881024) | ((i25 << 18) & 1879048192);
                int i37222 = ((i32222 >> 3) & 14) | 3072 | ((i32222 << 3) & 112) | ((i25 >> 12) & 896);
                int i38222 = i32222 << 6;
                int i39222 = i37222 | (i38222 & 57344) | (i38222 & 458752);
                Modifier modifier7222 = modifier4;
                LazyLayoutPagerKt.m906PageruYRUAWA(modifier7222, pagerState2, paddingValues2, z3, Orientation.Vertical, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, horizontal3, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i36222, i39222, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                pageSize4 = pageSize3;
                snapPosition3 = snapPosition2;
                z5 = z4;
                f4 = f3;
                targetedFlingBehavior4 = targetedFlingBehavior3;
                i9 = i24;
                horizontal4 = horizontal3;
                nestedScrollConnection4 = nestedScrollConnection3;
                z6 = z3;
                paddingValues3 = paddingValues2;
                modifier5 = modifier7222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            pageSize2 = pageSize;
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
            int i29222 = i17;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            if ((i4 & 8192) != 0) {
            }
            if ((i15 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i28 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 != 0) {
            }
            if ((i4 & 128) == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i18 == 0) {
            }
            if ((i4 & 2048) == 0) {
            }
            if (i21 == 0) {
            }
            i25 = i15;
            z4 = z7;
            modifier3 = modifier6;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i322222 = i23;
            int i332222 = i25 >> 6;
            int i342222 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i332222 & 458752) | (i332222 & 3670016);
            int i352222 = i25 << 9;
            int i362222 = i342222 | (i352222 & 29360128) | (i352222 & 234881024) | ((i25 << 18) & 1879048192);
            int i372222 = ((i322222 >> 3) & 14) | 3072 | ((i322222 << 3) & 112) | ((i25 >> 12) & 896);
            int i382222 = i322222 << 6;
            int i392222 = i372222 | (i382222 & 57344) | (i382222 & 458752);
            Modifier modifier72222 = modifier4;
            LazyLayoutPagerKt.m906PageruYRUAWA(modifier72222, pagerState2, paddingValues2, z3, Orientation.Vertical, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, horizontal3, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i362222, i392222, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            pageSize4 = pageSize3;
            snapPosition3 = snapPosition2;
            z5 = z4;
            f4 = f3;
            targetedFlingBehavior4 = targetedFlingBehavior3;
            i9 = i24;
            horizontal4 = horizontal3;
            nestedScrollConnection4 = nestedScrollConnection3;
            z6 = z3;
            paddingValues3 = paddingValues2;
            modifier5 = modifier72222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        pageSize2 = pageSize;
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
        int i292222 = i17;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if ((i15 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i28 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 != 0) {
        }
        if ((i4 & 128) == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i18 == 0) {
        }
        if ((i4 & 2048) == 0) {
        }
        if (i21 == 0) {
        }
        i25 = i15;
        z4 = z7;
        modifier3 = modifier6;
        composer2.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i3222222 = i23;
        int i3322222 = i25 >> 6;
        int i3422222 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & 112) | (i25 & 896) | ((i25 >> 18) & 7168) | (i3322222 & 458752) | (i3322222 & 3670016);
        int i3522222 = i25 << 9;
        int i3622222 = i3422222 | (i3522222 & 29360128) | (i3522222 & 234881024) | ((i25 << 18) & 1879048192);
        int i3722222 = ((i3222222 >> 3) & 14) | 3072 | ((i3222222 << 3) & 112) | ((i25 >> 12) & 896);
        int i3822222 = i3222222 << 6;
        int i3922222 = i3722222 | (i3822222 & 57344) | (i3822222 & 458752);
        Modifier modifier722222 = modifier4;
        LazyLayoutPagerKt.m906PageruYRUAWA(modifier722222, pagerState2, paddingValues2, z3, Orientation.Vertical, targetedFlingBehavior3, z4, i24, f3, pageSize3, nestedScrollConnection3, function12, horizontal3, Alignment.INSTANCE.getCenterVertically(), snapPosition2, function4, composer2, i3622222, i3922222, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        pageSize4 = pageSize3;
        snapPosition3 = snapPosition2;
        z5 = z4;
        f4 = f3;
        targetedFlingBehavior4 = targetedFlingBehavior3;
        i9 = i24;
        horizontal4 = horizontal3;
        nestedScrollConnection4 = nestedScrollConnection3;
        z6 = z3;
        paddingValues3 = paddingValues2;
        modifier5 = modifier722222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
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
