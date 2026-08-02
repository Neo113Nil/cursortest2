package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class WalletAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WalletAddress> CREATOR;
    public final String address;
    public final WalletAddressAsset asset;
    public final WalletAddressChain chain;
    public final String qr_code_url;
    public final String truncated_address;

    static {
        WalletAddress$Companion$ADAPTER$1 walletAddress$Companion$ADAPTER$1 = new WalletAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WalletAddress.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.WalletAddress", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/wallet_addresses_messages.proto");
        ADAPTER = walletAddress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(walletAddress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddress(String str, String str2, String str3, WalletAddressChain walletAddressChain, WalletAddressAsset walletAddressAsset, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.address = str;
        this.truncated_address = str2;
        this.qr_code_url = str3;
        this.chain = walletAddressChain;
        this.asset = walletAddressAsset;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WalletAddress)) {
            return false;
        }
        WalletAddress walletAddress = (WalletAddress) obj;
        return Intrinsics.areEqual(unknownFields(), walletAddress.unknownFields()) && Intrinsics.areEqual(this.address, walletAddress.address) && Intrinsics.areEqual(this.truncated_address, walletAddress.truncated_address) && Intrinsics.areEqual(this.qr_code_url, walletAddress.qr_code_url) && Intrinsics.areEqual(this.chain, walletAddress.chain) && Intrinsics.areEqual(this.asset, walletAddress.asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.address;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.truncated_address;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.qr_code_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        WalletAddressChain walletAddressChain = this.chain;
        int hashCode5 = (hashCode4 + (walletAddressChain != null ? walletAddressChain.hashCode() : 0)) * 37;
        WalletAddressAsset walletAddressAsset = this.asset;
        int hashCode6 = hashCode5 + (walletAddressAsset != null ? walletAddressAsset.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(12, false);
        builder.customer_token = this.address;
        builder.account_token = this.truncated_address;
        builder.display_name = this.qr_code_url;
        builder.account_type = this.chain;
        builder.is_sponsored_account = this.asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.address;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "address=", arrayList);
        }
        String str2 = this.truncated_address;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "truncated_address=", arrayList);
        }
        String str3 = this.qr_code_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "qr_code_url=", arrayList);
        }
        WalletAddressChain walletAddressChain = this.chain;
        if (walletAddressChain != null) {
            arrayList.add("chain=" + walletAddressChain);
        }
        WalletAddressAsset walletAddressAsset = this.asset;
        if (walletAddressAsset != null) {
            arrayList.add("asset=" + walletAddressAsset);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WalletAddress{", "}", 0, null, null, 56);
    }
}
