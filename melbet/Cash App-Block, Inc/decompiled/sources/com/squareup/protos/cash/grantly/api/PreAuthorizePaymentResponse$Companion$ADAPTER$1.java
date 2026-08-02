package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.PreAuthorizePaymentResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PreAuthorizePaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PreAuthorizePaymentResponse((String) obj, m, (Discount) obj2, (ResponseMetadata) obj3, (PreAuthorizePaymentResponse.Result) obj4, (PreAuthorizationData) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    m.add(Discount.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(Discount.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(ResponseMetadata.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    try {
                        obj4 = PreAuthorizePaymentResponse.Result.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(PreAuthorizationData.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PreAuthorizePaymentResponse preAuthorizePaymentResponse = (PreAuthorizePaymentResponse) obj;
        reverseProtoWriter.getClass();
        preAuthorizePaymentResponse.getClass();
        reverseProtoWriter.writeBytes(preAuthorizePaymentResponse.unknownFields());
        PreAuthorizationData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, preAuthorizePaymentResponse.pre_authorization_data);
        PreAuthorizePaymentResponse.Result.ADAPTER.encodeWithTag(reverseProtoWriter, 5, preAuthorizePaymentResponse.result);
        ResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 4, preAuthorizePaymentResponse.metadata);
        ProtoAdapter protoAdapter = Discount.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, preAuthorizePaymentResponse.auto_selected_discount);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, preAuthorizePaymentResponse.eligible_discounts);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, preAuthorizePaymentResponse.pre_auth_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PreAuthorizePaymentResponse preAuthorizePaymentResponse = (PreAuthorizePaymentResponse) obj;
        preAuthorizePaymentResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, preAuthorizePaymentResponse.pre_auth_token) + preAuthorizePaymentResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Discount.ADAPTER;
        return PreAuthorizationData.ADAPTER.encodedSizeWithTag(6, preAuthorizePaymentResponse.pre_authorization_data) + PreAuthorizePaymentResponse.Result.ADAPTER.encodedSizeWithTag(5, preAuthorizePaymentResponse.result) + ResponseMetadata.ADAPTER.encodedSizeWithTag(4, preAuthorizePaymentResponse.metadata) + protoAdapter.encodedSizeWithTag(3, preAuthorizePaymentResponse.auto_selected_discount) + protoAdapter.asRepeated().encodedSizeWithTag(2, preAuthorizePaymentResponse.eligible_discounts) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PreAuthorizePaymentResponse preAuthorizePaymentResponse = (PreAuthorizePaymentResponse) obj;
        preAuthorizePaymentResponse.getClass();
        List list = preAuthorizePaymentResponse.eligible_discounts;
        ProtoAdapter protoAdapter = Discount.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        Discount discount = preAuthorizePaymentResponse.auto_selected_discount;
        Discount discount2 = discount != null ? (Discount) protoAdapter.redact(discount) : null;
        ResponseMetadata responseMetadata = preAuthorizePaymentResponse.metadata;
        ResponseMetadata responseMetadata2 = responseMetadata != null ? (ResponseMetadata) ResponseMetadata.ADAPTER.redact(responseMetadata) : null;
        PreAuthorizationData preAuthorizationData = preAuthorizePaymentResponse.pre_authorization_data;
        PreAuthorizationData preAuthorizationData2 = preAuthorizationData != null ? (PreAuthorizationData) PreAuthorizationData.ADAPTER.redact(preAuthorizationData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = preAuthorizePaymentResponse.pre_auth_token;
        PreAuthorizePaymentResponse.Result result = preAuthorizePaymentResponse.result;
        byteString.getClass();
        return new PreAuthorizePaymentResponse(str, m1169redactElements, discount2, responseMetadata2, result, preAuthorizationData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PreAuthorizePaymentResponse preAuthorizePaymentResponse = (PreAuthorizePaymentResponse) obj;
        preAuthorizePaymentResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, preAuthorizePaymentResponse.pre_auth_token);
        ProtoAdapter protoAdapter = Discount.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, preAuthorizePaymentResponse.eligible_discounts);
        protoAdapter.encodeWithTag(protoWriter, 3, preAuthorizePaymentResponse.auto_selected_discount);
        ResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 4, preAuthorizePaymentResponse.metadata);
        PreAuthorizePaymentResponse.Result.ADAPTER.encodeWithTag(protoWriter, 5, preAuthorizePaymentResponse.result);
        PreAuthorizationData.ADAPTER.encodeWithTag(protoWriter, 6, preAuthorizePaymentResponse.pre_authorization_data);
        protoWriter.writeBytes(preAuthorizePaymentResponse.unknownFields());
    }
}
