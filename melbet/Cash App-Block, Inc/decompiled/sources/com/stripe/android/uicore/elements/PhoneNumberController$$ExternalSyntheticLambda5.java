package com.stripe.android.uicore.elements;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.featuretoggle.strategy.StrategyUtils;
import com.fillr.s;
import com.google.android.gms.internal.common.zzai;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.features.reset.ResetState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.forms.FormFieldEntry;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class PhoneNumberController$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PhoneNumberController$$ExternalSyntheticLambda5(PhoneNumberController phoneNumberController) {
        this.$r8$classId = 0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                String str = (String) obj;
                Integer num = (Integer) obj2;
                str.getClass();
                return new Pair(str, Boolean.valueOf(str.length() >= (num != null ? num.intValue() : 0)));
            case 1:
                ((Integer) obj2).getClass();
                FillrAnalyticsServiceBuilder.NetworkingLinkSignupScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) obj;
                Async async = (Async) obj2;
                networkingLinkSignupState.getClass();
                async.getClass();
                return NetworkingLinkSignupState.copy$default(networkingLinkSignupState, async, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            case 3:
                NetworkingLinkSignupState networkingLinkSignupState2 = (NetworkingLinkSignupState) obj;
                Async async2 = (Async) obj2;
                networkingLinkSignupState2.getClass();
                async2.getClass();
                if (zzai.isCancellationError(async2)) {
                    async2 = Async.Uninitialized.INSTANCE;
                }
                return NetworkingLinkSignupState.copy$default(networkingLinkSignupState2, null, null, null, null, async2, null, 111);
            case 4:
                NetworkingLinkSignupState networkingLinkSignupState3 = (NetworkingLinkSignupState) obj;
                Async async3 = (Async) obj2;
                networkingLinkSignupState3.getClass();
                async3.getClass();
                return NetworkingLinkSignupState.copy$default(networkingLinkSignupState3, null, null, null, async3, null, null, 119);
            case 5:
                ((Integer) obj2).getClass();
                NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                NetworkingLinkVerificationState networkingLinkVerificationState = (NetworkingLinkVerificationState) obj;
                Async async4 = (Async) obj2;
                networkingLinkVerificationState.getClass();
                async4.getClass();
                return NetworkingLinkVerificationState.copy$default(networkingLinkVerificationState, async4, null, 2);
            case 7:
                NetworkingLinkVerificationState networkingLinkVerificationState2 = (NetworkingLinkVerificationState) obj;
                Async async5 = (Async) obj2;
                networkingLinkVerificationState2.getClass();
                async5.getClass();
                return NetworkingLinkVerificationState.copy$default(networkingLinkVerificationState2, null, async5, 1);
            case 8:
                ((Integer) obj2).getClass();
                NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState = (NetworkingSaveToLinkVerificationState) obj;
                Async async6 = (Async) obj2;
                networkingSaveToLinkVerificationState.getClass();
                async6.getClass();
                return NetworkingSaveToLinkVerificationState.copy$default(networkingSaveToLinkVerificationState, async6, null, 2);
            case 10:
                NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState2 = (NetworkingSaveToLinkVerificationState) obj;
                Async async7 = (Async) obj2;
                networkingSaveToLinkVerificationState2.getClass();
                async7.getClass();
                return NetworkingSaveToLinkVerificationState.copy$default(networkingSaveToLinkVerificationState2, null, async7, 1);
            case 11:
                SharedPartnerAuthState sharedPartnerAuthState = (SharedPartnerAuthState) obj;
                Async async8 = (Async) obj2;
                sharedPartnerAuthState.getClass();
                async8.getClass();
                return SharedPartnerAuthState.copy$default(sharedPartnerAuthState, async8, null, null, 29);
            case 12:
                SharedPartnerAuthState sharedPartnerAuthState2 = (SharedPartnerAuthState) obj;
                Async async9 = (Async) obj2;
                sharedPartnerAuthState2.getClass();
                async9.getClass();
                return SharedPartnerAuthState.copy$default(sharedPartnerAuthState2, async9, null, null, 29);
            case 13:
                ((Integer) obj2).getClass();
                RecipientUtil.ResetScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                Async async10 = (Async) obj2;
                ((ResetState) obj).getClass();
                async10.getClass();
                return new ResetState(async10);
            case 15:
                ((Integer) obj2).getClass();
                StrategyUtils.IDConsentContentScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                IDConsentContentState iDConsentContentState = (IDConsentContentState) obj;
                Async async11 = (Async) obj2;
                iDConsentContentState.getClass();
                async11.getClass();
                return IDConsentContentState.copy$default(iDConsentContentState, null, async11, null, 5);
            case 17:
                IDConsentContentState iDConsentContentState2 = (IDConsentContentState) obj;
                Async async12 = (Async) obj2;
                iDConsentContentState2.getClass();
                async12.getClass();
                return IDConsentContentState.copy$default(iDConsentContentState2, async12, null, null, 6);
            case 18:
                ((Integer) obj2).getClass();
                s.SuccessScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                SuccessState successState = (SuccessState) obj;
                Async async13 = (Async) obj2;
                successState.getClass();
                async13.getClass();
                return SuccessState.copy$default(successState, async13, null, 2);
            case 20:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Painter painterResource = Countries.painterResource(R.drawable.stripe_ic_material_arrow_back, 0, gapComposer);
                    long j = ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).icon;
                    Modifier testTag = TestTagKt.testTag(companion, "top-app-bar-back-button");
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(13);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    IconKt.m492Iconww6aTOc(painterResource, "Back icon", SemanticsModifierKt.semantics(testTag, false, (Function1) rememberedValue), j, gapComposer, Painter.$stable | 48, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_material_close, 0, gapComposer2), "Close icon", null, ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).icon, gapComposer2, Painter.$stable | 48, 4);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ConsumerSession$$ExternalSyntheticLambda0(22);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    TextKt.FinancialConnectionsButton((Function0) rememberedValue2, fillMaxWidth2, null, null, false, false, LayoutKt.f824lambda$1277661102, gapComposer3, 1572918, 60);
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(companion, 16.0f, gapComposer3, companion, 1.0f);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ConsumerSession$$ExternalSyntheticLambda0(23);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    TextKt.FinancialConnectionsButton((Function0) rememberedValue3, m, null, null, false, false, LayoutKt.lambda$1030431689, gapComposer3, 1572918, 60);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Integer num2 = (Integer) obj2;
                if (((Boolean) obj).booleanValue() && num2 == null) {
                    return new FieldValidationMessage$Error(R.string.stripe_blank_and_required);
                }
                return null;
            case 24:
                return new FormFieldEntry((String) obj2, ((Boolean) obj).booleanValue());
            case 25:
                String str2 = (String) obj;
                PhoneNumberFormatter phoneNumberFormatter = (PhoneNumberFormatter) obj2;
                str2.getClass();
                phoneNumberFormatter.getClass();
                return phoneNumberFormatter.toE164Format(str2);
            case 26:
                String str3 = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                str3.getClass();
                return new FormFieldEntry(str3, booleanValue);
            case 27:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                TextFieldState textFieldState = (TextFieldState) obj2;
                textFieldState.getClass();
                FieldValidationMessage$Error validationMessage = textFieldState.getValidationMessage();
                if (validationMessage == null || !booleanValue2) {
                    return null;
                }
                return validationMessage;
            case 28:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str4 = (String) obj2;
                str4.getClass();
                return new FormFieldEntry(str4, booleanValue3);
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PhoneNumberController$$ExternalSyntheticLambda5(int i, int i2) {
        this.$r8$classId = i2;
    }

    public /* synthetic */ PhoneNumberController$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }
}
