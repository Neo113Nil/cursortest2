package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Uri_androidKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.lending.Loan;
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
public final class Section extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Section> CREATOR;
    public final Color background_color;
    public final Uri_androidKt content;
    public final Integer default_max_items;
    public final Layout layout;
    public final Boolean render_section_divider;
    public final Button section_action_button;
    public final Text section_eyebrow;
    public final Button section_footer_button;
    public final Text section_header;
    public final String section_id;
    public final Text section_subtitle;
    public final Text section_title;
    public final TapAction tap_action;
    public final String title;

    /* loaded from: classes.dex */
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
        public static final ByteString.Companion Companion = new ByteString.Companion();
        public static final Section$Layout$Companion$ADAPTER$1 ADAPTER = new Section$Layout$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Layout.class), Syntax.PROTO_2, null);

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
        Section$Companion$ADAPTER$1 section$Companion$ADAPTER$1 = new Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.Section", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = section$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Section(String str, Uri_androidKt uri_androidKt, Integer num, Text text, Text text2, Text text3, Button button, Text text4, TapAction tapAction, Layout layout, String str2, Color color, Button button2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.content = uri_androidKt;
        this.default_max_items = num;
        this.section_title = text;
        this.section_subtitle = text2;
        this.section_eyebrow = text3;
        this.section_action_button = button;
        this.section_header = text4;
        this.tap_action = tapAction;
        this.layout = layout;
        this.section_id = str2;
        this.background_color = color;
        this.section_footer_button = button2;
        this.render_section_divider = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.content, section.content) && Intrinsics.areEqual(this.default_max_items, section.default_max_items) && Intrinsics.areEqual(this.section_title, section.section_title) && Intrinsics.areEqual(this.section_subtitle, section.section_subtitle) && Intrinsics.areEqual(this.section_eyebrow, section.section_eyebrow) && Intrinsics.areEqual(this.section_action_button, section.section_action_button) && Intrinsics.areEqual(this.section_header, section.section_header) && Intrinsics.areEqual(this.tap_action, section.tap_action) && this.layout == section.layout && Intrinsics.areEqual(this.section_id, section.section_id) && Intrinsics.areEqual(this.background_color, section.background_color) && Intrinsics.areEqual(this.section_footer_button, section.section_footer_button) && Intrinsics.areEqual(this.render_section_divider, section.render_section_divider);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Uri_androidKt uri_androidKt = this.content;
        int hashCode3 = (hashCode2 + (uri_androidKt != null ? uri_androidKt.hashCode() : 0)) * 37;
        Integer num = this.default_max_items;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Text text = this.section_title;
        int hashCode5 = (hashCode4 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.section_subtitle;
        int hashCode6 = (hashCode5 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Text text3 = this.section_eyebrow;
        int hashCode7 = (hashCode6 + (text3 != null ? text3.hashCode() : 0)) * 37;
        Button button = this.section_action_button;
        int hashCode8 = (hashCode7 + (button != null ? button.hashCode() : 0)) * 37;
        Text text4 = this.section_header;
        int hashCode9 = (hashCode8 + (text4 != null ? text4.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode10 = (hashCode9 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Layout layout = this.layout;
        int hashCode11 = (hashCode10 + (layout != null ? layout.hashCode() : 0)) * 37;
        String str2 = this.section_id;
        int hashCode12 = (hashCode11 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode13 = (hashCode12 + (color != null ? color.hashCode() : 0)) * 37;
        Button button2 = this.section_footer_button;
        int hashCode14 = (hashCode13 + (button2 != null ? button2.hashCode() : 0)) * 37;
        Boolean bool = this.render_section_divider;
        int hashCode15 = hashCode14 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(4);
        builder.token = this.title;
        builder.borrowed_at = this.content;
        builder.setup_fee_bps = this.default_max_items;
        builder.due_at = this.section_title;
        builder.principal_amount = this.section_subtitle;
        builder.setup_fee_amount = this.section_eyebrow;
        builder.outstanding_amount = this.section_action_button;
        builder.late_fee_amount = this.section_header;
        builder.interest_amount = this.tap_action;
        builder.detail_rows = this.layout;
        builder.credit_line_token = this.section_id;
        builder.state = this.background_color;
        builder.lending_product = this.section_footer_button;
        builder.bnpl_data = this.render_section_divider;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.title != null) {
            arrayList.add("title=██");
        }
        Uri_androidKt uri_androidKt = this.content;
        if (uri_androidKt != null) {
            arrayList.add("content=" + uri_androidKt);
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
        Text text3 = this.section_eyebrow;
        if (text3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("section_eyebrow=", text3, arrayList);
        }
        Button button = this.section_action_button;
        if (button != null) {
            arrayList.add("section_action_button=" + button);
        }
        Text text4 = this.section_header;
        if (text4 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("section_header=", text4, arrayList);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            arrayList.add("tap_action=" + tapAction);
        }
        Layout layout = this.layout;
        if (layout != null) {
            arrayList.add("layout=" + layout);
        }
        String str = this.section_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "section_id=", arrayList);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        Button button2 = this.section_footer_button;
        if (button2 != null) {
            arrayList.add("section_footer_button=" + button2);
        }
        Boolean bool = this.render_section_divider;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("render_section_divider=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
    }
}
