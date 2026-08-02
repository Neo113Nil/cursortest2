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
public final class BorrowData$AppletData$EntryPointData$RowEntryPoint$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BorrowData.AppletData.EntryPointData.RowEntryPoint((LocalizedString) obj, (LocalizedString) obj2, (Boolean) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.RowEntryPoint rowEntryPoint = (BorrowData.AppletData.EntryPointData.RowEntryPoint) obj;
        reverseProtoWriter.getClass();
        rowEntryPoint.getClass();
        reverseProtoWriter.writeBytes(rowEntryPoint.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, rowEntryPoint.client_route);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, rowEntryPoint.badged);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, rowEntryPoint.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, rowEntryPoint.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.RowEntryPoint rowEntryPoint = (BorrowData.AppletData.EntryPointData.RowEntryPoint) obj;
        rowEntryPoint.getClass();
        int size$okio = rowEntryPoint.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, rowEntryPoint.client_route) + ProtoAdapter.BOOL.encodedSizeWithTag(3, rowEntryPoint.badged) + protoAdapter.encodedSizeWithTag(2, rowEntryPoint.subtitle) + protoAdapter.encodedSizeWithTag(1, rowEntryPoint.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.RowEntryPoint rowEntryPoint = (BorrowData.AppletData.EntryPointData.RowEntryPoint) obj;
        rowEntryPoint.getClass();
        LocalizedString localizedString = rowEntryPoint.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = rowEntryPoint.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = rowEntryPoint.badged;
        String str = rowEntryPoint.client_route;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.RowEntryPoint(localizedString2, localizedString4, bool, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.RowEntryPoint rowEntryPoint = (BorrowData.AppletData.EntryPointData.RowEntryPoint) obj;
        rowEntryPoint.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, rowEntryPoint.title);
        protoAdapter.encodeWithTag(protoWriter, 2, rowEntryPoint.subtitle);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, rowEntryPoint.badged);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, rowEntryPoint.client_route);
        protoWriter.writeBytes(rowEntryPoint.unknownFields());
    }
}
