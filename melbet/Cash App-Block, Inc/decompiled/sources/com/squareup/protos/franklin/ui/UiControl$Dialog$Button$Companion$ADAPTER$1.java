package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiControl$Dialog$Button$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiControl.Dialog.Button((String) obj, (LocalizableString) obj2, (UiControl.Dialog.Button.Action) obj3, (Money) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj3 = UiControl.Dialog.Button.Action.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            } else if (nextTag == 4) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiControl.Dialog.Button button = (UiControl.Dialog.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, button.url_to_open);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.add_cash_suggested_amount);
        UiControl.Dialog.Button.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.action);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, button.localizable_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, button.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiControl.Dialog.Button button = (UiControl.Dialog.Button) obj;
        button.getClass();
        int size$okio = button.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, button.url_to_open) + Money.ADAPTER.encodedSizeWithTag(3, button.add_cash_suggested_amount) + UiControl.Dialog.Button.Action.ADAPTER.encodedSizeWithTag(2, button.action) + LocalizableString.ADAPTER.encodedSizeWithTag(5, button.localizable_text) + protoAdapter.encodedSizeWithTag(1, button.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiControl.Dialog.Button button = (UiControl.Dialog.Button) obj;
        button.getClass();
        LocalizableString localizableString = button.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        Money money = button.add_cash_suggested_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button.text;
        UiControl.Dialog.Button.Action action = button.action;
        String str2 = button.url_to_open;
        byteString.getClass();
        return new UiControl.Dialog.Button(str, localizableString2, action, money2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiControl.Dialog.Button button = (UiControl.Dialog.Button) obj;
        button.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, button.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 5, button.localizable_text);
        UiControl.Dialog.Button.Action.ADAPTER.encodeWithTag(protoWriter, 2, button.action);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, button.add_cash_suggested_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, button.url_to_open);
        protoWriter.writeBytes(button.unknownFields());
    }
}
