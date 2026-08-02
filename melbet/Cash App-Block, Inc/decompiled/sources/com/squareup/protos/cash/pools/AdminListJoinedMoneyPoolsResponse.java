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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/pools/AdminListJoinedMoneyPoolsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/ViewPlan$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdminListJoinedMoneyPoolsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AdminListJoinedMoneyPoolsResponse> CREATOR;
    public final String next_page_token;
    public final List pools;

    static {
        AdminListJoinedMoneyPoolsResponse$Companion$ADAPTER$1 adminListJoinedMoneyPoolsResponse$Companion$ADAPTER$1 = new AdminListJoinedMoneyPoolsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AdminListJoinedMoneyPoolsResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.AdminListJoinedMoneyPoolsResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = adminListJoinedMoneyPoolsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(adminListJoinedMoneyPoolsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminListJoinedMoneyPoolsResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_page_token = str;
        this.pools = TransactorKt.immutableCopyOf("pools", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdminListJoinedMoneyPoolsResponse)) {
            return false;
        }
        AdminListJoinedMoneyPoolsResponse adminListJoinedMoneyPoolsResponse = (AdminListJoinedMoneyPoolsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), adminListJoinedMoneyPoolsResponse.unknownFields()) && Intrinsics.areEqual(this.pools, adminListJoinedMoneyPoolsResponse.pools) && Intrinsics.areEqual(this.next_page_token, adminListJoinedMoneyPoolsResponse.next_page_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.pools);
        String str = this.next_page_token;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ViewPlan.Builder builder = new ViewPlan.Builder(4, false);
        builder.view_entries = this.pools;
        builder.initial_view_slug = this.next_page_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.pools;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pools=", arrayList, list);
        }
        String str = this.next_page_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_page_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdminListJoinedMoneyPoolsResponse{", "}", 0, null, null, 56);
    }
}
