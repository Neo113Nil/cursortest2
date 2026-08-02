package com.squareup.protos.payrollconnector.common;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Platform$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Platform((String) obj, (String) obj2, (SourceIdentifier) obj3, (PlatformType) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(SourceIdentifier.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = PlatformType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Platform platform = (Platform) obj;
        reverseProtoWriter.getClass();
        platform.getClass();
        reverseProtoWriter.writeBytes(platform.unknownFields());
        PlatformType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, platform.f1405type);
        SourceIdentifier.ADAPTER.encodeWithTag(reverseProtoWriter, 3, platform.source_id);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, platform.canonical_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, platform.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Platform platform = (Platform) obj;
        platform.getClass();
        int size$okio = platform.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return PlatformType.ADAPTER.encodedSizeWithTag(4, platform.f1405type) + SourceIdentifier.ADAPTER.encodedSizeWithTag(3, platform.source_id) + protoAdapter.encodedSizeWithTag(2, platform.canonical_name) + protoAdapter.encodedSizeWithTag(1, platform.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Platform platform = (Platform) obj;
        platform.getClass();
        SourceIdentifier sourceIdentifier = platform.source_id;
        SourceIdentifier sourceIdentifier2 = sourceIdentifier != null ? (SourceIdentifier) SourceIdentifier.ADAPTER.redact(sourceIdentifier) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = platform.token;
        String str2 = platform.canonical_name;
        PlatformType platformType = platform.f1405type;
        byteString.getClass();
        return new Platform(str, str2, sourceIdentifier2, platformType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Platform platform = (Platform) obj;
        platform.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, platform.token);
        protoAdapter.encodeWithTag(protoWriter, 2, platform.canonical_name);
        SourceIdentifier.ADAPTER.encodeWithTag(protoWriter, 3, platform.source_id);
        PlatformType.ADAPTER.encodeWithTag(protoWriter, 4, platform.f1405type);
        protoWriter.writeBytes(platform.unknownFields());
    }
}
