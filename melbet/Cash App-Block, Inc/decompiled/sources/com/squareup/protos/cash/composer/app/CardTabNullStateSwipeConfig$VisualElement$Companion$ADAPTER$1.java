package com.squareup.protos.cash.composer.app;

import app.cash.versioned.VersionedKt;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig$VisualElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        VersionedKt versionedKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardTabNullStateSwipeConfig.VisualElement(versionedKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                versionedKt = new CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card((Card) Card.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                versionedKt = new CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts((CardWithBoosts) CardWithBoosts.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                versionedKt = new CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps((CardWithSignatureStamps) CardWithSignatureStamps.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                versionedKt = new CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits((CardWithBenefits) CardWithBenefits.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardTabNullStateSwipeConfig.VisualElement visualElement = (CardTabNullStateSwipeConfig.VisualElement) obj;
        reverseProtoWriter.getClass();
        visualElement.getClass();
        reverseProtoWriter.writeBytes(visualElement.unknownFields());
        VersionedKt versionedKt = visualElement.visual_element;
        if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) {
            Card.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) versionedKt).value);
            return;
        }
        if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) {
            CardWithBoosts.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) versionedKt).value);
            return;
        }
        if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) {
            CardWithSignatureStamps.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) versionedKt).value);
        } else if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits) {
            CardWithBenefits.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits) versionedKt).value);
        } else {
            if (versionedKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardTabNullStateSwipeConfig.VisualElement visualElement = (CardTabNullStateSwipeConfig.VisualElement) obj;
        visualElement.getClass();
        int size$okio = visualElement.unknownFields().getSize$okio();
        VersionedKt versionedKt = visualElement.visual_element;
        if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) {
            encodedSizeWithTag = Card.ADAPTER.encodedSizeWithTag(1, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) versionedKt).value);
        } else if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) {
            encodedSizeWithTag = CardWithBoosts.ADAPTER.encodedSizeWithTag(2, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) versionedKt).value);
        } else if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) {
            encodedSizeWithTag = CardWithSignatureStamps.ADAPTER.encodedSizeWithTag(3, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) versionedKt).value);
        } else {
            if (!(versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits)) {
                if (versionedKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CardWithBenefits.ADAPTER.encodedSizeWithTag(4, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits) versionedKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardTabNullStateSwipeConfig.VisualElement visualElement = (CardTabNullStateSwipeConfig.VisualElement) obj;
        visualElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        VersionedKt versionedKt = visualElement.visual_element;
        byteString.getClass();
        return new CardTabNullStateSwipeConfig.VisualElement(versionedKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardTabNullStateSwipeConfig.VisualElement visualElement = (CardTabNullStateSwipeConfig.VisualElement) obj;
        visualElement.getClass();
        VersionedKt versionedKt = visualElement.visual_element;
        if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) {
            Card.ADAPTER.encodeWithTag(protoWriter, 1, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) versionedKt).value);
        } else if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) {
            CardWithBoosts.ADAPTER.encodeWithTag(protoWriter, 2, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) versionedKt).value);
        } else if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) {
            CardWithSignatureStamps.ADAPTER.encodeWithTag(protoWriter, 3, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) versionedKt).value);
        } else if (versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits) {
            CardWithBenefits.ADAPTER.encodeWithTag(protoWriter, 4, ((CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits) versionedKt).value);
        } else if (versionedKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(visualElement.unknownFields());
    }
}
