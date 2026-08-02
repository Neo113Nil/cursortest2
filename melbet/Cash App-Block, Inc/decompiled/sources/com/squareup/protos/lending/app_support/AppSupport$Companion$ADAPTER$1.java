package com.squareup.protos.lending.app_support;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.clients.Version;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AppSupport$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppSupport(m, (Version) obj, (Version) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    AppSupport.Platform.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Version.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Version.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppSupport appSupport = (AppSupport) obj;
        reverseProtoWriter.getClass();
        appSupport.getClass();
        reverseProtoWriter.writeBytes(appSupport.unknownFields());
        ProtoAdapter protoAdapter = Version.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, appSupport.max_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, appSupport.min_version);
        AppSupport.Platform.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, appSupport.platform);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppSupport appSupport = (AppSupport) obj;
        appSupport.getClass();
        int encodedSizeWithTag = AppSupport.Platform.ADAPTER.asRepeated().encodedSizeWithTag(1, appSupport.platform) + appSupport.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Version.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, appSupport.max_version) + protoAdapter.encodedSizeWithTag(2, appSupport.min_version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppSupport appSupport = (AppSupport) obj;
        appSupport.getClass();
        Version version = appSupport.min_version;
        Version version2 = version != null ? (Version) Version.ADAPTER.redact(version) : null;
        Version version3 = appSupport.max_version;
        Version version4 = version3 != null ? (Version) Version.ADAPTER.redact(version3) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = appSupport.platform;
        list.getClass();
        byteString.getClass();
        return new AppSupport(list, version2, version4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppSupport appSupport = (AppSupport) obj;
        appSupport.getClass();
        AppSupport.Platform.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, appSupport.platform);
        ProtoAdapter protoAdapter = Version.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, appSupport.min_version);
        protoAdapter.encodeWithTag(protoWriter, 3, appSupport.max_version);
        protoWriter.writeBytes(appSupport.unknownFields());
    }
}
