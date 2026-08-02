package com.squareup.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ToggleEntryPointData$CardHeader$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ToggleEntryPointData.CardHeader((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToggleEntryPointData.CardHeader cardHeader = (ToggleEntryPointData.CardHeader) obj;
        reverseProtoWriter.getClass();
        cardHeader.getClass();
        reverseProtoWriter.writeBytes(cardHeader.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, cardHeader.pill_client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cardHeader.pill_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardHeader.header_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardHeader.label_header_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ToggleEntryPointData.CardHeader cardHeader = (ToggleEntryPointData.CardHeader) obj;
        cardHeader.getClass();
        int size$okio = cardHeader.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, cardHeader.pill_client_route) + protoAdapter.encodedSizeWithTag(3, cardHeader.pill_text) + protoAdapter.encodedSizeWithTag(2, cardHeader.header_text) + protoAdapter.encodedSizeWithTag(1, cardHeader.label_header_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ToggleEntryPointData.CardHeader cardHeader = (ToggleEntryPointData.CardHeader) obj;
        cardHeader.getClass();
        LocalizedString localizedString = cardHeader.label_header_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = cardHeader.header_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = cardHeader.pill_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cardHeader.pill_client_route;
        byteString.getClass();
        return new ToggleEntryPointData.CardHeader(localizedString2, localizedString4, localizedString6, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToggleEntryPointData.CardHeader cardHeader = (ToggleEntryPointData.CardHeader) obj;
        cardHeader.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cardHeader.label_header_text);
        protoAdapter.encodeWithTag(protoWriter, 2, cardHeader.header_text);
        protoAdapter.encodeWithTag(protoWriter, 3, cardHeader.pill_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, cardHeader.pill_client_route);
        protoWriter.writeBytes(cardHeader.unknownFields());
    }
}
