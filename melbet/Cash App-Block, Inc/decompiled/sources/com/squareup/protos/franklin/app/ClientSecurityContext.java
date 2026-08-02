package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.EmbeddedImage;
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

/* loaded from: classes.dex */
public final class ClientSecurityContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientSecurityContext> CREATOR;
    public final ByteString client_public_key;
    public final ByteString device_check_token;

    static {
        ClientSecurityContext$Companion$ADAPTER$1 clientSecurityContext$Companion$ADAPTER$1 = new ClientSecurityContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientSecurityContext.class), "type.googleapis.com/squareup.franklin.app.ClientSecurityContext", Syntax.PROTO_2, null, "squareup/franklin/app/initiateSession.proto");
        ADAPTER = clientSecurityContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientSecurityContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientSecurityContext(ByteString byteString, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        byteString3.getClass();
        this.client_public_key = byteString;
        this.device_check_token = byteString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientSecurityContext)) {
            return false;
        }
        ClientSecurityContext clientSecurityContext = (ClientSecurityContext) obj;
        return Intrinsics.areEqual(unknownFields(), clientSecurityContext.unknownFields()) && Intrinsics.areEqual(this.client_public_key, clientSecurityContext.client_public_key) && Intrinsics.areEqual(this.device_check_token, clientSecurityContext.device_check_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.client_public_key;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.device_check_token;
        int hashCode3 = hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EmbeddedImage.Builder builder = new EmbeddedImage.Builder(2);
        builder.light_mode = this.client_public_key;
        builder.dark_mode = this.device_check_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.client_public_key;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("client_public_key=", byteString, arrayList);
        }
        if (this.device_check_token != null) {
            arrayList.add("device_check_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientSecurityContext{", "}", 0, null, null, 56);
    }
}
