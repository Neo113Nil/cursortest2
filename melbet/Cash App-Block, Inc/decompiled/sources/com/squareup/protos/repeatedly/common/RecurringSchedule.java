package com.squareup.protos.repeatedly.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\u000f\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/repeatedly/common/RecurringSchedule;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Builder;", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency;", "frequency", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency;", "", "timezone", "Ljava/lang/String;", "", "time_of_day", "Ljava/lang/Integer;", "", "days_of_period", "Ljava/util/List;", "Companion", "Builder", "Frequency", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecurringSchedule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecurringSchedule> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<Integer> days_of_period;

    @WireField(adapter = "com.squareup.protos.repeatedly.common.RecurringSchedule$Frequency#ADAPTER", schemaIndex = 0, tag = 1)
    public final Frequency frequency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer time_of_day;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String timezone;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule;", "<init>", "()V", "frequency", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency;", "days_of_period", "", "", "timezone", "", "time_of_day", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public List<Integer> days_of_period = EmptyList.INSTANCE;
        public Frequency frequency;
        public Integer time_of_day;
        public String timezone;

        @Override // com.squareup.wire.Message.Builder
        public RecurringSchedule build() {
            return new RecurringSchedule(this.frequency, this.days_of_period, this.timezone, this.time_of_day, buildUnknownFields());
        }

        public final Builder days_of_period(List<Integer> days_of_period) {
            days_of_period.getClass();
            TransactorKt.checkElementsNotNull(days_of_period);
            this.days_of_period = days_of_period;
            return this;
        }

        public final Builder frequency(Frequency frequency) {
            this.frequency = frequency;
            return this;
        }

        public final Builder time_of_day(Integer time_of_day) {
            this.time_of_day = time_of_day;
            return this;
        }

        public final Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RecurringSchedule.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.repeatedly.common.RecurringSchedule$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RecurringSchedule decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RecurringSchedule((RecurringSchedule.Frequency) obj, m, (String) obj2, (Integer) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = RecurringSchedule.Frequency.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        m.add(ProtoAdapter.INT32.decode(reader));
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.INT32.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RecurringSchedule value) {
                writer.getClass();
                value.getClass();
                RecurringSchedule.Frequency.ADAPTER.encodeWithTag(writer, 1, value.frequency);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.asRepeated().encodeWithTag(writer, 2, value.days_of_period);
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.timezone);
                protoAdapter2.encodeWithTag(writer, 4, value.time_of_day);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RecurringSchedule value) {
                value.getClass();
                int encodedSizeWithTag = RecurringSchedule.Frequency.ADAPTER.encodedSizeWithTag(1, value.frequency) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                return protoAdapter2.encodedSizeWithTag(4, value.time_of_day) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.timezone) + protoAdapter2.asRepeated().encodedSizeWithTag(2, value.days_of_period) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RecurringSchedule redact(RecurringSchedule value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                RecurringSchedule.Frequency frequency = value.frequency;
                List<Integer> list = value.days_of_period;
                String str = value.timezone;
                Integer num = value.time_of_day;
                value.getClass();
                list.getClass();
                byteString.getClass();
                return new RecurringSchedule(frequency, list, str, num, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RecurringSchedule value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 4, value.time_of_day);
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.timezone);
                protoAdapter2.asRepeated().encodeWithTag(writer, 2, value.days_of_period);
                RecurringSchedule.Frequency.ADAPTER.encodeWithTag(writer, 1, value.frequency);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public RecurringSchedule(Frequency frequency, List list, String str, Integer num, int i) {
        this((i & 1) != 0 ? null : frequency, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecurringSchedule)) {
            return false;
        }
        RecurringSchedule recurringSchedule = (RecurringSchedule) obj;
        return Intrinsics.areEqual(unknownFields(), recurringSchedule.unknownFields()) && this.frequency == recurringSchedule.frequency && Intrinsics.areEqual(this.days_of_period, recurringSchedule.days_of_period) && Intrinsics.areEqual(this.timezone, recurringSchedule.timezone) && Intrinsics.areEqual(this.time_of_day, recurringSchedule.time_of_day);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Frequency frequency = this.frequency;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (frequency != null ? frequency.hashCode() : 0)) * 37, 37, this.days_of_period);
        String str = this.timezone;
        int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.time_of_day;
        int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.frequency = this.frequency;
        builder.days_of_period = this.days_of_period;
        builder.timezone = this.timezone;
        builder.time_of_day = this.time_of_day;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Frequency frequency = this.frequency;
        if (frequency != null) {
            arrayList.add("frequency=" + frequency);
        }
        if (!this.days_of_period.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("days_of_period=", arrayList, this.days_of_period);
        }
        String str = this.timezone;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "timezone=", arrayList);
        }
        Integer num = this.time_of_day;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("time_of_day=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringSchedule{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVERY_WEEK", "EVERY_TWO_WEEKS", "EVERY_MONTH", "EVERY_DAY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Frequency implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Frequency[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Frequency EVERY_WEEK = new Frequency("EVERY_WEEK", 0, 1);
        public static final Frequency EVERY_TWO_WEEKS = new Frequency("EVERY_TWO_WEEKS", 1, 2);
        public static final Frequency EVERY_MONTH = new Frequency("EVERY_MONTH", 2, 3);
        public static final Frequency EVERY_DAY = new Frequency("EVERY_DAY", 3, 4);

        private static final /* synthetic */ Frequency[] $values() {
            return new Frequency[]{EVERY_WEEK, EVERY_TWO_WEEKS, EVERY_MONTH, EVERY_DAY};
        }

        static {
            Frequency[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Frequency.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.repeatedly.common.RecurringSchedule$Frequency$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public RecurringSchedule.Frequency fromValue(int value) {
                    return RecurringSchedule.Frequency.INSTANCE.fromValue(value);
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

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Frequency fromValue(int value) {
                if (value == 1) {
                    return Frequency.EVERY_WEEK;
                }
                if (value == 2) {
                    return Frequency.EVERY_TWO_WEEKS;
                }
                if (value == 3) {
                    return Frequency.EVERY_MONTH;
                }
                if (value != 4) {
                    return null;
                }
                return Frequency.EVERY_DAY;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Builder;", "", "body", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/repeatedly/common/RecurringSchedule;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RecurringSchedule build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringSchedule(Frequency frequency, List list, String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.frequency = frequency;
        this.timezone = str;
        this.time_of_day = num;
        this.days_of_period = TransactorKt.immutableCopyOf("days_of_period", list);
    }
}
