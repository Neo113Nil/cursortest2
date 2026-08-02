package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.ui.UiDda;
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

/* loaded from: classes8.dex */
public final class UiJurisdictionConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiJurisdictionConfig> CREATOR;
    public final List available_p2p_currencies;
    public final List available_p2p_target_regions;
    public final Country country_code;
    public final CurrencyCode default_currency;

    static {
        UiJurisdictionConfig$Companion$ADAPTER$1 uiJurisdictionConfig$Companion$ADAPTER$1 = new UiJurisdictionConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiJurisdictionConfig.class), "type.googleapis.com/squareup.franklin.ui.UiJurisdictionConfig", Syntax.PROTO_2, null, "squareup/franklin/ui/jurisdiction_config.proto");
        ADAPTER = uiJurisdictionConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiJurisdictionConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiJurisdictionConfig(CurrencyCode currencyCode, Country country, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.default_currency = currencyCode;
        this.country_code = country;
        this.available_p2p_currencies = TransactorKt.immutableCopyOf("available_p2p_currencies", list);
        this.available_p2p_target_regions = TransactorKt.immutableCopyOf("available_p2p_target_regions", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiJurisdictionConfig)) {
            return false;
        }
        UiJurisdictionConfig uiJurisdictionConfig = (UiJurisdictionConfig) obj;
        return Intrinsics.areEqual(unknownFields(), uiJurisdictionConfig.unknownFields()) && this.default_currency == uiJurisdictionConfig.default_currency && this.country_code == uiJurisdictionConfig.country_code && Intrinsics.areEqual(this.available_p2p_currencies, uiJurisdictionConfig.available_p2p_currencies) && Intrinsics.areEqual(this.available_p2p_target_regions, uiJurisdictionConfig.available_p2p_target_regions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CurrencyCode currencyCode = this.default_currency;
        int hashCode2 = (hashCode + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        Country country = this.country_code;
        int hashCode3 = this.available_p2p_target_regions.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (country != null ? country.hashCode() : 0)) * 37, 37, this.available_p2p_currencies);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(11);
        builder.account = this.default_currency;
        builder.enabled = this.country_code;
        builder.button = this.available_p2p_currencies;
        builder.dda_form = this.available_p2p_target_regions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CurrencyCode currencyCode = this.default_currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("default_currency=", currencyCode, arrayList);
        }
        Country country = this.country_code;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country_code=", country, arrayList);
        }
        List list = this.available_p2p_currencies;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_p2p_currencies=", arrayList, list);
        }
        List list2 = this.available_p2p_target_regions;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_p2p_target_regions=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiJurisdictionConfig{", "}", 0, null, null, 56);
    }
}
