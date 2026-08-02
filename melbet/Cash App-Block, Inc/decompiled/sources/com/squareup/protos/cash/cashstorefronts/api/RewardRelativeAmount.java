package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.YearlyData;
import com.squareup.protos.common.Money;
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
public final class RewardRelativeAmount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RewardRelativeAmount> CREATOR;
    public final Integer basis_points;
    public final Money max_reward;

    static {
        RewardRelativeAmount$Companion$ADAPTER$1 rewardRelativeAmount$Companion$ADAPTER$1 = new RewardRelativeAmount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RewardRelativeAmount.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.RewardRelativeAmount", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/Offer.proto");
        ADAPTER = rewardRelativeAmount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardRelativeAmount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardRelativeAmount(Money money, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.basis_points = num;
        this.max_reward = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RewardRelativeAmount)) {
            return false;
        }
        RewardRelativeAmount rewardRelativeAmount = (RewardRelativeAmount) obj;
        return Intrinsics.areEqual(unknownFields(), rewardRelativeAmount.unknownFields()) && Intrinsics.areEqual(this.basis_points, rewardRelativeAmount.basis_points) && Intrinsics.areEqual(this.max_reward, rewardRelativeAmount.max_reward);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.basis_points;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Money money = this.max_reward;
        int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        YearlyData.Builder builder = new YearlyData.Builder(2);
        builder.year = this.basis_points;
        builder.earnings = this.max_reward;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.basis_points;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("basis_points=", num, arrayList);
        }
        Money money = this.max_reward;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("max_reward=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RewardRelativeAmount{", "}", 0, null, null, 56);
    }
}
