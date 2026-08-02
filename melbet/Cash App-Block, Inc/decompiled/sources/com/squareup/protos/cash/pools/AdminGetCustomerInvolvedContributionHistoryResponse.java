package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.ViewPlan;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/pools/AdminGetCustomerInvolvedContributionHistoryResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/ViewPlan$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdminGetCustomerInvolvedContributionHistoryResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AdminGetCustomerInvolvedContributionHistoryResponse> CREATOR;
    public final List contributions;
    public final String next_page_token;

    static {
        AdminGetCustomerInvolvedContributionHistoryResponse$Companion$ADAPTER$1 adminGetCustomerInvolvedContributionHistoryResponse$Companion$ADAPTER$1 = new AdminGetCustomerInvolvedContributionHistoryResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AdminGetCustomerInvolvedContributionHistoryResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.AdminGetCustomerInvolvedContributionHistoryResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = adminGetCustomerInvolvedContributionHistoryResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(adminGetCustomerInvolvedContributionHistoryResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminGetCustomerInvolvedContributionHistoryResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_page_token = str;
        this.contributions = TransactorKt.immutableCopyOf("contributions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdminGetCustomerInvolvedContributionHistoryResponse)) {
            return false;
        }
        AdminGetCustomerInvolvedContributionHistoryResponse adminGetCustomerInvolvedContributionHistoryResponse = (AdminGetCustomerInvolvedContributionHistoryResponse) obj;
        return Intrinsics.areEqual(unknownFields(), adminGetCustomerInvolvedContributionHistoryResponse.unknownFields()) && Intrinsics.areEqual(this.contributions, adminGetCustomerInvolvedContributionHistoryResponse.contributions) && Intrinsics.areEqual(this.next_page_token, adminGetCustomerInvolvedContributionHistoryResponse.next_page_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.contributions);
        String str = this.next_page_token;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ViewPlan.Builder builder = new ViewPlan.Builder(1, false);
        builder.view_entries = this.contributions;
        builder.initial_view_slug = this.next_page_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.contributions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("contributions=", arrayList, list);
        }
        String str = this.next_page_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_page_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdminGetCustomerInvolvedContributionHistoryResponse{", "}", 0, null, null, 56);
    }
}
