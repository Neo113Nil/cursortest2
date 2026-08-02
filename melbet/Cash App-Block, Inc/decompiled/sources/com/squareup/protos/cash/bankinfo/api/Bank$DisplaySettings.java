package com.squareup.protos.cash.bankinfo.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Bank$DisplaySettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Bank$DisplaySettings> CREATOR;
    public final String banner_icon_url;
    public final String color_card_icon_url;
    public final String detail_icon_url;
    public final Theme display_theme;
    public final String monochrome_card_icon_url;
    public final String selection_icon_url;
    public final String tab_card_icon_url;
    public final String tab_detail_icon_url;
    public final String tab_selection_icon_url;

    public final class Theme extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Theme> CREATOR;
        public final String accent_colour;
        public final String base_colour;

        static {
            Bank$DisplaySettings$Theme$Companion$ADAPTER$1 bank$DisplaySettings$Theme$Companion$ADAPTER$1 = new Bank$DisplaySettings$Theme$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Theme.class), "type.googleapis.com/squareup.cash.bankinfo.api.Bank.DisplaySettings.Theme", Syntax.PROTO_2, null, "squareup/cash/bankinfo/api/Bank.proto");
            ADAPTER = bank$DisplaySettings$Theme$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bank$DisplaySettings$Theme$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Theme(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.base_colour = str;
            this.accent_colour = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Theme)) {
                return false;
            }
            Theme theme = (Theme) obj;
            return Intrinsics.areEqual(unknownFields(), theme.unknownFields()) && Intrinsics.areEqual(this.base_colour, theme.base_colour) && Intrinsics.areEqual(this.accent_colour, theme.accent_colour);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.base_colour;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.accent_colour;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Cashtag.Builder builder = new Cashtag.Builder(8);
            builder.prefix = this.base_colour;
            builder.name = this.accent_colour;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.base_colour;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "base_colour=", arrayList);
            }
            String str2 = this.accent_colour;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "accent_colour=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Theme{", "}", 0, null, null, 56);
        }
    }

    static {
        Bank$DisplaySettings$Companion$ADAPTER$1 bank$DisplaySettings$Companion$ADAPTER$1 = new Bank$DisplaySettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bank$DisplaySettings.class), "type.googleapis.com/squareup.cash.bankinfo.api.Bank.DisplaySettings", Syntax.PROTO_2, null, "squareup/cash/bankinfo/api/Bank.proto");
        ADAPTER = bank$DisplaySettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bank$DisplaySettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bank$DisplaySettings(Theme theme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_theme = theme;
        this.monochrome_card_icon_url = str;
        this.color_card_icon_url = str2;
        this.tab_card_icon_url = str3;
        this.detail_icon_url = str4;
        this.tab_detail_icon_url = str5;
        this.selection_icon_url = str6;
        this.tab_selection_icon_url = str7;
        this.banner_icon_url = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bank$DisplaySettings)) {
            return false;
        }
        Bank$DisplaySettings bank$DisplaySettings = (Bank$DisplaySettings) obj;
        return Intrinsics.areEqual(unknownFields(), bank$DisplaySettings.unknownFields()) && Intrinsics.areEqual(this.display_theme, bank$DisplaySettings.display_theme) && Intrinsics.areEqual(this.monochrome_card_icon_url, bank$DisplaySettings.monochrome_card_icon_url) && Intrinsics.areEqual(this.color_card_icon_url, bank$DisplaySettings.color_card_icon_url) && Intrinsics.areEqual(this.tab_card_icon_url, bank$DisplaySettings.tab_card_icon_url) && Intrinsics.areEqual(this.detail_icon_url, bank$DisplaySettings.detail_icon_url) && Intrinsics.areEqual(this.tab_detail_icon_url, bank$DisplaySettings.tab_detail_icon_url) && Intrinsics.areEqual(this.selection_icon_url, bank$DisplaySettings.selection_icon_url) && Intrinsics.areEqual(this.tab_selection_icon_url, bank$DisplaySettings.tab_selection_icon_url) && Intrinsics.areEqual(this.banner_icon_url, bank$DisplaySettings.banner_icon_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Theme theme = this.display_theme;
        int hashCode2 = (hashCode + (theme != null ? theme.hashCode() : 0)) * 37;
        String str = this.monochrome_card_icon_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.color_card_icon_url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.tab_card_icon_url;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.detail_icon_url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.tab_detail_icon_url;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.selection_icon_url;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.tab_selection_icon_url;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.banner_icon_url;
        int hashCode10 = hashCode9 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(5, false);
        builder.locale = this.display_theme;
        builder.title = this.monochrome_card_icon_url;
        builder.info_rows_header = this.color_card_icon_url;
        builder.footer_text = this.tab_card_icon_url;
        builder.loadable_subtitle = this.detail_icon_url;
        builder.info_rows = this.tab_detail_icon_url;
        builder.primary_footer_button_state = this.selection_icon_url;
        builder.secondary_footer_button_state = this.tab_selection_icon_url;
        builder.payment_plans_data = this.banner_icon_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Theme theme = this.display_theme;
        if (theme != null) {
            arrayList.add("display_theme=" + theme);
        }
        String str = this.monochrome_card_icon_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "monochrome_card_icon_url=", arrayList);
        }
        String str2 = this.color_card_icon_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "color_card_icon_url=", arrayList);
        }
        String str3 = this.tab_card_icon_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "tab_card_icon_url=", arrayList);
        }
        String str4 = this.detail_icon_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "detail_icon_url=", arrayList);
        }
        String str5 = this.tab_detail_icon_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "tab_detail_icon_url=", arrayList);
        }
        String str6 = this.selection_icon_url;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "selection_icon_url=", arrayList);
        }
        String str7 = this.tab_selection_icon_url;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "tab_selection_icon_url=", arrayList);
        }
        String str8 = this.banner_icon_url;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "banner_icon_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplaySettings{", "}", 0, null, null, 56);
    }
}
