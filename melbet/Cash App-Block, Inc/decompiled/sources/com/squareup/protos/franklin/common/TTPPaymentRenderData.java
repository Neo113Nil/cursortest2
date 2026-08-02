package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiPublicProfile;
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
public final class TTPPaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TTPPaymentRenderData> CREATOR;
    public final String application_id;
    public final String auth_code;
    public final String display_id;
    public final Status status;
    public final Money ttp_customer_payment_money;
    public final Money ttp_customer_refund_money;

    public enum Status implements WireEnum {
        PENDING(1),
        COMPLETED(2),
        FAILED(3),
        PARTIALLY_REFUNDED(4),
        REFUNDED(5),
        REFUND_FAILED(6);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final TTPPaymentRenderData$Status$Companion$ADAPTER$1 ADAPTER = new TTPPaymentRenderData$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return PENDING;
                case 2:
                    return COMPLETED;
                case 3:
                    return FAILED;
                case 4:
                    return PARTIALLY_REFUNDED;
                case 5:
                    return REFUNDED;
                case 6:
                    return REFUND_FAILED;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TTPPaymentRenderData$Companion$ADAPTER$1 tTPPaymentRenderData$Companion$ADAPTER$1 = new TTPPaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TTPPaymentRenderData.class), "type.googleapis.com/squareup.franklin.TTPPaymentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = tTPPaymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tTPPaymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTPPaymentRenderData(Status status, Money money, Money money2, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.ttp_customer_payment_money = money;
        this.ttp_customer_refund_money = money2;
        this.display_id = str;
        this.auth_code = str2;
        this.application_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TTPPaymentRenderData)) {
            return false;
        }
        TTPPaymentRenderData tTPPaymentRenderData = (TTPPaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), tTPPaymentRenderData.unknownFields()) && this.status == tTPPaymentRenderData.status && Intrinsics.areEqual(this.ttp_customer_payment_money, tTPPaymentRenderData.ttp_customer_payment_money) && Intrinsics.areEqual(this.ttp_customer_refund_money, tTPPaymentRenderData.ttp_customer_refund_money) && Intrinsics.areEqual(this.display_id, tTPPaymentRenderData.display_id) && Intrinsics.areEqual(this.auth_code, tTPPaymentRenderData.auth_code) && Intrinsics.areEqual(this.application_id, tTPPaymentRenderData.application_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        Money money = this.ttp_customer_payment_money;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.ttp_customer_refund_money;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str = this.display_id;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.auth_code;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.application_id;
        int hashCode7 = hashCode6 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(10, false);
        builder.full_cashtag = this.status;
        builder.cashtag_url_enabled = this.ttp_customer_payment_money;
        builder.is_verified_account = this.ttp_customer_refund_money;
        builder.full_name = this.display_id;
        builder.photo_url = this.auth_code;
        builder.synopsis = this.application_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Money money = this.ttp_customer_payment_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("ttp_customer_payment_money=", money, arrayList);
        }
        Money money2 = this.ttp_customer_refund_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("ttp_customer_refund_money=", money2, arrayList);
        }
        String str = this.display_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_id=", arrayList);
        }
        String str2 = this.auth_code;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "auth_code=", arrayList);
        }
        String str3 = this.application_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "application_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TTPPaymentRenderData{", "}", 0, null, null, 56);
    }
}
