package com.squareup.protos.cash.discover.api.app.v2.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v2.model.Text;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Summary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Summary> CREATOR;
    public final List activity_rows;
    public final Text brief;
    public final String cursor;
    public final Text header;
    public final Text leadingFooter;
    public final List line_items;
    public final Text trailingFooter;

    public final class LineItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LineItem> CREATOR;
        public final Text amount;
        public final Text label;

        static {
            Summary$LineItem$Companion$ADAPTER$1 summary$LineItem$Companion$ADAPTER$1 = new Summary$LineItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LineItem.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.api.Summary.LineItem", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/api/search.proto");
            ADAPTER = summary$LineItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(summary$LineItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineItem(Text text, Text text2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = text;
            this.amount = text2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LineItem)) {
                return false;
            }
            LineItem lineItem = (LineItem) obj;
            return Intrinsics.areEqual(unknownFields(), lineItem.unknownFields()) && Intrinsics.areEqual(this.label, lineItem.label) && Intrinsics.areEqual(this.amount, lineItem.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Text text = this.label;
            int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.amount;
            int hashCode3 = hashCode2 + (text2 != null ? text2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.Builder builder = new Action.Builder(9);
            builder.f1268type = this.label;
            builder.details = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Text text = this.label;
            if (text != null) {
                arrayList.add("label=" + text);
            }
            Text text2 = this.amount;
            if (text2 != null) {
                arrayList.add("amount=" + text2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LineItem{", "}", 0, null, null, 56);
        }
    }

    static {
        Summary$Companion$ADAPTER$1 summary$Companion$ADAPTER$1 = new Summary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Summary.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.api.Summary", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/api/search.proto");
        ADAPTER = summary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(summary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Summary(Text text, Text text2, Text text3, Text text4, List list, List list2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.header = text;
        this.brief = text2;
        this.leadingFooter = text3;
        this.trailingFooter = text4;
        this.cursor = str;
        this.line_items = TransactorKt.immutableCopyOf("line_items", list);
        this.activity_rows = TransactorKt.immutableCopyOf("activity_rows", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        return Intrinsics.areEqual(unknownFields(), summary.unknownFields()) && Intrinsics.areEqual(this.header, summary.header) && Intrinsics.areEqual(this.brief, summary.brief) && Intrinsics.areEqual(this.leadingFooter, summary.leadingFooter) && Intrinsics.areEqual(this.trailingFooter, summary.trailingFooter) && Intrinsics.areEqual(this.line_items, summary.line_items) && Intrinsics.areEqual(this.activity_rows, summary.activity_rows) && Intrinsics.areEqual(this.cursor, summary.cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.header;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.brief;
        int hashCode3 = (hashCode2 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Text text3 = this.leadingFooter;
        int hashCode4 = (hashCode3 + (text3 != null ? text3.hashCode() : 0)) * 37;
        Text text4 = this.trailingFooter;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (text4 != null ? text4.hashCode() : 0)) * 37, 37, this.line_items), 37, this.activity_rows);
        String str = this.cursor;
        int hashCode5 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(22, false);
        builder.alias_value = this.header;
        builder.hashed_alias_token = this.brief;
        builder.alias_type = this.leadingFooter;
        builder.updated_at = this.trailingFooter;
        builder.linked_at = this.line_items;
        builder.version = this.activity_rows;
        builder.customer_token = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.header;
        if (text != null) {
            arrayList.add("header=" + text);
        }
        Text text2 = this.brief;
        if (text2 != null) {
            arrayList.add("brief=" + text2);
        }
        Text text3 = this.leadingFooter;
        if (text3 != null) {
            arrayList.add("leadingFooter=" + text3);
        }
        Text text4 = this.trailingFooter;
        if (text4 != null) {
            arrayList.add("trailingFooter=" + text4);
        }
        List list = this.line_items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("line_items=", arrayList, list);
        }
        List list2 = this.activity_rows;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("activity_rows=", arrayList, list2);
        }
        String str = this.cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Summary{", "}", 0, null, null, 56);
    }
}
