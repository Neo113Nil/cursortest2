package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.messagingplatformcommon.common.ProductType;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
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
public final class InAppMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InAppMessage> CREATOR;
    public final String campaign_token;
    public final String idempotence_key;
    public final Boolean is_badged;
    public final String locale;
    public final zzjx message;
    public final Placement placement;
    public final ProductType product_type;
    public final List product_types;
    public final String template_token;
    public final Long template_version;

    static {
        InAppMessage$Companion$ADAPTER$1 inAppMessage$Companion$ADAPTER$1 = new InAppMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InAppMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.ondemand.InAppMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/ondemand/InAppMessage.proto");
        ADAPTER = inAppMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessage(Placement placement, zzjx zzjxVar, Boolean bool, String str, String str2, Long l, String str3, ProductType productType, List list, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.placement = placement;
        this.message = zzjxVar;
        this.is_badged = bool;
        this.campaign_token = str;
        this.template_token = str2;
        this.template_version = l;
        this.idempotence_key = str3;
        this.product_type = productType;
        this.locale = str4;
        this.product_types = TransactorKt.immutableCopyOf("product_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InAppMessage)) {
            return false;
        }
        InAppMessage inAppMessage = (InAppMessage) obj;
        return Intrinsics.areEqual(unknownFields(), inAppMessage.unknownFields()) && this.placement == inAppMessage.placement && Intrinsics.areEqual(this.message, inAppMessage.message) && Intrinsics.areEqual(this.is_badged, inAppMessage.is_badged) && Intrinsics.areEqual(this.campaign_token, inAppMessage.campaign_token) && Intrinsics.areEqual(this.template_token, inAppMessage.template_token) && Intrinsics.areEqual(this.template_version, inAppMessage.template_version) && Intrinsics.areEqual(this.idempotence_key, inAppMessage.idempotence_key) && this.product_type == inAppMessage.product_type && Intrinsics.areEqual(this.product_types, inAppMessage.product_types) && Intrinsics.areEqual(this.locale, inAppMessage.locale);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement != null ? placement.hashCode() : 0)) * 37;
        zzjx zzjxVar = this.message;
        int hashCode3 = (hashCode2 + (zzjxVar != null ? zzjxVar.hashCode() : 0)) * 37;
        Boolean bool = this.is_badged;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.campaign_token;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.template_token;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.template_version;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str3 = this.idempotence_key;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ProductType productType = this.product_type;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (productType != null ? productType.hashCode() : 0)) * 37, 37, this.product_types);
        String str4 = this.locale;
        int hashCode9 = m + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(10);
        builder.request_context = this.placement;
        builder.source = this.message;
        builder.target = this.is_badged;
        builder.external_id = this.campaign_token;
        builder.passcode_token = this.template_token;
        builder.amount = this.template_version;
        builder.external_client_transfer_token = this.idempotence_key;
        builder.call_context = this.product_type;
        builder.forwarded_call_context = this.product_types;
        builder.client_verified_digital_wallet = this.locale;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        zzjx zzjxVar = this.message;
        if (zzjxVar != null) {
            arrayList.add("message=" + zzjxVar);
        }
        Boolean bool = this.is_badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
        }
        String str = this.campaign_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "campaign_token=", arrayList);
        }
        String str2 = this.template_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "template_token=", arrayList);
        }
        Long l = this.template_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("template_version=", l, arrayList);
        }
        String str3 = this.idempotence_key;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "idempotence_key=", arrayList);
        }
        ProductType productType = this.product_type;
        if (productType != null) {
            arrayList.add("product_type=" + productType);
        }
        List list = this.product_types;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("product_types=", arrayList, list);
        }
        String str4 = this.locale;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "locale=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InAppMessage{", "}", 0, null, null, 56);
    }
}
