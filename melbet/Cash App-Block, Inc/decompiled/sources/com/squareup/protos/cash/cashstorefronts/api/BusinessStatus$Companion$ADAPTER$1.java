package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BusinessStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BusinessStatus((BusinessType) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BusinessType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BusinessStatus businessStatus = (BusinessStatus) obj;
        reverseProtoWriter.getClass();
        businessStatus.getClass();
        reverseProtoWriter.writeBytes(businessStatus.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, businessStatus.is_active);
        BusinessType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, businessStatus.business_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BusinessStatus businessStatus = (BusinessStatus) obj;
        businessStatus.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, businessStatus.is_active) + BusinessType.ADAPTER.encodedSizeWithTag(1, businessStatus.business_type) + businessStatus.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BusinessStatus businessStatus = (BusinessStatus) obj;
        businessStatus.getClass();
        ByteString byteString = ByteString.EMPTY;
        BusinessType businessType = businessStatus.business_type;
        Boolean bool = businessStatus.is_active;
        byteString.getClass();
        return new BusinessStatus(businessType, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BusinessStatus businessStatus = (BusinessStatus) obj;
        businessStatus.getClass();
        BusinessType.ADAPTER.encodeWithTag(protoWriter, 1, businessStatus.business_type);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, businessStatus.is_active);
        protoWriter.writeBytes(businessStatus.unknownFields());
    }
}
