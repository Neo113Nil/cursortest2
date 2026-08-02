package com.squareup.protos.merchants.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.giftly.GiftCard;
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
public final class UserLocale extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UserLocale> CREATOR;
    public final Country country_code;
    public final CurrencyCode currency_code;
    public final String language_code;

    static {
        UserLocale$Companion$ADAPTER$1 userLocale$Companion$ADAPTER$1 = new UserLocale$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UserLocale.class), "type.googleapis.com/squareup.merchants.api.UserLocale", Syntax.PROTO_2, null, "squareup/merchants/api.proto");
        ADAPTER = userLocale$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(userLocale$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLocale(Country country, String str, CurrencyCode currencyCode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.country_code = country;
        this.language_code = str;
        this.currency_code = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLocale)) {
            return false;
        }
        UserLocale userLocale = (UserLocale) obj;
        return Intrinsics.areEqual(unknownFields(), userLocale.unknownFields()) && this.country_code == userLocale.country_code && Intrinsics.areEqual(this.language_code, userLocale.language_code) && this.currency_code == userLocale.currency_code;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Country country = this.country_code;
        int hashCode2 = (hashCode + (country != null ? country.hashCode() : 0)) * 37;
        String str = this.language_code;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        CurrencyCode currencyCode = this.currency_code;
        int hashCode4 = hashCode3 + (currencyCode != null ? currencyCode.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(26);
        builder.localizable_label = this.country_code;
        builder.label = this.language_code;
        builder.client_scenario = this.currency_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Country country = this.country_code;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country_code=", country, arrayList);
        }
        String str = this.language_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "language_code=", arrayList);
        }
        CurrencyCode currencyCode = this.currency_code;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency_code=", currencyCode, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserLocale{", "}", 0, null, null, 56);
    }
}
