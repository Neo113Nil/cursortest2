package com.squareup.protos.franklin.onboarding;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashLocalOnboardingDeepLinkPayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashLocalOnboardingDeepLinkPayload> CREATOR;
    public final String brand_token;
    public final Long expires_at;
    public final String location_token;
    public final Source source;
    public final String tender_token;

    public enum Source implements WireEnum {
        UNKNOWN(0),
        POS(1),
        RECEIPT_DIGITAL(2),
        RECEIPT_PRINTED(3),
        WEB(4);

        public static final CashLocalOnboardingDeepLinkPayload$Source$Companion$ADAPTER$1 ADAPTER;
        public static final Trigger.Companion Companion;
        public final int value;

        static {
            Source source = UNKNOWN;
            Companion = new Trigger.Companion();
            ADAPTER = new CashLocalOnboardingDeepLinkPayload$Source$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Source.class), Syntax.PROTO_2, source);
        }

        Source(int i) {
            this.value = i;
        }

        public static final Source fromValue(int i) {
            Companion.getClass();
            return Trigger.Companion.m3954fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashLocalOnboardingDeepLinkPayload$Companion$ADAPTER$1 cashLocalOnboardingDeepLinkPayload$Companion$ADAPTER$1 = new CashLocalOnboardingDeepLinkPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashLocalOnboardingDeepLinkPayload.class), "type.googleapis.com/squareup.franklin.onboarding.CashLocalOnboardingDeepLinkPayload", Syntax.PROTO_2, null, "squareup/franklin/onboarding.proto");
        ADAPTER = cashLocalOnboardingDeepLinkPayload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashLocalOnboardingDeepLinkPayload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLocalOnboardingDeepLinkPayload(String str, String str2, Source source, String str3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.brand_token = str;
        this.location_token = str2;
        this.source = source;
        this.tender_token = str3;
        this.expires_at = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashLocalOnboardingDeepLinkPayload)) {
            return false;
        }
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload = (CashLocalOnboardingDeepLinkPayload) obj;
        return Intrinsics.areEqual(unknownFields(), cashLocalOnboardingDeepLinkPayload.unknownFields()) && Intrinsics.areEqual(this.brand_token, cashLocalOnboardingDeepLinkPayload.brand_token) && Intrinsics.areEqual(this.location_token, cashLocalOnboardingDeepLinkPayload.location_token) && this.source == cashLocalOnboardingDeepLinkPayload.source && Intrinsics.areEqual(this.tender_token, cashLocalOnboardingDeepLinkPayload.tender_token) && Intrinsics.areEqual(this.expires_at, cashLocalOnboardingDeepLinkPayload.expires_at);
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
        Source source = this.source;
        int hashCode4 = (hashCode3 + (source != null ? source.hashCode() : 0)) * 37;
        String str3 = this.tender_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.expires_at;
        int hashCode6 = hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(17, false);
        builder.alias = this.brand_token;
        builder.verified = this.location_token;
        builder.version = this.source;
        builder.display_date = this.tender_token;
        builder.expires_at = this.expires_at;
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
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        String str3 = this.tender_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "tender_token=", arrayList);
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLocalOnboardingDeepLinkPayload{", "}", 0, null, null, 56);
    }
}
