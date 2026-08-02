package com.squareup.protos.cash.cashface.delegates;

import android.os.Parcelable;
import app.cash.local.sharedui.LocalComposeUiKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.protos.cash.cashface.api.Banner;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.protos.cash.cashregistrar.Account;
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

/* loaded from: classes7.dex */
public final class ContextWrapper extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContextWrapper> CREATOR;
    public final ByteString context_data;
    public final String merchant_flow_token;
    public final Origin origin;
    public final String profile_context_type;
    public final String referrer_flow_token;

    public final class Origin extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Origin> CREATOR;
        public final LocalComposeUiKt origin;

        /* renamed from: type, reason: collision with root package name */
        public final OriginType f1248type;

        public final class AccountLink extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<AccountLink> CREATOR;
            public final String account_link_type;

            static {
                ContextWrapper$Origin$AccountLink$Companion$ADAPTER$1 contextWrapper$Origin$AccountLink$Companion$ADAPTER$1 = new ContextWrapper$Origin$AccountLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AccountLink.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper.Origin.AccountLink", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
                ADAPTER = contextWrapper$Origin$AccountLink$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Origin$AccountLink$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountLink(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.account_link_type = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AccountLink)) {
                    return false;
                }
                AccountLink accountLink = (AccountLink) obj;
                return Intrinsics.areEqual(unknownFields(), accountLink.unknownFields()) && Intrinsics.areEqual(this.account_link_type, accountLink.account_link_type);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.account_link_type;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Banner.Builder builder = new Banner.Builder(7);
                builder.banner_color = this.account_link_type;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.account_link_type;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_link_type=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "AccountLink{", "}", 0, null, null, 56);
            }
        }

        public final class ActivityTab extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ActivityTab> CREATOR;

            static {
                ContextWrapper$Origin$ActivityTab$Companion$ADAPTER$1 contextWrapper$Origin$ActivityTab$Companion$ADAPTER$1 = new ContextWrapper$Origin$ActivityTab$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityTab.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper.Origin.ActivityTab", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
                ADAPTER = contextWrapper$Origin$ActivityTab$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Origin$ActivityTab$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityTab(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof ActivityTab) && Intrinsics.areEqual(unknownFields(), ((ActivityTab) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Divider.Builder builder = new Divider.Builder(28);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "ActivityTab{}";
            }
        }

        public final class BillsAndSubscriptions extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BillsAndSubscriptions> CREATOR;

            static {
                ContextWrapper$Origin$BillsAndSubscriptions$Companion$ADAPTER$1 contextWrapper$Origin$BillsAndSubscriptions$Companion$ADAPTER$1 = new ContextWrapper$Origin$BillsAndSubscriptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BillsAndSubscriptions.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper.Origin.BillsAndSubscriptions", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
                ADAPTER = contextWrapper$Origin$BillsAndSubscriptions$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Origin$BillsAndSubscriptions$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BillsAndSubscriptions(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof BillsAndSubscriptions) && Intrinsics.areEqual(unknownFields(), ((BillsAndSubscriptions) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Divider.Builder builder = new Divider.Builder(29);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "BillsAndSubscriptions{}";
            }
        }

        public final class BlockedBusinesses extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BlockedBusinesses> CREATOR;

            static {
                ContextWrapper$Origin$BlockedBusinesses$Companion$ADAPTER$1 contextWrapper$Origin$BlockedBusinesses$Companion$ADAPTER$1 = new ContextWrapper$Origin$BlockedBusinesses$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlockedBusinesses.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper.Origin.BlockedBusinesses", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
                ADAPTER = contextWrapper$Origin$BlockedBusinesses$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Origin$BlockedBusinesses$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BlockedBusinesses(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof BlockedBusinesses) && Intrinsics.areEqual(unknownFields(), ((BlockedBusinesses) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Empty.Builder builder = new Empty.Builder(1);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "BlockedBusinesses{}";
            }
        }

        public final class DiscoverSearch extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DiscoverSearch> CREATOR;

            static {
                ContextWrapper$Origin$DiscoverSearch$Companion$ADAPTER$1 contextWrapper$Origin$DiscoverSearch$Companion$ADAPTER$1 = new ContextWrapper$Origin$DiscoverSearch$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DiscoverSearch.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper.Origin.DiscoverSearch", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
                ADAPTER = contextWrapper$Origin$DiscoverSearch$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Origin$DiscoverSearch$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DiscoverSearch(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof DiscoverSearch) && Intrinsics.areEqual(unknownFields(), ((DiscoverSearch) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Empty.Builder builder = new Empty.Builder(2);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "DiscoverSearch{}";
            }
        }

        public final class DiscoverTab extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DiscoverTab> CREATOR;

            static {
                ContextWrapper$Origin$DiscoverTab$Companion$ADAPTER$1 contextWrapper$Origin$DiscoverTab$Companion$ADAPTER$1 = new ContextWrapper$Origin$DiscoverTab$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DiscoverTab.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper.Origin.DiscoverTab", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
                ADAPTER = contextWrapper$Origin$DiscoverTab$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Origin$DiscoverTab$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DiscoverTab(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof DiscoverTab) && Intrinsics.areEqual(unknownFields(), ((DiscoverTab) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Empty.Builder builder = new Empty.Builder(3);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "DiscoverTab{}";
            }
        }

        public final class OfferDeepLink extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OfferDeepLink> CREATOR;

            static {
                ContextWrapper$Origin$OfferDeepLink$Companion$ADAPTER$1 contextWrapper$Origin$OfferDeepLink$Companion$ADAPTER$1 = new ContextWrapper$Origin$OfferDeepLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferDeepLink.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper.Origin.OfferDeepLink", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
                ADAPTER = contextWrapper$Origin$OfferDeepLink$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Origin$OfferDeepLink$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OfferDeepLink(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof OfferDeepLink) && Intrinsics.areEqual(unknownFields(), ((OfferDeepLink) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Empty.Builder builder = new Empty.Builder(4);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "OfferDeepLink{}";
            }
        }

        /* loaded from: classes6.dex */
        public enum OriginType implements WireEnum {
            ACTIVITY_TAB(1),
            DISCOVER_TAB(2),
            ACCOUNT_LINK(3),
            OFFER_DEEP_LINK(4),
            DISCOVER_SEARCH(5),
            MERCHANT_PROFILE(6),
            BLOCKED_BUSINESSES(7),
            GLOBAL_SEARCH(8),
            BILLS_AND_SUBSCRIPTIONS(9);

            public final int value;
            public static final WorkCookieJar Companion = new WorkCookieJar(26);
            public static final ContextWrapper$Origin$OriginType$Companion$ADAPTER$1 ADAPTER = new ContextWrapper$Origin$OriginType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OriginType.class), Syntax.PROTO_2, null);

            OriginType(int i) {
                this.value = i;
            }

            public static final OriginType fromValue(int i) {
                Companion.getClass();
                return WorkCookieJar.m3800fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            ContextWrapper$Origin$Companion$ADAPTER$1 contextWrapper$Origin$Companion$ADAPTER$1 = new ContextWrapper$Origin$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Origin.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper.Origin", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
            ADAPTER = contextWrapper$Origin$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Origin$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Origin(OriginType originType, LocalComposeUiKt localComposeUiKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1248type = originType;
            this.origin = localComposeUiKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Origin)) {
                return false;
            }
            Origin origin = (Origin) obj;
            return Intrinsics.areEqual(unknownFields(), origin.unknownFields()) && this.f1248type == origin.f1248type && Intrinsics.areEqual(this.origin, origin.origin);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            OriginType originType = this.f1248type;
            int hashCode2 = (hashCode + (originType != null ? originType.hashCode() : 0)) * 37;
            LocalComposeUiKt localComposeUiKt = this.origin;
            int hashCode3 = hashCode2 + (localComposeUiKt != null ? localComposeUiKt.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ResponseMetadata.Builder builder = new ResponseMetadata.Builder(21);
            builder.errors = this.f1248type;
            builder.result = this.origin;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            OriginType originType = this.f1248type;
            if (originType != null) {
                arrayList.add("type=" + originType);
            }
            LocalComposeUiKt localComposeUiKt = this.origin;
            if (localComposeUiKt != null) {
                arrayList.add("origin=" + localComposeUiKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Origin{", "}", 0, null, null, 56);
        }
    }

    static {
        ContextWrapper$Companion$ADAPTER$1 contextWrapper$Companion$ADAPTER$1 = new ContextWrapper$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContextWrapper.class), "type.googleapis.com/squareup.cash.cashface.delegates.ContextWrapper", Syntax.PROTO_2, null, "squareup/cash/cashface/delegates/ProfileElementProviderService.proto");
        ADAPTER = contextWrapper$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(contextWrapper$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextWrapper(String str, String str2, ByteString byteString, String str3, Origin origin, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.profile_context_type = str;
        this.merchant_flow_token = str2;
        this.context_data = byteString;
        this.referrer_flow_token = str3;
        this.origin = origin;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextWrapper)) {
            return false;
        }
        ContextWrapper contextWrapper = (ContextWrapper) obj;
        return Intrinsics.areEqual(unknownFields(), contextWrapper.unknownFields()) && Intrinsics.areEqual(this.profile_context_type, contextWrapper.profile_context_type) && Intrinsics.areEqual(this.merchant_flow_token, contextWrapper.merchant_flow_token) && Intrinsics.areEqual(this.context_data, contextWrapper.context_data) && Intrinsics.areEqual(this.referrer_flow_token, contextWrapper.referrer_flow_token) && Intrinsics.areEqual(this.origin, contextWrapper.origin);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.profile_context_type;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.merchant_flow_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ByteString byteString = this.context_data;
        int hashCode4 = (hashCode3 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str3 = this.referrer_flow_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Origin origin = this.origin;
        int hashCode6 = hashCode5 + (origin != null ? origin.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(4, false);
        builder.customer_token = this.profile_context_type;
        builder.account_token = this.merchant_flow_token;
        builder.account_type = this.context_data;
        builder.display_name = this.referrer_flow_token;
        builder.is_sponsored_account = this.origin;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.profile_context_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "profile_context_type=", arrayList);
        }
        String str2 = this.merchant_flow_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_flow_token=", arrayList);
        }
        ByteString byteString = this.context_data;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("context_data=", byteString, arrayList);
        }
        String str3 = this.referrer_flow_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "referrer_flow_token=", arrayList);
        }
        Origin origin = this.origin;
        if (origin != null) {
            arrayList.add("origin=" + origin);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContextWrapper{", "}", 0, null, null, 56);
    }
}
