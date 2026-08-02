package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
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
public final class LocalCashBackOfferPercentage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCashBackOfferPercentage> CREATOR;
    public final Integer basis_points;
    public final String fallback_text;

    static {
        LocalCashBackOfferPercentage$Companion$ADAPTER$1 localCashBackOfferPercentage$Companion$ADAPTER$1 = new LocalCashBackOfferPercentage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashBackOfferPercentage.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashBackOfferPercentage", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
        ADAPTER = localCashBackOfferPercentage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashBackOfferPercentage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCashBackOfferPercentage(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.basis_points = num;
        this.fallback_text = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCashBackOfferPercentage)) {
            return false;
        }
        LocalCashBackOfferPercentage localCashBackOfferPercentage = (LocalCashBackOfferPercentage) obj;
        return Intrinsics.areEqual(unknownFields(), localCashBackOfferPercentage.unknownFields()) && Intrinsics.areEqual(this.basis_points, localCashBackOfferPercentage.basis_points) && Intrinsics.areEqual(this.fallback_text, localCashBackOfferPercentage.fallback_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.basis_points;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str = this.fallback_text;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalLoyaltyAccount.Builder builder = new LocalLoyaltyAccount.Builder(1);
        builder.balance = this.basis_points;
        builder.token = this.fallback_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.basis_points;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("basis_points=", num, arrayList);
        }
        String str = this.fallback_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fallback_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashBackOfferPercentage{", "}", 0, null, null, 56);
    }
}
