package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BalanceData$Dialog$Button$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BalanceData.Dialog.Button((String) obj, (LocalizableString) obj2, (BalanceData.Dialog.Button.Action) obj3, (ClientScenario) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj3 = BalanceData.Dialog.Button.Action.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                try {
                    obj4 = ClientScenario.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceData.Dialog.Button button = (BalanceData.Dialog.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.client_scenario);
        BalanceData.Dialog.Button.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.action);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, button.localizable_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, button.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceData.Dialog.Button button = (BalanceData.Dialog.Button) obj;
        button.getClass();
        return ClientScenario.ADAPTER.encodedSizeWithTag(3, button.client_scenario) + BalanceData.Dialog.Button.Action.ADAPTER.encodedSizeWithTag(2, button.action) + LocalizableString.ADAPTER.encodedSizeWithTag(4, button.localizable_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, button.text) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceData.Dialog.Button button = (BalanceData.Dialog.Button) obj;
        button.getClass();
        LocalizableString localizableString = button.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button.text;
        BalanceData.Dialog.Button.Action action = button.action;
        ClientScenario clientScenario = button.client_scenario;
        byteString.getClass();
        return new BalanceData.Dialog.Button(str, localizableString2, action, clientScenario, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceData.Dialog.Button button = (BalanceData.Dialog.Button) obj;
        button.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, button.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 4, button.localizable_text);
        BalanceData.Dialog.Button.Action.ADAPTER.encodeWithTag(protoWriter, 2, button.action);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 3, button.client_scenario);
        protoWriter.writeBytes(button.unknownFields());
    }
}
