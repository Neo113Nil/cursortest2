package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenMasthead$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenMasthead((LocalImage) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenMasthead marketScreenMasthead = (MarketScreenMasthead) obj;
        reverseProtoWriter.getClass();
        marketScreenMasthead.getClass();
        reverseProtoWriter.writeBytes(marketScreenMasthead.unknownFields());
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 2, marketScreenMasthead.logo);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, marketScreenMasthead.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenMasthead marketScreenMasthead = (MarketScreenMasthead) obj;
        marketScreenMasthead.getClass();
        return LocalImage.ADAPTER.encodedSizeWithTag(2, marketScreenMasthead.logo) + ProtoAdapter.STRING.encodedSizeWithTag(1, marketScreenMasthead.title) + marketScreenMasthead.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenMasthead marketScreenMasthead = (MarketScreenMasthead) obj;
        marketScreenMasthead.getClass();
        LocalImage localImage = marketScreenMasthead.logo;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = marketScreenMasthead.title;
        byteString.getClass();
        return new MarketScreenMasthead(localImage2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenMasthead marketScreenMasthead = (MarketScreenMasthead) obj;
        marketScreenMasthead.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, marketScreenMasthead.title);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 2, marketScreenMasthead.logo);
        protoWriter.writeBytes(marketScreenMasthead.unknownFields());
    }
}
