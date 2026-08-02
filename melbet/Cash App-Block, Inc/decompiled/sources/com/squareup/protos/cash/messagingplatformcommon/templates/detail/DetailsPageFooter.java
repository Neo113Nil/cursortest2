package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

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

/* loaded from: classes7.dex */
public final class DetailsPageFooter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageFooter> CREATOR;
    public final DetailsPageText body;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public DetailsPageText body;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new DetailsPageFooter(this.body, buildUnknownFields());
                case 1:
                    return new DetailsPageHeader(this.body, buildUnknownFields());
                default:
                    return new DetailsPageParagraph(this.body, buildUnknownFields());
            }
        }
    }

    static {
        DetailsPageFooter$Companion$ADAPTER$1 detailsPageFooter$Companion$ADAPTER$1 = new DetailsPageFooter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageFooter.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageFooter", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageFooter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageFooter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageFooter(DetailsPageText detailsPageText, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.body = detailsPageText;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageFooter)) {
            return false;
        }
        DetailsPageFooter detailsPageFooter = (DetailsPageFooter) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageFooter.unknownFields()) && Intrinsics.areEqual(this.body, detailsPageFooter.body);
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
        Builder builder = new Builder(0);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageFooter{", "}", 0, null, null, 56);
    }
}
