package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\f\r\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Builder;", "", "prefilled_value", "Ljava/lang/String;", "getPrefilled_value$annotations", "()V", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source;", "source", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source;", "Companion", "Builder", "Source", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PickerFieldConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PickerFieldConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 2)
    public final String prefilled_value;

    @WireSealedOneof(schemaIndex = 1)
    public final Source source;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig;", "<init>", "()V", "prefilled_value", "", "source", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String prefilled_value;
        public Source source;

        @Override // com.squareup.wire.Message.Builder
        public PickerFieldConfig build() {
            return new PickerFieldConfig(this.prefilled_value, this.source, buildUnknownFields());
        }

        @Deprecated
        public final Builder prefilled_value(String prefilled_value) {
            this.prefilled_value = prefilled_value;
            return this;
        }

        public final Builder source(Source source) {
            this.source = source;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source;", "", "StaticSource", "SavingsTransferOptionPicker", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source$SavingsTransferOptionPicker;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source$StaticSource;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Source {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SavingsTransferOptionPicker#ADAPTER", declaredName = "savings_transfer_option_picker", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source$SavingsTransferOptionPicker;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SavingsTransferOptionPicker extends Source {
            private final com.squareup.protos.cash.kgoose.api.v3.SavingsTransferOptionPicker value;

            public SavingsTransferOptionPicker(com.squareup.protos.cash.kgoose.api.v3.SavingsTransferOptionPicker savingsTransferOptionPicker) {
                savingsTransferOptionPicker.getClass();
                this.value = savingsTransferOptionPicker;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsTransferOptionPicker) && Intrinsics.areEqual(this.value, ((SavingsTransferOptionPicker) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.SavingsTransferOptionPicker getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsTransferOptionPicker(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.StaticPickerSource#ADAPTER", declaredName = "static_source", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source$StaticSource;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig$Source;", "Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StaticSource extends Source {
            private final StaticPickerSource value;

            public StaticSource(StaticPickerSource staticPickerSource) {
                staticPickerSource.getClass();
                this.value = staticPickerSource;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StaticSource) && Intrinsics.areEqual(this.value, ((StaticSource) obj).value);
            }

            public final StaticPickerSource getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "StaticSource(value=" + this.value + ")";
            }
        }
    }

    static {
        PickerFieldConfig$Companion$ADAPTER$1 pickerFieldConfig$Companion$ADAPTER$1 = new PickerFieldConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PickerFieldConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.PickerFieldConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = pickerFieldConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pickerFieldConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerFieldConfig(String str, Source source, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prefilled_value = str;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PickerFieldConfig)) {
            return false;
        }
        PickerFieldConfig pickerFieldConfig = (PickerFieldConfig) obj;
        return Intrinsics.areEqual(unknownFields(), pickerFieldConfig.unknownFields()) && Intrinsics.areEqual(this.prefilled_value, pickerFieldConfig.prefilled_value) && Intrinsics.areEqual(this.source, pickerFieldConfig.source);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prefilled_value;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Source source = this.source;
        int hashCode3 = hashCode2 + (source != null ? source.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.prefilled_value = this.prefilled_value;
        builder.source = this.source;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prefilled_value;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prefilled_value=", arrayList);
        }
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PickerFieldConfig{", "}", 0, null, null, 56);
    }
}
