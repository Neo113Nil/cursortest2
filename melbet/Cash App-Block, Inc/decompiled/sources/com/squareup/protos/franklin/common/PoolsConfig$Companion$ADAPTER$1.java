package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PoolsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PoolsConfig((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        PoolsConfig poolsConfig = (PoolsConfig) obj;
        reverseProtoWriter.getClass();
        poolsConfig.getClass();
        reverseProtoWriter.writeBytes(poolsConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, poolsConfig.share_background_img_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, poolsConfig.nux_activity_img_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, poolsConfig.nux_details_img_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PoolsConfig poolsConfig = (PoolsConfig) obj;
        poolsConfig.getClass();
        int size$okio = poolsConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, poolsConfig.share_background_img_url) + protoAdapter.encodedSizeWithTag(2, poolsConfig.nux_activity_img_url) + protoAdapter.encodedSizeWithTag(1, poolsConfig.nux_details_img_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PoolsConfig poolsConfig = (PoolsConfig) obj;
        poolsConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = poolsConfig.nux_details_img_url;
        String str2 = poolsConfig.nux_activity_img_url;
        String str3 = poolsConfig.share_background_img_url;
        byteString.getClass();
        return new PoolsConfig(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PoolsConfig poolsConfig = (PoolsConfig) obj;
        poolsConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, poolsConfig.nux_details_img_url);
        protoAdapter.encodeWithTag(protoWriter, 2, poolsConfig.nux_activity_img_url);
        protoAdapter.encodeWithTag(protoWriter, 3, poolsConfig.share_background_img_url);
        protoWriter.writeBytes(poolsConfig.unknownFields());
    }
}
