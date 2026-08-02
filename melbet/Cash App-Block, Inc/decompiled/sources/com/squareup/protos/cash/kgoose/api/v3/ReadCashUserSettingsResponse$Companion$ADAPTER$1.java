package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.syncentity.CashGlobalUserSettings;
import com.squareup.protos.cash.kgoose.syncentity.CashUserSettings;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ReadCashUserSettingsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ReadCashUserSettingsResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReadCashUserSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReadCashUserSettingsResponse((CashUserSettings) obj, (CashGlobalUserSettings) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashUserSettings.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CashGlobalUserSettings.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReadCashUserSettingsResponse readCashUserSettingsResponse = (ReadCashUserSettingsResponse) obj;
        reverseProtoWriter.getClass();
        readCashUserSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(readCashUserSettingsResponse.unknownFields());
        CashGlobalUserSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 2, readCashUserSettingsResponse.global_user_settings);
        CashUserSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 1, readCashUserSettingsResponse.user_settings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReadCashUserSettingsResponse readCashUserSettingsResponse = (ReadCashUserSettingsResponse) obj;
        readCashUserSettingsResponse.getClass();
        return CashGlobalUserSettings.ADAPTER.encodedSizeWithTag(2, readCashUserSettingsResponse.global_user_settings) + CashUserSettings.ADAPTER.encodedSizeWithTag(1, readCashUserSettingsResponse.user_settings) + readCashUserSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReadCashUserSettingsResponse readCashUserSettingsResponse = (ReadCashUserSettingsResponse) obj;
        readCashUserSettingsResponse.getClass();
        CashUserSettings cashUserSettings = readCashUserSettingsResponse.user_settings;
        CashUserSettings cashUserSettings2 = cashUserSettings != null ? (CashUserSettings) CashUserSettings.ADAPTER.redact(cashUserSettings) : null;
        CashGlobalUserSettings cashGlobalUserSettings = readCashUserSettingsResponse.global_user_settings;
        CashGlobalUserSettings cashGlobalUserSettings2 = cashGlobalUserSettings != null ? (CashGlobalUserSettings) CashGlobalUserSettings.ADAPTER.redact(cashGlobalUserSettings) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ReadCashUserSettingsResponse(cashUserSettings2, cashGlobalUserSettings2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReadCashUserSettingsResponse readCashUserSettingsResponse = (ReadCashUserSettingsResponse) obj;
        readCashUserSettingsResponse.getClass();
        CashUserSettings.ADAPTER.encodeWithTag(protoWriter, 1, readCashUserSettingsResponse.user_settings);
        CashGlobalUserSettings.ADAPTER.encodeWithTag(protoWriter, 2, readCashUserSettingsResponse.global_user_settings);
        protoWriter.writeBytes(readCashUserSettingsResponse.unknownFields());
    }
}
