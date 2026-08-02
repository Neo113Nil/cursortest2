package com.squareup.protos.multipass.service;

import android.os.Parcelable;
import com.squareup.protos.lending.Toggle;
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
public final class ClientSessionToken extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientSessionToken> CREATOR;
    public final ByteString value;

    static {
        ClientSessionToken$Companion$ADAPTER$1 clientSessionToken$Companion$ADAPTER$1 = new ClientSessionToken$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientSessionToken.class), "type.googleapis.com/squareup.multipass.service.ClientSessionToken", Syntax.PROTO_2, null, "squareup/multipass/service/common.proto");
        ADAPTER = clientSessionToken$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientSessionToken$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientSessionToken(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.value = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientSessionToken)) {
            return false;
        }
        ClientSessionToken clientSessionToken = (ClientSessionToken) obj;
        return Intrinsics.areEqual(unknownFields(), clientSessionToken.unknownFields()) && Intrinsics.areEqual(this.value, clientSessionToken.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.value;
        int hashCode2 = hashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Toggle.Builder builder = new Toggle.Builder(4);
        builder.opaque_request_data = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.value != null) {
            arrayList.add("value=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientSessionToken{", "}", 0, null, null, 56);
    }
}
