package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupTransactionSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupTransactionSummary> CREATOR;
    public final Instant created_time;
    public final List details;

    static {
        SupTransactionSummary$Companion$ADAPTER$1 supTransactionSummary$Companion$ADAPTER$1 = new SupTransactionSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupTransactionSummary.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.SupTransactionSummary", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = supTransactionSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supTransactionSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupTransactionSummary(List list, Instant instant, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.created_time = instant;
        this.details = TransactorKt.immutableCopyOf("details", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupTransactionSummary)) {
            return false;
        }
        SupTransactionSummary supTransactionSummary = (SupTransactionSummary) obj;
        return Intrinsics.areEqual(unknownFields(), supTransactionSummary.unknownFields()) && Intrinsics.areEqual(this.details, supTransactionSummary.details) && Intrinsics.areEqual(this.created_time, supTransactionSummary.created_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.details);
        Instant instant = this.created_time;
        int hashCode = m + (instant != null ? instant.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(12);
        builder.errors = this.details;
        builder.result = this.created_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.details;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("details=", arrayList, list);
        }
        Instant instant = this.created_time;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("created_time=", instant, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupTransactionSummary{", "}", 0, null, null, 56);
    }
}
