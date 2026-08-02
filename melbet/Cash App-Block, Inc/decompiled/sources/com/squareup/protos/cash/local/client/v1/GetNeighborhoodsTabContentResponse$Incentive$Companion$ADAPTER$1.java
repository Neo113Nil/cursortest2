package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetNeighborhoodsTabContentResponse$Incentive$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetNeighborhoodsTabContentResponse.Incentive((LocalImage) obj3, (String) obj, (String) obj2, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.Incentive incentive = (GetNeighborhoodsTabContentResponse.Incentive) obj;
        reverseProtoWriter.getClass();
        incentive.getClass();
        reverseProtoWriter.writeBytes(incentive.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, incentive.client_route);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 3, incentive.hero_image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, incentive.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, incentive.eyebrow_heading);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNeighborhoodsTabContentResponse.Incentive incentive = (GetNeighborhoodsTabContentResponse.Incentive) obj;
        incentive.getClass();
        int size$okio = incentive.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, incentive.client_route) + LocalImage.ADAPTER.encodedSizeWithTag(3, incentive.hero_image) + protoAdapter.encodedSizeWithTag(2, incentive.title) + protoAdapter.encodedSizeWithTag(1, incentive.eyebrow_heading) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNeighborhoodsTabContentResponse.Incentive incentive = (GetNeighborhoodsTabContentResponse.Incentive) obj;
        incentive.getClass();
        LocalImage localImage = incentive.hero_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = incentive.eyebrow_heading;
        String str2 = incentive.title;
        String str3 = incentive.client_route;
        byteString.getClass();
        return new GetNeighborhoodsTabContentResponse.Incentive(localImage2, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.Incentive incentive = (GetNeighborhoodsTabContentResponse.Incentive) obj;
        incentive.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, incentive.eyebrow_heading);
        protoAdapter.encodeWithTag(protoWriter, 2, incentive.title);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 3, incentive.hero_image);
        protoAdapter.encodeWithTag(protoWriter, 4, incentive.client_route);
        protoWriter.writeBytes(incentive.unknownFields());
    }
}
