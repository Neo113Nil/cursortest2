package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.ui.Avatar;
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
public final class MultiOffersSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MultiOffersSheet> CREATOR;
    public final Avatar business_logo;
    public final List offer_previews;
    public final String subtitle;
    public final String title;

    public final class OfferPreview extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OfferPreview> CREATOR;
        public final String boost_token;
        public final String offer_token;
        public final OfferType offer_type;
        public final String preview_subtitle;
        public final String preview_title;
        public final TapAction tap_action;

        static {
            MultiOffersSheet$OfferPreview$Companion$ADAPTER$1 multiOffersSheet$OfferPreview$Companion$ADAPTER$1 = new MultiOffersSheet$OfferPreview$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferPreview.class), "type.googleapis.com/squareup.cash.shop.rendering.api.MultiOffersSheet.OfferPreview", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Sheets.proto");
            ADAPTER = multiOffersSheet$OfferPreview$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(multiOffersSheet$OfferPreview$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferPreview(OfferType offerType, String str, String str2, String str3, String str4, TapAction tapAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.offer_type = offerType;
            this.offer_token = str;
            this.boost_token = str2;
            this.preview_title = str3;
            this.preview_subtitle = str4;
            this.tap_action = tapAction;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OfferPreview)) {
                return false;
            }
            OfferPreview offerPreview = (OfferPreview) obj;
            return Intrinsics.areEqual(unknownFields(), offerPreview.unknownFields()) && this.offer_type == offerPreview.offer_type && Intrinsics.areEqual(this.offer_token, offerPreview.offer_token) && Intrinsics.areEqual(this.boost_token, offerPreview.boost_token) && Intrinsics.areEqual(this.preview_title, offerPreview.preview_title) && Intrinsics.areEqual(this.preview_subtitle, offerPreview.preview_subtitle) && Intrinsics.areEqual(this.tap_action, offerPreview.tap_action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            OfferType offerType = this.offer_type;
            int hashCode2 = (hashCode + (offerType != null ? offerType.hashCode() : 0)) * 37;
            String str = this.offer_token;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.boost_token;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.preview_title;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.preview_subtitle;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            TapAction tapAction = this.tap_action;
            int hashCode7 = hashCode6 + (tapAction != null ? tapAction.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Document.Builder builder = new Document.Builder(6, false);
            builder.owner_token = this.offer_type;
            builder.category = this.offer_token;
            builder.token = this.boost_token;
            builder.title = this.preview_title;
            builder.url = this.preview_subtitle;
            builder.document_date = this.tap_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            OfferType offerType = this.offer_type;
            if (offerType != null) {
                arrayList.add("offer_type=" + offerType);
            }
            String str = this.offer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "offer_token=", arrayList);
            }
            String str2 = this.boost_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "boost_token=", arrayList);
            }
            String str3 = this.preview_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "preview_title=", arrayList);
            }
            String str4 = this.preview_subtitle;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "preview_subtitle=", arrayList);
            }
            TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OfferPreview{", "}", 0, null, null, 56);
        }
    }

    static {
        MultiOffersSheet$Companion$ADAPTER$1 multiOffersSheet$Companion$ADAPTER$1 = new MultiOffersSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MultiOffersSheet.class), "type.googleapis.com/squareup.cash.shop.rendering.api.MultiOffersSheet", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Sheets.proto");
        ADAPTER = multiOffersSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(multiOffersSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiOffersSheet(Avatar avatar, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.business_logo = avatar;
        this.title = str;
        this.subtitle = str2;
        this.offer_previews = TransactorKt.immutableCopyOf("offer_previews", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiOffersSheet)) {
            return false;
        }
        MultiOffersSheet multiOffersSheet = (MultiOffersSheet) obj;
        return Intrinsics.areEqual(unknownFields(), multiOffersSheet.unknownFields()) && Intrinsics.areEqual(this.business_logo, multiOffersSheet.business_logo) && Intrinsics.areEqual(this.title, multiOffersSheet.title) && Intrinsics.areEqual(this.subtitle, multiOffersSheet.subtitle) && Intrinsics.areEqual(this.offer_previews, multiOffersSheet.offer_previews);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Avatar avatar = this.business_logo;
        int hashCode2 = (hashCode + (avatar != null ? avatar.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode4 = this.offer_previews.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(19);
        builder.card_encryption_data = this.business_logo;
        builder.customer_token_hash_email = this.title;
        builder.device_metadata = this.subtitle;
        builder.success_screen = this.offer_previews;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Avatar avatar = this.business_logo;
        if (avatar != null) {
            arrayList.add("business_logo=" + avatar);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        List list = this.offer_previews;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("offer_previews=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiOffersSheet{", "}", 0, null, null, 56);
    }
}
