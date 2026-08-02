package com.squareup.protos.cash.cryptoinvestflow.service;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.zipline.internal.JsonEngineKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes.dex */
public final class ExchangeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExchangeRequest> CREATOR;
    public final JsonEngineKt amount;
    public final CashInInstrument cash_in_instrument;
    public final Order.CustomOrderConfiguration custom_order_configuration;
    public final String idempotence_token;
    public final String passcode_token;
    public final Order.RecurringSchedule recurring_schedule;
    public final RequestContext request_context;
    public final CurrencyCode source_currency;
    public final String source_instrument_token;
    public final CurrencyCode target_currency;
    public final String target_instrument_token;
    public final UserInteractionContext user_interaction_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ExchangeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001f. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                JsonEngineKt exchangeRequest$Amount$SourceAmount;
                Object obj5;
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                JsonEngineKt jsonEngineKt = null;
                Object obj11 = null;
                Object obj12 = null;
                Object obj13 = null;
                Object obj14 = null;
                Object obj15 = null;
                Object obj16 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ExchangeRequest((CurrencyCode) obj6, (CurrencyCode) obj7, jsonEngineKt, (String) obj8, (String) obj9, (String) obj10, (RequestContext) obj11, (String) obj12, (Order.CustomOrderConfiguration) obj13, (Order.RecurringSchedule) obj14, (UserInteractionContext) obj15, (CashInInstrument) obj16, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = obj7;
                            obj2 = obj8;
                            obj3 = obj9;
                            try {
                                obj5 = CurrencyCode.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                            obj7 = obj;
                            obj9 = obj3;
                            obj8 = obj2;
                            break;
                        case 2:
                            obj = obj7;
                            try {
                                obj7 = CurrencyCode.ADAPTER.decode(protoReader);
                                obj5 = obj6;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj2 = obj8;
                                obj3 = obj9;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 3:
                            obj4 = obj7;
                            exchangeRequest$Amount$SourceAmount = new ExchangeRequest$Amount$SourceAmount(((Number) ProtoAdapter.INT64.decode(protoReader)).longValue());
                            jsonEngineKt = exchangeRequest$Amount$SourceAmount;
                            obj7 = obj4;
                            obj5 = obj6;
                            break;
                        case 4:
                            obj4 = obj7;
                            exchangeRequest$Amount$SourceAmount = new ExchangeRequest$Amount$TargetAmount(((Number) ProtoAdapter.INT64.decode(protoReader)).longValue());
                            jsonEngineKt = exchangeRequest$Amount$SourceAmount;
                            obj7 = obj4;
                            obj5 = obj6;
                            break;
                        case 5:
                            jsonEngineKt = new ExchangeRequest$Amount$AllSourceAmount(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                            obj5 = obj6;
                            break;
                        case 6:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj6;
                            break;
                        case 7:
                            obj9 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj6;
                            break;
                        case 8:
                            obj10 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj6;
                            break;
                        case 9:
                            obj11 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj11);
                            obj5 = obj6;
                            break;
                        case 10:
                            obj12 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj6;
                            break;
                        case 11:
                            obj13 = TransactorKt.decodeMessageOrMerge(Order.CustomOrderConfiguration.ADAPTER, protoReader, obj13);
                            obj5 = obj6;
                            break;
                        case 12:
                            obj14 = TransactorKt.decodeMessageOrMerge(Order.RecurringSchedule.ADAPTER, protoReader, obj14);
                            obj5 = obj6;
                            break;
                        case 13:
                            obj15 = TransactorKt.decodeMessageOrMerge(UserInteractionContext.ADAPTER, protoReader, obj15);
                            obj5 = obj6;
                            break;
                        case 14:
                            obj16 = TransactorKt.decodeMessageOrMerge(CashInInstrument.ADAPTER, protoReader, obj16);
                            obj5 = obj6;
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj7;
                            obj2 = obj8;
                            obj3 = obj9;
                            obj5 = obj6;
                            obj7 = obj;
                            obj9 = obj3;
                            obj8 = obj2;
                            break;
                    }
                    obj6 = obj5;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ExchangeRequest exchangeRequest = (ExchangeRequest) obj;
                reverseProtoWriter.getClass();
                exchangeRequest.getClass();
                reverseProtoWriter.writeBytes(exchangeRequest.unknownFields());
                JsonEngineKt jsonEngineKt = exchangeRequest.amount;
                if (jsonEngineKt instanceof ExchangeRequest$Amount$SourceAmount) {
                    ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, Long.valueOf(((ExchangeRequest$Amount$SourceAmount) jsonEngineKt).value));
                } else if (jsonEngineKt instanceof ExchangeRequest$Amount$TargetAmount) {
                    ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, Long.valueOf(((ExchangeRequest$Amount$TargetAmount) jsonEngineKt).value));
                } else if (jsonEngineKt instanceof ExchangeRequest$Amount$AllSourceAmount) {
                    ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, Boolean.valueOf(((ExchangeRequest$Amount$AllSourceAmount) jsonEngineKt).value));
                } else if (jsonEngineKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                CashInInstrument.ADAPTER.encodeWithTag(reverseProtoWriter, 14, exchangeRequest.cash_in_instrument);
                UserInteractionContext.ADAPTER.encodeWithTag(reverseProtoWriter, 13, exchangeRequest.user_interaction_context);
                Order.RecurringSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 12, exchangeRequest.recurring_schedule);
                Order.CustomOrderConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 11, exchangeRequest.custom_order_configuration);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, exchangeRequest.passcode_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 9, exchangeRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, exchangeRequest.idempotence_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, exchangeRequest.target_instrument_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, exchangeRequest.source_instrument_token);
                ProtoAdapter protoAdapter3 = CurrencyCode.ADAPTER;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 2, exchangeRequest.target_currency);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 1, exchangeRequest.source_currency);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                ExchangeRequest exchangeRequest = (ExchangeRequest) obj;
                exchangeRequest.getClass();
                int size$okio = exchangeRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = CurrencyCode.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, exchangeRequest.target_currency) + protoAdapter2.encodedSizeWithTag(1, exchangeRequest.source_currency) + size$okio;
                JsonEngineKt jsonEngineKt = exchangeRequest.amount;
                if (jsonEngineKt instanceof ExchangeRequest$Amount$SourceAmount) {
                    encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(((ExchangeRequest$Amount$SourceAmount) jsonEngineKt).value));
                } else {
                    if (!(jsonEngineKt instanceof ExchangeRequest$Amount$TargetAmount)) {
                        if (jsonEngineKt instanceof ExchangeRequest$Amount$AllSourceAmount) {
                            encodedSizeWithTag2 = SizeMode$EnumUnboxingLocalUtility.m(((ExchangeRequest$Amount$AllSourceAmount) jsonEngineKt).value, ProtoAdapter.BOOL, 5, encodedSizeWithTag2);
                        } else if (jsonEngineKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                        return CashInInstrument.ADAPTER.encodedSizeWithTag(14, exchangeRequest.cash_in_instrument) + UserInteractionContext.ADAPTER.encodedSizeWithTag(13, exchangeRequest.user_interaction_context) + Order.RecurringSchedule.ADAPTER.encodedSizeWithTag(12, exchangeRequest.recurring_schedule) + Order.CustomOrderConfiguration.ADAPTER.encodedSizeWithTag(11, exchangeRequest.custom_order_configuration) + protoAdapter3.encodedSizeWithTag(10, exchangeRequest.passcode_token) + RequestContext.ADAPTER.encodedSizeWithTag(9, exchangeRequest.request_context) + protoAdapter3.encodedSizeWithTag(8, exchangeRequest.idempotence_token) + protoAdapter3.encodedSizeWithTag(7, exchangeRequest.target_instrument_token) + protoAdapter3.encodedSizeWithTag(6, exchangeRequest.source_instrument_token) + encodedSizeWithTag2;
                    }
                    encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(((ExchangeRequest$Amount$TargetAmount) jsonEngineKt).value));
                }
                encodedSizeWithTag2 += encodedSizeWithTag;
                ProtoAdapter protoAdapter32 = ProtoAdapter.STRING;
                return CashInInstrument.ADAPTER.encodedSizeWithTag(14, exchangeRequest.cash_in_instrument) + UserInteractionContext.ADAPTER.encodedSizeWithTag(13, exchangeRequest.user_interaction_context) + Order.RecurringSchedule.ADAPTER.encodedSizeWithTag(12, exchangeRequest.recurring_schedule) + Order.CustomOrderConfiguration.ADAPTER.encodedSizeWithTag(11, exchangeRequest.custom_order_configuration) + protoAdapter32.encodedSizeWithTag(10, exchangeRequest.passcode_token) + RequestContext.ADAPTER.encodedSizeWithTag(9, exchangeRequest.request_context) + protoAdapter32.encodedSizeWithTag(8, exchangeRequest.idempotence_token) + protoAdapter32.encodedSizeWithTag(7, exchangeRequest.target_instrument_token) + protoAdapter32.encodedSizeWithTag(6, exchangeRequest.source_instrument_token) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ExchangeRequest exchangeRequest = (ExchangeRequest) obj;
                exchangeRequest.getClass();
                RequestContext requestContext = exchangeRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Order.CustomOrderConfiguration customOrderConfiguration = exchangeRequest.custom_order_configuration;
                Order.CustomOrderConfiguration customOrderConfiguration2 = customOrderConfiguration != null ? (Order.CustomOrderConfiguration) Order.CustomOrderConfiguration.ADAPTER.redact(customOrderConfiguration) : null;
                Order.RecurringSchedule recurringSchedule = exchangeRequest.recurring_schedule;
                Order.RecurringSchedule recurringSchedule2 = recurringSchedule != null ? (Order.RecurringSchedule) Order.RecurringSchedule.ADAPTER.redact(recurringSchedule) : null;
                UserInteractionContext userInteractionContext = exchangeRequest.user_interaction_context;
                UserInteractionContext userInteractionContext2 = userInteractionContext != null ? (UserInteractionContext) UserInteractionContext.ADAPTER.redact(userInteractionContext) : null;
                CashInInstrument cashInInstrument = exchangeRequest.cash_in_instrument;
                return ExchangeRequest.copy$default(exchangeRequest, null, null, null, requestContext2, customOrderConfiguration2, recurringSchedule2, userInteractionContext2, cashInInstrument != null ? (CashInInstrument) CashInInstrument.ADAPTER.redact(cashInInstrument) : null, ByteString.EMPTY, 63);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ExchangeRequest exchangeRequest = (ExchangeRequest) obj;
                exchangeRequest.getClass();
                ProtoAdapter protoAdapter2 = CurrencyCode.ADAPTER;
                protoAdapter2.encodeWithTag(protoWriter, 1, exchangeRequest.source_currency);
                protoAdapter2.encodeWithTag(protoWriter, 2, exchangeRequest.target_currency);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(protoWriter, 6, exchangeRequest.source_instrument_token);
                protoAdapter3.encodeWithTag(protoWriter, 7, exchangeRequest.target_instrument_token);
                protoAdapter3.encodeWithTag(protoWriter, 8, exchangeRequest.idempotence_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 9, exchangeRequest.request_context);
                protoAdapter3.encodeWithTag(protoWriter, 10, exchangeRequest.passcode_token);
                Order.CustomOrderConfiguration.ADAPTER.encodeWithTag(protoWriter, 11, exchangeRequest.custom_order_configuration);
                Order.RecurringSchedule.ADAPTER.encodeWithTag(protoWriter, 12, exchangeRequest.recurring_schedule);
                UserInteractionContext.ADAPTER.encodeWithTag(protoWriter, 13, exchangeRequest.user_interaction_context);
                CashInInstrument.ADAPTER.encodeWithTag(protoWriter, 14, exchangeRequest.cash_in_instrument);
                JsonEngineKt jsonEngineKt = exchangeRequest.amount;
                if (jsonEngineKt instanceof ExchangeRequest$Amount$SourceAmount) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, Long.valueOf(((ExchangeRequest$Amount$SourceAmount) jsonEngineKt).value));
                } else if (jsonEngineKt instanceof ExchangeRequest$Amount$TargetAmount) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, Long.valueOf(((ExchangeRequest$Amount$TargetAmount) jsonEngineKt).value));
                } else if (jsonEngineKt instanceof ExchangeRequest$Amount$AllSourceAmount) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, Boolean.valueOf(((ExchangeRequest$Amount$AllSourceAmount) jsonEngineKt).value));
                } else if (jsonEngineKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(exchangeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ ExchangeRequest(CurrencyCode currencyCode, CurrencyCode currencyCode2, ExchangeRequest$Amount$AllSourceAmount exchangeRequest$Amount$AllSourceAmount, String str, String str2, Order.CustomOrderConfiguration customOrderConfiguration, Order.RecurringSchedule recurringSchedule, UserInteractionContext userInteractionContext, CashInInstrument cashInInstrument, int i) {
        this((i & 1) != 0 ? null : currencyCode, (i & 2) != 0 ? null : currencyCode2, (i & 4) != 0 ? null : exchangeRequest$Amount$AllSourceAmount, str, (i & 16) != 0 ? null : str2, null, null, null, (i & 256) != 0 ? null : customOrderConfiguration, (i & 512) != 0 ? null : recurringSchedule, (i & 1024) != 0 ? null : userInteractionContext, (i & 2048) != 0 ? null : cashInInstrument, ByteString.EMPTY);
    }

    public static ExchangeRequest copy$default(ExchangeRequest exchangeRequest, CurrencyCode currencyCode, CurrencyCode currencyCode2, JsonEngineKt jsonEngineKt, RequestContext requestContext, Order.CustomOrderConfiguration customOrderConfiguration, Order.RecurringSchedule recurringSchedule, UserInteractionContext userInteractionContext, CashInInstrument cashInInstrument, ByteString byteString, int i) {
        CurrencyCode currencyCode3 = (i & 1) != 0 ? exchangeRequest.source_currency : currencyCode;
        CurrencyCode currencyCode4 = (i & 2) != 0 ? exchangeRequest.target_currency : currencyCode2;
        JsonEngineKt jsonEngineKt2 = (i & 4) != 0 ? exchangeRequest.amount : jsonEngineKt;
        String str = exchangeRequest.source_instrument_token;
        String str2 = exchangeRequest.target_instrument_token;
        String str3 = exchangeRequest.idempotence_token;
        RequestContext requestContext2 = (i & 64) != 0 ? exchangeRequest.request_context : requestContext;
        String str4 = (i & 128) != 0 ? exchangeRequest.passcode_token : null;
        Order.CustomOrderConfiguration customOrderConfiguration2 = (i & 256) != 0 ? exchangeRequest.custom_order_configuration : customOrderConfiguration;
        Order.RecurringSchedule recurringSchedule2 = (i & 512) != 0 ? exchangeRequest.recurring_schedule : recurringSchedule;
        UserInteractionContext userInteractionContext2 = (i & 1024) != 0 ? exchangeRequest.user_interaction_context : userInteractionContext;
        CashInInstrument cashInInstrument2 = (i & 2048) != 0 ? exchangeRequest.cash_in_instrument : cashInInstrument;
        ByteString unknownFields = (i & 4096) != 0 ? exchangeRequest.unknownFields() : byteString;
        exchangeRequest.getClass();
        unknownFields.getClass();
        return new ExchangeRequest(currencyCode3, currencyCode4, jsonEngineKt2, str, str2, str3, requestContext2, str4, customOrderConfiguration2, recurringSchedule2, userInteractionContext2, cashInInstrument2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExchangeRequest)) {
            return false;
        }
        ExchangeRequest exchangeRequest = (ExchangeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), exchangeRequest.unknownFields()) && this.source_currency == exchangeRequest.source_currency && this.target_currency == exchangeRequest.target_currency && Intrinsics.areEqual(this.amount, exchangeRequest.amount) && Intrinsics.areEqual(this.source_instrument_token, exchangeRequest.source_instrument_token) && Intrinsics.areEqual(this.target_instrument_token, exchangeRequest.target_instrument_token) && Intrinsics.areEqual(this.idempotence_token, exchangeRequest.idempotence_token) && Intrinsics.areEqual(this.request_context, exchangeRequest.request_context) && Intrinsics.areEqual(this.passcode_token, exchangeRequest.passcode_token) && Intrinsics.areEqual(this.custom_order_configuration, exchangeRequest.custom_order_configuration) && Intrinsics.areEqual(this.recurring_schedule, exchangeRequest.recurring_schedule) && Intrinsics.areEqual(this.user_interaction_context, exchangeRequest.user_interaction_context) && Intrinsics.areEqual(this.cash_in_instrument, exchangeRequest.cash_in_instrument);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CurrencyCode currencyCode = this.source_currency;
        int hashCode2 = (hashCode + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        CurrencyCode currencyCode2 = this.target_currency;
        int hashCode3 = (hashCode2 + (currencyCode2 != null ? currencyCode2.hashCode() : 0)) * 37;
        JsonEngineKt jsonEngineKt = this.amount;
        int hashCode4 = (hashCode3 + (jsonEngineKt != null ? jsonEngineKt.hashCode() : 0)) * 37;
        String str = this.source_instrument_token;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.target_instrument_token;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.idempotence_token;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode8 = (hashCode7 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str4 = this.passcode_token;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Order.CustomOrderConfiguration customOrderConfiguration = this.custom_order_configuration;
        int hashCode10 = (hashCode9 + (customOrderConfiguration != null ? customOrderConfiguration.hashCode() : 0)) * 37;
        Order.RecurringSchedule recurringSchedule = this.recurring_schedule;
        int hashCode11 = (hashCode10 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0)) * 37;
        UserInteractionContext userInteractionContext = this.user_interaction_context;
        int hashCode12 = (hashCode11 + (userInteractionContext != null ? userInteractionContext.hashCode() : 0)) * 37;
        CashInInstrument cashInInstrument = this.cash_in_instrument;
        int hashCode13 = hashCode12 + (cashInInstrument != null ? cashInInstrument.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(6, false);
        builder.key_path_ref = this.source_currency;
        builder.int_literal = this.target_currency;
        builder.float_literal = this.amount;
        builder.string_literal = this.source_instrument_token;
        builder.bool_literal = this.target_instrument_token;
        builder.blob_literal = this.idempotence_token;
        builder.unary_op = this.request_context;
        builder.binary_op = this.passcode_token;
        builder.conditional_op = this.custom_order_configuration;
        builder.filter_op = this.recurring_schedule;
        builder.collection_literal = this.user_interaction_context;
        builder.format_string_op = this.cash_in_instrument;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CurrencyCode currencyCode = this.source_currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("source_currency=", currencyCode, arrayList);
        }
        CurrencyCode currencyCode2 = this.target_currency;
        if (currencyCode2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("target_currency=", currencyCode2, arrayList);
        }
        JsonEngineKt jsonEngineKt = this.amount;
        if (jsonEngineKt != null) {
            arrayList.add("amount=" + jsonEngineKt);
        }
        String str = this.source_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_instrument_token=", arrayList);
        }
        String str2 = this.target_instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "target_instrument_token=", arrayList);
        }
        String str3 = this.idempotence_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "idempotence_token=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        Order.CustomOrderConfiguration customOrderConfiguration = this.custom_order_configuration;
        if (customOrderConfiguration != null) {
            arrayList.add("custom_order_configuration=" + customOrderConfiguration);
        }
        Order.RecurringSchedule recurringSchedule = this.recurring_schedule;
        if (recurringSchedule != null) {
            arrayList.add("recurring_schedule=" + recurringSchedule);
        }
        UserInteractionContext userInteractionContext = this.user_interaction_context;
        if (userInteractionContext != null) {
            arrayList.add("user_interaction_context=" + userInteractionContext);
        }
        CashInInstrument cashInInstrument = this.cash_in_instrument;
        if (cashInInstrument != null) {
            arrayList.add("cash_in_instrument=" + cashInInstrument);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExchangeRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeRequest(CurrencyCode currencyCode, CurrencyCode currencyCode2, JsonEngineKt jsonEngineKt, String str, String str2, String str3, RequestContext requestContext, String str4, Order.CustomOrderConfiguration customOrderConfiguration, Order.RecurringSchedule recurringSchedule, UserInteractionContext userInteractionContext, CashInInstrument cashInInstrument, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.source_currency = currencyCode;
        this.target_currency = currencyCode2;
        this.amount = jsonEngineKt;
        this.source_instrument_token = str;
        this.target_instrument_token = str2;
        this.idempotence_token = str3;
        this.request_context = requestContext;
        this.passcode_token = str4;
        this.custom_order_configuration = customOrderConfiguration;
        this.recurring_schedule = recurringSchedule;
        this.user_interaction_context = userInteractionContext;
        this.cash_in_instrument = cashInInstrument;
    }
}
