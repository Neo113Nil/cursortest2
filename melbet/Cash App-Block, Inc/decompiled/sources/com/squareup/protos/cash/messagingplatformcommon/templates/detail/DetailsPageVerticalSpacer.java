package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
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
public final class DetailsPageVerticalSpacer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageVerticalSpacer> CREATOR;
    public final DetailsPageSpacerSize size;

    static {
        DetailsPageVerticalSpacer$Companion$ADAPTER$1 detailsPageVerticalSpacer$Companion$ADAPTER$1 = new DetailsPageVerticalSpacer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageVerticalSpacer.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageVerticalSpacer", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageVerticalSpacer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageVerticalSpacer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageVerticalSpacer(DetailsPageSpacerSize detailsPageSpacerSize, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.size = detailsPageSpacerSize;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageVerticalSpacer)) {
            return false;
        }
        DetailsPageVerticalSpacer detailsPageVerticalSpacer = (DetailsPageVerticalSpacer) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageVerticalSpacer.unknownFields()) && this.size == detailsPageVerticalSpacer.size;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DetailsPageSpacerSize detailsPageSpacerSize = this.size;
        int hashCode2 = hashCode + (detailsPageSpacerSize != null ? detailsPageSpacerSize.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(23);
        builder.local_buyer = this.size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DetailsPageSpacerSize detailsPageSpacerSize = this.size;
        if (detailsPageSpacerSize != null) {
            arrayList.add("size=" + detailsPageSpacerSize);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageVerticalSpacer{", "}", 0, null, null, 56);
    }
}
