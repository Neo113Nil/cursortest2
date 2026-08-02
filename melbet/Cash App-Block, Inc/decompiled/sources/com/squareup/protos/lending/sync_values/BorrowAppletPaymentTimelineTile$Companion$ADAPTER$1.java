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
public final class BorrowAppletPaymentTimelineTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletPaymentTimelineTile(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile = (BorrowAppletPaymentTimelineTile) obj;
        reverseProtoWriter.getClass();
        borrowAppletPaymentTimelineTile.getClass();
        reverseProtoWriter.writeBytes(borrowAppletPaymentTimelineTile.unknownFields());
        Tile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, borrowAppletPaymentTimelineTile.tiles);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile = (BorrowAppletPaymentTimelineTile) obj;
        borrowAppletPaymentTimelineTile.getClass();
        return Tile.ADAPTER.asRepeated().encodedSizeWithTag(1, borrowAppletPaymentTimelineTile.tiles) + borrowAppletPaymentTimelineTile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile = (BorrowAppletPaymentTimelineTile) obj;
        borrowAppletPaymentTimelineTile.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(borrowAppletPaymentTimelineTile.tiles, Tile.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowAppletPaymentTimelineTile(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile = (BorrowAppletPaymentTimelineTile) obj;
        borrowAppletPaymentTimelineTile.getClass();
        Tile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, borrowAppletPaymentTimelineTile.tiles);
        protoWriter.writeBytes(borrowAppletPaymentTimelineTile.unknownFields());
    }
}
