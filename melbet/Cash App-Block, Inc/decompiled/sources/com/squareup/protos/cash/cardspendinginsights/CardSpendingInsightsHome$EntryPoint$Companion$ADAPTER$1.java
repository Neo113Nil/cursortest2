package com.squareup.protos.cash.cardspendinginsights;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSpendingInsightsHome$EntryPoint$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSpendingInsightsHome.EntryPoint((LocalizedString) obj3, (Boolean) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsightsHome.EntryPoint entryPoint = (CardSpendingInsightsHome.EntryPoint) obj;
        reverseProtoWriter.getClass();
        entryPoint.getClass();
        reverseProtoWriter.writeBytes(entryPoint.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, entryPoint.preview_text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, entryPoint.visible);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, entryPoint.client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsightsHome.EntryPoint entryPoint = (CardSpendingInsightsHome.EntryPoint) obj;
        entryPoint.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, entryPoint.preview_text) + ProtoAdapter.BOOL.encodedSizeWithTag(2, entryPoint.visible) + ProtoAdapter.STRING.encodedSizeWithTag(1, entryPoint.client_route) + entryPoint.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSpendingInsightsHome.EntryPoint entryPoint = (CardSpendingInsightsHome.EntryPoint) obj;
        entryPoint.getClass();
        LocalizedString localizedString = entryPoint.preview_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = entryPoint.client_route;
        Boolean bool = entryPoint.visible;
        byteString.getClass();
        return new CardSpendingInsightsHome.EntryPoint(localizedString2, bool, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsightsHome.EntryPoint entryPoint = (CardSpendingInsightsHome.EntryPoint) obj;
        entryPoint.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entryPoint.client_route);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, entryPoint.visible);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, entryPoint.preview_text);
        protoWriter.writeBytes(entryPoint.unknownFields());
    }
}
