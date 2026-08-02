package com.squareup.protos.multipass.service;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
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
public final class CreateOtkRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateOtkRequest> CREATOR;
    public final ClientCredentials client_credentials;

    static {
        CreateOtkRequest$Companion$ADAPTER$1 createOtkRequest$Companion$ADAPTER$1 = new CreateOtkRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateOtkRequest.class), "type.googleapis.com/squareup.multipass.service.CreateOtkRequest", Syntax.PROTO_2, null, "squareup/multipass/service/service.proto");
        ADAPTER = createOtkRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createOtkRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOtkRequest(ClientCredentials clientCredentials, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_credentials = clientCredentials;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateOtkRequest)) {
            return false;
        }
        CreateOtkRequest createOtkRequest = (CreateOtkRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createOtkRequest.unknownFields()) && Intrinsics.areEqual(this.client_credentials, createOtkRequest.client_credentials);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClientCredentials clientCredentials = this.client_credentials;
        int hashCode2 = hashCode + (clientCredentials != null ? clientCredentials.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(28);
        builder.cash_limit_group = this.client_credentials;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClientCredentials clientCredentials = this.client_credentials;
        if (clientCredentials != null) {
            arrayList.add("client_credentials=" + clientCredentials);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateOtkRequest{", "}", 0, null, null, 56);
    }
}
