package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
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

/* loaded from: classes7.dex */
public final class POSLocalCashRedemption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<POSLocalCashRedemption> CREATOR;
    public final String brand_name;
    public final String cashtag;
    public final String check_in_token;
    public final List coupons;
    public final LocalColor foreground_color;
    public final String location_token;
    public final LocalMiniCard mini_card;
    public final String transaction_id;

    public final class Coupon extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Coupon> CREATOR;
        public final String code;
        public final LocalImage icon;
        public final String title;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public String code;
            public LocalImage icon;
            public String title;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Coupon(this.icon, this.title, this.code, buildUnknownFields());
                    case 1:
                        return new GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage(this.icon, this.title, this.code, buildUnknownFields());
                    case 2:
                        return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row(this.icon, this.title, this.code, buildUnknownFields());
                    default:
                        return new POSBrandOnboarding.HowItWorks.Row(this.icon, this.title, this.code, buildUnknownFields());
                }
            }
        }

        static {
            POSLocalCashRedemption$Coupon$Companion$ADAPTER$1 pOSLocalCashRedemption$Coupon$Companion$ADAPTER$1 = new POSLocalCashRedemption$Coupon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Coupon.class), "type.googleapis.com/squareup.cash.local.client.v1.POSLocalCashRedemption.Coupon", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = pOSLocalCashRedemption$Coupon$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(pOSLocalCashRedemption$Coupon$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Coupon(LocalImage localImage, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = localImage;
            this.title = str;
            this.code = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Coupon)) {
                return false;
            }
            Coupon coupon = (Coupon) obj;
            return Intrinsics.areEqual(unknownFields(), coupon.unknownFields()) && Intrinsics.areEqual(this.icon, coupon.icon) && Intrinsics.areEqual(this.title, coupon.title) && Intrinsics.areEqual(this.code, coupon.code);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalImage localImage = this.icon;
            int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.code;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.icon = this.icon;
            builder.title = this.title;
            builder.code = this.code;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalImage localImage = this.icon;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", localImage, arrayList);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.code;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "code=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Coupon{", "}", 0, null, null, 56);
        }
    }

    static {
        POSLocalCashRedemption$Companion$ADAPTER$1 pOSLocalCashRedemption$Companion$ADAPTER$1 = new POSLocalCashRedemption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(POSLocalCashRedemption.class), "type.googleapis.com/squareup.cash.local.client.v1.POSLocalCashRedemption", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = pOSLocalCashRedemption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pOSLocalCashRedemption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POSLocalCashRedemption(String str, String str2, String str3, LocalMiniCard localMiniCard, LocalColor localColor, String str4, List list, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.transaction_id = str;
        this.location_token = str2;
        this.brand_name = str3;
        this.mini_card = localMiniCard;
        this.foreground_color = localColor;
        this.cashtag = str4;
        this.check_in_token = str5;
        this.coupons = TransactorKt.immutableCopyOf("coupons", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof POSLocalCashRedemption)) {
            return false;
        }
        POSLocalCashRedemption pOSLocalCashRedemption = (POSLocalCashRedemption) obj;
        return Intrinsics.areEqual(unknownFields(), pOSLocalCashRedemption.unknownFields()) && Intrinsics.areEqual(this.transaction_id, pOSLocalCashRedemption.transaction_id) && Intrinsics.areEqual(this.location_token, pOSLocalCashRedemption.location_token) && Intrinsics.areEqual(this.brand_name, pOSLocalCashRedemption.brand_name) && Intrinsics.areEqual(this.mini_card, pOSLocalCashRedemption.mini_card) && Intrinsics.areEqual(this.foreground_color, pOSLocalCashRedemption.foreground_color) && Intrinsics.areEqual(this.cashtag, pOSLocalCashRedemption.cashtag) && Intrinsics.areEqual(this.coupons, pOSLocalCashRedemption.coupons) && Intrinsics.areEqual(this.check_in_token, pOSLocalCashRedemption.check_in_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.transaction_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.location_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.brand_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalMiniCard localMiniCard = this.mini_card;
        int hashCode5 = (hashCode4 + (localMiniCard != null ? localMiniCard.hashCode() : 0)) * 37;
        LocalColor localColor = this.foreground_color;
        int hashCode6 = (hashCode5 + (localColor != null ? localColor.hashCode() : 0)) * 37;
        String str4 = this.cashtag;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.coupons);
        String str5 = this.check_in_token;
        int hashCode7 = m + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(5, false);
        builder.category = this.transaction_id;
        builder.token = this.location_token;
        builder.title = this.brand_name;
        builder.owner_token = this.mini_card;
        builder.version_data = this.foreground_color;
        builder.client_route = this.cashtag;
        builder.localizable_title = this.coupons;
        builder.url = this.check_in_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.transaction_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "transaction_id=", arrayList);
        }
        String str2 = this.location_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
        }
        String str3 = this.brand_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "brand_name=", arrayList);
        }
        LocalMiniCard localMiniCard = this.mini_card;
        if (localMiniCard != null) {
            arrayList.add("mini_card=" + localMiniCard);
        }
        LocalColor localColor = this.foreground_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("foreground_color=", localColor, arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        List list = this.coupons;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("coupons=", arrayList, list);
        }
        String str4 = this.check_in_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "check_in_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "POSLocalCashRedemption{", "}", 0, null, null, 56);
    }
}
