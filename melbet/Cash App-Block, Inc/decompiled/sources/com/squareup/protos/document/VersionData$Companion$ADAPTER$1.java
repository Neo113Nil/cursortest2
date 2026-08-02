package com.squareup.protos.document;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.AppVersion;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class VersionData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionData((AppVersion) obj, (AppVersion) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AppVersion.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(AppVersion.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionData versionData = (VersionData) obj;
        reverseProtoWriter.getClass();
        versionData.getClass();
        reverseProtoWriter.writeBytes(versionData.unknownFields());
        ProtoAdapter protoAdapter = AppVersion.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, versionData.max_android_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, versionData.min_android_version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionData versionData = (VersionData) obj;
        versionData.getClass();
        int size$okio = versionData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AppVersion.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, versionData.max_android_version) + protoAdapter.encodedSizeWithTag(1, versionData.min_android_version) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionData versionData = (VersionData) obj;
        versionData.getClass();
        AppVersion appVersion = versionData.min_android_version;
        AppVersion appVersion2 = appVersion != null ? (AppVersion) AppVersion.ADAPTER.redact(appVersion) : null;
        AppVersion appVersion3 = versionData.max_android_version;
        AppVersion appVersion4 = appVersion3 != null ? (AppVersion) AppVersion.ADAPTER.redact(appVersion3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VersionData(appVersion2, appVersion4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionData versionData = (VersionData) obj;
        versionData.getClass();
        ProtoAdapter protoAdapter = AppVersion.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, versionData.min_android_version);
        protoAdapter.encodeWithTag(protoWriter, 2, versionData.max_android_version);
        protoWriter.writeBytes(versionData.unknownFields());
    }
}
