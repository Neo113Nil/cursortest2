package com.squareup.protos.cash.customersearch.api.privacy;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSearchPrivacySettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetSearchPrivacySettingsResponse((GetSearchPrivacySettingsResponse.BooleanSetting) obj, (GetSearchPrivacySettingsResponse.BooleanSetting) obj2, (GetSearchPrivacySettingsResponse.BooleanSetting) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSearchPrivacySettingsResponse getSearchPrivacySettingsResponse = (GetSearchPrivacySettingsResponse) obj;
        reverseProtoWriter.getClass();
        getSearchPrivacySettingsResponse.getClass();
        reverseProtoWriter.writeBytes(getSearchPrivacySettingsResponse.unknownFields());
        ProtoAdapter protoAdapter = GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getSearchPrivacySettingsResponse.search_by_phone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getSearchPrivacySettingsResponse.search_by_email);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getSearchPrivacySettingsResponse.search_by_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSearchPrivacySettingsResponse getSearchPrivacySettingsResponse = (GetSearchPrivacySettingsResponse) obj;
        getSearchPrivacySettingsResponse.getClass();
        int size$okio = getSearchPrivacySettingsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, getSearchPrivacySettingsResponse.search_by_phone) + protoAdapter.encodedSizeWithTag(2, getSearchPrivacySettingsResponse.search_by_email) + protoAdapter.encodedSizeWithTag(1, getSearchPrivacySettingsResponse.search_by_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSearchPrivacySettingsResponse getSearchPrivacySettingsResponse = (GetSearchPrivacySettingsResponse) obj;
        getSearchPrivacySettingsResponse.getClass();
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting = getSearchPrivacySettingsResponse.search_by_name;
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting2 = booleanSetting != null ? (GetSearchPrivacySettingsResponse.BooleanSetting) GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER.redact(booleanSetting) : null;
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting3 = getSearchPrivacySettingsResponse.search_by_email;
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting4 = booleanSetting3 != null ? (GetSearchPrivacySettingsResponse.BooleanSetting) GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER.redact(booleanSetting3) : null;
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting5 = getSearchPrivacySettingsResponse.search_by_phone;
        GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting6 = booleanSetting5 != null ? (GetSearchPrivacySettingsResponse.BooleanSetting) GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER.redact(booleanSetting5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSearchPrivacySettingsResponse(booleanSetting2, booleanSetting4, booleanSetting6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSearchPrivacySettingsResponse getSearchPrivacySettingsResponse = (GetSearchPrivacySettingsResponse) obj;
        getSearchPrivacySettingsResponse.getClass();
        ProtoAdapter protoAdapter = GetSearchPrivacySettingsResponse.BooleanSetting.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, getSearchPrivacySettingsResponse.search_by_name);
        protoAdapter.encodeWithTag(protoWriter, 2, getSearchPrivacySettingsResponse.search_by_email);
        protoAdapter.encodeWithTag(protoWriter, 3, getSearchPrivacySettingsResponse.search_by_phone);
        protoWriter.writeBytes(getSearchPrivacySettingsResponse.unknownFields());
    }
}
