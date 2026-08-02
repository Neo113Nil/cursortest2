package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ProfileAlias;
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

/* loaded from: classes8.dex */
public final class StablecoinRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StablecoinRenderData> CREATOR;
    public final String block_explorer_link;
    public final String exchange_rate;
    public final String network;
    public final StablecoinRejectReason reject_reason;
    public final Money source_amount;

    static {
        StablecoinRenderData$Companion$ADAPTER$1 stablecoinRenderData$Companion$ADAPTER$1 = new StablecoinRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StablecoinRenderData.class), "type.googleapis.com/squareup.franklin.StablecoinRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = stablecoinRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stablecoinRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StablecoinRenderData(String str, StablecoinRejectReason stablecoinRejectReason, String str2, String str3, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.block_explorer_link = str;
        this.reject_reason = stablecoinRejectReason;
        this.network = str2;
        this.exchange_rate = str3;
        this.source_amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StablecoinRenderData)) {
            return false;
        }
        StablecoinRenderData stablecoinRenderData = (StablecoinRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), stablecoinRenderData.unknownFields()) && Intrinsics.areEqual(this.block_explorer_link, stablecoinRenderData.block_explorer_link) && this.reject_reason == stablecoinRenderData.reject_reason && Intrinsics.areEqual(this.network, stablecoinRenderData.network) && Intrinsics.areEqual(this.exchange_rate, stablecoinRenderData.exchange_rate) && Intrinsics.areEqual(this.source_amount, stablecoinRenderData.source_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.block_explorer_link;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        StablecoinRejectReason stablecoinRejectReason = this.reject_reason;
        int hashCode3 = (hashCode2 + (stablecoinRejectReason != null ? stablecoinRejectReason.hashCode() : 0)) * 37;
        String str2 = this.network;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.exchange_rate;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money = this.source_amount;
        int hashCode6 = hashCode5 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(16, false);
        builder.alias = this.block_explorer_link;
        builder.verified = this.reject_reason;
        builder.expires_at = this.network;
        builder.version = this.exchange_rate;
        builder.display_date = this.source_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.block_explorer_link;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "block_explorer_link=", arrayList);
        }
        StablecoinRejectReason stablecoinRejectReason = this.reject_reason;
        if (stablecoinRejectReason != null) {
            arrayList.add("reject_reason=" + stablecoinRejectReason);
        }
        String str2 = this.network;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "network=", arrayList);
        }
        String str3 = this.exchange_rate;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "exchange_rate=", arrayList);
        }
        Money money = this.source_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("source_amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StablecoinRenderData{", "}", 0, null, null, 56);
    }
}
