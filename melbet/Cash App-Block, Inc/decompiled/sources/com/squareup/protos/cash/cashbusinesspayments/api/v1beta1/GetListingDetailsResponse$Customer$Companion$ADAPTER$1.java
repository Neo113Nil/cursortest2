package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetListingDetailsResponse$Customer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetListingDetailsResponse.Customer((UiAvatar) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetListingDetailsResponse.Customer customer = (GetListingDetailsResponse.Customer) obj;
        reverseProtoWriter.getClass();
        customer.getClass();
        reverseProtoWriter.writeBytes(customer.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, customer.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customer.display_name);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, customer.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetListingDetailsResponse.Customer customer = (GetListingDetailsResponse.Customer) obj;
        customer.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, customer.avatar) + customer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, customer.cashtag) + protoAdapter.encodedSizeWithTag(2, customer.display_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetListingDetailsResponse.Customer customer = (GetListingDetailsResponse.Customer) obj;
        customer.getClass();
        UiAvatar uiAvatar = customer.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetListingDetailsResponse.Customer(uiAvatar2, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetListingDetailsResponse.Customer customer = (GetListingDetailsResponse.Customer) obj;
        customer.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, customer.avatar);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, customer.display_name);
        protoAdapter.encodeWithTag(protoWriter, 3, customer.cashtag);
        protoWriter.writeBytes(customer.unknownFields());
    }
}
