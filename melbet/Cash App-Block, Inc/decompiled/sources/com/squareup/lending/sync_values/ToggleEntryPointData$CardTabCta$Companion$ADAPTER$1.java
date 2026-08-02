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
public final class ToggleEntryPointData$CardTabCta$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ToggleEntryPointData.CardTabCta((LocalizedString) obj, (LocalizedString) obj2, (ToggleEntryPointData.CardTabCta.Button) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ToggleEntryPointData.CardTabCta.Button.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToggleEntryPointData.CardTabCta cardTabCta = (ToggleEntryPointData.CardTabCta) obj;
        reverseProtoWriter.getClass();
        cardTabCta.getClass();
        reverseProtoWriter.writeBytes(cardTabCta.unknownFields());
        ToggleEntryPointData.CardTabCta.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cardTabCta.button);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardTabCta.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardTabCta.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ToggleEntryPointData.CardTabCta cardTabCta = (ToggleEntryPointData.CardTabCta) obj;
        cardTabCta.getClass();
        int size$okio = cardTabCta.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ToggleEntryPointData.CardTabCta.Button.ADAPTER.encodedSizeWithTag(3, cardTabCta.button) + protoAdapter.encodedSizeWithTag(2, cardTabCta.subtitle) + protoAdapter.encodedSizeWithTag(1, cardTabCta.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ToggleEntryPointData.CardTabCta cardTabCta = (ToggleEntryPointData.CardTabCta) obj;
        cardTabCta.getClass();
        LocalizedString localizedString = cardTabCta.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = cardTabCta.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ToggleEntryPointData.CardTabCta.Button button = cardTabCta.button;
        ToggleEntryPointData.CardTabCta.Button button2 = button != null ? (ToggleEntryPointData.CardTabCta.Button) ToggleEntryPointData.CardTabCta.Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ToggleEntryPointData.CardTabCta(localizedString2, localizedString4, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToggleEntryPointData.CardTabCta cardTabCta = (ToggleEntryPointData.CardTabCta) obj;
        cardTabCta.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cardTabCta.title);
        protoAdapter.encodeWithTag(protoWriter, 2, cardTabCta.subtitle);
        ToggleEntryPointData.CardTabCta.Button.ADAPTER.encodeWithTag(protoWriter, 3, cardTabCta.button);
        protoWriter.writeBytes(cardTabCta.unknownFields());
    }
}
