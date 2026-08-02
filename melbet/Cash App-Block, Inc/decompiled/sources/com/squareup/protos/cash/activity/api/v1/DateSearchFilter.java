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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DateSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/DateSearchFilter$Builder;", "", "date_in_epoch_millis", "Ljava/lang/Long;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison;", "comparison", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DateSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DateSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterComparison#ADAPTER", schemaIndex = 1, tag = 2)
    public final SearchFilterComparison comparison;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long date_in_epoch_millis;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/DateSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/DateSearchFilter;", "<init>", "()V", "date_in_epoch_millis", "", "Ljava/lang/Long;", "comparison", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/DateSearchFilter$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public SearchFilterComparison comparison;
        public Long date_in_epoch_millis;

        @Override // com.squareup.wire.Message.Builder
        public DateSearchFilter build() {
            return new DateSearchFilter(this.date_in_epoch_millis, this.comparison, buildUnknownFields());
        }

        public final Builder comparison(SearchFilterComparison comparison) {
            this.comparison = comparison;
            return this;
        }

        public final Builder date_in_epoch_millis(Long date_in_epoch_millis) {
            this.date_in_epoch_millis = date_in_epoch_millis;
            return this;
        }
    }

    static {
        DateSearchFilter$Companion$ADAPTER$1 dateSearchFilter$Companion$ADAPTER$1 = new DateSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DateSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.DateSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = dateSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dateSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateSearchFilter(Long l, SearchFilterComparison searchFilterComparison, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.date_in_epoch_millis = l;
        this.comparison = searchFilterComparison;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateSearchFilter)) {
            return false;
        }
        DateSearchFilter dateSearchFilter = (DateSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), dateSearchFilter.unknownFields()) && Intrinsics.areEqual(this.date_in_epoch_millis, dateSearchFilter.date_in_epoch_millis) && this.comparison == dateSearchFilter.comparison;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.date_in_epoch_millis;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        SearchFilterComparison searchFilterComparison = this.comparison;
        int hashCode3 = hashCode2 + (searchFilterComparison != null ? searchFilterComparison.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.date_in_epoch_millis = this.date_in_epoch_millis;
        builder.comparison = this.comparison;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.date_in_epoch_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("date_in_epoch_millis=", l, arrayList);
        }
        SearchFilterComparison searchFilterComparison = this.comparison;
        if (searchFilterComparison != null) {
            arrayList.add("comparison=" + searchFilterComparison);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DateSearchFilter{", "}", 0, null, null, 56);
    }

    public /* synthetic */ DateSearchFilter(Long l, SearchFilterComparison searchFilterComparison) {
        this(l, searchFilterComparison, ByteString.EMPTY);
    }
}
