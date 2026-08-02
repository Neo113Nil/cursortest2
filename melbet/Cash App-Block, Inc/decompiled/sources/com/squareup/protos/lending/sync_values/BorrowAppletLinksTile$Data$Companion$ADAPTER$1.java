package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLinksTile$Data$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletLinksTile.Data((LocalizedString) obj, m, (BorrowAppletLinksTile.Data.Button) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(BorrowAppletLinksTile.Data.LinkCell.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BorrowAppletLinksTile.Data.Button.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLinksTile.Data data = (BorrowAppletLinksTile.Data) obj;
        reverseProtoWriter.getClass();
        data.getClass();
        reverseProtoWriter.writeBytes(data.unknownFields());
        BorrowAppletLinksTile.Data.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, data.button);
        BorrowAppletLinksTile.Data.LinkCell.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, data.links);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, data.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLinksTile.Data data = (BorrowAppletLinksTile.Data) obj;
        data.getClass();
        return BorrowAppletLinksTile.Data.Button.ADAPTER.encodedSizeWithTag(3, data.button) + BorrowAppletLinksTile.Data.LinkCell.ADAPTER.asRepeated().encodedSizeWithTag(2, data.links) + LocalizedString.ADAPTER.encodedSizeWithTag(1, data.title) + data.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLinksTile.Data data = (BorrowAppletLinksTile.Data) obj;
        data.getClass();
        LocalizedString localizedString = data.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(data.links, BorrowAppletLinksTile.Data.LinkCell.ADAPTER);
        BorrowAppletLinksTile.Data.Button button = data.button;
        BorrowAppletLinksTile.Data.Button button2 = button != null ? (BorrowAppletLinksTile.Data.Button) BorrowAppletLinksTile.Data.Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowAppletLinksTile.Data(localizedString2, m1169redactElements, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLinksTile.Data data = (BorrowAppletLinksTile.Data) obj;
        data.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, data.title);
        BorrowAppletLinksTile.Data.LinkCell.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, data.links);
        BorrowAppletLinksTile.Data.Button.ADAPTER.encodeWithTag(protoWriter, 3, data.button);
        protoWriter.writeBytes(data.unknownFields());
    }
}
