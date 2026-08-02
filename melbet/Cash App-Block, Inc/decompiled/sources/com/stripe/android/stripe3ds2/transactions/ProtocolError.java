package com.stripe.android.stripe3ds2.transactions;

import com.plaid.internal.EnumC0170g;

/* loaded from: classes9.dex */
public enum ProtocolError {
    /* JADX INFO: Fake field, exist only in values array */
    InvalidMessageReceived(101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes"),
    /* JADX INFO: Fake field, exist only in values array */
    UnsupportedMessageVersion(102, "Message Version Number received is not valid for the receiving component."),
    /* JADX INFO: Fake field, exist only in values array */
    RequiredDataElementMissing(EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, "A message element required as defined in Table A.1 is missing from the message."),
    /* JADX INFO: Fake field, exist only in values array */
    UnrecognizedCriticalMessageExtensions(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, "Critical message extension not recognised."),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidDataElementFormat(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, "Data element not in the required format or value is invalid as defined in Table A.1"),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidTransactionId(EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, "Transaction ID received is not valid for the receiving component."),
    /* JADX INFO: Fake field, exist only in values array */
    DataDecryptionFailure(EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE, "Data could not be decrypted by the receiving system due to technical or other reason."),
    /* JADX INFO: Fake field, exist only in values array */
    TransactionTimedout(402, "Transaction timed-out.");

    ProtocolError(int i, String str) {
    }
}
