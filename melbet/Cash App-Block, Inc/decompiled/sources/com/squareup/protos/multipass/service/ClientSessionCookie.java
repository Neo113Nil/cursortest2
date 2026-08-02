package com.squareup.protos.multipass.service;

import android.os.Parcelable;
import com.squareup.protos.multipass.common.ScopedSession;
import com.squareup.protos.rewardly.ui.AppLinks;
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
public final class ClientSessionCookie extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientSessionCookie> CREATOR;
    public final ScopedSession scope;
    public final String value;

    static {
        ClientSessionCookie$Companion$ADAPTER$1 clientSessionCookie$Companion$ADAPTER$1 = new ClientSessionCookie$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientSessionCookie.class), "type.googleapis.com/squareup.multipass.service.ClientSessionCookie", Syntax.PROTO_2, null, "squareup/multipass/service/common.proto");
        ADAPTER = clientSessionCookie$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientSessionCookie$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientSessionCookie(String str, ScopedSession scopedSession, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.value = str;
        this.scope = scopedSession;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientSessionCookie)) {
            return false;
        }
        ClientSessionCookie clientSessionCookie = (ClientSessionCookie) obj;
        return Intrinsics.areEqual(unknownFields(), clientSessionCookie.unknownFields()) && Intrinsics.areEqual(this.value, clientSessionCookie.value) && this.scope == clientSessionCookie.scope;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.value;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ScopedSession scopedSession = this.scope;
        int hashCode3 = hashCode2 + (scopedSession != null ? scopedSession.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(17);
        builder.f1411android = this.value;
        builder.ios = this.scope;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.value != null) {
            arrayList.add("value=██");
        }
        ScopedSession scopedSession = this.scope;
        if (scopedSession != null) {
            arrayList.add("scope=" + scopedSession);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientSessionCookie{", "}", 0, null, null, 56);
    }
}
