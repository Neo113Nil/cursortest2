package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ScheduleRFC2445;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0014\u0013\u0015\u0016\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Builder;", "", "start_date", "Ljava/lang/Long;", "", "timezone", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Frequency;", "frequency", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Frequency;", "interval", "", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay;", "by_day", "Ljava/util/List;", "", "by_month_day", "Companion", "Builder", "Frequency", "Day", "ByDay", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScheduleRFC2445 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduleRFC2445> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.ScheduleRFC2445$ByDay#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 4)
    public final List<ByDay> by_day;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 5)
    public final List<Integer> by_month_day;

    @WireField(adapter = "com.squareup.protos.franklin.common.ScheduleRFC2445$Frequency#ADAPTER", schemaIndex = 2, tag = 2)
    public final Frequency frequency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 3, tag = 3)
    public final Long interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long start_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 6)
    public final String timezone;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445;", "<init>", "()V", "start_date", "", "Ljava/lang/Long;", "timezone", "", "frequency", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Frequency;", "interval", "by_day", "", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay;", "by_month_day", "", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ByDay> by_day;
        public List<Integer> by_month_day;
        public Frequency frequency;
        public Long interval;
        public Long start_date;
        public String timezone;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.by_day = emptyList;
            this.by_month_day = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public ScheduleRFC2445 build() {
            return new ScheduleRFC2445(this.start_date, this.timezone, this.frequency, this.interval, this.by_day, this.by_month_day, buildUnknownFields());
        }

        public final Builder by_day(List<ByDay> by_day) {
            by_day.getClass();
            TransactorKt.checkElementsNotNull(by_day);
            this.by_day = by_day;
            return this;
        }

        public final Builder by_month_day(List<Integer> by_month_day) {
            by_month_day.getClass();
            TransactorKt.checkElementsNotNull(by_month_day);
            this.by_month_day = by_month_day;
            return this;
        }

        public final Builder frequency(Frequency frequency) {
            this.frequency = frequency;
            return this;
        }

        public final Builder interval(Long interval) {
            this.interval = interval;
            return this;
        }

        public final Builder start_date(Long start_date) {
            this.start_date = start_date;
            return this;
        }

        public final Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ScheduleRFC2445.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.ScheduleRFC2445$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ScheduleRFC2445 decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ScheduleRFC2445((Long) obj, (String) obj2, (ScheduleRFC2445.Frequency) obj3, (Long) obj4, m, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 2:
                            try {
                                obj3 = ScheduleRFC2445.Frequency.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            obj4 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 4:
                            m.add(ScheduleRFC2445.ByDay.ADAPTER.decode(reader));
                            break;
                        case 5:
                            arrayList.add(ProtoAdapter.INT32.decode(reader));
                            break;
                        case 6:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ScheduleRFC2445 value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 1, value.start_date);
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.timezone);
                ScheduleRFC2445.Frequency.ADAPTER.encodeWithTag(writer, 2, value.frequency);
                protoAdapter2.encodeWithTag(writer, 3, value.interval);
                ScheduleRFC2445.ByDay.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.by_day);
                ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 5, value.by_month_day);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ScheduleRFC2445 value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                return ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(5, value.by_month_day) + ScheduleRFC2445.ByDay.ADAPTER.asRepeated().encodedSizeWithTag(4, value.by_day) + protoAdapter2.encodedSizeWithTag(3, value.interval) + ScheduleRFC2445.Frequency.ADAPTER.encodedSizeWithTag(2, value.frequency) + ProtoAdapter.STRING.encodedSizeWithTag(6, value.timezone) + protoAdapter2.encodedSizeWithTag(1, value.start_date) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ScheduleRFC2445 redact(ScheduleRFC2445 value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.by_day, ScheduleRFC2445.ByDay.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                Long l = value.start_date;
                String str = value.timezone;
                ScheduleRFC2445.Frequency frequency = value.frequency;
                Long l2 = value.interval;
                List<Integer> list = value.by_month_day;
                list.getClass();
                byteString.getClass();
                return new ScheduleRFC2445(l, str, frequency, l2, m1169redactElements, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ScheduleRFC2445 value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 5, value.by_month_day);
                ScheduleRFC2445.ByDay.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.by_day);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 3, value.interval);
                ScheduleRFC2445.Frequency.ADAPTER.encodeWithTag(writer, 2, value.frequency);
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.timezone);
                protoAdapter2.encodeWithTag(writer, 1, value.start_date);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleRFC2445(Long l, String str, Frequency frequency, Long l2, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.start_date = l;
        this.timezone = str;
        this.frequency = frequency;
        this.interval = l2;
        this.by_day = TransactorKt.immutableCopyOf("by_day", list);
        this.by_month_day = TransactorKt.immutableCopyOf("by_month_day", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduleRFC2445)) {
            return false;
        }
        ScheduleRFC2445 scheduleRFC2445 = (ScheduleRFC2445) obj;
        return Intrinsics.areEqual(unknownFields(), scheduleRFC2445.unknownFields()) && Intrinsics.areEqual(this.start_date, scheduleRFC2445.start_date) && Intrinsics.areEqual(this.timezone, scheduleRFC2445.timezone) && this.frequency == scheduleRFC2445.frequency && Intrinsics.areEqual(this.interval, scheduleRFC2445.interval) && Intrinsics.areEqual(this.by_day, scheduleRFC2445.by_day) && Intrinsics.areEqual(this.by_month_day, scheduleRFC2445.by_month_day);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.start_date;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.timezone;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Frequency frequency = this.frequency;
        int hashCode4 = (hashCode3 + (frequency != null ? frequency.hashCode() : 0)) * 37;
        Long l2 = this.interval;
        int hashCode5 = this.by_month_day.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37, 37, this.by_day);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.start_date = this.start_date;
        builder.timezone = this.timezone;
        builder.frequency = this.frequency;
        builder.interval = this.interval;
        builder.by_day = this.by_day;
        builder.by_month_day = this.by_month_day;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.start_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_date=", l, arrayList);
        }
        String str = this.timezone;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "timezone=", arrayList);
        }
        Frequency frequency = this.frequency;
        if (frequency != null) {
            arrayList.add("frequency=" + frequency);
        }
        Long l2 = this.interval;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("interval=", l2, arrayList);
        }
        if (!this.by_day.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("by_day=", arrayList, this.by_day);
        }
        if (!this.by_month_day.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("by_month_day=", arrayList, this.by_month_day);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduleRFC2445{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0004H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay$Builder;", "num", "", "day", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Day;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Day;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/lang/Integer;Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Day;Lokio/ByteString;)Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ByDay extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ByDay> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.common.ScheduleRFC2445$Day#ADAPTER", schemaIndex = 1, tag = 2)
        public final Day day;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
        public final Integer num;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay;", "<init>", "()V", "num", "", "Ljava/lang/Integer;", "day", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Day;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Day day;
            public Integer num;

            @Override // com.squareup.wire.Message.Builder
            public ByDay build() {
                return new ByDay(this.num, this.day, buildUnknownFields());
            }

            public final Builder day(Day day) {
                this.day = day;
                return this;
            }

            public final Builder num(Integer num) {
                this.num = num;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ByDay.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.ScheduleRFC2445$ByDay$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ScheduleRFC2445.ByDay decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ScheduleRFC2445.ByDay((Integer) obj, (ScheduleRFC2445.Day) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT32.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj2 = ScheduleRFC2445.Day.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ScheduleRFC2445.ByDay value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, value.num);
                    ScheduleRFC2445.Day.ADAPTER.encodeWithTag(writer, 2, value.day);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ScheduleRFC2445.ByDay value) {
                    value.getClass();
                    return ScheduleRFC2445.Day.ADAPTER.encodedSizeWithTag(2, value.day) + ProtoAdapter.INT32.encodedSizeWithTag(1, value.num) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScheduleRFC2445.ByDay redact(ScheduleRFC2445.ByDay value) {
                    value.getClass();
                    return ScheduleRFC2445.ByDay.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ScheduleRFC2445.ByDay value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ScheduleRFC2445.Day.ADAPTER.encodeWithTag(writer, 2, value.day);
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, value.num);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ByDay(Integer num, Day day, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : day, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ByDay copy$default(ByDay byDay, Integer num, Day day, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                num = byDay.num;
            }
            if ((i & 2) != 0) {
                day = byDay.day;
            }
            if ((i & 4) != 0) {
                byteString = byDay.unknownFields();
            }
            return byDay.copy(num, day, byteString);
        }

        public final ByDay copy(Integer num, Day day, ByteString unknownFields) {
            unknownFields.getClass();
            return new ByDay(num, day, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ByDay)) {
                return false;
            }
            ByDay byDay = (ByDay) other;
            return Intrinsics.areEqual(unknownFields(), byDay.unknownFields()) && Intrinsics.areEqual(this.num, byDay.num) && this.day == byDay.day;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.num;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Day day = this.day;
            int hashCode3 = hashCode2 + (day != null ? day.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.num = this.num;
            builder.day = this.day;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.num;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("num=", num, arrayList);
            }
            Day day = this.day;
            if (day != null) {
                arrayList.add("day=" + day);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ByDay{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/ScheduleRFC2445$ByDay;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ByDay build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ByDay() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByDay(Integer num, Day day, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.num = num;
            this.day = day;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Day;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SU", "MO", "TU", "WE", "TH", "FR", "SA", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Day implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Day[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Day FR;
        public static final Day MO;
        public static final Day SA;
        public static final Day SU;
        public static final Day TH;
        public static final Day TU;
        public static final Day WE;
        private final int value;

        private static final /* synthetic */ Day[] $values() {
            return new Day[]{SU, MO, TU, WE, TH, FR, SA};
        }

        static {
            final Day day = new Day("SU", 0, 0);
            SU = day;
            MO = new Day("MO", 1, 1);
            TU = new Day("TU", 2, 2);
            WE = new Day("WE", 3, 3);
            TH = new Day("TH", 4, 4);
            FR = new Day("FR", 5, 5);
            SA = new Day("SA", 6, 6);
            Day[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Day.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, day) { // from class: com.squareup.protos.franklin.common.ScheduleRFC2445$Day$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ScheduleRFC2445.Day fromValue(int value) {
                    return ScheduleRFC2445.Day.INSTANCE.fromValue(value);
                }
            };
        }

        private Day(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Day fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Day valueOf(String str) {
            return (Day) Enum.valueOf(Day.class, str);
        }

        public static Day[] values() {
            return (Day[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Day$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Day;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Day fromValue(int value) {
                switch (value) {
                    case 0:
                        return Day.SU;
                    case 1:
                        return Day.MO;
                    case 2:
                        return Day.TU;
                    case 3:
                        return Day.WE;
                    case 4:
                        return Day.TH;
                    case 5:
                        return Day.FR;
                    case 6:
                        return Day.SA;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Frequency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DAILY", "WEEKLY", "MONTHLY", "YEARLY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Frequency implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Frequency[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Frequency DAILY = new Frequency("DAILY", 0, 1);
        public static final Frequency WEEKLY = new Frequency("WEEKLY", 1, 2);
        public static final Frequency MONTHLY = new Frequency("MONTHLY", 2, 3);
        public static final Frequency YEARLY = new Frequency("YEARLY", 3, 4);

        private static final /* synthetic */ Frequency[] $values() {
            return new Frequency[]{DAILY, WEEKLY, MONTHLY, YEARLY};
        }

        static {
            Frequency[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Frequency.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.ScheduleRFC2445$Frequency$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ScheduleRFC2445.Frequency fromValue(int value) {
                    return ScheduleRFC2445.Frequency.INSTANCE.fromValue(value);
                }
            };
        }

        private Frequency(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Frequency fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Frequency valueOf(String str) {
            return (Frequency) Enum.valueOf(Frequency.class, str);
        }

        public static Frequency[] values() {
            return (Frequency[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Frequency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Frequency;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Frequency fromValue(int value) {
                if (value == 1) {
                    return Frequency.DAILY;
                }
                if (value == 2) {
                    return Frequency.WEEKLY;
                }
                if (value == 3) {
                    return Frequency.MONTHLY;
                }
                if (value != 4) {
                    return null;
                }
                return Frequency.YEARLY;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/ScheduleRFC2445;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ScheduleRFC2445 build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScheduleRFC2445(Long l, String str, Frequency frequency, Long l2, List list, int i) {
        this(l, str, frequency, l2, r5, (i & 32) != 0 ? r5 : list, ByteString.EMPTY);
        EmptyList emptyList = EmptyList.INSTANCE;
    }
}
