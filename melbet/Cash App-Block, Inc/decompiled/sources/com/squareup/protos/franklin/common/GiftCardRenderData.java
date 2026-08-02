package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdv;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.disputron.Pagination;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.PoolsConfig;
import com.squareup.protos.lending.OpaqueRoute;
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

/* loaded from: classes8.dex */
public final class GiftCardRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GiftCardRenderData> CREATOR;
    public final GiftCardType gift_card_type;
    public final String payment_identifier;
    public final zzdv role;

    public final class GiftCardType extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GiftCardType> CREATOR;
        public final String dark_theme_icon_url;
        public final String display_name;
        public final String icon_url;

        static {
            GiftCardRenderData$GiftCardType$Companion$ADAPTER$1 giftCardRenderData$GiftCardType$Companion$ADAPTER$1 = new GiftCardRenderData$GiftCardType$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardType.class), "type.googleapis.com/squareup.franklin.GiftCardRenderData.GiftCardType", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = giftCardRenderData$GiftCardType$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCardRenderData$GiftCardType$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GiftCardType(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_name = str;
            this.icon_url = str2;
            this.dark_theme_icon_url = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GiftCardType)) {
                return false;
            }
            GiftCardType giftCardType = (GiftCardType) obj;
            return Intrinsics.areEqual(unknownFields(), giftCardType.unknownFields()) && Intrinsics.areEqual(this.display_name, giftCardType.display_name) && Intrinsics.areEqual(this.icon_url, giftCardType.icon_url) && Intrinsics.areEqual(this.dark_theme_icon_url, giftCardType.dark_theme_icon_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.display_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.icon_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.dark_theme_icon_url;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolsConfig.Builder builder = new PoolsConfig.Builder(6);
            builder.nux_details_img_url = this.display_name;
            builder.nux_activity_img_url = this.icon_url;
            builder.share_background_img_url = this.dark_theme_icon_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.display_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
            }
            String str2 = this.icon_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_url=", arrayList);
            }
            String str3 = this.dark_theme_icon_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dark_theme_icon_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardType{", "}", 0, null, null, 56);
        }
    }

    public final class RecipientData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecipientData> CREATOR;
        public final Long converted_to_cash_at;
        public final String open_action_base_url;

        static {
            GiftCardRenderData$RecipientData$Companion$ADAPTER$1 giftCardRenderData$RecipientData$Companion$ADAPTER$1 = new GiftCardRenderData$RecipientData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecipientData.class), "type.googleapis.com/squareup.franklin.GiftCardRenderData.RecipientData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = giftCardRenderData$RecipientData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCardRenderData$RecipientData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecipientData(String str, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.open_action_base_url = str;
            this.converted_to_cash_at = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecipientData)) {
                return false;
            }
            RecipientData recipientData = (RecipientData) obj;
            return Intrinsics.areEqual(unknownFields(), recipientData.unknownFields()) && Intrinsics.areEqual(this.open_action_base_url, recipientData.open_action_base_url) && Intrinsics.areEqual(this.converted_to_cash_at, recipientData.converted_to_cash_at);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.open_action_base_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.converted_to_cash_at;
            int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Pagination.Builder builder = new Pagination.Builder(9);
            builder.offset = this.open_action_base_url;
            builder.limit = this.converted_to_cash_at;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.open_action_base_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "open_action_base_url=", arrayList);
            }
            Long l = this.converted_to_cash_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("converted_to_cash_at=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecipientData{", "}", 0, null, null, 56);
        }
    }

    public final class SenderData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SenderData> CREATOR;
        public final String instrument_token;

        static {
            GiftCardRenderData$SenderData$Companion$ADAPTER$1 giftCardRenderData$SenderData$Companion$ADAPTER$1 = new GiftCardRenderData$SenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SenderData.class), "type.googleapis.com/squareup.franklin.GiftCardRenderData.SenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = giftCardRenderData$SenderData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCardRenderData$SenderData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SenderData(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.instrument_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SenderData)) {
                return false;
            }
            SenderData senderData = (SenderData) obj;
            return Intrinsics.areEqual(unknownFields(), senderData.unknownFields()) && Intrinsics.areEqual(this.instrument_token, senderData.instrument_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.instrument_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(19);
            builder.client_route = this.instrument_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.instrument_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SenderData{", "}", 0, null, null, 56);
        }
    }

    static {
        GiftCardRenderData$Companion$ADAPTER$1 giftCardRenderData$Companion$ADAPTER$1 = new GiftCardRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardRenderData.class), "type.googleapis.com/squareup.franklin.GiftCardRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = giftCardRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCardRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardRenderData(GiftCardType giftCardType, String str, zzdv zzdvVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.gift_card_type = giftCardType;
        this.payment_identifier = str;
        this.role = zzdvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftCardRenderData)) {
            return false;
        }
        GiftCardRenderData giftCardRenderData = (GiftCardRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), giftCardRenderData.unknownFields()) && Intrinsics.areEqual(this.gift_card_type, giftCardRenderData.gift_card_type) && Intrinsics.areEqual(this.payment_identifier, giftCardRenderData.payment_identifier) && Intrinsics.areEqual(this.role, giftCardRenderData.role);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GiftCardType giftCardType = this.gift_card_type;
        int hashCode2 = (hashCode + (giftCardType != null ? giftCardType.hashCode() : 0)) * 37;
        String str = this.payment_identifier;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        zzdv zzdvVar = this.role;
        int hashCode4 = hashCode3 + (zzdvVar != null ? zzdvVar.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(20, false);
        builder.display_info = this.gift_card_type;
        builder.institution_token = this.payment_identifier;
        builder.help_menu_items = this.role;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GiftCardType giftCardType = this.gift_card_type;
        if (giftCardType != null) {
            arrayList.add("gift_card_type=" + giftCardType);
        }
        String str = this.payment_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_identifier=", arrayList);
        }
        zzdv zzdvVar = this.role;
        if (zzdvVar != null) {
            arrayList.add("role=" + zzdvVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardRenderData{", "}", 0, null, null, 56);
    }
}
