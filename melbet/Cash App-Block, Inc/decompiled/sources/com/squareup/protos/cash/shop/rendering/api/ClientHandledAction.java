package com.squareup.protos.cash.shop.rendering.api;

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

/* loaded from: classes8.dex */
public final class ClientHandledAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientHandledAction> CREATOR;

    static {
        ClientHandledAction$Companion$ADAPTER$1 clientHandledAction$Companion$ADAPTER$1 = new ClientHandledAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientHandledAction.class), "type.googleapis.com/squareup.cash.shop.rendering.api.ClientHandledAction", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TapActions.proto");
        ADAPTER = clientHandledAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientHandledAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientHandledAction(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ClientHandledAction) && Intrinsics.areEqual(unknownFields(), ((ClientHandledAction) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CopyCardNumber.Builder builder = new CopyCardNumber.Builder(28);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "ClientHandledAction{}";
    }
}
