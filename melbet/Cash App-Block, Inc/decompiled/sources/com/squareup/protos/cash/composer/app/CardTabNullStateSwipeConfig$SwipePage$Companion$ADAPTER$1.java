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
public final class CardTabNullStateSwipeConfig$SwipePage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardTabNullStateSwipeConfig.SwipePage(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardTabNullStateSwipeConfig.SwipePage.SwipePageElement.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardTabNullStateSwipeConfig.SwipePage swipePage = (CardTabNullStateSwipeConfig.SwipePage) obj;
        reverseProtoWriter.getClass();
        swipePage.getClass();
        reverseProtoWriter.writeBytes(swipePage.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, swipePage.analytics_key);
        CardTabNullStateSwipeConfig.SwipePage.SwipePageElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, swipePage.elements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardTabNullStateSwipeConfig.SwipePage swipePage = (CardTabNullStateSwipeConfig.SwipePage) obj;
        swipePage.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, swipePage.analytics_key) + CardTabNullStateSwipeConfig.SwipePage.SwipePageElement.ADAPTER.asRepeated().encodedSizeWithTag(1, swipePage.elements) + swipePage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardTabNullStateSwipeConfig.SwipePage swipePage = (CardTabNullStateSwipeConfig.SwipePage) obj;
        swipePage.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(swipePage.elements, CardTabNullStateSwipeConfig.SwipePage.SwipePageElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = swipePage.analytics_key;
        byteString.getClass();
        return new CardTabNullStateSwipeConfig.SwipePage(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardTabNullStateSwipeConfig.SwipePage swipePage = (CardTabNullStateSwipeConfig.SwipePage) obj;
        swipePage.getClass();
        CardTabNullStateSwipeConfig.SwipePage.SwipePageElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, swipePage.elements);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, swipePage.analytics_key);
        protoWriter.writeBytes(swipePage.unknownFields());
    }
}
