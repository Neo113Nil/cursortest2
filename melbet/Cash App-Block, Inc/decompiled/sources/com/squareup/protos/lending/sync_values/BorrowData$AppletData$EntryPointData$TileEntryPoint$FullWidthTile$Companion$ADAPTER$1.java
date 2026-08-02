package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$FullWidthTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile((LocalizedString) obj, m, (BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile = (BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile) obj;
        reverseProtoWriter.getClass();
        fullWidthTile.getClass();
        reverseProtoWriter.writeBytes(fullWidthTile.unknownFields());
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge.ADAPTER.encodeWithTag(reverseProtoWriter, 3, fullWidthTile.badge);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, fullWidthTile.rows);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fullWidthTile.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile = (BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile) obj;
        fullWidthTile.getClass();
        return BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge.ADAPTER.encodedSizeWithTag(3, fullWidthTile.badge) + BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.ADAPTER.asRepeated().encodedSizeWithTag(2, fullWidthTile.rows) + LocalizedString.ADAPTER.encodedSizeWithTag(1, fullWidthTile.title) + fullWidthTile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile = (BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile) obj;
        fullWidthTile.getClass();
        LocalizedString localizedString = fullWidthTile.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(fullWidthTile.rows, BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.ADAPTER);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge badge = fullWidthTile.badge;
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge badge2 = badge != null ? (BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge) BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge.ADAPTER.redact(badge) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile(localizedString2, m1169redactElements, badge2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile = (BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile) obj;
        fullWidthTile.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, fullWidthTile.title);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, fullWidthTile.rows);
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge.ADAPTER.encodeWithTag(protoWriter, 3, fullWidthTile.badge);
        protoWriter.writeBytes(fullWidthTile.unknownFields());
    }
}
