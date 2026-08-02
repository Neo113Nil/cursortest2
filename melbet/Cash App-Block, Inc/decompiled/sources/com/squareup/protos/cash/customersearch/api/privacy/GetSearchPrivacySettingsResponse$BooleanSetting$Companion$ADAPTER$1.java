package com.squareup.protos.cash.customersearch.api.privacy;

import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSearchPrivacySettingsResponse$BooleanSetting$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSearchPrivacySettingsResponse.BooleanSetting((Boolean) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting = (GetSearchPrivacySettingsResponse.BooleanSetting) obj;
        reverseProtoWriter.getClass();
        booleanSetting.getClass();
        reverseProtoWriter.writeBytes(booleanSetting.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, booleanSetting.editable);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, booleanSetting.setting_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting = (GetSearchPrivacySettingsResponse.BooleanSetting) obj;
        booleanSetting.getClass();
        int size$okio = booleanSetting.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(3, booleanSetting.editable) + protoAdapter.encodedSizeWithTag(1, booleanSetting.setting_value) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting = (GetSearchPrivacySettingsResponse.BooleanSetting) obj;
        booleanSetting.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = booleanSetting.setting_value;
        Boolean bool2 = booleanSetting.editable;
        byteString.getClass();
        return new GetSearchPrivacySettingsResponse.BooleanSetting(bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting = (GetSearchPrivacySettingsResponse.BooleanSetting) obj;
        booleanSetting.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, booleanSetting.setting_value);
        protoAdapter.encodeWithTag(protoWriter, 3, booleanSetting.editable);
        protoWriter.writeBytes(booleanSetting.unknownFields());
    }
}
