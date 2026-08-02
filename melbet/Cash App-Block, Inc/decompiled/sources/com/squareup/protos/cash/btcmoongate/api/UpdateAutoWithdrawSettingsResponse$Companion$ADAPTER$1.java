package com.squareup.protos.cash.btcmoongate.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateAutoWithdrawSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateAutoWithdrawSettingsResponse((AutoWithdrawSettings) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AutoWithdrawSettings.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateAutoWithdrawSettingsResponse updateAutoWithdrawSettingsResponse = (UpdateAutoWithdrawSettingsResponse) obj;
        reverseProtoWriter.getClass();
        updateAutoWithdrawSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(updateAutoWithdrawSettingsResponse.unknownFields());
        AutoWithdrawSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateAutoWithdrawSettingsResponse.settings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateAutoWithdrawSettingsResponse updateAutoWithdrawSettingsResponse = (UpdateAutoWithdrawSettingsResponse) obj;
        updateAutoWithdrawSettingsResponse.getClass();
        return AutoWithdrawSettings.ADAPTER.encodedSizeWithTag(1, updateAutoWithdrawSettingsResponse.settings) + updateAutoWithdrawSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateAutoWithdrawSettingsResponse updateAutoWithdrawSettingsResponse = (UpdateAutoWithdrawSettingsResponse) obj;
        updateAutoWithdrawSettingsResponse.getClass();
        AutoWithdrawSettings autoWithdrawSettings = updateAutoWithdrawSettingsResponse.settings;
        AutoWithdrawSettings autoWithdrawSettings2 = autoWithdrawSettings != null ? (AutoWithdrawSettings) AutoWithdrawSettings.ADAPTER.redact(autoWithdrawSettings) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateAutoWithdrawSettingsResponse(autoWithdrawSettings2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateAutoWithdrawSettingsResponse updateAutoWithdrawSettingsResponse = (UpdateAutoWithdrawSettingsResponse) obj;
        updateAutoWithdrawSettingsResponse.getClass();
        AutoWithdrawSettings.ADAPTER.encodeWithTag(protoWriter, 1, updateAutoWithdrawSettingsResponse.settings);
        protoWriter.writeBytes(updateAutoWithdrawSettingsResponse.unknownFields());
    }
}
