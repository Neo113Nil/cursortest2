package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Allocations$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations allocations = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations) obj;
        reverseProtoWriter.getClass();
        allocations.getClass();
        reverseProtoWriter.writeBytes(allocations.unknownFields());
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, allocations.values);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations allocations = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations) obj;
        allocations.getClass();
        return BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation.ADAPTER.asRepeated().encodedSizeWithTag(1, allocations.values) + allocations.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations allocations = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations) obj;
        allocations.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(allocations.values, BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations allocations = (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations) obj;
        allocations.getClass();
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, allocations.values);
        protoWriter.writeBytes(allocations.unknownFields());
    }
}
