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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Builder;", "", "sibling_placeholder_key", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target;", "target", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target;", "Companion", "Builder", "Target", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PickerOptionRule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PickerOptionRule> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String sibling_placeholder_key;

    @WireSealedOneof(schemaIndex = 1)
    public final Target target;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule;", "<init>", "()V", "sibling_placeholder_key", "", "target", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String sibling_placeholder_key;
        public Target target;

        @Override // com.squareup.wire.Message.Builder
        public PickerOptionRule build() {
            return new PickerOptionRule(this.sibling_placeholder_key, this.target, buildUnknownFields());
        }

        public final Builder sibling_placeholder_key(String sibling_placeholder_key) {
            this.sibling_placeholder_key = sibling_placeholder_key;
            return this;
        }

        public final Builder target(Target target) {
            this.target = target;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target;", "", "OptionValueEqualsSibling", "BalanceBelowSiblingAmount", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target$BalanceBelowSiblingAmount;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target$OptionValueEqualsSibling;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Target {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.BalanceBelowSiblingAmount#ADAPTER", declaredName = "balance_below_sibling_amount", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target$BalanceBelowSiblingAmount;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target;", "Lcom/squareup/protos/cash/kgoose/api/v3/BalanceBelowSiblingAmount;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/BalanceBelowSiblingAmount;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/BalanceBelowSiblingAmount;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BalanceBelowSiblingAmount extends Target {
            private final com.squareup.protos.cash.kgoose.api.v3.BalanceBelowSiblingAmount value;

            public BalanceBelowSiblingAmount(com.squareup.protos.cash.kgoose.api.v3.BalanceBelowSiblingAmount balanceBelowSiblingAmount) {
                balanceBelowSiblingAmount.getClass();
                this.value = balanceBelowSiblingAmount;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BalanceBelowSiblingAmount) && Intrinsics.areEqual(this.value, ((BalanceBelowSiblingAmount) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.BalanceBelowSiblingAmount getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BalanceBelowSiblingAmount(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OptionValueEqualsSibling#ADAPTER", declaredName = "option_value_equals_sibling", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target$OptionValueEqualsSibling;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOptionRule$Target;", "Lcom/squareup/protos/cash/kgoose/api/v3/OptionValueEqualsSibling;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/OptionValueEqualsSibling;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/OptionValueEqualsSibling;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OptionValueEqualsSibling extends Target {
            private final com.squareup.protos.cash.kgoose.api.v3.OptionValueEqualsSibling value;

            public OptionValueEqualsSibling(com.squareup.protos.cash.kgoose.api.v3.OptionValueEqualsSibling optionValueEqualsSibling) {
                optionValueEqualsSibling.getClass();
                this.value = optionValueEqualsSibling;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OptionValueEqualsSibling) && Intrinsics.areEqual(this.value, ((OptionValueEqualsSibling) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.OptionValueEqualsSibling getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "OptionValueEqualsSibling(value=" + this.value + ")";
            }
        }
    }

    static {
        PickerOptionRule$Companion$ADAPTER$1 pickerOptionRule$Companion$ADAPTER$1 = new PickerOptionRule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PickerOptionRule.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.PickerOptionRule", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = pickerOptionRule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pickerOptionRule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerOptionRule(String str, Target target, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sibling_placeholder_key = str;
        this.target = target;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PickerOptionRule)) {
            return false;
        }
        PickerOptionRule pickerOptionRule = (PickerOptionRule) obj;
        return Intrinsics.areEqual(unknownFields(), pickerOptionRule.unknownFields()) && Intrinsics.areEqual(this.sibling_placeholder_key, pickerOptionRule.sibling_placeholder_key) && Intrinsics.areEqual(this.target, pickerOptionRule.target);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.sibling_placeholder_key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Target target = this.target;
        int hashCode3 = hashCode2 + (target != null ? target.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.sibling_placeholder_key = this.sibling_placeholder_key;
        builder.target = this.target;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.sibling_placeholder_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sibling_placeholder_key=", arrayList);
        }
        Target target = this.target;
        if (target != null) {
            arrayList.add("target=" + target);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PickerOptionRule{", "}", 0, null, null, 56);
    }
}
