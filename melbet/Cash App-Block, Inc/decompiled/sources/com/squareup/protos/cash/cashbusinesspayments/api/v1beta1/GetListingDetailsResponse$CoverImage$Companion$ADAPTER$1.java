package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetListingDetailsResponse$CoverImage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetListingDetailsResponse.CoverImage((Image) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetListingDetailsResponse.CoverImage coverImage = (GetListingDetailsResponse.CoverImage) obj;
        reverseProtoWriter.getClass();
        coverImage.getClass();
        reverseProtoWriter.writeBytes(coverImage.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, coverImage.color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, coverImage.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetListingDetailsResponse.CoverImage coverImage = (GetListingDetailsResponse.CoverImage) obj;
        coverImage.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, coverImage.color) + Image.ADAPTER.encodedSizeWithTag(1, coverImage.image) + coverImage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetListingDetailsResponse.CoverImage coverImage = (GetListingDetailsResponse.CoverImage) obj;
        coverImage.getClass();
        Image image = coverImage.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = coverImage.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetListingDetailsResponse.CoverImage(image2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetListingDetailsResponse.CoverImage coverImage = (GetListingDetailsResponse.CoverImage) obj;
        coverImage.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, coverImage.image);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, coverImage.color);
        protoWriter.writeBytes(coverImage.unknownFields());
    }
}
