package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetAfterpayCheckoutTokensRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAfterpayCheckoutTokensRequest> CREATOR;
    public final String shop_flow_token;
    public final Source source;

    /* loaded from: classes7.dex */
    public enum Source implements WireEnum {
        SOURCE_UNSPECIFIED(0),
        SOURCE_CODE_GREEN(1),
        SOURCE_AP_APPLET(2);

        public static final GetAfterpayCheckoutTokensRequest$Source$Companion$ADAPTER$1 ADAPTER;
        public static final Edge.Companion Companion;
        public final int value;

        static {
            Source source = SOURCE_UNSPECIFIED;
            Companion = new Edge.Companion(19);
            ADAPTER = new GetAfterpayCheckoutTokensRequest$Source$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Source.class), Syntax.PROTO_2, source);
        }

        Source(int i) {
            this.value = i;
        }

        public static final Source fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SOURCE_UNSPECIFIED;
            }
            if (i == 1) {
                return SOURCE_CODE_GREEN;
            }
            if (i != 2) {
                return null;
            }
            return SOURCE_AP_APPLET;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetAfterpayCheckoutTokensRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensRequest$Companion$ADAPTER$1
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
                        return new GetAfterpayCheckoutTokensRequest((String) obj, (GetAfterpayCheckoutTokensRequest.Source) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = GetAfterpayCheckoutTokensRequest.Source.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetAfterpayCheckoutTokensRequest getAfterpayCheckoutTokensRequest = (GetAfterpayCheckoutTokensRequest) obj;
                reverseProtoWriter.getClass();
                getAfterpayCheckoutTokensRequest.getClass();
                reverseProtoWriter.writeBytes(getAfterpayCheckoutTokensRequest.unknownFields());
                GetAfterpayCheckoutTokensRequest.Source.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getAfterpayCheckoutTokensRequest.source);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getAfterpayCheckoutTokensRequest.shop_flow_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetAfterpayCheckoutTokensRequest getAfterpayCheckoutTokensRequest = (GetAfterpayCheckoutTokensRequest) obj;
                getAfterpayCheckoutTokensRequest.getClass();
                return GetAfterpayCheckoutTokensRequest.Source.ADAPTER.encodedSizeWithTag(2, getAfterpayCheckoutTokensRequest.source) + ProtoAdapter.STRING.encodedSizeWithTag(1, getAfterpayCheckoutTokensRequest.shop_flow_token) + getAfterpayCheckoutTokensRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetAfterpayCheckoutTokensRequest getAfterpayCheckoutTokensRequest = (GetAfterpayCheckoutTokensRequest) obj;
                getAfterpayCheckoutTokensRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getAfterpayCheckoutTokensRequest.shop_flow_token;
                GetAfterpayCheckoutTokensRequest.Source source = getAfterpayCheckoutTokensRequest.source;
                byteString.getClass();
                return new GetAfterpayCheckoutTokensRequest(str, source, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetAfterpayCheckoutTokensRequest getAfterpayCheckoutTokensRequest = (GetAfterpayCheckoutTokensRequest) obj;
                getAfterpayCheckoutTokensRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAfterpayCheckoutTokensRequest.shop_flow_token);
                GetAfterpayCheckoutTokensRequest.Source.ADAPTER.encodeWithTag(protoWriter, 2, getAfterpayCheckoutTokensRequest.source);
                protoWriter.writeBytes(getAfterpayCheckoutTokensRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ GetAfterpayCheckoutTokensRequest(String str, int i) {
        this(str, (i & 2) != 0 ? null : Source.SOURCE_AP_APPLET, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAfterpayCheckoutTokensRequest)) {
            return false;
        }
        GetAfterpayCheckoutTokensRequest getAfterpayCheckoutTokensRequest = (GetAfterpayCheckoutTokensRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getAfterpayCheckoutTokensRequest.unknownFields()) && Intrinsics.areEqual(this.shop_flow_token, getAfterpayCheckoutTokensRequest.shop_flow_token) && this.source == getAfterpayCheckoutTokensRequest.source;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.shop_flow_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Source source = this.source;
        int hashCode3 = hashCode2 + (source != null ? source.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(10);
        builder.errors = this.shop_flow_token;
        builder.result = this.source;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.shop_flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "shop_flow_token=", arrayList);
        }
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAfterpayCheckoutTokensRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAfterpayCheckoutTokensRequest(String str, Source source, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.shop_flow_token = str;
        this.source = source;
    }
}
