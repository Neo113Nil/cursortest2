package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.cash.cashliteflow.blockers.v1.CashLiteApplePayPushProvisioningInputs;
import com.squareup.protos.cash.cashliteflow.blockers.v1.CashLiteGooglePayPushProvisioningInputs;
import com.squareup.protos.cash.investautomator.api.flows.SubmitAutomationForFlowRequest;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.protos.cash.security.SetPasswordRequest;
import com.squareup.protos.cash.security.VerifyPasswordRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.common.SetPasscodeRequest;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import com.squareup.protos.franklin.service.HandleThreeDomainSecureRedirectRequest;
import com.squareup.protos.franklin.service.HandleThreeDomainSecureV2ActionRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SubmitBlockerRequest$Request$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzdh zzdhVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitBlockerRequest.Request((String) obj, zzdhVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifyEmailRequest((VerifyEmailRequest) VerifyEmailRequest.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest((VerifyPasscodeRequest) VerifyPasscodeRequest.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest((VerifyInstrumentRequest) VerifyInstrumentRequest.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetPasscodeRequest((SetPasscodeRequest) SetPasscodeRequest.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$LinkCardRequest((LinkCardRequest) LinkCardRequest.ADAPTER.decode(protoReader));
                    break;
                case 7:
                case 18:
                case 29:
                case 41:
                case 46:
                case 49:
                case 52:
                case 53:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 8:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifyIdentityRequest((VerifyIdentityRequest) VerifyIdentityRequest.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetRatePlanRequest((SetRatePlanRequest) SetRatePlanRequest.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifySmsRequest((VerifySmsRequest) VerifySmsRequest.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest((ConfirmPaymentRequest) ConfirmPaymentRequest.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetFullNameRequest((SetFullNameRequest) SetFullNameRequest.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetCashtagRequest((SetCashtagRequest) SetCashtagRequest.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$ResolveMergeRequest((ResolveMergeRequest) ResolveMergeRequest.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest((ApplyRewardCodeRequest) ApplyRewardCodeRequest.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetAddressRequest((SetAddressRequest) SetAddressRequest.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SelectOptionRequest((SelectOptionRequest) SelectOptionRequest.ADAPTER.decode(protoReader));
                    break;
                case 19:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetSignatureRequest((SetSignatureRequest) SetSignatureRequest.ADAPTER.decode(protoReader));
                    break;
                case 20:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest((VerifyQrCodeRequest) VerifyQrCodeRequest.ADAPTER.decode(protoReader));
                    break;
                case 21:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest((VerifyPasscodeAndExpirationRequest) VerifyPasscodeAndExpirationRequest.ADAPTER.decode(protoReader));
                    break;
                case 22:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$UploadFileRequest((UploadFileRequest) UploadFileRequest.ADAPTER.decode(protoReader));
                    break;
                case 23:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifyContactsRequest((VerifyContactsRequest) VerifyContactsRequest.ADAPTER.decode(protoReader));
                    break;
                case 24:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetCountryRequest((SetCountryRequest) SetCountryRequest.ADAPTER.decode(protoReader));
                    break;
                case 25:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest((SetScheduledTransactionPreferenceRequest) SetScheduledTransactionPreferenceRequest.ADAPTER.decode(protoReader));
                    break;
                case 26:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest((ProvisionDigitalWalletTokenRequest) ProvisionDigitalWalletTokenRequest.ADAPTER.decode(protoReader));
                    break;
                case 27:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest((ActivateDigitalWalletRequest) ActivateDigitalWalletRequest.ADAPTER.decode(protoReader));
                    break;
                case 28:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest((SetCardCustomizationRequest) SetCardCustomizationRequest.ADAPTER.decode(protoReader));
                    break;
                case 30:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitFormRequest((SubmitFormRequest) SubmitFormRequest.ADAPTER.decode(protoReader));
                    break;
                case 31:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest((ConfirmDisclosureRequest) ConfirmDisclosureRequest.ADAPTER.decode(protoReader));
                    break;
                case 32:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$RegisterSmsRequest((RegisterSmsRequest) RegisterSmsRequest.ADAPTER.decode(protoReader));
                    break;
                case 33:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$RegisterEmailRequest((RegisterEmailRequest) RegisterEmailRequest.ADAPTER.decode(protoReader));
                    break;
                case 34:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$CheckDepositRequest((CheckDepositRequest) CheckDepositRequest.ADAPTER.decode(protoReader));
                    break;
                case 35:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest((HandleThreeDomainSecureRedirectRequest) HandleThreeDomainSecureRedirectRequest.ADAPTER.decode(protoReader));
                    break;
                case 36:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetAmountRequest((SetAmountRequest) SetAmountRequest.ADAPTER.decode(protoReader));
                    break;
                case 37:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest((CompleteDigitalWalletTokenProvisioningRequest) CompleteDigitalWalletTokenProvisioningRequest.ADAPTER.decode(protoReader));
                    break;
                case 38:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SelectActivityRequest((SelectActivityRequest) SelectActivityRequest.ADAPTER.decode(protoReader));
                    break;
                case 39:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest((HandleThreeDomainSecureV2ActionRequest) HandleThreeDomainSecureV2ActionRequest.ADAPTER.decode(protoReader));
                    break;
                case 40:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SelectSponsorsRequest((SelectSponsorsRequest) SelectSponsorsRequest.ADAPTER.decode(protoReader));
                    break;
                case 42:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetPasswordRequest((SetPasswordRequest) SetPasswordRequest.ADAPTER.decode(protoReader));
                    break;
                case 43:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$VerifyPasswordRequest((VerifyPasswordRequest) VerifyPasswordRequest.ADAPTER.decode(protoReader));
                    break;
                case 44:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$FinishTutorialRequest((FinishTutorialRequest) FinishTutorialRequest.ADAPTER.decode(protoReader));
                    break;
                case 45:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest((SubmitPayrollProviderSelectionRequest) SubmitPayrollProviderSelectionRequest.ADAPTER.decode(protoReader));
                    break;
                case 47:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest((ResolvePersonaDidvBlockerRequest) ResolvePersonaDidvBlockerRequest.ADAPTER.decode(protoReader));
                    break;
                case 48:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest((SubmitAutomationForFlowRequest) SubmitAutomationForFlowRequest.ADAPTER.decode(protoReader));
                    break;
                case 50:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitFilesetRequest((SubmitFilesetRequest) SubmitFilesetRequest.ADAPTER.decode(protoReader));
                    break;
                case 51:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SelectInstrumentRequest((SelectInstrumentRequest) SelectInstrumentRequest.ADAPTER.decode(protoReader));
                    break;
                case 54:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SelectParticipantRequest((SelectParticipantRequest) SelectParticipantRequest.ADAPTER.decode(protoReader));
                    break;
                case 55:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest((FinishCreditMultiStepLoadRequest) FinishCreditMultiStepLoadRequest.ADAPTER.decode(protoReader));
                    break;
                case 56:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest((CreditMultiStepLoadPollingRequest) CreditMultiStepLoadPollingRequest.ADAPTER.decode(protoReader));
                    break;
                case 57:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest((LoanAmountPickerRequest) LoanAmountPickerRequest.ADAPTER.decode(protoReader));
                    break;
                case 58:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest((SubmitInvestmentEntitySelectionRequest) SubmitInvestmentEntitySelectionRequest.ADAPTER.decode(protoReader));
                    break;
                case 59:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$EndFlowRequest((EndFlowRequest) EndFlowRequest.ADAPTER.decode(protoReader));
                    break;
                case 60:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest((P2pInstrumentSelectionRequest) P2pInstrumentSelectionRequest.ADAPTER.decode(protoReader));
                    break;
                case 61:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$HumanConfirmationRequest((HumanConfirmationRequest) HumanConfirmationRequest.ADAPTER.decode(protoReader));
                    break;
                case 62:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SetDateRequest((SetDateRequest) SetDateRequest.ADAPTER.decode(protoReader));
                    break;
                case 63:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$ClabeEntryRequest((ClabeEntryRequest) ClabeEntryRequest.ADAPTER.decode(protoReader));
                    break;
                case 64:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest((MultiCurrencyAmountEntryRequest) MultiCurrencyAmountEntryRequest.ADAPTER.decode(protoReader));
                    break;
                case 65:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest((MultiCurrencyPaymentReviewRequest) MultiCurrencyPaymentReviewRequest.ADAPTER.decode(protoReader));
                    break;
                case 66:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest((OverflowOptionPickerRequest) OverflowOptionPickerRequest.ADAPTER.decode(protoReader));
                    break;
                case 67:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest((SelectTransferOptionRequest) SelectTransferOptionRequest.ADAPTER.decode(protoReader));
                    break;
                case 68:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest((SubmitBiometricsOptinRequest) SubmitBiometricsOptinRequest.ADAPTER.decode(protoReader));
                    break;
                case 69:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest((RequestPushNotificationsRequest) RequestPushNotificationsRequest.ADAPTER.decode(protoReader));
                    break;
                case 70:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest((SubmitFidesmoProvisioningBlockerRequest) SubmitFidesmoProvisioningBlockerRequest.ADAPTER.decode(protoReader));
                    break;
                case 71:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest((PaymentDeviceCustomizationRequest) PaymentDeviceCustomizationRequest.ADAPTER.decode(protoReader));
                    break;
                case 72:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest((SubmitProveMobileAuthBlockerRequest) SubmitProveMobileAuthBlockerRequest.ADAPTER.decode(protoReader));
                    break;
                case 73:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest((SubmitBitcoinP2pConversionPercentageRequest) SubmitBitcoinP2pConversionPercentageRequest.ADAPTER.decode(protoReader));
                    break;
                case 74:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$AddMoneyRequest((AddMoneyRequest) AddMoneyRequest.ADAPTER.decode(protoReader));
                    break;
                case 75:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest((SubmitLiteRecoveryEmailOtpBlockerRequest) SubmitLiteRecoveryEmailOtpBlockerRequest.ADAPTER.decode(protoReader));
                    break;
                case 76:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs((CashLiteApplePayPushProvisioningInputs) CashLiteApplePayPushProvisioningInputs.ADAPTER.decode(protoReader));
                    break;
                case 77:
                    zzdhVar = new SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs((CashLiteGooglePayPushProvisioningInputs) CashLiteGooglePayPushProvisioningInputs.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitBlockerRequest.Request request = (SubmitBlockerRequest.Request) obj;
        reverseProtoWriter.getClass();
        request.getClass();
        reverseProtoWriter.writeBytes(request.unknownFields());
        zzdh zzdhVar = request.request;
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyEmailRequest) {
            VerifyEmailRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SubmitBlockerRequest$Request$Request$VerifyEmailRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest) {
            VerifyPasscodeRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest) {
            VerifyInstrumentRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetPasscodeRequest) {
            SetPasscodeRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SubmitBlockerRequest$Request$Request$SetPasscodeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$LinkCardRequest) {
            LinkCardRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((SubmitBlockerRequest$Request$Request$LinkCardRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyIdentityRequest) {
            VerifyIdentityRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((SubmitBlockerRequest$Request$Request$VerifyIdentityRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetRatePlanRequest) {
            SetRatePlanRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((SubmitBlockerRequest$Request$Request$SetRatePlanRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifySmsRequest) {
            VerifySmsRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((SubmitBlockerRequest$Request$Request$VerifySmsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest) {
            ConfirmPaymentRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetFullNameRequest) {
            SetFullNameRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((SubmitBlockerRequest$Request$Request$SetFullNameRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCashtagRequest) {
            SetCashtagRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((SubmitBlockerRequest$Request$Request$SetCashtagRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ResolveMergeRequest) {
            ResolveMergeRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((SubmitBlockerRequest$Request$Request$ResolveMergeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest) {
            ApplyRewardCodeRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetAddressRequest) {
            SetAddressRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((SubmitBlockerRequest$Request$Request$SetAddressRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectOptionRequest) {
            SelectOptionRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((SubmitBlockerRequest$Request$Request$SelectOptionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetSignatureRequest) {
            SetSignatureRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((SubmitBlockerRequest$Request$Request$SetSignatureRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest) {
            VerifyQrCodeRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 20, ((SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest) {
            VerifyPasscodeAndExpirationRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 21, ((SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$UploadFileRequest) {
            UploadFileRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 22, ((SubmitBlockerRequest$Request$Request$UploadFileRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyContactsRequest) {
            VerifyContactsRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 23, ((SubmitBlockerRequest$Request$Request$VerifyContactsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCountryRequest) {
            SetCountryRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 24, ((SubmitBlockerRequest$Request$Request$SetCountryRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest) {
            SetScheduledTransactionPreferenceRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 25, ((SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest) {
            ProvisionDigitalWalletTokenRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 26, ((SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest) {
            ActivateDigitalWalletRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 27, ((SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest) {
            SetCardCustomizationRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 28, ((SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFormRequest) {
            SubmitFormRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 30, ((SubmitBlockerRequest$Request$Request$SubmitFormRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest) {
            ConfirmDisclosureRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 31, ((SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RegisterSmsRequest) {
            RegisterSmsRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 32, ((SubmitBlockerRequest$Request$Request$RegisterSmsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RegisterEmailRequest) {
            RegisterEmailRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 33, ((SubmitBlockerRequest$Request$Request$RegisterEmailRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CheckDepositRequest) {
            CheckDepositRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 34, ((SubmitBlockerRequest$Request$Request$CheckDepositRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest) {
            HandleThreeDomainSecureRedirectRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 35, ((SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetAmountRequest) {
            SetAmountRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 36, ((SubmitBlockerRequest$Request$Request$SetAmountRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest) {
            CompleteDigitalWalletTokenProvisioningRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 37, ((SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectActivityRequest) {
            SelectActivityRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 38, ((SubmitBlockerRequest$Request$Request$SelectActivityRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest) {
            HandleThreeDomainSecureV2ActionRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 39, ((SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectSponsorsRequest) {
            SelectSponsorsRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 40, ((SubmitBlockerRequest$Request$Request$SelectSponsorsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetPasswordRequest) {
            SetPasswordRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 42, ((SubmitBlockerRequest$Request$Request$SetPasswordRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasswordRequest) {
            VerifyPasswordRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 43, ((SubmitBlockerRequest$Request$Request$VerifyPasswordRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$FinishTutorialRequest) {
            FinishTutorialRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 44, ((SubmitBlockerRequest$Request$Request$FinishTutorialRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest) {
            SubmitPayrollProviderSelectionRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 45, ((SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest) {
            ResolvePersonaDidvBlockerRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 47, ((SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest) {
            SubmitAutomationForFlowRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 48, ((SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFilesetRequest) {
            SubmitFilesetRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 50, ((SubmitBlockerRequest$Request$Request$SubmitFilesetRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectInstrumentRequest) {
            SelectInstrumentRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 51, ((SubmitBlockerRequest$Request$Request$SelectInstrumentRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectParticipantRequest) {
            SelectParticipantRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 54, ((SubmitBlockerRequest$Request$Request$SelectParticipantRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest) {
            FinishCreditMultiStepLoadRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 55, ((SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest) {
            CreditMultiStepLoadPollingRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 56, ((SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest) {
            LoanAmountPickerRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 57, ((SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest) {
            SubmitInvestmentEntitySelectionRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 58, ((SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$EndFlowRequest) {
            EndFlowRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 59, ((SubmitBlockerRequest$Request$Request$EndFlowRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest) {
            P2pInstrumentSelectionRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 60, ((SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HumanConfirmationRequest) {
            HumanConfirmationRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 61, ((SubmitBlockerRequest$Request$Request$HumanConfirmationRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetDateRequest) {
            SetDateRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 62, ((SubmitBlockerRequest$Request$Request$SetDateRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ClabeEntryRequest) {
            ClabeEntryRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 63, ((SubmitBlockerRequest$Request$Request$ClabeEntryRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest) {
            MultiCurrencyAmountEntryRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 64, ((SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest) {
            MultiCurrencyPaymentReviewRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 65, ((SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest) {
            OverflowOptionPickerRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 66, ((SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest) {
            SelectTransferOptionRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 67, ((SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest) {
            SubmitBiometricsOptinRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 68, ((SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest) {
            RequestPushNotificationsRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 69, ((SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest) {
            SubmitFidesmoProvisioningBlockerRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 70, ((SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest) {
            PaymentDeviceCustomizationRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 71, ((SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest) {
            SubmitProveMobileAuthBlockerRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 72, ((SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest) {
            SubmitBitcoinP2pConversionPercentageRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 73, ((SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$AddMoneyRequest) {
            AddMoneyRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 74, ((SubmitBlockerRequest$Request$Request$AddMoneyRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest) {
            SubmitLiteRecoveryEmailOtpBlockerRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 75, ((SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs) {
            CashLiteApplePayPushProvisioningInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 76, ((SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs) {
            CashLiteGooglePayPushProvisioningInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 77, ((SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs) zzdhVar).getValue());
        } else if (zzdhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, request.blocker_descriptor_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBlockerRequest.Request request = (SubmitBlockerRequest.Request) obj;
        request.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, request.blocker_descriptor_id) + request.unknownFields().getSize$okio();
        zzdh zzdhVar = request.request;
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyEmailRequest) {
            return VerifyEmailRequest.ADAPTER.encodedSizeWithTag(2, ((SubmitBlockerRequest$Request$Request$VerifyEmailRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest) {
            return VerifyPasscodeRequest.ADAPTER.encodedSizeWithTag(3, ((SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest) {
            return VerifyInstrumentRequest.ADAPTER.encodedSizeWithTag(4, ((SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetPasscodeRequest) {
            return SetPasscodeRequest.ADAPTER.encodedSizeWithTag(5, ((SubmitBlockerRequest$Request$Request$SetPasscodeRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$LinkCardRequest) {
            return LinkCardRequest.ADAPTER.encodedSizeWithTag(6, ((SubmitBlockerRequest$Request$Request$LinkCardRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyIdentityRequest) {
            return VerifyIdentityRequest.ADAPTER.encodedSizeWithTag(8, ((SubmitBlockerRequest$Request$Request$VerifyIdentityRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetRatePlanRequest) {
            return SetRatePlanRequest.ADAPTER.encodedSizeWithTag(9, ((SubmitBlockerRequest$Request$Request$SetRatePlanRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifySmsRequest) {
            return VerifySmsRequest.ADAPTER.encodedSizeWithTag(10, ((SubmitBlockerRequest$Request$Request$VerifySmsRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest) {
            return ConfirmPaymentRequest.ADAPTER.encodedSizeWithTag(11, ((SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetFullNameRequest) {
            return SetFullNameRequest.ADAPTER.encodedSizeWithTag(12, ((SubmitBlockerRequest$Request$Request$SetFullNameRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCashtagRequest) {
            return SetCashtagRequest.ADAPTER.encodedSizeWithTag(13, ((SubmitBlockerRequest$Request$Request$SetCashtagRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ResolveMergeRequest) {
            return ResolveMergeRequest.ADAPTER.encodedSizeWithTag(14, ((SubmitBlockerRequest$Request$Request$ResolveMergeRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest) {
            return ApplyRewardCodeRequest.ADAPTER.encodedSizeWithTag(15, ((SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetAddressRequest) {
            return SetAddressRequest.ADAPTER.encodedSizeWithTag(16, ((SubmitBlockerRequest$Request$Request$SetAddressRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectOptionRequest) {
            return SelectOptionRequest.ADAPTER.encodedSizeWithTag(17, ((SubmitBlockerRequest$Request$Request$SelectOptionRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetSignatureRequest) {
            return SetSignatureRequest.ADAPTER.encodedSizeWithTag(19, ((SubmitBlockerRequest$Request$Request$SetSignatureRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest) {
            return VerifyQrCodeRequest.ADAPTER.encodedSizeWithTag(20, ((SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest) {
            return VerifyPasscodeAndExpirationRequest.ADAPTER.encodedSizeWithTag(21, ((SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$UploadFileRequest) {
            return UploadFileRequest.ADAPTER.encodedSizeWithTag(22, ((SubmitBlockerRequest$Request$Request$UploadFileRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyContactsRequest) {
            return VerifyContactsRequest.ADAPTER.encodedSizeWithTag(23, ((SubmitBlockerRequest$Request$Request$VerifyContactsRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCountryRequest) {
            return SetCountryRequest.ADAPTER.encodedSizeWithTag(24, ((SubmitBlockerRequest$Request$Request$SetCountryRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest) {
            return SetScheduledTransactionPreferenceRequest.ADAPTER.encodedSizeWithTag(25, ((SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest) {
            return ProvisionDigitalWalletTokenRequest.ADAPTER.encodedSizeWithTag(26, ((SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest) {
            return ActivateDigitalWalletRequest.ADAPTER.encodedSizeWithTag(27, ((SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest) {
            return SetCardCustomizationRequest.ADAPTER.encodedSizeWithTag(28, ((SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFormRequest) {
            return SubmitFormRequest.ADAPTER.encodedSizeWithTag(30, ((SubmitBlockerRequest$Request$Request$SubmitFormRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest) {
            return ConfirmDisclosureRequest.ADAPTER.encodedSizeWithTag(31, ((SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RegisterSmsRequest) {
            return RegisterSmsRequest.ADAPTER.encodedSizeWithTag(32, ((SubmitBlockerRequest$Request$Request$RegisterSmsRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RegisterEmailRequest) {
            return RegisterEmailRequest.ADAPTER.encodedSizeWithTag(33, ((SubmitBlockerRequest$Request$Request$RegisterEmailRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CheckDepositRequest) {
            return CheckDepositRequest.ADAPTER.encodedSizeWithTag(34, ((SubmitBlockerRequest$Request$Request$CheckDepositRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest) {
            return HandleThreeDomainSecureRedirectRequest.ADAPTER.encodedSizeWithTag(35, ((SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetAmountRequest) {
            return SetAmountRequest.ADAPTER.encodedSizeWithTag(36, ((SubmitBlockerRequest$Request$Request$SetAmountRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest) {
            return CompleteDigitalWalletTokenProvisioningRequest.ADAPTER.encodedSizeWithTag(37, ((SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectActivityRequest) {
            return SelectActivityRequest.ADAPTER.encodedSizeWithTag(38, ((SubmitBlockerRequest$Request$Request$SelectActivityRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest) {
            return HandleThreeDomainSecureV2ActionRequest.ADAPTER.encodedSizeWithTag(39, ((SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectSponsorsRequest) {
            return SelectSponsorsRequest.ADAPTER.encodedSizeWithTag(40, ((SubmitBlockerRequest$Request$Request$SelectSponsorsRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetPasswordRequest) {
            return SetPasswordRequest.ADAPTER.encodedSizeWithTag(42, ((SubmitBlockerRequest$Request$Request$SetPasswordRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasswordRequest) {
            return VerifyPasswordRequest.ADAPTER.encodedSizeWithTag(43, ((SubmitBlockerRequest$Request$Request$VerifyPasswordRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$FinishTutorialRequest) {
            return FinishTutorialRequest.ADAPTER.encodedSizeWithTag(44, ((SubmitBlockerRequest$Request$Request$FinishTutorialRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest) {
            return SubmitPayrollProviderSelectionRequest.ADAPTER.encodedSizeWithTag(45, ((SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest) {
            return ResolvePersonaDidvBlockerRequest.ADAPTER.encodedSizeWithTag(47, ((SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest) {
            return SubmitAutomationForFlowRequest.ADAPTER.encodedSizeWithTag(48, ((SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFilesetRequest) {
            return SubmitFilesetRequest.ADAPTER.encodedSizeWithTag(50, ((SubmitBlockerRequest$Request$Request$SubmitFilesetRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectInstrumentRequest) {
            return SelectInstrumentRequest.ADAPTER.encodedSizeWithTag(51, ((SubmitBlockerRequest$Request$Request$SelectInstrumentRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectParticipantRequest) {
            return SelectParticipantRequest.ADAPTER.encodedSizeWithTag(54, ((SubmitBlockerRequest$Request$Request$SelectParticipantRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest) {
            return FinishCreditMultiStepLoadRequest.ADAPTER.encodedSizeWithTag(55, ((SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest) {
            return CreditMultiStepLoadPollingRequest.ADAPTER.encodedSizeWithTag(56, ((SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest) {
            return LoanAmountPickerRequest.ADAPTER.encodedSizeWithTag(57, ((SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest) {
            return SubmitInvestmentEntitySelectionRequest.ADAPTER.encodedSizeWithTag(58, ((SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$EndFlowRequest) {
            return EndFlowRequest.ADAPTER.encodedSizeWithTag(59, ((SubmitBlockerRequest$Request$Request$EndFlowRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest) {
            return P2pInstrumentSelectionRequest.ADAPTER.encodedSizeWithTag(60, ((SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HumanConfirmationRequest) {
            return HumanConfirmationRequest.ADAPTER.encodedSizeWithTag(61, ((SubmitBlockerRequest$Request$Request$HumanConfirmationRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetDateRequest) {
            return SetDateRequest.ADAPTER.encodedSizeWithTag(62, ((SubmitBlockerRequest$Request$Request$SetDateRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ClabeEntryRequest) {
            return ClabeEntryRequest.ADAPTER.encodedSizeWithTag(63, ((SubmitBlockerRequest$Request$Request$ClabeEntryRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest) {
            return MultiCurrencyAmountEntryRequest.ADAPTER.encodedSizeWithTag(64, ((SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest) {
            return MultiCurrencyPaymentReviewRequest.ADAPTER.encodedSizeWithTag(65, ((SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest) {
            return OverflowOptionPickerRequest.ADAPTER.encodedSizeWithTag(66, ((SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest) {
            return SelectTransferOptionRequest.ADAPTER.encodedSizeWithTag(67, ((SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest) {
            return SubmitBiometricsOptinRequest.ADAPTER.encodedSizeWithTag(68, ((SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest) {
            return RequestPushNotificationsRequest.ADAPTER.encodedSizeWithTag(69, ((SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest) {
            return SubmitFidesmoProvisioningBlockerRequest.ADAPTER.encodedSizeWithTag(70, ((SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest) {
            return PaymentDeviceCustomizationRequest.ADAPTER.encodedSizeWithTag(71, ((SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest) {
            return SubmitProveMobileAuthBlockerRequest.ADAPTER.encodedSizeWithTag(72, ((SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest) {
            return SubmitBitcoinP2pConversionPercentageRequest.ADAPTER.encodedSizeWithTag(73, ((SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$AddMoneyRequest) {
            return AddMoneyRequest.ADAPTER.encodedSizeWithTag(74, ((SubmitBlockerRequest$Request$Request$AddMoneyRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest) {
            return SubmitLiteRecoveryEmailOtpBlockerRequest.ADAPTER.encodedSizeWithTag(75, ((SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs) {
            return CashLiteApplePayPushProvisioningInputs.ADAPTER.encodedSizeWithTag(76, ((SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs) {
            return CashLiteGooglePayPushProvisioningInputs.ADAPTER.encodedSizeWithTag(77, ((SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs) zzdhVar).getValue()) + encodedSizeWithTag;
        }
        if (zzdhVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBlockerRequest.Request request = (SubmitBlockerRequest.Request) obj;
        request.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = request.blocker_descriptor_id;
        zzdh zzdhVar = request.request;
        byteString.getClass();
        return new SubmitBlockerRequest.Request(str, zzdhVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBlockerRequest.Request request = (SubmitBlockerRequest.Request) obj;
        request.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, request.blocker_descriptor_id);
        zzdh zzdhVar = request.request;
        if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyEmailRequest) {
            VerifyEmailRequest.ADAPTER.encodeWithTag(protoWriter, 2, ((SubmitBlockerRequest$Request$Request$VerifyEmailRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest) {
            VerifyPasscodeRequest.ADAPTER.encodeWithTag(protoWriter, 3, ((SubmitBlockerRequest$Request$Request$VerifyPasscodeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest) {
            VerifyInstrumentRequest.ADAPTER.encodeWithTag(protoWriter, 4, ((SubmitBlockerRequest$Request$Request$VerifyInstrumentRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetPasscodeRequest) {
            SetPasscodeRequest.ADAPTER.encodeWithTag(protoWriter, 5, ((SubmitBlockerRequest$Request$Request$SetPasscodeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$LinkCardRequest) {
            LinkCardRequest.ADAPTER.encodeWithTag(protoWriter, 6, ((SubmitBlockerRequest$Request$Request$LinkCardRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyIdentityRequest) {
            VerifyIdentityRequest.ADAPTER.encodeWithTag(protoWriter, 8, ((SubmitBlockerRequest$Request$Request$VerifyIdentityRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetRatePlanRequest) {
            SetRatePlanRequest.ADAPTER.encodeWithTag(protoWriter, 9, ((SubmitBlockerRequest$Request$Request$SetRatePlanRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifySmsRequest) {
            VerifySmsRequest.ADAPTER.encodeWithTag(protoWriter, 10, ((SubmitBlockerRequest$Request$Request$VerifySmsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest) {
            ConfirmPaymentRequest.ADAPTER.encodeWithTag(protoWriter, 11, ((SubmitBlockerRequest$Request$Request$ConfirmPaymentRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetFullNameRequest) {
            SetFullNameRequest.ADAPTER.encodeWithTag(protoWriter, 12, ((SubmitBlockerRequest$Request$Request$SetFullNameRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCashtagRequest) {
            SetCashtagRequest.ADAPTER.encodeWithTag(protoWriter, 13, ((SubmitBlockerRequest$Request$Request$SetCashtagRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ResolveMergeRequest) {
            ResolveMergeRequest.ADAPTER.encodeWithTag(protoWriter, 14, ((SubmitBlockerRequest$Request$Request$ResolveMergeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest) {
            ApplyRewardCodeRequest.ADAPTER.encodeWithTag(protoWriter, 15, ((SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetAddressRequest) {
            SetAddressRequest.ADAPTER.encodeWithTag(protoWriter, 16, ((SubmitBlockerRequest$Request$Request$SetAddressRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectOptionRequest) {
            SelectOptionRequest.ADAPTER.encodeWithTag(protoWriter, 17, ((SubmitBlockerRequest$Request$Request$SelectOptionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetSignatureRequest) {
            SetSignatureRequest.ADAPTER.encodeWithTag(protoWriter, 19, ((SubmitBlockerRequest$Request$Request$SetSignatureRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest) {
            VerifyQrCodeRequest.ADAPTER.encodeWithTag(protoWriter, 20, ((SubmitBlockerRequest$Request$Request$VerifyQrCodeRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest) {
            VerifyPasscodeAndExpirationRequest.ADAPTER.encodeWithTag(protoWriter, 21, ((SubmitBlockerRequest$Request$Request$VerifyPasscodeAndExpirationRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$UploadFileRequest) {
            UploadFileRequest.ADAPTER.encodeWithTag(protoWriter, 22, ((SubmitBlockerRequest$Request$Request$UploadFileRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyContactsRequest) {
            VerifyContactsRequest.ADAPTER.encodeWithTag(protoWriter, 23, ((SubmitBlockerRequest$Request$Request$VerifyContactsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCountryRequest) {
            SetCountryRequest.ADAPTER.encodeWithTag(protoWriter, 24, ((SubmitBlockerRequest$Request$Request$SetCountryRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest) {
            SetScheduledTransactionPreferenceRequest.ADAPTER.encodeWithTag(protoWriter, 25, ((SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest) {
            ProvisionDigitalWalletTokenRequest.ADAPTER.encodeWithTag(protoWriter, 26, ((SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest) {
            ActivateDigitalWalletRequest.ADAPTER.encodeWithTag(protoWriter, 27, ((SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest) {
            SetCardCustomizationRequest.ADAPTER.encodeWithTag(protoWriter, 28, ((SubmitBlockerRequest$Request$Request$SetCardCustomizationRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFormRequest) {
            SubmitFormRequest.ADAPTER.encodeWithTag(protoWriter, 30, ((SubmitBlockerRequest$Request$Request$SubmitFormRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest) {
            ConfirmDisclosureRequest.ADAPTER.encodeWithTag(protoWriter, 31, ((SubmitBlockerRequest$Request$Request$ConfirmDisclosureRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RegisterSmsRequest) {
            RegisterSmsRequest.ADAPTER.encodeWithTag(protoWriter, 32, ((SubmitBlockerRequest$Request$Request$RegisterSmsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RegisterEmailRequest) {
            RegisterEmailRequest.ADAPTER.encodeWithTag(protoWriter, 33, ((SubmitBlockerRequest$Request$Request$RegisterEmailRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CheckDepositRequest) {
            CheckDepositRequest.ADAPTER.encodeWithTag(protoWriter, 34, ((SubmitBlockerRequest$Request$Request$CheckDepositRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest) {
            HandleThreeDomainSecureRedirectRequest.ADAPTER.encodeWithTag(protoWriter, 35, ((SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetAmountRequest) {
            SetAmountRequest.ADAPTER.encodeWithTag(protoWriter, 36, ((SubmitBlockerRequest$Request$Request$SetAmountRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest) {
            CompleteDigitalWalletTokenProvisioningRequest.ADAPTER.encodeWithTag(protoWriter, 37, ((SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectActivityRequest) {
            SelectActivityRequest.ADAPTER.encodeWithTag(protoWriter, 38, ((SubmitBlockerRequest$Request$Request$SelectActivityRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest) {
            HandleThreeDomainSecureV2ActionRequest.ADAPTER.encodeWithTag(protoWriter, 39, ((SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectSponsorsRequest) {
            SelectSponsorsRequest.ADAPTER.encodeWithTag(protoWriter, 40, ((SubmitBlockerRequest$Request$Request$SelectSponsorsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetPasswordRequest) {
            SetPasswordRequest.ADAPTER.encodeWithTag(protoWriter, 42, ((SubmitBlockerRequest$Request$Request$SetPasswordRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$VerifyPasswordRequest) {
            VerifyPasswordRequest.ADAPTER.encodeWithTag(protoWriter, 43, ((SubmitBlockerRequest$Request$Request$VerifyPasswordRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$FinishTutorialRequest) {
            FinishTutorialRequest.ADAPTER.encodeWithTag(protoWriter, 44, ((SubmitBlockerRequest$Request$Request$FinishTutorialRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest) {
            SubmitPayrollProviderSelectionRequest.ADAPTER.encodeWithTag(protoWriter, 45, ((SubmitBlockerRequest$Request$Request$SubmitPayrollProviderSelectionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest) {
            ResolvePersonaDidvBlockerRequest.ADAPTER.encodeWithTag(protoWriter, 47, ((SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest) {
            SubmitAutomationForFlowRequest.ADAPTER.encodeWithTag(protoWriter, 48, ((SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFilesetRequest) {
            SubmitFilesetRequest.ADAPTER.encodeWithTag(protoWriter, 50, ((SubmitBlockerRequest$Request$Request$SubmitFilesetRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectInstrumentRequest) {
            SelectInstrumentRequest.ADAPTER.encodeWithTag(protoWriter, 51, ((SubmitBlockerRequest$Request$Request$SelectInstrumentRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectParticipantRequest) {
            SelectParticipantRequest.ADAPTER.encodeWithTag(protoWriter, 54, ((SubmitBlockerRequest$Request$Request$SelectParticipantRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest) {
            FinishCreditMultiStepLoadRequest.ADAPTER.encodeWithTag(protoWriter, 55, ((SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest) {
            CreditMultiStepLoadPollingRequest.ADAPTER.encodeWithTag(protoWriter, 56, ((SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest) {
            LoanAmountPickerRequest.ADAPTER.encodeWithTag(protoWriter, 57, ((SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest) {
            SubmitInvestmentEntitySelectionRequest.ADAPTER.encodeWithTag(protoWriter, 58, ((SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$EndFlowRequest) {
            EndFlowRequest.ADAPTER.encodeWithTag(protoWriter, 59, ((SubmitBlockerRequest$Request$Request$EndFlowRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest) {
            P2pInstrumentSelectionRequest.ADAPTER.encodeWithTag(protoWriter, 60, ((SubmitBlockerRequest$Request$Request$P2pInstrumentSelectionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$HumanConfirmationRequest) {
            HumanConfirmationRequest.ADAPTER.encodeWithTag(protoWriter, 61, ((SubmitBlockerRequest$Request$Request$HumanConfirmationRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SetDateRequest) {
            SetDateRequest.ADAPTER.encodeWithTag(protoWriter, 62, ((SubmitBlockerRequest$Request$Request$SetDateRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$ClabeEntryRequest) {
            ClabeEntryRequest.ADAPTER.encodeWithTag(protoWriter, 63, ((SubmitBlockerRequest$Request$Request$ClabeEntryRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest) {
            MultiCurrencyAmountEntryRequest.ADAPTER.encodeWithTag(protoWriter, 64, ((SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest) {
            MultiCurrencyPaymentReviewRequest.ADAPTER.encodeWithTag(protoWriter, 65, ((SubmitBlockerRequest$Request$Request$MultiCurrencyPaymentReviewRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest) {
            OverflowOptionPickerRequest.ADAPTER.encodeWithTag(protoWriter, 66, ((SubmitBlockerRequest$Request$Request$OverflowOptionPickerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest) {
            SelectTransferOptionRequest.ADAPTER.encodeWithTag(protoWriter, 67, ((SubmitBlockerRequest$Request$Request$SelectTransferOptionRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest) {
            SubmitBiometricsOptinRequest.ADAPTER.encodeWithTag(protoWriter, 68, ((SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest) {
            RequestPushNotificationsRequest.ADAPTER.encodeWithTag(protoWriter, 69, ((SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest) {
            SubmitFidesmoProvisioningBlockerRequest.ADAPTER.encodeWithTag(protoWriter, 70, ((SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest) {
            PaymentDeviceCustomizationRequest.ADAPTER.encodeWithTag(protoWriter, 71, ((SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest) {
            SubmitProveMobileAuthBlockerRequest.ADAPTER.encodeWithTag(protoWriter, 72, ((SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest) {
            SubmitBitcoinP2pConversionPercentageRequest.ADAPTER.encodeWithTag(protoWriter, 73, ((SubmitBlockerRequest$Request$Request$SubmitBitcoinP2pConversionPercentageRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$AddMoneyRequest) {
            AddMoneyRequest.ADAPTER.encodeWithTag(protoWriter, 74, ((SubmitBlockerRequest$Request$Request$AddMoneyRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest) {
            SubmitLiteRecoveryEmailOtpBlockerRequest.ADAPTER.encodeWithTag(protoWriter, 75, ((SubmitBlockerRequest$Request$Request$SubmitLiteRecoveryEmailOtpBlockerRequest) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs) {
            CashLiteApplePayPushProvisioningInputs.ADAPTER.encodeWithTag(protoWriter, 76, ((SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs) zzdhVar).getValue());
        } else if (zzdhVar instanceof SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs) {
            CashLiteGooglePayPushProvisioningInputs.ADAPTER.encodeWithTag(protoWriter, 77, ((SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs) zzdhVar).getValue());
        } else if (zzdhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(request.unknownFields());
    }
}
