package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo((Boolean) obj, (LendingInfo.AccessData) obj2, (LendingInfo.FirstTimeBorrowData) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LendingInfo.AccessData.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LendingInfo.FirstTimeBorrowData.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo lendingInfo = (LendingInfo) obj;
        reverseProtoWriter.getClass();
        lendingInfo.getClass();
        reverseProtoWriter.writeBytes(lendingInfo.unknownFields());
        LendingInfo.FirstTimeBorrowData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, lendingInfo.first_time_borrow_data);
        LendingInfo.AccessData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, lendingInfo.access_data);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, lendingInfo.potential_future_borrower);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo lendingInfo = (LendingInfo) obj;
        lendingInfo.getClass();
        return LendingInfo.FirstTimeBorrowData.ADAPTER.encodedSizeWithTag(3, lendingInfo.first_time_borrow_data) + LendingInfo.AccessData.ADAPTER.encodedSizeWithTag(2, lendingInfo.access_data) + ProtoAdapter.BOOL.encodedSizeWithTag(1, lendingInfo.potential_future_borrower) + lendingInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo lendingInfo = (LendingInfo) obj;
        lendingInfo.getClass();
        LendingInfo.AccessData accessData = lendingInfo.access_data;
        LendingInfo.AccessData accessData2 = accessData != null ? (LendingInfo.AccessData) LendingInfo.AccessData.ADAPTER.redact(accessData) : null;
        LendingInfo.FirstTimeBorrowData firstTimeBorrowData = lendingInfo.first_time_borrow_data;
        LendingInfo.FirstTimeBorrowData firstTimeBorrowData2 = firstTimeBorrowData != null ? (LendingInfo.FirstTimeBorrowData) LendingInfo.FirstTimeBorrowData.ADAPTER.redact(firstTimeBorrowData) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = lendingInfo.potential_future_borrower;
        byteString.getClass();
        return new LendingInfo(bool, accessData2, firstTimeBorrowData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo lendingInfo = (LendingInfo) obj;
        lendingInfo.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, lendingInfo.potential_future_borrower);
        LendingInfo.AccessData.ADAPTER.encodeWithTag(protoWriter, 2, lendingInfo.access_data);
        LendingInfo.FirstTimeBorrowData.ADAPTER.encodeWithTag(protoWriter, 3, lendingInfo.first_time_borrow_data);
        protoWriter.writeBytes(lendingInfo.unknownFields());
    }
}
