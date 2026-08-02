package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b\u001b\u001a\u001c\u001d\u001e\u001f !R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\""}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "text", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule;", "selected_schedule", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu;", "cadence_menu", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button;", "primary_button", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button;", "secondary_button", "", "receive_limit_per_payment", "Ljava/lang/Long;", "receive_minimum_per_payment", "", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption;", "amount_options", "Ljava/util/List;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence;", "enumerated_cadences", "Companion", "Builder", "Text", "Schedule", "AmountOption", "CadenceMenu", "Button", "EnumeratedCadence", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecurringPaymentBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecurringPaymentBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$AmountOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<AmountOption> amount_options;

    @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu#ADAPTER", schemaIndex = 3, tag = 4)
    public final CadenceMenu cadence_menu;

    @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$EnumeratedCadence#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    public final List<EnumeratedCadence> enumerated_cadences;

    @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$Button#ADAPTER", schemaIndex = 4, tag = 5)
    public final Button primary_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 6, tag = 7)
    public final Long receive_limit_per_payment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 8, tag = 9)
    public final Long receive_minimum_per_payment;

    @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$Button#ADAPTER", schemaIndex = 5, tag = 6)
    public final Button secondary_button;

    @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$Schedule#ADAPTER", schemaIndex = 1, tag = 2)
    public final Schedule selected_schedule;

    @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$Text#ADAPTER", schemaIndex = 0, tag = 1)
    public final Text text;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Builder;", "amount", "", "is_selected", "", "type", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Type;Lokio/ByteString;)V", "Ljava/lang/Long;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Long;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Type;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption;", "Builder", "Companion", "Type", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AmountOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AmountOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
        public final Long amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
        public final Boolean is_selected;

        @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$AmountOption$Type#ADAPTER", schemaIndex = 2, tag = 3)
        public final Type type;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption;", "<init>", "()V", "amount", "", "Ljava/lang/Long;", "is_selected", "", "Ljava/lang/Boolean;", "type", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Type;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Long amount;
            public Boolean is_selected;
            public Type type;

            public final Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public AmountOption build() {
                return new AmountOption(this.amount, this.is_selected, this.type, buildUnknownFields());
            }

            public final Builder is_selected(Boolean is_selected) {
                this.is_selected = is_selected;
                return this;
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AmountOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$AmountOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.AmountOption decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RecurringPaymentBlocker.AmountOption((Long) obj, (Boolean) obj2, (RecurringPaymentBlocker.AmountOption.Type) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT64.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj3 = RecurringPaymentBlocker.AmountOption.Type.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RecurringPaymentBlocker.AmountOption value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, value.amount);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.is_selected);
                    RecurringPaymentBlocker.AmountOption.Type.ADAPTER.encodeWithTag(writer, 3, value.type);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RecurringPaymentBlocker.AmountOption value) {
                    value.getClass();
                    return RecurringPaymentBlocker.AmountOption.Type.ADAPTER.encodedSizeWithTag(3, value.type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.is_selected) + ProtoAdapter.INT64.encodedSizeWithTag(1, value.amount) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.AmountOption redact(RecurringPaymentBlocker.AmountOption value) {
                    value.getClass();
                    return RecurringPaymentBlocker.AmountOption.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.AmountOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    RecurringPaymentBlocker.AmountOption.Type.ADAPTER.encodeWithTag(writer, 3, value.type);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.is_selected);
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, value.amount);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AmountOption(Long l, Boolean bool, Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : type2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AmountOption copy$default(AmountOption amountOption, Long l, Boolean bool, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                l = amountOption.amount;
            }
            if ((i & 2) != 0) {
                bool = amountOption.is_selected;
            }
            if ((i & 4) != 0) {
                type2 = amountOption.type;
            }
            if ((i & 8) != 0) {
                byteString = amountOption.unknownFields();
            }
            return amountOption.copy(l, bool, type2, byteString);
        }

        public final AmountOption copy(Long amount, Boolean is_selected, Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new AmountOption(amount, is_selected, type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AmountOption)) {
                return false;
            }
            AmountOption amountOption = (AmountOption) other;
            return Intrinsics.areEqual(unknownFields(), amountOption.unknownFields()) && Intrinsics.areEqual(this.amount, amountOption.amount) && Intrinsics.areEqual(this.is_selected, amountOption.is_selected) && this.type == amountOption.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.amount;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Boolean bool = this.is_selected;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Type type2 = this.type;
            int hashCode4 = hashCode3 + (type2 != null ? type2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.amount = this.amount;
            builder.is_selected = this.is_selected;
            builder.type = this.type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.amount;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("amount=", l, arrayList);
            }
            Boolean bool = this.is_selected;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_selected=", bool, arrayList);
            }
            Type type2 = this.type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AmountOption{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "PRESET", "CUSTOM", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Type implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final Type CUSTOM;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Type PRESET;
            public static final Type UNKNOWN;
            private final int value;

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{UNKNOWN, PRESET, CUSTOM};
            }

            static {
                final Type type2 = new Type("UNKNOWN", 0, 0);
                UNKNOWN = type2;
                PRESET = new Type("PRESET", 1, 1);
                CUSTOM = new Type("CUSTOM", 2, 2);
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Type.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, type2) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$AmountOption$Type$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public RecurringPaymentBlocker.AmountOption.Type fromValue(int value) {
                        return RecurringPaymentBlocker.AmountOption.Type.INSTANCE.fromValue(value);
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

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Type;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Type fromValue(int value) {
                    if (value == 0) {
                        return Type.UNKNOWN;
                    }
                    if (value == 1) {
                        return Type.PRESET;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Type.CUSTOM;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AmountOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public AmountOption() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountOption(Long l, Boolean bool, Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = l;
            this.is_selected = bool;
            this.type = type2;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0014\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nJ\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker;", "<init>", "()V", "text", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "selected_schedule", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule;", "amount_options", "", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$AmountOption;", "cadence_menu", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu;", "primary_button", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button;", "secondary_button", "receive_limit_per_payment", "", "Ljava/lang/Long;", "enumerated_cadences", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence;", "receive_minimum_per_payment", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public List<AmountOption> amount_options;
        public CadenceMenu cadence_menu;
        public List<EnumeratedCadence> enumerated_cadences;
        public Button primary_button;
        public Long receive_limit_per_payment;
        public Long receive_minimum_per_payment;
        public Button secondary_button;
        public Schedule selected_schedule;
        public Text text;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.amount_options = emptyList;
            this.enumerated_cadences = emptyList;
        }

        public final Builder amount_options(List<AmountOption> amount_options) {
            amount_options.getClass();
            TransactorKt.checkElementsNotNull(amount_options);
            this.amount_options = amount_options;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public RecurringPaymentBlocker build() {
            return new RecurringPaymentBlocker(this.text, this.selected_schedule, this.amount_options, this.cadence_menu, this.primary_button, this.secondary_button, this.receive_limit_per_payment, this.enumerated_cadences, this.receive_minimum_per_payment, buildUnknownFields());
        }

        public final Builder cadence_menu(CadenceMenu cadence_menu) {
            this.cadence_menu = cadence_menu;
            return this;
        }

        public final Builder enumerated_cadences(List<EnumeratedCadence> enumerated_cadences) {
            enumerated_cadences.getClass();
            TransactorKt.checkElementsNotNull(enumerated_cadences);
            this.enumerated_cadences = enumerated_cadences;
            return this;
        }

        public final Builder primary_button(Button primary_button) {
            this.primary_button = primary_button;
            return this;
        }

        public final Builder receive_limit_per_payment(Long receive_limit_per_payment) {
            this.receive_limit_per_payment = receive_limit_per_payment;
            return this;
        }

        public final Builder receive_minimum_per_payment(Long receive_minimum_per_payment) {
            this.receive_minimum_per_payment = receive_minimum_per_payment;
            return this;
        }

        public final Builder secondary_button(Button secondary_button) {
            this.secondary_button = secondary_button;
            return this;
        }

        public final Builder selected_schedule(Schedule selected_schedule) {
            this.selected_schedule = selected_schedule;
            return this;
        }

        public final Builder text(Text text) {
            this.text = text;
            return this;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Builder;", "text", "", "action", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Action;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Action", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$Button$Action#ADAPTER", schemaIndex = 1, tag = 2)
        public final Action action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button;", "<init>", "()V", "text", "", "action", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Action;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Action action;
            public String text;

            public final Builder action(Action action) {
                this.action = action;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Button build() {
                return new Button(this.text, this.action, buildUnknownFields());
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Button.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$Button$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.Button decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RecurringPaymentBlocker.Button((String) obj, (RecurringPaymentBlocker.Button.Action) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj2 = RecurringPaymentBlocker.Button.Action.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RecurringPaymentBlocker.Button value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    RecurringPaymentBlocker.Button.Action.ADAPTER.encodeWithTag(writer, 2, value.action);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RecurringPaymentBlocker.Button value) {
                    value.getClass();
                    return RecurringPaymentBlocker.Button.Action.ADAPTER.encodedSizeWithTag(2, value.action) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.Button redact(RecurringPaymentBlocker.Button value) {
                    value.getClass();
                    return RecurringPaymentBlocker.Button.copy$default(value, null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.Button value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    RecurringPaymentBlocker.Button.Action.ADAPTER.encodeWithTag(writer, 2, value.action);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Button(String str, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : action, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Button copy$default(Button button, String str, Action action, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.text;
            }
            if ((i & 2) != 0) {
                action = button.action;
            }
            if ((i & 4) != 0) {
                byteString = button.unknownFields();
            }
            return button.copy(str, action, byteString);
        }

        public final Button copy(String text, Action action, ByteString unknownFields) {
            unknownFields.getClass();
            return new Button(text, action, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && this.action == button.action;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.action = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.text != null) {
                arrayList.add("text=██");
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Action;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SET", "DELETE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Action implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final Action SET = new Action("SET", 0, 1);
            public static final Action DELETE = new Action("DELETE", 1, 2);

            private static final /* synthetic */ Action[] $values() {
                return new Action[]{SET, DELETE};
            }

            static {
                Action[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Action.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$Button$Action$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public RecurringPaymentBlocker.Button.Action fromValue(int value) {
                        return RecurringPaymentBlocker.Button.Action.INSTANCE.fromValue(value);
                    }
                };
            }

            private Action(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Action fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Action$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Action;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Action fromValue(int value) {
                    if (value == 1) {
                        return Action.SET;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Action.DELETE;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Button;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Button build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Button() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(String str, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.action = action;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cB9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J8\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$Builder;", "icon", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$LocalImageElement$Icon;", "text", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "cadence_options", "", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/FormBlocker$Element$LocalImageElement$Icon;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "CadenceOption", "DayOfCadenceMenu", "DayOfCadenceOption", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CadenceMenu extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CadenceMenu> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$CadenceOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        public final List<CadenceOption> cadence_options;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$LocalImageElement$Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final FormBlocker.Element.LocalImageElement.Icon icon;

        @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$Text#ADAPTER", schemaIndex = 1, tag = 2)
        public final Text text;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu;", "<init>", "()V", "icon", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$LocalImageElement$Icon;", "text", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "cadence_options", "", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<CadenceOption> cadence_options = EmptyList.INSTANCE;
            public FormBlocker.Element.LocalImageElement.Icon icon;
            public Text text;

            @Override // com.squareup.wire.Message.Builder
            public CadenceMenu build() {
                return new CadenceMenu(this.icon, this.text, this.cadence_options, buildUnknownFields());
            }

            public final Builder cadence_options(List<CadenceOption> cadence_options) {
                cadence_options.getClass();
                TransactorKt.checkElementsNotNull(cadence_options);
                this.cadence_options = cadence_options;
                return this;
            }

            public final Builder icon(FormBlocker.Element.LocalImageElement.Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder text(Text text) {
                this.text = text;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u001e\u001fBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\bH\u0096\u0080\u0004J\b\u0010\u001a\u001a\u00020\u0006H\u0016J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u001cR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$Builder;", "button_icon", "Lcom/squareup/protos/cash/ui/Image;", "button_text", "", "day_of_cadence", "", "should_display_day_picker", "", "day_picker", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;", "button_text_horizontal_alignment", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment;Lokio/ByteString;)V", "Ljava/lang/Integer;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption;", "Builder", "Companion", "TextAlignment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DayOfCadenceOption extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DayOfCadenceOption> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
            public final Image button_icon;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String button_text;

            @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment#ADAPTER", schemaIndex = 5, tag = 6)
            public final TextAlignment button_text_horizontal_alignment;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
            public final Integer day_of_cadence;

            @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu#ADAPTER", schemaIndex = 4, tag = 5)
            public final DayOfCadenceMenu day_picker;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
            public final Boolean should_display_day_picker;

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0013J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0014J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption;", "<init>", "()V", "button_icon", "Lcom/squareup/protos/cash/ui/Image;", "button_text", "", "day_of_cadence", "", "Ljava/lang/Integer;", "should_display_day_picker", "", "Ljava/lang/Boolean;", "day_picker", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;", "button_text_horizontal_alignment", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Image button_icon;
                public String button_text;
                public TextAlignment button_text_horizontal_alignment;
                public Integer day_of_cadence;
                public DayOfCadenceMenu day_picker;
                public Boolean should_display_day_picker;

                @Override // com.squareup.wire.Message.Builder
                public DayOfCadenceOption build() {
                    return new DayOfCadenceOption(this.button_icon, this.button_text, this.day_of_cadence, this.should_display_day_picker, this.day_picker, this.button_text_horizontal_alignment, buildUnknownFields());
                }

                public final Builder button_icon(Image button_icon) {
                    this.button_icon = button_icon;
                    return this;
                }

                public final Builder button_text(String button_text) {
                    this.button_text = button_text;
                    return this;
                }

                public final Builder button_text_horizontal_alignment(TextAlignment button_text_horizontal_alignment) {
                    this.button_text_horizontal_alignment = button_text_horizontal_alignment;
                    return this;
                }

                public final Builder day_of_cadence(Integer day_of_cadence) {
                    this.day_of_cadence = day_of_cadence;
                    return this;
                }

                public final Builder day_picker(DayOfCadenceMenu day_picker) {
                    this.day_picker = day_picker;
                    return this;
                }

                public final Builder should_display_day_picker(Boolean should_display_day_picker) {
                    this.should_display_day_picker = should_display_day_picker;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DayOfCadenceOption.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        Object obj5 = null;
                        Object obj6 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption((Image) obj, (String) obj2, (Integer) obj3, (Boolean) obj4, (RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu) obj5, (RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            switch (nextTag) {
                                case 1:
                                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                                    break;
                                case 2:
                                    obj2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    obj3 = ProtoAdapter.INT32.decode(reader);
                                    break;
                                case 4:
                                    obj4 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 5:
                                    obj5 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER, reader, obj5);
                                    break;
                                case 6:
                                    try {
                                        obj6 = RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(nextTag);
                                    break;
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption value) {
                        writer.getClass();
                        value.getClass();
                        Image.ADAPTER.encodeWithTag(writer, 1, value.button_icon);
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.button_text);
                        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.day_of_cadence);
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.should_display_day_picker);
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER.encodeWithTag(writer, 5, value.day_picker);
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.ADAPTER.encodeWithTag(writer, 6, value.button_text_horizontal_alignment);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption value) {
                        value.getClass();
                        return RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.ADAPTER.encodedSizeWithTag(6, value.button_text_horizontal_alignment) + RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER.encodedSizeWithTag(5, value.day_picker) + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.should_display_day_picker) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.day_of_cadence) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.button_text) + Image.ADAPTER.encodedSizeWithTag(1, value.button_icon) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption redact(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption value) {
                        value.getClass();
                        Image image = value.button_icon;
                        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu = value.day_picker;
                        return RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.copy$default(value, image2, null, null, null, dayOfCadenceMenu != null ? (RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu) RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER.redact(dayOfCadenceMenu) : null, null, ByteString.EMPTY, 46, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.ADAPTER.encodeWithTag(writer, 6, value.button_text_horizontal_alignment);
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER.encodeWithTag(writer, 5, value.day_picker);
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.should_display_day_picker);
                        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.day_of_cadence);
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.button_text);
                        Image.ADAPTER.encodeWithTag(writer, 1, value.button_icon);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ DayOfCadenceOption(Image image, String str, Integer num, Boolean bool, DayOfCadenceMenu dayOfCadenceMenu, TextAlignment textAlignment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : dayOfCadenceMenu, (i & 32) != 0 ? null : textAlignment, (i & 64) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ DayOfCadenceOption copy$default(DayOfCadenceOption dayOfCadenceOption, Image image, String str, Integer num, Boolean bool, DayOfCadenceMenu dayOfCadenceMenu, TextAlignment textAlignment, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    image = dayOfCadenceOption.button_icon;
                }
                if ((i & 2) != 0) {
                    str = dayOfCadenceOption.button_text;
                }
                if ((i & 4) != 0) {
                    num = dayOfCadenceOption.day_of_cadence;
                }
                if ((i & 8) != 0) {
                    bool = dayOfCadenceOption.should_display_day_picker;
                }
                if ((i & 16) != 0) {
                    dayOfCadenceMenu = dayOfCadenceOption.day_picker;
                }
                if ((i & 32) != 0) {
                    textAlignment = dayOfCadenceOption.button_text_horizontal_alignment;
                }
                if ((i & 64) != 0) {
                    byteString = dayOfCadenceOption.unknownFields();
                }
                TextAlignment textAlignment2 = textAlignment;
                ByteString byteString2 = byteString;
                DayOfCadenceMenu dayOfCadenceMenu2 = dayOfCadenceMenu;
                Integer num2 = num;
                return dayOfCadenceOption.copy(image, str, num2, bool, dayOfCadenceMenu2, textAlignment2, byteString2);
            }

            public final DayOfCadenceOption copy(Image button_icon, String button_text, Integer day_of_cadence, Boolean should_display_day_picker, DayOfCadenceMenu day_picker, TextAlignment button_text_horizontal_alignment, ByteString unknownFields) {
                unknownFields.getClass();
                return new DayOfCadenceOption(button_icon, button_text, day_of_cadence, should_display_day_picker, day_picker, button_text_horizontal_alignment, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DayOfCadenceOption)) {
                    return false;
                }
                DayOfCadenceOption dayOfCadenceOption = (DayOfCadenceOption) other;
                return Intrinsics.areEqual(unknownFields(), dayOfCadenceOption.unknownFields()) && Intrinsics.areEqual(this.button_icon, dayOfCadenceOption.button_icon) && Intrinsics.areEqual(this.button_text, dayOfCadenceOption.button_text) && Intrinsics.areEqual(this.day_of_cadence, dayOfCadenceOption.day_of_cadence) && Intrinsics.areEqual(this.should_display_day_picker, dayOfCadenceOption.should_display_day_picker) && Intrinsics.areEqual(this.day_picker, dayOfCadenceOption.day_picker) && this.button_text_horizontal_alignment == dayOfCadenceOption.button_text_horizontal_alignment;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Image image = this.button_icon;
                int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
                String str = this.button_text;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                Integer num = this.day_of_cadence;
                int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                Boolean bool = this.should_display_day_picker;
                int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                DayOfCadenceMenu dayOfCadenceMenu = this.day_picker;
                int hashCode6 = (hashCode5 + (dayOfCadenceMenu != null ? dayOfCadenceMenu.hashCode() : 0)) * 37;
                TextAlignment textAlignment = this.button_text_horizontal_alignment;
                int hashCode7 = hashCode6 + (textAlignment != null ? textAlignment.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.button_icon = this.button_icon;
                builder.button_text = this.button_text;
                builder.day_of_cadence = this.day_of_cadence;
                builder.should_display_day_picker = this.should_display_day_picker;
                builder.day_picker = this.day_picker;
                builder.button_text_horizontal_alignment = this.button_text_horizontal_alignment;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Image image = this.button_icon;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("button_icon=", image, arrayList);
                }
                String str = this.button_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_text=", arrayList);
                }
                Integer num = this.day_of_cadence;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("day_of_cadence=", num, arrayList);
                }
                Boolean bool = this.should_display_day_picker;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("should_display_day_picker=", bool, arrayList);
                }
                DayOfCadenceMenu dayOfCadenceMenu = this.day_picker;
                if (dayOfCadenceMenu != null) {
                    arrayList.add("day_picker=" + dayOfCadenceMenu);
                }
                TextAlignment textAlignment = this.button_text_horizontal_alignment;
                if (textAlignment != null) {
                    arrayList.add("button_text_horizontal_alignment=" + textAlignment);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DayOfCadenceOption{", "}", 0, null, null, 56);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNSPECIFIED", "LEFT", "CENTER", "RIGHT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class TextAlignment implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ TextAlignment[] $VALUES;
                public static final ProtoAdapter ADAPTER;
                public static final TextAlignment CENTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final TextAlignment LEFT;
                public static final TextAlignment RIGHT;
                public static final TextAlignment UNSPECIFIED;
                private final int value;

                private static final /* synthetic */ TextAlignment[] $values() {
                    return new TextAlignment[]{UNSPECIFIED, LEFT, CENTER, RIGHT};
                }

                static {
                    final TextAlignment textAlignment = new TextAlignment("UNSPECIFIED", 0, 0);
                    UNSPECIFIED = textAlignment;
                    LEFT = new TextAlignment("LEFT", 1, 1);
                    CENTER = new TextAlignment("CENTER", 2, 2);
                    RIGHT = new TextAlignment("RIGHT", 3, 3);
                    TextAlignment[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Tags.enumEntries($values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TextAlignment.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, textAlignment) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment$Companion$ADAPTER$1
                        @Override // com.squareup.wire.EnumAdapter
                        public RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment fromValue(int value) {
                            return RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.INSTANCE.fromValue(value);
                        }
                    };
                }

                private TextAlignment(String str, int i, int i2) {
                    this.value = i2;
                }

                public static final TextAlignment fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static TextAlignment valueOf(String str) {
                    return (TextAlignment) Enum.valueOf(TextAlignment.class, str);
                }

                public static TextAlignment[] values() {
                    return (TextAlignment[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$TextAlignment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final TextAlignment fromValue(int value) {
                        if (value == 0) {
                            return TextAlignment.UNSPECIFIED;
                        }
                        if (value == 1) {
                            return TextAlignment.LEFT;
                        }
                        if (value == 2) {
                            return TextAlignment.CENTER;
                        }
                        if (value != 3) {
                            return null;
                        }
                        return TextAlignment.RIGHT;
                    }

                    private Companion() {
                    }
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ DayOfCadenceOption build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public DayOfCadenceOption() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DayOfCadenceOption(Image image, String str, Integer num, Boolean bool, DayOfCadenceMenu dayOfCadenceMenu, TextAlignment textAlignment, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.button_icon = image;
                this.button_text = str;
                this.day_of_cadence = num;
                this.should_display_day_picker = bool;
                this.day_picker = dayOfCadenceMenu;
                this.button_text_horizontal_alignment = textAlignment;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CadenceMenu.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.CadenceMenu decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RecurringPaymentBlocker.CadenceMenu((FormBlocker.Element.LocalImageElement.Icon) obj, (RecurringPaymentBlocker.Text) obj2, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = FormBlocker.Element.LocalImageElement.Icon.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.Text.ADAPTER, reader, obj2);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(RecurringPaymentBlocker.CadenceMenu.CadenceOption.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RecurringPaymentBlocker.CadenceMenu value) {
                    writer.getClass();
                    value.getClass();
                    FormBlocker.Element.LocalImageElement.Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                    RecurringPaymentBlocker.Text.ADAPTER.encodeWithTag(writer, 2, value.text);
                    RecurringPaymentBlocker.CadenceMenu.CadenceOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.cadence_options);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RecurringPaymentBlocker.CadenceMenu value) {
                    value.getClass();
                    return RecurringPaymentBlocker.CadenceMenu.CadenceOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.cadence_options) + RecurringPaymentBlocker.Text.ADAPTER.encodedSizeWithTag(2, value.text) + FormBlocker.Element.LocalImageElement.Icon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.CadenceMenu redact(RecurringPaymentBlocker.CadenceMenu value) {
                    value.getClass();
                    RecurringPaymentBlocker.Text text = value.text;
                    return RecurringPaymentBlocker.CadenceMenu.copy$default(value, null, text != null ? (RecurringPaymentBlocker.Text) RecurringPaymentBlocker.Text.ADAPTER.redact(text) : null, TransactorKt.m1169redactElements(value.cadence_options, RecurringPaymentBlocker.CadenceMenu.CadenceOption.ADAPTER), ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.CadenceMenu value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    RecurringPaymentBlocker.CadenceMenu.CadenceOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.cadence_options);
                    RecurringPaymentBlocker.Text.ADAPTER.encodeWithTag(writer, 2, value.text);
                    FormBlocker.Element.LocalImageElement.Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public CadenceMenu(FormBlocker.Element.LocalImageElement.Icon icon, Text text, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : text, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CadenceMenu copy$default(CadenceMenu cadenceMenu, FormBlocker.Element.LocalImageElement.Icon icon, Text text, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = cadenceMenu.icon;
            }
            if ((i & 2) != 0) {
                text = cadenceMenu.text;
            }
            if ((i & 4) != 0) {
                list = cadenceMenu.cadence_options;
            }
            if ((i & 8) != 0) {
                byteString = cadenceMenu.unknownFields();
            }
            return cadenceMenu.copy(icon, text, list, byteString);
        }

        public final CadenceMenu copy(FormBlocker.Element.LocalImageElement.Icon icon, Text text, List<CadenceOption> cadence_options, ByteString unknownFields) {
            cadence_options.getClass();
            unknownFields.getClass();
            return new CadenceMenu(icon, text, cadence_options, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CadenceMenu)) {
                return false;
            }
            CadenceMenu cadenceMenu = (CadenceMenu) other;
            return Intrinsics.areEqual(unknownFields(), cadenceMenu.unknownFields()) && this.icon == cadenceMenu.icon && Intrinsics.areEqual(this.text, cadenceMenu.text) && Intrinsics.areEqual(this.cadence_options, cadenceMenu.cadence_options);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            FormBlocker.Element.LocalImageElement.Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            Text text = this.text;
            int hashCode3 = this.cadence_options.hashCode() + ((hashCode2 + (text != null ? text.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon = this.icon;
            builder.text = this.text;
            builder.cadence_options = this.cadence_options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            FormBlocker.Element.LocalImageElement.Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            Text text = this.text;
            if (text != null) {
                arrayList.add("text=" + text);
            }
            if (!this.cadence_options.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("cadence_options=", arrayList, this.cadence_options);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CadenceMenu{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0006H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption$Builder;", "button_icon", "Lcom/squareup/protos/cash/ui/Image;", "button_text", "", "day_of_cadence_menu", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/String;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CadenceOption extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CadenceOption> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
            public final Image button_icon;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String button_text;

            @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu#ADAPTER", schemaIndex = 2, tag = 3)
            public final DayOfCadenceMenu day_of_cadence_menu;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption;", "<init>", "()V", "button_icon", "Lcom/squareup/protos/cash/ui/Image;", "button_text", "", "day_of_cadence_menu", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Image button_icon;
                public String button_text;
                public DayOfCadenceMenu day_of_cadence_menu;

                @Override // com.squareup.wire.Message.Builder
                public CadenceOption build() {
                    return new CadenceOption(this.button_icon, this.button_text, this.day_of_cadence_menu, buildUnknownFields());
                }

                public final Builder button_icon(Image button_icon) {
                    this.button_icon = button_icon;
                    return this;
                }

                public final Builder button_text(String button_text) {
                    this.button_text = button_text;
                    return this;
                }

                public final Builder day_of_cadence_menu(DayOfCadenceMenu day_of_cadence_menu) {
                    this.day_of_cadence_menu = day_of_cadence_menu;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CadenceOption.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$CadenceOption$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public RecurringPaymentBlocker.CadenceMenu.CadenceOption decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new RecurringPaymentBlocker.CadenceMenu.CadenceOption((Image) obj, (String) obj2, (RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER, reader, obj3);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, RecurringPaymentBlocker.CadenceMenu.CadenceOption value) {
                        writer.getClass();
                        value.getClass();
                        Image.ADAPTER.encodeWithTag(writer, 1, value.button_icon);
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.button_text);
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER.encodeWithTag(writer, 3, value.day_of_cadence_menu);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(RecurringPaymentBlocker.CadenceMenu.CadenceOption value) {
                        value.getClass();
                        return RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER.encodedSizeWithTag(3, value.day_of_cadence_menu) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.button_text) + Image.ADAPTER.encodedSizeWithTag(1, value.button_icon) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public RecurringPaymentBlocker.CadenceMenu.CadenceOption redact(RecurringPaymentBlocker.CadenceMenu.CadenceOption value) {
                        value.getClass();
                        Image image = value.button_icon;
                        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu = value.day_of_cadence_menu;
                        return RecurringPaymentBlocker.CadenceMenu.CadenceOption.copy$default(value, image2, null, dayOfCadenceMenu != null ? (RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu) RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER.redact(dayOfCadenceMenu) : null, ByteString.EMPTY, 2, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.CadenceMenu.CadenceOption value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.ADAPTER.encodeWithTag(writer, 3, value.day_of_cadence_menu);
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.button_text);
                        Image.ADAPTER.encodeWithTag(writer, 1, value.button_icon);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ CadenceOption(Image image, String str, DayOfCadenceMenu dayOfCadenceMenu, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : dayOfCadenceMenu, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ CadenceOption copy$default(CadenceOption cadenceOption, Image image, String str, DayOfCadenceMenu dayOfCadenceMenu, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    image = cadenceOption.button_icon;
                }
                if ((i & 2) != 0) {
                    str = cadenceOption.button_text;
                }
                if ((i & 4) != 0) {
                    dayOfCadenceMenu = cadenceOption.day_of_cadence_menu;
                }
                if ((i & 8) != 0) {
                    byteString = cadenceOption.unknownFields();
                }
                return cadenceOption.copy(image, str, dayOfCadenceMenu, byteString);
            }

            public final CadenceOption copy(Image button_icon, String button_text, DayOfCadenceMenu day_of_cadence_menu, ByteString unknownFields) {
                unknownFields.getClass();
                return new CadenceOption(button_icon, button_text, day_of_cadence_menu, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof CadenceOption)) {
                    return false;
                }
                CadenceOption cadenceOption = (CadenceOption) other;
                return Intrinsics.areEqual(unknownFields(), cadenceOption.unknownFields()) && Intrinsics.areEqual(this.button_icon, cadenceOption.button_icon) && Intrinsics.areEqual(this.button_text, cadenceOption.button_text) && Intrinsics.areEqual(this.day_of_cadence_menu, cadenceOption.day_of_cadence_menu);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Image image = this.button_icon;
                int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
                String str = this.button_text;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                DayOfCadenceMenu dayOfCadenceMenu = this.day_of_cadence_menu;
                int hashCode4 = hashCode3 + (dayOfCadenceMenu != null ? dayOfCadenceMenu.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.button_icon = this.button_icon;
                builder.button_text = this.button_text;
                builder.day_of_cadence_menu = this.day_of_cadence_menu;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Image image = this.button_icon;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("button_icon=", image, arrayList);
                }
                String str = this.button_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_text=", arrayList);
                }
                DayOfCadenceMenu dayOfCadenceMenu = this.day_of_cadence_menu;
                if (dayOfCadenceMenu != null) {
                    arrayList.add("day_of_cadence_menu=" + dayOfCadenceMenu);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CadenceOption{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$CadenceOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ CadenceOption build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public CadenceOption() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CadenceOption(Image image, String str, DayOfCadenceMenu dayOfCadenceMenu, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.button_icon = image;
                this.button_text = str;
                this.day_of_cadence_menu = dayOfCadenceMenu;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016J8\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu$Builder;", "cadence", "", "text", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "day_of_cadence_options", "", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DayOfCadenceMenu extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DayOfCadenceMenu> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String cadence;

            @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
            public final List<DayOfCadenceOption> day_of_cadence_options;

            @WireField(adapter = "com.squareup.protos.franklin.api.RecurringPaymentBlocker$Text#ADAPTER", schemaIndex = 1, tag = 2)
            public final Text text;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;", "<init>", "()V", "cadence", "", "text", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "day_of_cadence_options", "", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String cadence;
                public List<DayOfCadenceOption> day_of_cadence_options = EmptyList.INSTANCE;
                public Text text;

                @Override // com.squareup.wire.Message.Builder
                public DayOfCadenceMenu build() {
                    return new DayOfCadenceMenu(this.cadence, this.text, this.day_of_cadence_options, buildUnknownFields());
                }

                public final Builder cadence(String cadence) {
                    this.cadence = cadence;
                    return this;
                }

                public final Builder day_of_cadence_options(List<DayOfCadenceOption> day_of_cadence_options) {
                    day_of_cadence_options.getClass();
                    TransactorKt.checkElementsNotNull(day_of_cadence_options);
                    this.day_of_cadence_options = day_of_cadence_options;
                    return this;
                }

                public final Builder text(Text text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DayOfCadenceMenu.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu((String) obj, (RecurringPaymentBlocker.Text) obj2, m, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.Text.ADAPTER, reader, obj2);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                m.add(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.cadence);
                        RecurringPaymentBlocker.Text.ADAPTER.encodeWithTag(writer, 2, value.text);
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.day_of_cadence_options);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu value) {
                        value.getClass();
                        return RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.day_of_cadence_options) + RecurringPaymentBlocker.Text.ADAPTER.encodedSizeWithTag(2, value.text) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.cadence) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu redact(RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu value) {
                        value.getClass();
                        RecurringPaymentBlocker.Text text = value.text;
                        return RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu.copy$default(value, null, text != null ? (RecurringPaymentBlocker.Text) RecurringPaymentBlocker.Text.ADAPTER.redact(text) : null, TransactorKt.m1169redactElements(value.day_of_cadence_options, RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.ADAPTER), ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.day_of_cadence_options);
                        RecurringPaymentBlocker.Text.ADAPTER.encodeWithTag(writer, 2, value.text);
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.cadence);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public DayOfCadenceMenu(String str, Text text, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : text, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DayOfCadenceMenu copy$default(DayOfCadenceMenu dayOfCadenceMenu, String str, Text text, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dayOfCadenceMenu.cadence;
                }
                if ((i & 2) != 0) {
                    text = dayOfCadenceMenu.text;
                }
                if ((i & 4) != 0) {
                    list = dayOfCadenceMenu.day_of_cadence_options;
                }
                if ((i & 8) != 0) {
                    byteString = dayOfCadenceMenu.unknownFields();
                }
                return dayOfCadenceMenu.copy(str, text, list, byteString);
            }

            public final DayOfCadenceMenu copy(String cadence, Text text, List<DayOfCadenceOption> day_of_cadence_options, ByteString unknownFields) {
                day_of_cadence_options.getClass();
                unknownFields.getClass();
                return new DayOfCadenceMenu(cadence, text, day_of_cadence_options, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DayOfCadenceMenu)) {
                    return false;
                }
                DayOfCadenceMenu dayOfCadenceMenu = (DayOfCadenceMenu) other;
                return Intrinsics.areEqual(unknownFields(), dayOfCadenceMenu.unknownFields()) && Intrinsics.areEqual(this.cadence, dayOfCadenceMenu.cadence) && Intrinsics.areEqual(this.text, dayOfCadenceMenu.text) && Intrinsics.areEqual(this.day_of_cadence_options, dayOfCadenceMenu.day_of_cadence_options);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.cadence;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Text text = this.text;
                int hashCode3 = this.day_of_cadence_options.hashCode() + ((hashCode2 + (text != null ? text.hashCode() : 0)) * 37);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.cadence = this.cadence;
                builder.text = this.text;
                builder.day_of_cadence_options = this.day_of_cadence_options;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.cadence;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cadence=", arrayList);
                }
                Text text = this.text;
                if (text != null) {
                    arrayList.add("text=" + text);
                }
                if (!this.day_of_cadence_options.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("day_of_cadence_options=", arrayList, this.day_of_cadence_options);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DayOfCadenceMenu{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$DayOfCadenceMenu;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ DayOfCadenceMenu build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public DayOfCadenceMenu() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DayOfCadenceMenu(String str, Text text, List<DayOfCadenceOption> list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.cadence = str;
                this.text = text;
                this.day_of_cadence_options = TransactorKt.immutableCopyOf("day_of_cadence_options", list);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$CadenceMenu;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CadenceMenu build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CadenceMenu() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CadenceMenu(FormBlocker.Element.LocalImageElement.Icon icon, Text text, List<CadenceOption> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.icon = icon;
            this.text = text;
            this.cadence_options = TransactorKt.immutableCopyOf("cadence_options", list);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RecurringPaymentBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RecurringPaymentBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RecurringPaymentBlocker((RecurringPaymentBlocker.Text) obj, (RecurringPaymentBlocker.Schedule) obj2, m, (RecurringPaymentBlocker.CadenceMenu) obj3, (RecurringPaymentBlocker.Button) obj4, (RecurringPaymentBlocker.Button) obj5, (Long) obj6, arrayList, (Long) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.Text.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.Schedule.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            m.add(RecurringPaymentBlocker.AmountOption.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj3 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.CadenceMenu.ADAPTER, reader, obj3);
                            break;
                        case 5:
                            obj4 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.Button.ADAPTER, reader, obj4);
                            break;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.Button.ADAPTER, reader, obj5);
                            break;
                        case 7:
                            obj6 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 8:
                            arrayList.add(RecurringPaymentBlocker.EnumeratedCadence.ADAPTER.decode(reader));
                            break;
                        case 9:
                            obj7 = ProtoAdapter.INT64.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RecurringPaymentBlocker value) {
                writer.getClass();
                value.getClass();
                RecurringPaymentBlocker.Text.ADAPTER.encodeWithTag(writer, 1, value.text);
                RecurringPaymentBlocker.Schedule.ADAPTER.encodeWithTag(writer, 2, value.selected_schedule);
                RecurringPaymentBlocker.AmountOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.amount_options);
                RecurringPaymentBlocker.CadenceMenu.ADAPTER.encodeWithTag(writer, 4, value.cadence_menu);
                ProtoAdapter protoAdapter2 = RecurringPaymentBlocker.Button.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, value.primary_button);
                protoAdapter2.encodeWithTag(writer, 6, value.secondary_button);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 7, value.receive_limit_per_payment);
                RecurringPaymentBlocker.EnumeratedCadence.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.enumerated_cadences);
                protoAdapter3.encodeWithTag(writer, 9, value.receive_minimum_per_payment);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RecurringPaymentBlocker value) {
                value.getClass();
                int encodedSizeWithTag = RecurringPaymentBlocker.CadenceMenu.ADAPTER.encodedSizeWithTag(4, value.cadence_menu) + RecurringPaymentBlocker.AmountOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.amount_options) + RecurringPaymentBlocker.Schedule.ADAPTER.encodedSizeWithTag(2, value.selected_schedule) + RecurringPaymentBlocker.Text.ADAPTER.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = RecurringPaymentBlocker.Button.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, value.secondary_button) + protoAdapter2.encodedSizeWithTag(5, value.primary_button) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                return protoAdapter3.encodedSizeWithTag(9, value.receive_minimum_per_payment) + RecurringPaymentBlocker.EnumeratedCadence.ADAPTER.asRepeated().encodedSizeWithTag(8, value.enumerated_cadences) + protoAdapter3.encodedSizeWithTag(7, value.receive_limit_per_payment) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RecurringPaymentBlocker redact(RecurringPaymentBlocker value) {
                value.getClass();
                RecurringPaymentBlocker.Text text = value.text;
                RecurringPaymentBlocker.Text text2 = text != null ? (RecurringPaymentBlocker.Text) RecurringPaymentBlocker.Text.ADAPTER.redact(text) : null;
                RecurringPaymentBlocker.Schedule schedule = value.selected_schedule;
                RecurringPaymentBlocker.Schedule schedule2 = schedule != null ? (RecurringPaymentBlocker.Schedule) RecurringPaymentBlocker.Schedule.ADAPTER.redact(schedule) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.amount_options, RecurringPaymentBlocker.AmountOption.ADAPTER);
                RecurringPaymentBlocker.CadenceMenu cadenceMenu = value.cadence_menu;
                RecurringPaymentBlocker.CadenceMenu cadenceMenu2 = cadenceMenu != null ? (RecurringPaymentBlocker.CadenceMenu) RecurringPaymentBlocker.CadenceMenu.ADAPTER.redact(cadenceMenu) : null;
                RecurringPaymentBlocker.Button button = value.primary_button;
                RecurringPaymentBlocker.Button button2 = button != null ? (RecurringPaymentBlocker.Button) RecurringPaymentBlocker.Button.ADAPTER.redact(button) : null;
                RecurringPaymentBlocker.Button button3 = value.secondary_button;
                RecurringPaymentBlocker.Button button4 = button3 != null ? (RecurringPaymentBlocker.Button) RecurringPaymentBlocker.Button.ADAPTER.redact(button3) : null;
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.enumerated_cadences, RecurringPaymentBlocker.EnumeratedCadence.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                Long l = value.receive_limit_per_payment;
                Long l2 = value.receive_minimum_per_payment;
                byteString.getClass();
                return new RecurringPaymentBlocker(text2, schedule2, m1169redactElements, cadenceMenu2, button2, button4, l, m1169redactElements2, l2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 9, value.receive_minimum_per_payment);
                RecurringPaymentBlocker.EnumeratedCadence.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.enumerated_cadences);
                protoAdapter2.encodeWithTag(writer, 7, value.receive_limit_per_payment);
                ProtoAdapter protoAdapter3 = RecurringPaymentBlocker.Button.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 6, value.secondary_button);
                protoAdapter3.encodeWithTag(writer, 5, value.primary_button);
                RecurringPaymentBlocker.CadenceMenu.ADAPTER.encodeWithTag(writer, 4, value.cadence_menu);
                RecurringPaymentBlocker.AmountOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.amount_options);
                RecurringPaymentBlocker.Schedule.ADAPTER.encodeWithTag(writer, 2, value.selected_schedule);
                RecurringPaymentBlocker.Text.ADAPTER.encodeWithTag(writer, 1, value.text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringPaymentBlocker(Text text, Schedule schedule, List list, CadenceMenu cadenceMenu, Button button, Button button2, Long l, List list2, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.text = text;
        this.selected_schedule = schedule;
        this.cadence_menu = cadenceMenu;
        this.primary_button = button;
        this.secondary_button = button2;
        this.receive_limit_per_payment = l;
        this.receive_minimum_per_payment = l2;
        this.amount_options = TransactorKt.immutableCopyOf("amount_options", list);
        this.enumerated_cadences = TransactorKt.immutableCopyOf("enumerated_cadences", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecurringPaymentBlocker)) {
            return false;
        }
        RecurringPaymentBlocker recurringPaymentBlocker = (RecurringPaymentBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), recurringPaymentBlocker.unknownFields()) && Intrinsics.areEqual(this.text, recurringPaymentBlocker.text) && Intrinsics.areEqual(this.selected_schedule, recurringPaymentBlocker.selected_schedule) && Intrinsics.areEqual(this.amount_options, recurringPaymentBlocker.amount_options) && Intrinsics.areEqual(this.cadence_menu, recurringPaymentBlocker.cadence_menu) && Intrinsics.areEqual(this.primary_button, recurringPaymentBlocker.primary_button) && Intrinsics.areEqual(this.secondary_button, recurringPaymentBlocker.secondary_button) && Intrinsics.areEqual(this.receive_limit_per_payment, recurringPaymentBlocker.receive_limit_per_payment) && Intrinsics.areEqual(this.enumerated_cadences, recurringPaymentBlocker.enumerated_cadences) && Intrinsics.areEqual(this.receive_minimum_per_payment, recurringPaymentBlocker.receive_minimum_per_payment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.text;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        Schedule schedule = this.selected_schedule;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (schedule != null ? schedule.hashCode() : 0)) * 37, 37, this.amount_options);
        CadenceMenu cadenceMenu = this.cadence_menu;
        int hashCode3 = (m + (cadenceMenu != null ? cadenceMenu.hashCode() : 0)) * 37;
        Button button = this.primary_button;
        int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.secondary_button;
        int hashCode5 = (hashCode4 + (button2 != null ? button2.hashCode() : 0)) * 37;
        Long l = this.receive_limit_per_payment;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.enumerated_cadences);
        Long l2 = this.receive_minimum_per_payment;
        int hashCode6 = m2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.selected_schedule = this.selected_schedule;
        builder.amount_options = this.amount_options;
        builder.cadence_menu = this.cadence_menu;
        builder.primary_button = this.primary_button;
        builder.secondary_button = this.secondary_button;
        builder.receive_limit_per_payment = this.receive_limit_per_payment;
        builder.enumerated_cadences = this.enumerated_cadences;
        builder.receive_minimum_per_payment = this.receive_minimum_per_payment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.text;
        if (text != null) {
            arrayList.add("text=" + text);
        }
        Schedule schedule = this.selected_schedule;
        if (schedule != null) {
            arrayList.add("selected_schedule=" + schedule);
        }
        if (!this.amount_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("amount_options=", arrayList, this.amount_options);
        }
        CadenceMenu cadenceMenu = this.cadence_menu;
        if (cadenceMenu != null) {
            arrayList.add("cadence_menu=" + cadenceMenu);
        }
        Button button = this.primary_button;
        if (button != null) {
            arrayList.add("primary_button=" + button);
        }
        Button button2 = this.secondary_button;
        if (button2 != null) {
            arrayList.add("secondary_button=" + button2);
        }
        Long l = this.receive_limit_per_payment;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("receive_limit_per_payment=", l, arrayList);
        }
        if (!this.enumerated_cadences.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("enumerated_cadences=", arrayList, this.enumerated_cadences);
        }
        Long l2 = this.receive_minimum_per_payment;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("receive_minimum_per_payment=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringPaymentBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0007H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence$Builder;", "cadence", "", "enumerated_descriptions", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class EnumeratedCadence extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EnumeratedCadence> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String cadence;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
        public final Map<Integer, String> enumerated_descriptions;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence;", "<init>", "()V", "cadence", "", "enumerated_descriptions", "", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String cadence;
            public Map<Integer, String> enumerated_descriptions;

            public Builder() {
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                this.enumerated_descriptions = emptyMap;
            }

            @Override // com.squareup.wire.Message.Builder
            public EnumeratedCadence build() {
                return new EnumeratedCadence(this.cadence, this.enumerated_descriptions, buildUnknownFields());
            }

            public final Builder cadence(String cadence) {
                this.cadence = cadence;
                return this;
            }

            public final Builder enumerated_descriptions(Map<Integer, String> enumerated_descriptions) {
                enumerated_descriptions.getClass();
                this.enumerated_descriptions = enumerated_descriptions;
                return this;
            }
        }

        static {
            RecurringPaymentBlocker$EnumeratedCadence$Companion$ADAPTER$1 recurringPaymentBlocker$EnumeratedCadence$Companion$ADAPTER$1 = new RecurringPaymentBlocker$EnumeratedCadence$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EnumeratedCadence.class), Syntax.PROTO_2);
            ADAPTER = recurringPaymentBlocker$EnumeratedCadence$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recurringPaymentBlocker$EnumeratedCadence$Companion$ADAPTER$1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public EnumeratedCadence(String str, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            str = (i & 1) != 0 ? null : str;
            if ((i & 2) != 0) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EnumeratedCadence copy$default(EnumeratedCadence enumeratedCadence, String str, Map map, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = enumeratedCadence.cadence;
            }
            if ((i & 2) != 0) {
                map = enumeratedCadence.enumerated_descriptions;
            }
            if ((i & 4) != 0) {
                byteString = enumeratedCadence.unknownFields();
            }
            return enumeratedCadence.copy(str, map, byteString);
        }

        public final EnumeratedCadence copy(String cadence, Map<Integer, String> enumerated_descriptions, ByteString unknownFields) {
            enumerated_descriptions.getClass();
            unknownFields.getClass();
            return new EnumeratedCadence(cadence, enumerated_descriptions, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EnumeratedCadence)) {
                return false;
            }
            EnumeratedCadence enumeratedCadence = (EnumeratedCadence) other;
            return Intrinsics.areEqual(unknownFields(), enumeratedCadence.unknownFields()) && Intrinsics.areEqual(this.cadence, enumeratedCadence.cadence) && Intrinsics.areEqual(this.enumerated_descriptions, enumeratedCadence.enumerated_descriptions);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.cadence;
            int hashCode2 = this.enumerated_descriptions.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.cadence = this.cadence;
            builder.enumerated_descriptions = this.enumerated_descriptions;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.cadence;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cadence=", arrayList);
            }
            if (!this.enumerated_descriptions.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("enumerated_descriptions=", this.enumerated_descriptions, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EnumeratedCadence{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ EnumeratedCadence build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public EnumeratedCadence() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumeratedCadence(String str, Map<Integer, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            map.getClass();
            byteString.getClass();
            this.cadence = str;
            this.enumerated_descriptions = TransactorKt.immutableCopyOf("enumerated_descriptions", map);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0006H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0015R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule$Builder;", "cadence", "", "day_of_cadence", "", "description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Schedule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Schedule> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String cadence;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
        public final Integer day_of_cadence;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String description;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule;", "<init>", "()V", "cadence", "", "day_of_cadence", "", "Ljava/lang/Integer;", "description", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String cadence;
            public Integer day_of_cadence;
            public String description;

            @Override // com.squareup.wire.Message.Builder
            public Schedule build() {
                return new Schedule(this.cadence, this.day_of_cadence, this.description, buildUnknownFields());
            }

            public final Builder cadence(String cadence) {
                this.cadence = cadence;
                return this;
            }

            public final Builder day_of_cadence(Integer day_of_cadence) {
                this.day_of_cadence = day_of_cadence;
                return this;
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Schedule.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$Schedule$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.Schedule decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RecurringPaymentBlocker.Schedule((String) obj, (Integer) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.INT32.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RecurringPaymentBlocker.Schedule value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.cadence);
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, value.day_of_cadence);
                    protoAdapter2.encodeWithTag(writer, 3, value.description);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RecurringPaymentBlocker.Schedule value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.description) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.day_of_cadence) + protoAdapter2.encodedSizeWithTag(1, value.cadence) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.Schedule redact(RecurringPaymentBlocker.Schedule value) {
                    value.getClass();
                    return RecurringPaymentBlocker.Schedule.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.Schedule value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.description);
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, value.day_of_cadence);
                    protoAdapter2.encodeWithTag(writer, 1, value.cadence);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Schedule(String str, Integer num, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Schedule copy$default(Schedule schedule, String str, Integer num, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = schedule.cadence;
            }
            if ((i & 2) != 0) {
                num = schedule.day_of_cadence;
            }
            if ((i & 4) != 0) {
                str2 = schedule.description;
            }
            if ((i & 8) != 0) {
                byteString = schedule.unknownFields();
            }
            return schedule.copy(str, num, str2, byteString);
        }

        public final Schedule copy(String cadence, Integer day_of_cadence, String description, ByteString unknownFields) {
            unknownFields.getClass();
            return new Schedule(cadence, day_of_cadence, description, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Schedule)) {
                return false;
            }
            Schedule schedule = (Schedule) other;
            return Intrinsics.areEqual(unknownFields(), schedule.unknownFields()) && Intrinsics.areEqual(this.cadence, schedule.cadence) && Intrinsics.areEqual(this.day_of_cadence, schedule.day_of_cadence) && Intrinsics.areEqual(this.description, schedule.description);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.cadence;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.day_of_cadence;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            String str2 = this.description;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.cadence = this.cadence;
            builder.day_of_cadence = this.day_of_cadence;
            builder.description = this.description;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.cadence;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cadence=", arrayList);
            }
            Integer num = this.day_of_cadence;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("day_of_cadence=", num, arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Schedule{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Schedule;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Schedule build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Schedule() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Schedule(String str, Integer num, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.cadence = str;
            this.day_of_cadence = num;
            this.description = str2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text$Builder;", "title", "", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Text extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Text> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "<init>", "()V", "title", "", "subtitle", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String subtitle;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public Text build() {
                return new Text(this.title, this.subtitle, buildUnknownFields());
            }

            public final Builder subtitle(String subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Text.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RecurringPaymentBlocker$Text$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.Text decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RecurringPaymentBlocker.Text((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RecurringPaymentBlocker.Text value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RecurringPaymentBlocker.Text value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RecurringPaymentBlocker.Text redact(RecurringPaymentBlocker.Text value) {
                    value.getClass();
                    return value.copy(null, null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.Text value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Text(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Text copy$default(Text text, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.title;
            }
            if ((i & 2) != 0) {
                str2 = text.subtitle;
            }
            if ((i & 4) != 0) {
                byteString = text.unknownFields();
            }
            return text.copy(str, str2, byteString);
        }

        public final Text copy(String title, String subtitle, ByteString unknownFields) {
            unknownFields.getClass();
            return new Text(title, subtitle, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.title, text.title) && Intrinsics.areEqual(this.subtitle, text.subtitle);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.subtitle != null) {
                arrayList.add("subtitle=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Text;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Text build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Text() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RecurringPaymentBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
