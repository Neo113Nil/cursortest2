package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateCartRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateCartRequest> CREATOR;
    public final String cart_token;
    public final String cart_version;
    public final CreateCartRequest create_cart_request;
    public final List input_values;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateCartRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.UpdateCartRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateCartRequest((String) obj, (String) obj2, (CreateCartRequest) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(CreateCartRequest.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(InputValue.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateCartRequest updateCartRequest = (UpdateCartRequest) obj;
                reverseProtoWriter.getClass();
                updateCartRequest.getClass();
                reverseProtoWriter.writeBytes(updateCartRequest.unknownFields());
                InputValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, updateCartRequest.input_values);
                CreateCartRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 3, updateCartRequest.create_cart_request);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, updateCartRequest.cart_version);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, updateCartRequest.cart_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateCartRequest updateCartRequest = (UpdateCartRequest) obj;
                updateCartRequest.getClass();
                int size$okio = updateCartRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return InputValue.ADAPTER.asRepeated().encodedSizeWithTag(4, updateCartRequest.input_values) + CreateCartRequest.ADAPTER.encodedSizeWithTag(3, updateCartRequest.create_cart_request) + protoAdapter2.encodedSizeWithTag(2, updateCartRequest.cart_version) + protoAdapter2.encodedSizeWithTag(1, updateCartRequest.cart_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateCartRequest updateCartRequest = (UpdateCartRequest) obj;
                updateCartRequest.getClass();
                CreateCartRequest createCartRequest = updateCartRequest.create_cart_request;
                CreateCartRequest createCartRequest2 = createCartRequest != null ? (CreateCartRequest) CreateCartRequest.ADAPTER.redact(createCartRequest) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(updateCartRequest.input_values, InputValue.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = updateCartRequest.cart_token;
                String str2 = updateCartRequest.cart_version;
                byteString.getClass();
                return new UpdateCartRequest(str, str2, createCartRequest2, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateCartRequest updateCartRequest = (UpdateCartRequest) obj;
                updateCartRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, updateCartRequest.cart_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, updateCartRequest.cart_version);
                CreateCartRequest.ADAPTER.encodeWithTag(protoWriter, 3, updateCartRequest.create_cart_request);
                InputValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, updateCartRequest.input_values);
                protoWriter.writeBytes(updateCartRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCartRequest(String str, String str2, CreateCartRequest createCartRequest, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.cart_token = str;
        this.cart_version = str2;
        this.create_cart_request = createCartRequest;
        this.input_values = TransactorKt.immutableCopyOf("input_values", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateCartRequest)) {
            return false;
        }
        UpdateCartRequest updateCartRequest = (UpdateCartRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateCartRequest.unknownFields()) && Intrinsics.areEqual(this.cart_token, updateCartRequest.cart_token) && Intrinsics.areEqual(this.cart_version, updateCartRequest.cart_version) && Intrinsics.areEqual(this.create_cart_request, updateCartRequest.create_cart_request) && Intrinsics.areEqual(this.input_values, updateCartRequest.input_values);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cart_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cart_version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CreateCartRequest createCartRequest = this.create_cart_request;
        int hashCode4 = this.input_values.hashCode() + ((hashCode3 + (createCartRequest != null ? createCartRequest.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(14);
        builder.id = this.cart_token;
        builder.last_4 = this.cart_version;
        builder.gift_card_id = this.create_cart_request;
        builder.gift_card_amount = this.input_values;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cart_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cart_token=", arrayList);
        }
        String str2 = this.cart_version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cart_version=", arrayList);
        }
        CreateCartRequest createCartRequest = this.create_cart_request;
        if (createCartRequest != null) {
            arrayList.add("create_cart_request=" + createCartRequest);
        }
        List list = this.input_values;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("input_values=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateCartRequest{", "}", 0, null, null, 56);
    }
}
