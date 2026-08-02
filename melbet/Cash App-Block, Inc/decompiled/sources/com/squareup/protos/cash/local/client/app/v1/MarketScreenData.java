package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.local.client.app.v1.card.MiniCard;
import com.squareup.protos.cash.ui.Image;
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

/* loaded from: classes7.dex */
public final class MarketScreenData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketScreenData> CREATOR;
    public final String brand_section_title;
    public final ExplainerSection explainer_section;
    public final Boolean explainer_section_in_footer;
    public final List market_brands;
    public final MiniCard market_mini_card;

    public final class ExplainerSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ExplainerSection> CREATOR;
        public final String body;
        public final String button_client_route;
        public final String button_text;
        public final Image image;
        public final String title;

        static {
            MarketScreenData$ExplainerSection$Companion$ADAPTER$1 marketScreenData$ExplainerSection$Companion$ADAPTER$1 = new MarketScreenData$ExplainerSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExplainerSection.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenData.ExplainerSection", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
            ADAPTER = marketScreenData$ExplainerSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenData$ExplainerSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExplainerSection(String str, String str2, String str3, String str4, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
            this.button_text = str3;
            this.button_client_route = str4;
            this.image = image;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExplainerSection)) {
                return false;
            }
            ExplainerSection explainerSection = (ExplainerSection) obj;
            return Intrinsics.areEqual(unknownFields(), explainerSection.unknownFields()) && Intrinsics.areEqual(this.title, explainerSection.title) && Intrinsics.areEqual(this.body, explainerSection.body) && Intrinsics.areEqual(this.button_text, explainerSection.button_text) && Intrinsics.areEqual(this.button_client_route, explainerSection.button_client_route) && Intrinsics.areEqual(this.image, explainerSection.image);
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
            String str3 = this.button_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.button_client_route;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode6 = hashCode5 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(23);
            builder.text = this.title;
            builder.text_style = this.body;
            builder.text_decoration = this.button_text;
            builder.text_color = this.button_client_route;
            builder.icon = this.image;
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
            String str3 = this.button_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
            }
            String str4 = this.button_client_route;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_client_route=", arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ExplainerSection{", "}", 0, null, null, 56);
        }
    }

    public final class MarketBrand extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MarketBrand> CREATOR;
        public final String brand_token;
        public final String client_route;
        public final MiniCard mini_card;
        public final String subtitle;
        public final String title;

        static {
            MarketScreenData$MarketBrand$Companion$ADAPTER$1 marketScreenData$MarketBrand$Companion$ADAPTER$1 = new MarketScreenData$MarketBrand$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketBrand.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenData.MarketBrand", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
            ADAPTER = marketScreenData$MarketBrand$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenData$MarketBrand$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketBrand(String str, String str2, MiniCard miniCard, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.mini_card = miniCard;
            this.brand_token = str3;
            this.client_route = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MarketBrand)) {
                return false;
            }
            MarketBrand marketBrand = (MarketBrand) obj;
            return Intrinsics.areEqual(unknownFields(), marketBrand.unknownFields()) && Intrinsics.areEqual(this.title, marketBrand.title) && Intrinsics.areEqual(this.subtitle, marketBrand.subtitle) && Intrinsics.areEqual(this.mini_card, marketBrand.mini_card) && Intrinsics.areEqual(this.brand_token, marketBrand.brand_token) && Intrinsics.areEqual(this.client_route, marketBrand.client_route);
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
            MiniCard miniCard = this.mini_card;
            int hashCode4 = (hashCode3 + (miniCard != null ? miniCard.hashCode() : 0)) * 37;
            String str3 = this.brand_token;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.client_route;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(24);
            builder.text = this.title;
            builder.text_style = this.subtitle;
            builder.text_decoration = this.mini_card;
            builder.text_color = this.brand_token;
            builder.icon = this.client_route;
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
            MiniCard miniCard = this.mini_card;
            if (miniCard != null) {
                arrayList.add("mini_card=" + miniCard);
            }
            String str3 = this.brand_token;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "brand_token=", arrayList);
            }
            String str4 = this.client_route;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MarketBrand{", "}", 0, null, null, 56);
        }
    }

    static {
        MarketScreenData$Companion$ADAPTER$1 marketScreenData$Companion$ADAPTER$1 = new MarketScreenData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketScreenData.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenData", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
        ADAPTER = marketScreenData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketScreenData(MiniCard miniCard, ExplainerSection explainerSection, Boolean bool, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.market_mini_card = miniCard;
        this.explainer_section = explainerSection;
        this.explainer_section_in_footer = bool;
        this.brand_section_title = str;
        this.market_brands = TransactorKt.immutableCopyOf("market_brands", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketScreenData)) {
            return false;
        }
        MarketScreenData marketScreenData = (MarketScreenData) obj;
        return Intrinsics.areEqual(unknownFields(), marketScreenData.unknownFields()) && Intrinsics.areEqual(this.market_mini_card, marketScreenData.market_mini_card) && Intrinsics.areEqual(this.explainer_section, marketScreenData.explainer_section) && Intrinsics.areEqual(this.explainer_section_in_footer, marketScreenData.explainer_section_in_footer) && Intrinsics.areEqual(this.brand_section_title, marketScreenData.brand_section_title) && Intrinsics.areEqual(this.market_brands, marketScreenData.market_brands);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MiniCard miniCard = this.market_mini_card;
        int hashCode2 = (hashCode + (miniCard != null ? miniCard.hashCode() : 0)) * 37;
        ExplainerSection explainerSection = this.explainer_section;
        int hashCode3 = (hashCode2 + (explainerSection != null ? explainerSection.hashCode() : 0)) * 37;
        Boolean bool = this.explainer_section_in_footer;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.brand_section_title;
        int hashCode5 = this.market_brands.hashCode() + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(22);
        builder.text_style = this.market_mini_card;
        builder.text_decoration = this.explainer_section;
        builder.text_color = this.explainer_section_in_footer;
        builder.text = this.brand_section_title;
        builder.icon = this.market_brands;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MiniCard miniCard = this.market_mini_card;
        if (miniCard != null) {
            arrayList.add("market_mini_card=" + miniCard);
        }
        ExplainerSection explainerSection = this.explainer_section;
        if (explainerSection != null) {
            arrayList.add("explainer_section=" + explainerSection);
        }
        Boolean bool = this.explainer_section_in_footer;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("explainer_section_in_footer=", bool, arrayList);
        }
        String str = this.brand_section_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_section_title=", arrayList);
        }
        List list = this.market_brands;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("market_brands=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketScreenData{", "}", 0, null, null, 56);
    }
}
