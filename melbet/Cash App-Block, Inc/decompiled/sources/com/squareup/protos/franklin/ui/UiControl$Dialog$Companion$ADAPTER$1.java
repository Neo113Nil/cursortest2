package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiControl$Dialog$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiControl.Dialog((String) obj, (LocalizableString) obj2, (UiControl.Dialog.Button) obj3, (UiControl.Dialog.Button) obj4, (String) obj5, (LocalizableString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(UiControl.Dialog.Button.ADAPTER, protoReader, obj3);
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(UiControl.Dialog.Button.ADAPTER, protoReader, obj4);
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiControl.Dialog dialog = (UiControl.Dialog) obj;
        reverseProtoWriter.getClass();
        dialog.getClass();
        reverseProtoWriter.writeBytes(dialog.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, dialog.localizable_title_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, dialog.title_text);
        ProtoAdapter protoAdapter3 = UiControl.Dialog.Button.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, dialog.secondary_button);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, dialog.primary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, dialog.localizable_main_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, dialog.main_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiControl.Dialog dialog = (UiControl.Dialog) obj;
        dialog.getClass();
        int size$okio = dialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, dialog.main_text) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, dialog.localizable_main_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = UiControl.Dialog.Button.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(6, dialog.localizable_title_text) + protoAdapter.encodedSizeWithTag(4, dialog.title_text) + protoAdapter3.encodedSizeWithTag(3, dialog.secondary_button) + protoAdapter3.encodedSizeWithTag(2, dialog.primary_button) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiControl.Dialog dialog = (UiControl.Dialog) obj;
        dialog.getClass();
        LocalizableString localizableString = dialog.localizable_main_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        UiControl.Dialog.Button button = dialog.primary_button;
        UiControl.Dialog.Button button2 = button != null ? (UiControl.Dialog.Button) UiControl.Dialog.Button.ADAPTER.redact(button) : null;
        UiControl.Dialog.Button button3 = dialog.secondary_button;
        UiControl.Dialog.Button button4 = button3 != null ? (UiControl.Dialog.Button) UiControl.Dialog.Button.ADAPTER.redact(button3) : null;
        LocalizableString localizableString3 = dialog.localizable_title_text;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = dialog.main_text;
        String str2 = dialog.title_text;
        byteString.getClass();
        return new UiControl.Dialog(str, localizableString2, button2, button4, str2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiControl.Dialog dialog = (UiControl.Dialog) obj;
        dialog.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, dialog.main_text);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, dialog.localizable_main_text);
        ProtoAdapter protoAdapter3 = UiControl.Dialog.Button.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 2, dialog.primary_button);
        protoAdapter3.encodeWithTag(protoWriter, 3, dialog.secondary_button);
        protoAdapter.encodeWithTag(protoWriter, 4, dialog.title_text);
        protoAdapter2.encodeWithTag(protoWriter, 6, dialog.localizable_title_text);
        protoWriter.writeBytes(dialog.unknownFields());
    }
}
