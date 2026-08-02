package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.ui.UiControl;
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

/* loaded from: classes8.dex */
public final class AchRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AchRenderData> CREATOR;
    public final Money amount;
    public final String category_name;
    public final Long how_early_days;
    public final Boolean is_early_deposit;
    public final Image logo_images;
    public final String normalized_destination_name;
    public final String normalized_source_name;
    public final String raw_destination_name;
    public final String raw_source_name;
    public final String subcategory_name;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1370type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        DEBIT(1),
        CREDIT(2);

        public static final AchRenderData$Type$Companion$ADAPTER$1 ADAPTER;
        public static final UiControl.Type.Companion Companion;
        public final int value;

        static {
            Type type2 = UNKNOWN;
            Companion = new UiControl.Type.Companion();
            ADAPTER = new AchRenderData$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DEBIT;
            }
            if (i != 2) {
                return null;
            }
            return CREDIT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AchRenderData$Companion$ADAPTER$1 achRenderData$Companion$ADAPTER$1 = new AchRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AchRenderData.class), "type.googleapis.com/squareup.franklin.AchRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = achRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(achRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchRenderData(Type type2, Money money, String str, String str2, String str3, String str4, Image image, String str5, String str6, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1370type = type2;
        this.amount = money;
        this.raw_source_name = str;
        this.raw_destination_name = str2;
        this.normalized_source_name = str3;
        this.normalized_destination_name = str4;
        this.logo_images = image;
        this.category_name = str5;
        this.subcategory_name = str6;
        this.is_early_deposit = bool;
        this.how_early_days = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AchRenderData)) {
            return false;
        }
        AchRenderData achRenderData = (AchRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), achRenderData.unknownFields()) && this.f1370type == achRenderData.f1370type && Intrinsics.areEqual(this.amount, achRenderData.amount) && Intrinsics.areEqual(this.raw_source_name, achRenderData.raw_source_name) && Intrinsics.areEqual(this.raw_destination_name, achRenderData.raw_destination_name) && Intrinsics.areEqual(this.normalized_source_name, achRenderData.normalized_source_name) && Intrinsics.areEqual(this.normalized_destination_name, achRenderData.normalized_destination_name) && Intrinsics.areEqual(this.logo_images, achRenderData.logo_images) && Intrinsics.areEqual(this.category_name, achRenderData.category_name) && Intrinsics.areEqual(this.subcategory_name, achRenderData.subcategory_name) && Intrinsics.areEqual(this.is_early_deposit, achRenderData.is_early_deposit) && Intrinsics.areEqual(this.how_early_days, achRenderData.how_early_days);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1370type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.raw_source_name;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.raw_destination_name;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.normalized_source_name;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.normalized_destination_name;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Image image = this.logo_images;
        int hashCode8 = (hashCode7 + (image != null ? image.hashCode() : 0)) * 37;
        String str5 = this.category_name;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.subcategory_name;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool = this.is_early_deposit;
        int hashCode11 = (hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.how_early_days;
        int hashCode12 = hashCode11 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(13);
        builder.default_wage = this.f1370type;
        builder.updated_at_timestamp_ms = this.amount;
        builder.token = this.raw_source_name;
        builder.merchant_token = this.raw_destination_name;
        builder.title = this.normalized_source_name;
        builder.deleted_at_timestamp_ms = this.normalized_destination_name;
        builder.team_member_count = this.logo_images;
        builder.version = this.category_name;
        builder.default_color_scheme = this.subcategory_name;
        builder.tip_eligible = this.is_early_deposit;
        builder.created_at_timestamp_ms = this.how_early_days;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1370type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str = this.raw_source_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "raw_source_name=", arrayList);
        }
        String str2 = this.raw_destination_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "raw_destination_name=", arrayList);
        }
        String str3 = this.normalized_source_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "normalized_source_name=", arrayList);
        }
        String str4 = this.normalized_destination_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "normalized_destination_name=", arrayList);
        }
        Image image = this.logo_images;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("logo_images=", image, arrayList);
        }
        String str5 = this.category_name;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "category_name=", arrayList);
        }
        String str6 = this.subcategory_name;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "subcategory_name=", arrayList);
        }
        Boolean bool = this.is_early_deposit;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_early_deposit=", bool, arrayList);
        }
        Long l = this.how_early_days;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("how_early_days=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AchRenderData{", "}", 0, null, null, 56);
    }
}
