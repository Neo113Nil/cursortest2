package com.squareup.lending;

import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreEntryPointData$InstalledState$Graph$Item$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreEntryPointData.InstalledState.Graph.Item((Float) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.FLOAT.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Graph.Item item = (CashCreditScoreEntryPointData.InstalledState.Graph.Item) obj;
        reverseProtoWriter.getClass();
        item.getClass();
        reverseProtoWriter.writeBytes(item.unknownFields());
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 1, item.fill_fraction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Graph.Item item = (CashCreditScoreEntryPointData.InstalledState.Graph.Item) obj;
        item.getClass();
        return ProtoAdapter.FLOAT.encodedSizeWithTag(1, item.fill_fraction) + item.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Graph.Item item = (CashCreditScoreEntryPointData.InstalledState.Graph.Item) obj;
        item.getClass();
        ByteString byteString = ByteString.EMPTY;
        Float f = item.fill_fraction;
        byteString.getClass();
        return new CashCreditScoreEntryPointData.InstalledState.Graph.Item(f, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Graph.Item item = (CashCreditScoreEntryPointData.InstalledState.Graph.Item) obj;
        item.getClass();
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, item.fill_fraction);
        protoWriter.writeBytes(item.unknownFields());
    }
}
