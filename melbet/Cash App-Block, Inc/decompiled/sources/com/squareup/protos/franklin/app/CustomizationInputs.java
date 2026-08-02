package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.ClaimData;
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

/* loaded from: classes8.dex */
public final class CustomizationInputs extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomizationInputs> CREATOR;
    public final CardCustomizationInputs card_customization_inputs;

    static {
        CustomizationInputs$Companion$ADAPTER$1 customizationInputs$Companion$ADAPTER$1 = new CustomizationInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomizationInputs.class), "type.googleapis.com/squareup.franklin.app.CustomizationInputs", Syntax.PROTO_2, null, "squareup/franklin/app/payment_device_customization.proto");
        ADAPTER = customizationInputs$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customizationInputs$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizationInputs(CardCustomizationInputs cardCustomizationInputs, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_customization_inputs = cardCustomizationInputs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomizationInputs)) {
            return false;
        }
        CustomizationInputs customizationInputs = (CustomizationInputs) obj;
        return Intrinsics.areEqual(unknownFields(), customizationInputs.unknownFields()) && Intrinsics.areEqual(this.card_customization_inputs, customizationInputs.card_customization_inputs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardCustomizationInputs cardCustomizationInputs = this.card_customization_inputs;
        int hashCode2 = hashCode + (cardCustomizationInputs != null ? cardCustomizationInputs.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(11);
        builder.claimable_payment = this.card_customization_inputs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardCustomizationInputs cardCustomizationInputs = this.card_customization_inputs;
        if (cardCustomizationInputs != null) {
            arrayList.add("card_customization_inputs=" + cardCustomizationInputs);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomizationInputs{", "}", 0, null, null, 56);
    }
}
