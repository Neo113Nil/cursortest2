package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$HiddenEntryPoint$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData.HiddenEntryPoint((BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint hiddenEntryPoint = (BorrowData.AppletData.EntryPointData.HiddenEntryPoint) obj;
        reverseProtoWriter.getClass();
        hiddenEntryPoint.getClass();
        reverseProtoWriter.writeBytes(hiddenEntryPoint.unknownFields());
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 1, hiddenEntryPoint.hidden_reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint hiddenEntryPoint = (BorrowData.AppletData.EntryPointData.HiddenEntryPoint) obj;
        hiddenEntryPoint.getClass();
        return BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason.ADAPTER.encodedSizeWithTag(1, hiddenEntryPoint.hidden_reason) + hiddenEntryPoint.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint hiddenEntryPoint = (BorrowData.AppletData.EntryPointData.HiddenEntryPoint) obj;
        hiddenEntryPoint.getClass();
        ByteString byteString = ByteString.EMPTY;
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason reason = hiddenEntryPoint.hidden_reason;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData.HiddenEntryPoint(reason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint hiddenEntryPoint = (BorrowData.AppletData.EntryPointData.HiddenEntryPoint) obj;
        hiddenEntryPoint.getClass();
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason.ADAPTER.encodeWithTag(protoWriter, 1, hiddenEntryPoint.hidden_reason);
        protoWriter.writeBytes(hiddenEntryPoint.unknownFields());
    }
}
