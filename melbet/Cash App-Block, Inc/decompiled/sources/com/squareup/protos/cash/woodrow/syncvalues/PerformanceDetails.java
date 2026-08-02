package com.squareup.protos.cash.woodrow.syncvalues;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
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

/* loaded from: classes8.dex */
public final class PerformanceDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PerformanceDetails> CREATOR;
    public final List acquisition_summaries;
    public final List disposition_summaries;
    public final Instant version;

    static {
        PerformanceDetails$Companion$ADAPTER$1 performanceDetails$Companion$ADAPTER$1 = new PerformanceDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PerformanceDetails.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.PerformanceDetails", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
        ADAPTER = performanceDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(performanceDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceDetails(List list, List list2, Instant instant, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.version = instant;
        this.acquisition_summaries = TransactorKt.immutableCopyOf("acquisition_summaries", list);
        this.disposition_summaries = TransactorKt.immutableCopyOf("disposition_summaries", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerformanceDetails)) {
            return false;
        }
        PerformanceDetails performanceDetails = (PerformanceDetails) obj;
        return Intrinsics.areEqual(unknownFields(), performanceDetails.unknownFields()) && Intrinsics.areEqual(this.acquisition_summaries, performanceDetails.acquisition_summaries) && Intrinsics.areEqual(this.disposition_summaries, performanceDetails.disposition_summaries) && Intrinsics.areEqual(this.version, performanceDetails.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.acquisition_summaries), 37, this.disposition_summaries);
        Instant instant = this.version;
        int hashCode = m + (instant != null ? instant.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(7);
        builder.f1364type = this.acquisition_summaries;
        builder.canonical_text = this.disposition_summaries;
        builder.formatted = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.acquisition_summaries;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("acquisition_summaries=", arrayList, list);
        }
        List list2 = this.disposition_summaries;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("disposition_summaries=", arrayList, list2);
        }
        Instant instant = this.version;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("version=", instant, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceDetails{", "}", 0, null, null, 56);
    }
}
