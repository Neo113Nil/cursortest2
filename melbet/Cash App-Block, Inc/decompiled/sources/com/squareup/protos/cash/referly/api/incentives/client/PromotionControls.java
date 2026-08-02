package com.squareup.protos.cash.referly.api.incentives.client;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
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
public final class PromotionControls extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PromotionControls> CREATOR;
    public final String client_route_for_enablement;
    public final Boolean enabled;
    public final Boolean show_toggle;

    static {
        PromotionControls$Companion$ADAPTER$1 promotionControls$Companion$ADAPTER$1 = new PromotionControls$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PromotionControls.class), "type.googleapis.com/squareup.cash.referly.api.incentives.client.PromotionControls", Syntax.PROTO_2, null, "squareup/cash/referly/api/incentives/client/PromotionControls.proto");
        ADAPTER = promotionControls$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(promotionControls$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionControls(String str, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_route_for_enablement = str;
        this.enabled = bool;
        this.show_toggle = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromotionControls)) {
            return false;
        }
        PromotionControls promotionControls = (PromotionControls) obj;
        return Intrinsics.areEqual(unknownFields(), promotionControls.unknownFields()) && Intrinsics.areEqual(this.client_route_for_enablement, promotionControls.client_route_for_enablement) && Intrinsics.areEqual(this.enabled, promotionControls.enabled) && Intrinsics.areEqual(this.show_toggle, promotionControls.show_toggle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.client_route_for_enablement;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.show_toggle;
        int hashCode4 = hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(14);
        builder.modules = this.client_route_for_enablement;
        builder.overflow_modules = this.enabled;
        builder.card_home_actions = this.show_toggle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.client_route_for_enablement;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_for_enablement=", arrayList);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        Boolean bool2 = this.show_toggle;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_toggle=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromotionControls{", "}", 0, null, null, 56);
    }
}
