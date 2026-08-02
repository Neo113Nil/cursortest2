package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.savings.action.ClientRouteTemplate;

/* loaded from: classes8.dex */
public final class CryptocurrencyConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptocurrencyConfig> CREATOR;
    public final String btc_welcome_message;
    public final String dismiss_button_text;
    public final String learn_about_btc_button_text;
    public final String learn_about_btc_url;
    public final Long minimum_withdrawal_limit_sats;

    static {
        CryptocurrencyConfig$Companion$ADAPTER$1 cryptocurrencyConfig$Companion$ADAPTER$1 = new CryptocurrencyConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptocurrencyConfig.class), "type.googleapis.com/squareup.franklin.common.CryptocurrencyConfig", Syntax.PROTO_2, null, "squareup/franklin/common/cryptocurrency_config.proto");
        ADAPTER = cryptocurrencyConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptocurrencyConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptocurrencyConfig(Long l, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.btc_welcome_message = str;
        this.learn_about_btc_button_text = str2;
        this.learn_about_btc_url = str3;
        this.dismiss_button_text = str4;
        this.minimum_withdrawal_limit_sats = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptocurrencyConfig)) {
            return false;
        }
        CryptocurrencyConfig cryptocurrencyConfig = (CryptocurrencyConfig) obj;
        return Intrinsics.areEqual(unknownFields(), cryptocurrencyConfig.unknownFields()) && Intrinsics.areEqual(this.btc_welcome_message, cryptocurrencyConfig.btc_welcome_message) && Intrinsics.areEqual(this.learn_about_btc_button_text, cryptocurrencyConfig.learn_about_btc_button_text) && Intrinsics.areEqual(this.learn_about_btc_url, cryptocurrencyConfig.learn_about_btc_url) && Intrinsics.areEqual(this.dismiss_button_text, cryptocurrencyConfig.dismiss_button_text) && Intrinsics.areEqual(this.minimum_withdrawal_limit_sats, cryptocurrencyConfig.minimum_withdrawal_limit_sats);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.btc_welcome_message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.learn_about_btc_button_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.learn_about_btc_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.dismiss_button_text;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.minimum_withdrawal_limit_sats;
        int hashCode6 = hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientRouteTemplate.Builder builder = new ClientRouteTemplate.Builder(1);
        builder.f1644android = this.btc_welcome_message;
        builder.ios = this.learn_about_btc_button_text;
        builder.web = this.learn_about_btc_url;
        builder.zero_arg_verbatim_string = this.dismiss_button_text;
        builder.argument_count = this.minimum_withdrawal_limit_sats;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.btc_welcome_message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "btc_welcome_message=", arrayList);
        }
        String str2 = this.learn_about_btc_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "learn_about_btc_button_text=", arrayList);
        }
        String str3 = this.learn_about_btc_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "learn_about_btc_url=", arrayList);
        }
        String str4 = this.dismiss_button_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "dismiss_button_text=", arrayList);
        }
        Long l = this.minimum_withdrawal_limit_sats;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("minimum_withdrawal_limit_sats=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptocurrencyConfig{", "}", 0, null, null, 56);
    }
}
