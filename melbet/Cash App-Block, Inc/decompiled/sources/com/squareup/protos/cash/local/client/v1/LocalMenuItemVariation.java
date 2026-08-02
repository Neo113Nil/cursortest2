package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zziu;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.document.DocumentEntity;
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
public final class LocalMenuItemVariation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuItemVariation> CREATOR;
    public final LocalMenuAvailability availability;
    public final LocalMenuItemDeal deal;
    public final List features;
    public final String name;
    public final List option_value_tokens;
    public final LocalMoney price;
    public final ReservationVariationData reservation_variation_data;
    public final String token;

    public enum LocalMenuItemVariationFeature implements WireEnum {
        LOCAL_MENU_ITEM_VARIATION_FEATURE_UNSPECIFIED(0),
        LOCAL_MENU_ITEM_VARIATION_FEATURE_RESERVATION(1);

        public static final LocalMenuItemVariation$LocalMenuItemVariationFeature$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            LocalMenuItemVariationFeature localMenuItemVariationFeature = LOCAL_MENU_ITEM_VARIATION_FEATURE_UNSPECIFIED;
            Companion = new RetailerType.Companion();
            ADAPTER = new LocalMenuItemVariation$LocalMenuItemVariationFeature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LocalMenuItemVariationFeature.class), Syntax.PROTO_2, localMenuItemVariationFeature);
        }

        LocalMenuItemVariationFeature(int i) {
            this.value = i;
        }

        public static final LocalMenuItemVariationFeature fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return LOCAL_MENU_ITEM_VARIATION_FEATURE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return LOCAL_MENU_ITEM_VARIATION_FEATURE_RESERVATION;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class ReservationVariationData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ReservationVariationData> CREATOR;
        public final Long duration;
        public final zziu no_show_fee;
        public final List team_member_tokens;

        static {
            LocalMenuItemVariation$ReservationVariationData$Companion$ADAPTER$1 localMenuItemVariation$ReservationVariationData$Companion$ADAPTER$1 = new LocalMenuItemVariation$ReservationVariationData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReservationVariationData.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemVariation.ReservationVariationData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItemVariation$ReservationVariationData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemVariation$ReservationVariationData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReservationVariationData(Long l, List list, zziu zziuVar, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.duration = l;
            this.no_show_fee = zziuVar;
            this.team_member_tokens = TransactorKt.immutableCopyOf("team_member_tokens", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReservationVariationData)) {
                return false;
            }
            ReservationVariationData reservationVariationData = (ReservationVariationData) obj;
            return Intrinsics.areEqual(unknownFields(), reservationVariationData.unknownFields()) && Intrinsics.areEqual(this.duration, reservationVariationData.duration) && Intrinsics.areEqual(this.team_member_tokens, reservationVariationData.team_member_tokens) && Intrinsics.areEqual(this.no_show_fee, reservationVariationData.no_show_fee);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.duration;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.team_member_tokens);
            zziu zziuVar = this.no_show_fee;
            int hashCode2 = m + (zziuVar != null ? zziuVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BLEPayload.Builder builder = new BLEPayload.Builder(1, false);
            builder.advertisement_data = this.duration;
            builder.transmission_level = this.team_member_tokens;
            builder.frequency = this.no_show_fee;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.duration;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("duration=", l, arrayList);
            }
            List list = this.team_member_tokens;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("team_member_tokens=", arrayList, list);
            }
            zziu zziuVar = this.no_show_fee;
            if (zziuVar != null) {
                arrayList.add("no_show_fee=" + zziuVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ReservationVariationData{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalMenuItemVariation$Companion$ADAPTER$1 localMenuItemVariation$Companion$ADAPTER$1 = new LocalMenuItemVariation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuItemVariation.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemVariation", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuItemVariation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemVariation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuItemVariation(String str, String str2, LocalMoney localMoney, LocalMenuItemDeal localMenuItemDeal, LocalMenuAvailability localMenuAvailability, List list, List list2, ReservationVariationData reservationVariationData, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.token = str;
        this.name = str2;
        this.price = localMoney;
        this.deal = localMenuItemDeal;
        this.availability = localMenuAvailability;
        this.reservation_variation_data = reservationVariationData;
        this.option_value_tokens = TransactorKt.immutableCopyOf("option_value_tokens", list);
        this.features = TransactorKt.immutableCopyOf("features", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuItemVariation)) {
            return false;
        }
        LocalMenuItemVariation localMenuItemVariation = (LocalMenuItemVariation) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuItemVariation.unknownFields()) && Intrinsics.areEqual(this.token, localMenuItemVariation.token) && Intrinsics.areEqual(this.name, localMenuItemVariation.name) && Intrinsics.areEqual(this.price, localMenuItemVariation.price) && Intrinsics.areEqual(this.deal, localMenuItemVariation.deal) && this.availability == localMenuItemVariation.availability && Intrinsics.areEqual(this.option_value_tokens, localMenuItemVariation.option_value_tokens) && Intrinsics.areEqual(this.features, localMenuItemVariation.features) && Intrinsics.areEqual(this.reservation_variation_data, localMenuItemVariation.reservation_variation_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.price;
        int hashCode4 = (hashCode3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        LocalMenuItemDeal localMenuItemDeal = this.deal;
        int hashCode5 = (hashCode4 + (localMenuItemDeal != null ? localMenuItemDeal.hashCode() : 0)) * 37;
        LocalMenuAvailability localMenuAvailability = this.availability;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (localMenuAvailability != null ? localMenuAvailability.hashCode() : 0)) * 37, 37, this.option_value_tokens), 37, this.features);
        ReservationVariationData reservationVariationData = this.reservation_variation_data;
        int hashCode6 = m + (reservationVariationData != null ? reservationVariationData.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(4, false);
        builder.category = this.token;
        builder.token = this.name;
        builder.title = this.price;
        builder.client_route = this.deal;
        builder.url = this.availability;
        builder.owner_token = this.option_value_tokens;
        builder.version_data = this.features;
        builder.localizable_title = this.reservation_variation_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        LocalMoney localMoney = this.price;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("price=", localMoney, arrayList);
        }
        LocalMenuItemDeal localMenuItemDeal = this.deal;
        if (localMenuItemDeal != null) {
            arrayList.add("deal=" + localMenuItemDeal);
        }
        LocalMenuAvailability localMenuAvailability = this.availability;
        if (localMenuAvailability != null) {
            arrayList.add("availability=" + localMenuAvailability);
        }
        List list = this.option_value_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("option_value_tokens=", arrayList, list);
        }
        List list2 = this.features;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("features=", arrayList, list2);
        }
        ReservationVariationData reservationVariationData = this.reservation_variation_data;
        if (reservationVariationData != null) {
            arrayList.add("reservation_variation_data=" + reservationVariationData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuItemVariation{", "}", 0, null, null, 56);
    }
}
