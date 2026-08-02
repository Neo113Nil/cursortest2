package com.squareup.protos.cash.localization;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.common.Money;
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
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0010\u000f\u0011\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/localization/LocalizableString$Builder;", "", "key", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizableString$MoneyFormatter;", "moneyFormatter", "Lcom/squareup/protos/cash/localization/LocalizableString$MoneyFormatter;", "timezone", "locale_override", "", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument;", "arguments", "Ljava/util/List;", "Companion", "Builder", "LocalizableStringArgument", "MoneyFormatter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalizableString extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalizableString> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final MoneyFormatter DEFAULT_MONEYFORMATTER = MoneyFormatter.STANDARD;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString$LocalizableStringArgument#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<LocalizableStringArgument> arguments;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 8)
    public final String locale_override;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString$MoneyFormatter#ADAPTER", schemaIndex = 2, tag = 3)
    public final MoneyFormatter moneyFormatter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String timezone;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/localization/LocalizableString;", "<init>", "()V", "key", "", "arguments", "", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument;", "moneyFormatter", "Lcom/squareup/protos/cash/localization/LocalizableString$MoneyFormatter;", "timezone", "locale_override", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public List<LocalizableStringArgument> arguments = EmptyList.INSTANCE;
        public String key;
        public String locale_override;
        public MoneyFormatter moneyFormatter;
        public String timezone;

        public final Builder arguments(List<LocalizableStringArgument> arguments) {
            arguments.getClass();
            TransactorKt.checkElementsNotNull(arguments);
            this.arguments = arguments;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LocalizableString build() {
            return new LocalizableString(this.key, this.arguments, this.moneyFormatter, this.timezone, this.locale_override, buildUnknownFields());
        }

        public final Builder key(String key) {
            this.key = key;
            return this;
        }

        public final Builder locale_override(String locale_override) {
            this.locale_override = locale_override;
            return this;
        }

        public final Builder moneyFormatter(MoneyFormatter moneyFormatter) {
            this.moneyFormatter = moneyFormatter;
            return this;
        }

        public final Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalizableString.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.localization.LocalizableString$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalizableString decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LocalizableString((String) obj, m, (LocalizableString.MoneyFormatter) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        m.add(LocalizableString.LocalizableStringArgument.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        try {
                            obj2 = LocalizableString.MoneyFormatter.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 8) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalizableString value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.key);
                LocalizableString.LocalizableStringArgument.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.arguments);
                LocalizableString.MoneyFormatter.ADAPTER.encodeWithTag(writer, 3, value.moneyFormatter);
                protoAdapter2.encodeWithTag(writer, 4, value.timezone);
                protoAdapter2.encodeWithTag(writer, 8, value.locale_override);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalizableString value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(8, value.locale_override) + protoAdapter2.encodedSizeWithTag(4, value.timezone) + LocalizableString.MoneyFormatter.ADAPTER.encodedSizeWithTag(3, value.moneyFormatter) + LocalizableString.LocalizableStringArgument.ADAPTER.asRepeated().encodedSizeWithTag(2, value.arguments) + protoAdapter2.encodedSizeWithTag(1, value.key) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalizableString redact(LocalizableString value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.arguments, LocalizableString.LocalizableStringArgument.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.key;
                LocalizableString.MoneyFormatter moneyFormatter = value.moneyFormatter;
                String str2 = value.timezone;
                String str3 = value.locale_override;
                byteString.getClass();
                return new LocalizableString(str, m1169redactElements, moneyFormatter, str2, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalizableString value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, value.locale_override);
                protoAdapter2.encodeWithTag(writer, 4, value.timezone);
                LocalizableString.MoneyFormatter.ADAPTER.encodeWithTag(writer, 3, value.moneyFormatter);
                LocalizableString.LocalizableStringArgument.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.arguments);
                protoAdapter2.encodeWithTag(writer, 1, value.key);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizableString(String str, List list, MoneyFormatter moneyFormatter, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.key = str;
        this.moneyFormatter = moneyFormatter;
        this.timezone = str2;
        this.locale_override = str3;
        this.arguments = TransactorKt.immutableCopyOf("arguments", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalizableString)) {
            return false;
        }
        LocalizableString localizableString = (LocalizableString) obj;
        return Intrinsics.areEqual(unknownFields(), localizableString.unknownFields()) && Intrinsics.areEqual(this.key, localizableString.key) && Intrinsics.areEqual(this.arguments, localizableString.arguments) && this.moneyFormatter == localizableString.moneyFormatter && Intrinsics.areEqual(this.timezone, localizableString.timezone) && Intrinsics.areEqual(this.locale_override, localizableString.locale_override);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.key;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.arguments);
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        int hashCode2 = (m + (moneyFormatter != null ? moneyFormatter.hashCode() : 0)) * 37;
        String str2 = this.timezone;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.locale_override;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.key = this.key;
        builder.arguments = this.arguments;
        builder.moneyFormatter = this.moneyFormatter;
        builder.timezone = this.timezone;
        builder.locale_override = this.locale_override;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key=", arrayList);
        }
        if (!this.arguments.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("arguments=", arrayList, this.arguments);
        }
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        if (moneyFormatter != null) {
            arrayList.add("moneyFormatter=" + moneyFormatter);
        }
        String str2 = this.timezone;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "timezone=", arrayList);
        }
        String str3 = this.locale_override;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "locale_override=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalizableString{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Builder;", "name", "", "values", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Values", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class LocalizableStringArgument extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalizableStringArgument> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String name;

        @WireSealedOneof(schemaIndex = 1)
        public final Values values;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument;", "<init>", "()V", "name", "", "values", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String name;
            public Values values;

            @Override // com.squareup.wire.Message.Builder
            public LocalizableStringArgument build() {
                return new LocalizableStringArgument(this.name, this.values, buildUnknownFields());
            }

            public final Builder name(String name) {
                this.name = name;
                return this;
            }

            public final Builder values(Values values) {
                this.values = values;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalizableStringArgument.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.localization.LocalizableString$LocalizableStringArgument$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalizableString.LocalizableStringArgument decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    LocalizableString.LocalizableStringArgument.Values values = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalizableString.LocalizableStringArgument((String) obj, values, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                values = new LocalizableString.LocalizableStringArgument.Values.StringValue((String) ProtoAdapter.STRING.decode(reader));
                                break;
                            case 3:
                                values = new LocalizableString.LocalizableStringArgument.Values.LongValue(((Number) ProtoAdapter.INT64.decode(reader)).longValue());
                                break;
                            case 4:
                                values = new LocalizableString.LocalizableStringArgument.Values.DoubleValue(((Number) ProtoAdapter.DOUBLE.decode(reader)).doubleValue());
                                break;
                            case 5:
                                values = new LocalizableString.LocalizableStringArgument.Values.MoneyValue((Money) Money.ADAPTER.decode(reader));
                                break;
                            case 6:
                                values = new LocalizableString.LocalizableStringArgument.Values.TimestampSecondsValue(((Number) ProtoAdapter.INT64.decode(reader)).longValue());
                                break;
                            case 7:
                                values = new LocalizableString.LocalizableStringArgument.Values.NestedLocalizableStringValue((LocalizableString) LocalizableString.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalizableString.LocalizableStringArgument value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalizableString.LocalizableStringArgument.Values values = value.values;
                    if (values instanceof LocalizableString.LocalizableStringArgument.Values.StringValue) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, ((LocalizableString.LocalizableStringArgument.Values.StringValue) values).getValue());
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.LongValue) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 3, Long.valueOf(((LocalizableString.LocalizableStringArgument.Values.LongValue) values).getValue()));
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.DoubleValue) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, Double.valueOf(((LocalizableString.LocalizableStringArgument.Values.DoubleValue) values).getValue()));
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.MoneyValue) {
                        Money.ADAPTER.encodeWithTag(writer, 5, ((LocalizableString.LocalizableStringArgument.Values.MoneyValue) values).getValue());
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.TimestampSecondsValue) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 6, Long.valueOf(((LocalizableString.LocalizableStringArgument.Values.TimestampSecondsValue) values).getValue()));
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.NestedLocalizableStringValue) {
                        LocalizableString.ADAPTER.encodeWithTag(writer, 7, ((LocalizableString.LocalizableStringArgument.Values.NestedLocalizableStringValue) values).getValue());
                    } else if (values != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalizableString.LocalizableStringArgument value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
                    LocalizableString.LocalizableStringArgument.Values values = value.values;
                    if (values instanceof LocalizableString.LocalizableStringArgument.Values.StringValue) {
                        return protoAdapter2.encodedSizeWithTag(2, ((LocalizableString.LocalizableStringArgument.Values.StringValue) values).getValue()) + encodedSizeWithTag;
                    }
                    if (values instanceof LocalizableString.LocalizableStringArgument.Values.LongValue) {
                        return ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(((LocalizableString.LocalizableStringArgument.Values.LongValue) values).getValue())) + encodedSizeWithTag;
                    }
                    if (values instanceof LocalizableString.LocalizableStringArgument.Values.DoubleValue) {
                        return ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(((LocalizableString.LocalizableStringArgument.Values.DoubleValue) values).getValue())) + encodedSizeWithTag;
                    }
                    if (values instanceof LocalizableString.LocalizableStringArgument.Values.MoneyValue) {
                        return Money.ADAPTER.encodedSizeWithTag(5, ((LocalizableString.LocalizableStringArgument.Values.MoneyValue) values).getValue()) + encodedSizeWithTag;
                    }
                    if (values instanceof LocalizableString.LocalizableStringArgument.Values.TimestampSecondsValue) {
                        return ProtoAdapter.INT64.encodedSizeWithTag(6, Long.valueOf(((LocalizableString.LocalizableStringArgument.Values.TimestampSecondsValue) values).getValue())) + encodedSizeWithTag;
                    }
                    if (values instanceof LocalizableString.LocalizableStringArgument.Values.NestedLocalizableStringValue) {
                        return LocalizableString.ADAPTER.encodedSizeWithTag(7, ((LocalizableString.LocalizableStringArgument.Values.NestedLocalizableStringValue) values).getValue()) + encodedSizeWithTag;
                    }
                    if (values == null) {
                        return encodedSizeWithTag;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalizableString.LocalizableStringArgument redact(LocalizableString.LocalizableStringArgument value) {
                    value.getClass();
                    return LocalizableString.LocalizableStringArgument.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalizableString.LocalizableStringArgument value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.name);
                    LocalizableString.LocalizableStringArgument.Values values = value.values;
                    if (values instanceof LocalizableString.LocalizableStringArgument.Values.StringValue) {
                        protoAdapter2.encodeWithTag(writer, 2, ((LocalizableString.LocalizableStringArgument.Values.StringValue) values).getValue());
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.LongValue) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 3, Long.valueOf(((LocalizableString.LocalizableStringArgument.Values.LongValue) values).getValue()));
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.DoubleValue) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, Double.valueOf(((LocalizableString.LocalizableStringArgument.Values.DoubleValue) values).getValue()));
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.MoneyValue) {
                        Money.ADAPTER.encodeWithTag(writer, 5, ((LocalizableString.LocalizableStringArgument.Values.MoneyValue) values).getValue());
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.TimestampSecondsValue) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 6, Long.valueOf(((LocalizableString.LocalizableStringArgument.Values.TimestampSecondsValue) values).getValue()));
                    } else if (values instanceof LocalizableString.LocalizableStringArgument.Values.NestedLocalizableStringValue) {
                        LocalizableString.ADAPTER.encodeWithTag(writer, 7, ((LocalizableString.LocalizableStringArgument.Values.NestedLocalizableStringValue) values).getValue());
                    } else if (values != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LocalizableStringArgument(String str, Values values, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : values, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LocalizableStringArgument copy$default(LocalizableStringArgument localizableStringArgument, String str, Values values, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = localizableStringArgument.name;
            }
            if ((i & 2) != 0) {
                values = localizableStringArgument.values;
            }
            if ((i & 4) != 0) {
                byteString = localizableStringArgument.unknownFields();
            }
            return localizableStringArgument.copy(str, values, byteString);
        }

        public final LocalizableStringArgument copy(String name, Values values, ByteString unknownFields) {
            unknownFields.getClass();
            return new LocalizableStringArgument(name, values, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LocalizableStringArgument)) {
                return false;
            }
            LocalizableStringArgument localizableStringArgument = (LocalizableStringArgument) other;
            return Intrinsics.areEqual(unknownFields(), localizableStringArgument.unknownFields()) && Intrinsics.areEqual(this.name, localizableStringArgument.name) && Intrinsics.areEqual(this.values, localizableStringArgument.values);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Values values = this.values;
            int hashCode3 = hashCode2 + (values != null ? values.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.name = this.name;
            builder.values = this.values;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            Values values = this.values;
            if (values != null) {
                arrayList.add("values=" + values);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalizableStringArgument{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Builder;", "", "body", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LocalizableStringArgument build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "", "<init>", "()V", "StringValue", "LongValue", "DoubleValue", "MoneyValue", "TimestampSecondsValue", "NestedLocalizableStringValue", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$DoubleValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$LongValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$MoneyValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$NestedLocalizableStringValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$StringValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$TimestampSecondsValue;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Values {

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", declaredName = "double_value", tag = 4)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$DoubleValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "value", "", "<init>", "(D)V", "getValue", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class DoubleValue extends Values {
                private final double value;

                public DoubleValue(double d) {
                    super(null);
                    this.value = d;
                }

                public static /* synthetic */ DoubleValue copy$default(DoubleValue doubleValue, double d, int i, Object obj) {
                    if ((i & 1) != 0) {
                        d = doubleValue.value;
                    }
                    return doubleValue.copy(d);
                }

                /* renamed from: component1, reason: from getter */
                public final double getValue() {
                    return this.value;
                }

                public final DoubleValue copy(double value) {
                    return new DoubleValue(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DoubleValue) && Double.compare(this.value, ((DoubleValue) other).value) == 0;
                }

                public final double getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Double.hashCode(this.value);
                }

                public String toString() {
                    return "DoubleValue(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#INT64", declaredName = "long_value", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$LongValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "value", "", "<init>", "(J)V", "getValue", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class LongValue extends Values {
                private final long value;

                public LongValue(long j) {
                    super(null);
                    this.value = j;
                }

                public static /* synthetic */ LongValue copy$default(LongValue longValue, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = longValue.value;
                    }
                    return longValue.copy(j);
                }

                /* renamed from: component1, reason: from getter */
                public final long getValue() {
                    return this.value;
                }

                public final LongValue copy(long value) {
                    return new LongValue(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof LongValue) && this.value == ((LongValue) other).value;
                }

                public final long getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Long.hashCode(this.value);
                }

                public String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m(this.value, "LongValue(value=", ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.common.Money#ADAPTER", declaredName = "money_value", tag = 5)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$MoneyValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "value", "Lcom/squareup/protos/common/Money;", "<init>", "(Lcom/squareup/protos/common/Money;)V", "getValue", "()Lcom/squareup/protos/common/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class MoneyValue extends Values {
                private final Money value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MoneyValue(Money money) {
                    super(null);
                    money.getClass();
                    this.value = money;
                }

                public static /* synthetic */ MoneyValue copy$default(MoneyValue moneyValue, Money money, int i, Object obj) {
                    if ((i & 1) != 0) {
                        money = moneyValue.value;
                    }
                    return moneyValue.copy(money);
                }

                /* renamed from: component1, reason: from getter */
                public final Money getValue() {
                    return this.value;
                }

                public final MoneyValue copy(Money value) {
                    value.getClass();
                    return new MoneyValue(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof MoneyValue) && Intrinsics.areEqual(this.value, ((MoneyValue) other).value);
                }

                public final Money getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "MoneyValue(value=", ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", declaredName = "nested_localizable_string_value", tag = 7)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$NestedLocalizableStringValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "value", "Lcom/squareup/protos/cash/localization/LocalizableString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizableString;)V", "getValue", "()Lcom/squareup/protos/cash/localization/LocalizableString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class NestedLocalizableStringValue extends Values {
                private final LocalizableString value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NestedLocalizableStringValue(LocalizableString localizableString) {
                    super(null);
                    localizableString.getClass();
                    this.value = localizableString;
                }

                public static /* synthetic */ NestedLocalizableStringValue copy$default(NestedLocalizableStringValue nestedLocalizableStringValue, LocalizableString localizableString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        localizableString = nestedLocalizableStringValue.value;
                    }
                    return nestedLocalizableStringValue.copy(localizableString);
                }

                /* renamed from: component1, reason: from getter */
                public final LocalizableString getValue() {
                    return this.value;
                }

                public final NestedLocalizableStringValue copy(LocalizableString value) {
                    value.getClass();
                    return new NestedLocalizableStringValue(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NestedLocalizableStringValue) && Intrinsics.areEqual(this.value, ((NestedLocalizableStringValue) other).value);
                }

                public final LocalizableString getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "NestedLocalizableStringValue(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "string_value", tag = 2)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$StringValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class StringValue extends Values {
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public StringValue(String str) {
                    super(null);
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ StringValue copy$default(StringValue stringValue, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = stringValue.value;
                    }
                    return stringValue.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final StringValue copy(String value) {
                    value.getClass();
                    return new StringValue(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StringValue) && Intrinsics.areEqual(this.value, ((StringValue) other).value);
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StringValue(value=", this.value, ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#INT64", declaredName = "timestamp_seconds_value", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values$TimestampSecondsValue;", "Lcom/squareup/protos/cash/localization/LocalizableString$LocalizableStringArgument$Values;", "value", "", "<init>", "(J)V", "getValue", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class TimestampSecondsValue extends Values {
                private final long value;

                public TimestampSecondsValue(long j) {
                    super(null);
                    this.value = j;
                }

                public static /* synthetic */ TimestampSecondsValue copy$default(TimestampSecondsValue timestampSecondsValue, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = timestampSecondsValue.value;
                    }
                    return timestampSecondsValue.copy(j);
                }

                /* renamed from: component1, reason: from getter */
                public final long getValue() {
                    return this.value;
                }

                public final TimestampSecondsValue copy(long value) {
                    return new TimestampSecondsValue(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TimestampSecondsValue) && this.value == ((TimestampSecondsValue) other).value;
                }

                public final long getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Long.hashCode(this.value);
                }

                public String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m(this.value, "TimestampSecondsValue(value=", ")");
                }
            }

            public /* synthetic */ Values(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Values() {
            }
        }

        public LocalizableStringArgument() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalizableStringArgument(String str, Values values, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.values = values;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$MoneyFormatter;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MONEY_FORMATTER_UNSPECIFIED", "STANDARD", "ACCOUNTING", "CODE", "COMPACT", "COMPACT_CODE", "COMPACT_POSITIVE_SIGN_ONLY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class MoneyFormatter implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MoneyFormatter[] $VALUES;
        public static final MoneyFormatter ACCOUNTING;
        public static final ProtoAdapter ADAPTER;
        public static final MoneyFormatter CODE;
        public static final MoneyFormatter COMPACT;
        public static final MoneyFormatter COMPACT_CODE;
        public static final MoneyFormatter COMPACT_POSITIVE_SIGN_ONLY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MoneyFormatter MONEY_FORMATTER_UNSPECIFIED;
        public static final MoneyFormatter STANDARD;
        private final int value;

        private static final /* synthetic */ MoneyFormatter[] $values() {
            return new MoneyFormatter[]{MONEY_FORMATTER_UNSPECIFIED, STANDARD, ACCOUNTING, CODE, COMPACT, COMPACT_CODE, COMPACT_POSITIVE_SIGN_ONLY};
        }

        static {
            final MoneyFormatter moneyFormatter = new MoneyFormatter("MONEY_FORMATTER_UNSPECIFIED", 0, 0);
            MONEY_FORMATTER_UNSPECIFIED = moneyFormatter;
            STANDARD = new MoneyFormatter("STANDARD", 1, 1);
            ACCOUNTING = new MoneyFormatter("ACCOUNTING", 2, 2);
            CODE = new MoneyFormatter("CODE", 3, 3);
            COMPACT = new MoneyFormatter("COMPACT", 4, 4);
            COMPACT_CODE = new MoneyFormatter("COMPACT_CODE", 5, 5);
            COMPACT_POSITIVE_SIGN_ONLY = new MoneyFormatter("COMPACT_POSITIVE_SIGN_ONLY", 6, 6);
            MoneyFormatter[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MoneyFormatter.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, moneyFormatter) { // from class: com.squareup.protos.cash.localization.LocalizableString$MoneyFormatter$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public LocalizableString.MoneyFormatter fromValue(int value) {
                    return LocalizableString.MoneyFormatter.INSTANCE.fromValue(value);
                }
            };
        }

        private MoneyFormatter(String str, int i, int i2) {
            this.value = i2;
        }

        public static final MoneyFormatter fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static MoneyFormatter valueOf(String str) {
            return (MoneyFormatter) Enum.valueOf(MoneyFormatter.class, str);
        }

        public static MoneyFormatter[] values() {
            return (MoneyFormatter[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$MoneyFormatter$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/localization/LocalizableString$MoneyFormatter;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final MoneyFormatter fromValue(int value) {
                switch (value) {
                    case 0:
                        return MoneyFormatter.MONEY_FORMATTER_UNSPECIFIED;
                    case 1:
                        return MoneyFormatter.STANDARD;
                    case 2:
                        return MoneyFormatter.ACCOUNTING;
                    case 3:
                        return MoneyFormatter.CODE;
                    case 4:
                        return MoneyFormatter.COMPACT;
                    case 5:
                        return MoneyFormatter.COMPACT_CODE;
                    case 6:
                        return MoneyFormatter.COMPACT_POSITIVE_SIGN_ONLY;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/localization/LocalizableString$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/localization/LocalizableString$Builder;", "", "body", "Lcom/squareup/protos/cash/localization/LocalizableString;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/localization/LocalizableString;", "Lcom/squareup/protos/cash/localization/LocalizableString$MoneyFormatter;", "DEFAULT_MONEYFORMATTER", "Lcom/squareup/protos/cash/localization/LocalizableString$MoneyFormatter;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalizableString build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
