package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
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
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002JU\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0016J\u0098\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J¢\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\nH&J\f\u0010'\u001a\u00020\u000e*\u00020\u000eH\u0007J(\u0010'\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b*\u0010+R\u0018\u0010\u0003\u001a\u00020\u0004X \u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "()V", "anchorType", "Landroidx/compose/material3/MenuAnchorType;", "getAnchorType-Mg6Rgbw$material3_release", "()Ljava/lang/String;", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "matchTextFieldWidth", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "ExposedDropdownMenu-vNxi1II", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "focusable", "ExposedDropdownMenu-kbRbctU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "exposedDropdownSize", "menuAnchor", "type", "enabled", "menuAnchor-fsE2BvY", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/ExposedDropdownMenuBoxScopeImpl;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    public /* synthetic */ ExposedDropdownMenuBoxScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Modifier exposedDropdownSize(Modifier modifier, boolean z);

    /* renamed from: getAnchorType-Mg6Rgbw$material3_release, reason: not valid java name */
    public abstract String mo1762getAnchorTypeMg6Rgbw$material3_release();

    /* renamed from: menuAnchor-fsE2BvY, reason: not valid java name */
    public abstract Modifier mo1763menuAnchorfsE2BvY(Modifier modifier, String str, boolean z);

    private ExposedDropdownMenuBoxScope() {
    }

    /* renamed from: menuAnchor-fsE2BvY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1759menuAnchorfsE2BvY$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-fsE2BvY");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.mo1763menuAnchorfsE2BvY(modifier, str, z);
    }

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030d  */
    /* renamed from: ExposedDropdownMenu-vNxi1II, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1761ExposedDropdownMenuvNxi1II(final boolean z, final Function0<Unit> function0, Modifier modifier, ScrollState scrollState, boolean z2, Shape shape, long j, float f, float f2, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        ScrollState scrollState2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        Modifier.Companion companion;
        ScrollState scrollState3;
        int i11;
        Shape shape2;
        long j2;
        float m1908getTonalElevationD9Ej5fM;
        float m1907getShadowElevationD9Ej5fM;
        BorderStroke borderStroke2;
        int i12;
        long j3;
        Object rememberedValue;
        final MutableState mutableState;
        Density density;
        Object rememberedValue2;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue3;
        float f3;
        boolean changed;
        Object rememberedValue4;
        final BorderStroke borderStroke3;
        final float f4;
        final boolean z4;
        final float f5;
        final ScrollState scrollState4;
        final Modifier modifier3;
        final Shape shape3;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(720925481);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)P(3,6,5,7,4,9,1:c#ui.graphics.Color,10:c#ui.unit.Dp,8:c#ui.unit.Dp)336@15550L21,338@15654L5,339@15706L14,347@16155L53,348@16238L7,349@16281L7,350@16332L10,357@16596L42,361@16795L51,363@16903L486,377@17583L27,378@17626L587,374@17403L810:ExposedDropdownMenu.android.kt#uh7d8r");
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
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i13 = 2048;
                            i4 |= i13;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i13 = 1024;
                    i4 |= i13;
                } else {
                    scrollState2 = scrollState;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z2;
                    i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(f2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke) ? 536870912 : 268435456;
                    }
                    if ((i3 & 1024) == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i10 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i10 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i10 |= startRestartGroup.changed(this) ? 32 : 16;
                    }
                    int i14 = i10;
                    if ((i4 & 306783379) == 306783378 || (i14 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 8) == 0) {
                                scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                i4 &= -7169;
                            } else {
                                scrollState3 = scrollState2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) == 0) {
                                i11 = 6;
                                shape2 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                i4 &= -458753;
                            } else {
                                i11 = 6;
                                shape2 = shape;
                            }
                            if ((i3 & 64) == 0) {
                                j2 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, i11);
                                i4 &= -3670017;
                            } else {
                                j2 = j;
                            }
                            m1908getTonalElevationD9Ej5fM = i7 == 0 ? MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM() : f;
                            m1907getShadowElevationD9Ej5fM = i8 == 0 ? MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM() : f2;
                            if (i9 == 0) {
                                i12 = i4;
                                j3 = j2;
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                                i12 = i4;
                                j3 = j2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            shape2 = shape;
                            m1908getTonalElevationD9Ej5fM = f;
                            m1907getShadowElevationD9Ej5fM = f2;
                            i12 = i4;
                            companion = modifier2;
                            scrollState3 = scrollState2;
                            j3 = j;
                            borderStroke2 = borderStroke;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(720925481, i12, i14, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:344)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321492941, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        mutableState = (MutableState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                        int i15 = i12;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localView);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        View view = (View) consume;
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        final BorderStroke borderStroke4 = borderStroke2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        density = (Density) consume2;
                        int top = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6).getTop(density);
                        startRestartGroup.startReplaceGroup(321499814);
                        ComposerKt.sourceInformation(startRestartGroup, "353@16432L36,353@16396L72");
                        if (z) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321501788, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
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
                                        mutableState.setValue(Unit.INSTANCE);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ExposedDropdownMenu_androidKt.SoftKeyboardListener(view, density, (Function0) rememberedValue5, startRestartGroup, 384);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321507042, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new MutableTransitionState(false);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        mutableTransitionState = (MutableTransitionState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321513419, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                f3 = m1907getShadowElevationD9Ej5fM;
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4218boximpl(TransformOrigin.INSTANCE.m4231getCenterSzJe1aQ()), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                f3 = m1907getShadowElevationD9Ej5fM;
                            }
                            final MutableState mutableState2 = (MutableState) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321517310, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                            changed = startRestartGroup.changed(density) | startRestartGroup.changed(top);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new ExposedDropdownMenuPositionProvider(density, top, mutableState, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
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
                                }, 8, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Modifier modifier4 = companion;
                            final boolean z5 = z3;
                            final ScrollState scrollState5 = scrollState3;
                            final Shape shape4 = shape2;
                            final long j5 = j3;
                            final float f6 = m1908getTonalElevationD9Ej5fM;
                            final float f7 = f3;
                            AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) rememberedValue4, function0, ExposedDropdownMenuDefaults.INSTANCE.m1767popupPropertiespR6Bxps$material3_release(mo1762getAnchorTypeMg6Rgbw$material3_release(), startRestartGroup, 48), ComposableLambdaKt.rememberComposableLambda(-1082380263, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
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

                                public final void invoke(Composer composer2, int i16) {
                                    ComposerKt.sourceInformation(composer2, "C379@17644L555:ExposedDropdownMenu.android.kt#uh7d8r");
                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1082380263, i16, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:379)");
                                        }
                                        MenuKt.m1921DropdownMenuContentQj0Zi0g(ExposedDropdownMenuBoxScope.this.exposedDropdownSize(modifier4, z5), mutableTransitionState, mutableState2, scrollState5, shape4, j5, f6, f7, borderStroke4, function3, composer2, (MutableTransitionState.$stable << 3) | 384);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i15 & 112) | 3072, 0);
                        } else {
                            f3 = m1907getShadowElevationD9Ej5fM;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        borderStroke3 = borderStroke4;
                        f4 = f3;
                        z4 = z3;
                        ScrollState scrollState6 = scrollState3;
                        f5 = m1908getTonalElevationD9Ej5fM;
                        scrollState4 = scrollState6;
                        modifier3 = companion;
                        shape3 = shape2;
                        j4 = j3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        shape3 = shape;
                        j4 = j;
                        borderStroke3 = borderStroke;
                        modifier3 = modifier2;
                        scrollState4 = scrollState2;
                        z4 = z3;
                        f5 = f;
                        f4 = f2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
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

                            public final void invoke(Composer composer2, int i16) {
                                ExposedDropdownMenuBoxScope.this.m1761ExposedDropdownMenuvNxi1II(z, function0, modifier3, scrollState4, z4, shape3, j4, f5, f4, borderStroke3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                z3 = z2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i142 = i10;
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321492941, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                int i152 = i12;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localView2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                View view2 = (View) consume3;
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                final BorderStroke borderStroke42 = borderStroke2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                density = (Density) consume22;
                int top2 = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6).getTop(density);
                startRestartGroup.startReplaceGroup(321499814);
                ComposerKt.sourceInformation(startRestartGroup, "353@16432L36,353@16396L72");
                if (z) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321507042, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                mutableTransitionState = (MutableTransitionState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321513419, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                }
                final MutableState<TransformOrigin> mutableState22 = (MutableState) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321517310, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                changed = startRestartGroup.changed(density) | startRestartGroup.changed(top2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue4 = new ExposedDropdownMenuPositionProvider(density, top2, mutableState, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
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
                }, 8, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Modifier modifier42 = companion;
                final boolean z52 = z3;
                final ScrollState scrollState52 = scrollState3;
                final Shape shape42 = shape2;
                final long j52 = j3;
                final float f62 = m1908getTonalElevationD9Ej5fM;
                final float f72 = f3;
                AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) rememberedValue4, function0, ExposedDropdownMenuDefaults.INSTANCE.m1767popupPropertiespR6Bxps$material3_release(mo1762getAnchorTypeMg6Rgbw$material3_release(), startRestartGroup, 48), ComposableLambdaKt.rememberComposableLambda(-1082380263, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
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

                    public final void invoke(Composer composer2, int i16) {
                        ComposerKt.sourceInformation(composer2, "C379@17644L555:ExposedDropdownMenu.android.kt#uh7d8r");
                        if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1082380263, i16, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:379)");
                            }
                            MenuKt.m1921DropdownMenuContentQj0Zi0g(ExposedDropdownMenuBoxScope.this.exposedDropdownSize(modifier42, z52), mutableTransitionState, mutableState22, scrollState52, shape42, j52, f62, f72, borderStroke42, function3, composer2, (MutableTransitionState.$stable << 3) | 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, (i152 & 112) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                borderStroke3 = borderStroke42;
                f4 = f3;
                z4 = z3;
                ScrollState scrollState62 = scrollState3;
                f5 = m1908getTonalElevationD9Ej5fM;
                scrollState4 = scrollState62;
                modifier3 = companion;
                shape3 = shape2;
                j4 = j3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z3 = z2;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i1422 = i10;
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 8) == 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321492941, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
            int i1522 = i12;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(localView22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view22 = (View) consume32;
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            final BorderStroke borderStroke422 = borderStroke2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            density = (Density) consume222;
            int top22 = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6).getTop(density);
            startRestartGroup.startReplaceGroup(321499814);
            ComposerKt.sourceInformation(startRestartGroup, "353@16432L36,353@16396L72");
            if (z) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321507042, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            mutableTransitionState = (MutableTransitionState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321513419, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<TransformOrigin> mutableState222 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321517310, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            changed = startRestartGroup.changed(density) | startRestartGroup.changed(top22);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = new ExposedDropdownMenuPositionProvider(density, top22, mutableState, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
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
                    mutableState222.setValue(TransformOrigin.m4218boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                }
            }, 8, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Modifier modifier422 = companion;
            final boolean z522 = z3;
            final ScrollState scrollState522 = scrollState3;
            final Shape shape422 = shape2;
            final long j522 = j3;
            final float f622 = m1908getTonalElevationD9Ej5fM;
            final float f722 = f3;
            AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) rememberedValue4, function0, ExposedDropdownMenuDefaults.INSTANCE.m1767popupPropertiespR6Bxps$material3_release(mo1762getAnchorTypeMg6Rgbw$material3_release(), startRestartGroup, 48), ComposableLambdaKt.rememberComposableLambda(-1082380263, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
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

                public final void invoke(Composer composer2, int i16) {
                    ComposerKt.sourceInformation(composer2, "C379@17644L555:ExposedDropdownMenu.android.kt#uh7d8r");
                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1082380263, i16, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:379)");
                        }
                        MenuKt.m1921DropdownMenuContentQj0Zi0g(ExposedDropdownMenuBoxScope.this.exposedDropdownSize(modifier422, z522), mutableTransitionState, mutableState222, scrollState522, shape422, j522, f622, f722, borderStroke422, function3, composer2, (MutableTransitionState.$stable << 3) | 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, (i1522 & 112) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            borderStroke3 = borderStroke422;
            f4 = f3;
            z4 = z3;
            ScrollState scrollState622 = scrollState3;
            f5 = m1908getTonalElevationD9Ej5fM;
            scrollState4 = scrollState622;
            modifier3 = companion;
            shape3 = shape2;
            j4 = j3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z3 = z2;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i14222 = i10;
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321492941, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<View> localView222 = AndroidCompositionLocals_androidKt.getLocalView();
        int i15222 = i12;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(localView222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view222 = (View) consume322;
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        final BorderStroke borderStroke4222 = borderStroke2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        density = (Density) consume2222;
        int top222 = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 6).getTop(density);
        startRestartGroup.startReplaceGroup(321499814);
        ComposerKt.sourceInformation(startRestartGroup, "353@16432L36,353@16396L72");
        if (z) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321507042, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableTransitionState = (MutableTransitionState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
        if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321513419, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<TransformOrigin> mutableState2222 = (MutableState) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 321517310, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        changed = startRestartGroup.changed(density) | startRestartGroup.changed(top222);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = new ExposedDropdownMenuPositionProvider(density, top222, mutableState, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
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
                mutableState2222.setValue(TransformOrigin.m4218boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
            }
        }, 8, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Modifier modifier4222 = companion;
        final boolean z5222 = z3;
        final ScrollState scrollState5222 = scrollState3;
        final Shape shape4222 = shape2;
        final long j5222 = j3;
        final float f6222 = m1908getTonalElevationD9Ej5fM;
        final float f7222 = f3;
        AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) rememberedValue4, function0, ExposedDropdownMenuDefaults.INSTANCE.m1767popupPropertiespR6Bxps$material3_release(mo1762getAnchorTypeMg6Rgbw$material3_release(), startRestartGroup, 48), ComposableLambdaKt.rememberComposableLambda(-1082380263, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
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

            public final void invoke(Composer composer2, int i16) {
                ComposerKt.sourceInformation(composer2, "C379@17644L555:ExposedDropdownMenu.android.kt#uh7d8r");
                if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1082380263, i16, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:379)");
                    }
                    MenuKt.m1921DropdownMenuContentQj0Zi0g(ExposedDropdownMenuBoxScope.this.exposedDropdownSize(modifier4222, z5222), mutableTransitionState, mutableState2222, scrollState5222, shape4222, j5222, f6222, f7222, borderStroke4222, function3, composer2, (MutableTransitionState.$stable << 3) | 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, (i15222 & 112) | 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        borderStroke3 = borderStroke4222;
        f4 = f3;
        z4 = z3;
        ScrollState scrollState6222 = scrollState3;
        f5 = m1908getTonalElevationD9Ej5fM;
        scrollState4 = scrollState6222;
        modifier3 = companion;
        shape3 = shape2;
        j4 = j3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use overload that takes MenuAnchorType and enabled parameters", replaceWith = @ReplaceWith(expression = "menuAnchor(type, enabled)", imports = {}))
    public final Modifier menuAnchor(Modifier modifier) {
        return m1759menuAnchorfsE2BvY$default(this, modifier, MenuAnchorType.INSTANCE.m1905getPrimaryNotEditableMg6Rgbw(), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "The `focusable` parameter is unused. Pass the proper MenuAnchorType to Modifier.menuAnchor instead, which will handle focusability automatically.")
    /* renamed from: ExposedDropdownMenu-kbRbctU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1760ExposedDropdownMenukbRbctU(final boolean z, final Function0<Unit> function0, Modifier modifier, ScrollState scrollState, boolean z2, boolean z3, Shape shape, long j, float f, float f2, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        Shape shape2;
        long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        final Modifier.Companion companion;
        ScrollState scrollState2;
        boolean z4;
        float m1908getTonalElevationD9Ej5fM;
        float f3;
        int i11;
        boolean z5;
        BorderStroke borderStroke2;
        final BorderStroke borderStroke3;
        final Shape shape3;
        final ScrollState scrollState3;
        final long j3;
        final boolean z6;
        final float f4;
        final float f5;
        final boolean z7;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(366140493);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)P(3,7,6,8,4,5,10,1:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp)414@19050L21,417@19189L5,418@19241L14,424@19482L463:ExposedDropdownMenu.android.kt#uh7d8r");
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
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0 && startRestartGroup.changed(scrollState)) {
                        i12 = 2048;
                        i4 |= i12;
                    }
                    i12 = 1024;
                    i4 |= i12;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    shape2 = shape;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                } else {
                    shape2 = shape;
                }
                if ((i & 12582912) == 0) {
                    j2 = j;
                    i4 |= ((i3 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                } else {
                    j2 = j;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 536870912 : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i10 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i10 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i10 |= 48;
                } else if ((i2 & 48) == 0) {
                    i10 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                }
                int i13 = i10;
                if ((i3 & 4096) != 0) {
                    i13 |= 384;
                } else if ((i2 & 384) == 0) {
                    i13 |= startRestartGroup.changed(this) ? 256 : 128;
                    if ((i4 & 306775187) == 306775186 || (i13 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 8) == 0) {
                                scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                i4 &= -7169;
                            } else {
                                scrollState2 = scrollState;
                            }
                            boolean z8 = (i3 & 16) == 0 ? true : z2;
                            z4 = i6 == 0 ? z3 : true;
                            if ((i3 & 64) != 0) {
                                shape2 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                j2 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i4 &= -29360129;
                            }
                            m1908getTonalElevationD9Ej5fM = i7 == 0 ? MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM() : f;
                            float m1907getShadowElevationD9Ej5fM = i8 == 0 ? MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM() : f2;
                            if (i9 == 0) {
                                i11 = i4;
                                borderStroke2 = null;
                                f3 = m1907getShadowElevationD9Ej5fM;
                                z5 = z8;
                                startRestartGroup.endDefaults();
                                boolean z9 = z5;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(366140493, i11, i13, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:424)");
                                }
                                int i14 = i11 & 8190;
                                int i15 = i11 >> 3;
                                m1761ExposedDropdownMenuvNxi1II(z, function0, companion, scrollState2, z4, shape2, j2, m1908getTonalElevationD9Ej5fM, f3, borderStroke2, function3, startRestartGroup, i14 | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024) | ((i13 << 27) & 1879048192), (i13 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                borderStroke3 = borderStroke2;
                                shape3 = shape2;
                                scrollState3 = scrollState2;
                                j3 = j2;
                                z6 = z4;
                                f4 = f3;
                                f5 = m1908getTonalElevationD9Ej5fM;
                                z7 = z9;
                            } else {
                                f3 = m1907getShadowElevationD9Ej5fM;
                                i11 = i4;
                                z5 = z8;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            scrollState2 = scrollState;
                            z5 = z2;
                            m1908getTonalElevationD9Ej5fM = f;
                            f3 = f2;
                            i11 = i4;
                            companion = modifier2;
                            z4 = z3;
                        }
                        borderStroke2 = borderStroke;
                        startRestartGroup.endDefaults();
                        boolean z92 = z5;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i142 = i11 & 8190;
                        int i152 = i11 >> 3;
                        m1761ExposedDropdownMenuvNxi1II(z, function0, companion, scrollState2, z4, shape2, j2, m1908getTonalElevationD9Ej5fM, f3, borderStroke2, function3, startRestartGroup, i142 | (57344 & i152) | (458752 & i152) | (3670016 & i152) | (29360128 & i152) | (i152 & 234881024) | ((i13 << 27) & 1879048192), (i13 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        borderStroke3 = borderStroke2;
                        shape3 = shape2;
                        scrollState3 = scrollState2;
                        j3 = j2;
                        z6 = z4;
                        f4 = f3;
                        f5 = m1908getTonalElevationD9Ej5fM;
                        z7 = z92;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        scrollState3 = scrollState;
                        z7 = z2;
                        borderStroke3 = borderStroke;
                        shape3 = shape2;
                        j3 = j2;
                        companion = modifier2;
                        z6 = z3;
                        f5 = f;
                        f4 = f2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$4
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

                            public final void invoke(Composer composer2, int i16) {
                                ExposedDropdownMenuBoxScope.this.m1760ExposedDropdownMenukbRbctU(z, function0, companion, scrollState3, z7, z6, shape3, j3, f5, f4, borderStroke3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i4 & 306775187) == 306775186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i132 = i10;
            if ((i3 & 4096) != 0) {
            }
            if ((i4 & 306775187) == 306775186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 8) == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i1322 = i10;
        if ((i3 & 4096) != 0) {
        }
        if ((i4 & 306775187) == 306775186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0051  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with customization options parameters.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void ExposedDropdownMenu(final boolean z, final Function0 function0, Modifier modifier, ScrollState scrollState, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        ScrollState scrollState2;
        Modifier.Companion companion;
        ScrollState rememberScrollState;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1729549851);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)P(1,3,2,4)449@20337L21,458@20677L5,459@20726L14,452@20429L498:ExposedDropdownMenu.android.kt#uh7d8r");
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
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i5 = 2048;
                            i3 |= i5;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    scrollState2 = scrollState;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                            i3 &= -7169;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1729549851, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:452)");
                            }
                            m1761ExposedDropdownMenuvNxi1II(z, function0, companion, rememberScrollState, true, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i3 & 14) | 918577152 | (i3 & 112) | (i3 & 896) | (i3 & 7168), (i3 >> 12) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scrollState2 = rememberScrollState;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        companion = modifier2;
                    }
                    rememberScrollState = scrollState2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m1761ExposedDropdownMenuvNxi1II(z, function0, companion, rememberScrollState, true, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i3 & 14) | 918577152 | (i3 & 112) | (i3 & 896) | (i3 & 7168), (i3 >> 12) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    scrollState2 = rememberScrollState;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    final ScrollState scrollState3 = scrollState2;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$5
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

                        public final void invoke(Composer composer2, int i6) {
                            ExposedDropdownMenuBoxScope.this.ExposedDropdownMenu(z, function0, modifier3, scrollState3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            rememberScrollState = scrollState2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m1761ExposedDropdownMenuvNxi1II(z, function0, companion, rememberScrollState, true, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i3 & 14) | 918577152 | (i3 & 112) | (i3 & 896) | (i3 & 7168), (i3 >> 12) & WebSocketProtocol.PAYLOAD_SHORT, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            scrollState2 = rememberScrollState;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        rememberScrollState = scrollState2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m1761ExposedDropdownMenuvNxi1II(z, function0, companion, rememberScrollState, true, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m1908getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m1907getShadowElevationD9Ej5fM(), null, function3, startRestartGroup, (i3 & 14) | 918577152 | (i3 & 112) | (i3 & 896) | (i3 & 7168), (i3 >> 12) & WebSocketProtocol.PAYLOAD_SHORT, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        scrollState2 = rememberScrollState;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
