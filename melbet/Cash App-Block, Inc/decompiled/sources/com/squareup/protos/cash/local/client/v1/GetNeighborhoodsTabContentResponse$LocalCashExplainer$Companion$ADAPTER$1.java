package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetNeighborhoodsTabContentResponse$LocalCashExplainer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetNeighborhoodsTabContentResponse.LocalCashExplainer((LocalImage) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer = (GetNeighborhoodsTabContentResponse.LocalCashExplainer) obj;
        reverseProtoWriter.getClass();
        localCashExplainer.getClass();
        reverseProtoWriter.writeBytes(localCashExplainer.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, localCashExplainer.body);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localCashExplainer.hero_image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer = (GetNeighborhoodsTabContentResponse.LocalCashExplainer) obj;
        localCashExplainer.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, localCashExplainer.body) + LocalImage.ADAPTER.encodedSizeWithTag(1, localCashExplainer.hero_image) + localCashExplainer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer = (GetNeighborhoodsTabContentResponse.LocalCashExplainer) obj;
        localCashExplainer.getClass();
        LocalImage localImage = localCashExplainer.hero_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localCashExplainer.body;
        byteString.getClass();
        return new GetNeighborhoodsTabContentResponse.LocalCashExplainer(localImage2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer = (GetNeighborhoodsTabContentResponse.LocalCashExplainer) obj;
        localCashExplainer.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, localCashExplainer.hero_image);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, localCashExplainer.body);
        protoWriter.writeBytes(localCashExplainer.unknownFields());
    }
}
