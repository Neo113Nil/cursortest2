package com.squareup.protos.cash.instantpay.api.serverpush;

import android.os.Parcelable;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.instantpay.api.InstantPayoutAttemptStatus;
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
public final class InstantPayoutAttempt extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstantPayoutAttempt> CREATOR;
    public final InstantPayoutAttemptStatus status;

    static {
        InstantPayoutAttempt$Companion$ADAPTER$1 instantPayoutAttempt$Companion$ADAPTER$1 = new InstantPayoutAttempt$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstantPayoutAttempt.class), "type.googleapis.com/squareup.cash.instantpay.api.serverpush.InstantPayoutAttempt", Syntax.PROTO_2, null, "squareup/cash/instantpay/api/serverpush/PayoutAttempt.proto");
        ADAPTER = instantPayoutAttempt$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instantPayoutAttempt$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantPayoutAttempt(InstantPayoutAttemptStatus instantPayoutAttemptStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = instantPayoutAttemptStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstantPayoutAttempt)) {
            return false;
        }
        InstantPayoutAttempt instantPayoutAttempt = (InstantPayoutAttempt) obj;
        return Intrinsics.areEqual(unknownFields(), instantPayoutAttempt.unknownFields()) && this.status == instantPayoutAttempt.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstantPayoutAttemptStatus instantPayoutAttemptStatus = this.status;
        int hashCode2 = hashCode + (instantPayoutAttemptStatus != null ? instantPayoutAttemptStatus.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(5);
        builder.f1276type = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InstantPayoutAttemptStatus instantPayoutAttemptStatus = this.status;
        if (instantPayoutAttemptStatus != null) {
            arrayList.add("status=" + instantPayoutAttemptStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstantPayoutAttempt{", "}", 0, null, null, 56);
    }
}
