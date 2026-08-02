package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import array.SortOrder;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.compass.api.RadioType;
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

/* loaded from: classes.dex */
public final class DetailsPage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPage> CREATOR;
    public final Text eyebrow;
    public final String header_bar_title;
    public final Text headline;
    public final NavigationIcon navigation_icon;
    public final Button primary_button;
    public final Button primary_button_footer;
    public final SortOrder primary_content;
    public final Button secondary_button;
    public final Button secondary_button_footer;
    public final ShareSheet share_sheet;
    public final Text subheadline;
    public final TextPlacement text_placement;
    public final String token;
    public final String treehouse_path;

    /* loaded from: classes7.dex */
    public enum TextPlacement implements WireEnum {
        TEXT_PLACEMENT_UNSPECIFIED(0),
        TEXT_PLACEMENT_TOP_LEFT(1),
        TEXT_PLACEMENT_MIDDLE_LEFT(2),
        TEXT_PLACEMENT_BOTTOM_LEFT(3),
        TEXT_PLACEMENT_TOP_CENTER(4);

        public static final DetailsPage$TextPlacement$Companion$ADAPTER$1 ADAPTER;
        public static final RadioType.Companion Companion;
        public final int value;

        static {
            TextPlacement textPlacement = TEXT_PLACEMENT_UNSPECIFIED;
            Companion = new RadioType.Companion();
            ADAPTER = new DetailsPage$TextPlacement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextPlacement.class), Syntax.PROTO_2, textPlacement);
        }

        TextPlacement(int i) {
            this.value = i;
        }

        public static final TextPlacement fromValue(int i) {
            Companion.getClass();
            return RadioType.Companion.m3854fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DetailsPage$Companion$ADAPTER$1 detailsPage$Companion$ADAPTER$1 = new DetailsPage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPage.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.DetailsPage", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/details_page.proto");
        ADAPTER = detailsPage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPage(String str, Text text, Text text2, Text text3, TextPlacement textPlacement, Button button, Button button2, ShareSheet shareSheet, String str2, String str3, NavigationIcon navigationIcon, Button button3, Button button4, SortOrder sortOrder, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.treehouse_path = str;
        this.eyebrow = text;
        this.headline = text2;
        this.subheadline = text3;
        this.text_placement = textPlacement;
        this.primary_button = button;
        this.secondary_button = button2;
        this.share_sheet = shareSheet;
        this.header_bar_title = str2;
        this.token = str3;
        this.navigation_icon = navigationIcon;
        this.primary_button_footer = button3;
        this.secondary_button_footer = button4;
        this.primary_content = sortOrder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPage)) {
            return false;
        }
        DetailsPage detailsPage = (DetailsPage) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPage.unknownFields()) && Intrinsics.areEqual(this.treehouse_path, detailsPage.treehouse_path) && Intrinsics.areEqual(this.eyebrow, detailsPage.eyebrow) && Intrinsics.areEqual(this.headline, detailsPage.headline) && Intrinsics.areEqual(this.subheadline, detailsPage.subheadline) && this.text_placement == detailsPage.text_placement && Intrinsics.areEqual(this.primary_button, detailsPage.primary_button) && Intrinsics.areEqual(this.secondary_button, detailsPage.secondary_button) && Intrinsics.areEqual(this.share_sheet, detailsPage.share_sheet) && Intrinsics.areEqual(this.header_bar_title, detailsPage.header_bar_title) && Intrinsics.areEqual(this.token, detailsPage.token) && Intrinsics.areEqual(this.navigation_icon, detailsPage.navigation_icon) && Intrinsics.areEqual(this.primary_button_footer, detailsPage.primary_button_footer) && Intrinsics.areEqual(this.secondary_button_footer, detailsPage.secondary_button_footer) && Intrinsics.areEqual(this.primary_content, detailsPage.primary_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.treehouse_path;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Text text = this.eyebrow;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.headline;
        int hashCode4 = (hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Text text3 = this.subheadline;
        int hashCode5 = (hashCode4 + (text3 != null ? text3.hashCode() : 0)) * 37;
        TextPlacement textPlacement = this.text_placement;
        int hashCode6 = (hashCode5 + (textPlacement != null ? textPlacement.hashCode() : 0)) * 37;
        Button button = this.primary_button;
        int hashCode7 = (hashCode6 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.secondary_button;
        int hashCode8 = (hashCode7 + (button2 != null ? button2.hashCode() : 0)) * 37;
        ShareSheet shareSheet = this.share_sheet;
        int hashCode9 = (hashCode8 + (shareSheet != null ? shareSheet.hashCode() : 0)) * 37;
        String str2 = this.header_bar_title;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.token;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37;
        NavigationIcon navigationIcon = this.navigation_icon;
        int hashCode12 = (hashCode11 + (navigationIcon != null ? navigationIcon.hashCode() : 0)) * 37;
        Button button3 = this.primary_button_footer;
        int hashCode13 = (hashCode12 + (button3 != null ? button3.hashCode() : 0)) * 37;
        Button button4 = this.secondary_button_footer;
        int hashCode14 = (hashCode13 + (button4 != null ? button4.hashCode() : 0)) * 37;
        SortOrder sortOrder = this.primary_content;
        int hashCode15 = hashCode14 + (sortOrder != null ? sortOrder.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(3);
        builder.token = this.treehouse_path;
        builder.borrowed_at = this.eyebrow;
        builder.due_at = this.headline;
        builder.principal_amount = this.subheadline;
        builder.setup_fee_amount = this.text_placement;
        builder.outstanding_amount = this.primary_button;
        builder.late_fee_amount = this.secondary_button;
        builder.interest_amount = this.share_sheet;
        builder.credit_line_token = this.header_bar_title;
        builder.setup_fee_bps = this.token;
        builder.detail_rows = this.navigation_icon;
        builder.state = this.primary_button_footer;
        builder.lending_product = this.secondary_button_footer;
        builder.bnpl_data = this.primary_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.treehouse_path;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "treehouse_path=", arrayList);
        }
        Text text = this.eyebrow;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("eyebrow=", text, arrayList);
        }
        Text text2 = this.headline;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("headline=", text2, arrayList);
        }
        Text text3 = this.subheadline;
        if (text3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subheadline=", text3, arrayList);
        }
        TextPlacement textPlacement = this.text_placement;
        if (textPlacement != null) {
            arrayList.add("text_placement=" + textPlacement);
        }
        Button button = this.primary_button;
        if (button != null) {
            arrayList.add("primary_button=" + button);
        }
        Button button2 = this.secondary_button;
        if (button2 != null) {
            arrayList.add("secondary_button=" + button2);
        }
        ShareSheet shareSheet = this.share_sheet;
        if (shareSheet != null) {
            arrayList.add("share_sheet=" + shareSheet);
        }
        String str2 = this.header_bar_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header_bar_title=", arrayList);
        }
        String str3 = this.token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "token=", arrayList);
        }
        NavigationIcon navigationIcon = this.navigation_icon;
        if (navigationIcon != null) {
            arrayList.add("navigation_icon=" + navigationIcon);
        }
        Button button3 = this.primary_button_footer;
        if (button3 != null) {
            arrayList.add("primary_button_footer=" + button3);
        }
        Button button4 = this.secondary_button_footer;
        if (button4 != null) {
            arrayList.add("secondary_button_footer=" + button4);
        }
        SortOrder sortOrder = this.primary_content;
        if (sortOrder != null) {
            arrayList.add("primary_content=" + sortOrder);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPage{", "}", 0, null, null, 56);
    }
}
