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
public final class CardModule$CardElementAction$OpenDialog$OpenDialogButton$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardModule.CardElementAction.OpenDialog.OpenDialogButton((LocalizedString) obj, (Boolean) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton = (CardModule.CardElementAction.OpenDialog.OpenDialogButton) obj;
        reverseProtoWriter.getClass();
        openDialogButton.getClass();
        reverseProtoWriter.writeBytes(openDialogButton.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, openDialogButton.client_route);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, openDialogButton.is_destructive);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, openDialogButton.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton = (CardModule.CardElementAction.OpenDialog.OpenDialogButton) obj;
        openDialogButton.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, openDialogButton.client_route) + ProtoAdapter.BOOL.encodedSizeWithTag(2, openDialogButton.is_destructive) + LocalizedString.ADAPTER.encodedSizeWithTag(1, openDialogButton.text) + openDialogButton.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton = (CardModule.CardElementAction.OpenDialog.OpenDialogButton) obj;
        openDialogButton.getClass();
        LocalizedString localizedString = openDialogButton.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = openDialogButton.is_destructive;
        String str = openDialogButton.client_route;
        byteString.getClass();
        return new CardModule.CardElementAction.OpenDialog.OpenDialogButton(localizedString2, bool, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton = (CardModule.CardElementAction.OpenDialog.OpenDialogButton) obj;
        openDialogButton.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, openDialogButton.text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, openDialogButton.is_destructive);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, openDialogButton.client_route);
        protoWriter.writeBytes(openDialogButton.unknownFields());
    }
}
