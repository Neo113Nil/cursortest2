package com.squareup.protos.repeatedly.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001a\u0019\u001b\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Builder;", "", "enabled", "Ljava/lang/Boolean;", "Lcom/squareup/protos/common/Money;", "amount", "Lcom/squareup/protos/common/Money;", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule;", "recurring_schedule", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule;", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;", "type", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;", "", "next_reload_at", "Ljava/lang/Long;", "", "investment_entity_token", "Ljava/lang/String;", "source_instrument_token", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$SourceInstrumentType;", "source_instrument_type", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$SourceInstrumentType;", "Companion", "Builder", "Type", "SourceInstrumentType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScheduledTransactionPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledTransactionPreference> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
    public final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String investment_entity_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 5)
    public final Long next_reload_at;

    @WireField(adapter = "com.squareup.protos.repeatedly.common.RecurringSchedule#ADAPTER", schemaIndex = 2, tag = 3)
    public final RecurringSchedule recurring_schedule;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String source_instrument_token;

    @WireField(adapter = "com.squareup.protos.repeatedly.common.ScheduledTransactionPreference$SourceInstrumentType#ADAPTER", schemaIndex = 7, tag = 8)
    public final SourceInstrumentType source_instrument_type;

    @WireField(adapter = "com.squareup.protos.repeatedly.common.ScheduledTransactionPreference$Type#ADAPTER", schemaIndex = 3, tag = 4)
    public final Type type;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0016J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference;", "<init>", "()V", "enabled", "", "Ljava/lang/Boolean;", "amount", "Lcom/squareup/protos/common/Money;", "recurring_schedule", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule;", "type", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;", "next_reload_at", "", "Ljava/lang/Long;", "investment_entity_token", "", "source_instrument_token", "source_instrument_type", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$SourceInstrumentType;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Money amount;
        public Boolean enabled;
        public String investment_entity_token;
        public Long next_reload_at;
        public RecurringSchedule recurring_schedule;
        public String source_instrument_token;
        public SourceInstrumentType source_instrument_type;
        public Type type;

        public final Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ScheduledTransactionPreference build() {
            return new ScheduledTransactionPreference(this.enabled, this.amount, this.recurring_schedule, this.type, this.next_reload_at, this.investment_entity_token, this.source_instrument_token, this.source_instrument_type, buildUnknownFields());
        }

        public final Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public final Builder investment_entity_token(String investment_entity_token) {
            this.investment_entity_token = investment_entity_token;
            return this;
        }

        public final Builder next_reload_at(Long next_reload_at) {
            this.next_reload_at = next_reload_at;
            return this;
        }

        public final Builder recurring_schedule(RecurringSchedule recurring_schedule) {
            this.recurring_schedule = recurring_schedule;
            return this;
        }

        public final Builder source_instrument_token(String source_instrument_token) {
            this.source_instrument_token = source_instrument_token;
            return this;
        }

        public final Builder source_instrument_type(SourceInstrumentType source_instrument_type) {
            this.source_instrument_type = source_instrument_type;
            return this;
        }

        public final Builder type(Type type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ScheduledTransactionPreference.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.repeatedly.common.ScheduledTransactionPreference$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ScheduledTransactionPreference decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ScheduledTransactionPreference((Boolean) obj, (Money) obj2, (RecurringSchedule) obj3, (ScheduledTransactionPreference.Type) obj4, (Long) obj5, (String) obj6, (String) obj7, (ScheduledTransactionPreference.SourceInstrumentType) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(RecurringSchedule.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            try {
                                obj4 = ScheduledTransactionPreference.Type.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            obj5 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            try {
                                obj8 = ScheduledTransactionPreference.SourceInstrumentType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ScheduledTransactionPreference value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.enabled);
                Money.ADAPTER.encodeWithTag(writer, 2, value.amount);
                RecurringSchedule.ADAPTER.encodeWithTag(writer, 3, value.recurring_schedule);
                ScheduledTransactionPreference.Type.ADAPTER.encodeWithTag(writer, 4, value.type);
                ProtoAdapter.INT64.encodeWithTag(writer, 5, value.next_reload_at);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.investment_entity_token);
                protoAdapter2.encodeWithTag(writer, 7, value.source_instrument_token);
                ScheduledTransactionPreference.SourceInstrumentType.ADAPTER.encodeWithTag(writer, 8, value.source_instrument_type);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ScheduledTransactionPreference value) {
                value.getClass();
                int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(5, value.next_reload_at) + ScheduledTransactionPreference.Type.ADAPTER.encodedSizeWithTag(4, value.type) + RecurringSchedule.ADAPTER.encodedSizeWithTag(3, value.recurring_schedule) + Money.ADAPTER.encodedSizeWithTag(2, value.amount) + ProtoAdapter.BOOL.encodedSizeWithTag(1, value.enabled) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ScheduledTransactionPreference.SourceInstrumentType.ADAPTER.encodedSizeWithTag(8, value.source_instrument_type) + protoAdapter2.encodedSizeWithTag(7, value.source_instrument_token) + protoAdapter2.encodedSizeWithTag(6, value.investment_entity_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ScheduledTransactionPreference redact(ScheduledTransactionPreference value) {
                value.getClass();
                Money money = value.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                RecurringSchedule recurringSchedule = value.recurring_schedule;
                RecurringSchedule recurringSchedule2 = recurringSchedule != null ? (RecurringSchedule) RecurringSchedule.ADAPTER.redact(recurringSchedule) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.enabled;
                ScheduledTransactionPreference.Type type2 = value.type;
                Long l = value.next_reload_at;
                String str = value.investment_entity_token;
                String str2 = value.source_instrument_token;
                ScheduledTransactionPreference.SourceInstrumentType sourceInstrumentType = value.source_instrument_type;
                byteString.getClass();
                return new ScheduledTransactionPreference(bool, money2, recurringSchedule2, type2, l, str, str2, sourceInstrumentType, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ScheduledTransactionPreference value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ScheduledTransactionPreference.SourceInstrumentType.ADAPTER.encodeWithTag(writer, 8, value.source_instrument_type);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 7, value.source_instrument_token);
                protoAdapter2.encodeWithTag(writer, 6, value.investment_entity_token);
                ProtoAdapter.INT64.encodeWithTag(writer, 5, value.next_reload_at);
                ScheduledTransactionPreference.Type.ADAPTER.encodeWithTag(writer, 4, value.type);
                RecurringSchedule.ADAPTER.encodeWithTag(writer, 3, value.recurring_schedule);
                Money.ADAPTER.encodeWithTag(writer, 2, value.amount);
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.enabled);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ ScheduledTransactionPreference(Boolean bool, Money money, RecurringSchedule recurringSchedule, Type type2, Long l, String str, int i) {
        this(bool, money, recurringSchedule, (i & 8) != 0 ? null : type2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str, null, null, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledTransactionPreference)) {
            return false;
        }
        ScheduledTransactionPreference scheduledTransactionPreference = (ScheduledTransactionPreference) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledTransactionPreference.unknownFields()) && Intrinsics.areEqual(this.enabled, scheduledTransactionPreference.enabled) && Intrinsics.areEqual(this.amount, scheduledTransactionPreference.amount) && Intrinsics.areEqual(this.recurring_schedule, scheduledTransactionPreference.recurring_schedule) && this.type == scheduledTransactionPreference.type && Intrinsics.areEqual(this.next_reload_at, scheduledTransactionPreference.next_reload_at) && Intrinsics.areEqual(this.investment_entity_token, scheduledTransactionPreference.investment_entity_token) && Intrinsics.areEqual(this.source_instrument_token, scheduledTransactionPreference.source_instrument_token) && this.source_instrument_type == scheduledTransactionPreference.source_instrument_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        int hashCode4 = (hashCode3 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0)) * 37;
        Type type2 = this.type;
        int hashCode5 = (hashCode4 + (type2 != null ? type2.hashCode() : 0)) * 37;
        Long l = this.next_reload_at;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.investment_entity_token;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.source_instrument_token;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SourceInstrumentType sourceInstrumentType = this.source_instrument_type;
        int hashCode9 = hashCode8 + (sourceInstrumentType != null ? sourceInstrumentType.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.enabled = this.enabled;
        builder.amount = this.amount;
        builder.recurring_schedule = this.recurring_schedule;
        builder.type = this.type;
        builder.next_reload_at = this.next_reload_at;
        builder.investment_entity_token = this.investment_entity_token;
        builder.source_instrument_token = this.source_instrument_token;
        builder.source_instrument_type = this.source_instrument_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        if (recurringSchedule != null) {
            arrayList.add("recurring_schedule=" + recurringSchedule);
        }
        Type type2 = this.type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        Long l = this.next_reload_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_reload_at=", l, arrayList);
        }
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        String str2 = this.source_instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "source_instrument_token=", arrayList);
        }
        SourceInstrumentType sourceInstrumentType = this.source_instrument_type;
        if (sourceInstrumentType != null) {
            arrayList.add("source_instrument_type=" + sourceInstrumentType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledTransactionPreference{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$SourceInstrumentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEBIT_CARD", "BANK_ACCOUNT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SourceInstrumentType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceInstrumentType[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final SourceInstrumentType DEBIT_CARD = new SourceInstrumentType("DEBIT_CARD", 0, 1);
        public static final SourceInstrumentType BANK_ACCOUNT = new SourceInstrumentType("BANK_ACCOUNT", 1, 2);

        private static final /* synthetic */ SourceInstrumentType[] $values() {
            return new SourceInstrumentType[]{DEBIT_CARD, BANK_ACCOUNT};
        }

        static {
            SourceInstrumentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SourceInstrumentType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.repeatedly.common.ScheduledTransactionPreference$SourceInstrumentType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ScheduledTransactionPreference.SourceInstrumentType fromValue(int value) {
                    return ScheduledTransactionPreference.SourceInstrumentType.INSTANCE.fromValue(value);
                }
            };
        }

        private SourceInstrumentType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final SourceInstrumentType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static SourceInstrumentType valueOf(String str) {
            return (SourceInstrumentType) Enum.valueOf(SourceInstrumentType.class, str);
        }

        public static SourceInstrumentType[] values() {
            return (SourceInstrumentType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$SourceInstrumentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$SourceInstrumentType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SourceInstrumentType fromValue(int value) {
                if (value == 1) {
                    return SourceInstrumentType.DEBIT_CARD;
                }
                if (value != 2) {
                    return null;
                }
                return SourceInstrumentType.BANK_ACCOUNT;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CASH_IN", "BTC_BUY", "EQUITY_BUY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Type CASH_IN = new Type("CASH_IN", 0, 1);
        public static final Type BTC_BUY = new Type("BTC_BUY", 1, 2);
        public static final Type EQUITY_BUY = new Type("EQUITY_BUY", 2, 3);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{CASH_IN, BTC_BUY, EQUITY_BUY};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.repeatedly.common.ScheduledTransactionPreference$Type$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ScheduledTransactionPreference.Type fromValue(int value) {
                    return ScheduledTransactionPreference.Type.INSTANCE.fromValue(value);
                }
            };
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromValue(int value) {
                if (value == 1) {
                    return Type.CASH_IN;
                }
                if (value == 2) {
                    return Type.BTC_BUY;
                }
                if (value != 3) {
                    return null;
                }
                return Type.EQUITY_BUY;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Builder;", "", "body", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ScheduledTransactionPreference build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledTransactionPreference(Boolean bool, Money money, RecurringSchedule recurringSchedule, Type type2, Long l, String str, String str2, SourceInstrumentType sourceInstrumentType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.amount = money;
        this.recurring_schedule = recurringSchedule;
        this.type = type2;
        this.next_reload_at = l;
        this.investment_entity_token = str;
        this.source_instrument_token = str2;
        this.source_instrument_type = sourceInstrumentType;
    }
}
