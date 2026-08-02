package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetAccountSettingsResponse$SettingCollection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAccountSettingsResponse.SettingCollection((GetAccountSettingsResponse.SettingType) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetAccountSettingsResponse.SettingType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GetAccountSettingsResponse.SettingCollection.Setting.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAccountSettingsResponse.SettingCollection settingCollection = (GetAccountSettingsResponse.SettingCollection) obj;
        reverseProtoWriter.getClass();
        settingCollection.getClass();
        reverseProtoWriter.writeBytes(settingCollection.unknownFields());
        GetAccountSettingsResponse.SettingCollection.Setting.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, settingCollection.settings);
        GetAccountSettingsResponse.SettingType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, settingCollection.f1282type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAccountSettingsResponse.SettingCollection settingCollection = (GetAccountSettingsResponse.SettingCollection) obj;
        settingCollection.getClass();
        return GetAccountSettingsResponse.SettingCollection.Setting.ADAPTER.asRepeated().encodedSizeWithTag(2, settingCollection.settings) + GetAccountSettingsResponse.SettingType.ADAPTER.encodedSizeWithTag(1, settingCollection.f1282type) + settingCollection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAccountSettingsResponse.SettingCollection settingCollection = (GetAccountSettingsResponse.SettingCollection) obj;
        settingCollection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(settingCollection.settings, GetAccountSettingsResponse.SettingCollection.Setting.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        GetAccountSettingsResponse.SettingType settingType = settingCollection.f1282type;
        byteString.getClass();
        return new GetAccountSettingsResponse.SettingCollection(settingType, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAccountSettingsResponse.SettingCollection settingCollection = (GetAccountSettingsResponse.SettingCollection) obj;
        settingCollection.getClass();
        GetAccountSettingsResponse.SettingType.ADAPTER.encodeWithTag(protoWriter, 1, settingCollection.f1282type);
        GetAccountSettingsResponse.SettingCollection.Setting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, settingCollection.settings);
        protoWriter.writeBytes(settingCollection.unknownFields());
    }
}
