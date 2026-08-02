package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.giftly.GiftCardDetails;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
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
import squareup.cash.savings.GoalFolder;
import xyz.block.protos.genie.Binding;

/* loaded from: classes8.dex */
public final class LendingInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LendingInfo> CREATOR;
    public final AccessData access_data;
    public final FirstTimeBorrowData first_time_borrow_data;
    public final Boolean potential_future_borrower;

    public final class AccessData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AccessData> CREATOR;
        public final Button button;
        public final List detail_rows;
        public final String detail_rows_header;
        public final String footer_markdown;
        public final String header;
        public final String image_url;
        public final LocalizableString localizable_detail_rows_header;
        public final LocalizableString localizable_footer_markdown;
        public final LocalizableString localizable_header;
        public final LocalizableString localizable_subtitle;
        public final String subtitle;

        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final String action_flow_type;
            public final Boolean enabled;
            public final Icon icon;
            public final LocalizableString localizable_text;
            public final String text;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Icon implements WireEnum {
                public static final /* synthetic */ Icon[] $VALUES;
                public static final LendingInfo$AccessData$Button$Icon$Companion$ADAPTER$1 ADAPTER;
                public static final Icon CHECKMARK;
                public static final Trigger.Companion Companion;

                static {
                    Icon icon = new Icon("CHECKMARK", 0);
                    CHECKMARK = icon;
                    $VALUES = new Icon[]{icon};
                    Companion = new Trigger.Companion();
                    ADAPTER = new LendingInfo$AccessData$Button$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);
                }

                public static final Icon fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return CHECKMARK;
                    }
                    return null;
                }

                public static Icon valueOf(String str) {
                    return (Icon) Enum.valueOf(Icon.class, str);
                }

                public static Icon[] values() {
                    return (Icon[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return 1;
                }
            }

            static {
                LendingInfo$AccessData$Button$Companion$ADAPTER$1 lendingInfo$AccessData$Button$Companion$ADAPTER$1 = new LendingInfo$AccessData$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.AccessData.Button", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = lendingInfo$AccessData$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$AccessData$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, Icon icon, Boolean bool, String str2, LocalizableString localizableString, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.icon = icon;
                this.enabled = bool;
                this.action_flow_type = str2;
                this.localizable_text = localizableString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && this.icon == button.icon && Intrinsics.areEqual(this.enabled, button.enabled) && Intrinsics.areEqual(this.action_flow_type, button.action_flow_type) && Intrinsics.areEqual(this.localizable_text, button.localizable_text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
                Boolean bool = this.enabled;
                int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                String str2 = this.action_flow_type;
                int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_text;
                int hashCode6 = hashCode5 + (localizableString != null ? localizableString.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Binding.Builder builder = new Binding.Builder(3);
                builder.key_path = this.text;
                builder.get_transform = this.icon;
                builder.set_transform = this.enabled;
                builder.validation = this.action_flow_type;
                builder.on_invalid = this.localizable_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    arrayList.add("icon=" + icon);
                }
                Boolean bool = this.enabled;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
                }
                String str2 = this.action_flow_type;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_flow_type=", arrayList);
                }
                LocalizableString localizableString = this.localizable_text;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        public final class DetailRow extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DetailRow> CREATOR;
            public final Icon icon;
            public final LocalizableString localizable_subtitle;
            public final LocalizableString localizable_title;
            public final String subtitle;
            public final String title;

            public enum Icon implements WireEnum {
                CARD(1),
                DEPOSIT(2),
                BANK(3),
                CHECK(4);

                public final int value;
                public static final KeyScope.Companion Companion = new KeyScope.Companion();
                public static final LendingInfo$AccessData$DetailRow$Icon$Companion$ADAPTER$1 ADAPTER = new LendingInfo$AccessData$DetailRow$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

                Icon(int i) {
                    this.value = i;
                }

                public static final Icon fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return CARD;
                    }
                    if (i == 2) {
                        return DEPOSIT;
                    }
                    if (i == 3) {
                        return BANK;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return CHECK;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                LendingInfo$AccessData$DetailRow$Companion$ADAPTER$1 lendingInfo$AccessData$DetailRow$Companion$ADAPTER$1 = new LendingInfo$AccessData$DetailRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailRow.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.AccessData.DetailRow", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = lendingInfo$AccessData$DetailRow$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$AccessData$DetailRow$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetailRow(Icon icon, String str, String str2, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = icon;
                this.title = str;
                this.subtitle = str2;
                this.localizable_title = localizableString;
                this.localizable_subtitle = localizableString2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DetailRow)) {
                    return false;
                }
                DetailRow detailRow = (DetailRow) obj;
                return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && this.icon == detailRow.icon && Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.subtitle, detailRow.subtitle) && Intrinsics.areEqual(this.localizable_title, detailRow.localizable_title) && Intrinsics.areEqual(this.localizable_subtitle, detailRow.localizable_subtitle);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                String str = this.title;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.subtitle;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_title;
                int hashCode5 = (hashCode4 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                LocalizableString localizableString2 = this.localizable_subtitle;
                int hashCode6 = hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Binding.Builder builder = new Binding.Builder(4);
                builder.key_path = this.icon;
                builder.get_transform = this.title;
                builder.set_transform = this.subtitle;
                builder.validation = this.localizable_title;
                builder.on_invalid = this.localizable_subtitle;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Icon icon = this.icon;
                if (icon != null) {
                    arrayList.add("icon=" + icon);
                }
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.subtitle;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                }
                LocalizableString localizableString = this.localizable_title;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
                }
                LocalizableString localizableString2 = this.localizable_subtitle;
                if (localizableString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
            }
        }

        static {
            LendingInfo$AccessData$Companion$ADAPTER$1 lendingInfo$AccessData$Companion$ADAPTER$1 = new LendingInfo$AccessData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AccessData.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.AccessData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = lendingInfo$AccessData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$AccessData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccessData(String str, String str2, String str3, List list, String str4, Button button, String str5, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, LocalizableString localizableString4, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.image_url = str;
            this.header = str2;
            this.subtitle = str3;
            this.footer_markdown = str4;
            this.button = button;
            this.detail_rows_header = str5;
            this.localizable_header = localizableString;
            this.localizable_subtitle = localizableString2;
            this.localizable_footer_markdown = localizableString3;
            this.localizable_detail_rows_header = localizableString4;
            this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccessData)) {
                return false;
            }
            AccessData accessData = (AccessData) obj;
            return Intrinsics.areEqual(unknownFields(), accessData.unknownFields()) && Intrinsics.areEqual(this.image_url, accessData.image_url) && Intrinsics.areEqual(this.header, accessData.header) && Intrinsics.areEqual(this.subtitle, accessData.subtitle) && Intrinsics.areEqual(this.detail_rows, accessData.detail_rows) && Intrinsics.areEqual(this.footer_markdown, accessData.footer_markdown) && Intrinsics.areEqual(this.button, accessData.button) && Intrinsics.areEqual(this.detail_rows_header, accessData.detail_rows_header) && Intrinsics.areEqual(this.localizable_header, accessData.localizable_header) && Intrinsics.areEqual(this.localizable_subtitle, accessData.localizable_subtitle) && Intrinsics.areEqual(this.localizable_footer_markdown, accessData.localizable_footer_markdown) && Intrinsics.areEqual(this.localizable_detail_rows_header, accessData.localizable_detail_rows_header);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.image_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.header;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.subtitle;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.detail_rows);
            String str4 = this.footer_markdown;
            int hashCode4 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode5 = (hashCode4 + (button != null ? button.hashCode() : 0)) * 37;
            String str5 = this.detail_rows_header;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_header;
            int hashCode7 = (hashCode6 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_subtitle;
            int hashCode8 = (hashCode7 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            LocalizableString localizableString3 = this.localizable_footer_markdown;
            int hashCode9 = (hashCode8 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
            LocalizableString localizableString4 = this.localizable_detail_rows_header;
            int hashCode10 = hashCode9 + (localizableString4 != null ? localizableString4.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Job.Builder builder = new Job.Builder(17);
            builder.token = this.image_url;
            builder.merchant_token = this.header;
            builder.title = this.subtitle;
            builder.default_wage = this.detail_rows;
            builder.created_at_timestamp_ms = this.footer_markdown;
            builder.updated_at_timestamp_ms = this.button;
            builder.deleted_at_timestamp_ms = this.detail_rows_header;
            builder.team_member_count = this.localizable_header;
            builder.version = this.localizable_subtitle;
            builder.tip_eligible = this.localizable_footer_markdown;
            builder.default_color_scheme = this.localizable_detail_rows_header;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.image_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
            }
            String str2 = this.header;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header=", arrayList);
            }
            String str3 = this.subtitle;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subtitle=", arrayList);
            }
            List list = this.detail_rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, list);
            }
            String str4 = this.footer_markdown;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "footer_markdown=", arrayList);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            String str5 = this.detail_rows_header;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "detail_rows_header=", arrayList);
            }
            LocalizableString localizableString = this.localizable_header;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_header=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_subtitle;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
            }
            LocalizableString localizableString3 = this.localizable_footer_markdown;
            if (localizableString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_footer_markdown=", localizableString3, arrayList);
            }
            LocalizableString localizableString4 = this.localizable_detail_rows_header;
            if (localizableString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_detail_rows_header=", localizableString4, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AccessData{", "}", 0, null, null, 56);
        }
    }

    public final class FirstTimeBorrowData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FirstTimeBorrowData> CREATOR;
        public final ConfirmationScreen confirmation_screen;
        public final HomeScreen home_screen;
        public final LimitCheckerScreen limit_checker_screen;
        public final LimitInfoScreen limit_info_screen;

        public final class ConfirmationScreen extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ConfirmationScreen> CREATOR;
            public final Animation animation;
            public final String body;
            public final Long credit_limit_cents;
            public final String primary_button_title;
            public final String secondary_button_title;
            public final String title;

            static {
                LendingInfo$FirstTimeBorrowData$ConfirmationScreen$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$ConfirmationScreen$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$ConfirmationScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConfirmationScreen.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.ConfirmationScreen", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = lendingInfo$FirstTimeBorrowData$ConfirmationScreen$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$ConfirmationScreen$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmationScreen(String str, Animation animation, String str2, String str3, String str4, Long l, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.animation = animation;
                this.body = str2;
                this.primary_button_title = str3;
                this.secondary_button_title = str4;
                this.credit_limit_cents = l;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ConfirmationScreen)) {
                    return false;
                }
                ConfirmationScreen confirmationScreen = (ConfirmationScreen) obj;
                return Intrinsics.areEqual(unknownFields(), confirmationScreen.unknownFields()) && Intrinsics.areEqual(this.title, confirmationScreen.title) && Intrinsics.areEqual(this.animation, confirmationScreen.animation) && Intrinsics.areEqual(this.body, confirmationScreen.body) && Intrinsics.areEqual(this.primary_button_title, confirmationScreen.primary_button_title) && Intrinsics.areEqual(this.secondary_button_title, confirmationScreen.secondary_button_title) && Intrinsics.areEqual(this.credit_limit_cents, confirmationScreen.credit_limit_cents);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Animation animation = this.animation;
                int hashCode3 = (hashCode2 + (animation != null ? animation.hashCode() : 0)) * 37;
                String str2 = this.body;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.primary_button_title;
                int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.secondary_button_title;
                int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
                Long l = this.credit_limit_cents;
                int hashCode7 = hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiPublicProfile.Builder builder = new UiPublicProfile.Builder(22, false);
                builder.full_name = this.title;
                builder.full_cashtag = this.animation;
                builder.photo_url = this.body;
                builder.synopsis = this.primary_button_title;
                builder.cashtag_url_enabled = this.secondary_button_title;
                builder.is_verified_account = this.credit_limit_cents;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                Animation animation = this.animation;
                if (animation != null) {
                    arrayList.add("animation=" + animation);
                }
                String str2 = this.body;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
                }
                String str3 = this.primary_button_title;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "primary_button_title=", arrayList);
                }
                String str4 = this.secondary_button_title;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "secondary_button_title=", arrayList);
                }
                Long l = this.credit_limit_cents;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("credit_limit_cents=", l, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmationScreen{", "}", 0, null, null, 56);
            }
        }

        public final class HomeScreen extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<HomeScreen> CREATOR;
            public final BulletContent bullets;
            public final LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute button_routing;
            public final String button_title;
            public final Image image;
            public final LocalizableString localizable_button_title;
            public final LocalizableString localizable_subtitle;
            public final LocalizableString localizable_title;
            public final NoticeContent notice_content;
            public final PromoContent promo_content;
            public final String subtitle;
            public final String title;

            public final class BulletContent extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<BulletContent> CREATOR;
                public final List bullets;
                public final List localizable_bullets;
                public final SupportData support_data;

                public final class SupportData extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<SupportData> CREATOR;
                    public final String button_title;
                    public final LocalizableString localizable_button_title;
                    public final String support_node;

                    static {
                        LendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$SupportData$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$SupportData$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$SupportData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportData.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                        ADAPTER = lendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$SupportData$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$SupportData$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public SupportData(String str, String str2, LocalizableString localizableString, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.button_title = str;
                        this.support_node = str2;
                        this.localizable_button_title = localizableString;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof SupportData)) {
                            return false;
                        }
                        SupportData supportData = (SupportData) obj;
                        return Intrinsics.areEqual(unknownFields(), supportData.unknownFields()) && Intrinsics.areEqual(this.button_title, supportData.button_title) && Intrinsics.areEqual(this.support_node, supportData.support_node) && Intrinsics.areEqual(this.localizable_button_title, supportData.localizable_button_title);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        String str = this.button_title;
                        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                        String str2 = this.support_node;
                        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                        LocalizableString localizableString = this.localizable_button_title;
                        int hashCode4 = hashCode3 + (localizableString != null ? localizableString.hashCode() : 0);
                        this.hashCode = hashCode4;
                        return hashCode4;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        GiftCardDetails.Builder builder = new GiftCardDetails.Builder(4);
                        builder.icon = this.button_title;
                        builder.note = this.support_node;
                        builder.localizable_note = this.localizable_button_title;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        String str = this.button_title;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_title=", arrayList);
                        }
                        String str2 = this.support_node;
                        if (str2 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "support_node=", arrayList);
                        }
                        LocalizableString localizableString = this.localizable_button_title;
                        if (localizableString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("localizable_button_title=", localizableString, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportData{", "}", 0, null, null, 56);
                    }
                }

                static {
                    LendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BulletContent.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = lendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$HomeScreen$BulletContent$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BulletContent(List list, SupportData supportData, List list2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
                    this.support_data = supportData;
                    this.bullets = TransactorKt.immutableCopyOf("bullets", list);
                    this.localizable_bullets = TransactorKt.immutableCopyOf("localizable_bullets", list2);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof BulletContent)) {
                        return false;
                    }
                    BulletContent bulletContent = (BulletContent) obj;
                    return Intrinsics.areEqual(unknownFields(), bulletContent.unknownFields()) && Intrinsics.areEqual(this.bullets, bulletContent.bullets) && Intrinsics.areEqual(this.support_data, bulletContent.support_data) && Intrinsics.areEqual(this.localizable_bullets, bulletContent.localizable_bullets);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.bullets);
                    SupportData supportData = this.support_data;
                    int hashCode = this.localizable_bullets.hashCode() + ((m + (supportData != null ? supportData.hashCode() : 0)) * 37);
                    this.hashCode = hashCode;
                    return hashCode;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    GiftCard.Options.Builder builder = new GiftCard.Options.Builder(22);
                    builder.label = this.bullets;
                    builder.localizable_label = this.support_data;
                    builder.client_scenario = this.localizable_bullets;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    List list = this.bullets;
                    if (!list.isEmpty()) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("bullets=", arrayList, list);
                    }
                    SupportData supportData = this.support_data;
                    if (supportData != null) {
                        arrayList.add("support_data=" + supportData);
                    }
                    List list2 = this.localizable_bullets;
                    if (!list2.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("localizable_bullets=", arrayList, list2);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "BulletContent{", "}", 0, null, null, 56);
                }
            }

            public final class NoticeContent extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<NoticeContent> CREATOR;
                public final LocalizableString localizable_notice_body;
                public final LocalizableString localizable_notice_title;
                public final String notice_body;
                public final String notice_title;

                static {
                    LendingInfo$FirstTimeBorrowData$HomeScreen$NoticeContent$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$HomeScreen$NoticeContent$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$HomeScreen$NoticeContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NoticeContent.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.HomeScreen.NoticeContent", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = lendingInfo$FirstTimeBorrowData$HomeScreen$NoticeContent$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$HomeScreen$NoticeContent$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NoticeContent(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.notice_title = str;
                    this.notice_body = str2;
                    this.localizable_notice_title = localizableString;
                    this.localizable_notice_body = localizableString2;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof NoticeContent)) {
                        return false;
                    }
                    NoticeContent noticeContent = (NoticeContent) obj;
                    return Intrinsics.areEqual(unknownFields(), noticeContent.unknownFields()) && Intrinsics.areEqual(this.notice_title, noticeContent.notice_title) && Intrinsics.areEqual(this.notice_body, noticeContent.notice_body) && Intrinsics.areEqual(this.localizable_notice_title, noticeContent.localizable_notice_title) && Intrinsics.areEqual(this.localizable_notice_body, noticeContent.localizable_notice_body);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.notice_title;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.notice_body;
                    int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    LocalizableString localizableString = this.localizable_notice_title;
                    int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                    LocalizableString localizableString2 = this.localizable_notice_body;
                    int hashCode5 = hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0);
                    this.hashCode = hashCode5;
                    return hashCode5;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Loan.DetailRow.Builder builder = new Loan.DetailRow.Builder(1);
                    builder.label = this.notice_title;
                    builder.value = this.notice_body;
                    builder.localizable_label = this.localizable_notice_title;
                    builder.localizable_value = this.localizable_notice_body;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.notice_title;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "notice_title=", arrayList);
                    }
                    String str2 = this.notice_body;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "notice_body=", arrayList);
                    }
                    LocalizableString localizableString = this.localizable_notice_title;
                    if (localizableString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("localizable_notice_title=", localizableString, arrayList);
                    }
                    LocalizableString localizableString2 = this.localizable_notice_body;
                    if (localizableString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("localizable_notice_body=", localizableString2, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "NoticeContent{", "}", 0, null, null, 56);
                }
            }

            public final class PromoContent extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<PromoContent> CREATOR;
                public final String button_title;
                public final Image image;
                public final LocalizableString localizable_button_title;
                public final LocalizableString localizable_subtitle;
                public final LocalizableString localizable_title;
                public final String subtitle;
                public final zzjm support_node_routing;
                public final String title;

                static {
                    LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PromoContent.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.HomeScreen.PromoContent", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = lendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PromoContent(String str, String str2, String str3, zzjm zzjmVar, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, Image image, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.button_title = str3;
                    this.support_node_routing = zzjmVar;
                    this.localizable_title = localizableString;
                    this.localizable_subtitle = localizableString2;
                    this.localizable_button_title = localizableString3;
                    this.image = image;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof PromoContent)) {
                        return false;
                    }
                    PromoContent promoContent = (PromoContent) obj;
                    return Intrinsics.areEqual(unknownFields(), promoContent.unknownFields()) && Intrinsics.areEqual(this.title, promoContent.title) && Intrinsics.areEqual(this.subtitle, promoContent.subtitle) && Intrinsics.areEqual(this.button_title, promoContent.button_title) && Intrinsics.areEqual(this.support_node_routing, promoContent.support_node_routing) && Intrinsics.areEqual(this.localizable_title, promoContent.localizable_title) && Intrinsics.areEqual(this.localizable_subtitle, promoContent.localizable_subtitle) && Intrinsics.areEqual(this.localizable_button_title, promoContent.localizable_button_title) && Intrinsics.areEqual(this.image, promoContent.image);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.title;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.subtitle;
                    int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    String str3 = this.button_title;
                    int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                    zzjm zzjmVar = this.support_node_routing;
                    int hashCode5 = (hashCode4 + (zzjmVar != null ? zzjmVar.hashCode() : 0)) * 37;
                    LocalizableString localizableString = this.localizable_title;
                    int hashCode6 = (hashCode5 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                    LocalizableString localizableString2 = this.localizable_subtitle;
                    int hashCode7 = (hashCode6 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
                    LocalizableString localizableString3 = this.localizable_button_title;
                    int hashCode8 = (hashCode7 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
                    Image image = this.image;
                    int hashCode9 = hashCode8 + (image != null ? image.hashCode() : 0);
                    this.hashCode = hashCode9;
                    return hashCode9;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    GoalFolder.Builder builder = new GoalFolder.Builder(8);
                    builder.token = this.title;
                    builder.icon_unicode = this.subtitle;
                    builder.completion_token = this.button_title;
                    builder.label = this.support_node_routing;
                    builder.goal_flow_parameters = this.localizable_title;
                    builder.met_goal = this.localizable_subtitle;
                    builder.goal_amount = this.localizable_button_title;
                    builder.goal_progress_percentage = this.image;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.title;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                    }
                    String str2 = this.subtitle;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                    }
                    String str3 = this.button_title;
                    if (str3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_title=", arrayList);
                    }
                    zzjm zzjmVar = this.support_node_routing;
                    if (zzjmVar != null) {
                        arrayList.add("support_node_routing=" + zzjmVar);
                    }
                    LocalizableString localizableString = this.localizable_title;
                    if (localizableString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
                    }
                    LocalizableString localizableString2 = this.localizable_subtitle;
                    if (localizableString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
                    }
                    LocalizableString localizableString3 = this.localizable_button_title;
                    if (localizableString3 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("localizable_button_title=", localizableString3, arrayList);
                    }
                    Image image = this.image;
                    if (image != null) {
                        SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "PromoContent{", "}", 0, null, null, 56);
                }
            }

            static {
                LendingInfo$FirstTimeBorrowData$HomeScreen$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$HomeScreen$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$HomeScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HomeScreen.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.HomeScreen", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = lendingInfo$FirstTimeBorrowData$HomeScreen$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$HomeScreen$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HomeScreen(String str, String str2, Image image, BulletContent bulletContent, String str3, PromoContent promoContent, NoticeContent noticeContent, LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.subtitle = str2;
                this.image = image;
                this.bullets = bulletContent;
                this.button_title = str3;
                this.promo_content = promoContent;
                this.notice_content = noticeContent;
                this.button_routing = lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute;
                this.localizable_title = localizableString;
                this.localizable_subtitle = localizableString2;
                this.localizable_button_title = localizableString3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof HomeScreen)) {
                    return false;
                }
                HomeScreen homeScreen = (HomeScreen) obj;
                return Intrinsics.areEqual(unknownFields(), homeScreen.unknownFields()) && Intrinsics.areEqual(this.title, homeScreen.title) && Intrinsics.areEqual(this.subtitle, homeScreen.subtitle) && Intrinsics.areEqual(this.image, homeScreen.image) && Intrinsics.areEqual(this.bullets, homeScreen.bullets) && Intrinsics.areEqual(this.button_title, homeScreen.button_title) && Intrinsics.areEqual(this.promo_content, homeScreen.promo_content) && Intrinsics.areEqual(this.notice_content, homeScreen.notice_content) && Intrinsics.areEqual(this.button_routing, homeScreen.button_routing) && Intrinsics.areEqual(this.localizable_title, homeScreen.localizable_title) && Intrinsics.areEqual(this.localizable_subtitle, homeScreen.localizable_subtitle) && Intrinsics.areEqual(this.localizable_button_title, homeScreen.localizable_button_title);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.subtitle;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                Image image = this.image;
                int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
                BulletContent bulletContent = this.bullets;
                int hashCode5 = (hashCode4 + (bulletContent != null ? bulletContent.hashCode() : 0)) * 37;
                String str3 = this.button_title;
                int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
                PromoContent promoContent = this.promo_content;
                int hashCode7 = (hashCode6 + (promoContent != null ? promoContent.hashCode() : 0)) * 37;
                NoticeContent noticeContent = this.notice_content;
                int hashCode8 = (hashCode7 + (noticeContent != null ? noticeContent.hashCode() : 0)) * 37;
                LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute = this.button_routing;
                int hashCode9 = (hashCode8 + (lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute != null ? lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute.value.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_title;
                int hashCode10 = (hashCode9 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                LocalizableString localizableString2 = this.localizable_subtitle;
                int hashCode11 = (hashCode10 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
                LocalizableString localizableString3 = this.localizable_button_title;
                int hashCode12 = hashCode11 + (localizableString3 != null ? localizableString3.hashCode() : 0);
                this.hashCode = hashCode12;
                return hashCode12;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Job.Builder builder = new Job.Builder(18);
                builder.token = this.title;
                builder.merchant_token = this.subtitle;
                builder.default_wage = this.image;
                builder.created_at_timestamp_ms = this.bullets;
                builder.title = this.button_title;
                builder.updated_at_timestamp_ms = this.promo_content;
                builder.deleted_at_timestamp_ms = this.notice_content;
                builder.team_member_count = this.button_routing;
                builder.version = this.localizable_title;
                builder.tip_eligible = this.localizable_subtitle;
                builder.default_color_scheme = this.localizable_button_title;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.subtitle;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                }
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                BulletContent bulletContent = this.bullets;
                if (bulletContent != null) {
                    arrayList.add("bullets=" + bulletContent);
                }
                String str3 = this.button_title;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_title=", arrayList);
                }
                PromoContent promoContent = this.promo_content;
                if (promoContent != null) {
                    arrayList.add("promo_content=" + promoContent);
                }
                NoticeContent noticeContent = this.notice_content;
                if (noticeContent != null) {
                    arrayList.add("notice_content=" + noticeContent);
                }
                LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute = this.button_routing;
                if (lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute != null) {
                    arrayList.add("button_routing=" + lendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute);
                }
                LocalizableString localizableString = this.localizable_title;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
                }
                LocalizableString localizableString2 = this.localizable_subtitle;
                if (localizableString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
                }
                LocalizableString localizableString3 = this.localizable_button_title;
                if (localizableString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_button_title=", localizableString3, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "HomeScreen{", "}", 0, null, null, 56);
            }
        }

        public final class LimitCheckerScreen extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LimitCheckerScreen> CREATOR;
            public final Integer animation_millis;
            public final List bullets;
            public final String subtitle;
            public final String title;

            static {
                LendingInfo$FirstTimeBorrowData$LimitCheckerScreen$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$LimitCheckerScreen$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$LimitCheckerScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitCheckerScreen.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.LimitCheckerScreen", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = lendingInfo$FirstTimeBorrowData$LimitCheckerScreen$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$LimitCheckerScreen$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LimitCheckerScreen(String str, String str2, List list, Integer num, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.title = str;
                this.subtitle = str2;
                this.animation_millis = num;
                this.bullets = TransactorKt.immutableCopyOf("bullets", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LimitCheckerScreen)) {
                    return false;
                }
                LimitCheckerScreen limitCheckerScreen = (LimitCheckerScreen) obj;
                return Intrinsics.areEqual(unknownFields(), limitCheckerScreen.unknownFields()) && Intrinsics.areEqual(this.title, limitCheckerScreen.title) && Intrinsics.areEqual(this.subtitle, limitCheckerScreen.subtitle) && Intrinsics.areEqual(this.bullets, limitCheckerScreen.bullets) && Intrinsics.areEqual(this.animation_millis, limitCheckerScreen.animation_millis);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.subtitle;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.bullets);
                Integer num = this.animation_millis;
                int hashCode3 = m + (num != null ? Integer.hashCode(num.intValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiDda.Builder builder = new UiDda.Builder(20);
                builder.account = this.title;
                builder.enabled = this.subtitle;
                builder.button = this.bullets;
                builder.dda_form = this.animation_millis;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.subtitle;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                }
                List list = this.bullets;
                if (!list.isEmpty()) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("bullets=", arrayList, list);
                }
                Integer num = this.animation_millis;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("animation_millis=", num, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LimitCheckerScreen{", "}", 0, null, null, 56);
            }
        }

        public final class LimitInfoScreen extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LimitInfoScreen> CREATOR;
            public final List detail_rows;
            public final String dismiss_button_title;
            public final String header;
            public final String subtitle;

            public final class DetailRow extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<DetailRow> CREATOR;
                public final Icon icon;
                public final String subtitle;
                public final String title;

                public enum Icon implements WireEnum {
                    CARD(1),
                    DEPOSIT(2),
                    BANK(3);

                    public final int value;
                    public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
                    public static final LendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Icon$Companion$ADAPTER$1 ADAPTER = new LendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

                    Icon(int i) {
                        this.value = i;
                    }

                    public static final Icon fromValue(int i) {
                        Companion.getClass();
                        if (i == 1) {
                            return CARD;
                        }
                        if (i == 2) {
                            return DEPOSIT;
                        }
                        if (i != 3) {
                            return null;
                        }
                        return BANK;
                    }

                    @Override // com.squareup.wire.WireEnum
                    public final int getValue() {
                        return this.value;
                    }
                }

                static {
                    LendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailRow.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                    ADAPTER = lendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DetailRow(Icon icon, String str, String str2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.icon = icon;
                    this.title = str;
                    this.subtitle = str2;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof DetailRow)) {
                        return false;
                    }
                    DetailRow detailRow = (DetailRow) obj;
                    return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && this.icon == detailRow.icon && Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.subtitle, detailRow.subtitle);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Icon icon = this.icon;
                    int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                    String str = this.title;
                    int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.subtitle;
                    int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
                    this.hashCode = hashCode4;
                    return hashCode4;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    GiftCard.Options.Builder builder = new GiftCard.Options.Builder(23);
                    builder.localizable_label = this.icon;
                    builder.label = this.title;
                    builder.client_scenario = this.subtitle;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Icon icon = this.icon;
                    if (icon != null) {
                        arrayList.add("icon=" + icon);
                    }
                    String str = this.title;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                    }
                    String str2 = this.subtitle;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
                }
            }

            static {
                LendingInfo$FirstTimeBorrowData$LimitInfoScreen$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$LimitInfoScreen$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$LimitInfoScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitInfoScreen.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData.LimitInfoScreen", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
                ADAPTER = lendingInfo$FirstTimeBorrowData$LimitInfoScreen$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$LimitInfoScreen$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LimitInfoScreen(String str, String str2, String str3, List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.header = str;
                this.subtitle = str2;
                this.dismiss_button_title = str3;
                this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LimitInfoScreen)) {
                    return false;
                }
                LimitInfoScreen limitInfoScreen = (LimitInfoScreen) obj;
                return Intrinsics.areEqual(unknownFields(), limitInfoScreen.unknownFields()) && Intrinsics.areEqual(this.header, limitInfoScreen.header) && Intrinsics.areEqual(this.subtitle, limitInfoScreen.subtitle) && Intrinsics.areEqual(this.detail_rows, limitInfoScreen.detail_rows) && Intrinsics.areEqual(this.dismiss_button_title, limitInfoScreen.dismiss_button_title);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.header;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.subtitle;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.detail_rows);
                String str3 = this.dismiss_button_title;
                int hashCode3 = m + (str3 != null ? str3.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Action.SessionAuthentication.Builder builder = new Action.SessionAuthentication.Builder(3);
                builder.associated_request_id = this.header;
                builder.associated_redirect_url = this.subtitle;
                builder.scopes = this.detail_rows;
                builder.associated_client_id = this.dismiss_button_title;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.header;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header=", arrayList);
                }
                String str2 = this.subtitle;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                }
                List list = this.detail_rows;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, list);
                }
                String str3 = this.dismiss_button_title;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dismiss_button_title=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LimitInfoScreen{", "}", 0, null, null, 56);
            }
        }

        static {
            LendingInfo$FirstTimeBorrowData$Companion$ADAPTER$1 lendingInfo$FirstTimeBorrowData$Companion$ADAPTER$1 = new LendingInfo$FirstTimeBorrowData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FirstTimeBorrowData.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo.FirstTimeBorrowData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = lendingInfo$FirstTimeBorrowData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$FirstTimeBorrowData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstTimeBorrowData(HomeScreen homeScreen, LimitCheckerScreen limitCheckerScreen, ConfirmationScreen confirmationScreen, LimitInfoScreen limitInfoScreen, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.home_screen = homeScreen;
            this.limit_checker_screen = limitCheckerScreen;
            this.confirmation_screen = confirmationScreen;
            this.limit_info_screen = limitInfoScreen;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FirstTimeBorrowData)) {
                return false;
            }
            FirstTimeBorrowData firstTimeBorrowData = (FirstTimeBorrowData) obj;
            return Intrinsics.areEqual(unknownFields(), firstTimeBorrowData.unknownFields()) && Intrinsics.areEqual(this.home_screen, firstTimeBorrowData.home_screen) && Intrinsics.areEqual(this.limit_checker_screen, firstTimeBorrowData.limit_checker_screen) && Intrinsics.areEqual(this.confirmation_screen, firstTimeBorrowData.confirmation_screen) && Intrinsics.areEqual(this.limit_info_screen, firstTimeBorrowData.limit_info_screen);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            HomeScreen homeScreen = this.home_screen;
            int hashCode2 = (hashCode + (homeScreen != null ? homeScreen.hashCode() : 0)) * 37;
            LimitCheckerScreen limitCheckerScreen = this.limit_checker_screen;
            int hashCode3 = (hashCode2 + (limitCheckerScreen != null ? limitCheckerScreen.hashCode() : 0)) * 37;
            ConfirmationScreen confirmationScreen = this.confirmation_screen;
            int hashCode4 = (hashCode3 + (confirmationScreen != null ? confirmationScreen.hashCode() : 0)) * 37;
            LimitInfoScreen limitInfoScreen = this.limit_info_screen;
            int hashCode5 = hashCode4 + (limitInfoScreen != null ? limitInfoScreen.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiDda.Builder builder = new UiDda.Builder(19);
            builder.account = this.home_screen;
            builder.enabled = this.limit_checker_screen;
            builder.button = this.confirmation_screen;
            builder.dda_form = this.limit_info_screen;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            HomeScreen homeScreen = this.home_screen;
            if (homeScreen != null) {
                arrayList.add("home_screen=" + homeScreen);
            }
            LimitCheckerScreen limitCheckerScreen = this.limit_checker_screen;
            if (limitCheckerScreen != null) {
                arrayList.add("limit_checker_screen=" + limitCheckerScreen);
            }
            ConfirmationScreen confirmationScreen = this.confirmation_screen;
            if (confirmationScreen != null) {
                arrayList.add("confirmation_screen=" + confirmationScreen);
            }
            LimitInfoScreen limitInfoScreen = this.limit_info_screen;
            if (limitInfoScreen != null) {
                arrayList.add("limit_info_screen=" + limitInfoScreen);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FirstTimeBorrowData{", "}", 0, null, null, 56);
        }
    }

    static {
        LendingInfo$Companion$ADAPTER$1 lendingInfo$Companion$ADAPTER$1 = new LendingInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LendingInfo.class), "type.googleapis.com/squareup.lending.sync_values.LendingInfo", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = lendingInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LendingInfo(Boolean bool, AccessData accessData, FirstTimeBorrowData firstTimeBorrowData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.potential_future_borrower = bool;
        this.access_data = accessData;
        this.first_time_borrow_data = firstTimeBorrowData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LendingInfo)) {
            return false;
        }
        LendingInfo lendingInfo = (LendingInfo) obj;
        return Intrinsics.areEqual(unknownFields(), lendingInfo.unknownFields()) && Intrinsics.areEqual(this.potential_future_borrower, lendingInfo.potential_future_borrower) && Intrinsics.areEqual(this.access_data, lendingInfo.access_data) && Intrinsics.areEqual(this.first_time_borrow_data, lendingInfo.first_time_borrow_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.potential_future_borrower;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        AccessData accessData = this.access_data;
        int hashCode3 = (hashCode2 + (accessData != null ? accessData.hashCode() : 0)) * 37;
        FirstTimeBorrowData firstTimeBorrowData = this.first_time_borrow_data;
        int hashCode4 = hashCode3 + (firstTimeBorrowData != null ? firstTimeBorrowData.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(21);
        builder.label = this.potential_future_borrower;
        builder.localizable_label = this.access_data;
        builder.client_scenario = this.first_time_borrow_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.potential_future_borrower;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("potential_future_borrower=", bool, arrayList);
        }
        AccessData accessData = this.access_data;
        if (accessData != null) {
            arrayList.add("access_data=" + accessData);
        }
        FirstTimeBorrowData firstTimeBorrowData = this.first_time_borrow_data;
        if (firstTimeBorrowData != null) {
            arrayList.add("first_time_borrow_data=" + firstTimeBorrowData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LendingInfo{", "}", 0, null, null, 56);
    }
}
