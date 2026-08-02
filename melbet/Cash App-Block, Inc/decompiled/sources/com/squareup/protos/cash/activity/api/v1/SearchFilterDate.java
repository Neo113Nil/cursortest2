package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate$Builder;", "", "date_gte_in_epoch_millis", "Ljava/lang/Long;", "date_lte_in_epoch_millis", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterDate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchFilterDate> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long date_gte_in_epoch_millis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long date_lte_in_epoch_millis;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate;", "<init>", "()V", "date_gte_in_epoch_millis", "", "Ljava/lang/Long;", "date_lte_in_epoch_millis", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long date_gte_in_epoch_millis;
        public Long date_lte_in_epoch_millis;

        @Override // com.squareup.wire.Message.Builder
        public SearchFilterDate build() {
            return new SearchFilterDate(this.date_gte_in_epoch_millis, this.date_lte_in_epoch_millis, buildUnknownFields());
        }

        public final Builder date_gte_in_epoch_millis(Long date_gte_in_epoch_millis) {
            this.date_gte_in_epoch_millis = date_gte_in_epoch_millis;
            return this;
        }

        public final Builder date_lte_in_epoch_millis(Long date_lte_in_epoch_millis) {
            this.date_lte_in_epoch_millis = date_lte_in_epoch_millis;
            return this;
        }
    }

    static {
        SearchFilterDate$Companion$ADAPTER$1 searchFilterDate$Companion$ADAPTER$1 = new SearchFilterDate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchFilterDate.class), "type.googleapis.com/squareup.cash.activity.api.v1.SearchFilterDate", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = searchFilterDate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchFilterDate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFilterDate(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.date_gte_in_epoch_millis = l;
        this.date_lte_in_epoch_millis = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchFilterDate)) {
            return false;
        }
        SearchFilterDate searchFilterDate = (SearchFilterDate) obj;
        return Intrinsics.areEqual(unknownFields(), searchFilterDate.unknownFields()) && Intrinsics.areEqual(this.date_gte_in_epoch_millis, searchFilterDate.date_gte_in_epoch_millis) && Intrinsics.areEqual(this.date_lte_in_epoch_millis, searchFilterDate.date_lte_in_epoch_millis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.date_gte_in_epoch_millis;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.date_lte_in_epoch_millis;
        int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.date_gte_in_epoch_millis = this.date_gte_in_epoch_millis;
        builder.date_lte_in_epoch_millis = this.date_lte_in_epoch_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.date_gte_in_epoch_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("date_gte_in_epoch_millis=", l, arrayList);
        }
        Long l2 = this.date_lte_in_epoch_millis;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("date_lte_in_epoch_millis=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchFilterDate{", "}", 0, null, null, 56);
    }
}
