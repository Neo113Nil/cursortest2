package com.squareup.protos.cash.local.client.app.v1.card;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.RewardStatus;
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
public final class LocalCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCard> CREATOR;
    public final List action_buttons;
    public final Image artwork_image;
    public final Color brand_card_outline_color;
    public final String cashtag_with_prefix;
    public final String client_route;
    public final ColorPalette color_palette;
    public final List conditional_action_buttons;
    public final List images;
    public final MiniCard mini_card;
    public final String sort_key;
    public final String title;
    public final String token;
    public final LocalCard$TypeDetails$BrandCardDetails type_details;

    public final class ActionButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActionButton> CREATOR;
        public final String client_route;
        public final DisplayCondition display_condition;
        public final String text;

        public enum DisplayCondition implements WireEnum {
            DISPLAY_CONDITION_UNSPECIFIED(0),
            DISPLAY_CONDITION_ALWAYS_MATCH(1),
            DISPLAY_CONDITION_ACCEPTING_ORDERS(2);

            public static final LocalCard$ActionButton$DisplayCondition$Companion$ADAPTER$1 ADAPTER;
            public static final ContactAliasType.Companion Companion;
            public final int value;

            static {
                DisplayCondition displayCondition = DISPLAY_CONDITION_UNSPECIFIED;
                Companion = new ContactAliasType.Companion();
                ADAPTER = new LocalCard$ActionButton$DisplayCondition$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayCondition.class), Syntax.PROTO_2, displayCondition);
            }

            DisplayCondition(int i) {
                this.value = i;
            }

            public static final DisplayCondition fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return DISPLAY_CONDITION_UNSPECIFIED;
                }
                if (i == 1) {
                    return DISPLAY_CONDITION_ALWAYS_MATCH;
                }
                if (i != 2) {
                    return null;
                }
                return DISPLAY_CONDITION_ACCEPTING_ORDERS;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            LocalCard$ActionButton$Companion$ADAPTER$1 localCard$ActionButton$Companion$ADAPTER$1 = new LocalCard$ActionButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActionButton.class), "type.googleapis.com/squareup.cash.local.client.app.v1.card.LocalCard.ActionButton", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/card/local_card.proto");
            ADAPTER = localCard$ActionButton$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localCard$ActionButton$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionButton(String str, String str2, DisplayCondition displayCondition, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.client_route = str2;
            this.display_condition = displayCondition;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) obj;
            return Intrinsics.areEqual(unknownFields(), actionButton.unknownFields()) && Intrinsics.areEqual(this.text, actionButton.text) && Intrinsics.areEqual(this.client_route, actionButton.client_route) && this.display_condition == actionButton.display_condition;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.client_route;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            DisplayCondition displayCondition = this.display_condition;
            int hashCode4 = hashCode3 + (displayCondition != null ? displayCondition.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Group.Builder builder = new Group.Builder(17);
            builder.name = this.text;
            builder.group_image = this.client_route;
            builder.participants = this.display_condition;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            String str2 = this.client_route;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_route=", arrayList);
            }
            DisplayCondition displayCondition = this.display_condition;
            if (displayCondition != null) {
                arrayList.add("display_condition=" + displayCondition);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActionButton{", "}", 0, null, null, 56);
        }
    }

    public final class ColorPalette extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ColorPalette> CREATOR;
        public final Color action_button_background_color;
        public final Color action_button_foreground_color;
        public final Color background_color;
        public final Color foreground_color;

        static {
            LocalCard$ColorPalette$Companion$ADAPTER$1 localCard$ColorPalette$Companion$ADAPTER$1 = new LocalCard$ColorPalette$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ColorPalette.class), "type.googleapis.com/squareup.cash.local.client.app.v1.card.LocalCard.ColorPalette", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/card/local_card.proto");
            ADAPTER = localCard$ColorPalette$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localCard$ColorPalette$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorPalette(Color color, Color color2, Color color3, Color color4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.background_color = color;
            this.foreground_color = color2;
            this.action_button_background_color = color3;
            this.action_button_foreground_color = color4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ColorPalette)) {
                return false;
            }
            ColorPalette colorPalette = (ColorPalette) obj;
            return Intrinsics.areEqual(unknownFields(), colorPalette.unknownFields()) && Intrinsics.areEqual(this.background_color, colorPalette.background_color) && Intrinsics.areEqual(this.foreground_color, colorPalette.foreground_color) && Intrinsics.areEqual(this.action_button_background_color, colorPalette.action_button_background_color) && Intrinsics.areEqual(this.action_button_foreground_color, colorPalette.action_button_foreground_color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Color color = this.background_color;
            int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
            Color color2 = this.foreground_color;
            int hashCode3 = (hashCode2 + (color2 != null ? color2.hashCode() : 0)) * 37;
            Color color3 = this.action_button_background_color;
            int hashCode4 = (hashCode3 + (color3 != null ? color3.hashCode() : 0)) * 37;
            Color color4 = this.action_button_foreground_color;
            int hashCode5 = hashCode4 + (color4 != null ? color4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.CardPii.Builder builder = new Card.CardPii.Builder(29, false);
            builder.postal_code = this.background_color;
            builder.last_four_digits = this.foreground_color;
            builder.expiration = this.action_button_background_color;
            builder.ciphertext_ = this.action_button_foreground_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Color color = this.background_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
            }
            Color color2 = this.foreground_color;
            if (color2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("foreground_color=", color2, arrayList);
            }
            Color color3 = this.action_button_background_color;
            if (color3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("action_button_background_color=", color3, arrayList);
            }
            Color color4 = this.action_button_foreground_color;
            if (color4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("action_button_foreground_color=", color4, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ColorPalette{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalCard$Companion$ADAPTER$1 localCard$Companion$ADAPTER$1 = new LocalCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCard.class), "type.googleapis.com/squareup.cash.local.client.app.v1.card.LocalCard", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/card/local_card.proto");
        ADAPTER = localCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCard(String str, String str2, List list, String str3, List list2, List list3, String str4, LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails, ColorPalette colorPalette, MiniCard miniCard, Image image, String str5, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.token = str;
        this.title = str2;
        this.client_route = str3;
        this.sort_key = str4;
        this.type_details = localCard$TypeDetails$BrandCardDetails;
        this.color_palette = colorPalette;
        this.mini_card = miniCard;
        this.artwork_image = image;
        this.cashtag_with_prefix = str5;
        this.brand_card_outline_color = color;
        this.images = TransactorKt.immutableCopyOf("images", list);
        this.action_buttons = TransactorKt.immutableCopyOf("action_buttons", list2);
        this.conditional_action_buttons = TransactorKt.immutableCopyOf("conditional_action_buttons", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCard)) {
            return false;
        }
        LocalCard localCard = (LocalCard) obj;
        return Intrinsics.areEqual(unknownFields(), localCard.unknownFields()) && Intrinsics.areEqual(this.token, localCard.token) && Intrinsics.areEqual(this.title, localCard.title) && Intrinsics.areEqual(this.images, localCard.images) && Intrinsics.areEqual(this.client_route, localCard.client_route) && Intrinsics.areEqual(this.action_buttons, localCard.action_buttons) && Intrinsics.areEqual(this.conditional_action_buttons, localCard.conditional_action_buttons) && Intrinsics.areEqual(this.sort_key, localCard.sort_key) && Intrinsics.areEqual(this.type_details, localCard.type_details) && Intrinsics.areEqual(this.color_palette, localCard.color_palette) && Intrinsics.areEqual(this.mini_card, localCard.mini_card) && Intrinsics.areEqual(this.artwork_image, localCard.artwork_image) && Intrinsics.areEqual(this.cashtag_with_prefix, localCard.cashtag_with_prefix) && Intrinsics.areEqual(this.brand_card_outline_color, localCard.brand_card_outline_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.images);
        String str3 = this.client_route;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.action_buttons), 37, this.conditional_action_buttons);
        String str4 = this.sort_key;
        int hashCode3 = (m2 + (str4 != null ? str4.hashCode() : 0)) * 37;
        LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = this.type_details;
        int hashCode4 = (hashCode3 + (localCard$TypeDetails$BrandCardDetails != null ? localCard$TypeDetails$BrandCardDetails.value.hashCode() : 0)) * 37;
        ColorPalette colorPalette = this.color_palette;
        int hashCode5 = (hashCode4 + (colorPalette != null ? colorPalette.hashCode() : 0)) * 37;
        MiniCard miniCard = this.mini_card;
        int hashCode6 = (hashCode5 + (miniCard != null ? miniCard.hashCode() : 0)) * 37;
        Image image = this.artwork_image;
        int hashCode7 = (hashCode6 + (image != null ? image.hashCode() : 0)) * 37;
        String str5 = this.cashtag_with_prefix;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Color color = this.brand_card_outline_color;
        int hashCode9 = hashCode8 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder(4);
        builder.code_entry_client_route = this.token;
        builder.reward_button_text = this.title;
        builder.code_entry_enabled = this.images;
        builder.reward_header_text = this.client_route;
        builder.reward_screen_enabled = this.action_buttons;
        builder.minimum_code_length = this.conditional_action_buttons;
        builder.reward_main_text = this.sort_key;
        builder.reward_button_priority = this.type_details;
        builder.completed_reward_payments = this.color_palette;
        builder.available_reward_payments = this.mini_card;
        builder.reward_payment_amount = this.artwork_image;
        builder.expiration = this.cashtag_with_prefix;
        builder.referral_status_screen = this.brand_card_outline_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        List list = this.images;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("images=", arrayList, list);
        }
        String str3 = this.client_route;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_route=", arrayList);
        }
        List list2 = this.action_buttons;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("action_buttons=", arrayList, list2);
        }
        List list3 = this.conditional_action_buttons;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("conditional_action_buttons=", arrayList, list3);
        }
        String str4 = this.sort_key;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "sort_key=", arrayList);
        }
        LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = this.type_details;
        if (localCard$TypeDetails$BrandCardDetails != null) {
            arrayList.add("type_details=" + localCard$TypeDetails$BrandCardDetails);
        }
        ColorPalette colorPalette = this.color_palette;
        if (colorPalette != null) {
            arrayList.add("color_palette=" + colorPalette);
        }
        MiniCard miniCard = this.mini_card;
        if (miniCard != null) {
            arrayList.add("mini_card=" + miniCard);
        }
        Image image = this.artwork_image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", image, arrayList);
        }
        String str5 = this.cashtag_with_prefix;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "cashtag_with_prefix=", arrayList);
        }
        Color color = this.brand_card_outline_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("brand_card_outline_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCard{", "}", 0, null, null, 56);
    }
}
