package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.janus.api.ContactAliasType;
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
public final class Offer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Offer> CREATOR;
    public final String coupon_code;
    public final String discount_description;
    public final String display_title;
    public final String eligible_items;
    public final Long expires_at;
    public final LocalImage image;
    public final List offer_lines;
    public final String offer_token;
    public final String redemption_instructions;
    public final OfferStatus status;
    public final String terms_text;
    public final String terms_url;
    public final String validity_terms;
    public final String validity_text;

    public final class Builder extends Message.Builder {
        public String coupon_code;
        public String discount_description;
        public String display_title;
        public String eligible_items;
        public Long expires_at;
        public LocalImage image;
        public List offer_lines;
        public String offer_token;
        public String redemption_instructions;
        public OfferStatus status;
        public String terms_text;
        public String terms_url;
        public String validity_terms;
        public String validity_text;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new Offer(this.offer_token, this.expires_at, this.coupon_code, this.display_title, this.offer_lines, this.redemption_instructions, this.validity_text, this.terms_text, this.terms_url, this.image, this.discount_description, this.validity_terms, this.eligible_items, this.status, buildUnknownFields());
        }
    }

    public enum OfferStatus implements WireEnum {
        OFFER_STATUS_UNSPECIFIED(0),
        OFFER_STATUS_ACTIVE(1),
        OFFER_STATUS_REDEEMED(2);

        public static final Offer$OfferStatus$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            OfferStatus offerStatus = OFFER_STATUS_UNSPECIFIED;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new Offer$OfferStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OfferStatus.class), Syntax.PROTO_2, offerStatus);
        }

        OfferStatus(int i) {
            this.value = i;
        }

        public static final OfferStatus fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return OFFER_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return OFFER_STATUS_ACTIVE;
            }
            if (i != 2) {
                return null;
            }
            return OFFER_STATUS_REDEEMED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Offer$Companion$ADAPTER$1 offer$Companion$ADAPTER$1 = new Offer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Offer.class), "type.googleapis.com/squareup.cash.local.client.v1.Offer", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_offer.proto");
        ADAPTER = offer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offer(String str, Long l, String str2, String str3, List list, String str4, String str5, String str6, String str7, LocalImage localImage, String str8, String str9, String str10, OfferStatus offerStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.offer_token = str;
        this.expires_at = l;
        this.coupon_code = str2;
        this.display_title = str3;
        this.redemption_instructions = str4;
        this.validity_text = str5;
        this.terms_text = str6;
        this.terms_url = str7;
        this.image = localImage;
        this.discount_description = str8;
        this.validity_terms = str9;
        this.eligible_items = str10;
        this.status = offerStatus;
        this.offer_lines = TransactorKt.immutableCopyOf("offer_lines", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return Intrinsics.areEqual(unknownFields(), offer.unknownFields()) && Intrinsics.areEqual(this.offer_token, offer.offer_token) && Intrinsics.areEqual(this.expires_at, offer.expires_at) && Intrinsics.areEqual(this.coupon_code, offer.coupon_code) && Intrinsics.areEqual(this.display_title, offer.display_title) && Intrinsics.areEqual(this.offer_lines, offer.offer_lines) && Intrinsics.areEqual(this.redemption_instructions, offer.redemption_instructions) && Intrinsics.areEqual(this.validity_text, offer.validity_text) && Intrinsics.areEqual(this.terms_text, offer.terms_text) && Intrinsics.areEqual(this.terms_url, offer.terms_url) && Intrinsics.areEqual(this.image, offer.image) && Intrinsics.areEqual(this.discount_description, offer.discount_description) && Intrinsics.areEqual(this.validity_terms, offer.validity_terms) && Intrinsics.areEqual(this.eligible_items, offer.eligible_items) && this.status == offer.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.offer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.expires_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.coupon_code;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.display_title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.offer_lines);
        String str4 = this.redemption_instructions;
        int hashCode5 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.validity_text;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.terms_text;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.terms_url;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        LocalImage localImage = this.image;
        int hashCode9 = (hashCode8 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        String str8 = this.discount_description;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.validity_terms;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.eligible_items;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 37;
        OfferStatus offerStatus = this.status;
        int hashCode13 = hashCode12 + (offerStatus != null ? offerStatus.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.offer_token = this.offer_token;
        builder.expires_at = this.expires_at;
        builder.coupon_code = this.coupon_code;
        builder.display_title = this.display_title;
        builder.offer_lines = this.offer_lines;
        builder.redemption_instructions = this.redemption_instructions;
        builder.validity_text = this.validity_text;
        builder.terms_text = this.terms_text;
        builder.terms_url = this.terms_url;
        builder.image = this.image;
        builder.discount_description = this.discount_description;
        builder.validity_terms = this.validity_terms;
        builder.eligible_items = this.eligible_items;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.offer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "offer_token=", arrayList);
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        String str2 = this.coupon_code;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "coupon_code=", arrayList);
        }
        String str3 = this.display_title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_title=", arrayList);
        }
        List list = this.offer_lines;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("offer_lines=", arrayList, list);
        }
        String str4 = this.redemption_instructions;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "redemption_instructions=", arrayList);
        }
        String str5 = this.validity_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "validity_text=", arrayList);
        }
        String str6 = this.terms_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "terms_text=", arrayList);
        }
        String str7 = this.terms_url;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "terms_url=", arrayList);
        }
        LocalImage localImage = this.image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
        }
        String str8 = this.discount_description;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "discount_description=", arrayList);
        }
        String str9 = this.validity_terms;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "validity_terms=", arrayList);
        }
        String str10 = this.eligible_items;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "eligible_items=", arrayList);
        }
        OfferStatus offerStatus = this.status;
        if (offerStatus != null) {
            arrayList.add("status=" + offerStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Offer{", "}", 0, null, null, 56);
    }
}
