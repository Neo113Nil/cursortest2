package com.squareup.protos.cash.cashapproxy.api;

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
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes7.dex */
public final class Spacer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Spacer> CREATOR;
    public final Integer size;

    static {
        Spacer$Companion$ADAPTER$1 spacer$Companion$ADAPTER$1 = new Spacer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Spacer.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.Spacer", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = spacer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(spacer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spacer(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.size = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Spacer)) {
            return false;
        }
        Spacer spacer = (Spacer) obj;
        return Intrinsics.areEqual(unknownFields(), spacer.unknownFields()) && Intrinsics.areEqual(this.size, spacer.size);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.size;
        int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(2);
        builder.year = this.size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.size;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("size=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Spacer{", "}", 0, null, null, 56);
    }
}
