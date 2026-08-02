package com.squareup.cash.taptopay.presenters;

import com.squareup.cash.device.DeviceOrientation;
import com.squareup.cash.taptopay.backend.api.EmvAlertType;
import com.squareup.cash.taptopay.backend.api.EmvCardStatus;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$State;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class TapToPayPaymentPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[EmvCardStatus.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            EmvCardStatus emvCardStatus = EmvCardStatus.DETECTED;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            EmvCardStatus emvCardStatus2 = EmvCardStatus.DETECTED;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EmvAlertType.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            EmvAlertType emvAlertType = EmvAlertType.SUCCESS;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[DeviceOrientation.values().length];
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[TapToPayPaymentPresenter$State.FailureReason.values().length];
        try {
            iArr4[0] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            TapToPayPaymentPresenter$State.FailureReason failureReason = TapToPayPaymentPresenter$State.FailureReason.NFC_TAG_CONNECTION_ERROR;
            iArr4[1] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            TapToPayPaymentPresenter$State.FailureReason failureReason2 = TapToPayPaymentPresenter$State.FailureReason.NFC_TAG_CONNECTION_ERROR;
            iArr4[2] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            TapToPayPaymentPresenter$State.FailureReason failureReason3 = TapToPayPaymentPresenter$State.FailureReason.NFC_TAG_CONNECTION_ERROR;
            iArr4[3] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
