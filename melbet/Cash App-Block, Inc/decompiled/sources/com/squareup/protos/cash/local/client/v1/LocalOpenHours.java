package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\u0007\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$Builder;", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay;", "hours_for_days", "Ljava/util/List;", "Companion", "Builder", "HoursForDay", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalOpenHours extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalOpenHours> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenHours$HoursForDay#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<HoursForDay> hours_for_days;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "<init>", "()V", "hours_for_days", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<HoursForDay> hours_for_days = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public LocalOpenHours build() {
            return new LocalOpenHours(this.hours_for_days, buildUnknownFields());
        }

        public final Builder hours_for_days(List<HoursForDay> hours_for_days) {
            hours_for_days.getClass();
            TransactorKt.checkElementsNotNull(hours_for_days);
            this.hours_for_days = hours_for_days;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\tH\u0016J8\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Builder;", "day", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Day;", "ranges", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range;", "exceptional_hours_title", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Day;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Day", "Range", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HoursForDay extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HoursForDay> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenHours$HoursForDay$Day#ADAPTER", schemaIndex = 0, tag = 1)
        public final Day day;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String exceptional_hours_title;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenHours$HoursForDay$Range#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<Range> ranges;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay;", "<init>", "()V", "day", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Day;", "ranges", "", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range;", "exceptional_hours_title", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Day day;
            public String exceptional_hours_title;
            public List<Range> ranges = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public HoursForDay build() {
                return new HoursForDay(this.day, this.ranges, this.exceptional_hours_title, buildUnknownFields());
            }

            public final Builder day(Day day) {
                this.day = day;
                return this;
            }

            public final Builder exceptional_hours_title(String exceptional_hours_title) {
                this.exceptional_hours_title = exceptional_hours_title;
                return this;
            }

            public final Builder ranges(List<Range> ranges) {
                ranges.getClass();
                TransactorKt.checkElementsNotNull(ranges);
                this.ranges = ranges;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HoursForDay.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOpenHours$HoursForDay$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalOpenHours.HoursForDay decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalOpenHours.HoursForDay((LocalOpenHours.HoursForDay.Day) obj, m, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = LocalOpenHours.HoursForDay.Day.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 2) {
                            m.add(LocalOpenHours.HoursForDay.Range.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalOpenHours.HoursForDay value) {
                    writer.getClass();
                    value.getClass();
                    LocalOpenHours.HoursForDay.Day.ADAPTER.encodeWithTag(writer, 1, value.day);
                    LocalOpenHours.HoursForDay.Range.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.ranges);
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.exceptional_hours_title);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalOpenHours.HoursForDay value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, value.exceptional_hours_title) + LocalOpenHours.HoursForDay.Range.ADAPTER.asRepeated().encodedSizeWithTag(2, value.ranges) + LocalOpenHours.HoursForDay.Day.ADAPTER.encodedSizeWithTag(1, value.day) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalOpenHours.HoursForDay redact(LocalOpenHours.HoursForDay value) {
                    value.getClass();
                    return LocalOpenHours.HoursForDay.copy$default(value, null, TransactorKt.m1169redactElements(value.ranges, LocalOpenHours.HoursForDay.Range.ADAPTER), null, ByteString.EMPTY, 5, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalOpenHours.HoursForDay value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.exceptional_hours_title);
                    LocalOpenHours.HoursForDay.Range.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.ranges);
                    LocalOpenHours.HoursForDay.Day.ADAPTER.encodeWithTag(writer, 1, value.day);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public HoursForDay(Day day, List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : day, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HoursForDay copy$default(HoursForDay hoursForDay, Day day, List list, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                day = hoursForDay.day;
            }
            if ((i & 2) != 0) {
                list = hoursForDay.ranges;
            }
            if ((i & 4) != 0) {
                str = hoursForDay.exceptional_hours_title;
            }
            if ((i & 8) != 0) {
                byteString = hoursForDay.unknownFields();
            }
            return hoursForDay.copy(day, list, str, byteString);
        }

        public final HoursForDay copy(Day day, List<Range> ranges, String exceptional_hours_title, ByteString unknownFields) {
            ranges.getClass();
            unknownFields.getClass();
            return new HoursForDay(day, ranges, exceptional_hours_title, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof HoursForDay)) {
                return false;
            }
            HoursForDay hoursForDay = (HoursForDay) other;
            return Intrinsics.areEqual(unknownFields(), hoursForDay.unknownFields()) && this.day == hoursForDay.day && Intrinsics.areEqual(this.ranges, hoursForDay.ranges) && Intrinsics.areEqual(this.exceptional_hours_title, hoursForDay.exceptional_hours_title);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Day day = this.day;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (day != null ? day.hashCode() : 0)) * 37, 37, this.ranges);
            String str = this.exceptional_hours_title;
            int hashCode2 = m + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.day = this.day;
            builder.ranges = this.ranges;
            builder.exceptional_hours_title = this.exceptional_hours_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Day day = this.day;
            if (day != null) {
                arrayList.add("day=" + day);
            }
            if (!this.ranges.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("ranges=", arrayList, this.ranges);
            }
            String str = this.exceptional_hours_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "exceptional_hours_title=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HoursForDay{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Day;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DAY_UNSPECIFIED", "DAY_MONDAY", "DAY_TUESDAY", "DAY_WEDNESDAY", "DAY_THURSDAY", "DAY_FRIDAY", "DAY_SATURDAY", "DAY_SUNDAY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Day implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Day[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Day DAY_FRIDAY;
            public static final Day DAY_MONDAY;
            public static final Day DAY_SATURDAY;
            public static final Day DAY_SUNDAY;
            public static final Day DAY_THURSDAY;
            public static final Day DAY_TUESDAY;
            public static final Day DAY_UNSPECIFIED;
            public static final Day DAY_WEDNESDAY;
            private final int value;

            private static final /* synthetic */ Day[] $values() {
                return new Day[]{DAY_UNSPECIFIED, DAY_MONDAY, DAY_TUESDAY, DAY_WEDNESDAY, DAY_THURSDAY, DAY_FRIDAY, DAY_SATURDAY, DAY_SUNDAY};
            }

            static {
                final Day day = new Day("DAY_UNSPECIFIED", 0, 0);
                DAY_UNSPECIFIED = day;
                DAY_MONDAY = new Day("DAY_MONDAY", 1, 1);
                DAY_TUESDAY = new Day("DAY_TUESDAY", 2, 2);
                DAY_WEDNESDAY = new Day("DAY_WEDNESDAY", 3, 3);
                DAY_THURSDAY = new Day("DAY_THURSDAY", 4, 4);
                DAY_FRIDAY = new Day("DAY_FRIDAY", 5, 5);
                DAY_SATURDAY = new Day("DAY_SATURDAY", 6, 6);
                DAY_SUNDAY = new Day("DAY_SUNDAY", 7, 7);
                Day[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Day.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, day) { // from class: com.squareup.protos.cash.local.client.v1.LocalOpenHours$HoursForDay$Day$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public LocalOpenHours.HoursForDay.Day fromValue(int value) {
                        return LocalOpenHours.HoursForDay.Day.INSTANCE.fromValue(value);
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

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Day$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Day;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Day fromValue(int value) {
                    switch (value) {
                        case 0:
                            return Day.DAY_UNSPECIFIED;
                        case 1:
                            return Day.DAY_MONDAY;
                        case 2:
                            return Day.DAY_TUESDAY;
                        case 3:
                            return Day.DAY_WEDNESDAY;
                        case 4:
                            return Day.DAY_THURSDAY;
                        case 5:
                            return Day.DAY_FRIDAY;
                        case 6:
                            return Day.DAY_SATURDAY;
                        case 7:
                            return Day.DAY_SUNDAY;
                        default:
                            return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range$Builder;", "opening_time", "", "closing_time", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Range extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Range> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
            public final Long closing_time;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
            public final Long opening_time;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range;", "<init>", "()V", "opening_time", "", "Ljava/lang/Long;", "closing_time", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Long closing_time;
                public Long opening_time;

                @Override // com.squareup.wire.Message.Builder
                public Range build() {
                    return new Range(this.opening_time, this.closing_time, buildUnknownFields());
                }

                public final Builder closing_time(Long closing_time) {
                    this.closing_time = closing_time;
                    return this;
                }

                public final Builder opening_time(Long opening_time) {
                    this.opening_time = opening_time;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Range.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOpenHours$HoursForDay$Range$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalOpenHours.HoursForDay.Range decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new LocalOpenHours.HoursForDay.Range((Long) obj, (Long) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.INT64.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = ProtoAdapter.INT64.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, LocalOpenHours.HoursForDay.Range value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                        protoAdapter2.encodeWithTag(writer, 1, value.opening_time);
                        protoAdapter2.encodeWithTag(writer, 2, value.closing_time);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(LocalOpenHours.HoursForDay.Range value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                        return protoAdapter2.encodedSizeWithTag(2, value.closing_time) + protoAdapter2.encodedSizeWithTag(1, value.opening_time) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalOpenHours.HoursForDay.Range redact(LocalOpenHours.HoursForDay.Range value) {
                        value.getClass();
                        return LocalOpenHours.HoursForDay.Range.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, LocalOpenHours.HoursForDay.Range value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                        protoAdapter2.encodeWithTag(writer, 2, value.closing_time);
                        protoAdapter2.encodeWithTag(writer, 1, value.opening_time);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Range(Long l, Long l2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Range copy$default(Range range, Long l, Long l2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = range.opening_time;
                }
                if ((i & 2) != 0) {
                    l2 = range.closing_time;
                }
                if ((i & 4) != 0) {
                    byteString = range.unknownFields();
                }
                return range.copy(l, l2, byteString);
            }

            public final Range copy(Long opening_time, Long closing_time, ByteString unknownFields) {
                unknownFields.getClass();
                return new Range(opening_time, closing_time, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Range)) {
                    return false;
                }
                Range range = (Range) other;
                return Intrinsics.areEqual(unknownFields(), range.unknownFields()) && Intrinsics.areEqual(this.opening_time, range.opening_time) && Intrinsics.areEqual(this.closing_time, range.closing_time);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Long l = this.opening_time;
                int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                Long l2 = this.closing_time;
                int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.opening_time = this.opening_time;
                builder.closing_time = this.closing_time;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Long l = this.opening_time;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("opening_time=", l, arrayList);
                }
                Long l2 = this.closing_time;
                if (l2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("closing_time=", l2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Range{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Range;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Range build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Range() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Range(Long l, Long l2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.opening_time = l;
                this.closing_time = l2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$HoursForDay;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ HoursForDay build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public HoursForDay() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HoursForDay(Day day, List<Range> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.day = day;
            this.exceptional_hours_title = str;
            this.ranges = TransactorKt.immutableCopyOf("ranges", list);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalOpenHours.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOpenHours$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalOpenHours decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LocalOpenHours(m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(LocalOpenHours.HoursForDay.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalOpenHours value) {
                writer.getClass();
                value.getClass();
                LocalOpenHours.HoursForDay.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.hours_for_days);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalOpenHours value) {
                value.getClass();
                return LocalOpenHours.HoursForDay.ADAPTER.asRepeated().encodedSizeWithTag(1, value.hours_for_days) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalOpenHours redact(LocalOpenHours value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.hours_for_days, LocalOpenHours.HoursForDay.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new LocalOpenHours(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalOpenHours value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalOpenHours.HoursForDay.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.hours_for_days);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalOpenHours(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.hours_for_days = TransactorKt.immutableCopyOf("hours_for_days", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalOpenHours)) {
            return false;
        }
        LocalOpenHours localOpenHours = (LocalOpenHours) obj;
        return Intrinsics.areEqual(unknownFields(), localOpenHours.unknownFields()) && Intrinsics.areEqual(this.hours_for_days, localOpenHours.hours_for_days);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.hours_for_days.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.hours_for_days = this.hours_for_days;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.hours_for_days.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("hours_for_days=", arrayList, this.hours_for_days);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalOpenHours{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalOpenHours build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
