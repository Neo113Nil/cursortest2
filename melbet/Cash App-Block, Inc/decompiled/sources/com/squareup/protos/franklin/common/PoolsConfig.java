package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.app.ClaimablePayment;
import com.squareup.protos.franklin.app.HumanConfirmationRequest;
import com.squareup.protos.franklin.app.PlaidLinkTokenCreateResponse;
import com.squareup.protos.franklin.common.GiftCardRenderData;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.protos.franklin.loyalty.LoyaltyUnit;
import com.squareup.protos.franklin.ui.UiItemizedReceipt;
import com.squareup.protos.timecards.scheduling.ZonedDateRange;
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
import squareup.cash.cashliteflow.CashLiteDefaultBankAccount;

/* loaded from: classes8.dex */
public final class PoolsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PoolsConfig> CREATOR;
    public final String nux_activity_img_url;
    public final String nux_details_img_url;
    public final String share_background_img_url;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String nux_activity_img_url;
        public String nux_details_img_url;
        public String share_background_img_url;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new PoolsConfig(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 1:
                    return new BankingConfig.RecurringDepositsDdaUpsell(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 2:
                    return new BankingConfig.Strings(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 3:
                    return new ClaimablePayment(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 4:
                    return new HumanConfirmationRequest(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 5:
                    return new PlaidLinkTokenCreateResponse(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 6:
                    return new GiftCardRenderData.GiftCardType(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 7:
                    return new SelectBoostElement(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 8:
                    return new SquarePayrollRenderData(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 9:
                    return new Loan.BnplData(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 10:
                    return new LoyaltyUnit(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 11:
                    return new UiItemizedReceipt(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                case 12:
                    return new ZonedDateRange(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
                default:
                    return new CashLiteDefaultBankAccount(this.nux_details_img_url, this.nux_activity_img_url, this.share_background_img_url, buildUnknownFields());
            }
        }
    }

    static {
        PoolsConfig$Companion$ADAPTER$1 poolsConfig$Companion$ADAPTER$1 = new PoolsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PoolsConfig.class), "type.googleapis.com/squareup.franklin.common.PoolsConfig", Syntax.PROTO_2, null, "squareup/franklin/common/pools_config.proto");
        ADAPTER = poolsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(poolsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsConfig(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.nux_details_img_url = str;
        this.nux_activity_img_url = str2;
        this.share_background_img_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoolsConfig)) {
            return false;
        }
        PoolsConfig poolsConfig = (PoolsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), poolsConfig.unknownFields()) && Intrinsics.areEqual(this.nux_details_img_url, poolsConfig.nux_details_img_url) && Intrinsics.areEqual(this.nux_activity_img_url, poolsConfig.nux_activity_img_url) && Intrinsics.areEqual(this.share_background_img_url, poolsConfig.share_background_img_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.nux_details_img_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.nux_activity_img_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.share_background_img_url;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.nux_details_img_url = this.nux_details_img_url;
        builder.nux_activity_img_url = this.nux_activity_img_url;
        builder.share_background_img_url = this.share_background_img_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.nux_details_img_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "nux_details_img_url=", arrayList);
        }
        String str2 = this.nux_activity_img_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "nux_activity_img_url=", arrayList);
        }
        String str3 = this.share_background_img_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "share_background_img_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PoolsConfig{", "}", 0, null, null, 56);
    }
}
