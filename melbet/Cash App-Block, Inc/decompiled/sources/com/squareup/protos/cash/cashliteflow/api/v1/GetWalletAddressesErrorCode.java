package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum GetWalletAddressesErrorCode implements WireEnum {
    GET_WALLET_ADDRESSES_ERROR_CODE_UNSPECIFIED(0),
    GET_WALLET_ADDRESSES_ERROR_CODE_ADDRESS_UNAVAILABLE(1),
    GET_WALLET_ADDRESSES_ERROR_CODE_UNSUPPORTED_CHAIN(2);

    public static final GetWalletAddressesErrorCode$Companion$ADAPTER$1 ADAPTER;
    public static final Action.Type.Companion Companion;
    public final int value;

    static {
        GetWalletAddressesErrorCode getWalletAddressesErrorCode = GET_WALLET_ADDRESSES_ERROR_CODE_UNSPECIFIED;
        Companion = new Action.Type.Companion();
        ADAPTER = new GetWalletAddressesErrorCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(GetWalletAddressesErrorCode.class), Syntax.PROTO_2, getWalletAddressesErrorCode);
    }

    GetWalletAddressesErrorCode(int i) {
        this.value = i;
    }

    public static final GetWalletAddressesErrorCode fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return GET_WALLET_ADDRESSES_ERROR_CODE_UNSPECIFIED;
        }
        if (i == 1) {
            return GET_WALLET_ADDRESSES_ERROR_CODE_ADDRESS_UNAVAILABLE;
        }
        if (i != 2) {
            return null;
        }
        return GET_WALLET_ADDRESSES_ERROR_CODE_UNSUPPORTED_CHAIN;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
