package com.squareup.protos.franklin.persona;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.person.Alias;
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
public final class ResolvePersonaDidvBlockerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResolvePersonaDidvBlockerRequest> CREATOR;
    public final String debug_message;
    public final String inquiry_id;
    public final InquiryResponse inquiry_response;
    public final Boolean is_fallback;
    public final RequestContext request_context;
    public final String session_token;
    public final String status;

    /* loaded from: classes8.dex */
    public enum InquiryResponse implements WireEnum {
        ERROR(1),
        CANCEL(2),
        COMPLETE(3);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final ResolvePersonaDidvBlockerRequest$InquiryResponse$Companion$ADAPTER$1 ADAPTER = new ResolvePersonaDidvBlockerRequest$InquiryResponse$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InquiryResponse.class), Syntax.PROTO_2, null);

        InquiryResponse(int i) {
            this.value = i;
        }

        public static final InquiryResponse fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ERROR;
            }
            if (i == 2) {
                return CANCEL;
            }
            if (i != 3) {
                return null;
            }
            return COMPLETE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ResolvePersonaDidvBlockerRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest$Companion$ADAPTER$1
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
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ResolvePersonaDidvBlockerRequest((RequestContext) obj, (ResolvePersonaDidvBlockerRequest.InquiryResponse) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 2:
                            try {
                                obj2 = ResolvePersonaDidvBlockerRequest.InquiryResponse.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest = (ResolvePersonaDidvBlockerRequest) obj;
                reverseProtoWriter.getClass();
                resolvePersonaDidvBlockerRequest.getClass();
                reverseProtoWriter.writeBytes(resolvePersonaDidvBlockerRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, resolvePersonaDidvBlockerRequest.is_fallback);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, resolvePersonaDidvBlockerRequest.debug_message);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, resolvePersonaDidvBlockerRequest.session_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, resolvePersonaDidvBlockerRequest.status);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, resolvePersonaDidvBlockerRequest.inquiry_id);
                ResolvePersonaDidvBlockerRequest.InquiryResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, resolvePersonaDidvBlockerRequest.inquiry_response);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, resolvePersonaDidvBlockerRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest = (ResolvePersonaDidvBlockerRequest) obj;
                resolvePersonaDidvBlockerRequest.getClass();
                int encodedSizeWithTag = ResolvePersonaDidvBlockerRequest.InquiryResponse.ADAPTER.encodedSizeWithTag(2, resolvePersonaDidvBlockerRequest.inquiry_response) + RequestContext.ADAPTER.encodedSizeWithTag(1, resolvePersonaDidvBlockerRequest.request_context) + resolvePersonaDidvBlockerRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BOOL.encodedSizeWithTag(7, resolvePersonaDidvBlockerRequest.is_fallback) + protoAdapter2.encodedSizeWithTag(6, resolvePersonaDidvBlockerRequest.debug_message) + protoAdapter2.encodedSizeWithTag(5, resolvePersonaDidvBlockerRequest.session_token) + protoAdapter2.encodedSizeWithTag(4, resolvePersonaDidvBlockerRequest.status) + protoAdapter2.encodedSizeWithTag(3, resolvePersonaDidvBlockerRequest.inquiry_id) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest = (ResolvePersonaDidvBlockerRequest) obj;
                resolvePersonaDidvBlockerRequest.getClass();
                RequestContext requestContext = resolvePersonaDidvBlockerRequest.request_context;
                return ResolvePersonaDidvBlockerRequest.copy$default(resolvePersonaDidvBlockerRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest = (ResolvePersonaDidvBlockerRequest) obj;
                resolvePersonaDidvBlockerRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, resolvePersonaDidvBlockerRequest.request_context);
                ResolvePersonaDidvBlockerRequest.InquiryResponse.ADAPTER.encodeWithTag(protoWriter, 2, resolvePersonaDidvBlockerRequest.inquiry_response);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, resolvePersonaDidvBlockerRequest.inquiry_id);
                protoAdapter2.encodeWithTag(protoWriter, 4, resolvePersonaDidvBlockerRequest.status);
                protoAdapter2.encodeWithTag(protoWriter, 5, resolvePersonaDidvBlockerRequest.session_token);
                protoAdapter2.encodeWithTag(protoWriter, 6, resolvePersonaDidvBlockerRequest.debug_message);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, resolvePersonaDidvBlockerRequest.is_fallback);
                protoWriter.writeBytes(resolvePersonaDidvBlockerRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolvePersonaDidvBlockerRequest(RequestContext requestContext, InquiryResponse inquiryResponse, String str, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.inquiry_response = inquiryResponse;
        this.inquiry_id = str;
        this.status = str2;
        this.session_token = str3;
        this.debug_message = str4;
        this.is_fallback = bool;
    }

    public static ResolvePersonaDidvBlockerRequest copy$default(ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest, RequestContext requestContext, ByteString byteString, int i) {
        InquiryResponse inquiryResponse = resolvePersonaDidvBlockerRequest.inquiry_response;
        String str = resolvePersonaDidvBlockerRequest.inquiry_id;
        String str2 = resolvePersonaDidvBlockerRequest.status;
        String str3 = resolvePersonaDidvBlockerRequest.session_token;
        String str4 = resolvePersonaDidvBlockerRequest.debug_message;
        Boolean bool = resolvePersonaDidvBlockerRequest.is_fallback;
        if ((i & 128) != 0) {
            byteString = resolvePersonaDidvBlockerRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        resolvePersonaDidvBlockerRequest.getClass();
        byteString2.getClass();
        return new ResolvePersonaDidvBlockerRequest(requestContext, inquiryResponse, str, str2, str3, str4, bool, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResolvePersonaDidvBlockerRequest)) {
            return false;
        }
        ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest = (ResolvePersonaDidvBlockerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), resolvePersonaDidvBlockerRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, resolvePersonaDidvBlockerRequest.request_context) && this.inquiry_response == resolvePersonaDidvBlockerRequest.inquiry_response && Intrinsics.areEqual(this.inquiry_id, resolvePersonaDidvBlockerRequest.inquiry_id) && Intrinsics.areEqual(this.status, resolvePersonaDidvBlockerRequest.status) && Intrinsics.areEqual(this.session_token, resolvePersonaDidvBlockerRequest.session_token) && Intrinsics.areEqual(this.debug_message, resolvePersonaDidvBlockerRequest.debug_message) && Intrinsics.areEqual(this.is_fallback, resolvePersonaDidvBlockerRequest.is_fallback);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        InquiryResponse inquiryResponse = this.inquiry_response;
        int hashCode3 = (hashCode2 + (inquiryResponse != null ? inquiryResponse.hashCode() : 0)) * 37;
        String str = this.inquiry_id;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.status;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.session_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.debug_message;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.is_fallback;
        int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(16, false);
        builder.f1407type = this.request_context;
        builder.first_verified_at_ms = this.inquiry_response;
        builder.scope = this.inquiry_id;
        builder.value = this.status;
        builder.last_verified_at_ms = this.session_token;
        builder.created_at = this.debug_message;
        builder.updated_at = this.is_fallback;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        InquiryResponse inquiryResponse = this.inquiry_response;
        if (inquiryResponse != null) {
            arrayList.add("inquiry_response=" + inquiryResponse);
        }
        String str = this.inquiry_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "inquiry_id=", arrayList);
        }
        String str2 = this.status;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "status=", arrayList);
        }
        String str3 = this.session_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "session_token=", arrayList);
        }
        String str4 = this.debug_message;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "debug_message=", arrayList);
        }
        Boolean bool = this.is_fallback;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_fallback=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResolvePersonaDidvBlockerRequest{", "}", 0, null, null, 56);
    }
}
