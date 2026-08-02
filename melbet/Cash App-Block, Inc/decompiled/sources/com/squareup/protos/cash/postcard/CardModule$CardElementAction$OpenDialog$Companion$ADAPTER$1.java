package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$OpenDialog$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardModule.CardElementAction.OpenDialog((LocalizedString) obj, (LocalizedString) obj2, (CardModule.CardElementAction.OpenDialog.OpenDialogButton) obj3, (CardModule.CardElementAction.OpenDialog.OpenDialogButton) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(CardModule.CardElementAction.OpenDialog.OpenDialogButton.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(CardModule.CardElementAction.OpenDialog.OpenDialogButton.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.CardElementAction.OpenDialog openDialog = (CardModule.CardElementAction.OpenDialog) obj;
        reverseProtoWriter.getClass();
        openDialog.getClass();
        reverseProtoWriter.writeBytes(openDialog.unknownFields());
        ProtoAdapter protoAdapter = CardModule.CardElementAction.OpenDialog.OpenDialogButton.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, openDialog.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, openDialog.primary_button);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, openDialog.main_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, openDialog.title_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.CardElementAction.OpenDialog openDialog = (CardModule.CardElementAction.OpenDialog) obj;
        openDialog.getClass();
        int size$okio = openDialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, openDialog.main_text) + protoAdapter.encodedSizeWithTag(1, openDialog.title_text) + size$okio;
        ProtoAdapter protoAdapter2 = CardModule.CardElementAction.OpenDialog.OpenDialogButton.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, openDialog.secondary_button) + protoAdapter2.encodedSizeWithTag(3, openDialog.primary_button) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.CardElementAction.OpenDialog openDialog = (CardModule.CardElementAction.OpenDialog) obj;
        openDialog.getClass();
        LocalizedString localizedString = openDialog.title_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = openDialog.main_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton = openDialog.primary_button;
        CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton2 = openDialogButton != null ? (CardModule.CardElementAction.OpenDialog.OpenDialogButton) CardModule.CardElementAction.OpenDialog.OpenDialogButton.ADAPTER.redact(openDialogButton) : null;
        CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton3 = openDialog.secondary_button;
        CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton4 = openDialogButton3 != null ? (CardModule.CardElementAction.OpenDialog.OpenDialogButton) CardModule.CardElementAction.OpenDialog.OpenDialogButton.ADAPTER.redact(openDialogButton3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.CardElementAction.OpenDialog(localizedString2, localizedString4, openDialogButton2, openDialogButton4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.CardElementAction.OpenDialog openDialog = (CardModule.CardElementAction.OpenDialog) obj;
        openDialog.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, openDialog.title_text);
        protoAdapter.encodeWithTag(protoWriter, 2, openDialog.main_text);
        ProtoAdapter protoAdapter2 = CardModule.CardElementAction.OpenDialog.OpenDialogButton.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, openDialog.primary_button);
        protoAdapter2.encodeWithTag(protoWriter, 4, openDialog.secondary_button);
        protoWriter.writeBytes(openDialog.unknownFields());
    }
}
