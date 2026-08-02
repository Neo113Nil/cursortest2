package com.squareup.protos.cash.pools;

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
public final class PoolLifecycleFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PoolLifecycleFilter(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    PoolLifecycleCategory.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PoolLifecycleFilter poolLifecycleFilter = (PoolLifecycleFilter) obj;
        reverseProtoWriter.getClass();
        poolLifecycleFilter.getClass();
        reverseProtoWriter.writeBytes(poolLifecycleFilter.unknownFields());
        PoolLifecycleCategory.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, poolLifecycleFilter.included_categories);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PoolLifecycleFilter poolLifecycleFilter = (PoolLifecycleFilter) obj;
        poolLifecycleFilter.getClass();
        return PoolLifecycleCategory.ADAPTER.asRepeated().encodedSizeWithTag(1, poolLifecycleFilter.included_categories) + poolLifecycleFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PoolLifecycleFilter poolLifecycleFilter = (PoolLifecycleFilter) obj;
        poolLifecycleFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = poolLifecycleFilter.included_categories;
        list.getClass();
        byteString.getClass();
        return new PoolLifecycleFilter(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PoolLifecycleFilter poolLifecycleFilter = (PoolLifecycleFilter) obj;
        poolLifecycleFilter.getClass();
        PoolLifecycleCategory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, poolLifecycleFilter.included_categories);
        protoWriter.writeBytes(poolLifecycleFilter.unknownFields());
    }
}
