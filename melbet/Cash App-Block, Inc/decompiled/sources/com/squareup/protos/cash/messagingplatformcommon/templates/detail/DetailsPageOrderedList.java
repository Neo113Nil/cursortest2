package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
public final class DetailsPageOrderedList extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageOrderedList> CREATOR;
    public final List items;
    public final DetailsPageListVariant variant;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List items;
        public DetailsPageListVariant variant;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new DetailsPageOrderedList(this.items, this.variant, buildUnknownFields());
                default:
                    return new DetailsPageUnorderedList(this.items, this.variant, buildUnknownFields());
            }
        }
    }

    static {
        DetailsPageOrderedList$Companion$ADAPTER$1 detailsPageOrderedList$Companion$ADAPTER$1 = new DetailsPageOrderedList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageOrderedList.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageOrderedList", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageOrderedList$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageOrderedList$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageOrderedList(List list, DetailsPageListVariant detailsPageListVariant, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.variant = detailsPageListVariant;
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageOrderedList)) {
            return false;
        }
        DetailsPageOrderedList detailsPageOrderedList = (DetailsPageOrderedList) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageOrderedList.unknownFields()) && Intrinsics.areEqual(this.items, detailsPageOrderedList.items) && this.variant == detailsPageOrderedList.variant;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.items);
        DetailsPageListVariant detailsPageListVariant = this.variant;
        int hashCode = m + (detailsPageListVariant != null ? detailsPageListVariant.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.items = this.items;
        builder.variant = this.variant;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        DetailsPageListVariant detailsPageListVariant = this.variant;
        if (detailsPageListVariant != null) {
            arrayList.add("variant=" + detailsPageListVariant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageOrderedList{", "}", 0, null, null, 56);
    }
}
