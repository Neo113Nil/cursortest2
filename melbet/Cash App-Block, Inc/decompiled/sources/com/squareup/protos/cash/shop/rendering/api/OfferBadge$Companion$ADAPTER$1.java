package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferBadge$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferBadge((StyledText) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferBadge offerBadge = (OfferBadge) obj;
        reverseProtoWriter.getClass();
        offerBadge.getClass();
        reverseProtoWriter.writeBytes(offerBadge.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, offerBadge.background_color);
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, offerBadge.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfferBadge offerBadge = (OfferBadge) obj;
        offerBadge.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, offerBadge.background_color) + StyledText.ADAPTER.encodedSizeWithTag(1, offerBadge.title) + offerBadge.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferBadge offerBadge = (OfferBadge) obj;
        offerBadge.getClass();
        StyledText styledText = offerBadge.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        Color color = offerBadge.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OfferBadge(styledText2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferBadge offerBadge = (OfferBadge) obj;
        offerBadge.getClass();
        StyledText.ADAPTER.encodeWithTag(protoWriter, 1, offerBadge.title);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, offerBadge.background_color);
        protoWriter.writeBytes(offerBadge.unknownFields());
    }
}
