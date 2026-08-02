package com.squareup.protos.cash.composer.app;

import app.cash.trifle.delegates.EndEntity$Factory;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        EndEntity$Factory endEntity$Factory = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement(endEntity$Factory, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                endEntity$Factory = new CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement((TextElement) TextElement.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                endEntity$Factory = new CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement((CardTabNullStateSwipeConfig.VisualElement) CardTabNullStateSwipeConfig.VisualElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardTabNullStateSwipeConfig.SwipePage.SwipePageElement swipePageElement = (CardTabNullStateSwipeConfig.SwipePage.SwipePageElement) obj;
        reverseProtoWriter.getClass();
        swipePageElement.getClass();
        reverseProtoWriter.writeBytes(swipePageElement.unknownFields());
        EndEntity$Factory endEntity$Factory = swipePageElement.swipe_page_element;
        if (endEntity$Factory instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) {
            TextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) endEntity$Factory).value);
        } else if (endEntity$Factory instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement) {
            CardTabNullStateSwipeConfig.VisualElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement) endEntity$Factory).value);
        } else {
            if (endEntity$Factory == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardTabNullStateSwipeConfig.SwipePage.SwipePageElement swipePageElement = (CardTabNullStateSwipeConfig.SwipePage.SwipePageElement) obj;
        swipePageElement.getClass();
        int size$okio = swipePageElement.unknownFields().getSize$okio();
        EndEntity$Factory endEntity$Factory = swipePageElement.swipe_page_element;
        if (endEntity$Factory instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) {
            encodedSizeWithTag = TextElement.ADAPTER.encodedSizeWithTag(1, ((CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) endEntity$Factory).value);
        } else {
            if (!(endEntity$Factory instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement)) {
                if (endEntity$Factory == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CardTabNullStateSwipeConfig.VisualElement.ADAPTER.encodedSizeWithTag(2, ((CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement) endEntity$Factory).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardTabNullStateSwipeConfig.SwipePage.SwipePageElement swipePageElement = (CardTabNullStateSwipeConfig.SwipePage.SwipePageElement) obj;
        swipePageElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        EndEntity$Factory endEntity$Factory = swipePageElement.swipe_page_element;
        byteString.getClass();
        return new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement(endEntity$Factory, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardTabNullStateSwipeConfig.SwipePage.SwipePageElement swipePageElement = (CardTabNullStateSwipeConfig.SwipePage.SwipePageElement) obj;
        swipePageElement.getClass();
        EndEntity$Factory endEntity$Factory = swipePageElement.swipe_page_element;
        if (endEntity$Factory instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) {
            TextElement.ADAPTER.encodeWithTag(protoWriter, 1, ((CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) endEntity$Factory).value);
        } else if (endEntity$Factory instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement) {
            CardTabNullStateSwipeConfig.VisualElement.ADAPTER.encodeWithTag(protoWriter, 2, ((CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement) endEntity$Factory).value);
        } else if (endEntity$Factory != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(swipePageElement.unknownFields());
    }
}
