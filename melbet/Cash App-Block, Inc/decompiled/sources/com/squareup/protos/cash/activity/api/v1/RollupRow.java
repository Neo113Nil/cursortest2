package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RollupRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/RollupRow$Builder;", "", "count", "Ljava/lang/Integer;", "", "badged", "Ljava/lang/Boolean;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow;", "first", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RollupRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RollupRow> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean badged;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
    public final Integer count;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.DisplayedRow#ADAPTER", schemaIndex = 2, tag = 3)
    public final DisplayedRow first;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RollupRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/RollupRow;", "<init>", "()V", "count", "", "Ljava/lang/Integer;", "badged", "", "Ljava/lang/Boolean;", "first", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/activity/api/v1/RollupRow$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/activity/api/v1/RollupRow$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean badged;
        public Integer count;
        public DisplayedRow first;

        public final Builder badged(Boolean badged) {
            this.badged = badged;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public RollupRow build() {
            return new RollupRow(this.count, this.badged, this.first, buildUnknownFields());
        }

        public final Builder count(Integer count) {
            this.count = count;
            return this;
        }

        public final Builder first(DisplayedRow first) {
            this.first = first;
            return this;
        }
    }

    static {
        RollupRow$Companion$ADAPTER$1 rollupRow$Companion$ADAPTER$1 = new RollupRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RollupRow.class), "type.googleapis.com/squareup.cash.activity.api.v1.RollupRow", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/verification.proto");
        ADAPTER = rollupRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rollupRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RollupRow(Integer num, Boolean bool, DisplayedRow displayedRow, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.count = num;
        this.badged = bool;
        this.first = displayedRow;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RollupRow)) {
            return false;
        }
        RollupRow rollupRow = (RollupRow) obj;
        return Intrinsics.areEqual(unknownFields(), rollupRow.unknownFields()) && Intrinsics.areEqual(this.count, rollupRow.count) && Intrinsics.areEqual(this.badged, rollupRow.badged) && Intrinsics.areEqual(this.first, rollupRow.first);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.badged;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        DisplayedRow displayedRow = this.first;
        int hashCode4 = hashCode3 + (displayedRow != null ? displayedRow.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.count = this.count;
        builder.badged = this.badged;
        builder.first = this.first;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("count=", num, arrayList);
        }
        Boolean bool = this.badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("badged=", bool, arrayList);
        }
        DisplayedRow displayedRow = this.first;
        if (displayedRow != null) {
            arrayList.add("first=" + displayedRow);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RollupRow{", "}", 0, null, null, 56);
    }
}
