package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Allocation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation((Color) obj, (Float) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.FLOAT.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation allocation = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation) obj;
        reverseProtoWriter.getClass();
        allocation.getClass();
        reverseProtoWriter.writeBytes(allocation.unknownFields());
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 2, allocation.percent);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, allocation.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation allocation = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation) obj;
        allocation.getClass();
        return ProtoAdapter.FLOAT.encodedSizeWithTag(2, allocation.percent) + Color.ADAPTER.encodedSizeWithTag(1, allocation.color) + allocation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation allocation = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation) obj;
        allocation.getClass();
        Color color = allocation.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Float f = allocation.percent;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation(color2, f, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation allocation = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation) obj;
        allocation.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, allocation.color);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, allocation.percent);
        protoWriter.writeBytes(allocation.unknownFields());
    }
}
