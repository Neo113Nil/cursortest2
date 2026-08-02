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

/* loaded from: classes.dex */
public final class BalanceData$Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceData.Button((BalanceData.Button.Action) obj, (ClientScenario) obj2, (BalanceData.Dialog) obj3, (String) obj4, (LocalizableString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BalanceData.Button.Action.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = ClientScenario.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(BalanceData.Dialog.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceData.Button button = (BalanceData.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, button.localizable_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, button.text);
        BalanceData.Dialog.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.dialog);
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.client_scenario);
        BalanceData.Button.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceData.Button button = (BalanceData.Button) obj;
        button.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(5, button.localizable_text) + ProtoAdapter.STRING.encodedSizeWithTag(4, button.text) + BalanceData.Dialog.ADAPTER.encodedSizeWithTag(3, button.dialog) + ClientScenario.ADAPTER.encodedSizeWithTag(2, button.client_scenario) + BalanceData.Button.Action.ADAPTER.encodedSizeWithTag(1, button.action) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceData.Button button = (BalanceData.Button) obj;
        button.getClass();
        BalanceData.Dialog dialog = button.dialog;
        BalanceData.Dialog dialog2 = dialog != null ? (BalanceData.Dialog) BalanceData.Dialog.ADAPTER.redact(dialog) : null;
        LocalizableString localizableString = button.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        BalanceData.Button.Action action = button.action;
        ClientScenario clientScenario = button.client_scenario;
        String str = button.text;
        byteString.getClass();
        return new BalanceData.Button(action, clientScenario, dialog2, str, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceData.Button button = (BalanceData.Button) obj;
        button.getClass();
        BalanceData.Button.Action.ADAPTER.encodeWithTag(protoWriter, 1, button.action);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 2, button.client_scenario);
        BalanceData.Dialog.ADAPTER.encodeWithTag(protoWriter, 3, button.dialog);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, button.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 5, button.localizable_text);
        protoWriter.writeBytes(button.unknownFields());
    }
}
