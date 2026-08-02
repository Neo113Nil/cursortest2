package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenData;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenData$ExplainerSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenData.ExplainerSection((String) obj, (String) obj2, (String) obj3, (String) obj4, (Image) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenData.ExplainerSection explainerSection = (MarketScreenData.ExplainerSection) obj;
        reverseProtoWriter.getClass();
        explainerSection.getClass();
        reverseProtoWriter.writeBytes(explainerSection.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, explainerSection.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, explainerSection.button_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, explainerSection.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, explainerSection.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, explainerSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenData.ExplainerSection explainerSection = (MarketScreenData.ExplainerSection) obj;
        explainerSection.getClass();
        int size$okio = explainerSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Image.ADAPTER.encodedSizeWithTag(5, explainerSection.image) + protoAdapter.encodedSizeWithTag(4, explainerSection.button_client_route) + protoAdapter.encodedSizeWithTag(3, explainerSection.button_text) + protoAdapter.encodedSizeWithTag(2, explainerSection.body) + protoAdapter.encodedSizeWithTag(1, explainerSection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenData.ExplainerSection explainerSection = (MarketScreenData.ExplainerSection) obj;
        explainerSection.getClass();
        Image image = explainerSection.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = explainerSection.title;
        String str2 = explainerSection.body;
        String str3 = explainerSection.button_text;
        String str4 = explainerSection.button_client_route;
        byteString.getClass();
        return new MarketScreenData.ExplainerSection(str, str2, str3, str4, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenData.ExplainerSection explainerSection = (MarketScreenData.ExplainerSection) obj;
        explainerSection.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, explainerSection.title);
        protoAdapter.encodeWithTag(protoWriter, 2, explainerSection.body);
        protoAdapter.encodeWithTag(protoWriter, 3, explainerSection.button_text);
        protoAdapter.encodeWithTag(protoWriter, 4, explainerSection.button_client_route);
        Image.ADAPTER.encodeWithTag(protoWriter, 5, explainerSection.image);
        protoWriter.writeBytes(explainerSection.unknownFields());
    }
}
