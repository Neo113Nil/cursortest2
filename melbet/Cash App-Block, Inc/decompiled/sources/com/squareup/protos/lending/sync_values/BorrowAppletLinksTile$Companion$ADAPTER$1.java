package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLinksTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletLinksTile(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Tile.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLinksTile borrowAppletLinksTile = (BorrowAppletLinksTile) obj;
        reverseProtoWriter.getClass();
        borrowAppletLinksTile.getClass();
        reverseProtoWriter.writeBytes(borrowAppletLinksTile.unknownFields());
        Tile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, borrowAppletLinksTile.tiles);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLinksTile borrowAppletLinksTile = (BorrowAppletLinksTile) obj;
        borrowAppletLinksTile.getClass();
        return Tile.ADAPTER.asRepeated().encodedSizeWithTag(1, borrowAppletLinksTile.tiles) + borrowAppletLinksTile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLinksTile borrowAppletLinksTile = (BorrowAppletLinksTile) obj;
        borrowAppletLinksTile.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(borrowAppletLinksTile.tiles, Tile.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowAppletLinksTile(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLinksTile borrowAppletLinksTile = (BorrowAppletLinksTile) obj;
        borrowAppletLinksTile.getClass();
        Tile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, borrowAppletLinksTile.tiles);
        protoWriter.writeBytes(borrowAppletLinksTile.unknownFields());
    }
}
