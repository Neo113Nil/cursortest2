package com.squareup.protos.cash.lynx.api.v1_0;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentScope;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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
public final class CompleteStripeLinkRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompleteStripeLinkRequest> CREATOR;
    public final InstrumentScope instrument_scope;
    public final String instrument_token_to_replace;
    public final RequestContext request_context;
    public final String stripe_account_id;
    public final String stripe_payment_method_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CompleteStripeLinkRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.lynx.api.v1_0.CompleteStripeLinkRequest$Companion$ADAPTER$1
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
                        return new CompleteStripeLinkRequest((String) obj, (String) obj2, (RequestContext) obj3, (String) obj4, (InstrumentScope) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    } else if (nextTag == 5) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 6) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj5 = InstrumentScope.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CompleteStripeLinkRequest completeStripeLinkRequest = (CompleteStripeLinkRequest) obj;
                reverseProtoWriter.getClass();
                completeStripeLinkRequest.getClass();
                reverseProtoWriter.writeBytes(completeStripeLinkRequest.unknownFields());
                InstrumentScope.ADAPTER.encodeWithTag(reverseProtoWriter, 6, completeStripeLinkRequest.instrument_scope);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, completeStripeLinkRequest.instrument_token_to_replace);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, completeStripeLinkRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, completeStripeLinkRequest.stripe_payment_method_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, completeStripeLinkRequest.stripe_account_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CompleteStripeLinkRequest completeStripeLinkRequest = (CompleteStripeLinkRequest) obj;
                completeStripeLinkRequest.getClass();
                int size$okio = completeStripeLinkRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return InstrumentScope.ADAPTER.encodedSizeWithTag(6, completeStripeLinkRequest.instrument_scope) + protoAdapter2.encodedSizeWithTag(5, completeStripeLinkRequest.instrument_token_to_replace) + RequestContext.ADAPTER.encodedSizeWithTag(4, completeStripeLinkRequest.request_context) + protoAdapter2.encodedSizeWithTag(3, completeStripeLinkRequest.stripe_payment_method_id) + protoAdapter2.encodedSizeWithTag(2, completeStripeLinkRequest.stripe_account_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CompleteStripeLinkRequest completeStripeLinkRequest = (CompleteStripeLinkRequest) obj;
                completeStripeLinkRequest.getClass();
                RequestContext requestContext = completeStripeLinkRequest.request_context;
                return CompleteStripeLinkRequest.copy$default(completeStripeLinkRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 27);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CompleteStripeLinkRequest completeStripeLinkRequest = (CompleteStripeLinkRequest) obj;
                completeStripeLinkRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, completeStripeLinkRequest.stripe_account_id);
                protoAdapter2.encodeWithTag(protoWriter, 3, completeStripeLinkRequest.stripe_payment_method_id);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, completeStripeLinkRequest.request_context);
                protoAdapter2.encodeWithTag(protoWriter, 5, completeStripeLinkRequest.instrument_token_to_replace);
                InstrumentScope.ADAPTER.encodeWithTag(protoWriter, 6, completeStripeLinkRequest.instrument_scope);
                protoWriter.writeBytes(completeStripeLinkRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteStripeLinkRequest(String str, String str2, RequestContext requestContext, String str3, InstrumentScope instrumentScope, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.stripe_account_id = str;
        this.stripe_payment_method_id = str2;
        this.request_context = requestContext;
        this.instrument_token_to_replace = str3;
        this.instrument_scope = instrumentScope;
    }

    public static CompleteStripeLinkRequest copy$default(CompleteStripeLinkRequest completeStripeLinkRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = completeStripeLinkRequest.stripe_account_id;
        String str2 = completeStripeLinkRequest.stripe_payment_method_id;
        String str3 = completeStripeLinkRequest.instrument_token_to_replace;
        InstrumentScope instrumentScope = completeStripeLinkRequest.instrument_scope;
        if ((i & 32) != 0) {
            byteString = completeStripeLinkRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        completeStripeLinkRequest.getClass();
        byteString2.getClass();
        return new CompleteStripeLinkRequest(str, str2, requestContext, str3, instrumentScope, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteStripeLinkRequest)) {
            return false;
        }
        CompleteStripeLinkRequest completeStripeLinkRequest = (CompleteStripeLinkRequest) obj;
        return Intrinsics.areEqual(unknownFields(), completeStripeLinkRequest.unknownFields()) && Intrinsics.areEqual(this.stripe_account_id, completeStripeLinkRequest.stripe_account_id) && Intrinsics.areEqual(this.stripe_payment_method_id, completeStripeLinkRequest.stripe_payment_method_id) && Intrinsics.areEqual(this.request_context, completeStripeLinkRequest.request_context) && Intrinsics.areEqual(this.instrument_token_to_replace, completeStripeLinkRequest.instrument_token_to_replace) && this.instrument_scope == completeStripeLinkRequest.instrument_scope;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.stripe_account_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.stripe_payment_method_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = (hashCode3 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str3 = this.instrument_token_to_replace;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        InstrumentScope instrumentScope = this.instrument_scope;
        int hashCode6 = hashCode5 + (instrumentScope != null ? instrumentScope.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(15);
        builder.icon = this.stripe_account_id;
        builder.title = this.stripe_payment_method_id;
        builder.subtitle = this.request_context;
        builder.action = this.instrument_token_to_replace;
        builder.icon_background_color = this.instrument_scope;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.stripe_account_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "stripe_account_id=", arrayList);
        }
        String str2 = this.stripe_payment_method_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "stripe_payment_method_id=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str3 = this.instrument_token_to_replace;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_token_to_replace=", arrayList);
        }
        InstrumentScope instrumentScope = this.instrument_scope;
        if (instrumentScope != null) {
            arrayList.add("instrument_scope=" + instrumentScope);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompleteStripeLinkRequest{", "}", 0, null, null, 56);
    }
}
