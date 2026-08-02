package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.instrument.InstrumentType;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/ConfirmBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ConfirmBlocker$Builder;", "", "requires_passcode", "Ljava/lang/Boolean;", "Lcom/squareup/protos/common/instrument/InstrumentType;", "brand", "Lcom/squareup/protos/common/instrument/InstrumentType;", "", "pan_suffix", "Ljava/lang/String;", "instrument_token", "suspected_duplicate_payment_token", "explicit_confirmation", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfirmBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.instrument.InstrumentType#ADAPTER", schemaIndex = 1, tag = 7)
    public final InstrumentType brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 11)
    public final Boolean explicit_confirmation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 10)
    public final String instrument_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 8)
    public final String pan_suffix;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean requires_passcode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 9)
    public final String suspected_duplicate_payment_token;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/ConfirmBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ConfirmBlocker;", "<init>", "()V", "requires_passcode", "", "Ljava/lang/Boolean;", "brand", "Lcom/squareup/protos/common/instrument/InstrumentType;", "pan_suffix", "", "instrument_token", "suspected_duplicate_payment_token", "explicit_confirmation", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/ConfirmBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public InstrumentType brand;
        public Boolean explicit_confirmation;
        public String instrument_token;
        public String pan_suffix;
        public Boolean requires_passcode;
        public String suspected_duplicate_payment_token;

        public final Builder brand(InstrumentType brand) {
            this.brand = brand;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ConfirmBlocker build() {
            return new ConfirmBlocker(this.requires_passcode, this.brand, this.pan_suffix, this.instrument_token, this.suspected_duplicate_payment_token, this.explicit_confirmation, buildUnknownFields());
        }

        public final Builder explicit_confirmation(Boolean explicit_confirmation) {
            this.explicit_confirmation = explicit_confirmation;
            return this;
        }

        public final Builder instrument_token(String instrument_token) {
            this.instrument_token = instrument_token;
            return this;
        }

        public final Builder pan_suffix(String pan_suffix) {
            this.pan_suffix = pan_suffix;
            return this;
        }

        public final Builder requires_passcode(Boolean requires_passcode) {
            this.requires_passcode = requires_passcode;
            return this;
        }

        public final Builder suspected_duplicate_payment_token(String suspected_duplicate_payment_token) {
            this.suspected_duplicate_payment_token = suspected_duplicate_payment_token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ConfirmBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ConfirmBlocker decode(ProtoReader reader) {
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
                        return new ConfirmBlocker((Boolean) obj, (InstrumentType) obj2, (String) obj3, (String) obj4, (String) obj5, (Boolean) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag != 1) {
                        switch (nextTag) {
                            case 7:
                                try {
                                    obj2 = InstrumentType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 8:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                obj6 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    } else {
                        obj = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ConfirmBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 1, value.requires_passcode);
                InstrumentType.ADAPTER.encodeWithTag(writer, 7, value.brand);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 8, value.pan_suffix);
                protoAdapter3.encodeWithTag(writer, 10, value.instrument_token);
                protoAdapter3.encodeWithTag(writer, 9, value.suspected_duplicate_payment_token);
                protoAdapter2.encodeWithTag(writer, 11, value.explicit_confirmation);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ConfirmBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                int encodedSizeWithTag = InstrumentType.ADAPTER.encodedSizeWithTag(7, value.brand) + protoAdapter2.encodedSizeWithTag(1, value.requires_passcode) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(11, value.explicit_confirmation) + protoAdapter3.encodedSizeWithTag(9, value.suspected_duplicate_payment_token) + protoAdapter3.encodedSizeWithTag(10, value.instrument_token) + protoAdapter3.encodedSizeWithTag(8, value.pan_suffix) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConfirmBlocker redact(ConfirmBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.requires_passcode;
                InstrumentType instrumentType = value.brand;
                String str = value.pan_suffix;
                String str2 = value.instrument_token;
                Boolean bool2 = value.explicit_confirmation;
                value.getClass();
                byteString.getClass();
                return new ConfirmBlocker(bool, instrumentType, str, str2, null, bool2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ConfirmBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 11, value.explicit_confirmation);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 9, value.suspected_duplicate_payment_token);
                protoAdapter3.encodeWithTag(writer, 10, value.instrument_token);
                protoAdapter3.encodeWithTag(writer, 8, value.pan_suffix);
                InstrumentType.ADAPTER.encodeWithTag(writer, 7, value.brand);
                protoAdapter2.encodeWithTag(writer, 1, value.requires_passcode);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmBlocker(Boolean bool, InstrumentType instrumentType, String str, String str2, String str3, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.requires_passcode = bool;
        this.brand = instrumentType;
        this.pan_suffix = str;
        this.instrument_token = str2;
        this.suspected_duplicate_payment_token = str3;
        this.explicit_confirmation = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmBlocker)) {
            return false;
        }
        ConfirmBlocker confirmBlocker = (ConfirmBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), confirmBlocker.unknownFields()) && Intrinsics.areEqual(this.requires_passcode, confirmBlocker.requires_passcode) && this.brand == confirmBlocker.brand && Intrinsics.areEqual(this.pan_suffix, confirmBlocker.pan_suffix) && Intrinsics.areEqual(this.instrument_token, confirmBlocker.instrument_token) && Intrinsics.areEqual(this.suspected_duplicate_payment_token, confirmBlocker.suspected_duplicate_payment_token) && Intrinsics.areEqual(this.explicit_confirmation, confirmBlocker.explicit_confirmation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.requires_passcode;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        InstrumentType instrumentType = this.brand;
        int hashCode3 = (hashCode2 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str = this.pan_suffix;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instrument_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.suspected_duplicate_payment_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool2 = this.explicit_confirmation;
        int hashCode7 = hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.requires_passcode = this.requires_passcode;
        builder.brand = this.brand;
        builder.pan_suffix = this.pan_suffix;
        builder.instrument_token = this.instrument_token;
        builder.suspected_duplicate_payment_token = this.suspected_duplicate_payment_token;
        builder.explicit_confirmation = this.explicit_confirmation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.requires_passcode;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_passcode=", bool, arrayList);
        }
        InstrumentType instrumentType = this.brand;
        if (instrumentType != null) {
            arrayList.add("brand=" + instrumentType);
        }
        String str = this.pan_suffix;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pan_suffix=", arrayList);
        }
        String str2 = this.instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_token=", arrayList);
        }
        if (this.suspected_duplicate_payment_token != null) {
            arrayList.add("suspected_duplicate_payment_token=██");
        }
        Boolean bool2 = this.explicit_confirmation;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("explicit_confirmation=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ConfirmBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ConfirmBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ConfirmBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ConfirmBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ConfirmBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
