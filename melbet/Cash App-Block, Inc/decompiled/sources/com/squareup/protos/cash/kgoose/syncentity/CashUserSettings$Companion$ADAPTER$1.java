package com.squareup.protos.cash.kgoose.syncentity;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashUserSettings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashUserSettings((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashUserSettings cashUserSettings = (CashUserSettings) obj;
        reverseProtoWriter.getClass();
        cashUserSettings.getClass();
        reverseProtoWriter.writeBytes(cashUserSettings.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, cashUserSettings.moneybot_disclosure_accepted_ts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashUserSettings cashUserSettings = (CashUserSettings) obj;
        cashUserSettings.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, cashUserSettings.moneybot_disclosure_accepted_ts) + cashUserSettings.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashUserSettings cashUserSettings = (CashUserSettings) obj;
        cashUserSettings.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = cashUserSettings.moneybot_disclosure_accepted_ts;
        byteString.getClass();
        return new CashUserSettings(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashUserSettings cashUserSettings = (CashUserSettings) obj;
        cashUserSettings.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cashUserSettings.moneybot_disclosure_accepted_ts);
        protoWriter.writeBytes(cashUserSettings.unknownFields());
    }
}
