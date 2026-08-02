package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.ActivitySection;
import com.squareup.protos.document.Document;
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

/* loaded from: classes8.dex */
public final class ActivityRowRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityRowRenderData> CREATOR;
    public final ActivityItemGlobalId activity_item_global_id;
    public final ActivityItemType activity_item_type;
    public final List product_classifiers;
    public final ActivityItemGlobalId reference_activity_item_global_id;
    public final ActivityRowSection row_section;
    public final ActivitySection section;

    static {
        ActivityRowRenderData$Companion$ADAPTER$1 activityRowRenderData$Companion$ADAPTER$1 = new ActivityRowRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityRowRenderData.class), "type.googleapis.com/squareup.franklin.ActivityRowRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = activityRowRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityRowRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityRowRenderData(ActivitySection activitySection, List list, ActivityItemType activityItemType, ActivityItemGlobalId activityItemGlobalId, ActivityRowSection activityRowSection, ActivityItemGlobalId activityItemGlobalId2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.section = activitySection;
        this.activity_item_type = activityItemType;
        this.reference_activity_item_global_id = activityItemGlobalId;
        this.row_section = activityRowSection;
        this.activity_item_global_id = activityItemGlobalId2;
        this.product_classifiers = TransactorKt.immutableCopyOf("product_classifiers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityRowRenderData)) {
            return false;
        }
        ActivityRowRenderData activityRowRenderData = (ActivityRowRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), activityRowRenderData.unknownFields()) && Intrinsics.areEqual(this.section, activityRowRenderData.section) && Intrinsics.areEqual(this.product_classifiers, activityRowRenderData.product_classifiers) && this.activity_item_type == activityRowRenderData.activity_item_type && Intrinsics.areEqual(this.reference_activity_item_global_id, activityRowRenderData.reference_activity_item_global_id) && this.row_section == activityRowRenderData.row_section && Intrinsics.areEqual(this.activity_item_global_id, activityRowRenderData.activity_item_global_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivitySection activitySection = this.section;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (activitySection != null ? activitySection.hashCode() : 0)) * 37, 37, this.product_classifiers);
        ActivityItemType activityItemType = this.activity_item_type;
        int hashCode2 = (m + (activityItemType != null ? activityItemType.hashCode() : 0)) * 37;
        ActivityItemGlobalId activityItemGlobalId = this.reference_activity_item_global_id;
        int hashCode3 = (hashCode2 + (activityItemGlobalId != null ? activityItemGlobalId.hashCode() : 0)) * 37;
        ActivityRowSection activityRowSection = this.row_section;
        int hashCode4 = (hashCode3 + (activityRowSection != null ? activityRowSection.hashCode() : 0)) * 37;
        ActivityItemGlobalId activityItemGlobalId2 = this.activity_item_global_id;
        int hashCode5 = hashCode4 + (activityItemGlobalId2 != null ? activityItemGlobalId2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(20, false);
        builder.category = this.section;
        builder.token = this.product_classifiers;
        builder.title = this.activity_item_type;
        builder.url = this.reference_activity_item_global_id;
        builder.owner_token = this.row_section;
        builder.document_date = this.activity_item_global_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivitySection activitySection = this.section;
        if (activitySection != null) {
            arrayList.add("section=" + activitySection);
        }
        List list = this.product_classifiers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("product_classifiers=", arrayList, list);
        }
        ActivityItemType activityItemType = this.activity_item_type;
        if (activityItemType != null) {
            arrayList.add("activity_item_type=" + activityItemType);
        }
        ActivityItemGlobalId activityItemGlobalId = this.reference_activity_item_global_id;
        if (activityItemGlobalId != null) {
            arrayList.add("reference_activity_item_global_id=" + activityItemGlobalId);
        }
        ActivityRowSection activityRowSection = this.row_section;
        if (activityRowSection != null) {
            arrayList.add("row_section=" + activityRowSection);
        }
        ActivityItemGlobalId activityItemGlobalId2 = this.activity_item_global_id;
        if (activityItemGlobalId2 != null) {
            arrayList.add("activity_item_global_id=" + activityItemGlobalId2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivityRowRenderData{", "}", 0, null, null, 56);
    }
}
