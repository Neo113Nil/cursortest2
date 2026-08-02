package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetWalletAddressesErrorCode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetWalletAddressesErrorCode.Companion.getClass();
        if (i == 0) {
            return GetWalletAddressesErrorCode.GET_WALLET_ADDRESSES_ERROR_CODE_UNSPECIFIED;
        }
        if (i == 1) {
            return GetWalletAddressesErrorCode.GET_WALLET_ADDRESSES_ERROR_CODE_ADDRESS_UNAVAILABLE;
        }
        if (i != 2) {
            return null;
        }
        return GetWalletAddressesErrorCode.GET_WALLET_ADDRESSES_ERROR_CODE_UNSUPPORTED_CHAIN;
    }
}
