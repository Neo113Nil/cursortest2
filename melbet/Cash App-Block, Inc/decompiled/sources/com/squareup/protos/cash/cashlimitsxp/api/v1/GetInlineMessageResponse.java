package com.squareup.protos.cash.cashlimitsxp.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import okio.Path;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/cashlimitsxp/api/v1/GetInlineMessageResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Activity$Builder;", "Builder", "androidx/room/TransactorKt", "LimitsHubInlineMessage", "LimitsHubInlineMessageButton", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetInlineMessageResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInlineMessageResponse> CREATOR;
    public final TransactorKt response;

    public final class LimitsHubInlineMessage extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LimitsHubInlineMessage> CREATOR;
        public final String description_text;
        public final Icon icon;
        public final Illustration illustration;
        public final String main_text;
        public final LimitsHubInlineMessageButton primary_button;
        public final LimitsHubInlineMessageButton secondary_button;
        public final String subtext;
        public final String title_text;
        public final Long version;

        public enum Icon implements WireEnum {
            ICON_UNSPECIFIED(0),
            ICON_VERIFYING(1),
            ICON_DECREASE(2),
            ICON_FAILED(3),
            ICON_ALERT(4),
            ICON_REPORTED(5);

            public static final GetInlineMessageResponse$LimitsHubInlineMessage$Icon$Companion$ADAPTER$1 ADAPTER;
            public static final ByteString.Companion Companion;
            public final int value;

            static {
                Icon icon = ICON_UNSPECIFIED;
                Companion = new ByteString.Companion();
                ADAPTER = new GetInlineMessageResponse$LimitsHubInlineMessage$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, icon);
            }

            Icon(int i) {
                this.value = i;
            }

            public static final Icon fromValue(int i) {
                Companion.getClass();
                return ByteString.Companion.fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        public final class Illustration extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Illustration> CREATOR;
            public final String android_illustration_id;
            public final String arcade_id;
            public final String dark_url;
            public final String light_url;

            static {
                GetInlineMessageResponse$LimitsHubInlineMessage$Illustration$Companion$ADAPTER$1 getInlineMessageResponse$LimitsHubInlineMessage$Illustration$Companion$ADAPTER$1 = new GetInlineMessageResponse$LimitsHubInlineMessage$Illustration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Illustration.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetInlineMessageResponse.LimitsHubInlineMessage.Illustration", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/inline_message.proto");
                ADAPTER = getInlineMessageResponse$LimitsHubInlineMessage$Illustration$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getInlineMessageResponse$LimitsHubInlineMessage$Illustration$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Illustration(String str, String str2, String str3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.arcade_id = str;
                this.light_url = str2;
                this.dark_url = str3;
                this.android_illustration_id = str4;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Illustration)) {
                    return false;
                }
                Illustration illustration = (Illustration) obj;
                return Intrinsics.areEqual(unknownFields(), illustration.unknownFields()) && Intrinsics.areEqual(this.arcade_id, illustration.arcade_id) && Intrinsics.areEqual(this.light_url, illustration.light_url) && Intrinsics.areEqual(this.dark_url, illustration.dark_url) && Intrinsics.areEqual(this.android_illustration_id, illustration.android_illustration_id);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.arcade_id;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.light_url;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.dark_url;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.android_illustration_id;
                int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PoolOwner.Builder builder = new PoolOwner.Builder(3);
                builder.customer_token = this.arcade_id;
                builder.full_name = this.light_url;
                builder.profile_photo_url = this.dark_url;
                builder.cashtag = this.android_illustration_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.arcade_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "arcade_id=", arrayList);
                }
                String str2 = this.light_url;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "light_url=", arrayList);
                }
                String str3 = this.dark_url;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dark_url=", arrayList);
                }
                String str4 = this.android_illustration_id;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "android_illustration_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Illustration{", "}", 0, null, null, 56);
            }
        }

        static {
            GetInlineMessageResponse$LimitsHubInlineMessage$Companion$ADAPTER$1 getInlineMessageResponse$LimitsHubInlineMessage$Companion$ADAPTER$1 = new GetInlineMessageResponse$LimitsHubInlineMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitsHubInlineMessage.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetInlineMessageResponse.LimitsHubInlineMessage", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/inline_message.proto");
            ADAPTER = getInlineMessageResponse$LimitsHubInlineMessage$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getInlineMessageResponse$LimitsHubInlineMessage$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitsHubInlineMessage(Icon icon, String str, String str2, LimitsHubInlineMessageButton limitsHubInlineMessageButton, Long l, LimitsHubInlineMessageButton limitsHubInlineMessageButton2, Illustration illustration, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.main_text = str;
            this.subtext = str2;
            this.secondary_button = limitsHubInlineMessageButton;
            this.version = l;
            this.primary_button = limitsHubInlineMessageButton2;
            this.illustration = illustration;
            this.title_text = str3;
            this.description_text = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LimitsHubInlineMessage)) {
                return false;
            }
            LimitsHubInlineMessage limitsHubInlineMessage = (LimitsHubInlineMessage) obj;
            return Intrinsics.areEqual(unknownFields(), limitsHubInlineMessage.unknownFields()) && this.icon == limitsHubInlineMessage.icon && Intrinsics.areEqual(this.main_text, limitsHubInlineMessage.main_text) && Intrinsics.areEqual(this.subtext, limitsHubInlineMessage.subtext) && Intrinsics.areEqual(this.secondary_button, limitsHubInlineMessage.secondary_button) && Intrinsics.areEqual(this.version, limitsHubInlineMessage.version) && Intrinsics.areEqual(this.primary_button, limitsHubInlineMessage.primary_button) && Intrinsics.areEqual(this.illustration, limitsHubInlineMessage.illustration) && Intrinsics.areEqual(this.title_text, limitsHubInlineMessage.title_text) && Intrinsics.areEqual(this.description_text, limitsHubInlineMessage.description_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            String str = this.main_text;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtext;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LimitsHubInlineMessageButton limitsHubInlineMessageButton = this.secondary_button;
            int hashCode5 = (hashCode4 + (limitsHubInlineMessageButton != null ? limitsHubInlineMessageButton.hashCode() : 0)) * 37;
            Long l = this.version;
            int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            LimitsHubInlineMessageButton limitsHubInlineMessageButton2 = this.primary_button;
            int hashCode7 = (hashCode6 + (limitsHubInlineMessageButton2 != null ? limitsHubInlineMessageButton2.hashCode() : 0)) * 37;
            Illustration illustration = this.illustration;
            int hashCode8 = (hashCode7 + (illustration != null ? illustration.hashCode() : 0)) * 37;
            String str3 = this.title_text;
            int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.description_text;
            int hashCode10 = hashCode9 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(9, false);
            builder.locale = this.icon;
            builder.title = this.main_text;
            builder.info_rows_header = this.subtext;
            builder.footer_text = this.secondary_button;
            builder.loadable_subtitle = this.version;
            builder.info_rows = this.primary_button;
            builder.primary_footer_button_state = this.illustration;
            builder.secondary_footer_button_state = this.title_text;
            builder.payment_plans_data = this.description_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            String str = this.main_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
            }
            String str2 = this.subtext;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtext=", arrayList);
            }
            LimitsHubInlineMessageButton limitsHubInlineMessageButton = this.secondary_button;
            if (limitsHubInlineMessageButton != null) {
                arrayList.add("secondary_button=" + limitsHubInlineMessageButton);
            }
            Long l = this.version;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
            }
            LimitsHubInlineMessageButton limitsHubInlineMessageButton2 = this.primary_button;
            if (limitsHubInlineMessageButton2 != null) {
                arrayList.add("primary_button=" + limitsHubInlineMessageButton2);
            }
            Illustration illustration = this.illustration;
            if (illustration != null) {
                arrayList.add("illustration=" + illustration);
            }
            String str3 = this.title_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title_text=", arrayList);
            }
            String str4 = this.description_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "description_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitsHubInlineMessage{", "}", 0, null, null, 56);
        }
    }

    public final class LimitsHubInlineMessageButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LimitsHubInlineMessageButton> CREATOR;
        public final ButtonAction button_action;
        public final String text;
        public final String url_to_open;

        public enum ButtonAction implements WireEnum {
            BUTTON_ACTION_UNSPECIFIED(0),
            BUTTON_ACTION_OPEN_URL(1),
            BUTTON_ACTION_DISMISS(2);

            public static final GetInlineMessageResponse$LimitsHubInlineMessageButton$ButtonAction$Companion$ADAPTER$1 ADAPTER;
            public static final Path.Companion Companion;
            public final int value;

            static {
                ButtonAction buttonAction = BUTTON_ACTION_UNSPECIFIED;
                Companion = new Path.Companion();
                ADAPTER = new GetInlineMessageResponse$LimitsHubInlineMessageButton$ButtonAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ButtonAction.class), Syntax.PROTO_2, buttonAction);
            }

            ButtonAction(int i) {
                this.value = i;
            }

            public static final ButtonAction fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return BUTTON_ACTION_UNSPECIFIED;
                }
                if (i == 1) {
                    return BUTTON_ACTION_OPEN_URL;
                }
                if (i != 2) {
                    return null;
                }
                return BUTTON_ACTION_DISMISS;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            GetInlineMessageResponse$LimitsHubInlineMessageButton$Companion$ADAPTER$1 getInlineMessageResponse$LimitsHubInlineMessageButton$Companion$ADAPTER$1 = new GetInlineMessageResponse$LimitsHubInlineMessageButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitsHubInlineMessageButton.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetInlineMessageResponse.LimitsHubInlineMessageButton", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/inline_message.proto");
            ADAPTER = getInlineMessageResponse$LimitsHubInlineMessageButton$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getInlineMessageResponse$LimitsHubInlineMessageButton$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitsHubInlineMessageButton(String str, ButtonAction buttonAction, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.button_action = buttonAction;
            this.url_to_open = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LimitsHubInlineMessageButton)) {
                return false;
            }
            LimitsHubInlineMessageButton limitsHubInlineMessageButton = (LimitsHubInlineMessageButton) obj;
            return Intrinsics.areEqual(unknownFields(), limitsHubInlineMessageButton.unknownFields()) && Intrinsics.areEqual(this.text, limitsHubInlineMessageButton.text) && this.button_action == limitsHubInlineMessageButton.button_action && Intrinsics.areEqual(this.url_to_open, limitsHubInlineMessageButton.url_to_open);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ButtonAction buttonAction = this.button_action;
            int hashCode3 = (hashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
            String str2 = this.url_to_open;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Row.Builder builder = new Row.Builder(10);
            builder.title = this.text;
            builder.action = this.button_action;
            builder.subtitle = this.url_to_open;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            ButtonAction buttonAction = this.button_action;
            if (buttonAction != null) {
                arrayList.add("button_action=" + buttonAction);
            }
            String str2 = this.url_to_open;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url_to_open=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitsHubInlineMessageButton{", "}", 0, null, null, 56);
        }
    }

    static {
        GetInlineMessageResponse$Companion$ADAPTER$1 getInlineMessageResponse$Companion$ADAPTER$1 = new GetInlineMessageResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInlineMessageResponse.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetInlineMessageResponse", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/inline_message.proto");
        ADAPTER = getInlineMessageResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInlineMessageResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInlineMessageResponse(TransactorKt transactorKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = transactorKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInlineMessageResponse)) {
            return false;
        }
        GetInlineMessageResponse getInlineMessageResponse = (GetInlineMessageResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getInlineMessageResponse.unknownFields()) && Intrinsics.areEqual(this.response, getInlineMessageResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TransactorKt transactorKt = this.response;
        int hashCode2 = hashCode + (transactorKt != null ? transactorKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(14);
        builder.activity = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TransactorKt transactorKt = this.response;
        if (transactorKt != null) {
            arrayList.add("response=" + transactorKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInlineMessageResponse{", "}", 0, null, null, 56);
    }
}
