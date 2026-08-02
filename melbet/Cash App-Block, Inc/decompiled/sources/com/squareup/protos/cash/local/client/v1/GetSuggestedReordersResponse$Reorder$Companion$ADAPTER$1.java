package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSuggestedReordersResponse$Reorder$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSuggestedReordersResponse.Reorder((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (LocalImage) obj7, (String) obj8, (LocalActionOrdering.PastOrder) obj9, (LocalFulfillment) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
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
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalActionOrdering.PastOrder.ADAPTER, protoReader, obj9);
                    break;
                case 10:
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, protoReader, obj10);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSuggestedReordersResponse.Reorder reorder = (GetSuggestedReordersResponse.Reorder) obj;
        reverseProtoWriter.getClass();
        reorder.getClass();
        reverseProtoWriter.writeBytes(reorder.unknownFields());
        LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 10, reorder.fulfillment);
        LocalActionOrdering.PastOrder.ADAPTER.encodeWithTag(reverseProtoWriter, 9, reorder.order);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, reorder.button_title);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 7, reorder.item_image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, reorder.summary_detail);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, reorder.summary);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, reorder.brand_cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, reorder.attribution_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, reorder.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, reorder.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSuggestedReordersResponse.Reorder reorder = (GetSuggestedReordersResponse.Reorder) obj;
        reorder.getClass();
        int size$okio = reorder.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalFulfillment.ADAPTER.encodedSizeWithTag(10, reorder.fulfillment) + LocalActionOrdering.PastOrder.ADAPTER.encodedSizeWithTag(9, reorder.order) + protoAdapter.encodedSizeWithTag(8, reorder.button_title) + LocalImage.ADAPTER.encodedSizeWithTag(7, reorder.item_image) + protoAdapter.encodedSizeWithTag(6, reorder.summary_detail) + protoAdapter.encodedSizeWithTag(5, reorder.summary) + protoAdapter.encodedSizeWithTag(4, reorder.brand_cashtag) + protoAdapter.encodedSizeWithTag(3, reorder.attribution_key) + protoAdapter.encodedSizeWithTag(2, reorder.location_token) + protoAdapter.encodedSizeWithTag(1, reorder.brand_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSuggestedReordersResponse.Reorder reorder = (GetSuggestedReordersResponse.Reorder) obj;
        reorder.getClass();
        LocalImage localImage = reorder.item_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalActionOrdering.PastOrder pastOrder = reorder.order;
        LocalActionOrdering.PastOrder pastOrder2 = pastOrder != null ? (LocalActionOrdering.PastOrder) LocalActionOrdering.PastOrder.ADAPTER.redact(pastOrder) : null;
        LocalFulfillment localFulfillment = reorder.fulfillment;
        LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = reorder.brand_token;
        String str2 = reorder.location_token;
        String str3 = reorder.attribution_key;
        String str4 = reorder.brand_cashtag;
        String str5 = reorder.summary;
        String str6 = reorder.summary_detail;
        String str7 = reorder.button_title;
        byteString.getClass();
        return new GetSuggestedReordersResponse.Reorder(str, str2, str3, str4, str5, str6, localImage2, str7, pastOrder2, localFulfillment2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSuggestedReordersResponse.Reorder reorder = (GetSuggestedReordersResponse.Reorder) obj;
        reorder.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, reorder.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, reorder.location_token);
        protoAdapter.encodeWithTag(protoWriter, 3, reorder.attribution_key);
        protoAdapter.encodeWithTag(protoWriter, 4, reorder.brand_cashtag);
        protoAdapter.encodeWithTag(protoWriter, 5, reorder.summary);
        protoAdapter.encodeWithTag(protoWriter, 6, reorder.summary_detail);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 7, reorder.item_image);
        protoAdapter.encodeWithTag(protoWriter, 8, reorder.button_title);
        LocalActionOrdering.PastOrder.ADAPTER.encodeWithTag(protoWriter, 9, reorder.order);
        LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 10, reorder.fulfillment);
        protoWriter.writeBytes(reorder.unknownFields());
    }
}
