package com.squareup.protos.cash.discover.api.app.v1.message;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDetailsPageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDetailsPageResponse((DetailsPage) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DetailsPage.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) obj;
        reverseProtoWriter.getClass();
        getDetailsPageResponse.getClass();
        reverseProtoWriter.writeBytes(getDetailsPageResponse.unknownFields());
        DetailsPage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getDetailsPageResponse.details_page);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) obj;
        getDetailsPageResponse.getClass();
        return DetailsPage.ADAPTER.encodedSizeWithTag(1, getDetailsPageResponse.details_page) + getDetailsPageResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) obj;
        getDetailsPageResponse.getClass();
        DetailsPage detailsPage = getDetailsPageResponse.details_page;
        DetailsPage detailsPage2 = detailsPage != null ? (DetailsPage) DetailsPage.ADAPTER.redact(detailsPage) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetDetailsPageResponse(detailsPage2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) obj;
        getDetailsPageResponse.getClass();
        DetailsPage.ADAPTER.encodeWithTag(protoWriter, 1, getDetailsPageResponse.details_page);
        protoWriter.writeBytes(getDetailsPageResponse.unknownFields());
    }
}
