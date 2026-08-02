package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.referly.api.incentives.client.PromotionsHomeData;
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
public final class LocalMenuDiscountDetail extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuDiscountDetail> CREATOR;
    public final List eligibility_detail_lines;
    public final List eligible_object_names;
    public final String name;
    public final String token;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List eligibility_detail_lines;
        public List eligible_object_names;
        public String name;
        public String token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LocalMenuDiscountDetail(this.token, this.name, this.eligible_object_names, this.eligibility_detail_lines, buildUnknownFields());
                default:
                    return new PromotionsHomeData(this.token, this.name, this.eligible_object_names, this.eligibility_detail_lines, buildUnknownFields());
            }
        }
    }

    static {
        LocalMenuDiscountDetail$Companion$ADAPTER$1 localMenuDiscountDetail$Companion$ADAPTER$1 = new LocalMenuDiscountDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuDiscountDetail.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuDiscountDetail", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuDiscountDetail$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuDiscountDetail$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuDiscountDetail(String str, String str2, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.token = str;
        this.name = str2;
        this.eligible_object_names = TransactorKt.immutableCopyOf("eligible_object_names", list);
        this.eligibility_detail_lines = TransactorKt.immutableCopyOf("eligibility_detail_lines", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuDiscountDetail)) {
            return false;
        }
        LocalMenuDiscountDetail localMenuDiscountDetail = (LocalMenuDiscountDetail) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuDiscountDetail.unknownFields()) && Intrinsics.areEqual(this.token, localMenuDiscountDetail.token) && Intrinsics.areEqual(this.name, localMenuDiscountDetail.name) && Intrinsics.areEqual(this.eligible_object_names, localMenuDiscountDetail.eligible_object_names) && Intrinsics.areEqual(this.eligibility_detail_lines, localMenuDiscountDetail.eligibility_detail_lines);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = this.eligibility_detail_lines.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.eligible_object_names);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.name = this.name;
        builder.eligible_object_names = this.eligible_object_names;
        builder.eligibility_detail_lines = this.eligibility_detail_lines;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        List list = this.eligible_object_names;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("eligible_object_names=", arrayList, list);
        }
        List list2 = this.eligibility_detail_lines;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("eligibility_detail_lines=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuDiscountDetail{", "}", 0, null, null, 56);
    }
}
