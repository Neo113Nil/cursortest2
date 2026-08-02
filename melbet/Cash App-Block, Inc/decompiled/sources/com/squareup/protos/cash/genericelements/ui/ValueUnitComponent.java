package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ValueUnitComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ValueUnitComponent> CREATOR;
    public final TextElement numerical_value;
    public final TextElement unit_description;

    static {
        ValueUnitComponent$Companion$ADAPTER$1 valueUnitComponent$Companion$ADAPTER$1 = new ValueUnitComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ValueUnitComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.ValueUnitComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = valueUnitComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(valueUnitComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueUnitComponent(TextElement textElement, TextElement textElement2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.numerical_value = textElement;
        this.unit_description = textElement2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueUnitComponent)) {
            return false;
        }
        ValueUnitComponent valueUnitComponent = (ValueUnitComponent) obj;
        return Intrinsics.areEqual(unknownFields(), valueUnitComponent.unknownFields()) && Intrinsics.areEqual(this.numerical_value, valueUnitComponent.numerical_value) && Intrinsics.areEqual(this.unit_description, valueUnitComponent.unit_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TextElement textElement = this.numerical_value;
        int hashCode2 = (hashCode + (textElement != null ? textElement.hashCode() : 0)) * 37;
        TextElement textElement2 = this.unit_description;
        int hashCode3 = hashCode2 + (textElement2 != null ? textElement2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(26);
        builder.f1268type = this.numerical_value;
        builder.details = this.unit_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TextElement textElement = this.numerical_value;
        if (textElement != null) {
            arrayList.add("numerical_value=" + textElement);
        }
        TextElement textElement2 = this.unit_description;
        if (textElement2 != null) {
            arrayList.add("unit_description=" + textElement2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValueUnitComponent{", "}", 0, null, null, 56);
    }
}
