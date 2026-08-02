package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DepositFeeData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DepositFeeData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DepositFeeData((DepositFeeData.FeeType) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DepositFeeData.FeeType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DepositFeeData depositFeeData = (DepositFeeData) obj;
        reverseProtoWriter.getClass();
        depositFeeData.getClass();
        reverseProtoWriter.writeBytes(depositFeeData.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, depositFeeData.fee_bps);
        DepositFeeData.FeeType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, depositFeeData.fee_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DepositFeeData depositFeeData = (DepositFeeData) obj;
        depositFeeData.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, depositFeeData.fee_bps) + DepositFeeData.FeeType.ADAPTER.encodedSizeWithTag(1, depositFeeData.fee_type) + depositFeeData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DepositFeeData depositFeeData = (DepositFeeData) obj;
        depositFeeData.getClass();
        ByteString byteString = ByteString.EMPTY;
        DepositFeeData.FeeType feeType = depositFeeData.fee_type;
        Long l = depositFeeData.fee_bps;
        byteString.getClass();
        return new DepositFeeData(feeType, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DepositFeeData depositFeeData = (DepositFeeData) obj;
        depositFeeData.getClass();
        DepositFeeData.FeeType.ADAPTER.encodeWithTag(protoWriter, 1, depositFeeData.fee_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, depositFeeData.fee_bps);
        protoWriter.writeBytes(depositFeeData.unknownFields());
    }
}
