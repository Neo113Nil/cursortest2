package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BalanceData$Dialog$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceData.Dialog((String) obj, (LocalizableString) obj2, (String) obj3, (LocalizableString) obj4, (BalanceData.Dialog.Button) obj5, (BalanceData.Dialog.Button) obj6, (BalanceData.Dialog.Button) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(BalanceData.Dialog.Button.ADAPTER, protoReader, obj5);
                    break;
                case 3:
                    obj6 = TransactorKt.decodeMessageOrMerge(BalanceData.Dialog.Button.ADAPTER, protoReader, obj6);
                    break;
                case 4:
                    obj7 = TransactorKt.decodeMessageOrMerge(BalanceData.Dialog.Button.ADAPTER, protoReader, obj7);
                    break;
                case 5:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
                    break;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceData.Dialog dialog = (BalanceData.Dialog) obj;
        reverseProtoWriter.getClass();
        dialog.getClass();
        reverseProtoWriter.writeBytes(dialog.unknownFields());
        ProtoAdapter protoAdapter = BalanceData.Dialog.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, dialog.tertiary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, dialog.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dialog.primary_button);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, dialog.localizable_main_text);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, dialog.main_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, dialog.localizable_title);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, dialog.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceData.Dialog dialog = (BalanceData.Dialog) obj;
        dialog.getClass();
        int size$okio = dialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, dialog.title) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(7, dialog.localizable_main_text) + protoAdapter.encodedSizeWithTag(1, dialog.main_text) + protoAdapter2.encodedSizeWithTag(6, dialog.localizable_title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = BalanceData.Dialog.Button.ADAPTER;
        return protoAdapter3.encodedSizeWithTag(4, dialog.tertiary_button) + protoAdapter3.encodedSizeWithTag(3, dialog.secondary_button) + protoAdapter3.encodedSizeWithTag(2, dialog.primary_button) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceData.Dialog dialog = (BalanceData.Dialog) obj;
        dialog.getClass();
        LocalizableString localizableString = dialog.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = dialog.localizable_main_text;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        BalanceData.Dialog.Button button = dialog.primary_button;
        BalanceData.Dialog.Button button2 = button != null ? (BalanceData.Dialog.Button) BalanceData.Dialog.Button.ADAPTER.redact(button) : null;
        BalanceData.Dialog.Button button3 = dialog.secondary_button;
        BalanceData.Dialog.Button button4 = button3 != null ? (BalanceData.Dialog.Button) BalanceData.Dialog.Button.ADAPTER.redact(button3) : null;
        BalanceData.Dialog.Button button5 = dialog.tertiary_button;
        BalanceData.Dialog.Button button6 = button5 != null ? (BalanceData.Dialog.Button) BalanceData.Dialog.Button.ADAPTER.redact(button5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = dialog.title;
        String str2 = dialog.main_text;
        byteString.getClass();
        return new BalanceData.Dialog(str, localizableString2, str2, localizableString4, button2, button4, button6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceData.Dialog dialog = (BalanceData.Dialog) obj;
        dialog.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 5, dialog.title);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, dialog.localizable_title);
        protoAdapter.encodeWithTag(protoWriter, 1, dialog.main_text);
        protoAdapter2.encodeWithTag(protoWriter, 7, dialog.localizable_main_text);
        ProtoAdapter protoAdapter3 = BalanceData.Dialog.Button.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 2, dialog.primary_button);
        protoAdapter3.encodeWithTag(protoWriter, 3, dialog.secondary_button);
        protoAdapter3.encodeWithTag(protoWriter, 4, dialog.tertiary_button);
        protoWriter.writeBytes(dialog.unknownFields());
    }
}
