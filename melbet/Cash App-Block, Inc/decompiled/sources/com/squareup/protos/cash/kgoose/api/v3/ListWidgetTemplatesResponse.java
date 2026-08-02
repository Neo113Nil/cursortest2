package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ListWidgetTemplatesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListWidgetTemplatesResponse$Builder;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateInfo;", "templates", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListWidgetTemplatesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListWidgetTemplatesResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.WidgetTemplateInfo#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<WidgetTemplateInfo> templates;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ListWidgetTemplatesResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListWidgetTemplatesResponse;", "<init>", "()V", "templates", "", "Lcom/squareup/protos/cash/kgoose/api/v3/WidgetTemplateInfo;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<WidgetTemplateInfo> templates = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public ListWidgetTemplatesResponse build() {
            return new ListWidgetTemplatesResponse(this.templates, buildUnknownFields());
        }

        public final Builder templates(List<WidgetTemplateInfo> templates) {
            templates.getClass();
            TransactorKt.checkElementsNotNull(templates);
            this.templates = templates;
            return this;
        }
    }

    static {
        ListWidgetTemplatesResponse$Companion$ADAPTER$1 listWidgetTemplatesResponse$Companion$ADAPTER$1 = new ListWidgetTemplatesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListWidgetTemplatesResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ListWidgetTemplatesResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/widget_service.proto");
        ADAPTER = listWidgetTemplatesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listWidgetTemplatesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListWidgetTemplatesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.templates = TransactorKt.immutableCopyOf("templates", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListWidgetTemplatesResponse)) {
            return false;
        }
        ListWidgetTemplatesResponse listWidgetTemplatesResponse = (ListWidgetTemplatesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listWidgetTemplatesResponse.unknownFields()) && Intrinsics.areEqual(this.templates, listWidgetTemplatesResponse.templates);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.templates.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.templates = this.templates;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.templates.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("templates=", arrayList, this.templates);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListWidgetTemplatesResponse{", "}", 0, null, null, 56);
    }
}
