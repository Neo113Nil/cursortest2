package com.squareup.protos.cash.local.client.app.v1.card;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
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

/* loaded from: classes7.dex */
public final class BrandCardDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BrandCardDetails> CREATOR;
    public final String attribution_key;
    public final String brand_token;
    public final String location_token;

    static {
        BrandCardDetails$Companion$ADAPTER$1 brandCardDetails$Companion$ADAPTER$1 = new BrandCardDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrandCardDetails.class), "type.googleapis.com/squareup.cash.local.client.app.v1.card.BrandCardDetails", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/card/local_card.proto");
        ADAPTER = brandCardDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(brandCardDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandCardDetails(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.brand_token = str;
        this.location_token = str2;
        this.attribution_key = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BrandCardDetails)) {
            return false;
        }
        BrandCardDetails brandCardDetails = (BrandCardDetails) obj;
        return Intrinsics.areEqual(unknownFields(), brandCardDetails.unknownFields()) && Intrinsics.areEqual(this.brand_token, brandCardDetails.brand_token) && Intrinsics.areEqual(this.location_token, brandCardDetails.location_token) && Intrinsics.areEqual(this.attribution_key, brandCardDetails.attribution_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.brand_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.location_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.attribution_key;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(14);
        builder.contact_support_url = this.brand_token;
        builder.privacy_policy_url = this.location_token;
        builder.terms_of_service_url = this.attribution_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.brand_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
        }
        String str2 = this.location_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
        }
        String str3 = this.attribution_key;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "attribution_key=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrandCardDetails{", "}", 0, null, null, 56);
    }
}
