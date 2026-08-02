package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FilterGroupSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FilterGroupSection> CREATOR;
    public final List filter_group_items;

    static {
        FilterGroupSection$Companion$ADAPTER$1 filterGroupSection$Companion$ADAPTER$1 = new FilterGroupSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FilterGroupSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FilterGroupSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/FilterGroupSection.proto");
        ADAPTER = filterGroupSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(filterGroupSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterGroupSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.filter_group_items = TransactorKt.immutableCopyOf("filter_group_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterGroupSection)) {
            return false;
        }
        FilterGroupSection filterGroupSection = (FilterGroupSection) obj;
        return Intrinsics.areEqual(unknownFields(), filterGroupSection.unknownFields()) && Intrinsics.areEqual(this.filter_group_items, filterGroupSection.filter_group_items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.filter_group_items.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(23, false);
        builder.pools = this.filter_group_items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.filter_group_items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("filter_group_items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FilterGroupSection{", "}", 0, null, null, 56);
    }

    public final class FilterGroupItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FilterGroupItem> CREATOR;
        public final String default_name;
        public final LocalizedString l_default_name;
        public final Sheet sheet;
        public final ErrorEvent.Os.Companion style;

        public enum ItemLayout implements WireEnum {
            PILL(1),
            TILE(2),
            ROW(3);

            public final int value;
            public static final TaxEnvironment.Companion Companion = new TaxEnvironment.Companion();
            public static final FilterGroupSection$FilterGroupItem$ItemLayout$Companion$ADAPTER$1 ADAPTER = new FilterGroupSection$FilterGroupItem$ItemLayout$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ItemLayout.class), Syntax.PROTO_2, null);

            ItemLayout(int i) {
                this.value = i;
            }

            public static final ItemLayout fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return PILL;
                }
                if (i == 2) {
                    return TILE;
                }
                if (i != 3) {
                    return null;
                }
                return ROW;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            FilterGroupSection$FilterGroupItem$Companion$ADAPTER$1 filterGroupSection$FilterGroupItem$Companion$ADAPTER$1 = new FilterGroupSection$FilterGroupItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FilterGroupItem.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FilterGroupSection.FilterGroupItem", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/FilterGroupSection.proto");
            ADAPTER = filterGroupSection$FilterGroupItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(filterGroupSection$FilterGroupItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FilterGroupItem(LocalizedString localizedString, ErrorEvent.Os.Companion companion, Sheet sheet, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.l_default_name = localizedString;
            this.style = companion;
            this.sheet = sheet;
            this.default_name = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FilterGroupItem)) {
                return false;
            }
            FilterGroupItem filterGroupItem = (FilterGroupItem) obj;
            return Intrinsics.areEqual(unknownFields(), filterGroupItem.unknownFields()) && Intrinsics.areEqual(this.l_default_name, filterGroupItem.l_default_name) && Intrinsics.areEqual(this.style, filterGroupItem.style) && Intrinsics.areEqual(this.sheet, filterGroupItem.sheet) && Intrinsics.areEqual(this.default_name, filterGroupItem.default_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.l_default_name;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            ErrorEvent.Os.Companion companion = this.style;
            int hashCode3 = (hashCode2 + (companion != null ? companion.hashCode() : 0)) * 37;
            Sheet sheet = this.sheet;
            int hashCode4 = (hashCode3 + (sheet != null ? sheet.hashCode() : 0)) * 37;
            String str = this.default_name;
            int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Allowed.Builder builder = new Allowed.Builder(17);
            builder.card_encryption_data = this.l_default_name;
            builder.device_metadata = this.style;
            builder.success_screen = this.sheet;
            builder.customer_token_hash_email = this.default_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.l_default_name;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_default_name=", localizedString, arrayList);
            }
            ErrorEvent.Os.Companion companion = this.style;
            if (companion != null) {
                arrayList.add("style=" + companion);
            }
            Sheet sheet = this.sheet;
            if (sheet != null) {
                arrayList.add("sheet=" + sheet);
            }
            String str = this.default_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "default_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FilterGroupItem{", "}", 0, null, null, 56);
        }

        public final class Toggle extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Toggle> CREATOR;
            public final String filter_token;
            public final TapAction tap_action;

            static {
                FilterGroupSection$FilterGroupItem$Toggle$Companion$ADAPTER$1 filterGroupSection$FilterGroupItem$Toggle$Companion$ADAPTER$1 = new FilterGroupSection$FilterGroupItem$Toggle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Toggle.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FilterGroupSection.FilterGroupItem.Toggle", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/FilterGroupSection.proto");
                ADAPTER = filterGroupSection$FilterGroupItem$Toggle$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(filterGroupSection$FilterGroupItem$Toggle$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Toggle(String str, TapAction tapAction, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.filter_token = str;
                this.tap_action = tapAction;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Toggle)) {
                    return false;
                }
                Toggle toggle = (Toggle) obj;
                return Intrinsics.areEqual(unknownFields(), toggle.unknownFields()) && Intrinsics.areEqual(this.filter_token, toggle.filter_token) && Intrinsics.areEqual(this.tap_action, toggle.tap_action);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.filter_token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                TapAction tapAction = this.tap_action;
                int hashCode3 = hashCode2 + (tapAction != null ? tapAction.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                SplitButtons.Builder builder = new SplitButtons.Builder(4);
                builder.primary_button = this.filter_token;
                builder.secondary_button = this.tap_action;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.filter_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "filter_token=", arrayList);
                }
                TapAction tapAction = this.tap_action;
                if (tapAction != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Toggle{", "}", 0, null, null, 56);
            }

            public /* synthetic */ Toggle(TapAction tapAction) {
                this("on/off filter token", tapAction, ByteString.EMPTY);
            }
        }

        public final class FilterItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<FilterItem> CREATOR;
            public final Icon arcade_icon;
            public final String filter_token;
            public final Image image;
            public final LocalizedString l_name;
            public final String name;
            public final LocalizedString subtitle;
            public final TapAction tap_action;

            static {
                FilterGroupSection$FilterGroupItem$FilterItem$Companion$ADAPTER$1 filterGroupSection$FilterGroupItem$FilterItem$Companion$ADAPTER$1 = new FilterGroupSection$FilterGroupItem$FilterItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FilterItem.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FilterGroupSection.FilterGroupItem.FilterItem", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/FilterGroupSection.proto");
                ADAPTER = filterGroupSection$FilterGroupItem$FilterItem$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(filterGroupSection$FilterGroupItem$FilterItem$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FilterItem(String str, TapAction tapAction, Icon icon, LocalizedString localizedString, LocalizedString localizedString2, String str2, Image image, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.filter_token = str;
                this.tap_action = tapAction;
                this.arcade_icon = icon;
                this.l_name = localizedString;
                this.subtitle = localizedString2;
                this.name = str2;
                this.image = image;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FilterItem)) {
                    return false;
                }
                FilterItem filterItem = (FilterItem) obj;
                return Intrinsics.areEqual(unknownFields(), filterItem.unknownFields()) && Intrinsics.areEqual(this.filter_token, filterItem.filter_token) && Intrinsics.areEqual(this.tap_action, filterItem.tap_action) && Intrinsics.areEqual(this.arcade_icon, filterItem.arcade_icon) && Intrinsics.areEqual(this.l_name, filterItem.l_name) && Intrinsics.areEqual(this.subtitle, filterItem.subtitle) && Intrinsics.areEqual(this.name, filterItem.name) && Intrinsics.areEqual(this.image, filterItem.image);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.filter_token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                TapAction tapAction = this.tap_action;
                int hashCode3 = (hashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
                Icon icon = this.arcade_icon;
                int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.l_name;
                int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.subtitle;
                int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                String str2 = this.name;
                int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
                Image image = this.image;
                int hashCode8 = hashCode7 + (image != null ? image.hashCode() : 0);
                this.hashCode = hashCode8;
                return hashCode8;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PoolParticipant.Builder builder = new PoolParticipant.Builder(19);
                builder.customer_identifier = this.filter_token;
                builder.profile_photo_url = this.tap_action;
                builder.cashtag = this.arcade_icon;
                builder.added_at = this.l_name;
                builder.participant_type = this.subtitle;
                builder.full_name = this.name;
                builder.aggregated_contribution_amount = this.image;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.filter_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "filter_token=", arrayList);
                }
                TapAction tapAction = this.tap_action;
                if (tapAction != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
                }
                Icon icon = this.arcade_icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
                }
                LocalizedString localizedString = this.l_name;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("l_name=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.subtitle;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
                }
                String str2 = this.name;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
                }
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "FilterItem{", "}", 0, null, null, 56);
            }

            public /* synthetic */ FilterItem(String str, Icon icon, LocalizedString localizedString) {
                this(str, null, icon, localizedString, null, null, null, ByteString.EMPTY);
            }
        }

        public final class Sheet extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Sheet> CREATOR;
            public final AnalyticsEvent analytics_view_event;
            public final Button apply_button;
            public final List filter_items;
            public final ItemLayout item_layout;
            public final LocalizedString l_title;
            public final Button reset_button;
            public final String title;

            static {
                FilterGroupSection$FilterGroupItem$Sheet$Companion$ADAPTER$1 filterGroupSection$FilterGroupItem$Sheet$Companion$ADAPTER$1 = new FilterGroupSection$FilterGroupItem$Sheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Sheet.class), "type.googleapis.com/squareup.cash.shop.rendering.api.FilterGroupSection.FilterGroupItem.Sheet", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/FilterGroupSection.proto");
                ADAPTER = filterGroupSection$FilterGroupItem$Sheet$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(filterGroupSection$FilterGroupItem$Sheet$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sheet(LocalizedString localizedString, List list, ItemLayout itemLayout, Button button, Button button2, AnalyticsEvent analyticsEvent, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.l_title = localizedString;
                this.item_layout = itemLayout;
                this.reset_button = button;
                this.apply_button = button2;
                this.analytics_view_event = analyticsEvent;
                this.title = str;
                this.filter_items = TransactorKt.immutableCopyOf("filter_items", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Sheet)) {
                    return false;
                }
                Sheet sheet = (Sheet) obj;
                return Intrinsics.areEqual(unknownFields(), sheet.unknownFields()) && Intrinsics.areEqual(this.l_title, sheet.l_title) && Intrinsics.areEqual(this.filter_items, sheet.filter_items) && this.item_layout == sheet.item_layout && Intrinsics.areEqual(this.reset_button, sheet.reset_button) && Intrinsics.areEqual(this.apply_button, sheet.apply_button) && Intrinsics.areEqual(this.analytics_view_event, sheet.analytics_view_event) && Intrinsics.areEqual(this.title, sheet.title);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.l_title;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.filter_items);
                ItemLayout itemLayout = this.item_layout;
                int hashCode2 = (m + (itemLayout != null ? itemLayout.hashCode() : 0)) * 37;
                Button button = this.reset_button;
                int hashCode3 = (hashCode2 + (button != null ? button.hashCode() : 0)) * 37;
                Button button2 = this.apply_button;
                int hashCode4 = (hashCode3 + (button2 != null ? button2.hashCode() : 0)) * 37;
                AnalyticsEvent analyticsEvent = this.analytics_view_event;
                int hashCode5 = (hashCode4 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
                String str = this.title;
                int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PoolParticipant.Builder builder = new PoolParticipant.Builder(20);
                builder.full_name = this.l_title;
                builder.profile_photo_url = this.filter_items;
                builder.cashtag = this.item_layout;
                builder.added_at = this.reset_button;
                builder.participant_type = this.apply_button;
                builder.aggregated_contribution_amount = this.analytics_view_event;
                builder.customer_identifier = this.title;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.l_title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
                }
                List list = this.filter_items;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("filter_items=", arrayList, list);
                }
                ItemLayout itemLayout = this.item_layout;
                if (itemLayout != null) {
                    arrayList.add("item_layout=" + itemLayout);
                }
                Button button = this.reset_button;
                if (button != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("reset_button=", button, arrayList);
                }
                Button button2 = this.apply_button;
                if (button2 != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("apply_button=", button2, arrayList);
                }
                AnalyticsEvent analyticsEvent = this.analytics_view_event;
                if (analyticsEvent != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
                }
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Sheet{", "}", 0, null, null, 56);
            }

            public Sheet(LocalizedString localizedString, List list, Button button, Button button2, AnalyticsEvent analyticsEvent, int i) {
                this(localizedString, list, (i & 4) != 0 ? null : ItemLayout.PILL, button, button2, analyticsEvent, null, ByteString.EMPTY);
            }
        }
    }

    public FilterGroupSection(List list, int i) {
        this((i & 1) != 0 ? EmptyList.INSTANCE : list, ByteString.EMPTY);
    }
}
