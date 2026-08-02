package com.squareup.protos.cash.cryptoinvestflow.service;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
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
public final class InitiateInstrumentSelectionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateInstrumentSelectionRequest> CREATOR;
    public final Boolean allow_plaid_linked_bank_account;
    public final Long preselected_external_instrument_amount_usd_cents;
    public final String preselected_external_instrument_token;
    public final Long preselected_restricted_balance_amount_usd_cents;
    public final String preselected_restricted_balance_token;
    public final Long preselected_unrestricted_balance_amount_usd_cents;
    public final String preselected_unrestricted_balance_token;
    public final RequestContext request_context;
    public final Long total_amount_usd_cents;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateInstrumentSelectionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cryptoinvestflow.service.InitiateInstrumentSelectionRequest$Companion$ADAPTER$1
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
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InitiateInstrumentSelectionRequest((String) obj, (Long) obj2, (String) obj3, (Long) obj4, (String) obj5, (Long) obj6, (Long) obj7, (RequestContext) obj8, (Boolean) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj7 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            obj8 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj8);
                            break;
                        case 4:
                            obj2 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj4 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            obj6 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            obj9 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                reverseProtoWriter.getClass();
                initiateInstrumentSelectionRequest.getClass();
                reverseProtoWriter.writeBytes(initiateInstrumentSelectionRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, initiateInstrumentSelectionRequest.allow_plaid_linked_bank_account);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, initiateInstrumentSelectionRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, initiateInstrumentSelectionRequest.total_amount_usd_cents);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, initiateInstrumentSelectionRequest.preselected_restricted_balance_amount_usd_cents);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 7, initiateInstrumentSelectionRequest.preselected_restricted_balance_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, initiateInstrumentSelectionRequest.preselected_unrestricted_balance_amount_usd_cents);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 5, initiateInstrumentSelectionRequest.preselected_unrestricted_balance_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, initiateInstrumentSelectionRequest.preselected_external_instrument_amount_usd_cents);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 1, initiateInstrumentSelectionRequest.preselected_external_instrument_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                int size$okio = initiateInstrumentSelectionRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, initiateInstrumentSelectionRequest.preselected_external_instrument_token) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                return ProtoAdapter.BOOL.encodedSizeWithTag(9, initiateInstrumentSelectionRequest.allow_plaid_linked_bank_account) + RequestContext.ADAPTER.encodedSizeWithTag(3, initiateInstrumentSelectionRequest.request_context) + protoAdapter3.encodedSizeWithTag(2, initiateInstrumentSelectionRequest.total_amount_usd_cents) + protoAdapter3.encodedSizeWithTag(8, initiateInstrumentSelectionRequest.preselected_restricted_balance_amount_usd_cents) + protoAdapter2.encodedSizeWithTag(7, initiateInstrumentSelectionRequest.preselected_restricted_balance_token) + protoAdapter3.encodedSizeWithTag(6, initiateInstrumentSelectionRequest.preselected_unrestricted_balance_amount_usd_cents) + protoAdapter2.encodedSizeWithTag(5, initiateInstrumentSelectionRequest.preselected_unrestricted_balance_token) + protoAdapter3.encodedSizeWithTag(4, initiateInstrumentSelectionRequest.preselected_external_instrument_amount_usd_cents) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                RequestContext requestContext = initiateInstrumentSelectionRequest.request_context;
                return InitiateInstrumentSelectionRequest.copy$default(initiateInstrumentSelectionRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 383);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
                initiateInstrumentSelectionRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, initiateInstrumentSelectionRequest.preselected_external_instrument_token);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(protoWriter, 4, initiateInstrumentSelectionRequest.preselected_external_instrument_amount_usd_cents);
                protoAdapter2.encodeWithTag(protoWriter, 5, initiateInstrumentSelectionRequest.preselected_unrestricted_balance_token);
                protoAdapter3.encodeWithTag(protoWriter, 6, initiateInstrumentSelectionRequest.preselected_unrestricted_balance_amount_usd_cents);
                protoAdapter2.encodeWithTag(protoWriter, 7, initiateInstrumentSelectionRequest.preselected_restricted_balance_token);
                protoAdapter3.encodeWithTag(protoWriter, 8, initiateInstrumentSelectionRequest.preselected_restricted_balance_amount_usd_cents);
                protoAdapter3.encodeWithTag(protoWriter, 2, initiateInstrumentSelectionRequest.total_amount_usd_cents);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, initiateInstrumentSelectionRequest.request_context);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, initiateInstrumentSelectionRequest.allow_plaid_linked_bank_account);
                protoWriter.writeBytes(initiateInstrumentSelectionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateInstrumentSelectionRequest(String str, Long l, String str2, Long l2, String str3, Long l3, Long l4, RequestContext requestContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.preselected_external_instrument_token = str;
        this.preselected_external_instrument_amount_usd_cents = l;
        this.preselected_unrestricted_balance_token = str2;
        this.preselected_unrestricted_balance_amount_usd_cents = l2;
        this.preselected_restricted_balance_token = str3;
        this.preselected_restricted_balance_amount_usd_cents = l3;
        this.total_amount_usd_cents = l4;
        this.request_context = requestContext;
        this.allow_plaid_linked_bank_account = bool;
    }

    public static InitiateInstrumentSelectionRequest copy$default(InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = initiateInstrumentSelectionRequest.preselected_external_instrument_token;
        Long l = initiateInstrumentSelectionRequest.preselected_external_instrument_amount_usd_cents;
        String str2 = initiateInstrumentSelectionRequest.preselected_unrestricted_balance_token;
        Long l2 = initiateInstrumentSelectionRequest.preselected_unrestricted_balance_amount_usd_cents;
        String str3 = initiateInstrumentSelectionRequest.preselected_restricted_balance_token;
        Long l3 = initiateInstrumentSelectionRequest.preselected_restricted_balance_amount_usd_cents;
        Long l4 = initiateInstrumentSelectionRequest.total_amount_usd_cents;
        Boolean bool = initiateInstrumentSelectionRequest.allow_plaid_linked_bank_account;
        if ((i & 512) != 0) {
            byteString = initiateInstrumentSelectionRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        initiateInstrumentSelectionRequest.getClass();
        byteString2.getClass();
        return new InitiateInstrumentSelectionRequest(str, l, str2, l2, str3, l3, l4, requestContext, bool, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateInstrumentSelectionRequest)) {
            return false;
        }
        InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = (InitiateInstrumentSelectionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateInstrumentSelectionRequest.unknownFields()) && Intrinsics.areEqual(this.preselected_external_instrument_token, initiateInstrumentSelectionRequest.preselected_external_instrument_token) && Intrinsics.areEqual(this.preselected_external_instrument_amount_usd_cents, initiateInstrumentSelectionRequest.preselected_external_instrument_amount_usd_cents) && Intrinsics.areEqual(this.preselected_unrestricted_balance_token, initiateInstrumentSelectionRequest.preselected_unrestricted_balance_token) && Intrinsics.areEqual(this.preselected_unrestricted_balance_amount_usd_cents, initiateInstrumentSelectionRequest.preselected_unrestricted_balance_amount_usd_cents) && Intrinsics.areEqual(this.preselected_restricted_balance_token, initiateInstrumentSelectionRequest.preselected_restricted_balance_token) && Intrinsics.areEqual(this.preselected_restricted_balance_amount_usd_cents, initiateInstrumentSelectionRequest.preselected_restricted_balance_amount_usd_cents) && Intrinsics.areEqual(this.total_amount_usd_cents, initiateInstrumentSelectionRequest.total_amount_usd_cents) && Intrinsics.areEqual(this.request_context, initiateInstrumentSelectionRequest.request_context) && Intrinsics.areEqual(this.allow_plaid_linked_bank_account, initiateInstrumentSelectionRequest.allow_plaid_linked_bank_account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.preselected_external_instrument_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.preselected_external_instrument_amount_usd_cents;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.preselected_unrestricted_balance_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l2 = this.preselected_unrestricted_balance_amount_usd_cents;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str3 = this.preselected_restricted_balance_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l3 = this.preselected_restricted_balance_amount_usd_cents;
        int hashCode7 = (hashCode6 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.total_amount_usd_cents;
        int hashCode8 = (hashCode7 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode9 = (hashCode8 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Boolean bool = this.allow_plaid_linked_bank_account;
        int hashCode10 = hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(14, false);
        builder.locale = this.preselected_external_instrument_token;
        builder.title = this.preselected_external_instrument_amount_usd_cents;
        builder.info_rows_header = this.preselected_unrestricted_balance_token;
        builder.footer_text = this.preselected_unrestricted_balance_amount_usd_cents;
        builder.loadable_subtitle = this.preselected_restricted_balance_token;
        builder.info_rows = this.preselected_restricted_balance_amount_usd_cents;
        builder.primary_footer_button_state = this.total_amount_usd_cents;
        builder.secondary_footer_button_state = this.request_context;
        builder.payment_plans_data = this.allow_plaid_linked_bank_account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.preselected_external_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "preselected_external_instrument_token=", arrayList);
        }
        Long l = this.preselected_external_instrument_amount_usd_cents;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("preselected_external_instrument_amount_usd_cents=", l, arrayList);
        }
        String str2 = this.preselected_unrestricted_balance_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "preselected_unrestricted_balance_token=", arrayList);
        }
        Long l2 = this.preselected_unrestricted_balance_amount_usd_cents;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("preselected_unrestricted_balance_amount_usd_cents=", l2, arrayList);
        }
        String str3 = this.preselected_restricted_balance_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "preselected_restricted_balance_token=", arrayList);
        }
        Long l3 = this.preselected_restricted_balance_amount_usd_cents;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("preselected_restricted_balance_amount_usd_cents=", l3, arrayList);
        }
        Long l4 = this.total_amount_usd_cents;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("total_amount_usd_cents=", l4, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Boolean bool = this.allow_plaid_linked_bank_account;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_plaid_linked_bank_account=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateInstrumentSelectionRequest{", "}", 0, null, null, 56);
    }
}
