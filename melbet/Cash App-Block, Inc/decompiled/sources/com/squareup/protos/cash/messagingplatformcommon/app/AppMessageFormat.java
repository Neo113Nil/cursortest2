package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
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
public final class AppMessageFormat extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppMessageFormat> CREATOR;
    public final zzjo message;

    static {
        AppMessageFormat$Companion$ADAPTER$1 appMessageFormat$Companion$ADAPTER$1 = new AppMessageFormat$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppMessageFormat.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.AppMessageFormat", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = appMessageFormat$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appMessageFormat$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessageFormat(zzjo zzjoVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message = zzjoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppMessageFormat)) {
            return false;
        }
        AppMessageFormat appMessageFormat = (AppMessageFormat) obj;
        return Intrinsics.areEqual(unknownFields(), appMessageFormat.unknownFields()) && Intrinsics.areEqual(this.message, appMessageFormat.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzjo zzjoVar = this.message;
        int hashCode2 = hashCode + (zzjoVar != null ? zzjoVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(17);
        builder.local_buyer = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzjo zzjoVar = this.message;
        if (zzjoVar != null) {
            arrayList.add("message=" + zzjoVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppMessageFormat{", "}", 0, null, null, 56);
    }
}
