package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.postcard.CopyCardNumber;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OptionPickerSpec extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OptionPickerSpec> CREATOR;

    static {
        OptionPickerSpec$Companion$ADAPTER$1 optionPickerSpec$Companion$ADAPTER$1 = new OptionPickerSpec$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OptionPickerSpec.class), "type.googleapis.com/squareup.cash.local.client.v1.OptionPickerSpec", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = optionPickerSpec$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(optionPickerSpec$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionPickerSpec(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof OptionPickerSpec) && Intrinsics.areEqual(unknownFields(), ((OptionPickerSpec) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CopyCardNumber.Builder builder = new CopyCardNumber.Builder(1);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "OptionPickerSpec{}";
    }
}
