package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.ScientificNumber;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetAmountRequest$PercentageResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetAmountRequest.PercentageResult((ScientificNumber) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ScientificNumber.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetAmountRequest.PercentageResult percentageResult = (SetAmountRequest.PercentageResult) obj;
        reverseProtoWriter.getClass();
        percentageResult.getClass();
        reverseProtoWriter.writeBytes(percentageResult.unknownFields());
        ScientificNumber.ADAPTER.encodeWithTag(reverseProtoWriter, 1, percentageResult.percentage);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetAmountRequest.PercentageResult percentageResult = (SetAmountRequest.PercentageResult) obj;
        percentageResult.getClass();
        return ScientificNumber.ADAPTER.encodedSizeWithTag(1, percentageResult.percentage) + percentageResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetAmountRequest.PercentageResult percentageResult = (SetAmountRequest.PercentageResult) obj;
        percentageResult.getClass();
        ScientificNumber scientificNumber = percentageResult.percentage;
        ScientificNumber scientificNumber2 = scientificNumber != null ? (ScientificNumber) ScientificNumber.ADAPTER.redact(scientificNumber) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetAmountRequest.PercentageResult(scientificNumber2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetAmountRequest.PercentageResult percentageResult = (SetAmountRequest.PercentageResult) obj;
        percentageResult.getClass();
        ScientificNumber.ADAPTER.encodeWithTag(protoWriter, 1, percentageResult.percentage);
        protoWriter.writeBytes(percentageResult.unknownFields());
    }
}
