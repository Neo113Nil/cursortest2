package com.squareup.protos.cash.lions;

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
public final class Lions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Lions> CREATOR;
    public final Long lion_count;

    static {
        Lions$Companion$ADAPTER$1 lions$Companion$ADAPTER$1 = new Lions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Lions.class), "type.googleapis.com/squareup.cash.lions.Lions", Syntax.PROTO_2, null, "squareup/cash/lions/lions.proto");
        ADAPTER = lions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lions(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.lion_count = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Lions)) {
            return false;
        }
        Lions lions = (Lions) obj;
        return Intrinsics.areEqual(unknownFields(), lions.unknownFields()) && Intrinsics.areEqual(this.lion_count, lions.lion_count);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.lion_count;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(5);
        builder.cat_count = this.lion_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.lion_count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("lion_count=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Lions{", "}", 0, null, null, 56);
    }
}
