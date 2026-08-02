package com.squareup.protos.cash.referly.api.incentives.client;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.document.Document;
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
public final class ActivePromotion extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivePromotion> CREATOR;
    public final String action_url;
    public final String campaign_token;
    public final String campaign_variant_token;
    public final Icon icon;
    public final String subtitle;
    public final String title;

    static {
        ActivePromotion$Companion$ADAPTER$1 activePromotion$Companion$ADAPTER$1 = new ActivePromotion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivePromotion.class), "type.googleapis.com/squareup.cash.referly.api.incentives.client.ActivePromotion", Syntax.PROTO_2, null, "squareup/cash/referly/api/incentives/client/GetPromotionsHomeDataAPI.proto");
        ADAPTER = activePromotion$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activePromotion$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePromotion(Icon icon, String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.title = str;
        this.subtitle = str2;
        this.action_url = str3;
        this.campaign_token = str4;
        this.campaign_variant_token = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivePromotion)) {
            return false;
        }
        ActivePromotion activePromotion = (ActivePromotion) obj;
        return Intrinsics.areEqual(unknownFields(), activePromotion.unknownFields()) && Intrinsics.areEqual(this.icon, activePromotion.icon) && Intrinsics.areEqual(this.title, activePromotion.title) && Intrinsics.areEqual(this.subtitle, activePromotion.subtitle) && Intrinsics.areEqual(this.action_url, activePromotion.action_url) && Intrinsics.areEqual(this.campaign_token, activePromotion.campaign_token) && Intrinsics.areEqual(this.campaign_variant_token, activePromotion.campaign_variant_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.action_url;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.campaign_token;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.campaign_variant_token;
        int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(2, false);
        builder.document_date = this.icon;
        builder.category = this.title;
        builder.token = this.subtitle;
        builder.title = this.action_url;
        builder.url = this.campaign_token;
        builder.owner_token = this.campaign_variant_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        String str3 = this.action_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "action_url=", arrayList);
        }
        String str4 = this.campaign_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "campaign_token=", arrayList);
        }
        String str5 = this.campaign_variant_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "campaign_variant_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivePromotion{", "}", 0, null, null, 56);
    }
}
