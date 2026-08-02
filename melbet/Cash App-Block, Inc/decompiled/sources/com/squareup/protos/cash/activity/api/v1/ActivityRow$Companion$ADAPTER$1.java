package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityRow$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityRow$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Long l;
        Long l2;
        ?? decode;
        ActivityRow.Body paymentHistoryInputsRow;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Long l3 = null;
        Long l4 = null;
        Boolean bool = null;
        ActivityRowSection activityRowSection = null;
        Long l5 = null;
        Boolean bool2 = null;
        ActivityRow.Body body = null;
        Long l6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityRow((ActivityItemGlobalId) obj2, str, (ActivityItemGlobalId) obj4, l6, l3, l4, bool, activityRowSection, l5, bool2, m, body, (ActivityItemCorrelations) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    l6 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 4:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 5:
                    obj2 = TransactorKt.decodeMessageOrMerge(ActivityItemGlobalId.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                case 6:
                    obj = obj3;
                    l = l3;
                    l2 = l4;
                    try {
                        activityRowSection = ActivityRowSection.ADAPTER.decode(protoReader);
                        obj3 = obj;
                        l3 = l;
                        l4 = l2;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 8:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 9:
                    try {
                        ActivityProductClassifier.ADAPTER.tryDecode(protoReader, m);
                        obj = obj3;
                        l = l3;
                        l2 = l4;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj3;
                        l = l3;
                        l2 = l4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    decode = str;
                    obj3 = obj;
                    l3 = l;
                    l4 = l2;
                    break;
                case 10:
                    paymentHistoryInputsRow = new ActivityRow.Body.PaymentHistoryInputsRow((PaymentHistoryInputsRow) PaymentHistoryInputsRow.ADAPTER.decode(protoReader));
                    body = paymentHistoryInputsRow;
                    decode = str;
                    break;
                case 11:
                    paymentHistoryInputsRow = new ActivityRow.Body.PaycheckRow((PaycheckRow) PaycheckRow.ADAPTER.decode(protoReader));
                    body = paymentHistoryInputsRow;
                    decode = str;
                    break;
                case 12:
                    paymentHistoryInputsRow = new ActivityRow.Body.OrderRow((OrderRow) OrderRow.ADAPTER.decode(protoReader));
                    body = paymentHistoryInputsRow;
                    decode = str;
                    break;
                case 13:
                    obj3 = TransactorKt.decodeMessageOrMerge(ActivityItemCorrelations.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 14:
                    obj4 = TransactorKt.decodeMessageOrMerge(ActivityItemGlobalId.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 15:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    l = l3;
                    l2 = l4;
                    decode = str;
                    obj3 = obj;
                    l3 = l;
                    l4 = l2;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityRow activityRow = (ActivityRow) obj;
        reverseProtoWriter.getClass();
        activityRow.getClass();
        reverseProtoWriter.writeBytes(activityRow.unknownFields());
        ActivityRow.Body body = activityRow.body;
        if (body instanceof ActivityRow.Body.PaymentHistoryInputsRow) {
            PaymentHistoryInputsRow.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((ActivityRow.Body.PaymentHistoryInputsRow) body).getValue());
        } else if (body instanceof ActivityRow.Body.PaycheckRow) {
            PaycheckRow.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((ActivityRow.Body.PaycheckRow) body).getValue());
        } else if (body instanceof ActivityRow.Body.OrderRow) {
            OrderRow.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((ActivityRow.Body.OrderRow) body).getValue());
        } else if (body != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ActivityItemCorrelations.ADAPTER.encodeWithTag(reverseProtoWriter, 13, activityRow.correlations);
        ActivityProductClassifier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, activityRow.product_classifiers);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, activityRow.is_deleted);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, activityRow.item_version);
        ActivityRowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, activityRow.activity_row_section);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, activityRow.is_badged);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, activityRow.created_at_epoch_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, activityRow.display_date_epoch_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, activityRow.version);
        ProtoAdapter protoAdapter3 = ActivityItemGlobalId.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 14, activityRow.reference_activity_item_global_id);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, activityRow.row_id);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, activityRow.activity_item_global_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ActivityRow activityRow = (ActivityRow) obj;
        activityRow.getClass();
        int size$okio = activityRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ActivityItemGlobalId.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(14, activityRow.reference_activity_item_global_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, activityRow.row_id) + protoAdapter.encodedSizeWithTag(5, activityRow.activity_item_global_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(15, activityRow.created_at_epoch_ms) + protoAdapter2.encodedSizeWithTag(3, activityRow.display_date_epoch_ms) + protoAdapter2.encodedSizeWithTag(2, activityRow.version) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        int encodedSizeWithTag4 = ActivityProductClassifier.ADAPTER.asRepeated().encodedSizeWithTag(9, activityRow.product_classifiers) + protoAdapter3.encodedSizeWithTag(8, activityRow.is_deleted) + protoAdapter2.encodedSizeWithTag(7, activityRow.item_version) + ActivityRowSection.ADAPTER.encodedSizeWithTag(6, activityRow.activity_row_section) + protoAdapter3.encodedSizeWithTag(4, activityRow.is_badged) + encodedSizeWithTag3;
        ActivityRow.Body body = activityRow.body;
        if (body instanceof ActivityRow.Body.PaymentHistoryInputsRow) {
            encodedSizeWithTag = PaymentHistoryInputsRow.ADAPTER.encodedSizeWithTag(10, ((ActivityRow.Body.PaymentHistoryInputsRow) body).getValue());
        } else if (body instanceof ActivityRow.Body.PaycheckRow) {
            encodedSizeWithTag = PaycheckRow.ADAPTER.encodedSizeWithTag(11, ((ActivityRow.Body.PaycheckRow) body).getValue());
        } else {
            if (!(body instanceof ActivityRow.Body.OrderRow)) {
                if (body != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ActivityItemCorrelations.ADAPTER.encodedSizeWithTag(13, activityRow.correlations) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = OrderRow.ADAPTER.encodedSizeWithTag(12, ((ActivityRow.Body.OrderRow) body).getValue());
        }
        encodedSizeWithTag4 += encodedSizeWithTag;
        return ActivityItemCorrelations.ADAPTER.encodedSizeWithTag(13, activityRow.correlations) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityRow activityRow = (ActivityRow) obj;
        activityRow.getClass();
        ActivityItemGlobalId activityItemGlobalId = activityRow.activity_item_global_id;
        ActivityItemGlobalId activityItemGlobalId2 = activityItemGlobalId != null ? (ActivityItemGlobalId) ActivityItemGlobalId.ADAPTER.redact(activityItemGlobalId) : null;
        ActivityItemGlobalId activityItemGlobalId3 = activityRow.reference_activity_item_global_id;
        ActivityItemGlobalId activityItemGlobalId4 = activityItemGlobalId3 != null ? (ActivityItemGlobalId) ActivityItemGlobalId.ADAPTER.redact(activityItemGlobalId3) : null;
        ActivityItemCorrelations activityItemCorrelations = activityRow.correlations;
        ActivityItemCorrelations activityItemCorrelations2 = activityItemCorrelations != null ? (ActivityItemCorrelations) ActivityItemCorrelations.ADAPTER.redact(activityItemCorrelations) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = activityRow.row_id;
        Long l = activityRow.version;
        Long l2 = activityRow.display_date_epoch_ms;
        Long l3 = activityRow.created_at_epoch_ms;
        Boolean bool = activityRow.is_badged;
        ActivityRowSection activityRowSection = activityRow.activity_row_section;
        Long l4 = activityRow.item_version;
        Boolean bool2 = activityRow.is_deleted;
        List<ActivityProductClassifier> list = activityRow.product_classifiers;
        ActivityRow.Body body = activityRow.body;
        list.getClass();
        byteString.getClass();
        return new ActivityRow(activityItemGlobalId2, str, activityItemGlobalId4, l, l2, l3, bool, activityRowSection, l4, bool2, list, body, activityItemCorrelations2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityRow activityRow = (ActivityRow) obj;
        activityRow.getClass();
        ProtoAdapter protoAdapter = ActivityItemGlobalId.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, activityRow.activity_item_global_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activityRow.row_id);
        protoAdapter.encodeWithTag(protoWriter, 14, activityRow.reference_activity_item_global_id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, activityRow.version);
        protoAdapter2.encodeWithTag(protoWriter, 3, activityRow.display_date_epoch_ms);
        protoAdapter2.encodeWithTag(protoWriter, 15, activityRow.created_at_epoch_ms);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 4, activityRow.is_badged);
        ActivityRowSection.ADAPTER.encodeWithTag(protoWriter, 6, activityRow.activity_row_section);
        protoAdapter2.encodeWithTag(protoWriter, 7, activityRow.item_version);
        protoAdapter3.encodeWithTag(protoWriter, 8, activityRow.is_deleted);
        ActivityProductClassifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, activityRow.product_classifiers);
        ActivityItemCorrelations.ADAPTER.encodeWithTag(protoWriter, 13, activityRow.correlations);
        ActivityRow.Body body = activityRow.body;
        if (body instanceof ActivityRow.Body.PaymentHistoryInputsRow) {
            PaymentHistoryInputsRow.ADAPTER.encodeWithTag(protoWriter, 10, ((ActivityRow.Body.PaymentHistoryInputsRow) body).getValue());
        } else if (body instanceof ActivityRow.Body.PaycheckRow) {
            PaycheckRow.ADAPTER.encodeWithTag(protoWriter, 11, ((ActivityRow.Body.PaycheckRow) body).getValue());
        } else if (body instanceof ActivityRow.Body.OrderRow) {
            OrderRow.ADAPTER.encodeWithTag(protoWriter, 12, ((ActivityRow.Body.OrderRow) body).getValue());
        } else if (body != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(activityRow.unknownFields());
    }
}
