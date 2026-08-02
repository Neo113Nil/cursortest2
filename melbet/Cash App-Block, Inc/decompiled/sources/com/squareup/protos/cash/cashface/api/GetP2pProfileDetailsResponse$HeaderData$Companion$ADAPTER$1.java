package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.api.GetP2pProfileDetailsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetP2pProfileDetailsResponse$HeaderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetP2pProfileDetailsResponse.HeaderData((String) obj, (Image) obj2, (Color) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetP2pProfileDetailsResponse.HeaderData headerData = (GetP2pProfileDetailsResponse.HeaderData) obj;
        reverseProtoWriter.getClass();
        headerData.getClass();
        reverseProtoWriter.writeBytes(headerData.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 3, headerData.color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, headerData.photo);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, headerData.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetP2pProfileDetailsResponse.HeaderData headerData = (GetP2pProfileDetailsResponse.HeaderData) obj;
        headerData.getClass();
        return Color.ADAPTER.encodedSizeWithTag(3, headerData.color) + Image.ADAPTER.encodedSizeWithTag(2, headerData.photo) + ProtoAdapter.STRING.encodedSizeWithTag(1, headerData.display_name) + headerData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetP2pProfileDetailsResponse.HeaderData headerData = (GetP2pProfileDetailsResponse.HeaderData) obj;
        headerData.getClass();
        Color color = headerData.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetP2pProfileDetailsResponse.HeaderData(null, null, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetP2pProfileDetailsResponse.HeaderData headerData = (GetP2pProfileDetailsResponse.HeaderData) obj;
        headerData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, headerData.display_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 2, headerData.photo);
        Color.ADAPTER.encodeWithTag(protoWriter, 3, headerData.color);
        protoWriter.writeBytes(headerData.unknownFields());
    }
}
