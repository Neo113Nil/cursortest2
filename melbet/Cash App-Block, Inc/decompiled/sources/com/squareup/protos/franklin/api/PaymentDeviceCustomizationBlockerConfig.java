package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlockerConfig;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$Builder;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$PresentationMode;", "presentation_mode", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$PresentationMode;", "", "pre_selected_payment_device_id", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig;", "payment_device_global_config", "Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig;", "Companion", "Builder", "PresentationMode", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentDeviceCustomizationBlockerConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentDeviceCustomizationBlockerConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentDeviceGlobalConfig#ADAPTER", schemaIndex = 2, tag = 3)
    public final PaymentDeviceGlobalConfig payment_device_global_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String pre_selected_payment_device_id;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlockerConfig$PresentationMode#ADAPTER", schemaIndex = 0, tag = 1)
    public final PresentationMode presentation_mode;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig;", "<init>", "()V", "presentation_mode", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$PresentationMode;", "pre_selected_payment_device_id", "", "payment_device_global_config", "Lcom/squareup/protos/franklin/api/PaymentDeviceGlobalConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public PaymentDeviceGlobalConfig payment_device_global_config;
        public String pre_selected_payment_device_id;
        public PresentationMode presentation_mode;

        @Override // com.squareup.wire.Message.Builder
        public PaymentDeviceCustomizationBlockerConfig build() {
            return new PaymentDeviceCustomizationBlockerConfig(this.presentation_mode, this.pre_selected_payment_device_id, this.payment_device_global_config, buildUnknownFields());
        }

        public final Builder payment_device_global_config(PaymentDeviceGlobalConfig payment_device_global_config) {
            this.payment_device_global_config = payment_device_global_config;
            return this;
        }

        public final Builder pre_selected_payment_device_id(String pre_selected_payment_device_id) {
            this.pre_selected_payment_device_id = pre_selected_payment_device_id;
            return this;
        }

        public final Builder presentation_mode(PresentationMode presentation_mode) {
            this.presentation_mode = presentation_mode;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentDeviceCustomizationBlockerConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlockerConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentDeviceCustomizationBlockerConfig decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentDeviceCustomizationBlockerConfig((PaymentDeviceCustomizationBlockerConfig.PresentationMode) obj, (String) obj2, (PaymentDeviceGlobalConfig) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = PaymentDeviceCustomizationBlockerConfig.PresentationMode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(PaymentDeviceGlobalConfig.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentDeviceCustomizationBlockerConfig value) {
                writer.getClass();
                value.getClass();
                PaymentDeviceCustomizationBlockerConfig.PresentationMode.ADAPTER.encodeWithTag(writer, 1, value.presentation_mode);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.pre_selected_payment_device_id);
                PaymentDeviceGlobalConfig.ADAPTER.encodeWithTag(writer, 3, value.payment_device_global_config);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentDeviceCustomizationBlockerConfig value) {
                value.getClass();
                return PaymentDeviceGlobalConfig.ADAPTER.encodedSizeWithTag(3, value.payment_device_global_config) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.pre_selected_payment_device_id) + PaymentDeviceCustomizationBlockerConfig.PresentationMode.ADAPTER.encodedSizeWithTag(1, value.presentation_mode) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentDeviceCustomizationBlockerConfig redact(PaymentDeviceCustomizationBlockerConfig value) {
                value.getClass();
                PaymentDeviceGlobalConfig paymentDeviceGlobalConfig = value.payment_device_global_config;
                PaymentDeviceGlobalConfig paymentDeviceGlobalConfig2 = paymentDeviceGlobalConfig != null ? (PaymentDeviceGlobalConfig) PaymentDeviceGlobalConfig.ADAPTER.redact(paymentDeviceGlobalConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                PaymentDeviceCustomizationBlockerConfig.PresentationMode presentationMode = value.presentation_mode;
                String str = value.pre_selected_payment_device_id;
                byteString.getClass();
                return new PaymentDeviceCustomizationBlockerConfig(presentationMode, str, paymentDeviceGlobalConfig2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentDeviceCustomizationBlockerConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PaymentDeviceGlobalConfig.ADAPTER.encodeWithTag(writer, 3, value.payment_device_global_config);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.pre_selected_payment_device_id);
                PaymentDeviceCustomizationBlockerConfig.PresentationMode.ADAPTER.encodeWithTag(writer, 1, value.presentation_mode);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceCustomizationBlockerConfig(PresentationMode presentationMode, String str, PaymentDeviceGlobalConfig paymentDeviceGlobalConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.presentation_mode = presentationMode;
        this.pre_selected_payment_device_id = str;
        this.payment_device_global_config = paymentDeviceGlobalConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceCustomizationBlockerConfig)) {
            return false;
        }
        PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig = (PaymentDeviceCustomizationBlockerConfig) obj;
        return Intrinsics.areEqual(unknownFields(), paymentDeviceCustomizationBlockerConfig.unknownFields()) && this.presentation_mode == paymentDeviceCustomizationBlockerConfig.presentation_mode && Intrinsics.areEqual(this.pre_selected_payment_device_id, paymentDeviceCustomizationBlockerConfig.pre_selected_payment_device_id) && Intrinsics.areEqual(this.payment_device_global_config, paymentDeviceCustomizationBlockerConfig.payment_device_global_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PresentationMode presentationMode = this.presentation_mode;
        int hashCode2 = (hashCode + (presentationMode != null ? presentationMode.hashCode() : 0)) * 37;
        String str = this.pre_selected_payment_device_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        PaymentDeviceGlobalConfig paymentDeviceGlobalConfig = this.payment_device_global_config;
        int hashCode4 = hashCode3 + (paymentDeviceGlobalConfig != null ? paymentDeviceGlobalConfig.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.presentation_mode = this.presentation_mode;
        builder.pre_selected_payment_device_id = this.pre_selected_payment_device_id;
        builder.payment_device_global_config = this.payment_device_global_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PresentationMode presentationMode = this.presentation_mode;
        if (presentationMode != null) {
            arrayList.add("presentation_mode=" + presentationMode);
        }
        String str = this.pre_selected_payment_device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pre_selected_payment_device_id=", arrayList);
        }
        PaymentDeviceGlobalConfig paymentDeviceGlobalConfig = this.payment_device_global_config;
        if (paymentDeviceGlobalConfig != null) {
            arrayList.add("payment_device_global_config=" + paymentDeviceGlobalConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentDeviceCustomizationBlockerConfig{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$PresentationMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PRESENTATION_MODE_UNSPECIFIED", "GRID", "DEVICE_VIEW", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PresentationMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PresentationMode[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PresentationMode DEVICE_VIEW;
        public static final PresentationMode GRID;
        public static final PresentationMode PRESENTATION_MODE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ PresentationMode[] $values() {
            return new PresentationMode[]{PRESENTATION_MODE_UNSPECIFIED, GRID, DEVICE_VIEW};
        }

        static {
            final PresentationMode presentationMode = new PresentationMode("PRESENTATION_MODE_UNSPECIFIED", 0, 0);
            PRESENTATION_MODE_UNSPECIFIED = presentationMode;
            GRID = new PresentationMode("GRID", 1, 1);
            DEVICE_VIEW = new PresentationMode("DEVICE_VIEW", 2, 2);
            PresentationMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PresentationMode.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, presentationMode) { // from class: com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlockerConfig$PresentationMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentDeviceCustomizationBlockerConfig.PresentationMode fromValue(int value) {
                    return PaymentDeviceCustomizationBlockerConfig.PresentationMode.INSTANCE.fromValue(value);
                }
            };
        }

        private PresentationMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final PresentationMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PresentationMode valueOf(String str) {
            return (PresentationMode) Enum.valueOf(PresentationMode.class, str);
        }

        public static PresentationMode[] values() {
            return (PresentationMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$PresentationMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$PresentationMode;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PresentationMode fromValue(int value) {
                if (value == 0) {
                    return PresentationMode.PRESENTATION_MODE_UNSPECIFIED;
                }
                if (value == 1) {
                    return PresentationMode.GRID;
                }
                if (value != 2) {
                    return null;
                }
                return PresentationMode.DEVICE_VIEW;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentDeviceCustomizationBlockerConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
