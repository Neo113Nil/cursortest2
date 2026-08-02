package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzhq;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.local.client.v1.CreateOrderRequest;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentOption;
import com.squareup.protos.franklin.lending.CreditLine;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class CreateOrderRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateOrderRequest> CREATOR;
    public final List additional_buyer_info;
    public final String anonymous_user_app_token;
    public final String attribution_key;
    public final List calculated_charges_breakdown_rows;
    public final String cart_token;
    public final String cart_version;
    public final LocalMoney expected_local_cash_earnings_amount;
    public final LocalMoney expected_payment_total_amount;
    public final LocalFulfillment fulfillment;
    public final LocalFulfillmentOption.Type fulfillment_option;
    public final LocalFulfillmentType fulfillment_option_type;
    public final String join_cash_local_legal_consent_token;
    public final String legal_consent_token;
    public final String notes;
    public final OrderWorkflow order_workflow;
    public final zzhq payment;
    public final Boolean redeem_local_bux;
    public final Boolean save_buyer_info;
    public final LocalMoney tip_amount;

    /* loaded from: classes7.dex */
    public final class CalculatedChargesBreakdownRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CalculatedChargesBreakdownRow> CREATOR;
        public final LocalMoney amount;
        public final String identifier;

        static {
            CreateOrderRequest$CalculatedChargesBreakdownRow$Companion$ADAPTER$1 createOrderRequest$CalculatedChargesBreakdownRow$Companion$ADAPTER$1 = new CreateOrderRequest$CalculatedChargesBreakdownRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CalculatedChargesBreakdownRow.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderRequest.CalculatedChargesBreakdownRow", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = createOrderRequest$CalculatedChargesBreakdownRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderRequest$CalculatedChargesBreakdownRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CalculatedChargesBreakdownRow(String str, LocalMoney localMoney, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.identifier = str;
            this.amount = localMoney;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalculatedChargesBreakdownRow)) {
                return false;
            }
            CalculatedChargesBreakdownRow calculatedChargesBreakdownRow = (CalculatedChargesBreakdownRow) obj;
            return Intrinsics.areEqual(unknownFields(), calculatedChargesBreakdownRow.unknownFields()) && Intrinsics.areEqual(this.identifier, calculatedChargesBreakdownRow.identifier) && Intrinsics.areEqual(this.amount, calculatedChargesBreakdownRow.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.identifier;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalMoney localMoney = this.amount;
            int hashCode3 = hashCode2 + (localMoney != null ? localMoney.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(29);
            builder.card_type = this.identifier;
            builder.card_pii = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.identifier;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "identifier=", arrayList);
            }
            LocalMoney localMoney = this.amount;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("amount=", localMoney, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CalculatedChargesBreakdownRow{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreateOrderRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.CreateOrderRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v49 */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v54 */
            /* JADX WARN: Type inference failed for: r0v55 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LocalFulfillmentOption.Type type2;
                LocalFulfillmentType localFulfillmentType;
                String str;
                ?? decode;
                zzhq createOrderRequest$Payment$SquarePaymentToken;
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                String str2 = null;
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                LocalFulfillmentOption.Type type3 = null;
                Object obj4 = null;
                LocalFulfillmentType localFulfillmentType2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Boolean bool = null;
                String str6 = null;
                zzhq zzhqVar = null;
                Boolean bool2 = null;
                String str7 = null;
                OrderWorkflow orderWorkflow = null;
                String str8 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CreateOrderRequest(str2, str6, zzhqVar, str8, m, type3, (LocalMoney) obj4, localFulfillmentType2, str3, str4, str5, bool, (LocalMoney) obj, (LocalMoney) obj2, (LocalFulfillment) obj3, bool2, str7, arrayList, orderWorkflow, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            createOrderRequest$Payment$SquarePaymentToken = new CreateOrderRequest$Payment$SquarePaymentToken((String) ProtoAdapter.STRING.decode(protoReader));
                            zzhqVar = createOrderRequest$Payment$SquarePaymentToken;
                            decode = str2;
                            break;
                        case 3:
                            str8 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 4:
                            createOrderRequest$Payment$SquarePaymentToken = new CreateOrderRequest$Payment$UseCashBalance(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                            zzhqVar = createOrderRequest$Payment$SquarePaymentToken;
                            decode = str2;
                            break;
                        case 5:
                            type2 = type3;
                            localFulfillmentType = localFulfillmentType2;
                            str = str3;
                            m.add(LocalAdditionalBuyerInfo.ADAPTER.decode(protoReader));
                            decode = str2;
                            type3 = type2;
                            localFulfillmentType2 = localFulfillmentType;
                            str3 = str;
                            break;
                        case 6:
                            type2 = type3;
                            localFulfillmentType = localFulfillmentType2;
                            str = str3;
                            try {
                                type3 = LocalFulfillmentOption.Type.ADAPTER.decode(protoReader);
                                localFulfillmentType2 = localFulfillmentType;
                                str3 = str;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 7:
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj4);
                            decode = str2;
                            break;
                        case 8:
                            type2 = type3;
                            localFulfillmentType = localFulfillmentType2;
                            str = str3;
                            try {
                                localFulfillmentType2 = LocalFulfillmentType.ADAPTER.decode(protoReader);
                                type3 = type2;
                                str3 = str;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 9:
                            str3 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 10:
                            str4 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 11:
                            str5 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 12:
                            bool = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 13:
                            obj = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj);
                            decode = str2;
                            break;
                        case 14:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj2);
                            decode = str2;
                            break;
                        case 15:
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, protoReader, obj3);
                            decode = str2;
                            break;
                        case 16:
                            createOrderRequest$Payment$SquarePaymentToken = new CreateOrderRequest$Payment$InstrumentToken((String) ProtoAdapter.STRING.decode(protoReader));
                            zzhqVar = createOrderRequest$Payment$SquarePaymentToken;
                            decode = str2;
                            break;
                        case 17:
                            str6 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 18:
                            bool2 = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 19:
                            str7 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 20:
                            type2 = type3;
                            localFulfillmentType = localFulfillmentType2;
                            str = str3;
                            arrayList.add(CreateOrderRequest.CalculatedChargesBreakdownRow.ADAPTER.decode(protoReader));
                            decode = str2;
                            type3 = type2;
                            localFulfillmentType2 = localFulfillmentType;
                            str3 = str;
                            break;
                        case 21:
                            try {
                                orderWorkflow = OrderWorkflow.ADAPTER.decode(protoReader);
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                type2 = type3;
                                localFulfillmentType = localFulfillmentType2;
                                str = str3;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        default:
                            protoReader.readUnknownField(nextTag);
                            type2 = type3;
                            localFulfillmentType = localFulfillmentType2;
                            str = str3;
                            decode = str2;
                            type3 = type2;
                            localFulfillmentType2 = localFulfillmentType;
                            str3 = str;
                            break;
                    }
                    str2 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreateOrderRequest createOrderRequest = (CreateOrderRequest) obj;
                reverseProtoWriter.getClass();
                createOrderRequest.getClass();
                reverseProtoWriter.writeBytes(createOrderRequest.unknownFields());
                zzhq zzhqVar = createOrderRequest.payment;
                if (zzhqVar instanceof CreateOrderRequest$Payment$SquarePaymentToken) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((CreateOrderRequest$Payment$SquarePaymentToken) zzhqVar).value);
                } else if (zzhqVar instanceof CreateOrderRequest$Payment$UseCashBalance) {
                    ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, Boolean.valueOf(((CreateOrderRequest$Payment$UseCashBalance) zzhqVar).value));
                } else if (zzhqVar instanceof CreateOrderRequest$Payment$InstrumentToken) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 16, ((CreateOrderRequest$Payment$InstrumentToken) zzhqVar).value);
                } else if (zzhqVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                OrderWorkflow.ADAPTER.encodeWithTag(reverseProtoWriter, 21, createOrderRequest.order_workflow);
                CreateOrderRequest.CalculatedChargesBreakdownRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 20, createOrderRequest.calculated_charges_breakdown_rows);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 19, createOrderRequest.notes);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 18, createOrderRequest.save_buyer_info);
                LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 15, createOrderRequest.fulfillment);
                ProtoAdapter protoAdapter4 = LocalMoney.ADAPTER;
                protoAdapter4.encodeWithTag(reverseProtoWriter, 14, createOrderRequest.expected_local_cash_earnings_amount);
                protoAdapter4.encodeWithTag(reverseProtoWriter, 13, createOrderRequest.expected_payment_total_amount);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 12, createOrderRequest.redeem_local_bux);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 11, createOrderRequest.attribution_key);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, createOrderRequest.join_cash_local_legal_consent_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 9, createOrderRequest.legal_consent_token);
                LocalFulfillmentType.ADAPTER.encodeWithTag(reverseProtoWriter, 8, createOrderRequest.fulfillment_option_type);
                protoAdapter4.encodeWithTag(reverseProtoWriter, 7, createOrderRequest.tip_amount);
                LocalFulfillmentOption.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 6, createOrderRequest.fulfillment_option);
                LocalAdditionalBuyerInfo.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, createOrderRequest.additional_buyer_info);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, createOrderRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 17, createOrderRequest.cart_version);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, createOrderRequest.cart_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                CreateOrderRequest createOrderRequest = (CreateOrderRequest) obj;
                createOrderRequest.getClass();
                int size$okio = createOrderRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(17, createOrderRequest.cart_version) + protoAdapter2.encodedSizeWithTag(1, createOrderRequest.cart_token) + size$okio;
                zzhq zzhqVar = createOrderRequest.payment;
                if (!(zzhqVar instanceof CreateOrderRequest$Payment$SquarePaymentToken)) {
                    if (zzhqVar instanceof CreateOrderRequest$Payment$UseCashBalance) {
                        encodedSizeWithTag2 = SizeMode$EnumUnboxingLocalUtility.m(((CreateOrderRequest$Payment$UseCashBalance) zzhqVar).value, ProtoAdapter.BOOL, 4, encodedSizeWithTag2);
                    } else if (zzhqVar instanceof CreateOrderRequest$Payment$InstrumentToken) {
                        encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(16, ((CreateOrderRequest$Payment$InstrumentToken) zzhqVar).value);
                    } else if (zzhqVar != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    int encodedSizeWithTag3 = LocalFulfillmentOption.Type.ADAPTER.encodedSizeWithTag(6, createOrderRequest.fulfillment_option) + LocalAdditionalBuyerInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, createOrderRequest.additional_buyer_info) + protoAdapter2.encodedSizeWithTag(3, createOrderRequest.anonymous_user_app_token) + encodedSizeWithTag2;
                    ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                    int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(11, createOrderRequest.attribution_key) + protoAdapter2.encodedSizeWithTag(10, createOrderRequest.join_cash_local_legal_consent_token) + protoAdapter2.encodedSizeWithTag(9, createOrderRequest.legal_consent_token) + LocalFulfillmentType.ADAPTER.encodedSizeWithTag(8, createOrderRequest.fulfillment_option_type) + protoAdapter3.encodedSizeWithTag(7, createOrderRequest.tip_amount) + encodedSizeWithTag3;
                    ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                    return OrderWorkflow.ADAPTER.encodedSizeWithTag(21, createOrderRequest.order_workflow) + CreateOrderRequest.CalculatedChargesBreakdownRow.ADAPTER.asRepeated().encodedSizeWithTag(20, createOrderRequest.calculated_charges_breakdown_rows) + protoAdapter2.encodedSizeWithTag(19, createOrderRequest.notes) + protoAdapter4.encodedSizeWithTag(18, createOrderRequest.save_buyer_info) + LocalFulfillment.ADAPTER.encodedSizeWithTag(15, createOrderRequest.fulfillment) + protoAdapter3.encodedSizeWithTag(14, createOrderRequest.expected_local_cash_earnings_amount) + protoAdapter3.encodedSizeWithTag(13, createOrderRequest.expected_payment_total_amount) + protoAdapter4.encodedSizeWithTag(12, createOrderRequest.redeem_local_bux) + encodedSizeWithTag4;
                }
                encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, ((CreateOrderRequest$Payment$SquarePaymentToken) zzhqVar).value);
                encodedSizeWithTag2 += encodedSizeWithTag;
                int encodedSizeWithTag32 = LocalFulfillmentOption.Type.ADAPTER.encodedSizeWithTag(6, createOrderRequest.fulfillment_option) + LocalAdditionalBuyerInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, createOrderRequest.additional_buyer_info) + protoAdapter2.encodedSizeWithTag(3, createOrderRequest.anonymous_user_app_token) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter32 = LocalMoney.ADAPTER;
                int encodedSizeWithTag42 = protoAdapter2.encodedSizeWithTag(11, createOrderRequest.attribution_key) + protoAdapter2.encodedSizeWithTag(10, createOrderRequest.join_cash_local_legal_consent_token) + protoAdapter2.encodedSizeWithTag(9, createOrderRequest.legal_consent_token) + LocalFulfillmentType.ADAPTER.encodedSizeWithTag(8, createOrderRequest.fulfillment_option_type) + protoAdapter32.encodedSizeWithTag(7, createOrderRequest.tip_amount) + encodedSizeWithTag32;
                ProtoAdapter protoAdapter42 = ProtoAdapter.BOOL;
                return OrderWorkflow.ADAPTER.encodedSizeWithTag(21, createOrderRequest.order_workflow) + CreateOrderRequest.CalculatedChargesBreakdownRow.ADAPTER.asRepeated().encodedSizeWithTag(20, createOrderRequest.calculated_charges_breakdown_rows) + protoAdapter2.encodedSizeWithTag(19, createOrderRequest.notes) + protoAdapter42.encodedSizeWithTag(18, createOrderRequest.save_buyer_info) + LocalFulfillment.ADAPTER.encodedSizeWithTag(15, createOrderRequest.fulfillment) + protoAdapter32.encodedSizeWithTag(14, createOrderRequest.expected_local_cash_earnings_amount) + protoAdapter32.encodedSizeWithTag(13, createOrderRequest.expected_payment_total_amount) + protoAdapter42.encodedSizeWithTag(12, createOrderRequest.redeem_local_bux) + encodedSizeWithTag42;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreateOrderRequest createOrderRequest = (CreateOrderRequest) obj;
                createOrderRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(createOrderRequest.additional_buyer_info, LocalAdditionalBuyerInfo.ADAPTER);
                LocalMoney localMoney = createOrderRequest.tip_amount;
                LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
                LocalMoney localMoney3 = createOrderRequest.expected_payment_total_amount;
                LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
                LocalMoney localMoney5 = createOrderRequest.expected_local_cash_earnings_amount;
                LocalMoney localMoney6 = localMoney5 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney5) : null;
                LocalFulfillment localFulfillment = createOrderRequest.fulfillment;
                return CreateOrderRequest.copy$default(createOrderRequest, null, m1169redactElements, localMoney2, localMoney4, localMoney6, localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null, TransactorKt.m1169redactElements(createOrderRequest.calculated_charges_breakdown_rows, CreateOrderRequest.CalculatedChargesBreakdownRow.ADAPTER), ByteString.EMPTY, 364459);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreateOrderRequest createOrderRequest = (CreateOrderRequest) obj;
                createOrderRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, createOrderRequest.cart_token);
                protoAdapter2.encodeWithTag(protoWriter, 17, createOrderRequest.cart_version);
                protoAdapter2.encodeWithTag(protoWriter, 3, createOrderRequest.anonymous_user_app_token);
                LocalAdditionalBuyerInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, createOrderRequest.additional_buyer_info);
                LocalFulfillmentOption.Type.ADAPTER.encodeWithTag(protoWriter, 6, createOrderRequest.fulfillment_option);
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                protoAdapter3.encodeWithTag(protoWriter, 7, createOrderRequest.tip_amount);
                LocalFulfillmentType.ADAPTER.encodeWithTag(protoWriter, 8, createOrderRequest.fulfillment_option_type);
                protoAdapter2.encodeWithTag(protoWriter, 9, createOrderRequest.legal_consent_token);
                protoAdapter2.encodeWithTag(protoWriter, 10, createOrderRequest.join_cash_local_legal_consent_token);
                protoAdapter2.encodeWithTag(protoWriter, 11, createOrderRequest.attribution_key);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(protoWriter, 12, createOrderRequest.redeem_local_bux);
                protoAdapter3.encodeWithTag(protoWriter, 13, createOrderRequest.expected_payment_total_amount);
                protoAdapter3.encodeWithTag(protoWriter, 14, createOrderRequest.expected_local_cash_earnings_amount);
                LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 15, createOrderRequest.fulfillment);
                protoAdapter4.encodeWithTag(protoWriter, 18, createOrderRequest.save_buyer_info);
                protoAdapter2.encodeWithTag(protoWriter, 19, createOrderRequest.notes);
                CreateOrderRequest.CalculatedChargesBreakdownRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, createOrderRequest.calculated_charges_breakdown_rows);
                OrderWorkflow.ADAPTER.encodeWithTag(protoWriter, 21, createOrderRequest.order_workflow);
                zzhq zzhqVar = createOrderRequest.payment;
                if (zzhqVar instanceof CreateOrderRequest$Payment$SquarePaymentToken) {
                    protoAdapter2.encodeWithTag(protoWriter, 2, ((CreateOrderRequest$Payment$SquarePaymentToken) zzhqVar).value);
                } else if (zzhqVar instanceof CreateOrderRequest$Payment$UseCashBalance) {
                    protoAdapter4.encodeWithTag(protoWriter, 4, Boolean.valueOf(((CreateOrderRequest$Payment$UseCashBalance) zzhqVar).value));
                } else if (zzhqVar instanceof CreateOrderRequest$Payment$InstrumentToken) {
                    protoAdapter2.encodeWithTag(protoWriter, 16, ((CreateOrderRequest$Payment$InstrumentToken) zzhqVar).value);
                } else if (zzhqVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(createOrderRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOrderRequest(String str, String str2, zzhq zzhqVar, String str3, List list, LocalFulfillmentOption.Type type2, LocalMoney localMoney, LocalFulfillmentType localFulfillmentType, String str4, String str5, String str6, Boolean bool, LocalMoney localMoney2, LocalMoney localMoney3, LocalFulfillment localFulfillment, Boolean bool2, String str7, List list2, OrderWorkflow orderWorkflow, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.cart_token = str;
        this.cart_version = str2;
        this.payment = zzhqVar;
        this.anonymous_user_app_token = str3;
        this.fulfillment_option = type2;
        this.tip_amount = localMoney;
        this.fulfillment_option_type = localFulfillmentType;
        this.legal_consent_token = str4;
        this.join_cash_local_legal_consent_token = str5;
        this.attribution_key = str6;
        this.redeem_local_bux = bool;
        this.expected_payment_total_amount = localMoney2;
        this.expected_local_cash_earnings_amount = localMoney3;
        this.fulfillment = localFulfillment;
        this.save_buyer_info = bool2;
        this.notes = str7;
        this.order_workflow = orderWorkflow;
        this.additional_buyer_info = TransactorKt.immutableCopyOf("additional_buyer_info", list);
        this.calculated_charges_breakdown_rows = TransactorKt.immutableCopyOf("calculated_charges_breakdown_rows", list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    public static CreateOrderRequest copy$default(CreateOrderRequest createOrderRequest, zzhq zzhqVar, ArrayList arrayList, LocalMoney localMoney, LocalMoney localMoney2, LocalMoney localMoney3, LocalFulfillment localFulfillment, ArrayList arrayList2, ByteString byteString, int i) {
        String str;
        ArrayList arrayList3;
        String str2 = createOrderRequest.cart_token;
        String str3 = createOrderRequest.cart_version;
        String str4 = createOrderRequest.anonymous_user_app_token;
        List list = (i & 16) != 0 ? createOrderRequest.additional_buyer_info : arrayList;
        LocalFulfillmentOption.Type type2 = createOrderRequest.fulfillment_option;
        LocalMoney localMoney4 = (i & 64) != 0 ? createOrderRequest.tip_amount : localMoney;
        LocalFulfillmentType localFulfillmentType = createOrderRequest.fulfillment_option_type;
        String str5 = createOrderRequest.legal_consent_token;
        String str6 = createOrderRequest.join_cash_local_legal_consent_token;
        String str7 = createOrderRequest.attribution_key;
        Boolean bool = createOrderRequest.redeem_local_bux;
        LocalMoney localMoney5 = (i & 4096) != 0 ? createOrderRequest.expected_payment_total_amount : localMoney2;
        LocalMoney localMoney6 = (i & PKIFailureInfo.certRevoked) != 0 ? createOrderRequest.expected_local_cash_earnings_amount : localMoney3;
        LocalFulfillment localFulfillment2 = (i & 16384) != 0 ? createOrderRequest.fulfillment : localFulfillment;
        Boolean bool2 = createOrderRequest.save_buyer_info;
        String str8 = createOrderRequest.notes;
        if ((i & PKIFailureInfo.unsupportedVersion) != 0) {
            str = str8;
            arrayList3 = createOrderRequest.calculated_charges_breakdown_rows;
        } else {
            str = str8;
            arrayList3 = arrayList2;
        }
        OrderWorkflow orderWorkflow = createOrderRequest.order_workflow;
        ByteString unknownFields = (i & PKIFailureInfo.signerNotTrusted) != 0 ? createOrderRequest.unknownFields() : byteString;
        createOrderRequest.getClass();
        list.getClass();
        arrayList3.getClass();
        unknownFields.getClass();
        return new CreateOrderRequest(str2, str3, zzhqVar, str4, list, type2, localMoney4, localFulfillmentType, str5, str6, str7, bool, localMoney5, localMoney6, localFulfillment2, bool2, str, arrayList3, orderWorkflow, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateOrderRequest)) {
            return false;
        }
        CreateOrderRequest createOrderRequest = (CreateOrderRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createOrderRequest.unknownFields()) && Intrinsics.areEqual(this.cart_token, createOrderRequest.cart_token) && Intrinsics.areEqual(this.cart_version, createOrderRequest.cart_version) && Intrinsics.areEqual(this.payment, createOrderRequest.payment) && Intrinsics.areEqual(this.anonymous_user_app_token, createOrderRequest.anonymous_user_app_token) && Intrinsics.areEqual(this.additional_buyer_info, createOrderRequest.additional_buyer_info) && this.fulfillment_option == createOrderRequest.fulfillment_option && Intrinsics.areEqual(this.tip_amount, createOrderRequest.tip_amount) && this.fulfillment_option_type == createOrderRequest.fulfillment_option_type && Intrinsics.areEqual(this.legal_consent_token, createOrderRequest.legal_consent_token) && Intrinsics.areEqual(this.join_cash_local_legal_consent_token, createOrderRequest.join_cash_local_legal_consent_token) && Intrinsics.areEqual(this.attribution_key, createOrderRequest.attribution_key) && Intrinsics.areEqual(this.redeem_local_bux, createOrderRequest.redeem_local_bux) && Intrinsics.areEqual(this.expected_payment_total_amount, createOrderRequest.expected_payment_total_amount) && Intrinsics.areEqual(this.expected_local_cash_earnings_amount, createOrderRequest.expected_local_cash_earnings_amount) && Intrinsics.areEqual(this.fulfillment, createOrderRequest.fulfillment) && Intrinsics.areEqual(this.save_buyer_info, createOrderRequest.save_buyer_info) && Intrinsics.areEqual(this.notes, createOrderRequest.notes) && Intrinsics.areEqual(this.calculated_charges_breakdown_rows, createOrderRequest.calculated_charges_breakdown_rows) && this.order_workflow == createOrderRequest.order_workflow;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cart_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cart_version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        zzhq zzhqVar = this.payment;
        int hashCode4 = (hashCode3 + (zzhqVar != null ? zzhqVar.hashCode() : 0)) * 37;
        String str3 = this.anonymous_user_app_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.additional_buyer_info);
        LocalFulfillmentOption.Type type2 = this.fulfillment_option;
        int hashCode5 = (m + (type2 != null ? type2.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.tip_amount;
        int hashCode6 = (hashCode5 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        LocalFulfillmentType localFulfillmentType = this.fulfillment_option_type;
        int hashCode7 = (hashCode6 + (localFulfillmentType != null ? localFulfillmentType.hashCode() : 0)) * 37;
        String str4 = this.legal_consent_token;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.join_cash_local_legal_consent_token;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.attribution_key;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool = this.redeem_local_bux;
        int hashCode11 = (hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalMoney localMoney2 = this.expected_payment_total_amount;
        int hashCode12 = (hashCode11 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37;
        LocalMoney localMoney3 = this.expected_local_cash_earnings_amount;
        int hashCode13 = (hashCode12 + (localMoney3 != null ? localMoney3.hashCode() : 0)) * 37;
        LocalFulfillment localFulfillment = this.fulfillment;
        int hashCode14 = (hashCode13 + (localFulfillment != null ? localFulfillment.hashCode() : 0)) * 37;
        Boolean bool2 = this.save_buyer_info;
        int hashCode15 = (hashCode14 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str7 = this.notes;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode15 + (str7 != null ? str7.hashCode() : 0)) * 37, 37, this.calculated_charges_breakdown_rows);
        OrderWorkflow orderWorkflow = this.order_workflow;
        int hashCode16 = m2 + (orderWorkflow != null ? orderWorkflow.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CreditLine.Builder builder = new CreditLine.Builder();
        builder.token = this.cart_token;
        builder.instrument_display_name = this.cart_version;
        builder.credit_limit = this.payment;
        builder.instrument_subtitle = this.anonymous_user_app_token;
        builder.quick_amounts = this.additional_buyer_info;
        builder.available_amount = this.fulfillment_option;
        builder.outstanding_amount = this.tip_amount;
        builder.minimum_loan_amount = this.fulfillment_option_type;
        builder.setup_fee_bps = this.legal_consent_token;
        builder.first_time_borrow_data = this.join_cash_local_legal_consent_token;
        builder.unlock_borrow_data = this.attribution_key;
        builder.skip_loan_amount_selection = this.redeem_local_bux;
        builder.credit_line_status_icon = this.expected_payment_total_amount;
        builder.lending_product = this.expected_local_cash_earnings_amount;
        builder.credit_line_status_data = this.fulfillment;
        builder.credit_line_limit_data = this.save_buyer_info;
        builder.alert = this.notes;
        builder.localizable_instrument_display_name = this.calculated_charges_breakdown_rows;
        builder.localizable_instrument_subtitle = this.order_workflow;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cart_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cart_token=", arrayList);
        }
        String str2 = this.cart_version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cart_version=", arrayList);
        }
        if (this.payment != null) {
            arrayList.add("payment=██");
        }
        String str3 = this.anonymous_user_app_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "anonymous_user_app_token=", arrayList);
        }
        List list = this.additional_buyer_info;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_buyer_info=", arrayList, list);
        }
        LocalFulfillmentOption.Type type2 = this.fulfillment_option;
        if (type2 != null) {
            arrayList.add("fulfillment_option=" + type2);
        }
        LocalMoney localMoney = this.tip_amount;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tip_amount=", localMoney, arrayList);
        }
        LocalFulfillmentType localFulfillmentType = this.fulfillment_option_type;
        if (localFulfillmentType != null) {
            arrayList.add("fulfillment_option_type=" + localFulfillmentType);
        }
        String str4 = this.legal_consent_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "legal_consent_token=", arrayList);
        }
        String str5 = this.join_cash_local_legal_consent_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "join_cash_local_legal_consent_token=", arrayList);
        }
        String str6 = this.attribution_key;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "attribution_key=", arrayList);
        }
        Boolean bool = this.redeem_local_bux;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("redeem_local_bux=", bool, arrayList);
        }
        LocalMoney localMoney2 = this.expected_payment_total_amount;
        if (localMoney2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("expected_payment_total_amount=", localMoney2, arrayList);
        }
        LocalMoney localMoney3 = this.expected_local_cash_earnings_amount;
        if (localMoney3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("expected_local_cash_earnings_amount=", localMoney3, arrayList);
        }
        LocalFulfillment localFulfillment = this.fulfillment;
        if (localFulfillment != null) {
            arrayList.add("fulfillment=" + localFulfillment);
        }
        Boolean bool2 = this.save_buyer_info;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("save_buyer_info=", bool2, arrayList);
        }
        String str7 = this.notes;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "notes=", arrayList);
        }
        List list2 = this.calculated_charges_breakdown_rows;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("calculated_charges_breakdown_rows=", arrayList, list2);
        }
        OrderWorkflow orderWorkflow = this.order_workflow;
        if (orderWorkflow != null) {
            arrayList.add("order_workflow=" + orderWorkflow);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateOrderRequest{", "}", 0, null, null, 56);
    }
}
