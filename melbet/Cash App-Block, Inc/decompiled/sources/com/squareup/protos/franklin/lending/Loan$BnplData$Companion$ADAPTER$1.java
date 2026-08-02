package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.Loan;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Loan$BnplData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Loan.BnplData((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Loan.BnplData bnplData = (Loan.BnplData) obj;
        reverseProtoWriter.getClass();
        bnplData.getClass();
        reverseProtoWriter.writeBytes(bnplData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bnplData.merchant_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bnplData.loan_details_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bnplData.split_payment_description);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Loan.BnplData bnplData = (Loan.BnplData) obj;
        bnplData.getClass();
        int size$okio = bnplData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, bnplData.merchant_customer_token) + protoAdapter.encodedSizeWithTag(2, bnplData.loan_details_description) + protoAdapter.encodedSizeWithTag(1, bnplData.split_payment_description) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Loan.BnplData bnplData = (Loan.BnplData) obj;
        bnplData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = bnplData.split_payment_description;
        String str2 = bnplData.loan_details_description;
        String str3 = bnplData.merchant_customer_token;
        byteString.getClass();
        return new Loan.BnplData(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Loan.BnplData bnplData = (Loan.BnplData) obj;
        bnplData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bnplData.split_payment_description);
        protoAdapter.encodeWithTag(protoWriter, 2, bnplData.loan_details_description);
        protoAdapter.encodeWithTag(protoWriter, 3, bnplData.merchant_customer_token);
        protoWriter.writeBytes(bnplData.unknownFields());
    }
}
