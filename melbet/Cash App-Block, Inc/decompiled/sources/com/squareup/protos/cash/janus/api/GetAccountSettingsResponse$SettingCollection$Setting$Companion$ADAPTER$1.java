package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetAccountSettingsResponse$SettingCollection$Setting$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAccountSettingsResponse.SettingCollection.Setting((GetAccountSettingsResponse.SettingName) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetAccountSettingsResponse.SettingName.ADAPTER.decode(protoReader);
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
        GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) obj;
        reverseProtoWriter.getClass();
        setting.getClass();
        reverseProtoWriter.writeBytes(setting.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, setting.editable);
        GetAccountSettingsResponse.SettingName.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setting.key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) obj;
        setting.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, setting.editable) + GetAccountSettingsResponse.SettingName.ADAPTER.encodedSizeWithTag(1, setting.key) + setting.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) obj;
        setting.getClass();
        ByteString byteString = ByteString.EMPTY;
        GetAccountSettingsResponse.SettingName settingName = setting.key;
        Boolean bool = setting.editable;
        byteString.getClass();
        return new GetAccountSettingsResponse.SettingCollection.Setting(settingName, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) obj;
        setting.getClass();
        GetAccountSettingsResponse.SettingName.ADAPTER.encodeWithTag(protoWriter, 1, setting.key);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setting.editable);
        protoWriter.writeBytes(setting.unknownFields());
    }
}
