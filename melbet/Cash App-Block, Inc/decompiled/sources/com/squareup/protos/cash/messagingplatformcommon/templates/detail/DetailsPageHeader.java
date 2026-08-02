package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import android.os.Parcelable;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageFooter;
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

/* loaded from: classes7.dex */
public final class DetailsPageHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageHeader> CREATOR;
    public final DetailsPageText title;

    static {
        DetailsPageHeader$Companion$ADAPTER$1 detailsPageHeader$Companion$ADAPTER$1 = new DetailsPageHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageHeader.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageHeader", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageHeader$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageHeader$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageHeader(DetailsPageText detailsPageText, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = detailsPageText;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageHeader)) {
            return false;
        }
        DetailsPageHeader detailsPageHeader = (DetailsPageHeader) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageHeader.unknownFields()) && Intrinsics.areEqual(this.title, detailsPageHeader.title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DetailsPageText detailsPageText = this.title;
        int hashCode2 = hashCode + (detailsPageText != null ? detailsPageText.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DetailsPageFooter.Builder builder = new DetailsPageFooter.Builder(1);
        builder.body = this.title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DetailsPageText detailsPageText = this.title;
        if (detailsPageText != null) {
            arrayList.add("title=" + detailsPageText);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageHeader{", "}", 0, null, null, 56);
    }
}
