package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import app.cash.zipline.loader.LoaderAndroidKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
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

/* loaded from: classes7.dex */
public final class SearchCommonSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchCommonSection> CREATOR;
    public final LoaderAndroidKt content;
    public final Integer default_max_items;
    public final Layout layout;
    public final Button section_action_button;
    public final Button section_footer_action_button;
    public final Text section_subtitle;
    public final Text section_title;
    public final TapAction tap_action;

    public enum Layout implements WireEnum {
        ONE_ROW(1),
        ONE_COLUMN(2),
        TWO_ROWS(3),
        TWO_COLUMNS(4),
        THREE_ROWS(5),
        THREE_COLUMNS(6),
        FOUR_ROWS(7),
        FOUR_COLUMNS(8);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final SearchCommonSection$Layout$Companion$ADAPTER$1 ADAPTER = new SearchCommonSection$Layout$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Layout.class), Syntax.PROTO_2, null);

        Layout(int i) {
            this.value = i;
        }

        public static final Layout fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return ONE_ROW;
                case 2:
                    return ONE_COLUMN;
                case 3:
                    return TWO_ROWS;
                case 4:
                    return TWO_COLUMNS;
                case 5:
                    return THREE_ROWS;
                case 6:
                    return THREE_COLUMNS;
                case 7:
                    return FOUR_ROWS;
                case 8:
                    return FOUR_COLUMNS;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SearchCommonSection$Companion$ADAPTER$1 searchCommonSection$Companion$ADAPTER$1 = new SearchCommonSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonSection.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonSection", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = searchCommonSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCommonSection(LoaderAndroidKt loaderAndroidKt, Integer num, Text text, Text text2, Button button, Layout layout, Button button2, TapAction tapAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.content = loaderAndroidKt;
        this.default_max_items = num;
        this.section_title = text;
        this.section_subtitle = text2;
        this.section_action_button = button;
        this.layout = layout;
        this.section_footer_action_button = button2;
        this.tap_action = tapAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchCommonSection)) {
            return false;
        }
        SearchCommonSection searchCommonSection = (SearchCommonSection) obj;
        return Intrinsics.areEqual(unknownFields(), searchCommonSection.unknownFields()) && Intrinsics.areEqual(this.content, searchCommonSection.content) && Intrinsics.areEqual(this.default_max_items, searchCommonSection.default_max_items) && Intrinsics.areEqual(this.section_title, searchCommonSection.section_title) && Intrinsics.areEqual(this.section_subtitle, searchCommonSection.section_subtitle) && Intrinsics.areEqual(this.section_action_button, searchCommonSection.section_action_button) && this.layout == searchCommonSection.layout && Intrinsics.areEqual(this.section_footer_action_button, searchCommonSection.section_footer_action_button) && Intrinsics.areEqual(this.tap_action, searchCommonSection.tap_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LoaderAndroidKt loaderAndroidKt = this.content;
        int hashCode2 = (hashCode + (loaderAndroidKt != null ? loaderAndroidKt.hashCode() : 0)) * 37;
        Integer num = this.default_max_items;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Text text = this.section_title;
        int hashCode4 = (hashCode3 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.section_subtitle;
        int hashCode5 = (hashCode4 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Button button = this.section_action_button;
        int hashCode6 = (hashCode5 + (button != null ? button.hashCode() : 0)) * 37;
        Layout layout = this.layout;
        int hashCode7 = (hashCode6 + (layout != null ? layout.hashCode() : 0)) * 37;
        Button button2 = this.section_footer_action_button;
        int hashCode8 = (hashCode7 + (button2 != null ? button2.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode9 = hashCode8 + (tapAction != null ? tapAction.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(18, false);
        builder.external_token = this.content;
        builder.customer_token = this.default_max_items;
        builder.external_version = this.section_title;
        builder.updated_at = this.section_subtitle;
        builder.created_at = this.section_action_button;
        builder.is_badged = this.layout;
        builder.item_type = this.section_footer_action_button;
        builder.count_groups = this.tap_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LoaderAndroidKt loaderAndroidKt = this.content;
        if (loaderAndroidKt != null) {
            arrayList.add("content=" + loaderAndroidKt);
        }
        Integer num = this.default_max_items;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("default_max_items=", num, arrayList);
        }
        Text text = this.section_title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("section_title=", text, arrayList);
        }
        Text text2 = this.section_subtitle;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("section_subtitle=", text2, arrayList);
        }
        Button button = this.section_action_button;
        if (button != null) {
            arrayList.add("section_action_button=" + button);
        }
        Layout layout = this.layout;
        if (layout != null) {
            arrayList.add("layout=" + layout);
        }
        Button button2 = this.section_footer_action_button;
        if (button2 != null) {
            arrayList.add("section_footer_action_button=" + button2);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            arrayList.add("tap_action=" + tapAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonSection{", "}", 0, null, null, 56);
    }
}
