package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.franklin.ui.UiControl;
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
public final class LocalMenuItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuItem> CREATOR;
    public final LocalMenuAvailability availability;
    public final List combo_slots;
    public final LocalMenuItemDeal deal;
    public final String description;
    public final List dietary_preferences;
    public final List discount_tokens;
    public final List features;
    public final LocalImage image;
    public final List images;
    public final List ingredients;
    public final Boolean is_alcoholic;
    public final List item_options_configs;
    public final Integer max_order_quantity;
    public final LocalMenuHours menu_hours;
    public final List modifier_list_configs;
    public final String name;
    public final List popular_modifier_tokens;
    public final PreorderingItemSummary preordering_summary;
    public final LocalMoney price;
    public final ReservationData reservation_data;
    public final String token;
    public final Integer total_calories;
    public final List variations;

    public final class ItemOptionsConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ItemOptionsConfig> CREATOR;
        public final String name;
        public final List value_tokens;

        static {
            LocalMenuItem$ItemOptionsConfig$Companion$ADAPTER$1 localMenuItem$ItemOptionsConfig$Companion$ADAPTER$1 = new LocalMenuItem$ItemOptionsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ItemOptionsConfig.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItem.ItemOptionsConfig", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItem$ItemOptionsConfig$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItem$ItemOptionsConfig$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemOptionsConfig(String str, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.name = str;
            this.value_tokens = TransactorKt.immutableCopyOf("value_tokens", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemOptionsConfig)) {
                return false;
            }
            ItemOptionsConfig itemOptionsConfig = (ItemOptionsConfig) obj;
            return Intrinsics.areEqual(unknownFields(), itemOptionsConfig.unknownFields()) && Intrinsics.areEqual(this.name, itemOptionsConfig.name) && Intrinsics.areEqual(this.value_tokens, itemOptionsConfig.value_tokens);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = this.value_tokens.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ToggleScreen.Builder builder = new ToggleScreen.Builder(22, false);
            builder.toggle_title = this.name;
            builder.sections = this.value_tokens;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            List list = this.value_tokens;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("value_tokens=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ItemOptionsConfig{", "}", 0, null, null, 56);
        }
    }

    public enum LocalMenuItemFeature implements WireEnum {
        LOCAL_MENU_ITEM_FEATURE_UNSPECIFIED(0),
        LOCAL_MENU_ITEM_FEATURE_RESERVATION(1);

        public static final LocalMenuItem$LocalMenuItemFeature$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            LocalMenuItemFeature localMenuItemFeature = LOCAL_MENU_ITEM_FEATURE_UNSPECIFIED;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new LocalMenuItem$LocalMenuItemFeature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LocalMenuItemFeature.class), Syntax.PROTO_2, localMenuItemFeature);
        }

        LocalMenuItemFeature(int i) {
            this.value = i;
        }

        public static final LocalMenuItemFeature fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return LOCAL_MENU_ITEM_FEATURE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return LOCAL_MENU_ITEM_FEATURE_RESERVATION;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class ModifierListConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ModifierListConfig> CREATOR;
        public final Boolean allow_quantities;
        public final Integer max_selections;
        public final Integer min_selections;
        public final String modifier_list_token;

        static {
            LocalMenuItem$ModifierListConfig$Companion$ADAPTER$1 localMenuItem$ModifierListConfig$Companion$ADAPTER$1 = new LocalMenuItem$ModifierListConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ModifierListConfig.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItem.ModifierListConfig", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItem$ModifierListConfig$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItem$ModifierListConfig$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModifierListConfig(String str, Integer num, Integer num2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.modifier_list_token = str;
            this.min_selections = num;
            this.max_selections = num2;
            this.allow_quantities = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ModifierListConfig)) {
                return false;
            }
            ModifierListConfig modifierListConfig = (ModifierListConfig) obj;
            return Intrinsics.areEqual(unknownFields(), modifierListConfig.unknownFields()) && Intrinsics.areEqual(this.modifier_list_token, modifierListConfig.modifier_list_token) && Intrinsics.areEqual(this.min_selections, modifierListConfig.min_selections) && Intrinsics.areEqual(this.max_selections, modifierListConfig.max_selections) && Intrinsics.areEqual(this.allow_quantities, modifierListConfig.allow_quantities);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.modifier_list_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.min_selections;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.max_selections;
            int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Boolean bool = this.allow_quantities;
            int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(10, false);
            builder.id = this.modifier_list_token;
            builder.last_4 = this.min_selections;
            builder.gift_card_id = this.max_selections;
            builder.gift_card_amount = this.allow_quantities;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.modifier_list_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "modifier_list_token=", arrayList);
            }
            Integer num = this.min_selections;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("min_selections=", num, arrayList);
            }
            Integer num2 = this.max_selections;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("max_selections=", num2, arrayList);
            }
            Boolean bool = this.allow_quantities;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_quantities=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ModifierListConfig{", "}", 0, null, null, 56);
        }
    }

    public final class PreorderingItemSummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PreorderingItemSummary> CREATOR;
        public final String description;
        public final String title;

        static {
            LocalMenuItem$PreorderingItemSummary$Companion$ADAPTER$1 localMenuItem$PreorderingItemSummary$Companion$ADAPTER$1 = new LocalMenuItem$PreorderingItemSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PreorderingItemSummary.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItem.PreorderingItemSummary", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItem$PreorderingItemSummary$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItem$PreorderingItemSummary$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreorderingItemSummary(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PreorderingItemSummary)) {
                return false;
            }
            PreorderingItemSummary preorderingItemSummary = (PreorderingItemSummary) obj;
            return Intrinsics.areEqual(unknownFields(), preorderingItemSummary.unknownFields()) && Intrinsics.areEqual(this.title, preorderingItemSummary.title) && Intrinsics.areEqual(this.description, preorderingItemSummary.description);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(21);
            builder.given_name = this.title;
            builder.family_name = this.description;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PreorderingItemSummary{", "}", 0, null, null, 56);
        }
    }

    public final class ReservationData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ReservationData> CREATOR;

        static {
            LocalMenuItem$ReservationData$Companion$ADAPTER$1 localMenuItem$ReservationData$Companion$ADAPTER$1 = new LocalMenuItem$ReservationData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReservationData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItem.ReservationData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItem$ReservationData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItem$ReservationData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReservationData(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ReservationData) && Intrinsics.areEqual(unknownFields(), ((ReservationData) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(19);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "ReservationData{}";
        }
    }

    static {
        LocalMenuItem$Companion$ADAPTER$1 localMenuItem$Companion$ADAPTER$1 = new LocalMenuItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuItem.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItem", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuItem(String str, String str2, LocalImage localImage, LocalMoney localMoney, LocalMenuItemDeal localMenuItemDeal, Integer num, String str3, List list, List list2, LocalMenuAvailability localMenuAvailability, List list3, Boolean bool, LocalMenuHours localMenuHours, List list4, List list5, Integer num2, List list6, List list7, ReservationData reservationData, List list8, List list9, List list10, PreorderingItemSummary preorderingItemSummary, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.image = localImage;
        this.price = localMoney;
        this.deal = localMenuItemDeal;
        this.max_order_quantity = num;
        this.description = str3;
        this.availability = localMenuAvailability;
        this.is_alcoholic = bool;
        this.menu_hours = localMenuHours;
        this.total_calories = num2;
        this.reservation_data = reservationData;
        this.preordering_summary = preorderingItemSummary;
        this.variations = TransactorKt.immutableCopyOf("variations", list);
        this.modifier_list_configs = TransactorKt.immutableCopyOf("modifier_list_configs", list2);
        this.item_options_configs = TransactorKt.immutableCopyOf("item_options_configs", list3);
        this.combo_slots = TransactorKt.immutableCopyOf("combo_slots", list4);
        this.dietary_preferences = TransactorKt.immutableCopyOf("dietary_preferences", list5);
        this.ingredients = TransactorKt.immutableCopyOf("ingredients", list6);
        this.features = TransactorKt.immutableCopyOf("features", list7);
        this.images = TransactorKt.immutableCopyOf("images", list8);
        this.popular_modifier_tokens = TransactorKt.immutableCopyOf("popular_modifier_tokens", list9);
        this.discount_tokens = TransactorKt.immutableCopyOf("discount_tokens", list10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuItem)) {
            return false;
        }
        LocalMenuItem localMenuItem = (LocalMenuItem) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuItem.unknownFields()) && Intrinsics.areEqual(this.token, localMenuItem.token) && Intrinsics.areEqual(this.name, localMenuItem.name) && Intrinsics.areEqual(this.image, localMenuItem.image) && Intrinsics.areEqual(this.price, localMenuItem.price) && Intrinsics.areEqual(this.deal, localMenuItem.deal) && Intrinsics.areEqual(this.max_order_quantity, localMenuItem.max_order_quantity) && Intrinsics.areEqual(this.description, localMenuItem.description) && Intrinsics.areEqual(this.variations, localMenuItem.variations) && Intrinsics.areEqual(this.modifier_list_configs, localMenuItem.modifier_list_configs) && this.availability == localMenuItem.availability && Intrinsics.areEqual(this.item_options_configs, localMenuItem.item_options_configs) && Intrinsics.areEqual(this.is_alcoholic, localMenuItem.is_alcoholic) && Intrinsics.areEqual(this.menu_hours, localMenuItem.menu_hours) && Intrinsics.areEqual(this.combo_slots, localMenuItem.combo_slots) && Intrinsics.areEqual(this.dietary_preferences, localMenuItem.dietary_preferences) && Intrinsics.areEqual(this.total_calories, localMenuItem.total_calories) && Intrinsics.areEqual(this.ingredients, localMenuItem.ingredients) && Intrinsics.areEqual(this.features, localMenuItem.features) && Intrinsics.areEqual(this.reservation_data, localMenuItem.reservation_data) && Intrinsics.areEqual(this.images, localMenuItem.images) && Intrinsics.areEqual(this.popular_modifier_tokens, localMenuItem.popular_modifier_tokens) && Intrinsics.areEqual(this.discount_tokens, localMenuItem.discount_tokens) && Intrinsics.areEqual(this.preordering_summary, localMenuItem.preordering_summary);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalImage localImage = this.image;
        int hashCode4 = (hashCode3 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.price;
        int hashCode5 = (hashCode4 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        LocalMenuItemDeal localMenuItemDeal = this.deal;
        int hashCode6 = (hashCode5 + (localMenuItemDeal != null ? localMenuItemDeal.hashCode() : 0)) * 37;
        Integer num = this.max_order_quantity;
        int hashCode7 = (hashCode6 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str3 = this.description;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.variations), 37, this.modifier_list_configs);
        LocalMenuAvailability localMenuAvailability = this.availability;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (localMenuAvailability != null ? localMenuAvailability.hashCode() : 0)) * 37, 37, this.item_options_configs);
        Boolean bool = this.is_alcoholic;
        int hashCode8 = (m2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalMenuHours localMenuHours = this.menu_hours;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (localMenuHours != null ? localMenuHours.hashCode() : 0)) * 37, 37, this.combo_slots), 37, this.dietary_preferences);
        Integer num2 = this.total_calories;
        int m4 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37, 37, this.ingredients), 37, this.features);
        ReservationData reservationData = this.reservation_data;
        int m5 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m4 + (reservationData != null ? reservationData.hashCode() : 0)) * 37, 37, this.images), 37, this.popular_modifier_tokens), 37, this.discount_tokens);
        PreorderingItemSummary preorderingItemSummary = this.preordering_summary;
        int hashCode9 = m5 + (preorderingItemSummary != null ? preorderingItemSummary.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiControl.Builder builder = new UiControl.Builder(2);
        builder.main_text = this.token;
        builder.sub_text = this.name;
        builder.f1401type = this.image;
        builder.state = this.price;
        builder.localizable_text = this.deal;
        builder.localizable_main_text = this.max_order_quantity;
        builder.accessibility_text = this.description;
        builder.localizable_sub_text = this.variations;
        builder.localizable_accessibility_text = this.modifier_list_configs;
        builder.localizable_info_text = this.availability;
        builder.action_url_to_open = this.item_options_configs;
        builder.enabled = this.is_alcoholic;
        builder.support_node_token = this.menu_hours;
        builder.info_text = this.combo_slots;
        builder.main_text_color_override = this.dietary_preferences;
        builder.accent_color = this.total_calories;
        builder.button = this.ingredients;
        builder.icon = this.features;
        builder.action = this.reservation_data;
        builder.client_scenario = this.images;
        builder.status_result = this.popular_modifier_tokens;
        builder.dialog = this.discount_tokens;
        builder.info_text_style = this.preordering_summary;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        LocalImage localImage = this.image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
        }
        LocalMoney localMoney = this.price;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("price=", localMoney, arrayList);
        }
        LocalMenuItemDeal localMenuItemDeal = this.deal;
        if (localMenuItemDeal != null) {
            arrayList.add("deal=" + localMenuItemDeal);
        }
        Integer num = this.max_order_quantity;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_order_quantity=", num, arrayList);
        }
        String str3 = this.description;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "description=", arrayList);
        }
        List list = this.variations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("variations=", arrayList, list);
        }
        List list2 = this.modifier_list_configs;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("modifier_list_configs=", arrayList, list2);
        }
        LocalMenuAvailability localMenuAvailability = this.availability;
        if (localMenuAvailability != null) {
            arrayList.add("availability=" + localMenuAvailability);
        }
        List list3 = this.item_options_configs;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("item_options_configs=", arrayList, list3);
        }
        Boolean bool = this.is_alcoholic;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_alcoholic=", bool, arrayList);
        }
        LocalMenuHours localMenuHours = this.menu_hours;
        if (localMenuHours != null) {
            arrayList.add("menu_hours=" + localMenuHours);
        }
        List list4 = this.combo_slots;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("combo_slots=", arrayList, list4);
        }
        List list5 = this.dietary_preferences;
        if (!list5.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("dietary_preferences=", arrayList, list5);
        }
        Integer num2 = this.total_calories;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("total_calories=", num2, arrayList);
        }
        List list6 = this.ingredients;
        if (!list6.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("ingredients=", arrayList, list6);
        }
        List list7 = this.features;
        if (!list7.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("features=", arrayList, list7);
        }
        ReservationData reservationData = this.reservation_data;
        if (reservationData != null) {
            arrayList.add("reservation_data=" + reservationData);
        }
        List list8 = this.images;
        if (!list8.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("images=", arrayList, list8);
        }
        List list9 = this.popular_modifier_tokens;
        if (!list9.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("popular_modifier_tokens=", arrayList, list9);
        }
        List list10 = this.discount_tokens;
        if (!list10.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_tokens=", arrayList, list10);
        }
        PreorderingItemSummary preorderingItemSummary = this.preordering_summary;
        if (preorderingItemSummary != null) {
            arrayList.add("preordering_summary=" + preorderingItemSummary);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuItem{", "}", 0, null, null, 56);
    }
}
