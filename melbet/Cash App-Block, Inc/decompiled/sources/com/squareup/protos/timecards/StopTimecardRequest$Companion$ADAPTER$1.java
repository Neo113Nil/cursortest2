package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StopTimecardRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StopTimecardRequest((Money) obj7, (Boolean) obj3, (String) obj, (String) obj2, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StopTimecardRequest stopTimecardRequest = (StopTimecardRequest) obj;
        reverseProtoWriter.getClass();
        stopTimecardRequest.getClass();
        reverseProtoWriter.writeBytes(stopTimecardRequest.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 8, stopTimecardRequest.declared_tip);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, stopTimecardRequest.fallback_time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, stopTimecardRequest.clockout_unit_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, stopTimecardRequest.initiating_employee_token);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, stopTimecardRequest.should_also_end_breaks);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, stopTimecardRequest.timecard_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, stopTimecardRequest.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StopTimecardRequest stopTimecardRequest = (StopTimecardRequest) obj;
        stopTimecardRequest.getClass();
        int size$okio = stopTimecardRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(8, stopTimecardRequest.declared_tip) + protoAdapter.encodedSizeWithTag(7, stopTimecardRequest.fallback_time_zone) + protoAdapter.encodedSizeWithTag(6, stopTimecardRequest.clockout_unit_token) + protoAdapter.encodedSizeWithTag(4, stopTimecardRequest.initiating_employee_token) + ProtoAdapter.BOOL.encodedSizeWithTag(3, stopTimecardRequest.should_also_end_breaks) + protoAdapter.encodedSizeWithTag(2, stopTimecardRequest.timecard_token) + protoAdapter.encodedSizeWithTag(1, stopTimecardRequest.merchant_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StopTimecardRequest stopTimecardRequest = (StopTimecardRequest) obj;
        stopTimecardRequest.getClass();
        Money money = stopTimecardRequest.declared_tip;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = stopTimecardRequest.merchant_token;
        String str2 = stopTimecardRequest.timecard_token;
        Boolean bool = stopTimecardRequest.should_also_end_breaks;
        String str3 = stopTimecardRequest.initiating_employee_token;
        String str4 = stopTimecardRequest.clockout_unit_token;
        String str5 = stopTimecardRequest.fallback_time_zone;
        byteString.getClass();
        return new StopTimecardRequest(money2, bool, str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StopTimecardRequest stopTimecardRequest = (StopTimecardRequest) obj;
        stopTimecardRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, stopTimecardRequest.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 2, stopTimecardRequest.timecard_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, stopTimecardRequest.should_also_end_breaks);
        protoAdapter.encodeWithTag(protoWriter, 4, stopTimecardRequest.initiating_employee_token);
        protoAdapter.encodeWithTag(protoWriter, 6, stopTimecardRequest.clockout_unit_token);
        protoAdapter.encodeWithTag(protoWriter, 7, stopTimecardRequest.fallback_time_zone);
        Money.ADAPTER.encodeWithTag(protoWriter, 8, stopTimecardRequest.declared_tip);
        protoWriter.writeBytes(stopTimecardRequest.unknownFields());
    }
}
