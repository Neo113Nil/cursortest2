package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.UriValidator;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.lending.OpaqueRoute;
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
import squareup.cash.bills.BillsApplet;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes8.dex */
public final class UiRewardProgramDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiRewardProgramDetails> CREATOR;
    public final List boost_details;
    public final BottomUpsell bottom_upsell;
    public final List detail_rows;
    public final String footer_text;
    public final String reward_token;
    public final String styled_footer_text;

    /* loaded from: classes.dex */
    public final class BoostDetail extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BoostDetail> CREATOR;
        public final Icon arcade_icon;
        public final String detail_text;
        public final com.squareup.protos.rewardly.ui.common.Icon icon;
        public final IconAsset icon_asset;

        static {
            UiRewardProgramDetails$BoostDetail$Companion$ADAPTER$1 uiRewardProgramDetails$BoostDetail$Companion$ADAPTER$1 = new UiRewardProgramDetails$BoostDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BoostDetail.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardProgramDetails.BoostDetail", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
            ADAPTER = uiRewardProgramDetails$BoostDetail$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardProgramDetails$BoostDetail$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BoostDetail(com.squareup.protos.rewardly.ui.common.Icon icon, IconAsset iconAsset, String str, Icon icon2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.icon_asset = iconAsset;
            this.detail_text = str;
            this.arcade_icon = icon2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BoostDetail)) {
                return false;
            }
            BoostDetail boostDetail = (BoostDetail) obj;
            return Intrinsics.areEqual(unknownFields(), boostDetail.unknownFields()) && this.icon == boostDetail.icon && Intrinsics.areEqual(this.icon_asset, boostDetail.icon_asset) && Intrinsics.areEqual(this.detail_text, boostDetail.detail_text) && Intrinsics.areEqual(this.arcade_icon, boostDetail.arcade_icon);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            com.squareup.protos.rewardly.ui.common.Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            IconAsset iconAsset = this.icon_asset;
            int hashCode3 = (hashCode2 + (iconAsset != null ? iconAsset.hashCode() : 0)) * 37;
            String str = this.detail_text;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            Icon icon2 = this.arcade_icon;
            int hashCode5 = hashCode4 + (icon2 != null ? icon2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiDda.Builder builder = new UiDda.Builder(26);
            builder.account = this.icon;
            builder.enabled = this.icon_asset;
            builder.button = this.detail_text;
            builder.dda_form = this.arcade_icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            com.squareup.protos.rewardly.ui.common.Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            IconAsset iconAsset = this.icon_asset;
            if (iconAsset != null) {
                arrayList.add("icon_asset=" + iconAsset);
            }
            String str = this.detail_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "detail_text=", arrayList);
            }
            Icon icon2 = this.arcade_icon;
            if (icon2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BoostDetail{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes.dex */
    public final class BottomUpsell extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BottomUpsell> CREATOR;
        public final Icon arcade_icon;
        public final String body;
        public final String title;

        static {
            UiRewardProgramDetails$BottomUpsell$Companion$ADAPTER$1 uiRewardProgramDetails$BottomUpsell$Companion$ADAPTER$1 = new UiRewardProgramDetails$BottomUpsell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BottomUpsell.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardProgramDetails.BottomUpsell", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
            ADAPTER = uiRewardProgramDetails$BottomUpsell$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardProgramDetails$BottomUpsell$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomUpsell(Icon icon, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
            this.arcade_icon = icon;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BottomUpsell)) {
                return false;
            }
            BottomUpsell bottomUpsell = (BottomUpsell) obj;
            return Intrinsics.areEqual(unknownFields(), bottomUpsell.unknownFields()) && Intrinsics.areEqual(this.title, bottomUpsell.title) && Intrinsics.areEqual(this.body, bottomUpsell.body) && Intrinsics.areEqual(this.arcade_icon, bottomUpsell.arcade_icon);
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
            Icon icon = this.arcade_icon;
            int hashCode4 = hashCode3 + (icon != null ? icon.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Options.Builder builder = new GiftCard.Options.Builder(29);
            builder.label = this.title;
            builder.localizable_label = this.body;
            builder.client_scenario = this.arcade_icon;
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
            Icon icon = this.arcade_icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BottomUpsell{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes.dex */
    public final class DetailRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DetailRow> CREATOR;
        public final UriValidator RowAction;
        public final String label;
        public final String value;

        /* loaded from: classes8.dex */
        public final class OpenUrl extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OpenUrl> CREATOR;
            public final String url;

            static {
                UiRewardProgramDetails$DetailRow$OpenUrl$Companion$ADAPTER$1 uiRewardProgramDetails$DetailRow$OpenUrl$Companion$ADAPTER$1 = new UiRewardProgramDetails$DetailRow$OpenUrl$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenUrl.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardProgramDetails.DetailRow.OpenUrl", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
                ADAPTER = uiRewardProgramDetails$DetailRow$OpenUrl$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardProgramDetails$DetailRow$OpenUrl$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenUrl(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof OpenUrl)) {
                    return false;
                }
                OpenUrl openUrl = (OpenUrl) obj;
                return Intrinsics.areEqual(unknownFields(), openUrl.unknownFields()) && Intrinsics.areEqual(this.url, openUrl.url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.url;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                OpaqueRoute.Builder builder = new OpaqueRoute.Builder(28);
                builder.client_route = this.url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OpenUrl{", "}", 0, null, null, 56);
            }
        }

        /* loaded from: classes8.dex */
        public final class ReadOnly extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ReadOnly> CREATOR;

            static {
                UiRewardProgramDetails$DetailRow$ReadOnly$Companion$ADAPTER$1 uiRewardProgramDetails$DetailRow$ReadOnly$Companion$ADAPTER$1 = new UiRewardProgramDetails$DetailRow$ReadOnly$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReadOnly.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardProgramDetails.DetailRow.ReadOnly", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
                ADAPTER = uiRewardProgramDetails$DetailRow$ReadOnly$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardProgramDetails$DetailRow$ReadOnly$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadOnly(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof ReadOnly) && Intrinsics.areEqual(unknownFields(), ((ReadOnly) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(6);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "ReadOnly{}";
            }
        }

        static {
            UiRewardProgramDetails$DetailRow$Companion$ADAPTER$1 uiRewardProgramDetails$DetailRow$Companion$ADAPTER$1 = new UiRewardProgramDetails$DetailRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailRow.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardProgramDetails.DetailRow", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
            ADAPTER = uiRewardProgramDetails$DetailRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardProgramDetails$DetailRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailRow(String str, String str2, UriValidator uriValidator, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = str2;
            this.RowAction = uriValidator;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) obj;
            return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.label, detailRow.label) && Intrinsics.areEqual(this.value, detailRow.value) && Intrinsics.areEqual(this.RowAction, detailRow.RowAction);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            UriValidator uriValidator = this.RowAction;
            int hashCode4 = hashCode3 + (uriValidator != null ? uriValidator.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.Builder builder = new BillsApplet.Builder(1);
            builder.action = this.label;
            builder.full_applet = this.value;
            builder.half_applet = this.RowAction;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.value;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
            }
            UriValidator uriValidator = this.RowAction;
            if (uriValidator != null) {
                arrayList.add("RowAction=" + uriValidator);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
        }
    }

    static {
        UiRewardProgramDetails$Companion$ADAPTER$1 uiRewardProgramDetails$Companion$ADAPTER$1 = new UiRewardProgramDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiRewardProgramDetails.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardProgramDetails", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = uiRewardProgramDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardProgramDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiRewardProgramDetails(String str, List list, List list2, String str2, String str3, BottomUpsell bottomUpsell, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.reward_token = str;
        this.footer_text = str2;
        this.styled_footer_text = str3;
        this.bottom_upsell = bottomUpsell;
        this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
        this.boost_details = TransactorKt.immutableCopyOf("boost_details", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiRewardProgramDetails)) {
            return false;
        }
        UiRewardProgramDetails uiRewardProgramDetails = (UiRewardProgramDetails) obj;
        return Intrinsics.areEqual(unknownFields(), uiRewardProgramDetails.unknownFields()) && Intrinsics.areEqual(this.reward_token, uiRewardProgramDetails.reward_token) && Intrinsics.areEqual(this.detail_rows, uiRewardProgramDetails.detail_rows) && Intrinsics.areEqual(this.boost_details, uiRewardProgramDetails.boost_details) && Intrinsics.areEqual(this.footer_text, uiRewardProgramDetails.footer_text) && Intrinsics.areEqual(this.styled_footer_text, uiRewardProgramDetails.styled_footer_text) && Intrinsics.areEqual(this.bottom_upsell, uiRewardProgramDetails.bottom_upsell);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.reward_token;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.detail_rows), 37, this.boost_details);
        String str2 = this.footer_text;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.styled_footer_text;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        BottomUpsell bottomUpsell = this.bottom_upsell;
        int hashCode4 = hashCode3 + (bottomUpsell != null ? bottomUpsell.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(26, false);
        builder.full_name = this.reward_token;
        builder.full_cashtag = this.detail_rows;
        builder.cashtag_url_enabled = this.boost_details;
        builder.photo_url = this.footer_text;
        builder.synopsis = this.styled_footer_text;
        builder.is_verified_account = this.bottom_upsell;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.reward_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reward_token=", arrayList);
        }
        List list = this.detail_rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, list);
        }
        List list2 = this.boost_details;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("boost_details=", arrayList, list2);
        }
        String str2 = this.footer_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "footer_text=", arrayList);
        }
        String str3 = this.styled_footer_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "styled_footer_text=", arrayList);
        }
        BottomUpsell bottomUpsell = this.bottom_upsell;
        if (bottomUpsell != null) {
            arrayList.add("bottom_upsell=" + bottomUpsell);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiRewardProgramDetails{", "}", 0, null, null, 56);
    }
}
