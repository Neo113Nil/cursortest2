package com.squareup.protos.cash.nearby.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.common.signing.SigningData;
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
public final class GetNearbySessionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetNearbySessionRequest> CREATOR;
    public final ByteString nearby_session_uuid;
    public final SigningData signing_data_;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetNearbySessionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.nearby.api.v1.GetNearbySessionRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetNearbySessionRequest((ByteString) obj, (SigningData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag != 1337) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(SigningData.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetNearbySessionRequest getNearbySessionRequest = (GetNearbySessionRequest) obj;
                reverseProtoWriter.getClass();
                getNearbySessionRequest.getClass();
                reverseProtoWriter.writeBytes(getNearbySessionRequest.unknownFields());
                SigningData.ADAPTER.encodeWithTag(reverseProtoWriter, 1337, getNearbySessionRequest.signing_data_);
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, getNearbySessionRequest.nearby_session_uuid);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetNearbySessionRequest getNearbySessionRequest = (GetNearbySessionRequest) obj;
                getNearbySessionRequest.getClass();
                return SigningData.ADAPTER.encodedSizeWithTag(1337, getNearbySessionRequest.signing_data_) + ProtoAdapter.BYTES.encodedSizeWithTag(1, getNearbySessionRequest.nearby_session_uuid) + getNearbySessionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetNearbySessionRequest getNearbySessionRequest = (GetNearbySessionRequest) obj;
                getNearbySessionRequest.getClass();
                SigningData signingData = getNearbySessionRequest.signing_data_;
                SigningData signingData2 = signingData != null ? (SigningData) SigningData.ADAPTER.redact(signingData) : null;
                ByteString byteString = ByteString.EMPTY;
                ByteString byteString2 = getNearbySessionRequest.nearby_session_uuid;
                byteString.getClass();
                return new GetNearbySessionRequest(byteString2, signingData2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetNearbySessionRequest getNearbySessionRequest = (GetNearbySessionRequest) obj;
                getNearbySessionRequest.getClass();
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, getNearbySessionRequest.nearby_session_uuid);
                SigningData.ADAPTER.encodeWithTag(protoWriter, 1337, getNearbySessionRequest.signing_data_);
                protoWriter.writeBytes(getNearbySessionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNearbySessionRequest(ByteString byteString, SigningData signingData, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.nearby_session_uuid = byteString;
        this.signing_data_ = signingData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetNearbySessionRequest)) {
            return false;
        }
        GetNearbySessionRequest getNearbySessionRequest = (GetNearbySessionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getNearbySessionRequest.unknownFields()) && Intrinsics.areEqual(this.nearby_session_uuid, getNearbySessionRequest.nearby_session_uuid) && Intrinsics.areEqual(this.signing_data_, getNearbySessionRequest.signing_data_);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.nearby_session_uuid;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        SigningData signingData = this.signing_data_;
        int hashCode3 = hashCode2 + (signingData != null ? signingData.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(28);
        builder.input_id = this.nearby_session_uuid;
        builder.value = this.signing_data_;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.nearby_session_uuid;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("nearby_session_uuid=", byteString, arrayList);
        }
        SigningData signingData = this.signing_data_;
        if (signingData != null) {
            arrayList.add("signing_data_=" + signingData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNearbySessionRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetNearbySessionRequest(ByteString byteString) {
        this(byteString, null, ByteString.EMPTY);
    }
}
