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
public final class DetailsPageParagraph extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageParagraph> CREATOR;
    public final DetailsPageText body;

    static {
        DetailsPageParagraph$Companion$ADAPTER$1 detailsPageParagraph$Companion$ADAPTER$1 = new DetailsPageParagraph$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageParagraph.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageParagraph", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageParagraph$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageParagraph$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageParagraph(DetailsPageText detailsPageText, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.body = detailsPageText;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageParagraph)) {
            return false;
        }
        DetailsPageParagraph detailsPageParagraph = (DetailsPageParagraph) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageParagraph.unknownFields()) && Intrinsics.areEqual(this.body, detailsPageParagraph.body);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DetailsPageText detailsPageText = this.body;
        int hashCode2 = hashCode + (detailsPageText != null ? detailsPageText.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DetailsPageFooter.Builder builder = new DetailsPageFooter.Builder(2);
        builder.body = this.body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DetailsPageText detailsPageText = this.body;
        if (detailsPageText != null) {
            arrayList.add("body=" + detailsPageText);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageParagraph{", "}", 0, null, null, 56);
    }
}
