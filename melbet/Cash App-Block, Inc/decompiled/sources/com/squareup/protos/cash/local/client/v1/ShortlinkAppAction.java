package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzje;
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
public final class ShortlinkAppAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShortlinkAppAction> CREATOR;
    public final zzje action;

    static {
        ShortlinkAppAction$Companion$ADAPTER$1 shortlinkAppAction$Companion$ADAPTER$1 = new ShortlinkAppAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShortlinkAppAction.class), "type.googleapis.com/squareup.cash.local.client.v1.ShortlinkAppAction", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = shortlinkAppAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shortlinkAppAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortlinkAppAction(zzje zzjeVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = zzjeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShortlinkAppAction)) {
            return false;
        }
        ShortlinkAppAction shortlinkAppAction = (ShortlinkAppAction) obj;
        return Intrinsics.areEqual(unknownFields(), shortlinkAppAction.unknownFields()) && Intrinsics.areEqual(this.action, shortlinkAppAction.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzje zzjeVar = this.action;
        int hashCode2 = hashCode + (zzjeVar != null ? zzjeVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(13);
        builder.local_buyer = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzje zzjeVar = this.action;
        if (zzjeVar != null) {
            arrayList.add("action=" + zzjeVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShortlinkAppAction{", "}", 0, null, null, 56);
    }
}
