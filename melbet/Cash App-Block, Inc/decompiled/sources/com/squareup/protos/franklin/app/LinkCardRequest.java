package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.common.KeyedCard;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class LinkCardRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkCardRequest> CREATOR;
    public final KeyedCard card;
    public final CashInstrumentType instrument_type;
    public final Boolean linked_via_nfc;
    public final String ocr_context;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String threeds_return_url;
    public final String transfer_token;
    public final String treatment;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LinkCardRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.LinkCardRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                Object obj2;
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new LinkCardRequest((RequestContext) obj3, (KeyedCard) obj4, m, (String) obj5, (CashInstrumentType) obj6, (String) obj7, (Boolean) obj8, (String) obj9, (String) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 3:
                            obj4 = TransactorKt.decodeMessageOrMerge(KeyedCard.ADAPTER, protoReader, obj4);
                            continue;
                        case 4:
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj5;
                            obj2 = obj6;
                            break;
                        case 5:
                            obj = obj5;
                            obj2 = obj6;
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            try {
                                obj6 = CashInstrumentType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj5;
                                obj2 = obj6;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 9:
                            obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                            continue;
                        case 10:
                            obj8 = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 11:
                            obj9 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 12:
                            obj10 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                    }
                    obj5 = obj;
                    obj6 = obj2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                LinkCardRequest linkCardRequest = (LinkCardRequest) obj;
                reverseProtoWriter.getClass();
                linkCardRequest.getClass();
                reverseProtoWriter.writeBytes(linkCardRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 12, linkCardRequest.threeds_return_url);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 11, linkCardRequest.treatment);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 10, linkCardRequest.linked_via_nfc);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, linkCardRequest.transfer_token);
                CashInstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, linkCardRequest.instrument_type);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, linkCardRequest.ocr_context);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, linkCardRequest.payment_tokens);
                KeyedCard.ADAPTER.encodeWithTag(reverseProtoWriter, 3, linkCardRequest.card);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 9, linkCardRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                LinkCardRequest linkCardRequest = (LinkCardRequest) obj;
                linkCardRequest.getClass();
                int encodedSizeWithTag = KeyedCard.ADAPTER.encodedSizeWithTag(3, linkCardRequest.card) + RequestContext.ADAPTER.encodedSizeWithTag(9, linkCardRequest.request_context) + linkCardRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(12, linkCardRequest.threeds_return_url) + protoAdapter2.encodedSizeWithTag(11, linkCardRequest.treatment) + ProtoAdapter.BOOL.encodedSizeWithTag(10, linkCardRequest.linked_via_nfc) + protoAdapter2.encodedSizeWithTag(8, linkCardRequest.transfer_token) + CashInstrumentType.ADAPTER.encodedSizeWithTag(7, linkCardRequest.instrument_type) + protoAdapter2.encodedSizeWithTag(6, linkCardRequest.ocr_context) + protoAdapter2.asRepeated().encodedSizeWithTag(5, linkCardRequest.payment_tokens) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                LinkCardRequest linkCardRequest = (LinkCardRequest) obj;
                linkCardRequest.getClass();
                RequestContext requestContext = linkCardRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                KeyedCard keyedCard = linkCardRequest.card;
                return LinkCardRequest.copy$default(linkCardRequest, requestContext2, keyedCard != null ? (KeyedCard) KeyedCard.ADAPTER.redact(keyedCard) : null, EmptyList.INSTANCE, ByteString.EMPTY, 472);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                LinkCardRequest linkCardRequest = (LinkCardRequest) obj;
                linkCardRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 9, linkCardRequest.request_context);
                KeyedCard.ADAPTER.encodeWithTag(protoWriter, 3, linkCardRequest.card);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, linkCardRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 6, linkCardRequest.ocr_context);
                CashInstrumentType.ADAPTER.encodeWithTag(protoWriter, 7, linkCardRequest.instrument_type);
                protoAdapter2.encodeWithTag(protoWriter, 8, linkCardRequest.transfer_token);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, linkCardRequest.linked_via_nfc);
                protoAdapter2.encodeWithTag(protoWriter, 11, linkCardRequest.treatment);
                protoAdapter2.encodeWithTag(protoWriter, 12, linkCardRequest.threeds_return_url);
                protoWriter.writeBytes(linkCardRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkCardRequest(RequestContext requestContext, KeyedCard keyedCard, List list, String str, CashInstrumentType cashInstrumentType, String str2, Boolean bool, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.card = keyedCard;
        this.ocr_context = str;
        this.instrument_type = cashInstrumentType;
        this.transfer_token = str2;
        this.linked_via_nfc = bool;
        this.treatment = str3;
        this.threeds_return_url = str4;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.List] */
    public static LinkCardRequest copy$default(LinkCardRequest linkCardRequest, RequestContext requestContext, KeyedCard keyedCard, EmptyList emptyList, ByteString byteString, int i) {
        if ((i & 2) != 0) {
            keyedCard = linkCardRequest.card;
        }
        KeyedCard keyedCard2 = keyedCard;
        EmptyList emptyList2 = (i & 4) != 0 ? linkCardRequest.payment_tokens : emptyList;
        String str = linkCardRequest.ocr_context;
        CashInstrumentType cashInstrumentType = linkCardRequest.instrument_type;
        String str2 = (i & 32) != 0 ? linkCardRequest.transfer_token : null;
        Boolean bool = linkCardRequest.linked_via_nfc;
        String str3 = linkCardRequest.treatment;
        String str4 = linkCardRequest.threeds_return_url;
        ByteString unknownFields = (i & 512) != 0 ? linkCardRequest.unknownFields() : byteString;
        linkCardRequest.getClass();
        emptyList2.getClass();
        unknownFields.getClass();
        return new LinkCardRequest(requestContext, keyedCard2, emptyList2, str, cashInstrumentType, str2, bool, str3, str4, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkCardRequest)) {
            return false;
        }
        LinkCardRequest linkCardRequest = (LinkCardRequest) obj;
        return Intrinsics.areEqual(unknownFields(), linkCardRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, linkCardRequest.request_context) && Intrinsics.areEqual(this.card, linkCardRequest.card) && Intrinsics.areEqual(this.payment_tokens, linkCardRequest.payment_tokens) && Intrinsics.areEqual(this.ocr_context, linkCardRequest.ocr_context) && this.instrument_type == linkCardRequest.instrument_type && Intrinsics.areEqual(this.transfer_token, linkCardRequest.transfer_token) && Intrinsics.areEqual(this.linked_via_nfc, linkCardRequest.linked_via_nfc) && Intrinsics.areEqual(this.treatment, linkCardRequest.treatment) && Intrinsics.areEqual(this.threeds_return_url, linkCardRequest.threeds_return_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        KeyedCard keyedCard = this.card;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (keyedCard != null ? keyedCard.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str = this.ocr_context;
        int hashCode3 = (m + (str != null ? str.hashCode() : 0)) * 37;
        CashInstrumentType cashInstrumentType = this.instrument_type;
        int hashCode4 = (hashCode3 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0)) * 37;
        String str2 = this.transfer_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.linked_via_nfc;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.treatment;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.threeds_return_url;
        int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(5);
        builder.source = this.request_context;
        builder.target = this.card;
        builder.state = this.payment_tokens;
        builder.token = this.ocr_context;
        builder.amount = this.instrument_type;
        builder.push_amount = this.transfer_token;
        builder.created_at = this.linked_via_nfc;
        builder.completed_at = this.treatment;
        builder.failed_at = this.threeds_return_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        KeyedCard keyedCard = this.card;
        if (keyedCard != null) {
            arrayList.add("card=" + keyedCard);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        String str = this.ocr_context;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "ocr_context=", arrayList);
        }
        CashInstrumentType cashInstrumentType = this.instrument_type;
        if (cashInstrumentType != null) {
            arrayList.add("instrument_type=" + cashInstrumentType);
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        Boolean bool = this.linked_via_nfc;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("linked_via_nfc=", bool, arrayList);
        }
        String str2 = this.treatment;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "treatment=", arrayList);
        }
        String str3 = this.threeds_return_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "threeds_return_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkCardRequest{", "}", 0, null, null, 56);
    }
}
