package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData((BorrowData.AppletData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BorrowData.AppletData.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData borrowData = (BorrowData) obj;
        reverseProtoWriter.getClass();
        borrowData.getClass();
        reverseProtoWriter.writeBytes(borrowData.unknownFields());
        BorrowData.AppletData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, borrowData.applet_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData borrowData = (BorrowData) obj;
        borrowData.getClass();
        return BorrowData.AppletData.ADAPTER.encodedSizeWithTag(1, borrowData.applet_data) + borrowData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData borrowData = (BorrowData) obj;
        borrowData.getClass();
        BorrowData.AppletData appletData = borrowData.applet_data;
        BorrowData.AppletData appletData2 = appletData != null ? (BorrowData.AppletData) BorrowData.AppletData.ADAPTER.redact(appletData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowData(appletData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData borrowData = (BorrowData) obj;
        borrowData.getClass();
        BorrowData.AppletData.ADAPTER.encodeWithTag(protoWriter, 1, borrowData.applet_data);
        protoWriter.writeBytes(borrowData.unknownFields());
    }
}
