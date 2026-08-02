package com.squareup.protos.cash.dataprivacy.settings;

import com.squareup.protos.cash.dataprivacy.settings.DataPrivacySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DataPrivacySetting$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DataPrivacySetting((DataPrivacySetting.System) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DataPrivacySetting.System.ADAPTER.decode(protoReader);
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
        DataPrivacySetting dataPrivacySetting = (DataPrivacySetting) obj;
        reverseProtoWriter.getClass();
        dataPrivacySetting.getClass();
        reverseProtoWriter.writeBytes(dataPrivacySetting.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, dataPrivacySetting.enabled);
        DataPrivacySetting.System.ADAPTER.encodeWithTag(reverseProtoWriter, 1, dataPrivacySetting.system);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DataPrivacySetting dataPrivacySetting = (DataPrivacySetting) obj;
        dataPrivacySetting.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, dataPrivacySetting.enabled) + DataPrivacySetting.System.ADAPTER.encodedSizeWithTag(1, dataPrivacySetting.system) + dataPrivacySetting.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DataPrivacySetting dataPrivacySetting = (DataPrivacySetting) obj;
        dataPrivacySetting.getClass();
        ByteString byteString = ByteString.EMPTY;
        DataPrivacySetting.System system = dataPrivacySetting.system;
        Boolean bool = dataPrivacySetting.enabled;
        byteString.getClass();
        return new DataPrivacySetting(system, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DataPrivacySetting dataPrivacySetting = (DataPrivacySetting) obj;
        dataPrivacySetting.getClass();
        DataPrivacySetting.System.ADAPTER.encodeWithTag(protoWriter, 1, dataPrivacySetting.system);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, dataPrivacySetting.enabled);
        protoWriter.writeBytes(dataPrivacySetting.unknownFields());
    }
}
