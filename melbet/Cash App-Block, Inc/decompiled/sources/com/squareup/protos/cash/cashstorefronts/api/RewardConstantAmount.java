package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
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
public final class RewardConstantAmount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RewardConstantAmount> CREATOR;
    public final Money amount;

    static {
        RewardConstantAmount$Companion$ADAPTER$1 rewardConstantAmount$Companion$ADAPTER$1 = new RewardConstantAmount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RewardConstantAmount.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.RewardConstantAmount", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/Offer.proto");
        ADAPTER = rewardConstantAmount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardConstantAmount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardConstantAmount(Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RewardConstantAmount)) {
            return false;
        }
        RewardConstantAmount rewardConstantAmount = (RewardConstantAmount) obj;
        return Intrinsics.areEqual(unknownFields(), rewardConstantAmount.unknownFields()) && Intrinsics.areEqual(this.amount, rewardConstantAmount.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Entity.Payment.Builder builder = new Entity.Payment.Builder(2);
        builder.amount = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RewardConstantAmount{", "}", 0, null, null, 56);
    }
}
