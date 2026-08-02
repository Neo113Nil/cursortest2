package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CountdownCaption$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CountdownCaption((Long) obj, (Image) obj2, (StyledText) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CountdownCaption countdownCaption = (CountdownCaption) obj;
        reverseProtoWriter.getClass();
        countdownCaption.getClass();
        reverseProtoWriter.writeBytes(countdownCaption.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, countdownCaption.countdown_to_ms);
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 4, countdownCaption.countdown);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, countdownCaption.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, countdownCaption.expire_at_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CountdownCaption countdownCaption = (CountdownCaption) obj;
        countdownCaption.getClass();
        int size$okio = countdownCaption.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(5, countdownCaption.countdown_to_ms) + StyledText.ADAPTER.encodedSizeWithTag(4, countdownCaption.countdown) + Image.ADAPTER.encodedSizeWithTag(3, countdownCaption.icon) + protoAdapter.encodedSizeWithTag(1, countdownCaption.expire_at_ms) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CountdownCaption countdownCaption = (CountdownCaption) obj;
        countdownCaption.getClass();
        Image image = countdownCaption.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        StyledText styledText = countdownCaption.countdown;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = countdownCaption.expire_at_ms;
        Long l2 = countdownCaption.countdown_to_ms;
        byteString.getClass();
        return new CountdownCaption(l, image2, styledText2, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CountdownCaption countdownCaption = (CountdownCaption) obj;
        countdownCaption.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, countdownCaption.expire_at_ms);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, countdownCaption.icon);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 4, countdownCaption.countdown);
        protoAdapter.encodeWithTag(protoWriter, 5, countdownCaption.countdown_to_ms);
        protoWriter.writeBytes(countdownCaption.unknownFields());
    }
}
