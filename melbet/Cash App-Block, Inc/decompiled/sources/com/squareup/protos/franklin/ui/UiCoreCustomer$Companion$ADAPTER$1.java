package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.api.Region;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiCoreCustomer$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiCoreCustomer((String) obj, (Long) obj2, (Region) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = Region.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiCoreCustomer uiCoreCustomer = (UiCoreCustomer) obj;
        reverseProtoWriter.getClass();
        uiCoreCustomer.getClass();
        reverseProtoWriter.writeBytes(uiCoreCustomer.unknownFields());
        Region.ADAPTER.encodeWithTag(reverseProtoWriter, 3, uiCoreCustomer.region);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, uiCoreCustomer.customer_since);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, uiCoreCustomer.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiCoreCustomer uiCoreCustomer = (UiCoreCustomer) obj;
        uiCoreCustomer.getClass();
        return Region.ADAPTER.encodedSizeWithTag(3, uiCoreCustomer.region) + ProtoAdapter.INT64.encodedSizeWithTag(2, uiCoreCustomer.customer_since) + ProtoAdapter.STRING.encodedSizeWithTag(1, uiCoreCustomer.customer_token) + uiCoreCustomer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiCoreCustomer uiCoreCustomer = (UiCoreCustomer) obj;
        uiCoreCustomer.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uiCoreCustomer.customer_token;
        Long l = uiCoreCustomer.customer_since;
        Region region = uiCoreCustomer.region;
        byteString.getClass();
        return new UiCoreCustomer(str, l, region, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiCoreCustomer uiCoreCustomer = (UiCoreCustomer) obj;
        uiCoreCustomer.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uiCoreCustomer.customer_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, uiCoreCustomer.customer_since);
        Region.ADAPTER.encodeWithTag(protoWriter, 3, uiCoreCustomer.region);
        protoWriter.writeBytes(uiCoreCustomer.unknownFields());
    }
}
