package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.MarketingMessageDataKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StackableElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        MarketingMessageDataKt marketingMessageDataKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StackableElement(marketingMessageDataKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                marketingMessageDataKt = new StackableElement$Content$Text((Text) Text.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                marketingMessageDataKt = new StackableElement$Content$RowItem((RowItem) RowItem.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StackableElement stackableElement = (StackableElement) obj;
        reverseProtoWriter.getClass();
        stackableElement.getClass();
        reverseProtoWriter.writeBytes(stackableElement.unknownFields());
        MarketingMessageDataKt marketingMessageDataKt = stackableElement.content;
        if (marketingMessageDataKt instanceof StackableElement$Content$Text) {
            Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((StackableElement$Content$Text) marketingMessageDataKt).value);
        } else if (marketingMessageDataKt instanceof StackableElement$Content$RowItem) {
            RowItem.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((StackableElement$Content$RowItem) marketingMessageDataKt).value);
        } else {
            if (marketingMessageDataKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        StackableElement stackableElement = (StackableElement) obj;
        stackableElement.getClass();
        int size$okio = stackableElement.unknownFields().getSize$okio();
        MarketingMessageDataKt marketingMessageDataKt = stackableElement.content;
        if (marketingMessageDataKt instanceof StackableElement$Content$Text) {
            encodedSizeWithTag = Text.ADAPTER.encodedSizeWithTag(1, ((StackableElement$Content$Text) marketingMessageDataKt).value);
        } else {
            if (!(marketingMessageDataKt instanceof StackableElement$Content$RowItem)) {
                if (marketingMessageDataKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = RowItem.ADAPTER.encodedSizeWithTag(2, ((StackableElement$Content$RowItem) marketingMessageDataKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StackableElement stackableElement = (StackableElement) obj;
        stackableElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        MarketingMessageDataKt marketingMessageDataKt = stackableElement.content;
        byteString.getClass();
        return new StackableElement(marketingMessageDataKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StackableElement stackableElement = (StackableElement) obj;
        stackableElement.getClass();
        MarketingMessageDataKt marketingMessageDataKt = stackableElement.content;
        if (marketingMessageDataKt instanceof StackableElement$Content$Text) {
            Text.ADAPTER.encodeWithTag(protoWriter, 1, ((StackableElement$Content$Text) marketingMessageDataKt).value);
        } else if (marketingMessageDataKt instanceof StackableElement$Content$RowItem) {
            RowItem.ADAPTER.encodeWithTag(protoWriter, 2, ((StackableElement$Content$RowItem) marketingMessageDataKt).value);
        } else if (marketingMessageDataKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(stackableElement.unknownFields());
    }
}
