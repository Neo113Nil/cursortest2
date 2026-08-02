package com.squareup.protos.cash.investcustomer.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
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
public final class GetCustomerControlsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerControlsRequest> CREATOR;
    public final String customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetCustomerControlsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.investcustomer.api.v1.GetCustomerControlsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetCustomerControlsRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetCustomerControlsRequest getCustomerControlsRequest = (GetCustomerControlsRequest) obj;
                reverseProtoWriter.getClass();
                getCustomerControlsRequest.getClass();
                reverseProtoWriter.writeBytes(getCustomerControlsRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getCustomerControlsRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetCustomerControlsRequest getCustomerControlsRequest = (GetCustomerControlsRequest) obj;
                getCustomerControlsRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getCustomerControlsRequest.customer_token) + getCustomerControlsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetCustomerControlsRequest getCustomerControlsRequest = (GetCustomerControlsRequest) obj;
                getCustomerControlsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getCustomerControlsRequest.customer_token;
                byteString.getClass();
                return new GetCustomerControlsRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetCustomerControlsRequest getCustomerControlsRequest = (GetCustomerControlsRequest) obj;
                getCustomerControlsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCustomerControlsRequest.customer_token);
                protoWriter.writeBytes(getCustomerControlsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerControlsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerControlsRequest)) {
            return false;
        }
        GetCustomerControlsRequest getCustomerControlsRequest = (GetCustomerControlsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerControlsRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, getCustomerControlsRequest.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(24);
        builder.favorite_customer_token = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerControlsRequest{", "}", 0, null, null, 56);
    }
}
