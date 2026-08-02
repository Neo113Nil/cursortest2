package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.invest.ui.ClientDriven;
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
public final class CouponActivityRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CouponActivityRenderData> CREATOR;
    public final String coupon_icon_url;
    public final String coupon_title;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1375type;
    public final String url_to_open;

    public enum Type implements WireEnum {
        COUPON_CREATED(1),
        COUPON_EXPIRED(2),
        COUPON_REDEEMED(3);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final CouponActivityRenderData$Type$Companion$ADAPTER$1 ADAPTER = new CouponActivityRenderData$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return COUPON_CREATED;
            }
            if (i == 2) {
                return COUPON_EXPIRED;
            }
            if (i != 3) {
                return null;
            }
            return COUPON_REDEEMED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CouponActivityRenderData$Companion$ADAPTER$1 couponActivityRenderData$Companion$ADAPTER$1 = new CouponActivityRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CouponActivityRenderData.class), "type.googleapis.com/squareup.franklin.CouponActivityRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = couponActivityRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(couponActivityRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponActivityRenderData(Type type2, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1375type = type2;
        this.coupon_title = str;
        this.url_to_open = str2;
        this.coupon_icon_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CouponActivityRenderData)) {
            return false;
        }
        CouponActivityRenderData couponActivityRenderData = (CouponActivityRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), couponActivityRenderData.unknownFields()) && this.f1375type == couponActivityRenderData.f1375type && Intrinsics.areEqual(this.coupon_title, couponActivityRenderData.coupon_title) && Intrinsics.areEqual(this.url_to_open, couponActivityRenderData.url_to_open) && Intrinsics.areEqual(this.coupon_icon_url, couponActivityRenderData.coupon_icon_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1375type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.coupon_title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.url_to_open;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.coupon_icon_url;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(21);
        builder.button_color = this.f1375type;
        builder.text_color = this.coupon_title;
        builder.text = this.url_to_open;
        builder.action = this.coupon_icon_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1375type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str = this.coupon_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "coupon_title=", arrayList);
        }
        String str2 = this.url_to_open;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url_to_open=", arrayList);
        }
        String str3 = this.coupon_icon_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "coupon_icon_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CouponActivityRenderData{", "}", 0, null, null, 56);
    }
}
