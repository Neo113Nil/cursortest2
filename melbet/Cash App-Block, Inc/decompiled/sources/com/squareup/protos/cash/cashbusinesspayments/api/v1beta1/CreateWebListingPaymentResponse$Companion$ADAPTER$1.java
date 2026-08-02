package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreateWebListingPaymentResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateWebListingPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreateWebListingPaymentResponse((CreateWebListingPaymentResponse.Result) obj3, (String) obj4, (String) obj5, (String) obj6, (LocalizedString) obj7, (LocalizedString) obj8, m, (Instant) obj9, (String) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj3 = CreateWebListingPaymentResponse.Result.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
                case 6:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj8);
                    break;
                case 7:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    obj = obj3;
                    obj2 = obj4;
                    obj4 = obj2;
                    obj3 = obj;
                    break;
                case 8:
                    obj9 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj9);
                    break;
                case 9:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    obj4 = obj2;
                    obj3 = obj;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateWebListingPaymentResponse createWebListingPaymentResponse = (CreateWebListingPaymentResponse) obj;
        reverseProtoWriter.getClass();
        createWebListingPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(createWebListingPaymentResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, createWebListingPaymentResponse.transaction_number);
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 8, createWebListingPaymentResponse.paid_at);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 7, createWebListingPaymentResponse.receipt_sent_to);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, createWebListingPaymentResponse.error_body_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, createWebListingPaymentResponse.error_header_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, createWebListingPaymentResponse.receipt_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, createWebListingPaymentResponse.payment_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, createWebListingPaymentResponse.error);
        CreateWebListingPaymentResponse.Result.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createWebListingPaymentResponse.result);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateWebListingPaymentResponse createWebListingPaymentResponse = (CreateWebListingPaymentResponse) obj;
        createWebListingPaymentResponse.getClass();
        int encodedSizeWithTag = CreateWebListingPaymentResponse.Result.ADAPTER.encodedSizeWithTag(1, createWebListingPaymentResponse.result) + createWebListingPaymentResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, createWebListingPaymentResponse.receipt_url) + protoAdapter.encodedSizeWithTag(3, createWebListingPaymentResponse.payment_token) + protoAdapter.encodedSizeWithTag(2, createWebListingPaymentResponse.error) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, createWebListingPaymentResponse.transaction_number) + ProtoAdapter.INSTANT.encodedSizeWithTag(8, createWebListingPaymentResponse.paid_at) + protoAdapter.asRepeated().encodedSizeWithTag(7, createWebListingPaymentResponse.receipt_sent_to) + protoAdapter2.encodedSizeWithTag(6, createWebListingPaymentResponse.error_body_text) + protoAdapter2.encodedSizeWithTag(5, createWebListingPaymentResponse.error_header_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateWebListingPaymentResponse createWebListingPaymentResponse = (CreateWebListingPaymentResponse) obj;
        createWebListingPaymentResponse.getClass();
        LocalizedString localizedString = createWebListingPaymentResponse.error_header_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = createWebListingPaymentResponse.error_body_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        EmptyList emptyList = EmptyList.INSTANCE;
        Instant instant = createWebListingPaymentResponse.paid_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        CreateWebListingPaymentResponse.Result result = createWebListingPaymentResponse.result;
        String str = createWebListingPaymentResponse.error;
        String str2 = createWebListingPaymentResponse.payment_token;
        String str3 = createWebListingPaymentResponse.receipt_url;
        emptyList.getClass();
        byteString.getClass();
        return new CreateWebListingPaymentResponse(result, str, str2, str3, localizedString2, localizedString4, emptyList, instant2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateWebListingPaymentResponse createWebListingPaymentResponse = (CreateWebListingPaymentResponse) obj;
        createWebListingPaymentResponse.getClass();
        CreateWebListingPaymentResponse.Result.ADAPTER.encodeWithTag(protoWriter, 1, createWebListingPaymentResponse.result);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, createWebListingPaymentResponse.error);
        protoAdapter.encodeWithTag(protoWriter, 3, createWebListingPaymentResponse.payment_token);
        protoAdapter.encodeWithTag(protoWriter, 4, createWebListingPaymentResponse.receipt_url);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, createWebListingPaymentResponse.error_header_text);
        protoAdapter2.encodeWithTag(protoWriter, 6, createWebListingPaymentResponse.error_body_text);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, createWebListingPaymentResponse.receipt_sent_to);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 8, createWebListingPaymentResponse.paid_at);
        protoAdapter.encodeWithTag(protoWriter, 9, createWebListingPaymentResponse.transaction_number);
        protoWriter.writeBytes(createWebListingPaymentResponse.unknownFields());
    }
}
