package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzik;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.InputValue;
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
public final class InputSpecification extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InputSpecification> CREATOR;
    public final Boolean optional;
    public final zzik specification;

    static {
        InputSpecification$Companion$ADAPTER$1 inputSpecification$Companion$ADAPTER$1 = new InputSpecification$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InputSpecification.class), "type.googleapis.com/squareup.cash.local.client.v1.InputSpecification", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = inputSpecification$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inputSpecification$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSpecification(Boolean bool, zzik zzikVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.optional = bool;
        this.specification = zzikVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputSpecification)) {
            return false;
        }
        InputSpecification inputSpecification = (InputSpecification) obj;
        return Intrinsics.areEqual(unknownFields(), inputSpecification.unknownFields()) && Intrinsics.areEqual(this.optional, inputSpecification.optional) && Intrinsics.areEqual(this.specification, inputSpecification.specification);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.optional;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        zzik zzikVar = this.specification;
        int hashCode3 = hashCode2 + (zzikVar != null ? zzikVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(13);
        builder.input_id = this.optional;
        builder.value = this.specification;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.optional;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("optional=", bool, arrayList);
        }
        zzik zzikVar = this.specification;
        if (zzikVar != null) {
            arrayList.add("specification=" + zzikVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InputSpecification{", "}", 0, null, null, 56);
    }
}
