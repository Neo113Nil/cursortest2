package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$DetailText$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText((LocalizedString) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText detailText = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText) obj;
        reverseProtoWriter.getClass();
        detailText.getClass();
        reverseProtoWriter.writeBytes(detailText.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailText.brief);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, detailText.emphasis);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText detailText = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText) obj;
        detailText.getClass();
        int size$okio = detailText.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, detailText.brief) + protoAdapter.encodedSizeWithTag(1, detailText.emphasis) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText detailText = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText) obj;
        detailText.getClass();
        LocalizedString localizedString = detailText.emphasis;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = detailText.brief;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText(localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText detailText = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText) obj;
        detailText.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, detailText.emphasis);
        protoAdapter.encodeWithTag(protoWriter, 2, detailText.brief);
        protoWriter.writeBytes(detailText.unknownFields());
    }
}
