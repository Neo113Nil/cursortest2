package com.squareup.protos.cash.composer.app;

import app.cash.trifle.KeyHandle;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Card$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        KeyHandle.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Card((String) obj, companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                companion = new Card$Asset$Image((Image) Image.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new Card$Asset$Animation((Image) Image.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Card card = (Card) obj;
        reverseProtoWriter.getClass();
        card.getClass();
        reverseProtoWriter.writeBytes(card.unknownFields());
        KeyHandle.Companion companion = card.asset;
        if (companion instanceof Card$Asset$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Card$Asset$Image) companion).value);
        } else if (companion instanceof Card$Asset$Animation) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Card$Asset$Animation) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, card.image_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Card card = (Card) obj;
        card.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, card.image_url) + card.unknownFields().getSize$okio();
        KeyHandle.Companion companion = card.asset;
        if (companion instanceof Card$Asset$Image) {
            return Image.ADAPTER.encodedSizeWithTag(2, ((Card$Asset$Image) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof Card$Asset$Animation) {
            return Image.ADAPTER.encodedSizeWithTag(3, ((Card$Asset$Animation) companion).value) + encodedSizeWithTag;
        }
        if (companion == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Card card = (Card) obj;
        card.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = card.image_url;
        KeyHandle.Companion companion = card.asset;
        byteString.getClass();
        return new Card(str, companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Card card = (Card) obj;
        card.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, card.image_url);
        KeyHandle.Companion companion = card.asset;
        if (companion instanceof Card$Asset$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 2, ((Card$Asset$Image) companion).value);
        } else if (companion instanceof Card$Asset$Animation) {
            Image.ADAPTER.encodeWithTag(protoWriter, 3, ((Card$Asset$Animation) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(card.unknownFields());
    }
}
