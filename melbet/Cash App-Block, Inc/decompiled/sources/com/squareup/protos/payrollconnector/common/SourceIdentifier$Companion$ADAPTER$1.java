package com.squareup.protos.payrollconnector.common;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SourceIdentifier$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SourceIdentifier((PayrollVendor) obj, (String) obj2, (PayrollProviderType) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PayrollVendor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = PayrollProviderType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SourceIdentifier sourceIdentifier = (SourceIdentifier) obj;
        reverseProtoWriter.getClass();
        sourceIdentifier.getClass();
        reverseProtoWriter.writeBytes(sourceIdentifier.unknownFields());
        PayrollProviderType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, sourceIdentifier.payroll_provider_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, sourceIdentifier.source_id);
        PayrollVendor.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sourceIdentifier.source_vendor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SourceIdentifier sourceIdentifier = (SourceIdentifier) obj;
        sourceIdentifier.getClass();
        return PayrollProviderType.ADAPTER.encodedSizeWithTag(3, sourceIdentifier.payroll_provider_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, sourceIdentifier.source_id) + PayrollVendor.ADAPTER.encodedSizeWithTag(1, sourceIdentifier.source_vendor) + sourceIdentifier.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SourceIdentifier sourceIdentifier = (SourceIdentifier) obj;
        sourceIdentifier.getClass();
        ByteString byteString = ByteString.EMPTY;
        PayrollVendor payrollVendor = sourceIdentifier.source_vendor;
        String str = sourceIdentifier.source_id;
        PayrollProviderType payrollProviderType = sourceIdentifier.payroll_provider_type;
        byteString.getClass();
        return new SourceIdentifier(payrollVendor, str, payrollProviderType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SourceIdentifier sourceIdentifier = (SourceIdentifier) obj;
        sourceIdentifier.getClass();
        PayrollVendor.ADAPTER.encodeWithTag(protoWriter, 1, sourceIdentifier.source_vendor);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sourceIdentifier.source_id);
        PayrollProviderType.ADAPTER.encodeWithTag(protoWriter, 3, sourceIdentifier.payroll_provider_type);
        protoWriter.writeBytes(sourceIdentifier.unknownFields());
    }
}
