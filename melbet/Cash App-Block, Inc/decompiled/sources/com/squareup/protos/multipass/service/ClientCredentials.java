package com.squareup.protos.multipass.service;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzjo;
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
public final class ClientCredentials extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientCredentials> CREATOR;
    public final DeviceDetails device_details;
    public final zzjo session;

    static {
        ClientCredentials$Companion$ADAPTER$1 clientCredentials$Companion$ADAPTER$1 = new ClientCredentials$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientCredentials.class), "type.googleapis.com/squareup.multipass.service.ClientCredentials", Syntax.PROTO_2, null, "squareup/multipass/service/common.proto");
        ADAPTER = clientCredentials$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientCredentials$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCredentials(zzjo zzjoVar, DeviceDetails deviceDetails, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.session = zzjoVar;
        this.device_details = deviceDetails;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientCredentials)) {
            return false;
        }
        ClientCredentials clientCredentials = (ClientCredentials) obj;
        return Intrinsics.areEqual(unknownFields(), clientCredentials.unknownFields()) && Intrinsics.areEqual(this.session, clientCredentials.session) && Intrinsics.areEqual(this.device_details, clientCredentials.device_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzjo zzjoVar = this.session;
        int hashCode2 = (hashCode + (zzjoVar != null ? zzjoVar.hashCode() : 0)) * 37;
        DeviceDetails deviceDetails = this.device_details;
        int hashCode3 = hashCode2 + (deviceDetails != null ? deviceDetails.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(16);
        builder.f1411android = this.session;
        builder.ios = this.device_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.session != null) {
            arrayList.add("session=██");
        }
        DeviceDetails deviceDetails = this.device_details;
        if (deviceDetails != null) {
            arrayList.add("device_details=" + deviceDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientCredentials{", "}", 0, null, null, 56);
    }
}
