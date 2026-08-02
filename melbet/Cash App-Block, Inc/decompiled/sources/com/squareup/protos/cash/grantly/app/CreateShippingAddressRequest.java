package com.squareup.protos.cash.grantly.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.RequestMetadata;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.DeliveryInstructions;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
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
public final class CreateShippingAddressRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateShippingAddressRequest> CREATOR;
    public final String idempotency_key;
    public final RequestMetadata metadata;
    public final RequestContext request_context;
    public final ShippingAddress shipping_address;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreateShippingAddressRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CreateShippingAddressRequest((RequestMetadata) obj, (String) obj2, (CreateShippingAddressRequest.ShippingAddress) obj3, (RequestContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestMetadata.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(CreateShippingAddressRequest.ShippingAddress.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreateShippingAddressRequest createShippingAddressRequest = (CreateShippingAddressRequest) obj;
                reverseProtoWriter.getClass();
                createShippingAddressRequest.getClass();
                reverseProtoWriter.writeBytes(createShippingAddressRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, createShippingAddressRequest.request_context);
                CreateShippingAddressRequest.ShippingAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 3, createShippingAddressRequest.shipping_address);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, createShippingAddressRequest.idempotency_key);
                RequestMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createShippingAddressRequest.metadata);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CreateShippingAddressRequest createShippingAddressRequest = (CreateShippingAddressRequest) obj;
                createShippingAddressRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(4, createShippingAddressRequest.request_context) + CreateShippingAddressRequest.ShippingAddress.ADAPTER.encodedSizeWithTag(3, createShippingAddressRequest.shipping_address) + ProtoAdapter.STRING.encodedSizeWithTag(2, createShippingAddressRequest.idempotency_key) + RequestMetadata.ADAPTER.encodedSizeWithTag(1, createShippingAddressRequest.metadata) + createShippingAddressRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreateShippingAddressRequest createShippingAddressRequest = (CreateShippingAddressRequest) obj;
                createShippingAddressRequest.getClass();
                RequestMetadata requestMetadata = createShippingAddressRequest.metadata;
                RequestMetadata requestMetadata2 = requestMetadata != null ? (RequestMetadata) RequestMetadata.ADAPTER.redact(requestMetadata) : null;
                CreateShippingAddressRequest.ShippingAddress shippingAddress = createShippingAddressRequest.shipping_address;
                CreateShippingAddressRequest.ShippingAddress shippingAddress2 = shippingAddress != null ? (CreateShippingAddressRequest.ShippingAddress) CreateShippingAddressRequest.ShippingAddress.ADAPTER.redact(shippingAddress) : null;
                RequestContext requestContext = createShippingAddressRequest.request_context;
                return CreateShippingAddressRequest.copy$default(createShippingAddressRequest, requestMetadata2, shippingAddress2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreateShippingAddressRequest createShippingAddressRequest = (CreateShippingAddressRequest) obj;
                createShippingAddressRequest.getClass();
                RequestMetadata.ADAPTER.encodeWithTag(protoWriter, 1, createShippingAddressRequest.metadata);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createShippingAddressRequest.idempotency_key);
                CreateShippingAddressRequest.ShippingAddress.ADAPTER.encodeWithTag(protoWriter, 3, createShippingAddressRequest.shipping_address);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, createShippingAddressRequest.request_context);
                protoWriter.writeBytes(createShippingAddressRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShippingAddressRequest(RequestMetadata requestMetadata, String str, ShippingAddress shippingAddress, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = requestMetadata;
        this.idempotency_key = str;
        this.shipping_address = shippingAddress;
        this.request_context = requestContext;
    }

    public static CreateShippingAddressRequest copy$default(CreateShippingAddressRequest createShippingAddressRequest, RequestMetadata requestMetadata, ShippingAddress shippingAddress, RequestContext requestContext, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            requestMetadata = createShippingAddressRequest.metadata;
        }
        RequestMetadata requestMetadata2 = requestMetadata;
        String str = createShippingAddressRequest.idempotency_key;
        if ((i & 4) != 0) {
            shippingAddress = createShippingAddressRequest.shipping_address;
        }
        ShippingAddress shippingAddress2 = shippingAddress;
        if ((i & 16) != 0) {
            byteString = createShippingAddressRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        createShippingAddressRequest.getClass();
        byteString2.getClass();
        return new CreateShippingAddressRequest(requestMetadata2, str, shippingAddress2, requestContext, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateShippingAddressRequest)) {
            return false;
        }
        CreateShippingAddressRequest createShippingAddressRequest = (CreateShippingAddressRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createShippingAddressRequest.unknownFields()) && Intrinsics.areEqual(this.metadata, createShippingAddressRequest.metadata) && Intrinsics.areEqual(this.idempotency_key, createShippingAddressRequest.idempotency_key) && Intrinsics.areEqual(this.shipping_address, createShippingAddressRequest.shipping_address) && Intrinsics.areEqual(this.request_context, createShippingAddressRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestMetadata requestMetadata = this.metadata;
        int hashCode2 = (hashCode + (requestMetadata != null ? requestMetadata.hashCode() : 0)) * 37;
        String str = this.idempotency_key;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ShippingAddress shippingAddress = this.shipping_address;
        int hashCode4 = (hashCode3 + (shippingAddress != null ? shippingAddress.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = hashCode4 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(20, false);
        builder.last_four_digits = this.metadata;
        builder.postal_code = this.idempotency_key;
        builder.expiration = this.shipping_address;
        builder.ciphertext_ = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestMetadata requestMetadata = this.metadata;
        if (requestMetadata != null) {
            arrayList.add("metadata=" + requestMetadata);
        }
        String str = this.idempotency_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotency_key=", arrayList);
        }
        ShippingAddress shippingAddress = this.shipping_address;
        if (shippingAddress != null) {
            arrayList.add("shipping_address=" + shippingAddress);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateShippingAddressRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CreateShippingAddressRequest(String str, ShippingAddress shippingAddress) {
        this(null, str, shippingAddress, null, ByteString.EMPTY);
    }

    /* loaded from: classes7.dex */
    public final class ShippingAddress extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShippingAddress> CREATOR;
        public final String customer_id;
        public final DeliveryInstructions delivery_instructions;
        public final String email;
        public final FullName full_name;
        public final GlobalAddress global_address;
        public final String nickname;
        public final Phone phone;
        public final ShippingAddressSource source;

        static {
            CreateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1 createShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1 = new CreateShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShippingAddress.class), "type.googleapis.com/squareup.cash.grantly.app.CreateShippingAddressRequest.ShippingAddress", Syntax.PROTO_2, null, "squareup/cash/grantly/app/shipping_address_service.proto");
            ADAPTER = createShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createShippingAddressRequest$ShippingAddress$Companion$ADAPTER$1);
        }

        public /* synthetic */ ShippingAddress(String str, FullName fullName, GlobalAddress globalAddress, Phone phone, String str2, int i) {
            this((i & 1) != 0 ? null : str, ShippingAddressSource.COMMERCE_BROWSER, null, fullName, globalAddress, (i & 32) != 0 ? null : phone, (i & 64) != 0 ? null : str2, null, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShippingAddress)) {
                return false;
            }
            ShippingAddress shippingAddress = (ShippingAddress) obj;
            return Intrinsics.areEqual(unknownFields(), shippingAddress.unknownFields()) && Intrinsics.areEqual(this.customer_id, shippingAddress.customer_id) && this.source == shippingAddress.source && Intrinsics.areEqual(this.nickname, shippingAddress.nickname) && Intrinsics.areEqual(this.full_name, shippingAddress.full_name) && Intrinsics.areEqual(this.global_address, shippingAddress.global_address) && Intrinsics.areEqual(this.phone, shippingAddress.phone) && Intrinsics.areEqual(this.email, shippingAddress.email) && Intrinsics.areEqual(this.delivery_instructions, shippingAddress.delivery_instructions);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.customer_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ShippingAddressSource shippingAddressSource = this.source;
            int hashCode3 = (hashCode2 + (shippingAddressSource != null ? shippingAddressSource.hashCode() : 0)) * 37;
            String str2 = this.nickname;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            FullName fullName = this.full_name;
            int hashCode5 = (hashCode4 + (fullName != null ? fullName.hashCode() : 0)) * 37;
            GlobalAddress globalAddress = this.global_address;
            int hashCode6 = (hashCode5 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
            Phone phone = this.phone;
            int hashCode7 = (hashCode6 + (phone != null ? phone.hashCode() : 0)) * 37;
            String str3 = this.email;
            int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
            DeliveryInstructions deliveryInstructions = this.delivery_instructions;
            int hashCode9 = hashCode8 + (deliveryInstructions != null ? deliveryInstructions.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Badge.Builder builder = new Badge.Builder(27, false);
            builder.external_token = this.customer_id;
            builder.external_version = this.source;
            builder.customer_token = this.nickname;
            builder.updated_at = this.full_name;
            builder.created_at = this.global_address;
            builder.is_badged = this.phone;
            builder.item_type = this.email;
            builder.count_groups = this.delivery_instructions;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.customer_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_id=", arrayList);
            }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShippingAddress(String str, ShippingAddressSource shippingAddressSource, String str2, FullName fullName, GlobalAddress globalAddress, Phone phone, String str3, DeliveryInstructions deliveryInstructions, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.customer_id = str;
            this.source = shippingAddressSource;
            this.nickname = str2;
            this.full_name = fullName;
            this.global_address = globalAddress;
            this.phone = phone;
            this.email = str3;
            this.delivery_instructions = deliveryInstructions;
        }
    }
}
