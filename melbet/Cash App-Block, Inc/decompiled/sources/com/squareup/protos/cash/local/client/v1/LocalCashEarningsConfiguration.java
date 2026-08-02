package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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
public final class LocalCashEarningsConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCashEarningsConfiguration> CREATOR;
    public final LocalMoney calculated_local_cash_earnings;
    public final String fine_print_markdown;
    public final List tiers;

    public final class Tier extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Tier> CREATOR;
        public final LocalMoney cap_absolute_amount;
        public final Long cap_subtotal_multiplier_bps;
        public final Long earning_rate_bps;
        public final LocalMoney subtotal_threshold;

        static {
            LocalCashEarningsConfiguration$Tier$Companion$ADAPTER$1 localCashEarningsConfiguration$Tier$Companion$ADAPTER$1 = new LocalCashEarningsConfiguration$Tier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Tier.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashEarningsConfiguration.Tier", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
            ADAPTER = localCashEarningsConfiguration$Tier$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashEarningsConfiguration$Tier$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tier(LocalMoney localMoney, Long l, LocalMoney localMoney2, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.subtotal_threshold = localMoney;
            this.cap_subtotal_multiplier_bps = l;
            this.cap_absolute_amount = localMoney2;
            this.earning_rate_bps = l2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Tier)) {
                return false;
            }
            Tier tier = (Tier) obj;
            return Intrinsics.areEqual(unknownFields(), tier.unknownFields()) && Intrinsics.areEqual(this.subtotal_threshold, tier.subtotal_threshold) && Intrinsics.areEqual(this.cap_subtotal_multiplier_bps, tier.cap_subtotal_multiplier_bps) && Intrinsics.areEqual(this.cap_absolute_amount, tier.cap_absolute_amount) && Intrinsics.areEqual(this.earning_rate_bps, tier.earning_rate_bps);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalMoney localMoney = this.subtotal_threshold;
            int hashCode2 = (hashCode + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
            Long l = this.cap_subtotal_multiplier_bps;
            int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            LocalMoney localMoney2 = this.cap_absolute_amount;
            int hashCode4 = (hashCode3 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37;
            Long l2 = this.earning_rate_bps;
            int hashCode5 = hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(7, false);
            builder.gift_card_amount = this.subtotal_threshold;
            builder.id = this.cap_subtotal_multiplier_bps;
            builder.last_4 = this.cap_absolute_amount;
            builder.gift_card_id = this.earning_rate_bps;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalMoney localMoney = this.subtotal_threshold;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtotal_threshold=", localMoney, arrayList);
            }
            Long l = this.cap_subtotal_multiplier_bps;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("cap_subtotal_multiplier_bps=", l, arrayList);
            }
            LocalMoney localMoney2 = this.cap_absolute_amount;
            if (localMoney2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("cap_absolute_amount=", localMoney2, arrayList);
            }
            Long l2 = this.earning_rate_bps;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("earning_rate_bps=", l2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Tier{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalCashEarningsConfiguration$Companion$ADAPTER$1 localCashEarningsConfiguration$Companion$ADAPTER$1 = new LocalCashEarningsConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashEarningsConfiguration.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashEarningsConfiguration", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
        ADAPTER = localCashEarningsConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashEarningsConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCashEarningsConfiguration(String str, List list, LocalMoney localMoney, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.fine_print_markdown = str;
        this.calculated_local_cash_earnings = localMoney;
        this.tiers = TransactorKt.immutableCopyOf("tiers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCashEarningsConfiguration)) {
            return false;
        }
        LocalCashEarningsConfiguration localCashEarningsConfiguration = (LocalCashEarningsConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), localCashEarningsConfiguration.unknownFields()) && Intrinsics.areEqual(this.fine_print_markdown, localCashEarningsConfiguration.fine_print_markdown) && Intrinsics.areEqual(this.tiers, localCashEarningsConfiguration.tiers) && Intrinsics.areEqual(this.calculated_local_cash_earnings, localCashEarningsConfiguration.calculated_local_cash_earnings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.fine_print_markdown;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.tiers);
        LocalMoney localMoney = this.calculated_local_cash_earnings;
        int hashCode2 = m + (localMoney != null ? localMoney.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(24);
        builder.name = this.fine_print_markdown;
        builder.participants = this.tiers;
        builder.group_image = this.calculated_local_cash_earnings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.fine_print_markdown;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fine_print_markdown=", arrayList);
        }
        List list = this.tiers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tiers=", arrayList, list);
        }
        LocalMoney localMoney = this.calculated_local_cash_earnings;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("calculated_local_cash_earnings=", localMoney, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashEarningsConfiguration{", "}", 0, null, null, 56);
    }
}
