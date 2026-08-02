package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.syncentity.CashUserSettings;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/WriteCashUserSettingsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/WriteCashUserSettingsResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WriteCashUserSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WriteCashUserSettingsResponse((ResponseContext) obj, (CashUserSettings) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CashUserSettings.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WriteCashUserSettingsResponse writeCashUserSettingsResponse = (WriteCashUserSettingsResponse) obj;
        reverseProtoWriter.getClass();
        writeCashUserSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(writeCashUserSettingsResponse.unknownFields());
        CashUserSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 2, writeCashUserSettingsResponse.user_settings);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, writeCashUserSettingsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WriteCashUserSettingsResponse writeCashUserSettingsResponse = (WriteCashUserSettingsResponse) obj;
        writeCashUserSettingsResponse.getClass();
        return CashUserSettings.ADAPTER.encodedSizeWithTag(2, writeCashUserSettingsResponse.user_settings) + ResponseContext.ADAPTER.encodedSizeWithTag(1, writeCashUserSettingsResponse.response_context) + writeCashUserSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WriteCashUserSettingsResponse writeCashUserSettingsResponse = (WriteCashUserSettingsResponse) obj;
        writeCashUserSettingsResponse.getClass();
        ResponseContext responseContext = writeCashUserSettingsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        CashUserSettings cashUserSettings = writeCashUserSettingsResponse.user_settings;
        CashUserSettings cashUserSettings2 = cashUserSettings != null ? (CashUserSettings) CashUserSettings.ADAPTER.redact(cashUserSettings) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new WriteCashUserSettingsResponse(responseContext2, cashUserSettings2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WriteCashUserSettingsResponse writeCashUserSettingsResponse = (WriteCashUserSettingsResponse) obj;
        writeCashUserSettingsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, writeCashUserSettingsResponse.response_context);
        CashUserSettings.ADAPTER.encodeWithTag(protoWriter, 2, writeCashUserSettingsResponse.user_settings);
        protoWriter.writeBytes(writeCashUserSettingsResponse.unknownFields());
    }
}
