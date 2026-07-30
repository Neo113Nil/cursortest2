package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¹\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aJ\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\"\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0000\u001a\u0014\u0010&\u001a\u00020$*\u00020'2\u0006\u0010(\u001a\u00020$H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)²\u0006\u0015\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0012X\u008a\u0084\u0002"}, d2 = {"ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheetDialog", "predictiveBackProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isFlagSecureEnabled", "", "Landroid/view/View;", "shouldApplySecureFlag", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "material3_release", "currentContent"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt {

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ca  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use constructor with contentWindowInsets parameter.", replaceWith = @ReplaceWith(expression = "ModalBottomSheet(onDismissRequest,modifier,sheetState,sheetMaxWidth,shape,containerColor,contentColor,tonalElevation,scrimColor,dragHandle,{ windowInsets },properties,content,)", imports = {}))
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1928ModalBottomSheetdYc4hso(final Function0 function0, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, Function2 function2, WindowInsets windowInsets, ModalBottomSheetProperties modalBottomSheetProperties, final Function3 function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        SheetState sheetState2;
        int i5;
        long j4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        SheetState sheetState3;
        float m1472getSheetMaxWidthD9Ej5fM;
        Shape shape2;
        Modifier modifier3;
        int i11;
        long j5;
        float f3;
        long j6;
        int i12;
        int i13;
        WindowInsets windowInsets2;
        int i14;
        ModalBottomSheetProperties modalBottomSheetProperties2;
        final WindowInsets windowInsets3;
        int i15;
        float f4;
        Function2 function22;
        long j7;
        Composer composer2;
        Function2 function23;
        final float f5;
        final WindowInsets windowInsets4;
        final ModalBottomSheetProperties modalBottomSheetProperties3;
        final Function2 function24;
        final float f6;
        final SheetState sheetState4;
        final long j8;
        final Shape shape3;
        final Modifier modifier4;
        final long j9;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        int i16;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(944867294);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheet)P(5,4,10,9:c#ui.unit.Dp,8,0:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.unit.Dp,7:c#ui.graphics.Color,3,12,6)235@10240L31,237@10371L13,238@10434L14,239@10476L31,241@10584L10,243@10731L12,247@10884L485:ModalBottomSheet.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetState2 = sheetState;
                    if (startRestartGroup.changed(sheetState2)) {
                        i19 = 256;
                        i4 |= i19;
                    }
                } else {
                    sheetState2 = sheetState;
                }
                i19 = 128;
                i4 |= i19;
            } else {
                sheetState2 = sheetState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changed(shape)) {
                        i18 = 16384;
                        i4 |= i18;
                    }
                    i18 = 8192;
                    i4 |= i18;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    j4 = j2;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(j3)) {
                        i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i4 |= i17;
                    }
                    i17 = 33554432;
                    i4 |= i17;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((805306368 & i) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                    if ((i2 & 6) != 0) {
                        if ((i3 & 1024) == 0 && startRestartGroup.changed(windowInsets)) {
                            i16 = 4;
                            i8 = i2 | i16;
                        }
                        i16 = 2;
                        i8 = i2 | i16;
                    } else {
                        i8 = i2;
                    }
                    i9 = i3 & 2048;
                    if (i9 == 0) {
                        i8 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i8 |= startRestartGroup.changed(modalBottomSheetProperties) ? 32 : 16;
                    }
                    i10 = i8;
                    if ((i3 & 4096) == 0) {
                        i10 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i10 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
                    }
                    if ((306783379 & i4) == 306783378 || (i10 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i20 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 4) == 0) {
                                sheetState3 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                i4 &= -897;
                            } else {
                                sheetState3 = sheetState2;
                            }
                            m1472getSheetMaxWidthD9Ej5fM = i5 == 0 ? BottomSheetDefaults.INSTANCE.m1472getSheetMaxWidthD9Ej5fM() : f;
                            if ((i3 & 16) == 0) {
                                shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                i4 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i3 & 32) == 0) {
                                modifier3 = companion;
                                i11 = i4 & (-458753);
                                j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            } else {
                                modifier3 = companion;
                                i11 = i4;
                                j5 = j;
                            }
                            if ((i3 & 64) != 0) {
                                j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j5, startRestartGroup, (i11 >> 15) & 14);
                                i11 &= -3670017;
                            }
                            float m6299constructorimpl = i6 == 0 ? Dp.m6299constructorimpl(0) : f2;
                            if ((i3 & 256) == 0) {
                                f3 = m6299constructorimpl;
                                j6 = BottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                i12 = i11 & (-234881025);
                            } else {
                                f3 = m6299constructorimpl;
                                j6 = j3;
                                i12 = i11;
                            }
                            Function2 m1651getLambda1$material3_release = i7 == 0 ? ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1651getLambda1$material3_release() : function2;
                            if ((i3 & 1024) == 0) {
                                i13 = i12;
                                windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                i10 &= -15;
                            } else {
                                i13 = i12;
                                windowInsets2 = windowInsets;
                            }
                            if (i9 == 0) {
                                i14 = i13;
                                windowInsets3 = windowInsets2;
                                modalBottomSheetProperties2 = ModalBottomSheetDefaults.INSTANCE.getProperties();
                            } else {
                                i14 = i13;
                                modalBottomSheetProperties2 = modalBottomSheetProperties;
                                windowInsets3 = windowInsets2;
                            }
                            i15 = i10;
                            modifier2 = modifier3;
                            f4 = f3;
                            function22 = m1651getLambda1$material3_release;
                            j7 = j6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 1024) != 0) {
                                i10 &= -15;
                            }
                            shape2 = shape;
                            f4 = f2;
                            j7 = j3;
                            windowInsets3 = windowInsets;
                            modalBottomSheetProperties2 = modalBottomSheetProperties;
                            i15 = i10;
                            i14 = i4;
                            sheetState3 = sheetState2;
                            m1472getSheetMaxWidthD9Ej5fM = f;
                            j5 = j;
                            function22 = function2;
                        }
                        startRestartGroup.endDefaults();
                        composer2 = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            function23 = function22;
                        } else {
                            function23 = function22;
                            ComposerKt.traceEventStart(944867294, i14, i15, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:247)");
                        }
                        ModalBottomSheetKt.m1922ModalBottomSheetdYc4hso(function0, modifier2, sheetState3, m1472getSheetMaxWidthD9Ej5fM, shape2, j5, j4, f4, j7, function23, new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                return invoke(composer3, num.intValue());
                            }

                            public final WindowInsets invoke(Composer composer3, int i21) {
                                composer3.startReplaceGroup(-2061903609);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2061903609, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:258)");
                                }
                                WindowInsets windowInsets5 = WindowInsets.this;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer3.endReplaceGroup();
                                return windowInsets5;
                            }
                        }, modalBottomSheetProperties2, function3, composer2, i14 & 2147483646, i15 & PointerIconCompat.TYPE_TEXT, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f5 = m1472getSheetMaxWidthD9Ej5fM;
                        windowInsets4 = windowInsets3;
                        modalBottomSheetProperties3 = modalBottomSheetProperties2;
                        function24 = function23;
                        f6 = f4;
                        long j11 = j7;
                        sheetState4 = sheetState3;
                        j8 = j5;
                        shape3 = shape2;
                        modifier4 = modifier2;
                        j9 = j4;
                        j10 = j11;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        f5 = f;
                        shape3 = shape;
                        j8 = j;
                        function24 = function2;
                        windowInsets4 = windowInsets;
                        modalBottomSheetProperties3 = modalBottomSheetProperties;
                        composer2 = startRestartGroup;
                        modifier4 = modifier2;
                        sheetState4 = sheetState2;
                        j9 = j4;
                        f6 = f2;
                        j10 = j3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2
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

                            public final void invoke(Composer composer3, int i21) {
                                ModalBottomSheet_androidKt.m1928ModalBottomSheetdYc4hso(function0, modifier4, sheetState4, f5, shape3, j8, j9, f6, j10, function24, windowInsets4, modalBottomSheetProperties3, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i2 & 6) != 0) {
                }
                i9 = i3 & 2048;
                if (i9 == 0) {
                }
                i10 = i8;
                if ((i3 & 4096) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i20 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if (i7 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if (i9 == 0) {
                }
                i15 = i10;
                modifier2 = modifier3;
                f4 = f3;
                function22 = m1651getLambda1$material3_release;
                j7 = j6;
                startRestartGroup.endDefaults();
                composer2 = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                ModalBottomSheetKt.m1922ModalBottomSheetdYc4hso(function0, modifier2, sheetState3, m1472getSheetMaxWidthD9Ej5fM, shape2, j5, j4, f4, j7, function23, new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                        return invoke(composer3, num.intValue());
                    }

                    public final WindowInsets invoke(Composer composer3, int i21) {
                        composer3.startReplaceGroup(-2061903609);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2061903609, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:258)");
                        }
                        WindowInsets windowInsets5 = WindowInsets.this;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return windowInsets5;
                    }
                }, modalBottomSheetProperties2, function3, composer2, i14 & 2147483646, i15 & PointerIconCompat.TYPE_TEXT, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f5 = m1472getSheetMaxWidthD9Ej5fM;
                windowInsets4 = windowInsets3;
                modalBottomSheetProperties3 = modalBottomSheetProperties2;
                function24 = function23;
                f6 = f4;
                long j112 = j7;
                sheetState4 = sheetState3;
                j8 = j5;
                shape3 = shape2;
                modifier4 = modifier2;
                j9 = j4;
                j10 = j112;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i9 = i3 & 2048;
            if (i9 == 0) {
            }
            i10 = i8;
            if ((i3 & 4096) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i20 == 0) {
            }
            if ((i3 & 4) == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if (i7 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if (i9 == 0) {
            }
            i15 = i10;
            modifier2 = modifier3;
            f4 = f3;
            function22 = m1651getLambda1$material3_release;
            j7 = j6;
            startRestartGroup.endDefaults();
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            ModalBottomSheetKt.m1922ModalBottomSheetdYc4hso(function0, modifier2, sheetState3, m1472getSheetMaxWidthD9Ej5fM, shape2, j5, j4, f4, j7, function23, new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                    return invoke(composer3, num.intValue());
                }

                public final WindowInsets invoke(Composer composer3, int i21) {
                    composer3.startReplaceGroup(-2061903609);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2061903609, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:258)");
                    }
                    WindowInsets windowInsets5 = WindowInsets.this;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return windowInsets5;
                }
            }, modalBottomSheetProperties2, function3, composer2, i14 & 2147483646, i15 & PointerIconCompat.TYPE_TEXT, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            f5 = m1472getSheetMaxWidthD9Ej5fM;
            windowInsets4 = windowInsets3;
            modalBottomSheetProperties3 = modalBottomSheetProperties2;
            function24 = function23;
            f6 = f4;
            long j1122 = j7;
            sheetState4 = sheetState3;
            j8 = j5;
            shape3 = shape2;
            modifier4 = modifier2;
            j9 = j4;
            j10 = j1122;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i9 = i3 & 2048;
        if (i9 == 0) {
        }
        i10 = i8;
        if ((i3 & 4096) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i20 == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if (i7 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if (i9 == 0) {
        }
        i15 = i10;
        modifier2 = modifier3;
        f4 = f3;
        function22 = m1651getLambda1$material3_release;
        j7 = j6;
        startRestartGroup.endDefaults();
        composer2 = startRestartGroup;
        if (ComposerKt.isTraceInProgress()) {
        }
        ModalBottomSheetKt.m1922ModalBottomSheetdYc4hso(function0, modifier2, sheetState3, m1472getSheetMaxWidthD9Ej5fM, shape2, j5, j4, f4, j7, function23, new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                return invoke(composer3, num.intValue());
            }

            public final WindowInsets invoke(Composer composer3, int i21) {
                composer3.startReplaceGroup(-2061903609);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2061903609, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:258)");
                }
                WindowInsets windowInsets5 = WindowInsets.this;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer3.endReplaceGroup();
                return windowInsets5;
            }
        }, modalBottomSheetProperties2, function3, composer2, i14 & 2147483646, i15 & PointerIconCompat.TYPE_TEXT, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        f5 = m1472getSheetMaxWidthD9Ej5fM;
        windowInsets4 = windowInsets3;
        modalBottomSheetProperties3 = modalBottomSheetProperties2;
        function24 = function23;
        f6 = f4;
        long j11222 = j7;
        sheetState4 = sheetState3;
        j8 = j5;
        shape3 = shape2;
        modifier4 = modifier2;
        j9 = j4;
        j10 = j11222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ModalBottomSheetDialog(final Function0<Unit> function0, final ModalBottomSheetProperties modalBottomSheetProperties, final Animatable<Float, AnimationVector1D> animatable, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        boolean z;
        String str;
        Composer startRestartGroup = composer.startRestartGroup(1254951810);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetDialog)P(1,3,2)273@11822L7,274@11861L7,275@11916L7,276@11946L28,277@12001L29,278@12050L38,279@12105L24,280@12157L21,282@12204L697,305@12932L129,305@12907L154,314@13078L182,314@13067L193:ModalBottomSheet.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modalBottomSheetProperties) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1254951810, i3, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:272)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view = (View) consume;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LayoutDirection layoutDirection = (LayoutDirection) consume3;
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i3 >> 9) & 14);
            UUID uuid = (UUID) RememberSaveableKt.m3426rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialogId$1
                @Override // kotlin.jvm.functions.Function0
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, startRestartGroup, 3072, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean isSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1981517173, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
            boolean changed = startRestartGroup.changed(view) | startRestartGroup.changed(density);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                z = true;
                str = "CC(remember):ModalBottomSheet.android.kt#9igjgp";
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new ModalBottomSheetDialogWrapper(function0, modalBottomSheetProperties, view, layoutDirection, density, uuid, animatable, coroutineScope, isSystemInDarkTheme);
                modalBottomSheetDialogWrapper.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-1560960657, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1
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

                    public final void invoke(Composer composer2, int i4) {
                        Function2 ModalBottomSheetDialog$lambda$0;
                        ComposerKt.sourceInformation(composer2, "C296@12687L164:ModalBottomSheet.android.kt#uh7d8r");
                        if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1560960657, i4, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:296)");
                            }
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
                                }
                            }, 1, null);
                            State<Function2<Composer, Integer, Unit>> state = rememberUpdatedState;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, semantics$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                            Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -490070203, "C299@12809L16:ModalBottomSheet.android.kt#uh7d8r");
                            ModalBottomSheetDialog$lambda$0 = ModalBottomSheet_androidKt.ModalBottomSheetDialog$lambda$0(state);
                            ModalBottomSheetDialog$lambda$0.invoke(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }));
                startRestartGroup.updateRememberedValue(modalBottomSheetDialogWrapper);
                rememberedValue2 = modalBottomSheetDialogWrapper;
            } else {
                z = true;
                str = "CC(remember):ModalBottomSheet.android.kt#9igjgp";
            }
            final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = (ModalBottomSheetDialogWrapper) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String str2 = str;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1981494445, str2);
            boolean changedInstance = startRestartGroup.changedInstance(modalBottomSheetDialogWrapper2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        ModalBottomSheetDialogWrapper.this.show();
                        final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper3 = ModalBottomSheetDialogWrapper.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                ModalBottomSheetDialogWrapper.this.dismiss();
                                ModalBottomSheetDialogWrapper.this.disposeComposition();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(modalBottomSheetDialogWrapper2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1981489720, str2);
            boolean changedInstance2 = startRestartGroup.changedInstance(modalBottomSheetDialogWrapper2) | ((i3 & 14) == 4 ? z : false) | ((i3 & 112) == 32 ? z : false) | startRestartGroup.changed(layoutDirection);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ModalBottomSheetDialogWrapper.this.updateParameters(function0, modalBottomSheetProperties, layoutDirection);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$3
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

                public final void invoke(Composer composer2, int i4) {
                    ModalBottomSheet_androidKt.ModalBottomSheetDialog(function0, modalBottomSheetProperties, animatable, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> ModalBottomSheetDialog$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
