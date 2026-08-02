package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tigers.Tigers;
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

/* loaded from: classes8.dex */
public final class InstantRange extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstantRange> CREATOR;
    public final Long start_epoch_millisecond;
    public final Long stop_epoch_millisecond;

    static {
        InstantRange$Companion$ADAPTER$1 instantRange$Companion$ADAPTER$1 = new InstantRange$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstantRange.class), "type.googleapis.com/squareup.timecards.InstantRange", Syntax.PROTO_2, null, "squareup/timecards/time.proto");
        ADAPTER = instantRange$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instantRange$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantRange(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.start_epoch_millisecond = l;
        this.stop_epoch_millisecond = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstantRange)) {
            return false;
        }
        InstantRange instantRange = (InstantRange) obj;
        return Intrinsics.areEqual(unknownFields(), instantRange.unknownFields()) && Intrinsics.areEqual(this.start_epoch_millisecond, instantRange.start_epoch_millisecond) && Intrinsics.areEqual(this.stop_epoch_millisecond, instantRange.stop_epoch_millisecond);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.start_epoch_millisecond;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.stop_epoch_millisecond;
        int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Tigers.Builder builder = new Tigers.Builder(5);
        builder.tiger_count = this.start_epoch_millisecond;
        builder.fetch_version = this.stop_epoch_millisecond;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.start_epoch_millisecond;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_epoch_millisecond=", l, arrayList);
        }
        Long l2 = this.stop_epoch_millisecond;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("stop_epoch_millisecond=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstantRange{", "}", 0, null, null, 56);
    }
}
