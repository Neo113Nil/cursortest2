package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.common.Money;
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
public final class CashAppPayLaterMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayLaterMetadata> CREATOR;
    public final String affiliate_url;
    public final Money cart_minimum;
    public final String cash_app_pay_brand_id;
    public final String cash_pay_brand_bizzy_base_token;
    public final Boolean is_card_on_file;
    public final List lifestyle_images;

    static {
        CashAppPayLaterMetadata$Companion$ADAPTER$1 cashAppPayLaterMetadata$Companion$ADAPTER$1 = new CashAppPayLaterMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayLaterMetadata.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.CashAppPayLaterMetadata", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/BusinessProfile.proto");
        ADAPTER = cashAppPayLaterMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayLaterMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayLaterMetadata(String str, List list, String str2, String str3, Boolean bool, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.affiliate_url = str;
        this.cash_pay_brand_bizzy_base_token = str2;
        this.cash_app_pay_brand_id = str3;
        this.is_card_on_file = bool;
        this.cart_minimum = money;
        this.lifestyle_images = TransactorKt.immutableCopyOf("lifestyle_images", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayLaterMetadata)) {
            return false;
        }
        CashAppPayLaterMetadata cashAppPayLaterMetadata = (CashAppPayLaterMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayLaterMetadata.unknownFields()) && Intrinsics.areEqual(this.affiliate_url, cashAppPayLaterMetadata.affiliate_url) && Intrinsics.areEqual(this.lifestyle_images, cashAppPayLaterMetadata.lifestyle_images) && Intrinsics.areEqual(this.cash_pay_brand_bizzy_base_token, cashAppPayLaterMetadata.cash_pay_brand_bizzy_base_token) && Intrinsics.areEqual(this.cash_app_pay_brand_id, cashAppPayLaterMetadata.cash_app_pay_brand_id) && Intrinsics.areEqual(this.is_card_on_file, cashAppPayLaterMetadata.is_card_on_file) && Intrinsics.areEqual(this.cart_minimum, cashAppPayLaterMetadata.cart_minimum);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.affiliate_url;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.lifestyle_images);
        String str2 = this.cash_pay_brand_bizzy_base_token;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.cash_app_pay_brand_id;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.is_card_on_file;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money = this.cart_minimum;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(21, false);
        builder.description = this.affiliate_url;
        builder.category = this.lifestyle_images;
        builder.field = this.cash_pay_brand_bizzy_base_token;
        builder.code = this.cash_app_pay_brand_id;
        builder.retryable = this.is_card_on_file;
        builder.metadata = this.cart_minimum;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.affiliate_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "affiliate_url=", arrayList);
        }
        List list = this.lifestyle_images;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("lifestyle_images=", arrayList, list);
        }
        String str2 = this.cash_pay_brand_bizzy_base_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cash_pay_brand_bizzy_base_token=", arrayList);
        }
        String str3 = this.cash_app_pay_brand_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cash_app_pay_brand_id=", arrayList);
        }
        Boolean bool = this.is_card_on_file;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_card_on_file=", bool, arrayList);
        }
        Money money = this.cart_minimum;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("cart_minimum=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayLaterMetadata{", "}", 0, null, null, 56);
    }
}
