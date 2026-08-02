package com.squareup.protos.cash.cashbusinessaccounts;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class KybEligibilityWarning extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<KybEligibilityWarning> CREATOR;
    public final Action action;
    public final List banner_details;
    public final List restricted_feature_set;
    public final String subtitle;
    public final String title;

    public final class Action extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Action> CREATOR;
        public final String deeplink_url;
        public final String route_url;
        public final String title;

        static {
            KybEligibilityWarning$Action$Companion$ADAPTER$1 kybEligibilityWarning$Action$Companion$ADAPTER$1 = new KybEligibilityWarning$Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.KybEligibilityWarning.Action", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/kyb_eligibility_warning.proto");
            ADAPTER = kybEligibilityWarning$Action$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(kybEligibilityWarning$Action$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.route_url = str2;
            this.deeplink_url = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.title, action.title) && Intrinsics.areEqual(this.route_url, action.route_url) && Intrinsics.areEqual(this.deeplink_url, action.deeplink_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.route_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.deeplink_url;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(6);
            builder.contact_support_url = this.title;
            builder.privacy_policy_url = this.route_url;
            builder.terms_of_service_url = this.deeplink_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            String str = this.route_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "route_url=", arrayList);
            }
            String str2 = this.deeplink_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "deeplink_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
        }
    }

    public final class BannerDetail extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BannerDetail> CREATOR;
        public final Action action;
        public final RestrictedFeature restricted_feature;
        public final String subtitle;
        public final String subtitle_with_markdown;
        public final String title;

        static {
            KybEligibilityWarning$BannerDetail$Companion$ADAPTER$1 kybEligibilityWarning$BannerDetail$Companion$ADAPTER$1 = new KybEligibilityWarning$BannerDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BannerDetail.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.KybEligibilityWarning.BannerDetail", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/kyb_eligibility_warning.proto");
            ADAPTER = kybEligibilityWarning$BannerDetail$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(kybEligibilityWarning$BannerDetail$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerDetail(RestrictedFeature restrictedFeature, String str, String str2, Action action, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.restricted_feature = restrictedFeature;
            this.title = str;
            this.subtitle = str2;
            this.action = action;
            this.subtitle_with_markdown = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BannerDetail)) {
                return false;
            }
            BannerDetail bannerDetail = (BannerDetail) obj;
            return Intrinsics.areEqual(unknownFields(), bannerDetail.unknownFields()) && this.restricted_feature == bannerDetail.restricted_feature && Intrinsics.areEqual(this.title, bannerDetail.title) && Intrinsics.areEqual(this.subtitle, bannerDetail.subtitle) && Intrinsics.areEqual(this.action, bannerDetail.action) && Intrinsics.areEqual(this.subtitle_with_markdown, bannerDetail.subtitle_with_markdown);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            RestrictedFeature restrictedFeature = this.restricted_feature;
            int hashCode2 = (hashCode + (restrictedFeature != null ? restrictedFeature.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode5 = (hashCode4 + (action != null ? action.hashCode() : 0)) * 37;
            String str3 = this.subtitle_with_markdown;
            int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(25);
            builder.for_each = this.restricted_feature;
            builder.moneybot_scaffold = this.title;
            builder.compose_platform = this.subtitle;
            builder.is_included = this.action;
            builder.motion = this.subtitle_with_markdown;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            RestrictedFeature restrictedFeature = this.restricted_feature;
            if (restrictedFeature != null) {
                arrayList.add("restricted_feature=" + restrictedFeature);
            }
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.subtitle != null) {
                arrayList.add("subtitle=██");
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            if (this.subtitle_with_markdown != null) {
                arrayList.add("subtitle_with_markdown=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BannerDetail{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes6.dex */
    public enum RestrictedFeature implements WireEnum {
        RESTRICTED_FEATURE_UNSPECIFIED(0),
        RESTRICTED_FEATURE_INVESTING(1),
        RESTRICTED_FEATURE_BTC(2),
        RESTRICTED_FEATURE_MONEY(3),
        RESTRICTED_FEATURE_FAMILIES(4),
        RESTRICTED_FEATURE_CARD(5),
        RESTRICTED_FEATURE_DIRECT_DEPOSIT(6),
        RESTRICTED_FEATURE_PAYCHECKS(7),
        RESTRICTED_FEATURE_TAX(8);

        public static final KybEligibilityWarning$RestrictedFeature$Companion$ADAPTER$1 ADAPTER;
        public static final WorkCookieJar Companion;
        public final int value;

        static {
            RestrictedFeature restrictedFeature = RESTRICTED_FEATURE_UNSPECIFIED;
            Companion = new WorkCookieJar(21);
            ADAPTER = new KybEligibilityWarning$RestrictedFeature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RestrictedFeature.class), Syntax.PROTO_2, restrictedFeature);
        }

        RestrictedFeature(int i) {
            this.value = i;
        }

        public static final RestrictedFeature fromValue(int i) {
            Companion.getClass();
            return WorkCookieJar.m3798fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        KybEligibilityWarning$Companion$ADAPTER$1 kybEligibilityWarning$Companion$ADAPTER$1 = new KybEligibilityWarning$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KybEligibilityWarning.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.KybEligibilityWarning", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/kyb_eligibility_warning.proto");
        ADAPTER = kybEligibilityWarning$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(kybEligibilityWarning$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KybEligibilityWarning(List list, String str, String str2, Action action, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.title = str;
        this.subtitle = str2;
        this.action = action;
        this.restricted_feature_set = TransactorKt.immutableCopyOf("restricted_feature_set", list);
        this.banner_details = TransactorKt.immutableCopyOf("banner_details", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KybEligibilityWarning)) {
            return false;
        }
        KybEligibilityWarning kybEligibilityWarning = (KybEligibilityWarning) obj;
        return Intrinsics.areEqual(unknownFields(), kybEligibilityWarning.unknownFields()) && Intrinsics.areEqual(this.restricted_feature_set, kybEligibilityWarning.restricted_feature_set) && Intrinsics.areEqual(this.title, kybEligibilityWarning.title) && Intrinsics.areEqual(this.subtitle, kybEligibilityWarning.subtitle) && Intrinsics.areEqual(this.action, kybEligibilityWarning.action) && Intrinsics.areEqual(this.banner_details, kybEligibilityWarning.banner_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.restricted_feature_set);
        String str = this.title;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode3 = this.banner_details.hashCode() + ((hashCode2 + (action != null ? action.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(26);
        builder.for_each = this.restricted_feature_set;
        builder.moneybot_scaffold = this.title;
        builder.compose_platform = this.subtitle;
        builder.is_included = this.action;
        builder.motion = this.banner_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.restricted_feature_set;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("restricted_feature_set=", arrayList, list);
        }
        if (this.title != null) {
            arrayList.add("title=██");
        }
        if (this.subtitle != null) {
            arrayList.add("subtitle=██");
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        List list2 = this.banner_details;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("banner_details=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "KybEligibilityWarning{", "}", 0, null, null, 56);
    }
}
