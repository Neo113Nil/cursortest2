package com.squareup.protos.hieroglyph;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.trifle.protos.api.alpha.SignedData;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClientPublicKey extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientPublicKey> CREATOR;
    public final List attestation_certs;
    public final ByteString key_attestation_cert;
    public final ByteString public_key;

    static {
        ClientPublicKey$Companion$ADAPTER$1 clientPublicKey$Companion$ADAPTER$1 = new ClientPublicKey$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientPublicKey.class), "type.googleapis.com/squareup.hieroglyph.ClientPublicKey", Syntax.PROTO_2, null, "squareup/hieroglyph/hieroglyph.proto");
        ADAPTER = clientPublicKey$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientPublicKey$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientPublicKey(List list, ByteString byteString, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        list.getClass();
        byteString3.getClass();
        this.public_key = byteString;
        this.key_attestation_cert = byteString2;
        this.attestation_certs = TransactorKt.immutableCopyOf("attestation_certs", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientPublicKey)) {
            return false;
        }
        ClientPublicKey clientPublicKey = (ClientPublicKey) obj;
        return Intrinsics.areEqual(unknownFields(), clientPublicKey.unknownFields()) && Intrinsics.areEqual(this.public_key, clientPublicKey.public_key) && Intrinsics.areEqual(this.key_attestation_cert, clientPublicKey.key_attestation_cert) && Intrinsics.areEqual(this.attestation_certs, clientPublicKey.attestation_certs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.public_key;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.key_attestation_cert;
        int hashCode3 = this.attestation_certs.hashCode() + ((hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SignedData.Builder builder = new SignedData.Builder();
        builder.enveloped_data = this.public_key;
        builder.signature = this.key_attestation_cert;
        builder.certificates = this.attestation_certs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.public_key;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("public_key=", byteString, arrayList);
        }
        ByteString byteString2 = this.key_attestation_cert;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("key_attestation_cert=", byteString2, arrayList);
        }
        List list = this.attestation_certs;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("attestation_certs=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientPublicKey{", "}", 0, null, null, 56);
    }
}
