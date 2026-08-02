package com.squareup.protos.cash.scheduledreloader.resources.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ScheduledReloadPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        ScheduledReloadPreference.TargetIdentifierTokenType targetIdentifierTokenType;
        String str2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Boolean bool = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        String str3 = null;
        Object obj6 = null;
        Integer num = null;
        ScheduledReloadPreference.TargetIdentifierTokenType targetIdentifierTokenType2 = null;
        String str4 = null;
        ScheduledReloadPreference.SourceType sourceType = null;
        ScheduledReloadPreference.ReminderMode reminderMode = null;
        Integer num2 = null;
        Long l = null;
        ScheduledReloadPreference.PreferenceDisabledReason preferenceDisabledReason = null;
        ScheduledReloadPreference.Type type2 = null;
        ScheduledReloadStatus scheduledReloadStatus = null;
        String str5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ScheduledReloadPreference(bool, (Money) obj2, (ReloadSchedule) obj3, type2, str5, (Instant) obj5, str3, (Instant) obj6, num, targetIdentifierTokenType2, str4, sourceType, m, reminderMode, num2, (Instant) obj, l, preferenceDisabledReason, (Instant) obj4, scheduledReloadStatus, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = bool;
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(ReloadSchedule.ADAPTER, protoReader, obj3);
                    decode = bool;
                    break;
                case 4:
                    str = str3;
                    targetIdentifierTokenType = targetIdentifierTokenType2;
                    str2 = str4;
                    try {
                        type2 = ScheduledReloadPreference.Type.ADAPTER.decode(protoReader);
                        str3 = str;
                        targetIdentifierTokenType2 = targetIdentifierTokenType;
                        str4 = str2;
                        decode = bool;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool;
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj5);
                    decode = bool;
                    break;
                case 7:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool;
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj6);
                    decode = bool;
                    break;
                case 9:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = bool;
                    break;
                case 10:
                    str = str3;
                    targetIdentifierTokenType = targetIdentifierTokenType2;
                    str2 = str4;
                    try {
                        targetIdentifierTokenType2 = ScheduledReloadPreference.TargetIdentifierTokenType.ADAPTER.decode(protoReader);
                        str3 = str;
                        str4 = str2;
                        decode = bool;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 11:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool;
                    break;
                case 12:
                    str = str3;
                    targetIdentifierTokenType = targetIdentifierTokenType2;
                    str2 = str4;
                    try {
                        sourceType = ScheduledReloadPreference.SourceType.ADAPTER.decode(protoReader);
                        str3 = str;
                        targetIdentifierTokenType2 = targetIdentifierTokenType;
                        str4 = str2;
                        decode = bool;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 13:
                    str = str3;
                    targetIdentifierTokenType = targetIdentifierTokenType2;
                    str2 = str4;
                    m.add(ProtoAdapter.INSTANT.decode(protoReader));
                    decode = bool;
                    str3 = str;
                    targetIdentifierTokenType2 = targetIdentifierTokenType;
                    str4 = str2;
                    break;
                case 14:
                    str = str3;
                    targetIdentifierTokenType = targetIdentifierTokenType2;
                    str2 = str4;
                    try {
                        reminderMode = ScheduledReloadPreference.ReminderMode.ADAPTER.decode(protoReader);
                        str3 = str;
                        targetIdentifierTokenType2 = targetIdentifierTokenType;
                        str4 = str2;
                        decode = bool;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 15:
                    num2 = ProtoAdapter.INT32.decode(protoReader);
                    decode = bool;
                    break;
                case 16:
                    obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj);
                    decode = bool;
                    break;
                case 17:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = bool;
                    break;
                case 18:
                    str = str3;
                    targetIdentifierTokenType = targetIdentifierTokenType2;
                    str2 = str4;
                    try {
                        preferenceDisabledReason = ScheduledReloadPreference.PreferenceDisabledReason.ADAPTER.decode(protoReader);
                        str3 = str;
                        targetIdentifierTokenType2 = targetIdentifierTokenType;
                        str4 = str2;
                        decode = bool;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 19:
                    obj4 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj4);
                    decode = bool;
                    break;
                case 20:
                    try {
                        scheduledReloadStatus = ScheduledReloadStatus.ADAPTER.decode(protoReader);
                        decode = bool;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                        str = str3;
                        targetIdentifierTokenType = targetIdentifierTokenType2;
                        str2 = str4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str3;
                    targetIdentifierTokenType = targetIdentifierTokenType2;
                    str2 = str4;
                    decode = bool;
                    str3 = str;
                    targetIdentifierTokenType2 = targetIdentifierTokenType;
                    str4 = str2;
                    break;
            }
            bool = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduledReloadPreference scheduledReloadPreference = (ScheduledReloadPreference) obj;
        reverseProtoWriter.getClass();
        scheduledReloadPreference.getClass();
        reverseProtoWriter.writeBytes(scheduledReloadPreference.unknownFields());
        ScheduledReloadStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 20, scheduledReloadPreference.next_reload_status);
        ProtoAdapter protoAdapter = ProtoAdapter.INSTANT;
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, scheduledReloadPreference.updated_at);
        ScheduledReloadPreference.PreferenceDisabledReason.ADAPTER.encodeWithTag(reverseProtoWriter, 18, scheduledReloadPreference.disable_reason);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 17, scheduledReloadPreference.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, scheduledReloadPreference.stop_reloading_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, scheduledReloadPreference.reminder_minutes_before);
        ScheduledReloadPreference.ReminderMode.ADAPTER.encodeWithTag(reverseProtoWriter, 14, scheduledReloadPreference.reminder_mode);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 13, scheduledReloadPreference.upcoming_reload_dates);
        ScheduledReloadPreference.SourceType.ADAPTER.encodeWithTag(reverseProtoWriter, 12, scheduledReloadPreference.source_type);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 11, scheduledReloadPreference.source_identifier);
        ScheduledReloadPreference.TargetIdentifierTokenType.ADAPTER.encodeWithTag(reverseProtoWriter, 10, scheduledReloadPreference.target_identifier_token_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, scheduledReloadPreference.remaining_failures_until_cancellation);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, scheduledReloadPreference.start_reloading_at);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, scheduledReloadPreference.token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, scheduledReloadPreference.next_reload_at);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, scheduledReloadPreference.target_identifier_token);
        ScheduledReloadPreference.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 4, scheduledReloadPreference.f1335type);
        ReloadSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 3, scheduledReloadPreference.reload_schedule);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, scheduledReloadPreference.amount);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, scheduledReloadPreference.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduledReloadPreference scheduledReloadPreference = (ScheduledReloadPreference) obj;
        scheduledReloadPreference.getClass();
        int encodedSizeWithTag = ScheduledReloadPreference.Type.ADAPTER.encodedSizeWithTag(4, scheduledReloadPreference.f1335type) + ReloadSchedule.ADAPTER.encodedSizeWithTag(3, scheduledReloadPreference.reload_schedule) + Money.ADAPTER.encodedSizeWithTag(2, scheduledReloadPreference.amount) + ProtoAdapter.BOOL.encodedSizeWithTag(1, scheduledReloadPreference.enabled) + scheduledReloadPreference.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, scheduledReloadPreference.target_identifier_token) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(8, scheduledReloadPreference.start_reloading_at) + protoAdapter.encodedSizeWithTag(7, scheduledReloadPreference.token) + protoAdapter2.encodedSizeWithTag(6, scheduledReloadPreference.next_reload_at) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        return ScheduledReloadStatus.ADAPTER.encodedSizeWithTag(20, scheduledReloadPreference.next_reload_status) + protoAdapter2.encodedSizeWithTag(19, scheduledReloadPreference.updated_at) + ScheduledReloadPreference.PreferenceDisabledReason.ADAPTER.encodedSizeWithTag(18, scheduledReloadPreference.disable_reason) + ProtoAdapter.INT64.encodedSizeWithTag(17, scheduledReloadPreference.version) + protoAdapter2.encodedSizeWithTag(16, scheduledReloadPreference.stop_reloading_at) + protoAdapter3.encodedSizeWithTag(15, scheduledReloadPreference.reminder_minutes_before) + ScheduledReloadPreference.ReminderMode.ADAPTER.encodedSizeWithTag(14, scheduledReloadPreference.reminder_mode) + protoAdapter2.asRepeated().encodedSizeWithTag(13, scheduledReloadPreference.upcoming_reload_dates) + ScheduledReloadPreference.SourceType.ADAPTER.encodedSizeWithTag(12, scheduledReloadPreference.source_type) + protoAdapter.encodedSizeWithTag(11, scheduledReloadPreference.source_identifier) + ScheduledReloadPreference.TargetIdentifierTokenType.ADAPTER.encodedSizeWithTag(10, scheduledReloadPreference.target_identifier_token_type) + protoAdapter3.encodedSizeWithTag(9, scheduledReloadPreference.remaining_failures_until_cancellation) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduledReloadPreference scheduledReloadPreference = (ScheduledReloadPreference) obj;
        scheduledReloadPreference.getClass();
        Money money = scheduledReloadPreference.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ReloadSchedule reloadSchedule = scheduledReloadPreference.reload_schedule;
        ReloadSchedule reloadSchedule2 = reloadSchedule != null ? (ReloadSchedule) ReloadSchedule.ADAPTER.redact(reloadSchedule) : null;
        Instant instant = scheduledReloadPreference.next_reload_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        Instant instant3 = scheduledReloadPreference.start_reloading_at;
        Instant instant4 = instant3 != null ? (Instant) ProtoAdapter.INSTANT.redact(instant3) : null;
        List list = scheduledReloadPreference.upcoming_reload_dates;
        ProtoAdapter protoAdapter = ProtoAdapter.INSTANT;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        Instant instant5 = scheduledReloadPreference.stop_reloading_at;
        Instant instant6 = instant5 != null ? (Instant) protoAdapter.redact(instant5) : null;
        Instant instant7 = scheduledReloadPreference.updated_at;
        return ScheduledReloadPreference.copy$default(scheduledReloadPreference, money2, reloadSchedule2, instant2, instant4, m1169redactElements, instant6, instant7 != null ? (Instant) protoAdapter.redact(instant7) : null, ByteString.EMPTY, 749401);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduledReloadPreference scheduledReloadPreference = (ScheduledReloadPreference) obj;
        scheduledReloadPreference.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, scheduledReloadPreference.enabled);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, scheduledReloadPreference.amount);
        ReloadSchedule.ADAPTER.encodeWithTag(protoWriter, 3, scheduledReloadPreference.reload_schedule);
        ScheduledReloadPreference.Type.ADAPTER.encodeWithTag(protoWriter, 4, scheduledReloadPreference.f1335type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 5, scheduledReloadPreference.target_identifier_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        protoAdapter2.encodeWithTag(protoWriter, 6, scheduledReloadPreference.next_reload_at);
        protoAdapter.encodeWithTag(protoWriter, 7, scheduledReloadPreference.token);
        protoAdapter2.encodeWithTag(protoWriter, 8, scheduledReloadPreference.start_reloading_at);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 9, scheduledReloadPreference.remaining_failures_until_cancellation);
        ScheduledReloadPreference.TargetIdentifierTokenType.ADAPTER.encodeWithTag(protoWriter, 10, scheduledReloadPreference.target_identifier_token_type);
        protoAdapter.encodeWithTag(protoWriter, 11, scheduledReloadPreference.source_identifier);
        ScheduledReloadPreference.SourceType.ADAPTER.encodeWithTag(protoWriter, 12, scheduledReloadPreference.source_type);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 13, scheduledReloadPreference.upcoming_reload_dates);
        ScheduledReloadPreference.ReminderMode.ADAPTER.encodeWithTag(protoWriter, 14, scheduledReloadPreference.reminder_mode);
        protoAdapter3.encodeWithTag(protoWriter, 15, scheduledReloadPreference.reminder_minutes_before);
        protoAdapter2.encodeWithTag(protoWriter, 16, scheduledReloadPreference.stop_reloading_at);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, scheduledReloadPreference.version);
        ScheduledReloadPreference.PreferenceDisabledReason.ADAPTER.encodeWithTag(protoWriter, 18, scheduledReloadPreference.disable_reason);
        protoAdapter2.encodeWithTag(protoWriter, 19, scheduledReloadPreference.updated_at);
        ScheduledReloadStatus.ADAPTER.encodeWithTag(protoWriter, 20, scheduledReloadPreference.next_reload_status);
        protoWriter.writeBytes(scheduledReloadPreference.unknownFields());
    }
}
