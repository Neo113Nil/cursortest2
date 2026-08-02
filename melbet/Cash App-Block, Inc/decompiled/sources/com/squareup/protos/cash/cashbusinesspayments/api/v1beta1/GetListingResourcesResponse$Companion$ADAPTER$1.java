package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetListingResourcesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetListingResourcesResponse(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Image.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(Color.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetListingResourcesResponse getListingResourcesResponse = (GetListingResourcesResponse) obj;
        reverseProtoWriter.getClass();
        getListingResourcesResponse.getClass();
        reverseProtoWriter.writeBytes(getListingResourcesResponse.unknownFields());
        Color.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getListingResourcesResponse.colors);
        Image.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getListingResourcesResponse.images);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetListingResourcesResponse getListingResourcesResponse = (GetListingResourcesResponse) obj;
        getListingResourcesResponse.getClass();
        return Color.ADAPTER.asRepeated().encodedSizeWithTag(2, getListingResourcesResponse.colors) + Image.ADAPTER.asRepeated().encodedSizeWithTag(1, getListingResourcesResponse.images) + getListingResourcesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetListingResourcesResponse getListingResourcesResponse = (GetListingResourcesResponse) obj;
        getListingResourcesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getListingResourcesResponse.images, Image.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getListingResourcesResponse.colors, Color.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetListingResourcesResponse(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetListingResourcesResponse getListingResourcesResponse = (GetListingResourcesResponse) obj;
        getListingResourcesResponse.getClass();
        Image.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getListingResourcesResponse.images);
        Color.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getListingResourcesResponse.colors);
        protoWriter.writeBytes(getListingResourcesResponse.unknownFields());
    }
}
