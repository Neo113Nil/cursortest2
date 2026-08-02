package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
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
public final class LeaveMoneyPoolFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LeaveMoneyPoolFlowParameters> CREATOR;
    public final MoneyPoolVisitOrigin origin;
    public final String pool_token;

    static {
        LeaveMoneyPoolFlowParameters$Companion$ADAPTER$1 leaveMoneyPoolFlowParameters$Companion$ADAPTER$1 = new LeaveMoneyPoolFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LeaveMoneyPoolFlowParameters.class), "type.googleapis.com/squareup.cash.pools.v1beta.LeaveMoneyPoolFlowParameters", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/leave_money_pool_flow.proto");
        ADAPTER = leaveMoneyPoolFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(leaveMoneyPoolFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaveMoneyPoolFlowParameters(String str, MoneyPoolVisitOrigin moneyPoolVisitOrigin, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pool_token = str;
        this.origin = moneyPoolVisitOrigin;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LeaveMoneyPoolFlowParameters)) {
            return false;
        }
        LeaveMoneyPoolFlowParameters leaveMoneyPoolFlowParameters = (LeaveMoneyPoolFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), leaveMoneyPoolFlowParameters.unknownFields()) && Intrinsics.areEqual(this.pool_token, leaveMoneyPoolFlowParameters.pool_token) && this.origin == leaveMoneyPoolFlowParameters.origin;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pool_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        MoneyPoolVisitOrigin moneyPoolVisitOrigin = this.origin;
        int hashCode3 = hashCode2 + (moneyPoolVisitOrigin != null ? moneyPoolVisitOrigin.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(21);
        builder.f1329type = this.pool_token;
        builder.use_case = this.origin;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.pool_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pool_token=", arrayList);
        }
        MoneyPoolVisitOrigin moneyPoolVisitOrigin = this.origin;
        if (moneyPoolVisitOrigin != null) {
            arrayList.add("origin=" + moneyPoolVisitOrigin);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LeaveMoneyPoolFlowParameters{", "}", 0, null, null, 56);
    }

    public /* synthetic */ LeaveMoneyPoolFlowParameters(String str, MoneyPoolVisitOrigin moneyPoolVisitOrigin) {
        this(str, moneyPoolVisitOrigin, ByteString.EMPTY);
    }
}
