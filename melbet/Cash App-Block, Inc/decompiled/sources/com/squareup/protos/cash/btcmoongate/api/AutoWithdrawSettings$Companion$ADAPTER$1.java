package com.squareup.protos.cash.btcmoongate.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AutoWithdrawSettings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AutoWithdrawSettings((Long) obj, (Long) obj2, (String) obj3, (Boolean) obj4, (WithdrawalSpeed) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = WithdrawalSpeed.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AutoWithdrawSettings autoWithdrawSettings = (AutoWithdrawSettings) obj;
        reverseProtoWriter.getClass();
        autoWithdrawSettings.getClass();
        reverseProtoWriter.writeBytes(autoWithdrawSettings.unknownFields());
        WithdrawalSpeed.ADAPTER.encodeWithTag(reverseProtoWriter, 5, autoWithdrawSettings.withdrawal_speed);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, autoWithdrawSettings.enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, autoWithdrawSettings.wallet_address);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, autoWithdrawSettings.keep_in_cash_app_sats);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, autoWithdrawSettings.threshold_sats);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AutoWithdrawSettings autoWithdrawSettings = (AutoWithdrawSettings) obj;
        autoWithdrawSettings.getClass();
        int size$okio = autoWithdrawSettings.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return WithdrawalSpeed.ADAPTER.encodedSizeWithTag(5, autoWithdrawSettings.withdrawal_speed) + ProtoAdapter.BOOL.encodedSizeWithTag(4, autoWithdrawSettings.enabled) + ProtoAdapter.STRING.encodedSizeWithTag(3, autoWithdrawSettings.wallet_address) + protoAdapter.encodedSizeWithTag(2, autoWithdrawSettings.keep_in_cash_app_sats) + protoAdapter.encodedSizeWithTag(1, autoWithdrawSettings.threshold_sats) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AutoWithdrawSettings autoWithdrawSettings = (AutoWithdrawSettings) obj;
        autoWithdrawSettings.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = autoWithdrawSettings.threshold_sats;
        Long l2 = autoWithdrawSettings.keep_in_cash_app_sats;
        Boolean bool = autoWithdrawSettings.enabled;
        WithdrawalSpeed withdrawalSpeed = autoWithdrawSettings.withdrawal_speed;
        byteString.getClass();
        return new AutoWithdrawSettings(l, l2, null, bool, withdrawalSpeed, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AutoWithdrawSettings autoWithdrawSettings = (AutoWithdrawSettings) obj;
        autoWithdrawSettings.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, autoWithdrawSettings.threshold_sats);
        protoAdapter.encodeWithTag(protoWriter, 2, autoWithdrawSettings.keep_in_cash_app_sats);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, autoWithdrawSettings.wallet_address);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, autoWithdrawSettings.enabled);
        WithdrawalSpeed.ADAPTER.encodeWithTag(protoWriter, 5, autoWithdrawSettings.withdrawal_speed);
        protoWriter.writeBytes(autoWithdrawSettings.unknownFields());
    }
}
