package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Builder;", "", "placeholder_key", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "accessibility_label", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source;", "source", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source;", "Companion", "Builder", "Source", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardBottomPicker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TemplateCardBottomPicker> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString accessibility_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String placeholder_key;

    @WireSealedOneof(schemaIndex = 2)
    public final Source source;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker;", "<init>", "()V", "placeholder_key", "", "accessibility_label", "Lcom/squareup/protos/cash/localization/LocalizedString;", "source", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString accessibility_label;
        public String placeholder_key;
        public Source source;

        public final Builder accessibility_label(LocalizedString accessibility_label) {
            this.accessibility_label = accessibility_label;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TemplateCardBottomPicker build() {
            return new TemplateCardBottomPicker(this.placeholder_key, this.accessibility_label, this.source, buildUnknownFields());
        }

        public final Builder placeholder_key(String placeholder_key) {
            this.placeholder_key = placeholder_key;
            return this;
        }

        public final Builder source(Source source) {
            this.source = source;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source;", "", "StaticSource", "P2pTransferOptionPicker", "SavingsTransferOptionPicker", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source$P2pTransferOptionPicker;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source$SavingsTransferOptionPicker;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source$StaticSource;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Source {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.P2PTransferOptionPicker#ADAPTER", declaredName = "p2p_transfer_option_picker", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source$P2pTransferOptionPicker;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source;", "Lcom/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class P2pTransferOptionPicker extends Source {
            private final P2PTransferOptionPicker value;

            public P2pTransferOptionPicker(P2PTransferOptionPicker p2PTransferOptionPicker) {
                p2PTransferOptionPicker.getClass();
                this.value = p2PTransferOptionPicker;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof P2pTransferOptionPicker) && Intrinsics.areEqual(this.value, ((P2pTransferOptionPicker) obj).value);
            }

            public final P2PTransferOptionPicker getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "P2pTransferOptionPicker(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SavingsTransferOptionPicker#ADAPTER", declaredName = "savings_transfer_option_picker", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source$SavingsTransferOptionPicker;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/SavingsTransferOptionPicker;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.StaticPickerSource#ADAPTER", declaredName = "static_source", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source$StaticSource;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardBottomPicker$Source;", "Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
        TemplateCardBottomPicker$Companion$ADAPTER$1 templateCardBottomPicker$Companion$ADAPTER$1 = new TemplateCardBottomPicker$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TemplateCardBottomPicker.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TemplateCardBottomPicker", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = templateCardBottomPicker$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(templateCardBottomPicker$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCardBottomPicker(String str, LocalizedString localizedString, Source source, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placeholder_key = str;
        this.accessibility_label = localizedString;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemplateCardBottomPicker)) {
            return false;
        }
        TemplateCardBottomPicker templateCardBottomPicker = (TemplateCardBottomPicker) obj;
        return Intrinsics.areEqual(unknownFields(), templateCardBottomPicker.unknownFields()) && Intrinsics.areEqual(this.placeholder_key, templateCardBottomPicker.placeholder_key) && Intrinsics.areEqual(this.accessibility_label, templateCardBottomPicker.accessibility_label) && Intrinsics.areEqual(this.source, templateCardBottomPicker.source);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.placeholder_key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.accessibility_label;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Source source = this.source;
        int hashCode4 = hashCode3 + (source != null ? source.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.placeholder_key = this.placeholder_key;
        builder.accessibility_label = this.accessibility_label;
        builder.source = this.source;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.placeholder_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "placeholder_key=", arrayList);
        }
        LocalizedString localizedString = this.accessibility_label;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("accessibility_label=", localizedString, arrayList);
        }
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TemplateCardBottomPicker{", "}", 0, null, null, 56);
    }
}
