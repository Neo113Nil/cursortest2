package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class POSBrandOnboarding extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<POSBrandOnboarding> CREATOR;
    public final String body;
    public final BrandCard brand_card;
    public final Long brand_card_slide_in_delay;
    public final String close_button_client_route;
    public final ShortlinkAction complete_onboarding_shortlink;
    public final String continue_button_title;
    public final String fine_print;
    public final HowItWorks how_it_works;
    public final LegalConsent legal_consent;
    public final String loading_text;
    public final LocalCashDetails local_cash_card;
    public final String title;

    public final class BrandCard extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BrandCard> CREATOR;
        public final LocalImage artwork_image;
        public final LocalColor background_color;
        public final LocalColor brand_card_outline_color;
        public final LocalColor foreground_color;
        public final String name;

        static {
            POSBrandOnboarding$BrandCard$Companion$ADAPTER$1 pOSBrandOnboarding$BrandCard$Companion$ADAPTER$1 = new POSBrandOnboarding$BrandCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrandCard.class), "type.googleapis.com/squareup.cash.local.client.v1.POSBrandOnboarding.BrandCard", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = pOSBrandOnboarding$BrandCard$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(pOSBrandOnboarding$BrandCard$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrandCard(String str, LocalImage localImage, LocalColor localColor, LocalColor localColor2, LocalColor localColor3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.artwork_image = localImage;
            this.foreground_color = localColor;
            this.background_color = localColor2;
            this.brand_card_outline_color = localColor3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BrandCard)) {
                return false;
            }
            BrandCard brandCard = (BrandCard) obj;
            return Intrinsics.areEqual(unknownFields(), brandCard.unknownFields()) && Intrinsics.areEqual(this.name, brandCard.name) && Intrinsics.areEqual(this.artwork_image, brandCard.artwork_image) && Intrinsics.areEqual(this.foreground_color, brandCard.foreground_color) && Intrinsics.areEqual(this.background_color, brandCard.background_color) && Intrinsics.areEqual(this.brand_card_outline_color, brandCard.brand_card_outline_color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalImage localImage = this.artwork_image;
            int hashCode3 = (hashCode2 + (localImage != null ? localImage.hashCode() : 0)) * 37;
            LocalColor localColor = this.foreground_color;
            int hashCode4 = (hashCode3 + (localColor != null ? localColor.hashCode() : 0)) * 37;
            LocalColor localColor2 = this.background_color;
            int hashCode5 = (hashCode4 + (localColor2 != null ? localColor2.hashCode() : 0)) * 37;
            LocalColor localColor3 = this.brand_card_outline_color;
            int hashCode6 = hashCode5 + (localColor3 != null ? localColor3.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BrandBanner.Builder builder = new BrandBanner.Builder(11);
            builder.title = this.name;
            builder.icon = this.artwork_image;
            builder.icon_background_color = this.foreground_color;
            builder.subtitle = this.background_color;
            builder.action = this.brand_card_outline_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            LocalImage localImage = this.artwork_image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", localImage, arrayList);
            }
            LocalColor localColor = this.foreground_color;
            if (localColor != null) {
                SizeMode$EnumUnboxingLocalUtility.m("foreground_color=", localColor, arrayList);
            }
            LocalColor localColor2 = this.background_color;
            if (localColor2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor2, arrayList);
            }
            LocalColor localColor3 = this.brand_card_outline_color;
            if (localColor3 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("brand_card_outline_color=", localColor3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BrandCard{", "}", 0, null, null, 56);
        }
    }

    public final class HowItWorks extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HowItWorks> CREATOR;
        public final List rows;
        public final String title;

        public final class Row extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Row> CREATOR;
            public final String body;
            public final LocalImage image;
            public final String title;

            static {
                POSBrandOnboarding$HowItWorks$Row$Companion$ADAPTER$1 pOSBrandOnboarding$HowItWorks$Row$Companion$ADAPTER$1 = new POSBrandOnboarding$HowItWorks$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.cash.local.client.v1.POSBrandOnboarding.HowItWorks.Row", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
                ADAPTER = pOSBrandOnboarding$HowItWorks$Row$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(pOSBrandOnboarding$HowItWorks$Row$Companion$ADAPTER$1);
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
                POSLocalCashRedemption.Coupon.Builder builder = new POSLocalCashRedemption.Coupon.Builder(3);
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
            POSBrandOnboarding$HowItWorks$Companion$ADAPTER$1 pOSBrandOnboarding$HowItWorks$Companion$ADAPTER$1 = new POSBrandOnboarding$HowItWorks$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HowItWorks.class), "type.googleapis.com/squareup.cash.local.client.v1.POSBrandOnboarding.HowItWorks", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = pOSBrandOnboarding$HowItWorks$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(pOSBrandOnboarding$HowItWorks$Companion$ADAPTER$1);
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
            ToggleScreen.Builder builder = new ToggleScreen.Builder(25, false);
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

    public final class LegalConsent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LegalConsent> CREATOR;
        public final ShortlinkAction accept_button_shortlink;
        public final String fine_print;
        public final String title;

        static {
            POSBrandOnboarding$LegalConsent$Companion$ADAPTER$1 pOSBrandOnboarding$LegalConsent$Companion$ADAPTER$1 = new POSBrandOnboarding$LegalConsent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LegalConsent.class), "type.googleapis.com/squareup.cash.local.client.v1.POSBrandOnboarding.LegalConsent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = pOSBrandOnboarding$LegalConsent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(pOSBrandOnboarding$LegalConsent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegalConsent(String str, String str2, ShortlinkAction shortlinkAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.fine_print = str2;
            this.accept_button_shortlink = shortlinkAction;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LegalConsent)) {
                return false;
            }
            LegalConsent legalConsent = (LegalConsent) obj;
            return Intrinsics.areEqual(unknownFields(), legalConsent.unknownFields()) && Intrinsics.areEqual(this.title, legalConsent.title) && Intrinsics.areEqual(this.fine_print, legalConsent.fine_print) && Intrinsics.areEqual(this.accept_button_shortlink, legalConsent.accept_button_shortlink);
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
            ShortlinkAction shortlinkAction = this.accept_button_shortlink;
            int hashCode4 = hashCode3 + (shortlinkAction != null ? shortlinkAction.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BLEPayload.Builder builder = new BLEPayload.Builder(4, false);
            builder.advertisement_data = this.title;
            builder.transmission_level = this.fine_print;
            builder.frequency = this.accept_button_shortlink;
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
            ShortlinkAction shortlinkAction = this.accept_button_shortlink;
            if (shortlinkAction != null) {
                arrayList.add("accept_button_shortlink=" + shortlinkAction);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LegalConsent{", "}", 0, null, null, 56);
        }
    }

    public final class LocalCashDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalCashDetails> CREATOR;
        public final String body;
        public final LocalImage image;
        public final Long local_cash_amount;
        public final ShortlinkAction primary_button_shortlink;
        public final String title;

        static {
            POSBrandOnboarding$LocalCashDetails$Companion$ADAPTER$1 pOSBrandOnboarding$LocalCashDetails$Companion$ADAPTER$1 = new POSBrandOnboarding$LocalCashDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashDetails.class), "type.googleapis.com/squareup.cash.local.client.v1.POSBrandOnboarding.LocalCashDetails", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = pOSBrandOnboarding$LocalCashDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(pOSBrandOnboarding$LocalCashDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalCashDetails(Long l, LocalImage localImage, String str, ShortlinkAction shortlinkAction, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.local_cash_amount = l;
            this.image = localImage;
            this.body = str;
            this.primary_button_shortlink = shortlinkAction;
            this.title = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalCashDetails)) {
                return false;
            }
            LocalCashDetails localCashDetails = (LocalCashDetails) obj;
            return Intrinsics.areEqual(unknownFields(), localCashDetails.unknownFields()) && Intrinsics.areEqual(this.local_cash_amount, localCashDetails.local_cash_amount) && Intrinsics.areEqual(this.image, localCashDetails.image) && Intrinsics.areEqual(this.body, localCashDetails.body) && Intrinsics.areEqual(this.primary_button_shortlink, localCashDetails.primary_button_shortlink) && Intrinsics.areEqual(this.title, localCashDetails.title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.local_cash_amount;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            LocalImage localImage = this.image;
            int hashCode3 = (hashCode2 + (localImage != null ? localImage.hashCode() : 0)) * 37;
            String str = this.body;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            ShortlinkAction shortlinkAction = this.primary_button_shortlink;
            int hashCode5 = (hashCode4 + (shortlinkAction != null ? shortlinkAction.hashCode() : 0)) * 37;
            String str2 = this.title;
            int hashCode6 = hashCode5 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BrandBanner.Builder builder = new BrandBanner.Builder(12);
            builder.title = this.local_cash_amount;
            builder.icon = this.image;
            builder.subtitle = this.body;
            builder.action = this.primary_button_shortlink;
            builder.icon_background_color = this.title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.local_cash_amount;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("local_cash_amount=", l, arrayList);
            }
            LocalImage localImage = this.image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
            }
            String str = this.body;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "body=", arrayList);
            }
            ShortlinkAction shortlinkAction = this.primary_button_shortlink;
            if (shortlinkAction != null) {
                arrayList.add("primary_button_shortlink=" + shortlinkAction);
            }
            String str2 = this.title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashDetails{", "}", 0, null, null, 56);
        }
    }

    static {
        POSBrandOnboarding$Companion$ADAPTER$1 pOSBrandOnboarding$Companion$ADAPTER$1 = new POSBrandOnboarding$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(POSBrandOnboarding.class), "type.googleapis.com/squareup.cash.local.client.v1.POSBrandOnboarding", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = pOSBrandOnboarding$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pOSBrandOnboarding$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POSBrandOnboarding(LocalCashDetails localCashDetails, BrandCard brandCard, String str, String str2, String str3, Long l, String str4, String str5, HowItWorks howItWorks, LegalConsent legalConsent, ShortlinkAction shortlinkAction, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.local_cash_card = localCashDetails;
        this.brand_card = brandCard;
        this.fine_print = str;
        this.close_button_client_route = str2;
        this.loading_text = str3;
        this.brand_card_slide_in_delay = l;
        this.title = str4;
        this.body = str5;
        this.how_it_works = howItWorks;
        this.legal_consent = legalConsent;
        this.complete_onboarding_shortlink = shortlinkAction;
        this.continue_button_title = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof POSBrandOnboarding)) {
            return false;
        }
        POSBrandOnboarding pOSBrandOnboarding = (POSBrandOnboarding) obj;
        return Intrinsics.areEqual(unknownFields(), pOSBrandOnboarding.unknownFields()) && Intrinsics.areEqual(this.local_cash_card, pOSBrandOnboarding.local_cash_card) && Intrinsics.areEqual(this.brand_card, pOSBrandOnboarding.brand_card) && Intrinsics.areEqual(this.fine_print, pOSBrandOnboarding.fine_print) && Intrinsics.areEqual(this.close_button_client_route, pOSBrandOnboarding.close_button_client_route) && Intrinsics.areEqual(this.loading_text, pOSBrandOnboarding.loading_text) && Intrinsics.areEqual(this.brand_card_slide_in_delay, pOSBrandOnboarding.brand_card_slide_in_delay) && Intrinsics.areEqual(this.title, pOSBrandOnboarding.title) && Intrinsics.areEqual(this.body, pOSBrandOnboarding.body) && Intrinsics.areEqual(this.how_it_works, pOSBrandOnboarding.how_it_works) && Intrinsics.areEqual(this.legal_consent, pOSBrandOnboarding.legal_consent) && Intrinsics.areEqual(this.complete_onboarding_shortlink, pOSBrandOnboarding.complete_onboarding_shortlink) && Intrinsics.areEqual(this.continue_button_title, pOSBrandOnboarding.continue_button_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalCashDetails localCashDetails = this.local_cash_card;
        int hashCode2 = (hashCode + (localCashDetails != null ? localCashDetails.hashCode() : 0)) * 37;
        BrandCard brandCard = this.brand_card;
        int hashCode3 = (hashCode2 + (brandCard != null ? brandCard.hashCode() : 0)) * 37;
        String str = this.fine_print;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.close_button_client_route;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.loading_text;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.brand_card_slide_in_delay;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str4 = this.title;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.body;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        HowItWorks howItWorks = this.how_it_works;
        int hashCode10 = (hashCode9 + (howItWorks != null ? howItWorks.hashCode() : 0)) * 37;
        LegalConsent legalConsent = this.legal_consent;
        int hashCode11 = (hashCode10 + (legalConsent != null ? legalConsent.hashCode() : 0)) * 37;
        ShortlinkAction shortlinkAction = this.complete_onboarding_shortlink;
        int hashCode12 = (hashCode11 + (shortlinkAction != null ? shortlinkAction.hashCode() : 0)) * 37;
        String str6 = this.continue_button_title;
        int hashCode13 = hashCode12 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(15, false);
        builder.key_path_ref = this.local_cash_card;
        builder.float_literal = this.brand_card;
        builder.string_literal = this.fine_print;
        builder.bool_literal = this.close_button_client_route;
        builder.blob_literal = this.loading_text;
        builder.int_literal = this.brand_card_slide_in_delay;
        builder.unary_op = this.title;
        builder.binary_op = this.body;
        builder.conditional_op = this.how_it_works;
        builder.filter_op = this.legal_consent;
        builder.collection_literal = this.complete_onboarding_shortlink;
        builder.format_string_op = this.continue_button_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalCashDetails localCashDetails = this.local_cash_card;
        if (localCashDetails != null) {
            arrayList.add("local_cash_card=" + localCashDetails);
        }
        BrandCard brandCard = this.brand_card;
        if (brandCard != null) {
            arrayList.add("brand_card=" + brandCard);
        }
        String str = this.fine_print;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fine_print=", arrayList);
        }
        String str2 = this.close_button_client_route;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "close_button_client_route=", arrayList);
        }
        String str3 = this.loading_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "loading_text=", arrayList);
        }
        Long l = this.brand_card_slide_in_delay;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("brand_card_slide_in_delay=", l, arrayList);
        }
        String str4 = this.title;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "title=", arrayList);
        }
        String str5 = this.body;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "body=", arrayList);
        }
        HowItWorks howItWorks = this.how_it_works;
        if (howItWorks != null) {
            arrayList.add("how_it_works=" + howItWorks);
        }
        LegalConsent legalConsent = this.legal_consent;
        if (legalConsent != null) {
            arrayList.add("legal_consent=" + legalConsent);
        }
        ShortlinkAction shortlinkAction = this.complete_onboarding_shortlink;
        if (shortlinkAction != null) {
            arrayList.add("complete_onboarding_shortlink=" + shortlinkAction);
        }
        String str6 = this.continue_button_title;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "continue_button_title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "POSBrandOnboarding{", "}", 0, null, null, 56);
    }
}
