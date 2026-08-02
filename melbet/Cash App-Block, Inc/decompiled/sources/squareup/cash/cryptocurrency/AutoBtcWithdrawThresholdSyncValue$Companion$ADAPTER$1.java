package squareup.cash.cryptocurrency;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class AutoBtcWithdrawThresholdSyncValue$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AutoBtcWithdrawThresholdSyncValue((Long) obj, (Long) obj2, (WithdrawalSpeed) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = WithdrawalSpeed.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue = (AutoBtcWithdrawThresholdSyncValue) obj;
        reverseProtoWriter.getClass();
        autoBtcWithdrawThresholdSyncValue.getClass();
        reverseProtoWriter.writeBytes(autoBtcWithdrawThresholdSyncValue.unknownFields());
        WithdrawalSpeed.ADAPTER.encodeWithTag(reverseProtoWriter, 3, autoBtcWithdrawThresholdSyncValue.withdrawal_speed);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, autoBtcWithdrawThresholdSyncValue.keep_in_cash_app_sats);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, autoBtcWithdrawThresholdSyncValue.threshold_sats);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue = (AutoBtcWithdrawThresholdSyncValue) obj;
        autoBtcWithdrawThresholdSyncValue.getClass();
        int size$okio = autoBtcWithdrawThresholdSyncValue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return WithdrawalSpeed.ADAPTER.encodedSizeWithTag(3, autoBtcWithdrawThresholdSyncValue.withdrawal_speed) + protoAdapter.encodedSizeWithTag(2, autoBtcWithdrawThresholdSyncValue.keep_in_cash_app_sats) + protoAdapter.encodedSizeWithTag(1, autoBtcWithdrawThresholdSyncValue.threshold_sats) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue = (AutoBtcWithdrawThresholdSyncValue) obj;
        autoBtcWithdrawThresholdSyncValue.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = autoBtcWithdrawThresholdSyncValue.threshold_sats;
        Long l2 = autoBtcWithdrawThresholdSyncValue.keep_in_cash_app_sats;
        WithdrawalSpeed withdrawalSpeed = autoBtcWithdrawThresholdSyncValue.withdrawal_speed;
        byteString.getClass();
        return new AutoBtcWithdrawThresholdSyncValue(l, l2, withdrawalSpeed, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue = (AutoBtcWithdrawThresholdSyncValue) obj;
        autoBtcWithdrawThresholdSyncValue.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, autoBtcWithdrawThresholdSyncValue.threshold_sats);
        protoAdapter.encodeWithTag(protoWriter, 2, autoBtcWithdrawThresholdSyncValue.keep_in_cash_app_sats);
        WithdrawalSpeed.ADAPTER.encodeWithTag(protoWriter, 3, autoBtcWithdrawThresholdSyncValue.withdrawal_speed);
        protoWriter.writeBytes(autoBtcWithdrawThresholdSyncValue.unknownFields());
    }
}
