package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy$Builder;", "", "max_rows", "Ljava/lang/Integer;", "max_columns", "max_metric_tiles", "max_nested_group_by", "max_raw_result_preview_chars", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScheduledReportEmailPolicy extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledReportEmailPolicy> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer max_columns;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    public final Integer max_metric_tiles;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer max_nested_group_by;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    public final Integer max_raw_result_preview_chars;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
    public final Integer max_rows;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy;", "<init>", "()V", "max_rows", "", "Ljava/lang/Integer;", "max_columns", "max_metric_tiles", "max_nested_group_by", "max_raw_result_preview_chars", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Integer max_columns;
        public Integer max_metric_tiles;
        public Integer max_nested_group_by;
        public Integer max_raw_result_preview_chars;
        public Integer max_rows;

        @Override // com.squareup.wire.Message.Builder
        public ScheduledReportEmailPolicy build() {
            return new ScheduledReportEmailPolicy(this.max_rows, this.max_columns, this.max_metric_tiles, this.max_nested_group_by, this.max_raw_result_preview_chars, buildUnknownFields());
        }

        public final Builder max_columns(Integer max_columns) {
            this.max_columns = max_columns;
            return this;
        }

        public final Builder max_metric_tiles(Integer max_metric_tiles) {
            this.max_metric_tiles = max_metric_tiles;
            return this;
        }

        public final Builder max_nested_group_by(Integer max_nested_group_by) {
            this.max_nested_group_by = max_nested_group_by;
            return this;
        }

        public final Builder max_raw_result_preview_chars(Integer max_raw_result_preview_chars) {
            this.max_raw_result_preview_chars = max_raw_result_preview_chars;
            return this;
        }

        public final Builder max_rows(Integer max_rows) {
            this.max_rows = max_rows;
            return this;
        }
    }

    static {
        ScheduledReportEmailPolicy$Companion$ADAPTER$1 scheduledReportEmailPolicy$Companion$ADAPTER$1 = new ScheduledReportEmailPolicy$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScheduledReportEmailPolicy.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ScheduledReportEmailPolicy", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = scheduledReportEmailPolicy$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduledReportEmailPolicy$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledReportEmailPolicy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.max_rows = num;
        this.max_columns = num2;
        this.max_metric_tiles = num3;
        this.max_nested_group_by = num4;
        this.max_raw_result_preview_chars = num5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledReportEmailPolicy)) {
            return false;
        }
        ScheduledReportEmailPolicy scheduledReportEmailPolicy = (ScheduledReportEmailPolicy) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledReportEmailPolicy.unknownFields()) && Intrinsics.areEqual(this.max_rows, scheduledReportEmailPolicy.max_rows) && Intrinsics.areEqual(this.max_columns, scheduledReportEmailPolicy.max_columns) && Intrinsics.areEqual(this.max_metric_tiles, scheduledReportEmailPolicy.max_metric_tiles) && Intrinsics.areEqual(this.max_nested_group_by, scheduledReportEmailPolicy.max_nested_group_by) && Intrinsics.areEqual(this.max_raw_result_preview_chars, scheduledReportEmailPolicy.max_raw_result_preview_chars);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.max_rows;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.max_columns;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.max_metric_tiles;
        int hashCode4 = (hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.max_nested_group_by;
        int hashCode5 = (hashCode4 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 37;
        Integer num5 = this.max_raw_result_preview_chars;
        int hashCode6 = hashCode5 + (num5 != null ? Integer.hashCode(num5.intValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.max_rows = this.max_rows;
        builder.max_columns = this.max_columns;
        builder.max_metric_tiles = this.max_metric_tiles;
        builder.max_nested_group_by = this.max_nested_group_by;
        builder.max_raw_result_preview_chars = this.max_raw_result_preview_chars;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.max_rows;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_rows=", num, arrayList);
        }
        Integer num2 = this.max_columns;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("max_columns=", num2, arrayList);
        }
        Integer num3 = this.max_metric_tiles;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("max_metric_tiles=", num3, arrayList);
        }
        Integer num4 = this.max_nested_group_by;
        if (num4 != null) {
            re$$ExternalSyntheticOutline0.m("max_nested_group_by=", num4, arrayList);
        }
        Integer num5 = this.max_raw_result_preview_chars;
        if (num5 != null) {
            re$$ExternalSyntheticOutline0.m("max_raw_result_preview_chars=", num5, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledReportEmailPolicy{", "}", 0, null, null, 56);
    }
}
