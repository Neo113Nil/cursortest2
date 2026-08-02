package com.stripe.android.financialconnections.navigation;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.fillr.analytics.util.HttpService;
import com.fillr.browsersdk.BrowserSDKLogger$Companion;
import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.core.validator.CreditcardTypeValidator;
import com.fillr.featuretoggle.strategy.StrategyUtils;
import com.fillr.s;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.data.profile.ProfilesKt;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes8.dex */
public final /* synthetic */ class ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                int intValue = ((Integer) obj3).intValue();
                navBackStackEntry.getClass();
                InstitutionPickerScreenKt.InstitutionPickerScreen(navBackStackEntry, (Composer) obj2, intValue & 14);
                return Unit.INSTANCE;
            case 1:
                AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) obj;
                int intValue2 = ((Integer) obj3).intValue();
                androidImageBitmap.getClass();
                ImageKt.m176Image5hnEew(androidImageBitmap, null, SizeKt.fillMaxSize(companion, 1.0f), ContentScale.Companion.Crop, null, (Composer) obj2, (intValue2 & 14) | 25008, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                return Unit.INSTANCE;
            case 2:
                Composer composer = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer, R.string.stripe_exit_modal_cta_cancel), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer, 0, 0, 131070);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer2 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer2, R.string.stripe_exit_modal_cta_accept), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer2, 0, 0, 131070);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer3 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MarkdownParser$$ExternalSyntheticLambda0(20);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    InstitutionPickerScreenKt.SearchTitle(SpacerKt.m300paddingVpY3zN4$default(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), "loaded_picker_title"), 8.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer4 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer4, SizeKt.m277height3ABfNKs(companion, 24.0f));
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer5 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, 8.0f));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer6 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer6, R.string.stripe_account_picker_retrieving_accounts), SizeKt.fillMaxWidth(companion, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer6.consume(ThemeKt.LocalTypography)).headingXLarge, gapComposer6, 48, 0, 65532);
                    SpacerKt.Spacer(gapComposer6, SizeKt.m285size3ABfNKs(companion, 8.0f));
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Brush brush = (Brush) obj;
                Composer composer7 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                brush.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer7).changed(brush) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 88.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), brush, null, 6), gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer8 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer8, R.string.stripe_manualentry_cta), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer8, 0, 0, 131070);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer9 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer9, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer9, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ListItemKt.m4014LoadingSpinneruFdPcIQ(SizeKt.m285size3ABfNKs(companion, 24.0f), RecyclerView.DECELERATION_RATE, null, gapComposer9, 6, 6);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer10 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer10, R.string.stripe_networking_save_to_link_verification_cta_negative), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer10, 0, 0, 131070);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer11 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer11, fillMaxWidth2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer11, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ListItemKt.m4014LoadingSpinneruFdPcIQ(SizeKt.m285size3ABfNKs(companion, 24.0f), RecyclerView.DECELERATION_RATE, null, gapComposer11, 6, 6);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                ProfilesKt.ErrorScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                BrowserSDKLogger$Companion.ConsentScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                CreditcardTypeValidator.PartnerAuthScreen(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR, false, (Composer) obj2, 54);
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                FillrWidgetFactory.ManualEntrySuccessScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                StrategyUtils.IDConsentContentScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                CreditcardTypeValidator.PartnerAuthScreen(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, true, (Composer) obj2, 54);
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                CreditcardTypeValidator.PartnerAuthScreen(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, false, (Composer) obj2, 54);
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                AccountPickerScreenKt.AccountPickerScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                s.SuccessScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                ManualEntryScreenKt.ManualEntryScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                FillrAnalyticsServiceBuilder.NetworkingLinkSignupScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                HttpService.AttachPaymentScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                FillrAnalyticsServiceBuilder.NetworkingLinkSignupScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 26:
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                int intValue14 = ((Integer) obj3).intValue();
                navBackStackEntry2.getClass();
                FillrWidgetVersion.NetworkingLinkLoginWarmupScreen(navBackStackEntry2, (Composer) obj2, intValue14 & 14);
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
            default:
                ((Integer) obj3).intValue();
                ((NavBackStackEntry) obj).getClass();
                LinkAccountPickerScreenKt.LinkAccountPickerScreen((Composer) obj2, 0);
                return Unit.INSTANCE;
        }
    }
}
