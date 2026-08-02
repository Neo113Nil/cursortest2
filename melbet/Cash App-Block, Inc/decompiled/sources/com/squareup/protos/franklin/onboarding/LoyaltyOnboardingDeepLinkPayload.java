package com.squareup.protos.franklin.onboarding;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class LoyaltyOnboardingDeepLinkPayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoyaltyOnboardingDeepLinkPayload> CREATOR;
    public final String merchant_token;

    static {
        LoyaltyOnboardingDeepLinkPayload$Companion$ADAPTER$1 loyaltyOnboardingDeepLinkPayload$Companion$ADAPTER$1 = new LoyaltyOnboardingDeepLinkPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyOnboardingDeepLinkPayload.class), "type.googleapis.com/squareup.franklin.onboarding.LoyaltyOnboardingDeepLinkPayload", Syntax.PROTO_2, null, "squareup/franklin/onboarding.proto");
        ADAPTER = loyaltyOnboardingDeepLinkPayload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyOnboardingDeepLinkPayload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyOnboardingDeepLinkPayload(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyOnboardingDeepLinkPayload)) {
            return false;
        }
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload = (LoyaltyOnboardingDeepLinkPayload) obj;
        return Intrinsics.areEqual(unknownFields(), loyaltyOnboardingDeepLinkPayload.unknownFields()) && Intrinsics.areEqual(this.merchant_token, loyaltyOnboardingDeepLinkPayload.merchant_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(23);
        builder.client_route = this.merchant_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyOnboardingDeepLinkPayload{", "}", 0, null, null, 56);
    }
}
