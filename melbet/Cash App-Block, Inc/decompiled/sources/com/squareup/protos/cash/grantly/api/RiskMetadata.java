package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
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
public final class RiskMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RiskMetadata> CREATOR;
    public final String browser_interaction_token;

    static {
        RiskMetadata$Companion$ADAPTER$1 riskMetadata$Companion$ADAPTER$1 = new RiskMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RiskMetadata.class), "type.googleapis.com/squareup.cash.grantly.api.RiskMetadata", Syntax.PROTO_2, null, "squareup/cash/grantly/api/risk_metadata.proto");
        ADAPTER = riskMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(riskMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskMetadata(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.browser_interaction_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskMetadata)) {
            return false;
        }
        RiskMetadata riskMetadata = (RiskMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), riskMetadata.unknownFields()) && Intrinsics.areEqual(this.browser_interaction_token, riskMetadata.browser_interaction_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.browser_interaction_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(16);
        builder.favorite_customer_token = this.browser_interaction_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.browser_interaction_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "browser_interaction_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RiskMetadata{", "}", 0, null, null, 56);
    }
}
