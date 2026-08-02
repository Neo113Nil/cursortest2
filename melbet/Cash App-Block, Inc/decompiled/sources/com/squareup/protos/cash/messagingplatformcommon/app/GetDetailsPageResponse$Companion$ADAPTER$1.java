package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
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
                return new GetDetailsPageResponse((DetailsPageView) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DetailsPageView.ADAPTER, protoReader, obj);
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
        DetailsPageView.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getDetailsPageResponse.details_page);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) obj;
        getDetailsPageResponse.getClass();
        return DetailsPageView.ADAPTER.encodedSizeWithTag(1, getDetailsPageResponse.details_page) + getDetailsPageResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) obj;
        getDetailsPageResponse.getClass();
        DetailsPageView detailsPageView = getDetailsPageResponse.details_page;
        DetailsPageView detailsPageView2 = detailsPageView != null ? (DetailsPageView) DetailsPageView.ADAPTER.redact(detailsPageView) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetDetailsPageResponse(detailsPageView2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) obj;
        getDetailsPageResponse.getClass();
        DetailsPageView.ADAPTER.encodeWithTag(protoWriter, 1, getDetailsPageResponse.details_page);
        protoWriter.writeBytes(getDetailsPageResponse.unknownFields());
    }
}
