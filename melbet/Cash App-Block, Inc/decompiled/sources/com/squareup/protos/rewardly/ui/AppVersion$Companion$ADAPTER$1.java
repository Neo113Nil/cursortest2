package com.squareup.protos.rewardly.ui;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AppVersion$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AppVersion((Platform) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Platform.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppVersion appVersion = (AppVersion) obj;
        reverseProtoWriter.getClass();
        appVersion.getClass();
        reverseProtoWriter.writeBytes(appVersion.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, appVersion.patch_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, appVersion.minor_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, appVersion.major_version);
        Platform.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appVersion.platform);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppVersion appVersion = (AppVersion) obj;
        appVersion.getClass();
        int encodedSizeWithTag = Platform.ADAPTER.encodedSizeWithTag(1, appVersion.platform) + appVersion.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(4, appVersion.patch_version) + protoAdapter.encodedSizeWithTag(3, appVersion.minor_version) + protoAdapter.encodedSizeWithTag(2, appVersion.major_version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppVersion appVersion = (AppVersion) obj;
        appVersion.getClass();
        ByteString byteString = ByteString.EMPTY;
        Platform platform = appVersion.platform;
        Integer num = appVersion.major_version;
        Integer num2 = appVersion.minor_version;
        Integer num3 = appVersion.patch_version;
        byteString.getClass();
        return new AppVersion(platform, num, num2, num3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppVersion appVersion = (AppVersion) obj;
        appVersion.getClass();
        Platform.ADAPTER.encodeWithTag(protoWriter, 1, appVersion.platform);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, appVersion.major_version);
        protoAdapter.encodeWithTag(protoWriter, 3, appVersion.minor_version);
        protoAdapter.encodeWithTag(protoWriter, 4, appVersion.patch_version);
        protoWriter.writeBytes(appVersion.unknownFields());
    }
}
