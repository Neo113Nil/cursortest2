package com.squareup.protos.cash.postcard.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class KnotSdkConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new KnotSdkConfig((Boolean) obj, (Boolean) obj2, (KnotEntryPoint) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = KnotEntryPoint.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.INT32.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KnotSdkConfig knotSdkConfig = (KnotSdkConfig) obj;
        reverseProtoWriter.getClass();
        knotSdkConfig.getClass();
        reverseProtoWriter.writeBytes(knotSdkConfig.unknownFields());
        ProtoAdapter.INT32.asRepeated().encodeWithTag(reverseProtoWriter, 4, knotSdkConfig.merchant_ids);
        KnotEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 3, knotSdkConfig.entry_point);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, knotSdkConfig.search);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, knotSdkConfig.categories);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KnotSdkConfig knotSdkConfig = (KnotSdkConfig) obj;
        knotSdkConfig.getClass();
        int size$okio = knotSdkConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(4, knotSdkConfig.merchant_ids) + KnotEntryPoint.ADAPTER.encodedSizeWithTag(3, knotSdkConfig.entry_point) + protoAdapter.encodedSizeWithTag(2, knotSdkConfig.search) + protoAdapter.encodedSizeWithTag(1, knotSdkConfig.categories) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KnotSdkConfig knotSdkConfig = (KnotSdkConfig) obj;
        knotSdkConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = knotSdkConfig.categories;
        Boolean bool2 = knotSdkConfig.search;
        KnotEntryPoint knotEntryPoint = knotSdkConfig.entry_point;
        List list = knotSdkConfig.merchant_ids;
        list.getClass();
        byteString.getClass();
        return new KnotSdkConfig(bool, bool2, knotEntryPoint, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KnotSdkConfig knotSdkConfig = (KnotSdkConfig) obj;
        knotSdkConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, knotSdkConfig.categories);
        protoAdapter.encodeWithTag(protoWriter, 2, knotSdkConfig.search);
        KnotEntryPoint.ADAPTER.encodeWithTag(protoWriter, 3, knotSdkConfig.entry_point);
        ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 4, knotSdkConfig.merchant_ids);
        protoWriter.writeBytes(knotSdkConfig.unknownFields());
    }
}
