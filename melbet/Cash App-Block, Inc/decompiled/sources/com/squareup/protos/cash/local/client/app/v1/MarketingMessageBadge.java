package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
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
public final class MarketingMessageBadge extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketingMessageBadge> CREATOR;
    public final String text;
    public final Boolean viewed;

    static {
        MarketingMessageBadge$Companion$ADAPTER$1 marketingMessageBadge$Companion$ADAPTER$1 = new MarketingMessageBadge$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketingMessageBadge.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketingMessageBadge", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = marketingMessageBadge$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketingMessageBadge$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingMessageBadge(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.viewed = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketingMessageBadge)) {
            return false;
        }
        MarketingMessageBadge marketingMessageBadge = (MarketingMessageBadge) obj;
        return Intrinsics.areEqual(unknownFields(), marketingMessageBadge.unknownFields()) && Intrinsics.areEqual(this.text, marketingMessageBadge.text) && Intrinsics.areEqual(this.viewed, marketingMessageBadge.viewed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.viewed;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(6);
        builder.main_text = this.text;
        builder.show_payments = this.viewed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        Boolean bool = this.viewed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("viewed=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketingMessageBadge{", "}", 0, null, null, 56);
    }
}
