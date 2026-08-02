package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentIncentive extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncInvestmentIncentive> CREATOR;
    public final Long incentive_expiration_timestamp;
    public final Image incentive_icon;
    public final String investment_incentive_token;
    public final Money offer_amount;
    public final IncentiveState state;
    public final String text;

    public enum IncentiveState implements WireEnum {
        DO_NOT_USE_INCENTIVE_STATE(0),
        UNCLAIMED(1),
        CLAIMED(2),
        INELIGIBLE(3);

        public static final SyncInvestmentIncentive$IncentiveState$Companion$ADAPTER$1 ADAPTER;
        public static final ClientDriven.Companion Companion;
        public final int value;

        static {
            IncentiveState incentiveState = DO_NOT_USE_INCENTIVE_STATE;
            Companion = new ClientDriven.Companion();
            ADAPTER = new SyncInvestmentIncentive$IncentiveState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IncentiveState.class), Syntax.PROTO_2, incentiveState);
        }

        IncentiveState(int i) {
            this.value = i;
        }

        public static final IncentiveState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE_INCENTIVE_STATE;
            }
            if (i == 1) {
                return UNCLAIMED;
            }
            if (i == 2) {
                return CLAIMED;
            }
            if (i != 3) {
                return null;
            }
            return INELIGIBLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncInvestmentIncentive$Companion$ADAPTER$1 syncInvestmentIncentive$Companion$ADAPTER$1 = new SyncInvestmentIncentive$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncInvestmentIncentive.class), "type.googleapis.com/squareup.franklin.SyncInvestmentIncentive", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncInvestmentIncentive$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentIncentive$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncInvestmentIncentive(String str, Money money, IncentiveState incentiveState, Image image, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_incentive_token = str;
        this.offer_amount = money;
        this.state = incentiveState;
        this.incentive_icon = image;
        this.text = str2;
        this.incentive_expiration_timestamp = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncInvestmentIncentive)) {
            return false;
        }
        SyncInvestmentIncentive syncInvestmentIncentive = (SyncInvestmentIncentive) obj;
        return Intrinsics.areEqual(unknownFields(), syncInvestmentIncentive.unknownFields()) && Intrinsics.areEqual(this.investment_incentive_token, syncInvestmentIncentive.investment_incentive_token) && Intrinsics.areEqual(this.offer_amount, syncInvestmentIncentive.offer_amount) && this.state == syncInvestmentIncentive.state && Intrinsics.areEqual(this.incentive_icon, syncInvestmentIncentive.incentive_icon) && Intrinsics.areEqual(this.text, syncInvestmentIncentive.text) && Intrinsics.areEqual(this.incentive_expiration_timestamp, syncInvestmentIncentive.incentive_expiration_timestamp);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_incentive_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.offer_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        IncentiveState incentiveState = this.state;
        int hashCode4 = (hashCode3 + (incentiveState != null ? incentiveState.hashCode() : 0)) * 37;
        Image image = this.incentive_icon;
        int hashCode5 = (hashCode4 + (image != null ? image.hashCode() : 0)) * 37;
        String str2 = this.text;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.incentive_expiration_timestamp;
        int hashCode7 = hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(9, false);
        builder.full_name = this.investment_incentive_token;
        builder.synopsis = this.offer_amount;
        builder.full_cashtag = this.state;
        builder.cashtag_url_enabled = this.incentive_icon;
        builder.photo_url = this.text;
        builder.is_verified_account = this.incentive_expiration_timestamp;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_incentive_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_incentive_token=", arrayList);
        }
        Money money = this.offer_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("offer_amount=", money, arrayList);
        }
        IncentiveState incentiveState = this.state;
        if (incentiveState != null) {
            arrayList.add("state=" + incentiveState);
        }
        Image image = this.incentive_icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("incentive_icon=", image, arrayList);
        }
        String str2 = this.text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
        }
        Long l = this.incentive_expiration_timestamp;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("incentive_expiration_timestamp=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncInvestmentIncentive{", "}", 0, null, null, 56);
    }
}
