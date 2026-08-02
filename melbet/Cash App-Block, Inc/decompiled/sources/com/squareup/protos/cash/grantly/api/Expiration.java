package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.earnings.EarningsYearMonth;

/* loaded from: classes7.dex */
public final class Expiration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Expiration> CREATOR;
    public final Integer month;
    public final Integer year;

    static {
        Expiration$Companion$ADAPTER$1 expiration$Companion$ADAPTER$1 = new Expiration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Expiration.class), "type.googleapis.com/squareup.cash.grantly.api.Expiration", Syntax.PROTO_2, null, "squareup/cash/grantly/api/in_transaction_top_up_flow_end_result.proto");
        ADAPTER = expiration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(expiration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Expiration(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.month = num;
        this.year = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Expiration)) {
            return false;
        }
        Expiration expiration = (Expiration) obj;
        return Intrinsics.areEqual(unknownFields(), expiration.unknownFields()) && Intrinsics.areEqual(this.month, expiration.month) && Intrinsics.areEqual(this.year, expiration.year);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.month;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.year;
        int hashCode3 = hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningsYearMonth.Builder builder = new EarningsYearMonth.Builder(3);
        builder.year = this.month;
        builder.month = this.year;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.month;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("month=", num, arrayList);
        }
        Integer num2 = this.year;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("year=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Expiration{", "}", 0, null, null, 56);
    }
}
