package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class DetailsPageOrderedListItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageOrderedListItem> CREATOR;
    public final DetailsPageText body;
    public final DetailsPageText label;
    public final Integer step_number;

    static {
        DetailsPageOrderedListItem$Companion$ADAPTER$1 detailsPageOrderedListItem$Companion$ADAPTER$1 = new DetailsPageOrderedListItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageOrderedListItem.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageOrderedListItem", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageOrderedListItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageOrderedListItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageOrderedListItem(Integer num, DetailsPageText detailsPageText, DetailsPageText detailsPageText2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.step_number = num;
        this.label = detailsPageText;
        this.body = detailsPageText2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageOrderedListItem)) {
            return false;
        }
        DetailsPageOrderedListItem detailsPageOrderedListItem = (DetailsPageOrderedListItem) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageOrderedListItem.unknownFields()) && Intrinsics.areEqual(this.step_number, detailsPageOrderedListItem.step_number) && Intrinsics.areEqual(this.label, detailsPageOrderedListItem.label) && Intrinsics.areEqual(this.body, detailsPageOrderedListItem.body);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.step_number;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        DetailsPageText detailsPageText = this.label;
        int hashCode3 = (hashCode2 + (detailsPageText != null ? detailsPageText.hashCode() : 0)) * 37;
        DetailsPageText detailsPageText2 = this.body;
        int hashCode4 = hashCode3 + (detailsPageText2 != null ? detailsPageText2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(17, false);
        builder.transmission_level = this.step_number;
        builder.advertisement_data = this.label;
        builder.frequency = this.body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.step_number;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("step_number=", num, arrayList);
        }
        DetailsPageText detailsPageText = this.label;
        if (detailsPageText != null) {
            arrayList.add("label=" + detailsPageText);
        }
        DetailsPageText detailsPageText2 = this.body;
        if (detailsPageText2 != null) {
            arrayList.add("body=" + detailsPageText2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageOrderedListItem{", "}", 0, null, null, 56);
    }
}
