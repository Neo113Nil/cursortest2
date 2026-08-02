package com.squareup.cash.taptopay.views.components;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.local.views.cart.CreateCartErrorBannerKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.avatar.components.AvatarKt$$ExternalSyntheticLambda5;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.maps.views.MapMarkerPropertiesKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.viewmodels.TapToPayAvatarViewModel;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class TapToPayButtonKt {
    public static final ComposableLambdaImpl lambda$2014269908 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(13), false, 2014269908);

    public static final void DescriptionSuggestions(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        Modifier modifier2;
        list.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1644330424);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | 48 | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.tap_to_pay_payment_description);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            ScrollingCarousel(i2 & 910, gapComposer, null, list, function1);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda5(list, modifier2, function1, i, 7);
        }
    }

    public static final void ScrollingCarousel(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1694041778);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            boolean changedInstance = gapComposer.changedInstance(list) | ((i3 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda6(1, function1, list);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyRow(fillMaxWidth, null, null, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue, gapComposer, 24576, 494);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CreateCartErrorBannerKt$$ExternalSyntheticLambda3(list, modifier2, function1, i, 7);
        }
    }

    public static final void TapToPayButton(Modifier modifier, ButtonProminence buttonProminence, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Function0 function02;
        Modifier modifier2;
        ButtonProminence buttonProminence2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1409979431);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(buttonProminence == null ? -1 : buttonProminence.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i3 |= gapComposer.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier modifier3 = modifier;
            ButtonProminence buttonProminence3 = i5 != 0 ? ButtonProminence.PROMINENT : buttonProminence;
            int i6 = i3 << 3;
            coil3.size.SizeKt.ButtonCta(function02, modifier3, buttonProminence3, false, false, null, lambda$2014269908, gapComposer, ((i3 >> 6) & 14) | 1572864 | (i6 & 112) | (i6 & 896), 56);
            modifier2 = modifier3;
            buttonProminence2 = buttonProminence3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            buttonProminence2 = buttonProminence;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9(modifier2, buttonProminence2, function0, i, i2, 22);
        }
    }

    public static final void TapToPayRecipient(String str, TapToPayAvatarViewModel tapToPayAvatarViewModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(536587385);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(tapToPayAvatarViewModel) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TapToPayRecipientAvatar(tapToPayAvatarViewModel, null, gapComposer, (i2 >> 3) & 14);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, Modifier.Companion.$$INSTANCE, 16.0f, gapComposer);
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.tap_to_pay_recipient_header)).format(new Object[]{str});
            format2.getClass();
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors.surface.keypad.text, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(str, tapToPayAvatarViewModel, modifier, i, 1);
        }
    }

    public static final void TapToPayRecipientAvatar(TapToPayAvatarViewModel tapToPayAvatarViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        String str;
        Color forTheme;
        long j;
        String str2;
        Character ch;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(966218367);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(tapToPayAvatarViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            AvatarSize avatarSize = AvatarSize.Size64;
            if (tapToPayAvatarViewModel == null || (ch = tapToPayAvatarViewModel.monogram) == null || (str = String.valueOf(ch.charValue())) == null) {
                str = "";
            }
            String str3 = str;
            ColorModel.Accented accented = tapToPayAvatarViewModel != null ? tapToPayAvatarViewModel.backgroundColor : null;
            if (accented == null) {
                gapComposer.startReplaceGroup(-259107912);
                gapComposer.end(false);
                forTheme = null;
            } else {
                gapComposer.startReplaceGroup(822925673);
                forTheme = ThemablesKt.forTheme(accented, gapComposer);
                gapComposer.end(false);
            }
            if (forTheme == null) {
                gapComposer.startReplaceGroup(822927365);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(822924792);
                gapComposer.end(false);
                j = forTheme.value;
            }
            AvatarImage.Remote.Image image = (tapToPayAvatarViewModel == null || (str2 = tapToPayAvatarViewModel.photoUrl) == null) ? null : new AvatarImage.Remote.Image(str2, false, null, 0L, new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(14), 62);
            modifier2 = Modifier.Companion.$$INSTANCE;
            TextViewKt.Avatar(avatarSize, new AvatarEntry(str3, j, null, image, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), modifier2, false, gapComposer, ((i3 << 3) & 896) | 6, 24);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(tapToPayAvatarViewModel, modifier2, i, 13);
        }
    }

    /* renamed from: TapToPayTapSurface-3J-VO9M, reason: not valid java name */
    public static final void m3762TapToPayTapSurface3JVO9M(int i, long j, Composer composer, Modifier modifier) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1387119806);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(j) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(16.0f), horizontal, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j, ArcadeThemeKt.LocalIconColor), Expect_jvmKt.rememberComposableLambda(369626232, new MapMarkerPropertiesKt$$ExternalSyntheticLambda1(j, 5), gapComposer), gapComposer, 56);
            String stringResource = Room.stringResource(gapComposer, R.string.tap_to_pay_payment_instruction);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors.surface.keypad.text, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 32.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda5(j, modifier, i, 6);
        }
    }
}
