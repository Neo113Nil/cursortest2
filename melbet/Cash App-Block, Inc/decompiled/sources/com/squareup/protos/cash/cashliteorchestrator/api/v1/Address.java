package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
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
public final class Address extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Address> CREATOR;
    public final String address;
    public final AddressType address_type;
    public final Chain chain;
    public final String customer_token;

    static {
        Address$Companion$ADAPTER$1 address$Companion$ADAPTER$1 = new Address$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Address.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.Address", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/common.proto");
        ADAPTER = address$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(address$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Address(String str, AddressType addressType, String str2, Chain chain, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.address_type = addressType;
        this.address = str2;
        this.chain = chain;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual(unknownFields(), address.unknownFields()) && Intrinsics.areEqual(this.customer_token, address.customer_token) && this.address_type == address.address_type && Intrinsics.areEqual(this.address, address.address) && this.chain == address.chain;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        AddressType addressType = this.address_type;
        int hashCode3 = (hashCode2 + (addressType != null ? addressType.hashCode() : 0)) * 37;
        String str2 = this.address;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Chain chain = this.chain;
        int hashCode5 = hashCode4 + (chain != null ? chain.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(9, false);
        builder.title = this.customer_token;
        builder.icon = this.address_type;
        builder.enabled = this.address;
        builder.id = this.chain;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        AddressType addressType = this.address_type;
        if (addressType != null) {
            arrayList.add("address_type=" + addressType);
        }
        String str2 = this.address;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "address=", arrayList);
        }
        Chain chain = this.chain;
        if (chain != null) {
            arrayList.add("chain=" + chain);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Address{", "}", 0, null, null, 56);
    }
}
