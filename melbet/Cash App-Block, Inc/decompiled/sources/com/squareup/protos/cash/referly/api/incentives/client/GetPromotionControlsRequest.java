package com.squareup.protos.cash.referly.api.incentives.client;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.profiles.ProfileDetails;
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
public final class GetPromotionControlsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPromotionControlsRequest> CREATOR;
    public final String teen_customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetPromotionControlsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.referly.api.incentives.client.GetPromotionControlsRequest$Companion$ADAPTER$1
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
                        return new GetPromotionControlsRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetPromotionControlsRequest getPromotionControlsRequest = (GetPromotionControlsRequest) obj;
                reverseProtoWriter.getClass();
                getPromotionControlsRequest.getClass();
                reverseProtoWriter.writeBytes(getPromotionControlsRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getPromotionControlsRequest.teen_customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetPromotionControlsRequest getPromotionControlsRequest = (GetPromotionControlsRequest) obj;
                getPromotionControlsRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getPromotionControlsRequest.teen_customer_token) + getPromotionControlsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetPromotionControlsRequest getPromotionControlsRequest = (GetPromotionControlsRequest) obj;
                getPromotionControlsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getPromotionControlsRequest.teen_customer_token;
                byteString.getClass();
                return new GetPromotionControlsRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetPromotionControlsRequest getPromotionControlsRequest = (GetPromotionControlsRequest) obj;
                getPromotionControlsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPromotionControlsRequest.teen_customer_token);
                protoWriter.writeBytes(getPromotionControlsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPromotionControlsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.teen_customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPromotionControlsRequest)) {
            return false;
        }
        GetPromotionControlsRequest getPromotionControlsRequest = (GetPromotionControlsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getPromotionControlsRequest.unknownFields()) && Intrinsics.areEqual(this.teen_customer_token, getPromotionControlsRequest.teen_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.teen_customer_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(7);
        builder.bio = this.teen_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.teen_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "teen_customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPromotionControlsRequest{", "}", 0, null, null, 56);
    }
}
