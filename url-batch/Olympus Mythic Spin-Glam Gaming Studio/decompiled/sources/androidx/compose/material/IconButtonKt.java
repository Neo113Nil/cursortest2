package androidx.compose.material;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: IconButton.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aZ\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u0014\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"RippleRadius", "Landroidx/compose/ui/unit/Dp;", "F", "IconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IconButtonKt {
    private static final float RippleRadius = Dp.m2507constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(final Function0 onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        float disabled;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-111063634);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        i3 |= startRestartGroup.changed(content) ? 16384 : 8192;
                    }
                    i6 = i3;
                    if ((i6 & 46811) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 == 0 ? true : z2;
                        if (i5 == 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        composer2 = startRestartGroup;
                        Modifier m170clickableO2vRcR0$default = ClickableKt.m170clickableO2vRcR0$default(TouchTargetKt.minimumTouchTargetSize(modifier4), mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z3, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m170clickableO2vRcR0$default);
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-2146259096);
                        if (z3) {
                            composer2.startReplaceableGroup(753555801);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        } else {
                            composer2.startReplaceableGroup(753555775);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 9) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        modifier3 = modifier4;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z2;
                        composer2 = startRestartGroup;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.IconButtonKt$IconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i8) {
                            IconButtonKt.IconButton(Function0.this, modifier3, z4, mutableInteractionSource4, content, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 16) == 0) {
                }
                i6 = i3;
                if ((i6 & 46811) == 9362) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                composer2 = startRestartGroup;
                Modifier m170clickableO2vRcR0$default2 = ClickableKt.m170clickableO2vRcR0$default(TouchTargetKt.minimumTouchTargetSize(modifier4), mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z3, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 constructor2 = companion2.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(m170clickableO2vRcR0$default2);
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-2146259096);
                if (z3) {
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 9) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                modifier3 = modifier4;
                z4 = z3;
                mutableInteractionSource4 = mutableInteractionSource3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 16) == 0) {
            }
            i6 = i3;
            if ((i6 & 46811) == 9362) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            composer2 = startRestartGroup;
            Modifier m170clickableO2vRcR0$default22 = ClickableKt.m170clickableO2vRcR0$default(TouchTargetKt.minimumTouchTargetSize(modifier4), mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z3, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
            Alignment center22 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            Density density22 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection22 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 constructor22 = companion22.getConstructor();
            Function3 materializerOf22 = LayoutKt.materializerOf(m170clickableO2vRcR0$default22);
            if (composer2.getApplier() == null) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m1149constructorimpl22 = Updater.m1149constructorimpl(composer2);
            Updater.m1153setimpl(m1149constructorimpl22, rememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl22, density22, companion22.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-2146259096);
            if (z3) {
            }
            composer2.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 9) & 112) | 8);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            modifier3 = modifier4;
            z4 = z3;
            mutableInteractionSource4 = mutableInteractionSource3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 16) == 0) {
        }
        i6 = i3;
        if ((i6 & 46811) == 9362) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        composer2 = startRestartGroup;
        Modifier m170clickableO2vRcR0$default222 = ClickableKt.m170clickableO2vRcR0$default(TouchTargetKt.minimumTouchTargetSize(modifier4), mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z3, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
        Alignment center222 = Alignment.INSTANCE.getCenter();
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        Density density222 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection222 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Function0 constructor222 = companion222.getConstructor();
        Function3 materializerOf222 = LayoutKt.materializerOf(m170clickableO2vRcR0$default222);
        if (composer2.getApplier() == null) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m1149constructorimpl222 = Updater.m1149constructorimpl(composer2);
        Updater.m1153setimpl(m1149constructorimpl222, rememberBoxMeasurePolicy222, companion222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl222, density222, companion222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl222, layoutDirection222, companion222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        composer2.startReplaceableGroup(-2146259096);
        if (z3) {
        }
        composer2.endReplaceableGroup();
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 9) & 112) | 8);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        modifier3 = modifier4;
        z4 = z3;
        mutableInteractionSource4 = mutableInteractionSource3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconToggleButton(final boolean z, final Function1 onCheckedChange, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        float disabled;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-54657793);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onCheckedChange) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i2 & 32) != 0) {
                        i7 = (458752 & i) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                        i6 = i3;
                        if ((i6 & 374491) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier modifier3 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            z4 = i4 != 0 ? true : z3;
                            if (i5 != 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            composer2 = startRestartGroup;
                            Modifier m500toggleableO2vRcR0 = ToggleableKt.m500toggleableO2vRcR0(TouchTargetKt.minimumTouchTargetSize(modifier3), z, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z4, Role.m2157boximpl(Role.INSTANCE.m2165getCheckboxo7Vup1c()), onCheckedChange);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m500toggleableO2vRcR0);
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-430124743);
                            if (z4) {
                                composer2.startReplaceableGroup(-1866758102);
                                disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                            } else {
                                composer2.startReplaceableGroup(-1866758076);
                                disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 12) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            modifier2 = modifier3;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.IconButtonKt$IconToggleButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i9) {
                                IconButtonKt.IconToggleButton(z, onCheckedChange, modifier2, z5, mutableInteractionSource4, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    i6 = i3;
                    if ((i6 & 374491) == 74898) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    composer2 = startRestartGroup;
                    Modifier m500toggleableO2vRcR02 = ToggleableKt.m500toggleableO2vRcR0(TouchTargetKt.minimumTouchTargetSize(modifier3), z, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z4, Role.m2157boximpl(Role.INSTANCE.m2165getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 constructor2 = companion2.getConstructor();
                    Function3 materializerOf2 = LayoutKt.materializerOf(m500toggleableO2vRcR02);
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composer2.disableReusing();
                    Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                    Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-430124743);
                    if (z4) {
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    modifier2 = modifier3;
                    z5 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) != 0) {
                }
                i3 |= i7;
                i6 = i3;
                if ((i6 & 374491) == 74898) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                composer2 = startRestartGroup;
                Modifier m500toggleableO2vRcR022 = ToggleableKt.m500toggleableO2vRcR0(TouchTargetKt.minimumTouchTargetSize(modifier3), z, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z4, Role.m2157boximpl(Role.INSTANCE.m2165getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center22 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                Density density22 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection22 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0 constructor22 = companion22.getConstructor();
                Function3 materializerOf22 = LayoutKt.materializerOf(m500toggleableO2vRcR022);
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m1149constructorimpl22 = Updater.m1149constructorimpl(composer2);
                Updater.m1153setimpl(m1149constructorimpl22, rememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl22, density22, companion22.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-430124743);
                if (z4) {
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                modifier2 = modifier3;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) != 0) {
            }
            i3 |= i7;
            i6 = i3;
            if ((i6 & 374491) == 74898) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            composer2 = startRestartGroup;
            Modifier m500toggleableO2vRcR0222 = ToggleableKt.m500toggleableO2vRcR0(TouchTargetKt.minimumTouchTargetSize(modifier3), z, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z4, Role.m2157boximpl(Role.INSTANCE.m2165getCheckboxo7Vup1c()), onCheckedChange);
            Alignment center222 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            Density density222 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection222 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
            Function0 constructor222 = companion222.getConstructor();
            Function3 materializerOf222 = LayoutKt.materializerOf(m500toggleableO2vRcR0222);
            if (composer2.getApplier() == null) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m1149constructorimpl222 = Updater.m1149constructorimpl(composer2);
            Updater.m1153setimpl(m1149constructorimpl222, rememberBoxMeasurePolicy222, companion222.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl222, density222, companion222.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl222, layoutDirection222, companion222.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-430124743);
            if (z4) {
            }
            composer2.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 12) & 112) | 8);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            modifier2 = modifier3;
            z5 = z4;
            mutableInteractionSource4 = mutableInteractionSource3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) != 0) {
        }
        i3 |= i7;
        i6 = i3;
        if ((i6 & 374491) == 74898) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        composer2 = startRestartGroup;
        Modifier m500toggleableO2vRcR02222 = ToggleableKt.m500toggleableO2vRcR0(TouchTargetKt.minimumTouchTargetSize(modifier3), z, mutableInteractionSource3, RippleKt.m1075rememberRipple9IZ8Weo(false, RippleRadius, 0L, startRestartGroup, 54, 4), z4, Role.m2157boximpl(Role.INSTANCE.m2165getCheckboxo7Vup1c()), onCheckedChange);
        Alignment center2222 = Alignment.INSTANCE.getCenter();
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        Density density2222 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2222 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
        Function0 constructor2222 = companion2222.getConstructor();
        Function3 materializerOf2222 = LayoutKt.materializerOf(m500toggleableO2vRcR02222);
        if (composer2.getApplier() == null) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m1149constructorimpl2222 = Updater.m1149constructorimpl(composer2);
        Updater.m1153setimpl(m1149constructorimpl2222, rememberBoxMeasurePolicy2222, companion2222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl2222, density2222, companion2222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl2222, layoutDirection2222, companion2222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl2222, viewConfiguration2222, companion2222.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        composer2.startReplaceableGroup(-430124743);
        if (z4) {
        }
        composer2.endReplaceableGroup();
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i6 >> 12) & 112) | 8);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        modifier2 = modifier3;
        z5 = z4;
        mutableInteractionSource4 = mutableInteractionSource3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
