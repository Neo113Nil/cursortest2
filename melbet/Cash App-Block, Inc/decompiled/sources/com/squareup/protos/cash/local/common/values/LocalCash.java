package com.squareup.protos.cash.local.common.values;

import android.os.Parcelable;
import com.squareup.protos.cash.cats.Cats;
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
public final class LocalCash extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCash> CREATOR;
    public final long amount;

    static {
        LocalCash$Companion$ADAPTER$1 localCash$Companion$ADAPTER$1 = new LocalCash$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCash.class), "type.googleapis.com/squareup.cash.local.common.values.LocalCash", Syntax.PROTO_2, null, "squareup/cash/local/common/values/local_cash.proto");
        ADAPTER = localCash$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCash$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCash(long j, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCash)) {
            return false;
        }
        LocalCash localCash = (LocalCash) obj;
        return Intrinsics.areEqual(unknownFields(), localCash.unknownFields()) && this.amount == localCash.amount;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Long.hashCode(this.amount) + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(8);
        builder.cat_count = Long.valueOf(this.amount);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("amount=" + this.amount);
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCash{", "}", 0, null, null, 56);
    }
}
