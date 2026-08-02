package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ReportClientActivityPageDisplayedRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ReportClientActivityPageDisplayedRequest$Builder;", "", "offset", "Ljava/lang/Long;", "", "search_query", "Ljava/lang/String;", "", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow;", "rows", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReportClientActivityPageDisplayedRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReportClientActivityPageDisplayedRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long offset;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.DisplayedRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<DisplayedRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String search_query;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ReportClientActivityPageDisplayedRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ReportClientActivityPageDisplayedRequest;", "<init>", "()V", "offset", "", "Ljava/lang/Long;", "search_query", "", "rows", "", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/ReportClientActivityPageDisplayedRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public Long offset;
        public List<DisplayedRow> rows = EmptyList.INSTANCE;
        public String search_query;

        @Override // com.squareup.wire.Message.Builder
        public ReportClientActivityPageDisplayedRequest build() {
            return new ReportClientActivityPageDisplayedRequest(this.offset, this.search_query, this.rows, buildUnknownFields());
        }

        public final Builder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        public final Builder rows(List<DisplayedRow> rows) {
            rows.getClass();
            TransactorKt.checkElementsNotNull(rows);
            this.rows = rows;
            return this;
        }

        public final Builder search_query(String search_query) {
            this.search_query = search_query;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ReportClientActivityPageDisplayedRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.activity.api.v1.ReportClientActivityPageDisplayedRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ReportClientActivityPageDisplayedRequest((Long) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(DisplayedRow.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ReportClientActivityPageDisplayedRequest reportClientActivityPageDisplayedRequest = (ReportClientActivityPageDisplayedRequest) obj;
                reverseProtoWriter.getClass();
                reportClientActivityPageDisplayedRequest.getClass();
                reverseProtoWriter.writeBytes(reportClientActivityPageDisplayedRequest.unknownFields());
                DisplayedRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, reportClientActivityPageDisplayedRequest.rows);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, reportClientActivityPageDisplayedRequest.search_query);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, reportClientActivityPageDisplayedRequest.offset);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ReportClientActivityPageDisplayedRequest reportClientActivityPageDisplayedRequest = (ReportClientActivityPageDisplayedRequest) obj;
                reportClientActivityPageDisplayedRequest.getClass();
                return DisplayedRow.ADAPTER.asRepeated().encodedSizeWithTag(3, reportClientActivityPageDisplayedRequest.rows) + ProtoAdapter.STRING.encodedSizeWithTag(2, reportClientActivityPageDisplayedRequest.search_query) + ProtoAdapter.INT64.encodedSizeWithTag(1, reportClientActivityPageDisplayedRequest.offset) + reportClientActivityPageDisplayedRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ReportClientActivityPageDisplayedRequest reportClientActivityPageDisplayedRequest = (ReportClientActivityPageDisplayedRequest) obj;
                reportClientActivityPageDisplayedRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(reportClientActivityPageDisplayedRequest.rows, DisplayedRow.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                Long l = reportClientActivityPageDisplayedRequest.offset;
                byteString.getClass();
                return new ReportClientActivityPageDisplayedRequest(l, null, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ReportClientActivityPageDisplayedRequest reportClientActivityPageDisplayedRequest = (ReportClientActivityPageDisplayedRequest) obj;
                reportClientActivityPageDisplayedRequest.getClass();
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, reportClientActivityPageDisplayedRequest.offset);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, reportClientActivityPageDisplayedRequest.search_query);
                DisplayedRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, reportClientActivityPageDisplayedRequest.rows);
                protoWriter.writeBytes(reportClientActivityPageDisplayedRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportClientActivityPageDisplayedRequest(Long l, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.offset = l;
        this.search_query = str;
        this.rows = TransactorKt.immutableCopyOf("rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportClientActivityPageDisplayedRequest)) {
            return false;
        }
        ReportClientActivityPageDisplayedRequest reportClientActivityPageDisplayedRequest = (ReportClientActivityPageDisplayedRequest) obj;
        return Intrinsics.areEqual(unknownFields(), reportClientActivityPageDisplayedRequest.unknownFields()) && Intrinsics.areEqual(this.offset, reportClientActivityPageDisplayedRequest.offset) && Intrinsics.areEqual(this.search_query, reportClientActivityPageDisplayedRequest.search_query) && Intrinsics.areEqual(this.rows, reportClientActivityPageDisplayedRequest.rows);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.offset;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.search_query;
        int hashCode3 = this.rows.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.offset = this.offset;
        builder.search_query = this.search_query;
        builder.rows = this.rows;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.offset;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("offset=", l, arrayList);
        }
        if (this.search_query != null) {
            arrayList.add("search_query=██");
        }
        if (!this.rows.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rows=", arrayList, this.rows);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReportClientActivityPageDisplayedRequest{", "}", 0, null, null, 56);
    }
}
