package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button((LocalizedString) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button button = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, button.client_route);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button.button_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button button = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button) obj;
        button.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, button.client_route) + LocalizedString.ADAPTER.encodedSizeWithTag(1, button.button_text) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button button = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button) obj;
        button.getClass();
        LocalizedString localizedString = button.button_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button.client_route;
        byteString.getClass();
        return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button(localizedString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button button = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button) obj;
        button.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, button.button_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, button.client_route);
        protoWriter.writeBytes(button.unknownFields());
    }
}
