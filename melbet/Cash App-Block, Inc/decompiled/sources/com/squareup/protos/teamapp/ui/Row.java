package com.squareup.protos.teamapp.ui;

import android.os.Parcelable;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class Row extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Row> CREATOR;
    public final Link link;
    public final ParameterizedText title;
    public final ParameterizedText value;

    static {
        Row$Companion$ADAPTER$1 row$Companion$ADAPTER$1 = new Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.teamapp.ui.Row", Syntax.PROTO_2, null, "squareup/teamapp/ui/models.proto");
        ADAPTER = row$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(row$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Row(ParameterizedText parameterizedText, ParameterizedText parameterizedText2, Link link, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = parameterizedText;
        this.value = parameterizedText2;
        this.link = link;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.title, row.title) && Intrinsics.areEqual(this.value, row.value) && Intrinsics.areEqual(this.link, row.link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ParameterizedText parameterizedText = this.title;
        int hashCode2 = (hashCode + (parameterizedText != null ? parameterizedText.hashCode() : 0)) * 37;
        ParameterizedText parameterizedText2 = this.value;
        int hashCode3 = (hashCode2 + (parameterizedText2 != null ? parameterizedText2.hashCode() : 0)) * 37;
        Link link = this.link;
        int hashCode4 = hashCode3 + (link != null ? link.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(8);
        builder.action = this.title;
        builder.full_applet = this.value;
        builder.half_applet = this.link;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ParameterizedText parameterizedText = this.title;
        if (parameterizedText != null) {
            arrayList.add("title=" + parameterizedText);
        }
        ParameterizedText parameterizedText2 = this.value;
        if (parameterizedText2 != null) {
            arrayList.add("value=" + parameterizedText2);
        }
        Link link = this.link;
        if (link != null) {
            arrayList.add("link=" + link);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
    }
}
