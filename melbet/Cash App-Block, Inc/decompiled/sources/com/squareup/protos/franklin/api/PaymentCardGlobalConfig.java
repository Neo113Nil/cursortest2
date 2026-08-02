package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.protos.franklin.api.PaymentCardGlobalConfig;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0011\u0010\u0012\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$Builder;", "", "cashtag", "Ljava/lang/String;", "legal_name", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$CashtagDisplayOption;", "cashtag_display_option", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$CashtagDisplayOption;", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$PaymentMethod;", "payment_method", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$PaymentMethod;", "card_pan", "expiration", "cvv", "Companion", "Builder", "CashtagDisplayOption", "PaymentMethod", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentCardGlobalConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentCardGlobalConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
    public final String card_pan;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String cashtag;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentCardGlobalConfig$CashtagDisplayOption#ADAPTER", schemaIndex = 2, tag = 3)
    public final CashtagDisplayOption cashtag_display_option;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 7)
    public final String cvv;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 6)
    public final String expiration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String legal_name;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentCardGlobalConfig$PaymentMethod#ADAPTER", schemaIndex = 3, tag = 4)
    public final PaymentMethod payment_method;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig;", "<init>", "()V", "cashtag", "", "legal_name", "cashtag_display_option", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$CashtagDisplayOption;", "payment_method", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$PaymentMethod;", "card_pan", "expiration", "cvv", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String card_pan;
        public String cashtag;
        public CashtagDisplayOption cashtag_display_option;
        public String cvv;
        public String expiration;
        public String legal_name;
        public PaymentMethod payment_method;

        @Override // com.squareup.wire.Message.Builder
        public PaymentCardGlobalConfig build() {
            return new PaymentCardGlobalConfig(this.cashtag, this.legal_name, this.cashtag_display_option, this.payment_method, this.card_pan, this.expiration, this.cvv, buildUnknownFields());
        }

        public final Builder card_pan(String card_pan) {
            this.card_pan = card_pan;
            return this;
        }

        public final Builder cashtag(String cashtag) {
            this.cashtag = cashtag;
            return this;
        }

        public final Builder cashtag_display_option(CashtagDisplayOption cashtag_display_option) {
            this.cashtag_display_option = cashtag_display_option;
            return this;
        }

        public final Builder cvv(String cvv) {
            this.cvv = cvv;
            return this;
        }

        public final Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        public final Builder legal_name(String legal_name) {
            this.legal_name = legal_name;
            return this;
        }

        public final Builder payment_method(PaymentMethod payment_method) {
            this.payment_method = payment_method;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentCardGlobalConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaymentCardGlobalConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentCardGlobalConfig decode(ProtoReader reader) {
                reader.getClass();
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
                        return new PaymentCardGlobalConfig((String) obj, (String) obj2, (PaymentCardGlobalConfig.CashtagDisplayOption) obj3, (PaymentCardGlobalConfig.PaymentMethod) obj4, (String) obj5, (String) obj6, (String) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            try {
                                obj3 = PaymentCardGlobalConfig.CashtagDisplayOption.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 4:
                            try {
                                obj4 = PaymentCardGlobalConfig.PaymentMethod.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentCardGlobalConfig value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.cashtag);
                protoAdapter2.encodeWithTag(writer, 2, value.legal_name);
                PaymentCardGlobalConfig.CashtagDisplayOption.ADAPTER.encodeWithTag(writer, 3, value.cashtag_display_option);
                PaymentCardGlobalConfig.PaymentMethod.ADAPTER.encodeWithTag(writer, 4, value.payment_method);
                protoAdapter2.encodeWithTag(writer, 5, value.card_pan);
                protoAdapter2.encodeWithTag(writer, 6, value.expiration);
                protoAdapter2.encodeWithTag(writer, 7, value.cvv);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentCardGlobalConfig value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(7, value.cvv) + protoAdapter2.encodedSizeWithTag(6, value.expiration) + protoAdapter2.encodedSizeWithTag(5, value.card_pan) + PaymentCardGlobalConfig.PaymentMethod.ADAPTER.encodedSizeWithTag(4, value.payment_method) + PaymentCardGlobalConfig.CashtagDisplayOption.ADAPTER.encodedSizeWithTag(3, value.cashtag_display_option) + protoAdapter2.encodedSizeWithTag(2, value.legal_name) + protoAdapter2.encodedSizeWithTag(1, value.cashtag) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentCardGlobalConfig redact(PaymentCardGlobalConfig value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                PaymentCardGlobalConfig.CashtagDisplayOption cashtagDisplayOption = value.cashtag_display_option;
                PaymentCardGlobalConfig.PaymentMethod paymentMethod = value.payment_method;
                value.getClass();
                byteString.getClass();
                return new PaymentCardGlobalConfig(null, null, cashtagDisplayOption, paymentMethod, null, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentCardGlobalConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 7, value.cvv);
                protoAdapter2.encodeWithTag(writer, 6, value.expiration);
                protoAdapter2.encodeWithTag(writer, 5, value.card_pan);
                PaymentCardGlobalConfig.PaymentMethod.ADAPTER.encodeWithTag(writer, 4, value.payment_method);
                PaymentCardGlobalConfig.CashtagDisplayOption.ADAPTER.encodeWithTag(writer, 3, value.cashtag_display_option);
                protoAdapter2.encodeWithTag(writer, 2, value.legal_name);
                protoAdapter2.encodeWithTag(writer, 1, value.cashtag);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentCardGlobalConfig(String str, String str2, CashtagDisplayOption cashtagDisplayOption, PaymentMethod paymentMethod, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cashtag = str;
        this.legal_name = str2;
        this.cashtag_display_option = cashtagDisplayOption;
        this.payment_method = paymentMethod;
        this.card_pan = str3;
        this.expiration = str4;
        this.cvv = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentCardGlobalConfig)) {
            return false;
        }
        PaymentCardGlobalConfig paymentCardGlobalConfig = (PaymentCardGlobalConfig) obj;
        return Intrinsics.areEqual(unknownFields(), paymentCardGlobalConfig.unknownFields()) && Intrinsics.areEqual(this.cashtag, paymentCardGlobalConfig.cashtag) && Intrinsics.areEqual(this.legal_name, paymentCardGlobalConfig.legal_name) && this.cashtag_display_option == paymentCardGlobalConfig.cashtag_display_option && this.payment_method == paymentCardGlobalConfig.payment_method && Intrinsics.areEqual(this.card_pan, paymentCardGlobalConfig.card_pan) && Intrinsics.areEqual(this.expiration, paymentCardGlobalConfig.expiration) && Intrinsics.areEqual(this.cvv, paymentCardGlobalConfig.cvv);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cashtag;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.legal_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CashtagDisplayOption cashtagDisplayOption = this.cashtag_display_option;
        int hashCode4 = (hashCode3 + (cashtagDisplayOption != null ? cashtagDisplayOption.hashCode() : 0)) * 37;
        PaymentMethod paymentMethod = this.payment_method;
        int hashCode5 = (hashCode4 + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 37;
        String str3 = this.card_pan;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.expiration;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.cvv;
        int hashCode8 = hashCode7 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cashtag = this.cashtag;
        builder.legal_name = this.legal_name;
        builder.cashtag_display_option = this.cashtag_display_option;
        builder.payment_method = this.payment_method;
        builder.card_pan = this.card_pan;
        builder.expiration = this.expiration;
        builder.cvv = this.cvv;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.legal_name != null) {
            arrayList.add("legal_name=██");
        }
        CashtagDisplayOption cashtagDisplayOption = this.cashtag_display_option;
        if (cashtagDisplayOption != null) {
            arrayList.add("cashtag_display_option=" + cashtagDisplayOption);
        }
        PaymentMethod paymentMethod = this.payment_method;
        if (paymentMethod != null) {
            arrayList.add("payment_method=" + paymentMethod);
        }
        if (this.card_pan != null) {
            arrayList.add("card_pan=██");
        }
        if (this.expiration != null) {
            arrayList.add("expiration=██");
        }
        if (this.cvv != null) {
            arrayList.add("cvv=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentCardGlobalConfig{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$CashtagDisplayOption;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CASHTAG_DISPLAY_OPTION_UNSPECIFIED", "ALWAYS_HIDDEN", "OPTIONAL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CashtagDisplayOption implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CashtagDisplayOption[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final CashtagDisplayOption ALWAYS_HIDDEN;
        public static final CashtagDisplayOption CASHTAG_DISPLAY_OPTION_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CashtagDisplayOption OPTIONAL;
        private final int value;

        private static final /* synthetic */ CashtagDisplayOption[] $values() {
            return new CashtagDisplayOption[]{CASHTAG_DISPLAY_OPTION_UNSPECIFIED, ALWAYS_HIDDEN, OPTIONAL};
        }

        static {
            final CashtagDisplayOption cashtagDisplayOption = new CashtagDisplayOption("CASHTAG_DISPLAY_OPTION_UNSPECIFIED", 0, 0);
            CASHTAG_DISPLAY_OPTION_UNSPECIFIED = cashtagDisplayOption;
            ALWAYS_HIDDEN = new CashtagDisplayOption("ALWAYS_HIDDEN", 1, 1);
            OPTIONAL = new CashtagDisplayOption("OPTIONAL", 2, 2);
            CashtagDisplayOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CashtagDisplayOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, cashtagDisplayOption) { // from class: com.squareup.protos.franklin.api.PaymentCardGlobalConfig$CashtagDisplayOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentCardGlobalConfig.CashtagDisplayOption fromValue(int value) {
                    return PaymentCardGlobalConfig.CashtagDisplayOption.INSTANCE.fromValue(value);
                }
            };
        }

        private CashtagDisplayOption(String str, int i, int i2) {
            this.value = i2;
        }

        public static final CashtagDisplayOption fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static CashtagDisplayOption valueOf(String str) {
            return (CashtagDisplayOption) Enum.valueOf(CashtagDisplayOption.class, str);
        }

        public static CashtagDisplayOption[] values() {
            return (CashtagDisplayOption[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$CashtagDisplayOption$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$CashtagDisplayOption;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CashtagDisplayOption fromValue(int value) {
                if (value == 0) {
                    return CashtagDisplayOption.CASHTAG_DISPLAY_OPTION_UNSPECIFIED;
                }
                if (value == 1) {
                    return CashtagDisplayOption.ALWAYS_HIDDEN;
                }
                if (value != 2) {
                    return null;
                }
                return CashtagDisplayOption.OPTIONAL;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$PaymentMethod;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PAYMENT_METHOD_UNSPECIFIED", "PREPAID", "DEBIT_FLEX", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentMethod implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentMethod[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PaymentMethod DEBIT_FLEX;
        public static final PaymentMethod PAYMENT_METHOD_UNSPECIFIED;
        public static final PaymentMethod PREPAID;
        private final int value;

        private static final /* synthetic */ PaymentMethod[] $values() {
            return new PaymentMethod[]{PAYMENT_METHOD_UNSPECIFIED, PREPAID, DEBIT_FLEX};
        }

        static {
            final PaymentMethod paymentMethod = new PaymentMethod("PAYMENT_METHOD_UNSPECIFIED", 0, 0);
            PAYMENT_METHOD_UNSPECIFIED = paymentMethod;
            PREPAID = new PaymentMethod("PREPAID", 1, 1);
            DEBIT_FLEX = new PaymentMethod("DEBIT_FLEX", 2, 2);
            PaymentMethod[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentMethod.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, paymentMethod) { // from class: com.squareup.protos.franklin.api.PaymentCardGlobalConfig$PaymentMethod$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentCardGlobalConfig.PaymentMethod fromValue(int value) {
                    return PaymentCardGlobalConfig.PaymentMethod.INSTANCE.fromValue(value);
                }
            };
        }

        private PaymentMethod(String str, int i, int i2) {
            this.value = i2;
        }

        public static final PaymentMethod fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PaymentMethod valueOf(String str) {
            return (PaymentMethod) Enum.valueOf(PaymentMethod.class, str);
        }

        public static PaymentMethod[] values() {
            return (PaymentMethod[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$PaymentMethod$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$PaymentMethod;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PaymentMethod fromValue(int value) {
                if (value == 0) {
                    return PaymentMethod.PAYMENT_METHOD_UNSPECIFIED;
                }
                if (value == 1) {
                    return PaymentMethod.PREPAID;
                }
                if (value != 2) {
                    return null;
                }
                return PaymentMethod.DEBIT_FLEX;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaymentCardGlobalConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentCardGlobalConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
