package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.TimecardEditRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimecardEditRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        ?? r3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Object obj = null;
        Object obj2 = null;
        String str5 = null;
        String str6 = null;
        Object obj3 = null;
        Boolean bool = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            String str7 = r3;
            if (nextTag == -1) {
                return new TimecardEditRequest(str7, str, str2, str3, str4, (Money) obj, m, (TimecardAndBreaks) obj2, str5, str6, (Money) obj3, bool, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    r3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    m.add(TimecardEditRequest.TimecardBreakEditRequest.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(TimecardAndBreaks.ADAPTER, protoReader, obj2);
                    break;
                case 8:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 11:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 12:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r3 = str7;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimecardEditRequest timecardEditRequest = (TimecardEditRequest) obj;
        reverseProtoWriter.getClass();
        timecardEditRequest.getClass();
        reverseProtoWriter.writeBytes(timecardEditRequest.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 11, timecardEditRequest.resulting_tip_eligible);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, timecardEditRequest.resulting_hourly_wage_rate);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, timecardEditRequest.resulting_job_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, timecardEditRequest.timecard_time_zone);
        TimecardAndBreaks.ADAPTER.encodeWithTag(reverseProtoWriter, 7, timecardEditRequest.associated_timecard_and_breaks);
        TimecardEditRequest.TimecardBreakEditRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, timecardEditRequest.break_edits);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, timecardEditRequest.proposed_declared_tip);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, timecardEditRequest.proposed_notes);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, timecardEditRequest.proposed_stop_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, timecardEditRequest.proposed_start_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, timecardEditRequest.proposed_job_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, timecardEditRequest.timecard_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimecardEditRequest timecardEditRequest = (TimecardEditRequest) obj;
        timecardEditRequest.getClass();
        int size$okio = timecardEditRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, timecardEditRequest.proposed_notes) + protoAdapter.encodedSizeWithTag(4, timecardEditRequest.proposed_stop_at) + protoAdapter.encodedSizeWithTag(3, timecardEditRequest.proposed_start_at) + protoAdapter.encodedSizeWithTag(2, timecardEditRequest.proposed_job_id) + protoAdapter.encodedSizeWithTag(1, timecardEditRequest.timecard_id) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(11, timecardEditRequest.resulting_tip_eligible) + protoAdapter2.encodedSizeWithTag(10, timecardEditRequest.resulting_hourly_wage_rate) + protoAdapter.encodedSizeWithTag(9, timecardEditRequest.resulting_job_title) + protoAdapter.encodedSizeWithTag(8, timecardEditRequest.timecard_time_zone) + TimecardAndBreaks.ADAPTER.encodedSizeWithTag(7, timecardEditRequest.associated_timecard_and_breaks) + TimecardEditRequest.TimecardBreakEditRequest.ADAPTER.asRepeated().encodedSizeWithTag(6, timecardEditRequest.break_edits) + protoAdapter2.encodedSizeWithTag(12, timecardEditRequest.proposed_declared_tip) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimecardEditRequest timecardEditRequest = (TimecardEditRequest) obj;
        timecardEditRequest.getClass();
        Money money = timecardEditRequest.proposed_declared_tip;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(timecardEditRequest.break_edits, TimecardEditRequest.TimecardBreakEditRequest.ADAPTER);
        TimecardAndBreaks timecardAndBreaks = timecardEditRequest.associated_timecard_and_breaks;
        TimecardAndBreaks timecardAndBreaks2 = timecardAndBreaks != null ? (TimecardAndBreaks) TimecardAndBreaks.ADAPTER.redact(timecardAndBreaks) : null;
        Money money3 = timecardEditRequest.resulting_hourly_wage_rate;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = timecardEditRequest.timecard_id;
        String str2 = timecardEditRequest.proposed_job_id;
        String str3 = timecardEditRequest.proposed_start_at;
        String str4 = timecardEditRequest.proposed_stop_at;
        String str5 = timecardEditRequest.proposed_notes;
        String str6 = timecardEditRequest.timecard_time_zone;
        String str7 = timecardEditRequest.resulting_job_title;
        Boolean bool = timecardEditRequest.resulting_tip_eligible;
        byteString.getClass();
        return new TimecardEditRequest(str, str2, str3, str4, str5, money2, m1169redactElements, timecardAndBreaks2, str6, str7, money4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimecardEditRequest timecardEditRequest = (TimecardEditRequest) obj;
        timecardEditRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, timecardEditRequest.timecard_id);
        protoAdapter.encodeWithTag(protoWriter, 2, timecardEditRequest.proposed_job_id);
        protoAdapter.encodeWithTag(protoWriter, 3, timecardEditRequest.proposed_start_at);
        protoAdapter.encodeWithTag(protoWriter, 4, timecardEditRequest.proposed_stop_at);
        protoAdapter.encodeWithTag(protoWriter, 5, timecardEditRequest.proposed_notes);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 12, timecardEditRequest.proposed_declared_tip);
        TimecardEditRequest.TimecardBreakEditRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, timecardEditRequest.break_edits);
        TimecardAndBreaks.ADAPTER.encodeWithTag(protoWriter, 7, timecardEditRequest.associated_timecard_and_breaks);
        protoAdapter.encodeWithTag(protoWriter, 8, timecardEditRequest.timecard_time_zone);
        protoAdapter.encodeWithTag(protoWriter, 9, timecardEditRequest.resulting_job_title);
        protoAdapter2.encodeWithTag(protoWriter, 10, timecardEditRequest.resulting_hourly_wage_rate);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, timecardEditRequest.resulting_tip_eligible);
        protoWriter.writeBytes(timecardEditRequest.unknownFields());
    }
}
