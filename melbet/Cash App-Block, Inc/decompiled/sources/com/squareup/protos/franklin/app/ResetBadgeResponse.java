package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.AsyncTimeout;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/ResetBadgeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/ClaimData$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResetBadgeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResetBadgeResponse> CREATOR;
    public final Status status;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1);

        public static final ResetBadgeResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final AsyncTimeout.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new AsyncTimeout.Companion();
            ADAPTER = new ResetBadgeResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ResetBadgeResponse$Companion$ADAPTER$1 resetBadgeResponse$Companion$ADAPTER$1 = new ResetBadgeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResetBadgeResponse.class), "type.googleapis.com/squareup.franklin.app.ResetBadgeResponse", Syntax.PROTO_2, null, "squareup/franklin/app/badge.proto");
        ADAPTER = resetBadgeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(resetBadgeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetBadgeResponse(Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResetBadgeResponse)) {
            return false;
        }
        ResetBadgeResponse resetBadgeResponse = (ResetBadgeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), resetBadgeResponse.unknownFields()) && this.status == resetBadgeResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = hashCode + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(18);
        builder.claimable_payment = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResetBadgeResponse{", "}", 0, null, null, 56);
    }
}
