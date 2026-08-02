package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.AliasBlocker;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\u000f\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/AliasBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AliasBlocker$Builder;", "", "main_text", "Ljava/lang/String;", "sms_hint_text", "email_hint_text", "legal_agreement_text", "Lcom/squareup/protos/franklin/api/AliasBlocker$Mode;", "mode", "Lcom/squareup/protos/franklin/api/AliasBlocker$Mode;", "Lcom/squareup/protos/common/countries/Country;", "selected_country_of_residence", "Lcom/squareup/protos/common/countries/Country;", "Companion", "Builder", "Mode", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AliasBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AliasBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String email_hint_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String legal_agreement_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String main_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.AliasBlocker$Mode#ADAPTER", schemaIndex = 4, tag = 5)
    public final Mode mode;

    @WireField(adapter = "com.squareup.protos.common.countries.Country#ADAPTER", schemaIndex = 5, tag = 6)
    public final Country selected_country_of_residence;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String sms_hint_text;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/AliasBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AliasBlocker;", "<init>", "()V", "main_text", "", "sms_hint_text", "email_hint_text", "legal_agreement_text", "mode", "Lcom/squareup/protos/franklin/api/AliasBlocker$Mode;", "selected_country_of_residence", "Lcom/squareup/protos/common/countries/Country;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String email_hint_text;
        public String legal_agreement_text;
        public String main_text;
        public Mode mode;
        public Country selected_country_of_residence;
        public String sms_hint_text;

        @Override // com.squareup.wire.Message.Builder
        public AliasBlocker build() {
            return new AliasBlocker(this.main_text, this.sms_hint_text, this.email_hint_text, this.legal_agreement_text, this.mode, this.selected_country_of_residence, buildUnknownFields());
        }

        public final Builder email_hint_text(String email_hint_text) {
            this.email_hint_text = email_hint_text;
            return this;
        }

        public final Builder legal_agreement_text(String legal_agreement_text) {
            this.legal_agreement_text = legal_agreement_text;
            return this;
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        public final Builder mode(Mode mode) {
            this.mode = mode;
            return this;
        }

        public final Builder selected_country_of_residence(Country selected_country_of_residence) {
            this.selected_country_of_residence = selected_country_of_residence;
            return this;
        }

        public final Builder sms_hint_text(String sms_hint_text) {
            this.sms_hint_text = sms_hint_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AliasBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AliasBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AliasBlocker decode(ProtoReader reader) {
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
                        return new AliasBlocker((String) obj, (String) obj2, (String) obj3, (String) obj4, (AliasBlocker.Mode) obj5, (Country) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            try {
                                obj5 = AliasBlocker.Mode.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 6:
                            try {
                                obj6 = Country.ADAPTER.decode(reader);
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
            public void encode(ProtoWriter writer, AliasBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.main_text);
                protoAdapter2.encodeWithTag(writer, 2, value.sms_hint_text);
                protoAdapter2.encodeWithTag(writer, 3, value.email_hint_text);
                protoAdapter2.encodeWithTag(writer, 4, value.legal_agreement_text);
                AliasBlocker.Mode.ADAPTER.encodeWithTag(writer, 5, value.mode);
                Country.ADAPTER.encodeWithTag(writer, 6, value.selected_country_of_residence);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AliasBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Country.ADAPTER.encodedSizeWithTag(6, value.selected_country_of_residence) + AliasBlocker.Mode.ADAPTER.encodedSizeWithTag(5, value.mode) + protoAdapter2.encodedSizeWithTag(4, value.legal_agreement_text) + protoAdapter2.encodedSizeWithTag(3, value.email_hint_text) + protoAdapter2.encodedSizeWithTag(2, value.sms_hint_text) + protoAdapter2.encodedSizeWithTag(1, value.main_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AliasBlocker redact(AliasBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.sms_hint_text;
                String str2 = value.legal_agreement_text;
                AliasBlocker.Mode mode = value.mode;
                Country country = value.selected_country_of_residence;
                value.getClass();
                byteString.getClass();
                return new AliasBlocker(null, str, null, str2, mode, country, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AliasBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Country.ADAPTER.encodeWithTag(writer, 6, value.selected_country_of_residence);
                AliasBlocker.Mode.ADAPTER.encodeWithTag(writer, 5, value.mode);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.legal_agreement_text);
                protoAdapter2.encodeWithTag(writer, 3, value.email_hint_text);
                protoAdapter2.encodeWithTag(writer, 2, value.sms_hint_text);
                protoAdapter2.encodeWithTag(writer, 1, value.main_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AliasBlocker(String str, String str2, String str3, String str4, Mode mode, Country country, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.main_text = str;
        this.sms_hint_text = str2;
        this.email_hint_text = str3;
        this.legal_agreement_text = str4;
        this.mode = mode;
        this.selected_country_of_residence = country;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AliasBlocker)) {
            return false;
        }
        AliasBlocker aliasBlocker = (AliasBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), aliasBlocker.unknownFields()) && Intrinsics.areEqual(this.main_text, aliasBlocker.main_text) && Intrinsics.areEqual(this.sms_hint_text, aliasBlocker.sms_hint_text) && Intrinsics.areEqual(this.email_hint_text, aliasBlocker.email_hint_text) && Intrinsics.areEqual(this.legal_agreement_text, aliasBlocker.legal_agreement_text) && this.mode == aliasBlocker.mode && this.selected_country_of_residence == aliasBlocker.selected_country_of_residence;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sms_hint_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.email_hint_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.legal_agreement_text;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Mode mode = this.mode;
        int hashCode6 = (hashCode5 + (mode != null ? mode.hashCode() : 0)) * 37;
        Country country = this.selected_country_of_residence;
        int hashCode7 = hashCode6 + (country != null ? country.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.main_text = this.main_text;
        builder.sms_hint_text = this.sms_hint_text;
        builder.email_hint_text = this.email_hint_text;
        builder.legal_agreement_text = this.legal_agreement_text;
        builder.mode = this.mode;
        builder.selected_country_of_residence = this.selected_country_of_residence;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.main_text != null) {
            arrayList.add("main_text=██");
        }
        String str = this.sms_hint_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sms_hint_text=", arrayList);
        }
        if (this.email_hint_text != null) {
            arrayList.add("email_hint_text=██");
        }
        String str2 = this.legal_agreement_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "legal_agreement_text=", arrayList);
        }
        Mode mode = this.mode;
        if (mode != null) {
            arrayList.add("mode=" + mode);
        }
        Country country = this.selected_country_of_residence;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_country_of_residence=", country, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AliasBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/AliasBlocker$Mode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SMS_DEFAULT", "EMAIL_ONLY", "SMS_ONLY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Mode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Mode EMAIL_ONLY;
        public static final Mode SMS_DEFAULT;
        public static final Mode SMS_ONLY;
        private final int value;

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{SMS_DEFAULT, EMAIL_ONLY, SMS_ONLY};
        }

        static {
            final Mode mode = new Mode("SMS_DEFAULT", 0, 0);
            SMS_DEFAULT = mode;
            EMAIL_ONLY = new Mode("EMAIL_ONLY", 1, 1);
            SMS_ONLY = new Mode("SMS_ONLY", 2, 2);
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Mode.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, mode) { // from class: com.squareup.protos.franklin.api.AliasBlocker$Mode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public AliasBlocker.Mode fromValue(int value) {
                    return AliasBlocker.Mode.INSTANCE.fromValue(value);
                }
            };
        }

        private Mode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Mode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/AliasBlocker$Mode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/AliasBlocker$Mode;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Mode fromValue(int value) {
                if (value == 0) {
                    return Mode.SMS_DEFAULT;
                }
                if (value == 1) {
                    return Mode.EMAIL_ONLY;
                }
                if (value != 2) {
                    return null;
                }
                return Mode.SMS_ONLY;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AliasBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AliasBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AliasBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AliasBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AliasBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
