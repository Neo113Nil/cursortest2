package com.squareup.protos.cash.composer.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardTabNullStateSwipeConfig(m, (ButtonElement) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardTabNullStateSwipeConfig.SwipePage.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(ButtonElement.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig = (CardTabNullStateSwipeConfig) obj;
        reverseProtoWriter.getClass();
        cardTabNullStateSwipeConfig.getClass();
        reverseProtoWriter.writeBytes(cardTabNullStateSwipeConfig.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, cardTabNullStateSwipeConfig.analytics_key);
        ButtonElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cardTabNullStateSwipeConfig.button);
        CardTabNullStateSwipeConfig.SwipePage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cardTabNullStateSwipeConfig.swipe_pages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig = (CardTabNullStateSwipeConfig) obj;
        cardTabNullStateSwipeConfig.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, cardTabNullStateSwipeConfig.analytics_key) + ButtonElement.ADAPTER.encodedSizeWithTag(2, cardTabNullStateSwipeConfig.button) + CardTabNullStateSwipeConfig.SwipePage.ADAPTER.asRepeated().encodedSizeWithTag(1, cardTabNullStateSwipeConfig.swipe_pages) + cardTabNullStateSwipeConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig = (CardTabNullStateSwipeConfig) obj;
        cardTabNullStateSwipeConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardTabNullStateSwipeConfig.swipe_pages, CardTabNullStateSwipeConfig.SwipePage.ADAPTER);
        ButtonElement buttonElement = cardTabNullStateSwipeConfig.button;
        ButtonElement buttonElement2 = buttonElement != null ? (ButtonElement) ButtonElement.ADAPTER.redact(buttonElement) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cardTabNullStateSwipeConfig.analytics_key;
        byteString.getClass();
        return new CardTabNullStateSwipeConfig(m1169redactElements, buttonElement2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig = (CardTabNullStateSwipeConfig) obj;
        cardTabNullStateSwipeConfig.getClass();
        CardTabNullStateSwipeConfig.SwipePage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cardTabNullStateSwipeConfig.swipe_pages);
        ButtonElement.ADAPTER.encodeWithTag(protoWriter, 2, cardTabNullStateSwipeConfig.button);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cardTabNullStateSwipeConfig.analytics_key);
        protoWriter.writeBytes(cardTabNullStateSwipeConfig.unknownFields());
    }
}
