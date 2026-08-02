package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLinksTile$Data$Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletLinksTile.Data.Button((LocalizedString) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLinksTile.Data.Button button = (BorrowAppletLinksTile.Data.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, button.action_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLinksTile.Data.Button button = (BorrowAppletLinksTile.Data.Button) obj;
        button.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, button.text) + ProtoAdapter.STRING.encodedSizeWithTag(1, button.action_url) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLinksTile.Data.Button button = (BorrowAppletLinksTile.Data.Button) obj;
        button.getClass();
        LocalizedString localizedString = button.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button.action_url;
        byteString.getClass();
        return new BorrowAppletLinksTile.Data.Button(localizedString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLinksTile.Data.Button button = (BorrowAppletLinksTile.Data.Button) obj;
        button.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, button.action_url);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, button.text);
        protoWriter.writeBytes(button.unknownFields());
    }
}
