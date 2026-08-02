package com.squareup.protos.cash.rabbits;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class Rabbits extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Rabbits> CREATOR;
    public final Long rabbit_count;

    static {
        Rabbits$Companion$ADAPTER$1 rabbits$Companion$ADAPTER$1 = new Rabbits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Rabbits.class), "type.googleapis.com/squareup.cash.rabbits.Rabbits", Syntax.PROTO_2, null, "squareup/cash/rabbits/rabbits.proto");
        ADAPTER = rabbits$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rabbits$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rabbits(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.rabbit_count = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rabbits)) {
            return false;
        }
        Rabbits rabbits = (Rabbits) obj;
        return Intrinsics.areEqual(unknownFields(), rabbits.unknownFields()) && Intrinsics.areEqual(this.rabbit_count, rabbits.rabbit_count);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.rabbit_count;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(11);
        builder.cat_count = this.rabbit_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.rabbit_count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("rabbit_count=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Rabbits{", "}", 0, null, null, 56);
    }
}
