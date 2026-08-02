package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfflineConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0029. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj19 = obj9;
            if (nextTag == -1) {
                return new OfflineConfig((Boolean) obj4, (String) obj17, m, (StatusResult) obj18, (StatusResult) obj8, (StatusResult) obj19, (StatusResult) obj10, (StatusResult) obj11, (StatusResult) obj12, (StatusResult) obj13, (StatusResult) obj14, (ScenarioPlan) obj15, (ScenarioPlan) obj16, (StatusResult) obj3, (StatusResult) obj7, (ScenarioPlan) obj5, (ScenarioPlan) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj9 = obj19;
                    obj17 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj5;
                    obj2 = obj4;
                    break;
                case 2:
                    obj9 = obj19;
                    obj = obj5;
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    obj5 = obj;
                    break;
                case 3:
                    obj9 = obj19;
                    obj = obj5;
                    obj2 = obj4;
                    obj18 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj18);
                    obj5 = obj;
                    break;
                case 4:
                    obj9 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj19);
                    obj2 = obj4;
                    break;
                case 5:
                    obj11 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj11);
                    obj9 = obj19;
                    obj2 = obj4;
                    break;
                case 6:
                    obj13 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj13);
                    obj9 = obj19;
                    obj2 = obj4;
                    break;
                case 7:
                    m.add(ProtoAdapter.INT64.decode(protoReader));
                    obj2 = obj4;
                    obj9 = obj19;
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj8);
                    obj9 = obj19;
                    obj2 = obj4;
                    break;
                case 9:
                    obj10 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj10);
                    obj9 = obj19;
                    obj2 = obj4;
                    break;
                case 10:
                    obj12 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj12);
                    obj9 = obj19;
                    obj2 = obj4;
                    break;
                case 11:
                    obj14 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj14);
                    obj9 = obj19;
                    obj2 = obj4;
                    break;
                case 12:
                    obj15 = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, protoReader, obj15);
                    obj9 = obj19;
                    obj2 = obj4;
                    break;
                case 13:
                    obj16 = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, protoReader, obj16);
                    obj9 = obj19;
                    obj2 = obj4;
                    break;
                case 14:
                    obj3 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj3);
                    obj2 = obj4;
                    obj9 = obj19;
                    break;
                case 15:
                    obj7 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj7);
                    obj2 = obj4;
                    obj9 = obj19;
                    break;
                case 16:
                    obj5 = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, protoReader, obj5);
                    obj2 = obj4;
                    obj9 = obj19;
                    break;
                case 17:
                    obj6 = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, protoReader, obj6);
                    obj2 = obj4;
                    obj9 = obj19;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj2 = obj4;
                    obj9 = obj19;
                    break;
            }
            obj4 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfflineConfig offlineConfig = (OfflineConfig) obj;
        reverseProtoWriter.getClass();
        offlineConfig.getClass();
        reverseProtoWriter.writeBytes(offlineConfig.unknownFields());
        ProtoAdapter protoAdapter = ScenarioPlan.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, offlineConfig.error_transfer_scenario_plan);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, offlineConfig.offline_transfer_scenario_plan);
        ProtoAdapter protoAdapter2 = StatusResult.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, offlineConfig.error_add_cash_status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, offlineConfig.error_cash_out_status_result);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, offlineConfig.offline_bill_scenario_plan);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, offlineConfig.offline_payment_scenario_plan);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, offlineConfig.offline_add_cash_status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, offlineConfig.attempted_add_cash_status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, offlineConfig.offline_cash_out_status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, offlineConfig.attempted_cash_out_status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, offlineConfig.offline_bill_status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, offlineConfig.attempted_bill_status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, offlineConfig.offline_payment_status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, offlineConfig.attempted_payment_status_result);
        ProtoAdapter.INT64.asRepeated().encodeWithTag(reverseProtoWriter, 7, offlineConfig.retry_intervals);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, offlineConfig.external_status_url);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, offlineConfig.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfflineConfig offlineConfig = (OfflineConfig) obj;
        offlineConfig.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(7, offlineConfig.retry_intervals) + ProtoAdapter.STRING.encodedSizeWithTag(1, offlineConfig.external_status_url) + ProtoAdapter.BOOL.encodedSizeWithTag(2, offlineConfig.enabled) + offlineConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = StatusResult.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(11, offlineConfig.offline_add_cash_status_result) + protoAdapter.encodedSizeWithTag(6, offlineConfig.attempted_add_cash_status_result) + protoAdapter.encodedSizeWithTag(10, offlineConfig.offline_cash_out_status_result) + protoAdapter.encodedSizeWithTag(5, offlineConfig.attempted_cash_out_status_result) + protoAdapter.encodedSizeWithTag(9, offlineConfig.offline_bill_status_result) + protoAdapter.encodedSizeWithTag(4, offlineConfig.attempted_bill_status_result) + protoAdapter.encodedSizeWithTag(8, offlineConfig.offline_payment_status_result) + protoAdapter.encodedSizeWithTag(3, offlineConfig.attempted_payment_status_result) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ScenarioPlan.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(17, offlineConfig.error_transfer_scenario_plan) + protoAdapter2.encodedSizeWithTag(16, offlineConfig.offline_transfer_scenario_plan) + protoAdapter.encodedSizeWithTag(15, offlineConfig.error_add_cash_status_result) + protoAdapter.encodedSizeWithTag(14, offlineConfig.error_cash_out_status_result) + protoAdapter2.encodedSizeWithTag(13, offlineConfig.offline_bill_scenario_plan) + protoAdapter2.encodedSizeWithTag(12, offlineConfig.offline_payment_scenario_plan) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfflineConfig offlineConfig = (OfflineConfig) obj;
        offlineConfig.getClass();
        StatusResult statusResult = offlineConfig.attempted_payment_status_result;
        StatusResult statusResult2 = statusResult != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult) : null;
        StatusResult statusResult3 = offlineConfig.offline_payment_status_result;
        StatusResult statusResult4 = statusResult3 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult3) : null;
        StatusResult statusResult5 = offlineConfig.attempted_bill_status_result;
        StatusResult statusResult6 = statusResult5 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult5) : null;
        StatusResult statusResult7 = offlineConfig.offline_bill_status_result;
        StatusResult statusResult8 = statusResult7 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult7) : null;
        StatusResult statusResult9 = offlineConfig.attempted_cash_out_status_result;
        StatusResult statusResult10 = statusResult9 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult9) : null;
        StatusResult statusResult11 = offlineConfig.offline_cash_out_status_result;
        StatusResult statusResult12 = statusResult11 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult11) : null;
        StatusResult statusResult13 = offlineConfig.attempted_add_cash_status_result;
        StatusResult statusResult14 = statusResult13 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult13) : null;
        StatusResult statusResult15 = offlineConfig.offline_add_cash_status_result;
        StatusResult statusResult16 = statusResult15 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult15) : null;
        ScenarioPlan scenarioPlan = offlineConfig.offline_payment_scenario_plan;
        ScenarioPlan scenarioPlan2 = scenarioPlan != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan) : null;
        ScenarioPlan scenarioPlan3 = offlineConfig.offline_bill_scenario_plan;
        ScenarioPlan scenarioPlan4 = scenarioPlan3 != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan3) : null;
        StatusResult statusResult17 = offlineConfig.error_cash_out_status_result;
        StatusResult statusResult18 = statusResult17 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult17) : null;
        StatusResult statusResult19 = offlineConfig.error_add_cash_status_result;
        StatusResult statusResult20 = statusResult19 != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult19) : null;
        ScenarioPlan scenarioPlan5 = offlineConfig.offline_transfer_scenario_plan;
        ScenarioPlan scenarioPlan6 = scenarioPlan5 != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan5) : null;
        ScenarioPlan scenarioPlan7 = offlineConfig.error_transfer_scenario_plan;
        ScenarioPlan scenarioPlan8 = scenarioPlan7 != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan7) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = offlineConfig.enabled;
        String str = offlineConfig.external_status_url;
        List list = offlineConfig.retry_intervals;
        list.getClass();
        byteString.getClass();
        return new OfflineConfig(bool, str, list, statusResult2, statusResult4, statusResult6, statusResult8, statusResult10, statusResult12, statusResult14, statusResult16, scenarioPlan2, scenarioPlan4, statusResult18, statusResult20, scenarioPlan6, scenarioPlan8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfflineConfig offlineConfig = (OfflineConfig) obj;
        offlineConfig.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, offlineConfig.enabled);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, offlineConfig.external_status_url);
        ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 7, offlineConfig.retry_intervals);
        ProtoAdapter protoAdapter = StatusResult.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, offlineConfig.attempted_payment_status_result);
        protoAdapter.encodeWithTag(protoWriter, 8, offlineConfig.offline_payment_status_result);
        protoAdapter.encodeWithTag(protoWriter, 4, offlineConfig.attempted_bill_status_result);
        protoAdapter.encodeWithTag(protoWriter, 9, offlineConfig.offline_bill_status_result);
        protoAdapter.encodeWithTag(protoWriter, 5, offlineConfig.attempted_cash_out_status_result);
        protoAdapter.encodeWithTag(protoWriter, 10, offlineConfig.offline_cash_out_status_result);
        protoAdapter.encodeWithTag(protoWriter, 6, offlineConfig.attempted_add_cash_status_result);
        protoAdapter.encodeWithTag(protoWriter, 11, offlineConfig.offline_add_cash_status_result);
        ProtoAdapter protoAdapter2 = ScenarioPlan.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 12, offlineConfig.offline_payment_scenario_plan);
        protoAdapter2.encodeWithTag(protoWriter, 13, offlineConfig.offline_bill_scenario_plan);
        protoAdapter.encodeWithTag(protoWriter, 14, offlineConfig.error_cash_out_status_result);
        protoAdapter.encodeWithTag(protoWriter, 15, offlineConfig.error_add_cash_status_result);
        protoAdapter2.encodeWithTag(protoWriter, 16, offlineConfig.offline_transfer_scenario_plan);
        protoAdapter2.encodeWithTag(protoWriter, 17, offlineConfig.error_transfer_scenario_plan);
        protoWriter.writeBytes(offlineConfig.unknownFields());
    }
}
