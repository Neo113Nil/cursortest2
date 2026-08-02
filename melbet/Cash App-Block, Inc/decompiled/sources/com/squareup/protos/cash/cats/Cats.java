package com.squareup.protos.cash.cats;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Request;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.GetDisplayNameStatusClientResponse;
import com.squareup.protos.cash.fx.app.StreamExchangeRateHeartbeat;
import com.squareup.protos.cash.kgoose.syncentity.CashUserSettings;
import com.squareup.protos.cash.lions.Lions;
import com.squareup.protos.cash.local.client.app.internal.CreateLocalCashTransactionResponse;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.common.values.LocalCash;
import com.squareup.protos.cash.pools.PoolSurcharge;
import com.squareup.protos.cash.profiles.DisplayNameDetails;
import com.squareup.protos.cash.rabbits.Rabbits;
import com.squareup.protos.hieroglyph.PublicKeyConfig;
import com.squareup.protos.timecards.BreakRule;
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
import squareup.cash.cryptocurrency.BtcP2pConversionBps;
import squareup.cash.customer_feed.service.KeepAlive;

/* loaded from: classes7.dex */
public final class Cats extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Cats> CREATOR;
    public final Long cat_count;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Long cat_count;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Cats(this.cat_count, buildUnknownFields());
                case 1:
                    return new SetBtcP2pConversionBpsV2Request(this.cat_count, buildUnknownFields());
                case 2:
                    return new GetDisplayNameStatusClientResponse(this.cat_count, buildUnknownFields());
                case 3:
                    return new StreamExchangeRateHeartbeat(this.cat_count, buildUnknownFields());
                case 4:
                    return new CashUserSettings(this.cat_count, buildUnknownFields());
                case 5:
                    return new Lions(this.cat_count, buildUnknownFields());
                case 6:
                    return new CreateLocalCashTransactionResponse(this.cat_count, buildUnknownFields());
                case 7:
                    return new LocalCashBalance(this.cat_count, buildUnknownFields());
                case 8:
                    Long l = this.cat_count;
                    if (l != null) {
                        return new LocalCash(l.longValue(), buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(l, "amount");
                    throw null;
                case 9:
                    return new PoolSurcharge(this.cat_count, buildUnknownFields());
                case 10:
                    return new DisplayNameDetails(this.cat_count, buildUnknownFields());
                case 11:
                    return new Rabbits(this.cat_count, buildUnknownFields());
                case 12:
                    return new PublicKeyConfig(this.cat_count, buildUnknownFields());
                case 13:
                    return new BreakRule.EarnEveryXSeconds(this.cat_count, buildUnknownFields());
                case 14:
                    return new BreakRule.EarnOnceIfShiftAtLeastXSeconds(this.cat_count, buildUnknownFields());
                case 15:
                    return new BtcP2pConversionBps(this.cat_count, buildUnknownFields());
                default:
                    return new KeepAlive(this.cat_count, buildUnknownFields());
            }
        }
    }

    static {
        Cats$Companion$ADAPTER$1 cats$Companion$ADAPTER$1 = new Cats$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Cats.class), "type.googleapis.com/squareup.cash.cats.Cats", Syntax.PROTO_2, null, "squareup/cash/cats/cats.proto");
        ADAPTER = cats$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cats$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cats(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cat_count = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cats)) {
            return false;
        }
        Cats cats = (Cats) obj;
        return Intrinsics.areEqual(unknownFields(), cats.unknownFields()) && Intrinsics.areEqual(this.cat_count, cats.cat_count);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.cat_count;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.cat_count = this.cat_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.cat_count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cat_count=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Cats{", "}", 0, null, null, 56);
    }
}
