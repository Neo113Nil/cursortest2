package com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashPreference$DialogBox$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BalanceBasedAddCashPreference.DialogBox((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceBasedAddCashPreference.DialogBox dialogBox = (BalanceBasedAddCashPreference.DialogBox) obj;
        reverseProtoWriter.getClass();
        dialogBox.getClass();
        reverseProtoWriter.writeBytes(dialogBox.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, dialogBox.client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, dialogBox.dismiss_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, dialogBox.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dialogBox.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dialogBox.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceBasedAddCashPreference.DialogBox dialogBox = (BalanceBasedAddCashPreference.DialogBox) obj;
        dialogBox.getClass();
        int size$okio = dialogBox.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(5, dialogBox.client_route) + protoAdapter.encodedSizeWithTag(4, dialogBox.dismiss_button_text) + protoAdapter.encodedSizeWithTag(3, dialogBox.button_text) + protoAdapter.encodedSizeWithTag(2, dialogBox.description) + protoAdapter.encodedSizeWithTag(1, dialogBox.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceBasedAddCashPreference.DialogBox dialogBox = (BalanceBasedAddCashPreference.DialogBox) obj;
        dialogBox.getClass();
        LocalizedString localizedString = dialogBox.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = dialogBox.description;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = dialogBox.button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = dialogBox.dismiss_button_text;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = dialogBox.client_route;
        byteString.getClass();
        return new BalanceBasedAddCashPreference.DialogBox(localizedString2, localizedString4, localizedString6, localizedString8, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceBasedAddCashPreference.DialogBox dialogBox = (BalanceBasedAddCashPreference.DialogBox) obj;
        dialogBox.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, dialogBox.title);
        protoAdapter.encodeWithTag(protoWriter, 2, dialogBox.description);
        protoAdapter.encodeWithTag(protoWriter, 3, dialogBox.button_text);
        protoAdapter.encodeWithTag(protoWriter, 4, dialogBox.dismiss_button_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, dialogBox.client_route);
        protoWriter.writeBytes(dialogBox.unknownFields());
    }
}
