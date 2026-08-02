package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.protos.franklin.api.RatePlan;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RatePlanSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/RatePlanSearchFilter$Builder;", "Lcom/squareup/protos/franklin/api/RatePlan;", "rate_plan", "Lcom/squareup/protos/franklin/api/RatePlan;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatePlanSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RatePlanSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.RatePlan#ADAPTER", schemaIndex = 0, tag = 1)
    public final RatePlan rate_plan;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RatePlanSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/RatePlanSearchFilter;", "<init>", "()V", "rate_plan", "Lcom/squareup/protos/franklin/api/RatePlan;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public RatePlan rate_plan;

        @Override // com.squareup.wire.Message.Builder
        public RatePlanSearchFilter build() {
            return new RatePlanSearchFilter(this.rate_plan, buildUnknownFields());
        }

        public final Builder rate_plan(RatePlan rate_plan) {
            this.rate_plan = rate_plan;
            return this;
        }
    }

    static {
        RatePlanSearchFilter$Companion$ADAPTER$1 ratePlanSearchFilter$Companion$ADAPTER$1 = new RatePlanSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RatePlanSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.RatePlanSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = ratePlanSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(ratePlanSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatePlanSearchFilter(RatePlan ratePlan, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.rate_plan = ratePlan;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RatePlanSearchFilter)) {
            return false;
        }
        RatePlanSearchFilter ratePlanSearchFilter = (RatePlanSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), ratePlanSearchFilter.unknownFields()) && this.rate_plan == ratePlanSearchFilter.rate_plan;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RatePlan ratePlan = this.rate_plan;
        int hashCode2 = hashCode + (ratePlan != null ? ratePlan.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.rate_plan = this.rate_plan;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RatePlan ratePlan = this.rate_plan;
        if (ratePlan != null) {
            arrayList.add("rate_plan=" + ratePlan);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RatePlanSearchFilter{", "}", 0, null, null, 56);
    }
}
