package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModule$SpendingInsightsModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.SpendingInsightsModule((CardModuleElement) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModuleElement.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.SpendingInsightsModule spendingInsightsModule = (CardModule.SpendingInsightsModule) obj;
        reverseProtoWriter.getClass();
        spendingInsightsModule.getClass();
        reverseProtoWriter.writeBytes(spendingInsightsModule.unknownFields());
        CardModuleElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, spendingInsightsModule.element);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.SpendingInsightsModule spendingInsightsModule = (CardModule.SpendingInsightsModule) obj;
        spendingInsightsModule.getClass();
        return CardModuleElement.ADAPTER.encodedSizeWithTag(1, spendingInsightsModule.element) + spendingInsightsModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.SpendingInsightsModule spendingInsightsModule = (CardModule.SpendingInsightsModule) obj;
        spendingInsightsModule.getClass();
        CardModuleElement cardModuleElement = spendingInsightsModule.element;
        CardModuleElement cardModuleElement2 = cardModuleElement != null ? (CardModuleElement) CardModuleElement.ADAPTER.redact(cardModuleElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.SpendingInsightsModule(cardModuleElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.SpendingInsightsModule spendingInsightsModule = (CardModule.SpendingInsightsModule) obj;
        spendingInsightsModule.getClass();
        CardModuleElement.ADAPTER.encodeWithTag(protoWriter, 1, spendingInsightsModule.element);
        protoWriter.writeBytes(spendingInsightsModule.unknownFields());
    }
}
