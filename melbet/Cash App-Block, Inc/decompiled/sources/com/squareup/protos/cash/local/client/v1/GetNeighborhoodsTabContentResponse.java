package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenMasthead;
import com.squareup.protos.cash.local.client.v1.LocalRelatedContent;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetNeighborhoodsTabContentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Expression$Builder;", "Builder", "EnrollmentIncentive", "Incentive", "LocalCashExplainer", "AppletType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetNeighborhoodsTabContentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetNeighborhoodsTabContentResponse> CREATOR;
    public final List applet_ordering;
    public final BrandCollection brand_collection;
    public final List brand_collection_sections;
    public final ShortlinkAction change_geo_shortlink;
    public final EnrollmentIncentive enrollment_incentive;
    public final Long expires_at;
    public final Incentive following_incentive;
    public final LocalCashExplainer local_cash_explainer;
    public final String mapbox_access_token;
    public final MapboxConfiguration mapbox_configuration;
    public final Incentive orders_incentive;
    public final Boolean show_map_button;

    /* loaded from: classes7.dex */
    public enum AppletType implements WireEnum {
        APPLET_TYPE_UNSPECIFIED(0),
        APPLET_TYPE_LOCAL_CASH(1),
        APPLET_TYPE_REORDER(2),
        APPLET_TYPE_BRAND_COLLECTION(3),
        APPLET_TYPE_FOLLOWING(4),
        APPLET_TYPE_MARKETING_MESSAGE(5);

        public static final GetNeighborhoodsTabContentResponse$AppletType$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            AppletType appletType = APPLET_TYPE_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new GetNeighborhoodsTabContentResponse$AppletType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AppletType.class), Syntax.PROTO_2, appletType);
        }

        AppletType(int i) {
            this.value = i;
        }

        public static final AppletType fromValue(int i) {
            Companion.getClass();
            return Origin.Companion.m3882fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public final class EnrollmentIncentive extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EnrollmentIncentive> CREATOR;
        public final String accept_cta_button_label;
        public final String accept_cta_client_route;
        public final String body;
        public final String caption;
        public final String caption_arcade_icon;
        public final String headline;
        public final LocalImage hero_image;
        public final String legal_consent_button_label;
        public final LegalConsentContent legal_consent_content;
        public final Long local_cash_incentive_amount;
        public final Onboarding onboarding;
        public final String title;

        public final class LegalConsentContent extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LegalConsentContent> CREATOR;
            public final String fine_print;
            public final String primary_cta_button_label;
            public final String primary_cta_client_route;
            public final String title;

            static {
                GetNeighborhoodsTabContentResponse$EnrollmentIncentive$LegalConsentContent$Companion$ADAPTER$1 getNeighborhoodsTabContentResponse$EnrollmentIncentive$LegalConsentContent$Companion$ADAPTER$1 = new GetNeighborhoodsTabContentResponse$EnrollmentIncentive$LegalConsentContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LegalConsentContent.class), "type.googleapis.com/squareup.cash.local.client.v1.GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
                ADAPTER = getNeighborhoodsTabContentResponse$EnrollmentIncentive$LegalConsentContent$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getNeighborhoodsTabContentResponse$EnrollmentIncentive$LegalConsentContent$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LegalConsentContent(String str, String str2, String str3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.fine_print = str2;
                this.primary_cta_button_label = str3;
                this.primary_cta_client_route = str4;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LegalConsentContent)) {
                    return false;
                }
                LegalConsentContent legalConsentContent = (LegalConsentContent) obj;
                return Intrinsics.areEqual(unknownFields(), legalConsentContent.unknownFields()) && Intrinsics.areEqual(this.title, legalConsentContent.title) && Intrinsics.areEqual(this.fine_print, legalConsentContent.fine_print) && Intrinsics.areEqual(this.primary_cta_button_label, legalConsentContent.primary_cta_button_label) && Intrinsics.areEqual(this.primary_cta_client_route, legalConsentContent.primary_cta_client_route);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.fine_print;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.primary_cta_button_label;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.primary_cta_client_route;
                int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PoolOwner.Builder builder = new PoolOwner.Builder(6);
                builder.customer_token = this.title;
                builder.full_name = this.fine_print;
                builder.profile_photo_url = this.primary_cta_button_label;
                builder.cashtag = this.primary_cta_client_route;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.fine_print;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "fine_print=", arrayList);
                }
                String str3 = this.primary_cta_button_label;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "primary_cta_button_label=", arrayList);
                }
                String str4 = this.primary_cta_client_route;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "primary_cta_client_route=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LegalConsentContent{", "}", 0, null, null, 56);
            }
        }

        public final class Onboarding extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Onboarding> CREATOR;
            public final String body;
            public final String fine_print;
            public final HowItWorks how_it_works;
            public final String primary_cta_button_label;
            public final String primary_cta_client_route;
            public final String title;

            /* loaded from: classes.dex */
            public final class HowItWorks extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<HowItWorks> CREATOR;
                public final List rows;
                public final String title;

                /* loaded from: classes7.dex */
                public final class Row extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Row> CREATOR;
                    public final String body;
                    public final LocalImage image;
                    public final String title;

                    static {
                        GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Row$Companion$ADAPTER$1 getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Row$Companion$ADAPTER$1 = new GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.cash.local.client.v1.GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
                        ADAPTER = getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Row$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Row$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Row(LocalImage localImage, String str, String str2, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.image = localImage;
                        this.title = str;
                        this.body = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Row)) {
                            return false;
                        }
                        Row row = (Row) obj;
                        return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.image, row.image) && Intrinsics.areEqual(this.title, row.title) && Intrinsics.areEqual(this.body, row.body);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        LocalImage localImage = this.image;
                        int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
                        String str = this.title;
                        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                        String str2 = this.body;
                        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
                        this.hashCode = hashCode4;
                        return hashCode4;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        POSLocalCashRedemption.Coupon.Builder builder = new POSLocalCashRedemption.Coupon.Builder(2);
                        builder.icon = this.image;
                        builder.title = this.title;
                        builder.code = this.body;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        LocalImage localImage = this.image;
                        if (localImage != null) {
                            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
                        }
                        String str = this.title;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                        }
                        String str2 = this.body;
                        if (str2 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
                    }
                }

                static {
                    GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Companion$ADAPTER$1 getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Companion$ADAPTER$1 = new GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HowItWorks.class), "type.googleapis.com/squareup.cash.local.client.v1.GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
                    ADAPTER = getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$HowItWorks$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HowItWorks(String str, List list, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.title = str;
                    this.rows = TransactorKt.immutableCopyOf("rows", list);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof HowItWorks)) {
                        return false;
                    }
                    HowItWorks howItWorks = (HowItWorks) obj;
                    return Intrinsics.areEqual(unknownFields(), howItWorks.unknownFields()) && Intrinsics.areEqual(this.title, howItWorks.title) && Intrinsics.areEqual(this.rows, howItWorks.rows);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.title;
                    int hashCode2 = this.rows.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ToggleScreen.Builder builder = new ToggleScreen.Builder(19);
                    builder.toggle_title = this.title;
                    builder.sections = this.rows;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.title;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                    }
                    List list = this.rows;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "HowItWorks{", "}", 0, null, null, 56);
                }
            }

            static {
                GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$Companion$ADAPTER$1 getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$Companion$ADAPTER$1 = new GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Onboarding.class), "type.googleapis.com/squareup.cash.local.client.v1.GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
                ADAPTER = getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getNeighborhoodsTabContentResponse$EnrollmentIncentive$Onboarding$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Onboarding(String str, String str2, HowItWorks howItWorks, String str3, String str4, String str5, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.body = str2;
                this.how_it_works = howItWorks;
                this.fine_print = str3;
                this.primary_cta_client_route = str4;
                this.primary_cta_button_label = str5;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Onboarding)) {
                    return false;
                }
                Onboarding onboarding = (Onboarding) obj;
                return Intrinsics.areEqual(unknownFields(), onboarding.unknownFields()) && Intrinsics.areEqual(this.title, onboarding.title) && Intrinsics.areEqual(this.body, onboarding.body) && Intrinsics.areEqual(this.how_it_works, onboarding.how_it_works) && Intrinsics.areEqual(this.fine_print, onboarding.fine_print) && Intrinsics.areEqual(this.primary_cta_client_route, onboarding.primary_cta_client_route) && Intrinsics.areEqual(this.primary_cta_button_label, onboarding.primary_cta_button_label);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.body;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                HowItWorks howItWorks = this.how_it_works;
                int hashCode4 = (hashCode3 + (howItWorks != null ? howItWorks.hashCode() : 0)) * 37;
                String str3 = this.fine_print;
                int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.primary_cta_client_route;
                int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
                String str5 = this.primary_cta_button_label;
                int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ExpenseSlice.Builder builder = new ExpenseSlice.Builder(13);
                builder.slice_token = this.title;
                builder.requester = this.body;
                builder.responder = this.how_it_works;
                builder.amount = this.fine_print;
                builder.status = this.primary_cta_client_route;
                builder.action = this.primary_cta_button_label;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.body;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
                }
                HowItWorks howItWorks = this.how_it_works;
                if (howItWorks != null) {
                    arrayList.add("how_it_works=" + howItWorks);
                }
                String str3 = this.fine_print;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "fine_print=", arrayList);
                }
                String str4 = this.primary_cta_client_route;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "primary_cta_client_route=", arrayList);
                }
                String str5 = this.primary_cta_button_label;
                if (str5 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "primary_cta_button_label=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Onboarding{", "}", 0, null, null, 56);
            }
        }

        static {
            GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Companion$ADAPTER$1 getNeighborhoodsTabContentResponse$EnrollmentIncentive$Companion$ADAPTER$1 = new GetNeighborhoodsTabContentResponse$EnrollmentIncentive$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EnrollmentIncentive.class), "type.googleapis.com/squareup.cash.local.client.v1.GetNeighborhoodsTabContentResponse.EnrollmentIncentive", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getNeighborhoodsTabContentResponse$EnrollmentIncentive$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getNeighborhoodsTabContentResponse$EnrollmentIncentive$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnrollmentIncentive(Long l, String str, String str2, String str3, String str4, String str5, LegalConsentContent legalConsentContent, Onboarding onboarding, LocalImage localImage, String str6, String str7, String str8, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.local_cash_incentive_amount = l;
            this.title = str;
            this.body = str2;
            this.caption = str3;
            this.caption_arcade_icon = str4;
            this.legal_consent_button_label = str5;
            this.legal_consent_content = legalConsentContent;
            this.onboarding = onboarding;
            this.hero_image = localImage;
            this.headline = str6;
            this.accept_cta_client_route = str7;
            this.accept_cta_button_label = str8;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnrollmentIncentive)) {
                return false;
            }
            EnrollmentIncentive enrollmentIncentive = (EnrollmentIncentive) obj;
            return Intrinsics.areEqual(unknownFields(), enrollmentIncentive.unknownFields()) && Intrinsics.areEqual(this.local_cash_incentive_amount, enrollmentIncentive.local_cash_incentive_amount) && Intrinsics.areEqual(this.title, enrollmentIncentive.title) && Intrinsics.areEqual(this.body, enrollmentIncentive.body) && Intrinsics.areEqual(this.caption, enrollmentIncentive.caption) && Intrinsics.areEqual(this.caption_arcade_icon, enrollmentIncentive.caption_arcade_icon) && Intrinsics.areEqual(this.legal_consent_button_label, enrollmentIncentive.legal_consent_button_label) && Intrinsics.areEqual(this.legal_consent_content, enrollmentIncentive.legal_consent_content) && Intrinsics.areEqual(this.onboarding, enrollmentIncentive.onboarding) && Intrinsics.areEqual(this.hero_image, enrollmentIncentive.hero_image) && Intrinsics.areEqual(this.headline, enrollmentIncentive.headline) && Intrinsics.areEqual(this.accept_cta_client_route, enrollmentIncentive.accept_cta_client_route) && Intrinsics.areEqual(this.accept_cta_button_label, enrollmentIncentive.accept_cta_button_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.local_cash_incentive_amount;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.caption;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.caption_arcade_icon;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.legal_consent_button_label;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
            LegalConsentContent legalConsentContent = this.legal_consent_content;
            int hashCode8 = (hashCode7 + (legalConsentContent != null ? legalConsentContent.hashCode() : 0)) * 37;
            Onboarding onboarding = this.onboarding;
            int hashCode9 = (hashCode8 + (onboarding != null ? onboarding.hashCode() : 0)) * 37;
            LocalImage localImage = this.hero_image;
            int hashCode10 = (hashCode9 + (localImage != null ? localImage.hashCode() : 0)) * 37;
            String str6 = this.headline;
            int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.accept_cta_client_route;
            int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.accept_cta_button_label;
            int hashCode13 = hashCode12 + (str8 != null ? str8.hashCode() : 0);
            this.hashCode = hashCode13;
            return hashCode13;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Expression.Builder builder = new Expression.Builder(13, false);
            builder.int_literal = this.local_cash_incentive_amount;
            builder.string_literal = this.title;
            builder.key_path_ref = this.body;
            builder.float_literal = this.caption;
            builder.bool_literal = this.caption_arcade_icon;
            builder.blob_literal = this.legal_consent_button_label;
            builder.unary_op = this.legal_consent_content;
            builder.binary_op = this.onboarding;
            builder.conditional_op = this.hero_image;
            builder.filter_op = this.headline;
            builder.collection_literal = this.accept_cta_client_route;
            builder.format_string_op = this.accept_cta_button_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.local_cash_incentive_amount;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("local_cash_incentive_amount=", l, arrayList);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            String str3 = this.caption;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "caption=", arrayList);
            }
            String str4 = this.caption_arcade_icon;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "caption_arcade_icon=", arrayList);
            }
            String str5 = this.legal_consent_button_label;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "legal_consent_button_label=", arrayList);
            }
            LegalConsentContent legalConsentContent = this.legal_consent_content;
            if (legalConsentContent != null) {
                arrayList.add("legal_consent_content=" + legalConsentContent);
            }
            Onboarding onboarding = this.onboarding;
            if (onboarding != null) {
                arrayList.add("onboarding=" + onboarding);
            }
            LocalImage localImage = this.hero_image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("hero_image=", localImage, arrayList);
            }
            String str6 = this.headline;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "headline=", arrayList);
            }
            String str7 = this.accept_cta_client_route;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "accept_cta_client_route=", arrayList);
            }
            String str8 = this.accept_cta_button_label;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "accept_cta_button_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EnrollmentIncentive{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class Incentive extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Incentive> CREATOR;
        public final String client_route;
        public final String eyebrow_heading;
        public final LocalImage hero_image;
        public final String title;

        static {
            GetNeighborhoodsTabContentResponse$Incentive$Companion$ADAPTER$1 getNeighborhoodsTabContentResponse$Incentive$Companion$ADAPTER$1 = new GetNeighborhoodsTabContentResponse$Incentive$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Incentive.class), "type.googleapis.com/squareup.cash.local.client.v1.GetNeighborhoodsTabContentResponse.Incentive", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getNeighborhoodsTabContentResponse$Incentive$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getNeighborhoodsTabContentResponse$Incentive$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Incentive(LocalImage localImage, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.eyebrow_heading = str;
            this.title = str2;
            this.hero_image = localImage;
            this.client_route = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Incentive)) {
                return false;
            }
            Incentive incentive = (Incentive) obj;
            return Intrinsics.areEqual(unknownFields(), incentive.unknownFields()) && Intrinsics.areEqual(this.eyebrow_heading, incentive.eyebrow_heading) && Intrinsics.areEqual(this.title, incentive.title) && Intrinsics.areEqual(this.hero_image, incentive.hero_image) && Intrinsics.areEqual(this.client_route, incentive.client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.eyebrow_heading;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalImage localImage = this.hero_image;
            int hashCode4 = (hashCode3 + (localImage != null ? localImage.hashCode() : 0)) * 37;
            String str3 = this.client_route;
            int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LocalRelatedContent.Item.Builder builder = new LocalRelatedContent.Item.Builder(1);
            builder.title = this.eyebrow_heading;
            builder.description = this.title;
            builder.image = this.hero_image;
            builder.client_route = this.client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.eyebrow_heading;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "eyebrow_heading=", arrayList);
            }
            String str2 = this.title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
            }
            LocalImage localImage = this.hero_image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("hero_image=", localImage, arrayList);
            }
            String str3 = this.client_route;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Incentive{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class LocalCashExplainer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalCashExplainer> CREATOR;
        public final String body;
        public final LocalImage hero_image;

        static {
            GetNeighborhoodsTabContentResponse$LocalCashExplainer$Companion$ADAPTER$1 getNeighborhoodsTabContentResponse$LocalCashExplainer$Companion$ADAPTER$1 = new GetNeighborhoodsTabContentResponse$LocalCashExplainer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashExplainer.class), "type.googleapis.com/squareup.cash.local.client.v1.GetNeighborhoodsTabContentResponse.LocalCashExplainer", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getNeighborhoodsTabContentResponse$LocalCashExplainer$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getNeighborhoodsTabContentResponse$LocalCashExplainer$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalCashExplainer(LocalImage localImage, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.hero_image = localImage;
            this.body = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalCashExplainer)) {
                return false;
            }
            LocalCashExplainer localCashExplainer = (LocalCashExplainer) obj;
            return Intrinsics.areEqual(unknownFields(), localCashExplainer.unknownFields()) && Intrinsics.areEqual(this.hero_image, localCashExplainer.hero_image) && Intrinsics.areEqual(this.body, localCashExplainer.body);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalImage localImage = this.hero_image;
            int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
            String str = this.body;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            MarketScreenMasthead.Builder builder = new MarketScreenMasthead.Builder(1);
            builder.logo = this.hero_image;
            builder.title = this.body;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalImage localImage = this.hero_image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("hero_image=", localImage, arrayList);
            }
            String str = this.body;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "body=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashExplainer{", "}", 0, null, null, 56);
        }
    }

    static {
        GetNeighborhoodsTabContentResponse$Companion$ADAPTER$1 getNeighborhoodsTabContentResponse$Companion$ADAPTER$1 = new GetNeighborhoodsTabContentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetNeighborhoodsTabContentResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetNeighborhoodsTabContentResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getNeighborhoodsTabContentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getNeighborhoodsTabContentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNeighborhoodsTabContentResponse(List list, BrandCollection brandCollection, EnrollmentIncentive enrollmentIncentive, Boolean bool, Long l, LocalCashExplainer localCashExplainer, String str, MapboxConfiguration mapboxConfiguration, List list2, Incentive incentive, ShortlinkAction shortlinkAction, Incentive incentive2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.brand_collection = brandCollection;
        this.enrollment_incentive = enrollmentIncentive;
        this.show_map_button = bool;
        this.expires_at = l;
        this.local_cash_explainer = localCashExplainer;
        this.mapbox_access_token = str;
        this.mapbox_configuration = mapboxConfiguration;
        this.following_incentive = incentive;
        this.change_geo_shortlink = shortlinkAction;
        this.orders_incentive = incentive2;
        this.applet_ordering = TransactorKt.immutableCopyOf("applet_ordering", list);
        this.brand_collection_sections = TransactorKt.immutableCopyOf("brand_collection_sections", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetNeighborhoodsTabContentResponse)) {
            return false;
        }
        GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = (GetNeighborhoodsTabContentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getNeighborhoodsTabContentResponse.unknownFields()) && Intrinsics.areEqual(this.applet_ordering, getNeighborhoodsTabContentResponse.applet_ordering) && Intrinsics.areEqual(this.brand_collection, getNeighborhoodsTabContentResponse.brand_collection) && Intrinsics.areEqual(this.enrollment_incentive, getNeighborhoodsTabContentResponse.enrollment_incentive) && Intrinsics.areEqual(this.show_map_button, getNeighborhoodsTabContentResponse.show_map_button) && Intrinsics.areEqual(this.expires_at, getNeighborhoodsTabContentResponse.expires_at) && Intrinsics.areEqual(this.local_cash_explainer, getNeighborhoodsTabContentResponse.local_cash_explainer) && Intrinsics.areEqual(this.mapbox_access_token, getNeighborhoodsTabContentResponse.mapbox_access_token) && Intrinsics.areEqual(this.mapbox_configuration, getNeighborhoodsTabContentResponse.mapbox_configuration) && Intrinsics.areEqual(this.brand_collection_sections, getNeighborhoodsTabContentResponse.brand_collection_sections) && Intrinsics.areEqual(this.following_incentive, getNeighborhoodsTabContentResponse.following_incentive) && Intrinsics.areEqual(this.change_geo_shortlink, getNeighborhoodsTabContentResponse.change_geo_shortlink) && Intrinsics.areEqual(this.orders_incentive, getNeighborhoodsTabContentResponse.orders_incentive);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.applet_ordering);
        BrandCollection brandCollection = this.brand_collection;
        int hashCode = (m + (brandCollection != null ? brandCollection.hashCode() : 0)) * 37;
        EnrollmentIncentive enrollmentIncentive = this.enrollment_incentive;
        int hashCode2 = (hashCode + (enrollmentIncentive != null ? enrollmentIncentive.hashCode() : 0)) * 37;
        Boolean bool = this.show_map_button;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.expires_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        LocalCashExplainer localCashExplainer = this.local_cash_explainer;
        int hashCode5 = (hashCode4 + (localCashExplainer != null ? localCashExplainer.hashCode() : 0)) * 37;
        String str = this.mapbox_access_token;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        MapboxConfiguration mapboxConfiguration = this.mapbox_configuration;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (mapboxConfiguration != null ? mapboxConfiguration.hashCode() : 0)) * 37, 37, this.brand_collection_sections);
        Incentive incentive = this.following_incentive;
        int hashCode7 = (m2 + (incentive != null ? incentive.hashCode() : 0)) * 37;
        ShortlinkAction shortlinkAction = this.change_geo_shortlink;
        int hashCode8 = (hashCode7 + (shortlinkAction != null ? shortlinkAction.hashCode() : 0)) * 37;
        Incentive incentive2 = this.orders_incentive;
        int hashCode9 = hashCode8 + (incentive2 != null ? incentive2.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(12);
        builder.key_path_ref = this.applet_ordering;
        builder.float_literal = this.brand_collection;
        builder.blob_literal = this.enrollment_incentive;
        builder.bool_literal = this.show_map_button;
        builder.int_literal = this.expires_at;
        builder.unary_op = this.local_cash_explainer;
        builder.string_literal = this.mapbox_access_token;
        builder.binary_op = this.mapbox_configuration;
        builder.conditional_op = this.brand_collection_sections;
        builder.filter_op = this.following_incentive;
        builder.collection_literal = this.change_geo_shortlink;
        builder.format_string_op = this.orders_incentive;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.applet_ordering;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("applet_ordering=", arrayList, list);
        }
        BrandCollection brandCollection = this.brand_collection;
        if (brandCollection != null) {
            arrayList.add("brand_collection=" + brandCollection);
        }
        EnrollmentIncentive enrollmentIncentive = this.enrollment_incentive;
        if (enrollmentIncentive != null) {
            arrayList.add("enrollment_incentive=" + enrollmentIncentive);
        }
        Boolean bool = this.show_map_button;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_map_button=", bool, arrayList);
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        LocalCashExplainer localCashExplainer = this.local_cash_explainer;
        if (localCashExplainer != null) {
            arrayList.add("local_cash_explainer=" + localCashExplainer);
        }
        if (this.mapbox_access_token != null) {
            arrayList.add("mapbox_access_token=██");
        }
        MapboxConfiguration mapboxConfiguration = this.mapbox_configuration;
        if (mapboxConfiguration != null) {
            arrayList.add("mapbox_configuration=" + mapboxConfiguration);
        }
        List list2 = this.brand_collection_sections;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("brand_collection_sections=", arrayList, list2);
        }
        Incentive incentive = this.following_incentive;
        if (incentive != null) {
            arrayList.add("following_incentive=" + incentive);
        }
        ShortlinkAction shortlinkAction = this.change_geo_shortlink;
        if (shortlinkAction != null) {
            arrayList.add("change_geo_shortlink=" + shortlinkAction);
        }
        Incentive incentive2 = this.orders_incentive;
        if (incentive2 != null) {
            arrayList.add("orders_incentive=" + incentive2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNeighborhoodsTabContentResponse{", "}", 0, null, null, 56);
    }
}
