package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import app.cash.redwood.ui.DensityKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.BalanceImpact;
import com.squareup.protos.franklin.common.ProfileRow;
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
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InAppBrowserMetadata> CREATOR;
    public final ExternalAppLink app_link;
    public final EntityInformation entity_info;
    public final DensityKt metadata;
    public final PresentingSource presenting_source;
    public final String url;
    public final String user_agent;

    public final class EntityInformation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EntityInformation> CREATOR;
        public final String business_name;
        public final String business_token;
        public final String entity_name;
        public final String entity_token;
        public final String entity_type;

        static {
            InAppBrowserMetadata$EntityInformation$Companion$ADAPTER$1 inAppBrowserMetadata$EntityInformation$Companion$ADAPTER$1 = new InAppBrowserMetadata$EntityInformation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EntityInformation.class), "type.googleapis.com/squareup.cash.cashsuggest.api.InAppBrowserMetadata.EntityInformation", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/InAppBrowserMetadata.proto");
            ADAPTER = inAppBrowserMetadata$EntityInformation$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppBrowserMetadata$EntityInformation$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntityInformation(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.entity_name = str;
            this.entity_token = str2;
            this.entity_type = str3;
            this.business_name = str4;
            this.business_token = str5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityInformation)) {
                return false;
            }
            EntityInformation entityInformation = (EntityInformation) obj;
            return Intrinsics.areEqual(unknownFields(), entityInformation.unknownFields()) && Intrinsics.areEqual(this.entity_name, entityInformation.entity_name) && Intrinsics.areEqual(this.entity_token, entityInformation.entity_token) && Intrinsics.areEqual(this.entity_type, entityInformation.entity_type) && Intrinsics.areEqual(this.business_name, entityInformation.business_name) && Intrinsics.areEqual(this.business_token, entityInformation.business_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.entity_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.entity_token;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.entity_type;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.business_name;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.business_token;
            int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileRow.Builder builder = new ProfileRow.Builder(3);
            builder.client_route = this.entity_name;
            builder.icon_id = this.entity_token;
            builder.title = this.entity_type;
            builder.subtitle = this.business_name;
            builder.call_to_action = this.business_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.entity_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_name=", arrayList);
            }
            String str2 = this.entity_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_token=", arrayList);
            }
            String str3 = this.entity_type;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "entity_type=", arrayList);
            }
            String str4 = this.business_name;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "business_name=", arrayList);
            }
            String str5 = this.business_token;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "business_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EntityInformation{", "}", 0, null, null, 56);
        }
    }

    public final class IABMetadataAffiliateBoost extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IABMetadataAffiliateBoost> CREATOR;
        public final String boost_token;
        public final RewardAmount reward;

        static {
            InAppBrowserMetadata$IABMetadataAffiliateBoost$Companion$ADAPTER$1 inAppBrowserMetadata$IABMetadataAffiliateBoost$Companion$ADAPTER$1 = new InAppBrowserMetadata$IABMetadataAffiliateBoost$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IABMetadataAffiliateBoost.class), "type.googleapis.com/squareup.cash.cashsuggest.api.InAppBrowserMetadata.IABMetadataAffiliateBoost", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/InAppBrowserMetadata.proto");
            ADAPTER = inAppBrowserMetadata$IABMetadataAffiliateBoost$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppBrowserMetadata$IABMetadataAffiliateBoost$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IABMetadataAffiliateBoost(String str, RewardAmount rewardAmount, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.boost_token = str;
            this.reward = rewardAmount;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IABMetadataAffiliateBoost)) {
                return false;
            }
            IABMetadataAffiliateBoost iABMetadataAffiliateBoost = (IABMetadataAffiliateBoost) obj;
            return Intrinsics.areEqual(unknownFields(), iABMetadataAffiliateBoost.unknownFields()) && Intrinsics.areEqual(this.boost_token, iABMetadataAffiliateBoost.boost_token) && Intrinsics.areEqual(this.reward, iABMetadataAffiliateBoost.reward);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.boost_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            RewardAmount rewardAmount = this.reward;
            int hashCode3 = hashCode2 + (rewardAmount != null ? rewardAmount.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(17);
            builder.image_url = this.boost_token;
            builder.asset = this.reward;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.boost_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "boost_token=", arrayList);
            }
            RewardAmount rewardAmount = this.reward;
            if (rewardAmount != null) {
                arrayList.add("reward=" + rewardAmount);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IABMetadataAffiliateBoost{", "}", 0, null, null, 56);
        }
    }

    public final class IABMetadataAfterpay extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IABMetadataAfterpay> CREATOR;
        public final Integer number_installments;

        static {
            InAppBrowserMetadata$IABMetadataAfterpay$Companion$ADAPTER$1 inAppBrowserMetadata$IABMetadataAfterpay$Companion$ADAPTER$1 = new InAppBrowserMetadata$IABMetadataAfterpay$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IABMetadataAfterpay.class), "type.googleapis.com/squareup.cash.cashsuggest.api.InAppBrowserMetadata.IABMetadataAfterpay", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/InAppBrowserMetadata.proto");
            ADAPTER = inAppBrowserMetadata$IABMetadataAfterpay$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppBrowserMetadata$IABMetadataAfterpay$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IABMetadataAfterpay(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.number_installments = num;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IABMetadataAfterpay)) {
                return false;
            }
            IABMetadataAfterpay iABMetadataAfterpay = (IABMetadataAfterpay) obj;
            return Intrinsics.areEqual(unknownFields(), iABMetadataAfterpay.unknownFields()) && Intrinsics.areEqual(this.number_installments, iABMetadataAfterpay.number_installments);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.number_installments;
            int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(3);
            builder.year = this.number_installments;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.number_installments;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("number_installments=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IABMetadataAfterpay{", "}", 0, null, null, 56);
        }
    }

    public final class IABMetadataCAP extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IABMetadataCAP> CREATOR;
        public final RewardAmount reward;

        static {
            InAppBrowserMetadata$IABMetadataCAP$Companion$ADAPTER$1 inAppBrowserMetadata$IABMetadataCAP$Companion$ADAPTER$1 = new InAppBrowserMetadata$IABMetadataCAP$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IABMetadataCAP.class), "type.googleapis.com/squareup.cash.cashsuggest.api.InAppBrowserMetadata.IABMetadataCAP", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/InAppBrowserMetadata.proto");
            ADAPTER = inAppBrowserMetadata$IABMetadataCAP$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppBrowserMetadata$IABMetadataCAP$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IABMetadataCAP(RewardAmount rewardAmount, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.reward = rewardAmount;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IABMetadataCAP)) {
                return false;
            }
            IABMetadataCAP iABMetadataCAP = (IABMetadataCAP) obj;
            return Intrinsics.areEqual(unknownFields(), iABMetadataCAP.unknownFields()) && Intrinsics.areEqual(this.reward, iABMetadataCAP.reward);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            RewardAmount rewardAmount = this.reward;
            int hashCode2 = hashCode + (rewardAmount != null ? rewardAmount.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Activity.Builder builder = new Activity.Builder(28);
            builder.activity = this.reward;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            RewardAmount rewardAmount = this.reward;
            if (rewardAmount != null) {
                arrayList.add("reward=" + rewardAmount);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IABMetadataCAP{", "}", 0, null, null, 56);
        }
    }

    public final class IABMetadataSUP extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IABMetadataSUP> CREATOR;
        public final Money min_credit;
        public final String sup_token;

        static {
            InAppBrowserMetadata$IABMetadataSUP$Companion$ADAPTER$1 inAppBrowserMetadata$IABMetadataSUP$Companion$ADAPTER$1 = new InAppBrowserMetadata$IABMetadataSUP$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IABMetadataSUP.class), "type.googleapis.com/squareup.cash.cashsuggest.api.InAppBrowserMetadata.IABMetadataSUP", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/InAppBrowserMetadata.proto");
            ADAPTER = inAppBrowserMetadata$IABMetadataSUP$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppBrowserMetadata$IABMetadataSUP$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IABMetadataSUP(Money money, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.sup_token = str;
            this.min_credit = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IABMetadataSUP)) {
                return false;
            }
            IABMetadataSUP iABMetadataSUP = (IABMetadataSUP) obj;
            return Intrinsics.areEqual(unknownFields(), iABMetadataSUP.unknownFields()) && Intrinsics.areEqual(this.sup_token, iABMetadataSUP.sup_token) && Intrinsics.areEqual(this.min_credit, iABMetadataSUP.min_credit);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.sup_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.min_credit;
            int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BalanceImpact.Builder builder = new BalanceImpact.Builder(3);
            builder.balance_name = this.sup_token;
            builder.amount = this.min_credit;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.sup_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sup_token=", arrayList);
            }
            Money money = this.min_credit;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("min_credit=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IABMetadataSUP{", "}", 0, null, null, 56);
        }
    }

    public enum PresentingSource implements WireEnum {
        UNKNOWN_PRESENTING_SOURCE(0),
        TIMELINE_SHEET(1),
        DETAIL_SHEET(2);

        public static final InAppBrowserMetadata$PresentingSource$Companion$ADAPTER$1 ADAPTER;
        public static final Action.Type.Companion Companion;
        public final int value;

        static {
            PresentingSource presentingSource = UNKNOWN_PRESENTING_SOURCE;
            Companion = new Action.Type.Companion();
            ADAPTER = new InAppBrowserMetadata$PresentingSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PresentingSource.class), Syntax.PROTO_2, presentingSource);
        }

        PresentingSource(int i) {
            this.value = i;
        }

        public static final PresentingSource fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN_PRESENTING_SOURCE;
            }
            if (i == 1) {
                return TIMELINE_SHEET;
            }
            if (i != 2) {
                return null;
            }
            return DETAIL_SHEET;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InAppBrowserMetadata$Companion$ADAPTER$1 inAppBrowserMetadata$Companion$ADAPTER$1 = new InAppBrowserMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InAppBrowserMetadata.class), "type.googleapis.com/squareup.cash.cashsuggest.api.InAppBrowserMetadata", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/InAppBrowserMetadata.proto");
        ADAPTER = inAppBrowserMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppBrowserMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserMetadata(String str, ExternalAppLink externalAppLink, String str2, EntityInformation entityInformation, PresentingSource presentingSource, DensityKt densityKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.url = str;
        this.app_link = externalAppLink;
        this.user_agent = str2;
        this.entity_info = entityInformation;
        this.presenting_source = presentingSource;
        this.metadata = densityKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InAppBrowserMetadata)) {
            return false;
        }
        InAppBrowserMetadata inAppBrowserMetadata = (InAppBrowserMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), inAppBrowserMetadata.unknownFields()) && Intrinsics.areEqual(this.url, inAppBrowserMetadata.url) && Intrinsics.areEqual(this.app_link, inAppBrowserMetadata.app_link) && Intrinsics.areEqual(this.user_agent, inAppBrowserMetadata.user_agent) && Intrinsics.areEqual(this.entity_info, inAppBrowserMetadata.entity_info) && this.presenting_source == inAppBrowserMetadata.presenting_source && Intrinsics.areEqual(this.metadata, inAppBrowserMetadata.metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ExternalAppLink externalAppLink = this.app_link;
        int hashCode3 = (hashCode2 + (externalAppLink != null ? externalAppLink.hashCode() : 0)) * 37;
        String str2 = this.user_agent;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        EntityInformation entityInformation = this.entity_info;
        int hashCode5 = (hashCode4 + (entityInformation != null ? entityInformation.hashCode() : 0)) * 37;
        PresentingSource presentingSource = this.presenting_source;
        int hashCode6 = (hashCode5 + (presentingSource != null ? presentingSource.hashCode() : 0)) * 37;
        DensityKt densityKt = this.metadata;
        int hashCode7 = hashCode6 + (densityKt != null ? densityKt.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(27, false);
        builder.description = this.url;
        builder.category = this.app_link;
        builder.field = this.user_agent;
        builder.code = this.entity_info;
        builder.retryable = this.presenting_source;
        builder.metadata = this.metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
        }
        ExternalAppLink externalAppLink = this.app_link;
        if (externalAppLink != null) {
            arrayList.add("app_link=" + externalAppLink);
        }
        String str2 = this.user_agent;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "user_agent=", arrayList);
        }
        EntityInformation entityInformation = this.entity_info;
        if (entityInformation != null) {
            arrayList.add("entity_info=" + entityInformation);
        }
        PresentingSource presentingSource = this.presenting_source;
        if (presentingSource != null) {
            arrayList.add("presenting_source=" + presentingSource);
        }
        DensityKt densityKt = this.metadata;
        if (densityKt != null) {
            arrayList.add("metadata=" + densityKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InAppBrowserMetadata{", "}", 0, null, null, 56);
    }
}
