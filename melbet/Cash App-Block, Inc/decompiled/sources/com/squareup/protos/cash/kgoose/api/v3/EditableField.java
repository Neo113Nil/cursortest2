package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000b\f\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/EditableField;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "display_format", "Lcom/squareup/protos/cash/localization/LocalizedString;", "accessibility_label", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig;", "field_config", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig;", "Companion", "Builder", "FieldConfig", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EditableField extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EditableField> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString accessibility_label;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString display_format;

    @WireSealedOneof(schemaIndex = 2)
    public final FieldConfig field_config;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField;", "<init>", "()V", "display_format", "Lcom/squareup/protos/cash/localization/LocalizedString;", "accessibility_label", "field_config", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString accessibility_label;
        public LocalizedString display_format;
        public FieldConfig field_config;

        public final Builder accessibility_label(LocalizedString accessibility_label) {
            this.accessibility_label = accessibility_label;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public EditableField build() {
            return new EditableField(this.display_format, this.accessibility_label, this.field_config, buildUnknownFields());
        }

        public final Builder display_format(LocalizedString display_format) {
            this.display_format = display_format;
            return this;
        }

        public final Builder field_config(FieldConfig field_config) {
            this.field_config = field_config;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig;", "", "AmountConfig", "TextConfig", "PickerConfig", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig$AmountConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig$PickerConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig$TextConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class FieldConfig {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.AmountFieldConfig#ADAPTER", declaredName = "amount_config", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig$AmountConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AmountConfig extends FieldConfig {
            private final AmountFieldConfig value;

            public AmountConfig(AmountFieldConfig amountFieldConfig) {
                amountFieldConfig.getClass();
                this.value = amountFieldConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AmountConfig) && Intrinsics.areEqual(this.value, ((AmountConfig) obj).value);
            }

            public final AmountFieldConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AmountConfig(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.PickerFieldConfig#ADAPTER", declaredName = "picker_config", tag = 7)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig$PickerConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/PickerFieldConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PickerConfig extends FieldConfig {
            private final PickerFieldConfig value;

            public PickerConfig(PickerFieldConfig pickerFieldConfig) {
                pickerFieldConfig.getClass();
                this.value = pickerFieldConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PickerConfig) && Intrinsics.areEqual(this.value, ((PickerConfig) obj).value);
            }

            public final PickerFieldConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PickerConfig(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TextFieldConfig#ADAPTER", declaredName = "text_config", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig$TextConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/EditableField$FieldConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TextConfig extends FieldConfig {
            private final TextFieldConfig value;

            public TextConfig(TextFieldConfig textFieldConfig) {
                textFieldConfig.getClass();
                this.value = textFieldConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TextConfig) && Intrinsics.areEqual(this.value, ((TextConfig) obj).value);
            }

            public final TextFieldConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TextConfig(value=" + this.value + ")";
            }
        }
    }

    static {
        EditableField$Companion$ADAPTER$1 editableField$Companion$ADAPTER$1 = new EditableField$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EditableField.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.EditableField", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = editableField$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(editableField$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditableField(LocalizedString localizedString, LocalizedString localizedString2, FieldConfig fieldConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_format = localizedString;
        this.accessibility_label = localizedString2;
        this.field_config = fieldConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EditableField)) {
            return false;
        }
        EditableField editableField = (EditableField) obj;
        return Intrinsics.areEqual(unknownFields(), editableField.unknownFields()) && Intrinsics.areEqual(this.display_format, editableField.display_format) && Intrinsics.areEqual(this.accessibility_label, editableField.accessibility_label) && Intrinsics.areEqual(this.field_config, editableField.field_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.display_format;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.accessibility_label;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        FieldConfig fieldConfig = this.field_config;
        int hashCode4 = hashCode3 + (fieldConfig != null ? fieldConfig.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.display_format = this.display_format;
        builder.accessibility_label = this.accessibility_label;
        builder.field_config = this.field_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.display_format;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("display_format=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.accessibility_label;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("accessibility_label=", localizedString2, arrayList);
        }
        FieldConfig fieldConfig = this.field_config;
        if (fieldConfig != null) {
            arrayList.add("field_config=" + fieldConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EditableField{", "}", 0, null, null, 56);
    }
}
