package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class ShippingAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShippingAddress> CREATOR;
    public final Long created_at;
    public final DeliveryInstructions delivery_instructions;
    public final String email;
    public final FullName full_name;
    public final GlobalAddress global_address;
    public final String id;
    public final Boolean is_default;
    public final String nickname;
    public final Phone phone;
    public final ShippingAddressSource source;
    public final Long updated_at;
    public final AddressVerificationStatus verification_status;

    static {
        ShippingAddress$Companion$ADAPTER$1 shippingAddress$Companion$ADAPTER$1 = new ShippingAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShippingAddress.class), "type.googleapis.com/squareup.cash.grantly.api.ShippingAddress", Syntax.PROTO_2, null, "squareup/cash/grantly/api/shipping_address.proto");
        ADAPTER = shippingAddress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shippingAddress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingAddress(String str, Long l, Long l2, Boolean bool, ShippingAddressSource shippingAddressSource, AddressVerificationStatus addressVerificationStatus, String str2, FullName fullName, GlobalAddress globalAddress, Phone phone, String str3, DeliveryInstructions deliveryInstructions, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.created_at = l;
        this.updated_at = l2;
        this.is_default = bool;
        this.source = shippingAddressSource;
        this.verification_status = addressVerificationStatus;
        this.nickname = str2;
        this.full_name = fullName;
        this.global_address = globalAddress;
        this.phone = phone;
        this.email = str3;
        this.delivery_instructions = deliveryInstructions;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        return Intrinsics.areEqual(unknownFields(), shippingAddress.unknownFields()) && Intrinsics.areEqual(this.id, shippingAddress.id) && Intrinsics.areEqual(this.created_at, shippingAddress.created_at) && Intrinsics.areEqual(this.updated_at, shippingAddress.updated_at) && Intrinsics.areEqual(this.is_default, shippingAddress.is_default) && this.source == shippingAddress.source && this.verification_status == shippingAddress.verification_status && Intrinsics.areEqual(this.nickname, shippingAddress.nickname) && Intrinsics.areEqual(this.full_name, shippingAddress.full_name) && Intrinsics.areEqual(this.global_address, shippingAddress.global_address) && Intrinsics.areEqual(this.phone, shippingAddress.phone) && Intrinsics.areEqual(this.email, shippingAddress.email) && Intrinsics.areEqual(this.delivery_instructions, shippingAddress.delivery_instructions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Boolean bool = this.is_default;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ShippingAddressSource shippingAddressSource = this.source;
        int hashCode6 = (hashCode5 + (shippingAddressSource != null ? shippingAddressSource.hashCode() : 0)) * 37;
        AddressVerificationStatus addressVerificationStatus = this.verification_status;
        int hashCode7 = (hashCode6 + (addressVerificationStatus != null ? addressVerificationStatus.hashCode() : 0)) * 37;
        String str2 = this.nickname;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        FullName fullName = this.full_name;
        int hashCode9 = (hashCode8 + (fullName != null ? fullName.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.global_address;
        int hashCode10 = (hashCode9 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
        Phone phone = this.phone;
        int hashCode11 = (hashCode10 + (phone != null ? phone.hashCode() : 0)) * 37;
        String str3 = this.email;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        DeliveryInstructions deliveryInstructions = this.delivery_instructions;
        int hashCode13 = hashCode12 + (deliveryInstructions != null ? deliveryInstructions.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(8, false);
        builder.string_literal = this.id;
        builder.int_literal = this.created_at;
        builder.key_path_ref = this.updated_at;
        builder.bool_literal = this.is_default;
        builder.float_literal = this.source;
        builder.blob_literal = this.verification_status;
        builder.unary_op = this.nickname;
        builder.binary_op = this.full_name;
        builder.conditional_op = this.global_address;
        builder.filter_op = this.phone;
        builder.collection_literal = this.email;
        builder.format_string_op = this.delivery_instructions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        Boolean bool = this.is_default;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_default=", bool, arrayList);
        }
        ShippingAddressSource shippingAddressSource = this.source;
        if (shippingAddressSource != null) {
            arrayList.add("source=" + shippingAddressSource);
        }
        AddressVerificationStatus addressVerificationStatus = this.verification_status;
        if (addressVerificationStatus != null) {
            arrayList.add("verification_status=" + addressVerificationStatus);
        }
        if (this.nickname != null) {
            arrayList.add("nickname=██");
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.global_address != null) {
            arrayList.add("global_address=██");
        }
        Phone phone = this.phone;
        if (phone != null) {
            arrayList.add("phone=" + phone);
        }
        if (this.email != null) {
            arrayList.add("email=██");
        }
        DeliveryInstructions deliveryInstructions = this.delivery_instructions;
        if (deliveryInstructions != null) {
            arrayList.add("delivery_instructions=" + deliveryInstructions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShippingAddress{", "}", 0, null, null, 56);
    }
}
