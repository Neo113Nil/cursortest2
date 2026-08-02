package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
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

/* loaded from: classes7.dex */
public final class PendingRequestsParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PendingRequestsParams> CREATOR;
    public final List pending_requests;

    static {
        PendingRequestsParams$Companion$ADAPTER$1 pendingRequestsParams$Companion$ADAPTER$1 = new PendingRequestsParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PendingRequestsParams.class), "type.googleapis.com/squareup.cash.aegis.core.PendingRequestsParams", Syntax.PROTO_2, null, "squareup/cash/aegis/core/PendingRequestsParams.proto");
        ADAPTER = pendingRequestsParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pendingRequestsParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingRequestsParams(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pending_requests = TransactorKt.immutableCopyOf("pending_requests", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PendingRequestsParams)) {
            return false;
        }
        PendingRequestsParams pendingRequestsParams = (PendingRequestsParams) obj;
        return Intrinsics.areEqual(unknownFields(), pendingRequestsParams.unknownFields()) && Intrinsics.areEqual(this.pending_requests, pendingRequestsParams.pending_requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.pending_requests.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(17, false);
        builder.colors = this.pending_requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.pending_requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pending_requests=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PendingRequestsParams{", "}", 0, null, null, 56);
    }
}
