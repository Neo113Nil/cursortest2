package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AndroidMenu.android.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001an\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a¢\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001ad\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0090\u0001\u0010%\u001a\u00020\u00052\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0002\b\u00142\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100H\u0007¢\u0006\u0002\u00101\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"DefaultMenuProperties", "Landroidx/compose/ui/window/PopupProperties;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "DropdownMenu-IlH_yew", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt {
    private static final PopupProperties DefaultMenuProperties = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b2  */
    /* renamed from: DropdownMenu-IlH_yew, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1443DropdownMenuIlH_yew(final boolean z, final Function0<Unit> function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j2, float f, float f2, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        PopupProperties popupProperties2;
        Shape shape2;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier.Companion companion;
        long j3;
        ScrollState scrollState2;
        PopupProperties popupProperties3;
        Shape shape3;
        long j4;
        float m1908getTonalElevationD9Ej5fM;
        float m1907getShadowElevationD9Ej5fM;
        BorderStroke borderStroke2;
        Object rememberedValue;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue2;
        PopupProperties popupProperties4;
        final BorderStroke borderStroke3;
        boolean changed;
        Object rememberedValue3;
        final PopupProperties popupProperties5;
        final Modifier modifier3;
        final Shape shape4;
        final ScrollState scrollState3;
        final BorderStroke borderStroke4;
        final float f3;
        final float f4;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1431928300);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)P(3,6,4,5:c#ui.unit.DpOffset,8,7,10,1:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp)182@6555L21,185@6667L5,187@6715L14,55@2073L42,59@2260L51,60@2347L7,62@2403L251,72@2825L494,68@2664L655:AndroidMenu.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(j) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changed(scrollState)) {
                        i12 = 16384;
                        i4 |= i12;
                    }
                    i12 = 8192;
                    i4 |= i12;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    popupProperties2 = popupProperties;
                } else {
                    popupProperties2 = popupProperties;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(popupProperties2) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    shape2 = shape;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                } else {
                    shape2 = shape;
                }
                if ((i & 12582912) == 0) {
                    i4 |= ((i3 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i11 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) == 0) {
                    i11 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                }
                int i13 = i11;
                if ((i4 & 306783379) == 306783378 || (i13 & 19) != 18 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            float f5 = 0;
                            j3 = DpKt.m6320DpOffsetYgX7TsA(Dp.m6299constructorimpl(f5), Dp.m6299constructorimpl(f5));
                        } else {
                            j3 = j;
                        }
                        if ((i3 & 16) != 0) {
                            scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                            i4 &= -57345;
                        } else {
                            scrollState2 = scrollState;
                        }
                        popupProperties3 = i7 != 0 ? DefaultMenuProperties : popupProperties2;
                        if ((i3 & 64) != 0) {
                            shape3 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i4 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i3 & 128) != 0) {
                            j4 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i4 &= -29360129;
                        } else {
                            j4 = j2;
                        }
                        m1908getTonalElevationD9Ej5fM = i8 != 0 ? MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM() : f;
                        m1907getShadowElevationD9Ej5fM = i9 != 0 ? MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM() : f2;
                        borderStroke2 = i10 != 0 ? null : borderStroke;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        scrollState2 = scrollState;
                        m1908getTonalElevationD9Ej5fM = f;
                        m1907getShadowElevationD9Ej5fM = f2;
                        borderStroke2 = borderStroke;
                        companion = modifier2;
                        shape3 = shape2;
                        popupProperties3 = popupProperties2;
                        j3 = j;
                        j4 = j2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1431928300, i4, i13, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468213501, "CC(remember):AndroidMenu.android.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new MutableTransitionState(false);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    mutableTransitionState = (MutableTransitionState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                    if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468219494, "CC(remember):AndroidMenu.android.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            popupProperties4 = popupProperties3;
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4218boximpl(TransformOrigin.INSTANCE.m4231getCenterSzJe1aQ()), null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            popupProperties4 = popupProperties3;
                        }
                        final MutableState mutableState = (MutableState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        borderStroke3 = borderStroke2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468224270, "CC(remember):AndroidMenu.android.kt#9igjgp");
                        changed = ((i4 & 7168) == 2048) | startRestartGroup.changed(density);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new DropdownMenuPositionProvider(j3, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(IntRect intRect, IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m4218boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }
                            }, 4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Modifier modifier4 = companion;
                        final ScrollState scrollState4 = scrollState2;
                        final Shape shape5 = shape3;
                        final long j7 = j4;
                        final float f6 = m1908getTonalElevationD9Ej5fM;
                        final float f7 = m1907getShadowElevationD9Ej5fM;
                        AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) rememberedValue3, function0, popupProperties4, ComposableLambdaKt.rememberComposableLambda(2126968933, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                ComposerKt.sourceInformation(composer2, "C73@2839L470:AndroidMenu.android.kt#uh7d8r");
                                if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2126968933, i14, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
                                    }
                                    MenuKt.m1921DropdownMenuContentQj0Zi0g(Modifier.this, mutableTransitionState, mutableState, scrollState4, shape5, j7, f6, f7, borderStroke3, function3, composer2, (MutableTransitionState.$stable << 3) | 384);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i4 >> 9) & 896) | (i4 & 112) | 3072, 0);
                    } else {
                        borderStroke3 = borderStroke2;
                        popupProperties4 = popupProperties3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    popupProperties5 = popupProperties4;
                    modifier3 = companion;
                    shape4 = shape3;
                    scrollState3 = scrollState2;
                    long j8 = j4;
                    borderStroke4 = borderStroke3;
                    f3 = m1907getShadowElevationD9Ej5fM;
                    f4 = m1908getTonalElevationD9Ej5fM;
                    j5 = j3;
                    j6 = j8;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j5 = j;
                    scrollState3 = scrollState;
                    f4 = f;
                    modifier3 = modifier2;
                    shape4 = shape2;
                    popupProperties5 = popupProperties2;
                    j6 = j2;
                    f3 = f2;
                    borderStroke4 = borderStroke;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
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
                            AndroidMenu_androidKt.m1443DropdownMenuIlH_yew(z, function0, modifier3, j5, scrollState3, popupProperties5, shape4, j6, f4, f3, borderStroke4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i132 = i11;
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468213501, "CC(remember):AndroidMenu.android.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableTransitionState = (MutableTransitionState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468219494, "CC(remember):AndroidMenu.android.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<TransformOrigin> mutableState2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            borderStroke3 = borderStroke2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468224270, "CC(remember):AndroidMenu.android.kt#9igjgp");
            changed = ((i4 & 7168) == 2048) | startRestartGroup.changed(density2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new DropdownMenuPositionProvider(j3, density2, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                    invoke2(intRect, intRect2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IntRect intRect, IntRect intRect2) {
                    mutableState2.setValue(TransformOrigin.m4218boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                }
            }, 4, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Modifier modifier42 = companion;
            final ScrollState scrollState42 = scrollState2;
            final Shape shape52 = shape3;
            final long j72 = j4;
            final float f62 = m1908getTonalElevationD9Ej5fM;
            final float f72 = m1907getShadowElevationD9Ej5fM;
            AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) rememberedValue3, function0, popupProperties4, ComposableLambdaKt.rememberComposableLambda(2126968933, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                    ComposerKt.sourceInformation(composer2, "C73@2839L470:AndroidMenu.android.kt#uh7d8r");
                    if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2126968933, i14, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
                        }
                        MenuKt.m1921DropdownMenuContentQj0Zi0g(Modifier.this, mutableTransitionState, mutableState2, scrollState42, shape52, j72, f62, f72, borderStroke3, function3, composer2, (MutableTransitionState.$stable << 3) | 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 9) & 896) | (i4 & 112) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            popupProperties5 = popupProperties4;
            modifier3 = companion;
            shape4 = shape3;
            scrollState3 = scrollState2;
            long j82 = j4;
            borderStroke4 = borderStroke3;
            f3 = m1907getShadowElevationD9Ej5fM;
            f4 = m1908getTonalElevationD9Ej5fM;
            j5 = j3;
            j6 = j82;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i1322 = i11;
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468213501, "CC(remember):AndroidMenu.android.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableTransitionState = (MutableTransitionState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
        if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468219494, "CC(remember):AndroidMenu.android.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<TransformOrigin> mutableState22 = (MutableState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        borderStroke3 = borderStroke2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume22;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1468224270, "CC(remember):AndroidMenu.android.kt#9igjgp");
        changed = ((i4 & 7168) == 2048) | startRestartGroup.changed(density22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new DropdownMenuPositionProvider(j3, density22, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IntRect intRect, IntRect intRect2) {
                mutableState22.setValue(TransformOrigin.m4218boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
            }
        }, 4, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Modifier modifier422 = companion;
        final ScrollState scrollState422 = scrollState2;
        final Shape shape522 = shape3;
        final long j722 = j4;
        final float f622 = m1908getTonalElevationD9Ej5fM;
        final float f722 = m1907getShadowElevationD9Ej5fM;
        AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) rememberedValue3, function0, popupProperties4, ComposableLambdaKt.rememberComposableLambda(2126968933, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                ComposerKt.sourceInformation(composer2, "C73@2839L470:AndroidMenu.android.kt#uh7d8r");
                if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2126968933, i14, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
                    }
                    MenuKt.m1921DropdownMenuContentQj0Zi0g(Modifier.this, mutableTransitionState, mutableState22, scrollState422, shape522, j722, f622, f722, borderStroke3, function3, composer2, (MutableTransitionState.$stable << 3) | 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i4 >> 9) & 896) | (i4 & 112) | 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        popupProperties5 = popupProperties4;
        modifier3 = companion;
        shape4 = shape3;
        scrollState3 = scrollState2;
        long j822 = j4;
        borderStroke4 = borderStroke3;
        f3 = m1907getShadowElevationD9Ej5fM;
        f4 = m1908getTonalElevationD9Ej5fM;
        j5 = j3;
        j6 = j822;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0051  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with parameters for shape, color, elevation, and border.", replaceWith = @ReplaceWith(expression = "DropdownMenu(\n    expanded = expanded,\n    onDismissRequest = onDismissRequest,\n    modifier = modifier,\n    offset = offset,\n    scrollState = scrollState,\n    properties = properties,\n    shape = MenuDefaults.shape,\n    containerColor = MenuDefaults.containerColor,\n    tonalElevation = MenuDefaults.TonalElevation,\n    shadowElevation = MenuDefaults.ShadowElevation,\n    border = null,\n    content = content,\n)", imports = {}))
    /* renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1441DropdownMenu4kj_NE(final boolean z, final Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        long j2;
        ScrollState scrollState2;
        int i6;
        PopupProperties popupProperties2;
        int i7;
        PopupProperties popupProperties3;
        ScrollState scrollState3;
        long j3;
        final Modifier modifier3;
        final ScrollState scrollState4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1137929566);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,6,5)119@4573L21,130@4960L5,131@5005L14,123@4721L465:AndroidMenu.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                    j2 = j;
                } else {
                    j2 = j;
                    if ((i & 3072) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                    }
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    scrollState2 = scrollState;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    popupProperties2 = popupProperties;
                    i3 |= startRestartGroup.changed(popupProperties2) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                float f = 0;
                                j2 = DpKt.m6320DpOffsetYgX7TsA(Dp.m6299constructorimpl(f), Dp.m6299constructorimpl(f));
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                            }
                            if (i6 != 0) {
                                i7 = i3;
                                popupProperties3 = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                scrollState3 = scrollState2;
                                j3 = j2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1137929566, i7, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:123)");
                                }
                                m1443DropdownMenuIlH_yew(z, function0, modifier2, j3, scrollState3, popupProperties3, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i7 & 14) | 905969664 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7), ((i7 >> 15) & 112) | 6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                popupProperties2 = popupProperties3;
                                modifier3 = modifier2;
                                scrollState4 = scrollState3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        i7 = i3;
                        scrollState3 = scrollState2;
                        j3 = j2;
                        popupProperties3 = popupProperties2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m1443DropdownMenuIlH_yew(z, function0, modifier2, j3, scrollState3, popupProperties3, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i7 & 14) | 905969664 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7), ((i7 >> 15) & 112) | 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        popupProperties2 = popupProperties3;
                        modifier3 = modifier2;
                        scrollState4 = scrollState3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        scrollState4 = scrollState2;
                        j3 = j2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final long j4 = j3;
                        final PopupProperties popupProperties4 = popupProperties2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                            public final void invoke(Composer composer2, int i9) {
                                AndroidMenu_androidKt.m1441DropdownMenu4kj_NE(z, function0, modifier3, j4, scrollState4, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                popupProperties2 = popupProperties;
                if ((i2 & 64) == 0) {
                }
                if ((599187 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                i7 = i3;
                scrollState3 = scrollState2;
                j3 = j2;
                popupProperties3 = popupProperties2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m1443DropdownMenuIlH_yew(z, function0, modifier2, j3, scrollState3, popupProperties3, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i7 & 14) | 905969664 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7), ((i7 >> 15) & 112) | 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                popupProperties2 = popupProperties3;
                modifier3 = modifier2;
                scrollState4 = scrollState3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i2 & 64) == 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            i7 = i3;
            scrollState3 = scrollState2;
            j3 = j2;
            popupProperties3 = popupProperties2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m1443DropdownMenuIlH_yew(z, function0, modifier2, j3, scrollState3, popupProperties3, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i7 & 14) | 905969664 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7), ((i7 >> 15) & 112) | 6, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            popupProperties2 = popupProperties3;
            modifier3 = modifier2;
            scrollState4 = scrollState3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        i7 = i3;
        scrollState3 = scrollState2;
        j3 = j2;
        popupProperties3 = popupProperties2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m1443DropdownMenuIlH_yew(z, function0, modifier2, j3, scrollState3, popupProperties3, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i7 & 14) | 905969664 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7), ((i7 >> 15) & 112) | 6, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        popupProperties2 = popupProperties3;
        modifier3 = modifier2;
        scrollState4 = scrollState3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0051  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    /* renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1442DropdownMenuILWXrKs(final boolean z, final Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        long j2;
        int i6;
        PopupProperties popupProperties2;
        final Modifier modifier3;
        final PopupProperties popupProperties3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(354826666);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)163@6060L21,158@5896L251:AndroidMenu.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    j2 = j;
                    i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        popupProperties2 = popupProperties;
                        i3 |= startRestartGroup.changed(popupProperties2) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                float f = 0;
                                j2 = DpKt.m6320DpOffsetYgX7TsA(Dp.m6299constructorimpl(f), Dp.m6299constructorimpl(f));
                            }
                            long j3 = j2;
                            PopupProperties popupProperties4 = i6 != 0 ? new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null) : popupProperties2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:158)");
                            }
                            m1443DropdownMenuIlH_yew(z, function0, modifier2, j3, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties4, null, 0L, 0.0f, 0.0f, null, function3, startRestartGroup, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            popupProperties3 = popupProperties4;
                            j2 = j3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            popupProperties3 = popupProperties2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final long j4 = j2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$4
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

                                public final void invoke(Composer composer2, int i7) {
                                    AndroidMenu_androidKt.m1442DropdownMenuILWXrKs(z, function0, modifier3, j4, popupProperties3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    popupProperties2 = popupProperties;
                    if ((i2 & 32) != 0) {
                    }
                    if ((74899 & i3) == 74898) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    long j32 = j2;
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m1443DropdownMenuIlH_yew(z, function0, modifier2, j32, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties4, null, 0L, 0.0f, 0.0f, null, function3, startRestartGroup, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    popupProperties3 = popupProperties4;
                    j2 = j32;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                j2 = j;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                popupProperties2 = popupProperties;
                if ((i2 & 32) != 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                long j322 = j2;
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m1443DropdownMenuIlH_yew(z, function0, modifier2, j322, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties4, null, 0L, 0.0f, 0.0f, null, function3, startRestartGroup, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                popupProperties3 = popupProperties4;
                j2 = j322;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            j2 = j;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            popupProperties2 = popupProperties;
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            long j3222 = j2;
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m1443DropdownMenuIlH_yew(z, function0, modifier2, j3222, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties4, null, 0L, 0.0f, 0.0f, null, function3, startRestartGroup, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            popupProperties3 = popupProperties4;
            j2 = j3222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        j2 = j;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        popupProperties2 = popupProperties;
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        long j32222 = j2;
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m1443DropdownMenuIlH_yew(z, function0, modifier2, j32222, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties4, null, 0L, 0.0f, 0.0f, null, function3, startRestartGroup, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        popupProperties3 = popupProperties4;
        j2 = j32222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final Function2<? super Composer, ? super Integer, Unit> function2, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        boolean z2;
        MenuItemColors menuItemColors2;
        int i8;
        int i9;
        Modifier.Companion companion;
        boolean z3;
        MenuItemColors menuItemColors3;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        final Modifier modifier2;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final MenuItemColors menuItemColors4;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1826340448);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)P(7,6,5,4,8,2)194@8925L12,180@6505L319:AndroidMenu.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function25 = function23;
                        i3 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            z2 = z;
                            i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            if ((1572864 & i) != 0) {
                                if ((i2 & 64) == 0) {
                                    menuItemColors2 = menuItemColors;
                                    if (startRestartGroup.changed(menuItemColors2)) {
                                        i10 = 1048576;
                                        i3 |= i10;
                                    }
                                } else {
                                    menuItemColors2 = menuItemColors;
                                }
                                i10 = 524288;
                                i3 |= i10;
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                            }
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i4 == 0 ? Modifier.INSTANCE : modifier;
                                    if (i5 != 0) {
                                        function24 = null;
                                    }
                                    if (i6 != 0) {
                                        function25 = null;
                                    }
                                    z3 = i7 == 0 ? true : z2;
                                    if ((i2 & 64) == 0) {
                                        menuItemColors3 = MenuDefaults.INSTANCE.itemColors(startRestartGroup, 6);
                                        i3 &= -3670017;
                                    } else {
                                        menuItemColors3 = menuItemColors2;
                                    }
                                    PaddingValues dropdownMenuItemContentPadding = i8 == 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues;
                                    mutableInteractionSource2 = i9 == 0 ? mutableInteractionSource : null;
                                    paddingValues2 = dropdownMenuItemContentPadding;
                                    function26 = function25;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    companion = modifier;
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    function26 = function25;
                                    z3 = z2;
                                    menuItemColors3 = menuItemColors2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                }
                                MenuKt.DropdownMenuItemContent(function2, function0, companion, function24, function26, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, i3 & 268435454);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                z4 = z3;
                                function27 = function24;
                                menuItemColors4 = menuItemColors3;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function28 = function26;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function27 = function24;
                                function28 = function25;
                                z4 = z2;
                                menuItemColors4 = menuItemColors2;
                                paddingValues3 = paddingValues;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
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

                                    public final void invoke(Composer composer2, int i11) {
                                        AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function27, function28, z4, menuItemColors4, paddingValues3, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        if ((1572864 & i) != 0) {
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        i9 = i2 & 256;
                        if (i9 == 0) {
                        }
                        if ((i3 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        paddingValues2 = dropdownMenuItemContentPadding;
                        function26 = function25;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function24, function26, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function27 = function24;
                        menuItemColors4 = menuItemColors3;
                        paddingValues3 = paddingValues2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        function28 = function26;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function25 = function23;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    z2 = z;
                    if ((1572864 & i) != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    paddingValues2 = dropdownMenuItemContentPadding;
                    function26 = function25;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function24, function26, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function27 = function24;
                    menuItemColors4 = menuItemColors3;
                    paddingValues3 = paddingValues2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    function28 = function26;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function24 = function22;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function25 = function23;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                z2 = z;
                if ((1572864 & i) != 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                paddingValues2 = dropdownMenuItemContentPadding;
                function26 = function25;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function24, function26, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                z4 = z3;
                function27 = function24;
                menuItemColors4 = menuItemColors3;
                paddingValues3 = paddingValues2;
                mutableInteractionSource3 = mutableInteractionSource2;
                function28 = function26;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function24 = function22;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function25 = function23;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z2 = z;
            if ((1572864 & i) != 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            paddingValues2 = dropdownMenuItemContentPadding;
            function26 = function25;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            MenuKt.DropdownMenuItemContent(function2, function0, companion, function24, function26, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, i3 & 268435454);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            z4 = z3;
            function27 = function24;
            menuItemColors4 = menuItemColors3;
            paddingValues3 = paddingValues2;
            mutableInteractionSource3 = mutableInteractionSource2;
            function28 = function26;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function24 = function22;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function25 = function23;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z2 = z;
        if ((1572864 & i) != 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        paddingValues2 = dropdownMenuItemContentPadding;
        function26 = function25;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        MenuKt.DropdownMenuItemContent(function2, function0, companion, function24, function26, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, i3 & 268435454);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        z4 = z3;
        function27 = function24;
        menuItemColors4 = menuItemColors3;
        paddingValues3 = paddingValues2;
        mutableInteractionSource3 = mutableInteractionSource2;
        function28 = function26;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final PopupProperties getDefaultMenuProperties() {
        return DefaultMenuProperties;
    }
}
