package com.squareup.protos.cash.orderly.plasma;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.orderly.plasma.OmsInitiateLoanPaymentFlowParameters;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OmsInitiateLoanPaymentFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OmsInitiateLoanPaymentFlowParameters((String) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    OmsInitiateLoanPaymentFlowParameters.Product.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OmsInitiateLoanPaymentFlowParameters omsInitiateLoanPaymentFlowParameters = (OmsInitiateLoanPaymentFlowParameters) obj;
        reverseProtoWriter.getClass();
        omsInitiateLoanPaymentFlowParameters.getClass();
        reverseProtoWriter.writeBytes(omsInitiateLoanPaymentFlowParameters.unknownFields());
        OmsInitiateLoanPaymentFlowParameters.Product.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, omsInitiateLoanPaymentFlowParameters.products);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, omsInitiateLoanPaymentFlowParameters.reference_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, omsInitiateLoanPaymentFlowParameters.client_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, omsInitiateLoanPaymentFlowParameters.order_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OmsInitiateLoanPaymentFlowParameters omsInitiateLoanPaymentFlowParameters = (OmsInitiateLoanPaymentFlowParameters) obj;
        omsInitiateLoanPaymentFlowParameters.getClass();
        int size$okio = omsInitiateLoanPaymentFlowParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return OmsInitiateLoanPaymentFlowParameters.Product.ADAPTER.asRepeated().encodedSizeWithTag(4, omsInitiateLoanPaymentFlowParameters.products) + protoAdapter.encodedSizeWithTag(3, omsInitiateLoanPaymentFlowParameters.reference_id) + protoAdapter.encodedSizeWithTag(2, omsInitiateLoanPaymentFlowParameters.client_id) + protoAdapter.encodedSizeWithTag(1, omsInitiateLoanPaymentFlowParameters.order_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OmsInitiateLoanPaymentFlowParameters omsInitiateLoanPaymentFlowParameters = (OmsInitiateLoanPaymentFlowParameters) obj;
        omsInitiateLoanPaymentFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = omsInitiateLoanPaymentFlowParameters.order_id;
        String str2 = omsInitiateLoanPaymentFlowParameters.client_id;
        String str3 = omsInitiateLoanPaymentFlowParameters.reference_id;
        List list = omsInitiateLoanPaymentFlowParameters.products;
        list.getClass();
        byteString.getClass();
        return new OmsInitiateLoanPaymentFlowParameters(str, str2, str3, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OmsInitiateLoanPaymentFlowParameters omsInitiateLoanPaymentFlowParameters = (OmsInitiateLoanPaymentFlowParameters) obj;
        omsInitiateLoanPaymentFlowParameters.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, omsInitiateLoanPaymentFlowParameters.order_id);
        protoAdapter.encodeWithTag(protoWriter, 2, omsInitiateLoanPaymentFlowParameters.client_id);
        protoAdapter.encodeWithTag(protoWriter, 3, omsInitiateLoanPaymentFlowParameters.reference_id);
        OmsInitiateLoanPaymentFlowParameters.Product.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, omsInitiateLoanPaymentFlowParameters.products);
        protoWriter.writeBytes(omsInitiateLoanPaymentFlowParameters.unknownFields());
    }
}
