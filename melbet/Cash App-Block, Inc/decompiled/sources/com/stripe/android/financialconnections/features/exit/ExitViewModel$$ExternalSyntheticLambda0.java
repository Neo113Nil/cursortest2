package com.stripe.android.financialconnections.features.exit;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.room.Room;
import com.fillr.browsersdk.BrowserSDKLogger$Companion;
import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.google.android.gms.internal.common.zzai;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.data.profile.ProfilesKt;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.error.ErrorState;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessState;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.model.LinkBrand;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes8.dex */
public final /* synthetic */ class ExitViewModel$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ExitViewModel$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i) {
            case 0:
                ExitState exitState = (ExitState) obj;
                Async async = (Async) obj2;
                exitState.getClass();
                async.getClass();
                return ExitState.copy$default(exitState, async, 5);
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ListItemKt.ShapedIcon(Countries.painterResource(R.drawable.stripe_ic_warning, 0, gapComposer), null, null, null, null, gapComposer, Painter.$stable | 24576, 14);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    TopAppBarState topAppBarState = new TopAppBarState(LinkBrand.Link, false, null, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Luhn$$ExternalSyntheticLambda0(19);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    TextKt.FinancialConnectionsTopAppBar(topAppBarState, (Function0) rememberedValue, gapComposer2, 48);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    TopAppBarState topAppBarState2 = new TopAppBarState(LinkBrand.Link, false, null, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new Luhn$$ExternalSyntheticLambda0(25);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    TextKt.FinancialConnectionsTopAppBar(topAppBarState2, (Function0) rememberedValue2, gapComposer3, 48);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    TopAppBarState topAppBarState3 = new TopAppBarState(LinkBrand.Link, false, null, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new Luhn$$ExternalSyntheticLambda0(23);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    TextKt.FinancialConnectionsTopAppBar(topAppBarState3, (Function0) rememberedValue3, gapComposer4, 48);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    TopAppBarState topAppBarState4 = new TopAppBarState(LinkBrand.Link, false, null, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new Luhn$$ExternalSyntheticLambda0(24);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    TextKt.FinancialConnectionsTopAppBar(topAppBarState4, (Function0) rememberedValue4, gapComposer5, 48);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ListItemKt.FullScreenGenericLoading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                BrowserSDKLogger$Companion.ConsentScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                BrowserSDKLogger$Companion.ConsentLoadingContent((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ConsentState consentState = (ConsentState) obj;
                Async async2 = (Async) obj2;
                consentState.getClass();
                async2.getClass();
                return ConsentState.copy$default(consentState, async2, null, null, 14);
            case 10:
                ConsentState consentState2 = (ConsentState) obj;
                Async async3 = (Async) obj2;
                consentState2.getClass();
                async3.getClass();
                return ConsentState.copy$default(consentState2, null, async3, null, 11);
            case 11:
                ((Integer) obj2).getClass();
                ProfilesKt.ErrorScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                Async async4 = (Async) obj2;
                ((ErrorState) obj).getClass();
                async4.getClass();
                return new ErrorState(async4);
            case 13:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    TextResource.StringId stringId = new TextResource.StringId(R.string.stripe_exit_modal_desc, CollectionsKt__CollectionsJVMKt.listOf("MerchantName"));
                    Object rememberedValue5 = gapComposer6.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new Luhn$$ExternalSyntheticLambda0(27);
                        gapComposer6.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function0 = (Function0) rememberedValue5;
                    Object rememberedValue6 = gapComposer6.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new Luhn$$ExternalSyntheticLambda0(28);
                        gapComposer6.updateRememberedValue(rememberedValue6);
                    }
                    ExitModalKt.ExitModalContent(stringId, false, function0, (Function0) rememberedValue6, gapComposer6, 3504);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    androidx.compose.material.TextKt.m509Text4IGK_g(Room.stringResource(gapComposer7, R.string.stripe_search), null, ((FinancialConnectionsColors) gapComposer7.consume(ThemeKt.LocalColors)).textSubdued, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer7.consume(ThemeKt.LocalTypography)).labelLarge, gapComposer7, 0, 0, 65530);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_search, 0, gapComposer8), "Search icon", null, ((FinancialConnectionsColors) gapComposer8.consume(ThemeKt.LocalColors)).icon, gapComposer8, Painter.$stable | 48, 4);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                InstitutionPickerState institutionPickerState = (InstitutionPickerState) obj;
                Async async5 = (Async) obj2;
                institutionPickerState.getClass();
                async5.getClass();
                return InstitutionPickerState.copy$default(institutionPickerState, null, async5, null, null, 59);
            case 17:
                InstitutionPickerState institutionPickerState2 = (InstitutionPickerState) obj;
                Async async6 = (Async) obj2;
                institutionPickerState2.getClass();
                async6.getClass();
                if (zzai.isCancellationError(async6)) {
                    async6 = new Async.Loading(null);
                }
                return InstitutionPickerState.copy$default(institutionPickerState2, null, null, async6, null, 55);
            case 18:
                ((Integer) obj2).getClass();
                LinkAccountPickerScreenKt.LinkAccountPickerScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                LinkAccountPickerState linkAccountPickerState = (LinkAccountPickerState) obj;
                Async async7 = (Async) obj2;
                linkAccountPickerState.getClass();
                async7.getClass();
                return LinkAccountPickerState.copy$default(linkAccountPickerState, null, async7, null, 5);
            case 20:
                LinkAccountPickerState linkAccountPickerState2 = (LinkAccountPickerState) obj;
                Async async8 = (Async) obj2;
                linkAccountPickerState2.getClass();
                async8.getClass();
                return LinkAccountPickerState.copy$default(linkAccountPickerState2, async8, null, null, 6);
            case 21:
                ((Integer) obj2).getClass();
                ManualEntryScreenKt.Title((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ManualEntryScreenKt.ManualEntryScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ManualEntryState manualEntryState = (ManualEntryState) obj;
                Async async9 = (Async) obj2;
                manualEntryState.getClass();
                async9.getClass();
                return ManualEntryState.copy$default(manualEntryState, null, async9, 1);
            case 24:
                ManualEntryState manualEntryState2 = (ManualEntryState) obj;
                Async async10 = (Async) obj2;
                manualEntryState2.getClass();
                async10.getClass();
                return ManualEntryState.copy$default(manualEntryState2, async10, null, 2);
            case 25:
                ((Integer) obj2).getClass();
                FillrWidgetFactory.ManualEntrySuccessScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ManualEntrySuccessState manualEntrySuccessState = (ManualEntrySuccessState) obj;
                Async async11 = (Async) obj2;
                manualEntrySuccessState.getClass();
                async11.getClass();
                return ManualEntrySuccessState.copy$default(manualEntrySuccessState, async11, null, 2);
            case 27:
                NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState = (NetworkingLinkLoginWarmupState) obj;
                Async async12 = (Async) obj2;
                networkingLinkLoginWarmupState.getClass();
                async12.getClass();
                return NetworkingLinkLoginWarmupState.copy$default(networkingLinkLoginWarmupState, null, null, async12, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            case 28:
                NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState2 = (NetworkingLinkLoginWarmupState) obj;
                Async async13 = (Async) obj2;
                networkingLinkLoginWarmupState2.getClass();
                async13.getClass();
                return NetworkingLinkLoginWarmupState.copy$default(networkingLinkLoginWarmupState2, null, async13, null, 239);
            default:
                NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState3 = (NetworkingLinkLoginWarmupState) obj;
                Async async14 = (Async) obj2;
                networkingLinkLoginWarmupState3.getClass();
                async14.getClass();
                return NetworkingLinkLoginWarmupState.copy$default(networkingLinkLoginWarmupState3, async14, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
        }
    }

    public /* synthetic */ ExitViewModel$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
    }
}
