package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddressInputSpec extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddressInputSpec> CREATOR;

    static {
        AddressInputSpec$Companion$ADAPTER$1 addressInputSpec$Companion$ADAPTER$1 = new AddressInputSpec$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddressInputSpec.class), "type.googleapis.com/squareup.cash.local.client.v1.AddressInputSpec", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = addressInputSpec$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addressInputSpec$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressInputSpec(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AddressInputSpec) && Intrinsics.areEqual(unknownFields(), ((AddressInputSpec) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.OpenID.Builder builder = new Action.OpenID.Builder(16);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "AddressInputSpec{}";
    }
}
