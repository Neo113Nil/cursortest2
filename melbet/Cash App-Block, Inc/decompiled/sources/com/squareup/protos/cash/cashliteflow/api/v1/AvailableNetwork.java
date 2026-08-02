package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.common.Money;
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
public final class AvailableNetwork extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvailableNetwork> CREATOR;
    public final Money amount;
    public final AvailableAsset asset;
    public final AvailableChain chain;
    public final String destination_address;
    public final String truncated_address;

    static {
        AvailableNetwork$Companion$ADAPTER$1 availableNetwork$Companion$ADAPTER$1 = new AvailableNetwork$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvailableNetwork.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.AvailableNetwork", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/available_networks_messages.proto");
        ADAPTER = availableNetwork$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(availableNetwork$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableNetwork(AvailableChain availableChain, String str, String str2, Money money, AvailableAsset availableAsset, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.chain = availableChain;
        this.destination_address = str;
        this.truncated_address = str2;
        this.amount = money;
        this.asset = availableAsset;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailableNetwork)) {
            return false;
        }
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        return Intrinsics.areEqual(unknownFields(), availableNetwork.unknownFields()) && Intrinsics.areEqual(this.chain, availableNetwork.chain) && Intrinsics.areEqual(this.destination_address, availableNetwork.destination_address) && Intrinsics.areEqual(this.truncated_address, availableNetwork.truncated_address) && Intrinsics.areEqual(this.amount, availableNetwork.amount) && Intrinsics.areEqual(this.asset, availableNetwork.asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AvailableChain availableChain = this.chain;
        int hashCode2 = (hashCode + (availableChain != null ? availableChain.hashCode() : 0)) * 37;
        String str = this.destination_address;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.truncated_address;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        AvailableAsset availableAsset = this.asset;
        int hashCode6 = hashCode5 + (availableAsset != null ? availableAsset.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(10, false);
        builder.display_name = this.chain;
        builder.customer_token = this.destination_address;
        builder.account_token = this.truncated_address;
        builder.account_type = this.amount;
        builder.is_sponsored_account = this.asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AvailableChain availableChain = this.chain;
        if (availableChain != null) {
            arrayList.add("chain=" + availableChain);
        }
        String str = this.destination_address;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "destination_address=", arrayList);
        }
        String str2 = this.truncated_address;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "truncated_address=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        AvailableAsset availableAsset = this.asset;
        if (availableAsset != null) {
            arrayList.add("asset=" + availableAsset);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableNetwork{", "}", 0, null, null, 56);
    }
}
