package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/common/ClientData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/ClientData$Builder;", "", "flat_activity", "Ljava/lang/Boolean;", "phrase_receipt_details", "details_sheet_receipts", "", "current_time_millis", "Ljava/lang/Long;", "current_timezone_offset_minutes", "Lsquareup/cash/cryptocurrency/BitcoinDisplayUnits;", "bitcoin_display_units", "Lsquareup/cash/cryptocurrency/BitcoinDisplayUnits;", "", "locale", "Ljava/lang/String;", "current_timezone", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference;", "bitcoin_auto_invest_preference", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference;", "", "Lcom/squareup/protos/franklin/common/FeatureFlag;", "feature_flags", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClientData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.repeatedly.common.ScheduledTransactionPreference#ADAPTER", schemaIndex = 9, tag = 10)
    public final ScheduledTransactionPreference bitcoin_auto_invest_preference;

    @WireField(adapter = "squareup.cash.cryptocurrency.BitcoinDisplayUnits#ADAPTER", schemaIndex = 6, tag = 7)
    public final BitcoinDisplayUnits bitcoin_display_units;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 5)
    public final Long current_time_millis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String current_timezone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 5, tag = 6)
    public final Long current_timezone_offset_minutes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean details_sheet_receipts;

    @WireField(adapter = "com.squareup.protos.franklin.common.FeatureFlag#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<FeatureFlag> feature_flags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean flat_activity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String locale;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean phrase_receipt_details;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0018J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0018J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0018J\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0019J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0019J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/common/ClientData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/ClientData;", "<init>", "()V", "flat_activity", "", "Ljava/lang/Boolean;", "phrase_receipt_details", "details_sheet_receipts", "feature_flags", "", "Lcom/squareup/protos/franklin/common/FeatureFlag;", "current_time_millis", "", "Ljava/lang/Long;", "current_timezone_offset_minutes", "bitcoin_display_units", "Lsquareup/cash/cryptocurrency/BitcoinDisplayUnits;", "locale", "", "current_timezone", "bitcoin_auto_invest_preference", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/ClientData$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/common/ClientData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ScheduledTransactionPreference bitcoin_auto_invest_preference;
        public BitcoinDisplayUnits bitcoin_display_units;
        public Long current_time_millis;
        public String current_timezone;
        public Long current_timezone_offset_minutes;
        public Boolean details_sheet_receipts;
        public List<FeatureFlag> feature_flags = EmptyList.INSTANCE;
        public Boolean flat_activity;
        public String locale;
        public Boolean phrase_receipt_details;

        public final Builder bitcoin_auto_invest_preference(ScheduledTransactionPreference bitcoin_auto_invest_preference) {
            this.bitcoin_auto_invest_preference = bitcoin_auto_invest_preference;
            return this;
        }

        public final Builder bitcoin_display_units(BitcoinDisplayUnits bitcoin_display_units) {
            this.bitcoin_display_units = bitcoin_display_units;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ClientData build() {
            return new ClientData(this.flat_activity, this.phrase_receipt_details, this.details_sheet_receipts, this.feature_flags, this.current_time_millis, this.current_timezone_offset_minutes, this.bitcoin_display_units, this.locale, this.current_timezone, this.bitcoin_auto_invest_preference, buildUnknownFields());
        }

        public final Builder current_time_millis(Long current_time_millis) {
            this.current_time_millis = current_time_millis;
            return this;
        }

        public final Builder current_timezone(String current_timezone) {
            this.current_timezone = current_timezone;
            return this;
        }

        public final Builder current_timezone_offset_minutes(Long current_timezone_offset_minutes) {
            this.current_timezone_offset_minutes = current_timezone_offset_minutes;
            return this;
        }

        public final Builder details_sheet_receipts(Boolean details_sheet_receipts) {
            this.details_sheet_receipts = details_sheet_receipts;
            return this;
        }

        public final Builder feature_flags(List<FeatureFlag> feature_flags) {
            feature_flags.getClass();
            TransactorKt.checkElementsNotNull(feature_flags);
            this.feature_flags = feature_flags;
            return this;
        }

        public final Builder flat_activity(Boolean flat_activity) {
            this.flat_activity = flat_activity;
            return this;
        }

        public final Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        public final Builder phrase_receipt_details(Boolean phrase_receipt_details) {
            this.phrase_receipt_details = phrase_receipt_details;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.ClientData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ClientData decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ClientData((Boolean) obj3, (Boolean) obj4, (Boolean) obj5, m, (Long) obj6, (Long) obj7, (BitcoinDisplayUnits) obj8, (String) obj9, (String) obj10, (ScheduledTransactionPreference) obj11, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj3 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 2:
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 3:
                            obj5 = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 4:
                            obj = obj3;
                            obj2 = obj4;
                            m.add(FeatureFlag.ADAPTER.decode(reader));
                            break;
                        case 5:
                            obj6 = ProtoAdapter.INT64.decode(reader);
                            continue;
                        case 6:
                            obj7 = ProtoAdapter.INT64.decode(reader);
                            continue;
                        case 7:
                            try {
                                obj8 = BitcoinDisplayUnits.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj3;
                                obj2 = obj4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 9:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 10:
                            obj11 = TransactorKt.decodeMessageOrMerge(ScheduledTransactionPreference.ADAPTER, reader, obj11);
                            continue;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            obj2 = obj4;
                            break;
                    }
                    obj3 = obj;
                    obj4 = obj2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientData value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 1, value.flat_activity);
                protoAdapter2.encodeWithTag(writer, 2, value.phrase_receipt_details);
                protoAdapter2.encodeWithTag(writer, 3, value.details_sheet_receipts);
                FeatureFlag.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.feature_flags);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 5, value.current_time_millis);
                protoAdapter3.encodeWithTag(writer, 6, value.current_timezone_offset_minutes);
                BitcoinDisplayUnits.ADAPTER.encodeWithTag(writer, 7, value.bitcoin_display_units);
                ProtoAdapter protoAdapter4 = ProtoAdapter.STRING;
                protoAdapter4.encodeWithTag(writer, 8, value.locale);
                protoAdapter4.encodeWithTag(writer, 9, value.current_timezone);
                ScheduledTransactionPreference.ADAPTER.encodeWithTag(writer, 10, value.bitcoin_auto_invest_preference);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientData value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                int encodedSizeWithTag = FeatureFlag.ADAPTER.asRepeated().encodedSizeWithTag(4, value.feature_flags) + protoAdapter2.encodedSizeWithTag(3, value.details_sheet_receipts) + protoAdapter2.encodedSizeWithTag(2, value.phrase_receipt_details) + protoAdapter2.encodedSizeWithTag(1, value.flat_activity) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                int encodedSizeWithTag2 = BitcoinDisplayUnits.ADAPTER.encodedSizeWithTag(7, value.bitcoin_display_units) + protoAdapter3.encodedSizeWithTag(6, value.current_timezone_offset_minutes) + protoAdapter3.encodedSizeWithTag(5, value.current_time_millis) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = ProtoAdapter.STRING;
                return ScheduledTransactionPreference.ADAPTER.encodedSizeWithTag(10, value.bitcoin_auto_invest_preference) + protoAdapter4.encodedSizeWithTag(9, value.current_timezone) + protoAdapter4.encodedSizeWithTag(8, value.locale) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientData redact(ClientData value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.feature_flags, FeatureFlag.ADAPTER);
                ScheduledTransactionPreference scheduledTransactionPreference = value.bitcoin_auto_invest_preference;
                ScheduledTransactionPreference scheduledTransactionPreference2 = scheduledTransactionPreference != null ? (ScheduledTransactionPreference) ScheduledTransactionPreference.ADAPTER.redact(scheduledTransactionPreference) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.flat_activity;
                Boolean bool2 = value.phrase_receipt_details;
                Boolean bool3 = value.details_sheet_receipts;
                Long l = value.current_time_millis;
                Long l2 = value.current_timezone_offset_minutes;
                BitcoinDisplayUnits bitcoinDisplayUnits = value.bitcoin_display_units;
                String str = value.locale;
                String str2 = value.current_timezone;
                byteString.getClass();
                return new ClientData(bool, bool2, bool3, m1169redactElements, l, l2, bitcoinDisplayUnits, str, str2, scheduledTransactionPreference2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ScheduledTransactionPreference.ADAPTER.encodeWithTag(writer, 10, value.bitcoin_auto_invest_preference);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 9, value.current_timezone);
                protoAdapter2.encodeWithTag(writer, 8, value.locale);
                BitcoinDisplayUnits.ADAPTER.encodeWithTag(writer, 7, value.bitcoin_display_units);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 6, value.current_timezone_offset_minutes);
                protoAdapter3.encodeWithTag(writer, 5, value.current_time_millis);
                FeatureFlag.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.feature_flags);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 3, value.details_sheet_receipts);
                protoAdapter4.encodeWithTag(writer, 2, value.phrase_receipt_details);
                protoAdapter4.encodeWithTag(writer, 1, value.flat_activity);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientData(Boolean bool, Boolean bool2, Boolean bool3, List list, Long l, Long l2, BitcoinDisplayUnits bitcoinDisplayUnits, String str, String str2, ScheduledTransactionPreference scheduledTransactionPreference, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.flat_activity = bool;
        this.phrase_receipt_details = bool2;
        this.details_sheet_receipts = bool3;
        this.current_time_millis = l;
        this.current_timezone_offset_minutes = l2;
        this.bitcoin_display_units = bitcoinDisplayUnits;
        this.locale = str;
        this.current_timezone = str2;
        this.bitcoin_auto_invest_preference = scheduledTransactionPreference;
        this.feature_flags = TransactorKt.immutableCopyOf("feature_flags", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientData)) {
            return false;
        }
        ClientData clientData = (ClientData) obj;
        return Intrinsics.areEqual(unknownFields(), clientData.unknownFields()) && Intrinsics.areEqual(this.flat_activity, clientData.flat_activity) && Intrinsics.areEqual(this.phrase_receipt_details, clientData.phrase_receipt_details) && Intrinsics.areEqual(this.details_sheet_receipts, clientData.details_sheet_receipts) && Intrinsics.areEqual(this.feature_flags, clientData.feature_flags) && Intrinsics.areEqual(this.current_time_millis, clientData.current_time_millis) && Intrinsics.areEqual(this.current_timezone_offset_minutes, clientData.current_timezone_offset_minutes) && this.bitcoin_display_units == clientData.bitcoin_display_units && Intrinsics.areEqual(this.locale, clientData.locale) && Intrinsics.areEqual(this.current_timezone, clientData.current_timezone) && Intrinsics.areEqual(this.bitcoin_auto_invest_preference, clientData.bitcoin_auto_invest_preference);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.flat_activity;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.phrase_receipt_details;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.details_sheet_receipts;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37, 37, this.feature_flags);
        Long l = this.current_time_millis;
        int hashCode4 = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.current_timezone_offset_minutes;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        int hashCode6 = (hashCode5 + (bitcoinDisplayUnits != null ? bitcoinDisplayUnits.hashCode() : 0)) * 37;
        String str = this.locale;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.current_timezone;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ScheduledTransactionPreference scheduledTransactionPreference = this.bitcoin_auto_invest_preference;
        int hashCode9 = hashCode8 + (scheduledTransactionPreference != null ? scheduledTransactionPreference.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.flat_activity = this.flat_activity;
        builder.phrase_receipt_details = this.phrase_receipt_details;
        builder.details_sheet_receipts = this.details_sheet_receipts;
        builder.feature_flags = this.feature_flags;
        builder.current_time_millis = this.current_time_millis;
        builder.current_timezone_offset_minutes = this.current_timezone_offset_minutes;
        builder.bitcoin_display_units = this.bitcoin_display_units;
        builder.locale = this.locale;
        builder.current_timezone = this.current_timezone;
        builder.bitcoin_auto_invest_preference = this.bitcoin_auto_invest_preference;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.flat_activity;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("flat_activity=", bool, arrayList);
        }
        Boolean bool2 = this.phrase_receipt_details;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("phrase_receipt_details=", bool2, arrayList);
        }
        Boolean bool3 = this.details_sheet_receipts;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("details_sheet_receipts=", bool3, arrayList);
        }
        if (!this.feature_flags.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("feature_flags=", arrayList, this.feature_flags);
        }
        Long l = this.current_time_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("current_time_millis=", l, arrayList);
        }
        Long l2 = this.current_timezone_offset_minutes;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("current_timezone_offset_minutes=", l2, arrayList);
        }
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        if (bitcoinDisplayUnits != null) {
            arrayList.add("bitcoin_display_units=" + bitcoinDisplayUnits);
        }
        String str = this.locale;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "locale=", arrayList);
        }
        String str2 = this.current_timezone;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "current_timezone=", arrayList);
        }
        ScheduledTransactionPreference scheduledTransactionPreference = this.bitcoin_auto_invest_preference;
        if (scheduledTransactionPreference != null) {
            arrayList.add("bitcoin_auto_invest_preference=" + scheduledTransactionPreference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/ClientData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/ClientData$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/ClientData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/ClientData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ClientData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
