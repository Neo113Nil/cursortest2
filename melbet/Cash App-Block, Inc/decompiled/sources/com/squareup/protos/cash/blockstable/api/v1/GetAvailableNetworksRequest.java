package com.squareup.protos.cash.blockstable.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
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
public final class GetAvailableNetworksRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAvailableNetworksRequest> CREATOR;
    public final String destination_address_uri;
    public final InputSource input_source;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetAvailableNetworksRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blockstable.api.v1.GetAvailableNetworksRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetAvailableNetworksRequest((String) obj, (InputSource) obj2, (RequestContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = InputSource.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetAvailableNetworksRequest getAvailableNetworksRequest = (GetAvailableNetworksRequest) obj;
                reverseProtoWriter.getClass();
                getAvailableNetworksRequest.getClass();
                reverseProtoWriter.writeBytes(getAvailableNetworksRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getAvailableNetworksRequest.request_context);
                InputSource.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getAvailableNetworksRequest.input_source);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getAvailableNetworksRequest.destination_address_uri);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetAvailableNetworksRequest getAvailableNetworksRequest = (GetAvailableNetworksRequest) obj;
                getAvailableNetworksRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(3, getAvailableNetworksRequest.request_context) + InputSource.ADAPTER.encodedSizeWithTag(2, getAvailableNetworksRequest.input_source) + ProtoAdapter.STRING.encodedSizeWithTag(1, getAvailableNetworksRequest.destination_address_uri) + getAvailableNetworksRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetAvailableNetworksRequest getAvailableNetworksRequest = (GetAvailableNetworksRequest) obj;
                getAvailableNetworksRequest.getClass();
                RequestContext requestContext = getAvailableNetworksRequest.request_context;
                return GetAvailableNetworksRequest.copy$default(getAvailableNetworksRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 3);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetAvailableNetworksRequest getAvailableNetworksRequest = (GetAvailableNetworksRequest) obj;
                getAvailableNetworksRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAvailableNetworksRequest.destination_address_uri);
                InputSource.ADAPTER.encodeWithTag(protoWriter, 2, getAvailableNetworksRequest.input_source);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, getAvailableNetworksRequest.request_context);
                protoWriter.writeBytes(getAvailableNetworksRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableNetworksRequest(String str, InputSource inputSource, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.destination_address_uri = str;
        this.input_source = inputSource;
        this.request_context = requestContext;
    }

    public static GetAvailableNetworksRequest copy$default(GetAvailableNetworksRequest getAvailableNetworksRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = getAvailableNetworksRequest.destination_address_uri;
        InputSource inputSource = getAvailableNetworksRequest.input_source;
        if ((i & 8) != 0) {
            byteString = getAvailableNetworksRequest.unknownFields();
        }
        getAvailableNetworksRequest.getClass();
        byteString.getClass();
        return new GetAvailableNetworksRequest(str, inputSource, requestContext, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAvailableNetworksRequest)) {
            return false;
        }
        GetAvailableNetworksRequest getAvailableNetworksRequest = (GetAvailableNetworksRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getAvailableNetworksRequest.unknownFields()) && Intrinsics.areEqual(this.destination_address_uri, getAvailableNetworksRequest.destination_address_uri) && this.input_source == getAvailableNetworksRequest.input_source && Intrinsics.areEqual(this.request_context, getAvailableNetworksRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.destination_address_uri;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        InputSource inputSource = this.input_source;
        int hashCode3 = (hashCode2 + (inputSource != null ? inputSource.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = hashCode3 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(16);
        builder.header_text = this.destination_address_uri;
        builder.header_button = this.input_source;
        builder.groups = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.destination_address_uri;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "destination_address_uri=", arrayList);
        }
        InputSource inputSource = this.input_source;
        if (inputSource != null) {
            arrayList.add("input_source=" + inputSource);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAvailableNetworksRequest{", "}", 0, null, null, 56);
    }
}
