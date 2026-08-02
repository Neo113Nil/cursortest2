package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreateMobileListingPaymentResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateMobileListingPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreateMobileListingPaymentResponse((CreateMobileListingPaymentResponse.Result) obj, (String) obj2, (String) obj3, (LocalizedString) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CreateMobileListingPaymentResponse.Result.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateMobileListingPaymentResponse createMobileListingPaymentResponse = (CreateMobileListingPaymentResponse) obj;
        reverseProtoWriter.getClass();
        createMobileListingPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(createMobileListingPaymentResponse.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, createMobileListingPaymentResponse.error_body_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, createMobileListingPaymentResponse.error_header_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, createMobileListingPaymentResponse.receipt_client_route_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, createMobileListingPaymentResponse.error);
        CreateMobileListingPaymentResponse.Result.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createMobileListingPaymentResponse.result);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateMobileListingPaymentResponse createMobileListingPaymentResponse = (CreateMobileListingPaymentResponse) obj;
        createMobileListingPaymentResponse.getClass();
        int encodedSizeWithTag = CreateMobileListingPaymentResponse.Result.ADAPTER.encodedSizeWithTag(1, createMobileListingPaymentResponse.result) + createMobileListingPaymentResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, createMobileListingPaymentResponse.receipt_client_route_url) + protoAdapter.encodedSizeWithTag(2, createMobileListingPaymentResponse.error) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(5, createMobileListingPaymentResponse.error_body_text) + protoAdapter2.encodedSizeWithTag(4, createMobileListingPaymentResponse.error_header_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateMobileListingPaymentResponse createMobileListingPaymentResponse = (CreateMobileListingPaymentResponse) obj;
        createMobileListingPaymentResponse.getClass();
        LocalizedString localizedString = createMobileListingPaymentResponse.error_header_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = createMobileListingPaymentResponse.error_body_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        CreateMobileListingPaymentResponse.Result result = createMobileListingPaymentResponse.result;
        String str = createMobileListingPaymentResponse.error;
        String str2 = createMobileListingPaymentResponse.receipt_client_route_url;
        byteString.getClass();
        return new CreateMobileListingPaymentResponse(result, str, str2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateMobileListingPaymentResponse createMobileListingPaymentResponse = (CreateMobileListingPaymentResponse) obj;
        createMobileListingPaymentResponse.getClass();
        CreateMobileListingPaymentResponse.Result.ADAPTER.encodeWithTag(protoWriter, 1, createMobileListingPaymentResponse.result);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, createMobileListingPaymentResponse.error);
        protoAdapter.encodeWithTag(protoWriter, 3, createMobileListingPaymentResponse.receipt_client_route_url);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, createMobileListingPaymentResponse.error_header_text);
        protoAdapter2.encodeWithTag(protoWriter, 5, createMobileListingPaymentResponse.error_body_text);
        protoWriter.writeBytes(createMobileListingPaymentResponse.unknownFields());
    }
}
