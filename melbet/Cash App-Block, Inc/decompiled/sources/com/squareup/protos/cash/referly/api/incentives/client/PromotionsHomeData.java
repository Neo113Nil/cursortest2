package com.squareup.protos.cash.referly.api.incentives.client;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalMenuDiscountDetail;
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
public final class PromotionsHomeData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PromotionsHomeData> CREATOR;
    public final List active_promotions;
    public final String active_promotions_section_title;
    public final List available_promotions;
    public final String available_promotions_section_title;

    static {
        PromotionsHomeData$Companion$ADAPTER$1 promotionsHomeData$Companion$ADAPTER$1 = new PromotionsHomeData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PromotionsHomeData.class), "type.googleapis.com/squareup.cash.referly.api.incentives.client.PromotionsHomeData", Syntax.PROTO_2, null, "squareup/cash/referly/api/incentives/client/GetPromotionsHomeDataAPI.proto");
        ADAPTER = promotionsHomeData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(promotionsHomeData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsHomeData(String str, String str2, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.active_promotions_section_title = str;
        this.available_promotions_section_title = str2;
        this.active_promotions = TransactorKt.immutableCopyOf("active_promotions", list);
        this.available_promotions = TransactorKt.immutableCopyOf("available_promotions", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromotionsHomeData)) {
            return false;
        }
        PromotionsHomeData promotionsHomeData = (PromotionsHomeData) obj;
        return Intrinsics.areEqual(unknownFields(), promotionsHomeData.unknownFields()) && Intrinsics.areEqual(this.active_promotions_section_title, promotionsHomeData.active_promotions_section_title) && Intrinsics.areEqual(this.active_promotions, promotionsHomeData.active_promotions) && Intrinsics.areEqual(this.available_promotions_section_title, promotionsHomeData.available_promotions_section_title) && Intrinsics.areEqual(this.available_promotions, promotionsHomeData.available_promotions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.active_promotions_section_title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.active_promotions);
        String str2 = this.available_promotions_section_title;
        int hashCode2 = this.available_promotions.hashCode() + ((m + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalMenuDiscountDetail.Builder builder = new LocalMenuDiscountDetail.Builder(1);
        builder.token = this.active_promotions_section_title;
        builder.eligible_object_names = this.active_promotions;
        builder.name = this.available_promotions_section_title;
        builder.eligibility_detail_lines = this.available_promotions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.active_promotions_section_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "active_promotions_section_title=", arrayList);
        }
        List list = this.active_promotions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("active_promotions=", arrayList, list);
        }
        String str2 = this.available_promotions_section_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "available_promotions_section_title=", arrayList);
        }
        List list2 = this.available_promotions;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_promotions=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromotionsHomeData{", "}", 0, null, null, 56);
    }
}
