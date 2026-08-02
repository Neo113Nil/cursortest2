package com.squareup.protos.cash.grantly.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.RequestMetadata;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.grantly.api.DeliveryInstructions;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateShippingAddressRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateShippingAddressRequest> CREATOR;
    public final String customer_id;
    public final RequestMetadata metadata;
    public final RequestContext request_context;
    public final ShippingAddress shipping_address;
    public final String shipping_address_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateShippingAddressRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateShippingAddressRequest((RequestMetadata) obj, (String) obj2, (String) obj3, (UpdateShippingAddressRequest.ShippingAddress) obj4, (RequestContext) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestMetadata.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj4 = TransactorKt.decodeMessageOrMerge(UpdateShippingAddressRequest.ShippingAddress.ADAPTER, protoReader, obj4);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj5);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateShippingAddressRequest updateShippingAddressRequest = (UpdateShippingAddressRequest) obj;
                reverseProtoWriter.getClass();
                updateShippingAddressRequest.getClass();
                reverseProtoWriter.writeBytes(updateShippingAddressRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, updateShippingAddressRequest.request_context);
                UpdateShippingAddressRequest.ShippingAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 4, updateShippingAddressRequest.shipping_address);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, updateShippingAddressRequest.shipping_address_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, updateShippingAddressRequest.customer_id);
                RequestMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateShippingAddressRequest.metadata);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateShippingAddressRequest updateShippingAddressRequest = (UpdateShippingAddressRequest) obj;
                updateShippingAddressRequest.getClass();
                int encodedSizeWithTag = RequestMetadata.ADAPTER.encodedSizeWithTag(1, updateShippingAddressRequest.metadata) + updateShippingAddressRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(5, updateShippingAddressRequest.request_context) + UpdateShippingAddressRequest.ShippingAddress.ADAPTER.encodedSizeWithTag(4, updateShippingAddressRequest.shipping_address) + protoAdapter2.encodedSizeWithTag(3, updateShippingAddressRequest.shipping_address_id) + protoAdapter2.encodedSizeWithTag(2, updateShippingAddressRequest.customer_id) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateShippingAddressRequest updateShippingAddressRequest = (UpdateShippingAddressRequest) obj;
                updateShippingAddressRequest.getClass();
                RequestMetadata requestMetadata = updateShippingAddressRequest.metadata;
                RequestMetadata requestMetadata2 = requestMetadata != null ? (RequestMetadata) RequestMetadata.ADAPTER.redact(requestMetadata) : null;
                UpdateShippingAddressRequest.ShippingAddress shippingAddress = updateShippingAddressRequest.shipping_address;
                UpdateShippingAddressRequest.ShippingAddress shippingAddress2 = shippingAddress != null ? (UpdateShippingAddressRequest.ShippingAddress) UpdateShippingAddressRequest.ShippingAddress.ADAPTER.redact(shippingAddress) : null;
                RequestContext requestContext = updateShippingAddressRequest.request_context;
                return UpdateShippingAddressRequest.copy$default(updateShippingAddressRequest, requestMetadata2, shippingAddress2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateShippingAddressRequest updateShippingAddressRequest = (UpdateShippingAddressRequest) obj;
                updateShippingAddressRequest.getClass();
                RequestMetadata.ADAPTER.encodeWithTag(protoWriter, 1, updateShippingAddressRequest.metadata);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, updateShippingAddressRequest.customer_id);
                protoAdapter2.encodeWithTag(protoWriter, 3, updateShippingAddressRequest.shipping_address_id);
                UpdateShippingAddressRequest.ShippingAddress.ADAPTER.encodeWithTag(protoWriter, 4, updateShippingAddressRequest.shipping_address);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 5, updateShippingAddressRequest.request_context);
                protoWriter.writeBytes(updateShippingAddressRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateShippingAddressRequest(RequestMetadata requestMetadata, String str, String str2, ShippingAddress shippingAddress, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = requestMetadata;
        this.customer_id = str;
        this.shipping_address_id = str2;
        this.shipping_address = shippingAddress;
        this.request_context = requestContext;
    }

    public static UpdateShippingAddressRequest copy$default(UpdateShippingAddressRequest updateShippingAddressRequest, RequestMetadata requestMetadata, ShippingAddress shippingAddress, RequestContext requestContext, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            requestMetadata = updateShippingAddressRequest.metadata;
        }
        RequestMetadata requestMetadata2 = requestMetadata;
        String str = updateShippingAddressRequest.customer_id;
        String str2 = updateShippingAddressRequest.shipping_address_id;
        if ((i & 8) != 0) {
            shippingAddress = updateShippingAddressRequest.shipping_address;
        }
        ShippingAddress shippingAddress2 = shippingAddress;
        if ((i & 32) != 0) {
            byteString = updateShippingAddressRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        updateShippingAddressRequest.getClass();
        byteString2.getClass();
        return new UpdateShippingAddressRequest(requestMetadata2, str, str2, shippingAddress2, requestContext, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateShippingAddressRequest)) {
            return false;
        }
        UpdateShippingAddressRequest updateShippingAddressRequest = (UpdateShippingAddressRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateShippingAddressRequest.unknownFields()) && Intrinsics.areEqual(this.metadata, updateShippingAddressRequest.metadata) && Intrinsics.areEqual(this.customer_id, updateShippingAddressRequest.customer_id) && Intrinsics.areEqual(this.shipping_address_id, updateShippingAddressRequest.shipping_address_id) && Intrinsics.areEqual(this.shipping_address, updateShippingAddressRequest.shipping_address) && Intrinsics.areEqual(this.request_context, updateShippingAddressRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestMetadata requestMetadata = this.metadata;
        int hashCode2 = (hashCode + (requestMetadata != null ? requestMetadata.hashCode() : 0)) * 37;
        String str = this.customer_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.shipping_address_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ShippingAddress shippingAddress = this.shipping_address;
        int hashCode5 = (hashCode4 + (shippingAddress != null ? shippingAddress.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode6 = hashCode5 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(14);
        builder.text_style = this.metadata;
        builder.text = this.customer_id;
        builder.text_decoration = this.shipping_address_id;
        builder.text_color = this.shipping_address;
        builder.icon = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestMetadata requestMetadata = this.metadata;
        if (requestMetadata != null) {
            arrayList.add("metadata=" + requestMetadata);
        }
        String str = this.customer_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_id=", arrayList);
        }
        String str2 = this.shipping_address_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shipping_address_id=", arrayList);
        }
        ShippingAddress shippingAddress = this.shipping_address;
        if (shippingAddress != null) {
            arrayList.add("shipping_address=" + shippingAddress);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateShippingAddressRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ UpdateShippingAddressRequest(String str, String str2, ShippingAddress shippingAddress) {
        this(null, str, str2, shippingAddress, null, ByteString.EMPTY);
    }

    /* loaded from: classes7.dex */
    public final class ShippingAddress extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShippingAddress> CREATOR;
        public final DeliveryInstructions delivery_instructions;
        public final String email;
        public final FullName full_name;
        public final GlobalAddress global_address;
        public final String nickname;
        public final Phone phone;
        public final ShippingAddressSource source;

        static {
            UpdateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1 updateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1 = new UpdateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShippingAddress.class), "type.googleapis.com/squareup.cash.grantly.app.UpdateShippingAddressRequest.ShippingAddress", Syntax.PROTO_2, null, "squareup/cash/grantly/app/shipping_address_service.proto");
            ADAPTER = updateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(updateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingAddress(ShippingAddressSource shippingAddressSource, String str, FullName fullName, GlobalAddress globalAddress, Phone phone, String str2, DeliveryInstructions deliveryInstructions, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.source = shippingAddressSource;
            this.nickname = str;
            this.full_name = fullName;
            this.global_address = globalAddress;
            this.phone = phone;
            this.email = str2;
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
            return Intrinsics.areEqual(unknownFields(), shippingAddress.unknownFields()) && this.source == shippingAddress.source && Intrinsics.areEqual(this.nickname, shippingAddress.nickname) && Intrinsics.areEqual(this.full_name, shippingAddress.full_name) && Intrinsics.areEqual(this.global_address, shippingAddress.global_address) && Intrinsics.areEqual(this.phone, shippingAddress.phone) && Intrinsics.areEqual(this.email, shippingAddress.email) && Intrinsics.areEqual(this.delivery_instructions, shippingAddress.delivery_instructions);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ShippingAddressSource shippingAddressSource = this.source;
            int hashCode2 = (hashCode + (shippingAddressSource != null ? shippingAddressSource.hashCode() : 0)) * 37;
            String str = this.nickname;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            FullName fullName = this.full_name;
            int hashCode4 = (hashCode3 + (fullName != null ? fullName.hashCode() : 0)) * 37;
            GlobalAddress globalAddress = this.global_address;
            int hashCode5 = (hashCode4 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
            Phone phone = this.phone;
            int hashCode6 = (hashCode5 + (phone != null ? phone.hashCode() : 0)) * 37;
            String str2 = this.email;
            int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
            DeliveryInstructions deliveryInstructions = this.delivery_instructions;
            int hashCode8 = hashCode7 + (deliveryInstructions != null ? deliveryInstructions.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ContactAlias.Builder builder = new ContactAlias.Builder(27, false);
            builder.hashed_alias_token = this.source;
            builder.customer_token = this.nickname;
            builder.alias_type = this.full_name;
            builder.updated_at = this.global_address;
            builder.linked_at = this.phone;
            builder.alias_value = this.email;
            builder.version = this.delivery_instructions;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ShippingAddressSource shippingAddressSource = this.source;
            if (shippingAddressSource != null) {
                arrayList.add("source=" + shippingAddressSource);
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

        public /* synthetic */ ShippingAddress(FullName fullName, GlobalAddress globalAddress, Phone phone, String str) {
            this(ShippingAddressSource.COMMERCE_BROWSER, null, fullName, globalAddress, phone, str, null, ByteString.EMPTY);
        }
    }
}
