package com.squareup.protos.cash.blockstable.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.ContactAlias;
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
    public final Asset asset;
    public final Chain chain;
    public final String destination_address;
    public final String gas_fee;
    public final Money gas_fee_in_fiat;
    public final String truncated_address;

    static {
        AvailableNetwork$Companion$ADAPTER$1 availableNetwork$Companion$ADAPTER$1 = new AvailableNetwork$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvailableNetwork.class), "type.googleapis.com/squareup.cash.blockstable.api.v1beta1.AvailableNetwork", Syntax.PROTO_2, null, "squareup/cash/blockstable/api/v1beta1/public.proto");
        ADAPTER = availableNetwork$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(availableNetwork$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableNetwork(Chain chain, String str, String str2, Money money, Asset asset, String str3, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.chain = chain;
        this.destination_address = str;
        this.truncated_address = str2;
        this.amount = money;
        this.asset = asset;
        this.gas_fee = str3;
        this.gas_fee_in_fiat = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailableNetwork)) {
            return false;
        }
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        return Intrinsics.areEqual(unknownFields(), availableNetwork.unknownFields()) && Intrinsics.areEqual(this.chain, availableNetwork.chain) && Intrinsics.areEqual(this.destination_address, availableNetwork.destination_address) && Intrinsics.areEqual(this.truncated_address, availableNetwork.truncated_address) && Intrinsics.areEqual(this.amount, availableNetwork.amount) && Intrinsics.areEqual(this.asset, availableNetwork.asset) && Intrinsics.areEqual(this.gas_fee, availableNetwork.gas_fee) && Intrinsics.areEqual(this.gas_fee_in_fiat, availableNetwork.gas_fee_in_fiat);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Chain chain = this.chain;
        int hashCode2 = (hashCode + (chain != null ? chain.hashCode() : 0)) * 37;
        String str = this.destination_address;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.truncated_address;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Asset asset = this.asset;
        int hashCode6 = (hashCode5 + (asset != null ? asset.hashCode() : 0)) * 37;
        String str3 = this.gas_fee;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money2 = this.gas_fee_in_fiat;
        int hashCode8 = hashCode7 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(7, false);
        builder.alias_type = this.chain;
        builder.customer_token = this.destination_address;
        builder.alias_value = this.truncated_address;
        builder.updated_at = this.amount;
        builder.linked_at = this.asset;
        builder.hashed_alias_token = this.gas_fee;
        builder.version = this.gas_fee_in_fiat;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Chain chain = this.chain;
        if (chain != null) {
            arrayList.add("chain=" + chain);
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
        Asset asset = this.asset;
        if (asset != null) {
            arrayList.add("asset=" + asset);
        }
        String str3 = this.gas_fee;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "gas_fee=", arrayList);
        }
        Money money2 = this.gas_fee_in_fiat;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("gas_fee_in_fiat=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableNetwork{", "}", 0, null, null, 56);
    }
}
