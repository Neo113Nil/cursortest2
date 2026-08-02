package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.document.DocumentEntity;
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

/* loaded from: classes8.dex */
public final class OfferTimelineSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfferTimelineSheet> CREATOR;
    public final String boost_token;
    public final LocalizedString l_title;
    public final List line_items;
    public final OfferType offer_type;
    public final Button order_card_button;
    public final Image picture;
    public final Button shop_button;
    public final String title;

    public final class LineItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LineItem> CREATOR;
        public final LocalizedString l_subtitle;
        public final LocalizedString l_title;
        public final String subtitle;
        public final String title;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public LocalizedString l_subtitle;
            public LocalizedString l_title;
            public String subtitle;
            public String title;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new LineItem(this.l_title, this.l_subtitle, this.title, this.subtitle, buildUnknownFields());
                    default:
                        return new InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo(this.l_title, this.l_subtitle, this.title, this.subtitle, buildUnknownFields());
                }
            }
        }

        static {
            OfferTimelineSheet$LineItem$Companion$ADAPTER$1 offerTimelineSheet$LineItem$Companion$ADAPTER$1 = new OfferTimelineSheet$LineItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LineItem.class), "type.googleapis.com/squareup.cash.shop.rendering.api.OfferTimelineSheet.LineItem", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Sheets.proto");
            ADAPTER = offerTimelineSheet$LineItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(offerTimelineSheet$LineItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineItem(LocalizedString localizedString, LocalizedString localizedString2, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.l_title = localizedString;
            this.l_subtitle = localizedString2;
            this.title = str;
            this.subtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LineItem)) {
                return false;
            }
            LineItem lineItem = (LineItem) obj;
            return Intrinsics.areEqual(unknownFields(), lineItem.unknownFields()) && Intrinsics.areEqual(this.l_title, lineItem.l_title) && Intrinsics.areEqual(this.l_subtitle, lineItem.l_subtitle) && Intrinsics.areEqual(this.title, lineItem.title) && Intrinsics.areEqual(this.subtitle, lineItem.subtitle);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.l_title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.l_subtitle;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.l_title = this.l_title;
            builder.l_subtitle = this.l_subtitle;
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.l_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.l_subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_subtitle=", localizedString2, arrayList);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LineItem{", "}", 0, null, null, 56);
        }
    }

    static {
        OfferTimelineSheet$Companion$ADAPTER$1 offerTimelineSheet$Companion$ADAPTER$1 = new OfferTimelineSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferTimelineSheet.class), "type.googleapis.com/squareup.cash.shop.rendering.api.OfferTimelineSheet", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Sheets.proto");
        ADAPTER = offerTimelineSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offerTimelineSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferTimelineSheet(OfferType offerType, String str, Image image, List list, Button button, Button button2, LocalizedString localizedString, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.offer_type = offerType;
        this.boost_token = str;
        this.picture = image;
        this.shop_button = button;
        this.order_card_button = button2;
        this.l_title = localizedString;
        this.title = str2;
        this.line_items = TransactorKt.immutableCopyOf("line_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfferTimelineSheet)) {
            return false;
        }
        OfferTimelineSheet offerTimelineSheet = (OfferTimelineSheet) obj;
        return Intrinsics.areEqual(unknownFields(), offerTimelineSheet.unknownFields()) && this.offer_type == offerTimelineSheet.offer_type && Intrinsics.areEqual(this.boost_token, offerTimelineSheet.boost_token) && Intrinsics.areEqual(this.picture, offerTimelineSheet.picture) && Intrinsics.areEqual(this.line_items, offerTimelineSheet.line_items) && Intrinsics.areEqual(this.shop_button, offerTimelineSheet.shop_button) && Intrinsics.areEqual(this.order_card_button, offerTimelineSheet.order_card_button) && Intrinsics.areEqual(this.l_title, offerTimelineSheet.l_title) && Intrinsics.areEqual(this.title, offerTimelineSheet.title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OfferType offerType = this.offer_type;
        int hashCode2 = (hashCode + (offerType != null ? offerType.hashCode() : 0)) * 37;
        String str = this.boost_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Image image = this.picture;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (image != null ? image.hashCode() : 0)) * 37, 37, this.line_items);
        Button button = this.shop_button;
        int hashCode4 = (m + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.order_card_button;
        int hashCode5 = (hashCode4 + (button2 != null ? button2.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.l_title;
        int hashCode6 = (hashCode5 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(15, false);
        builder.title = this.offer_type;
        builder.category = this.boost_token;
        builder.client_route = this.picture;
        builder.url = this.line_items;
        builder.owner_token = this.shop_button;
        builder.version_data = this.order_card_button;
        builder.localizable_title = this.l_title;
        builder.token = this.title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OfferType offerType = this.offer_type;
        if (offerType != null) {
            arrayList.add("offer_type=" + offerType);
        }
        String str = this.boost_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "boost_token=", arrayList);
        }
        Image image = this.picture;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("picture=", image, arrayList);
        }
        List list = this.line_items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("line_items=", arrayList, list);
        }
        Button button = this.shop_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("shop_button=", button, arrayList);
        }
        Button button2 = this.order_card_button;
        if (button2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("order_card_button=", button2, arrayList);
        }
        LocalizedString localizedString = this.l_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfferTimelineSheet{", "}", 0, null, null, 56);
    }
}
