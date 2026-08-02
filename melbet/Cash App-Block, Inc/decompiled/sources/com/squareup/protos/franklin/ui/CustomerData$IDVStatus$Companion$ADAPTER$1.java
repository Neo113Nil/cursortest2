package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.CustomerData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomerData$IDVStatus$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CustomerData.IDVStatus((CustomerData.IDVStatus.VerificationStatus) obj, (Long) obj2, (CustomerData.IDVStatus.VerificationStatus) obj3, (CustomerData.IDVStatus.VerificationStatus) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CustomerData.IDVStatus.VerificationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = CustomerData.IDVStatus.VerificationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = CustomerData.IDVStatus.VerificationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerData.IDVStatus iDVStatus = (CustomerData.IDVStatus) obj;
        reverseProtoWriter.getClass();
        iDVStatus.getClass();
        reverseProtoWriter.writeBytes(iDVStatus.unknownFields());
        CustomerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1 customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1 = CustomerData.IDVStatus.VerificationStatus.ADAPTER;
        customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 4, iDVStatus.didv_status);
        customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 3, iDVStatus.eidv_status);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, iDVStatus.can_attempt_electronic_idv_at);
        customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 1, iDVStatus.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerData.IDVStatus iDVStatus = (CustomerData.IDVStatus) obj;
        iDVStatus.getClass();
        int size$okio = iDVStatus.unknownFields().getSize$okio();
        CustomerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1 customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1 = CustomerData.IDVStatus.VerificationStatus.ADAPTER;
        return customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodedSizeWithTag(4, iDVStatus.didv_status) + customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodedSizeWithTag(3, iDVStatus.eidv_status) + ProtoAdapter.INT64.encodedSizeWithTag(2, iDVStatus.can_attempt_electronic_idv_at) + customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodedSizeWithTag(1, iDVStatus.status) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerData.IDVStatus iDVStatus = (CustomerData.IDVStatus) obj;
        iDVStatus.getClass();
        ByteString byteString = ByteString.EMPTY;
        CustomerData.IDVStatus.VerificationStatus verificationStatus = iDVStatus.status;
        Long l = iDVStatus.can_attempt_electronic_idv_at;
        CustomerData.IDVStatus.VerificationStatus verificationStatus2 = iDVStatus.eidv_status;
        CustomerData.IDVStatus.VerificationStatus verificationStatus3 = iDVStatus.didv_status;
        byteString.getClass();
        return new CustomerData.IDVStatus(verificationStatus, l, verificationStatus2, verificationStatus3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerData.IDVStatus iDVStatus = (CustomerData.IDVStatus) obj;
        iDVStatus.getClass();
        CustomerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1 customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1 = CustomerData.IDVStatus.VerificationStatus.ADAPTER;
        customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodeWithTag(protoWriter, 1, iDVStatus.status);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, iDVStatus.can_attempt_electronic_idv_at);
        customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodeWithTag(protoWriter, 3, iDVStatus.eidv_status);
        customerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1.encodeWithTag(protoWriter, 4, iDVStatus.didv_status);
        protoWriter.writeBytes(iDVStatus.unknownFields());
    }
}
