package com.squareup.protos.franklin.loyalty;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiDda;
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
public final class PointsReward extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PointsReward> CREATOR;
    public final String display_name;
    public final Money max_discount;
    public final Long points_required;
    public final String token;

    static {
        PointsReward$Companion$ADAPTER$1 pointsReward$Companion$ADAPTER$1 = new PointsReward$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PointsReward.class), "type.googleapis.com/squareup.franklin.loyalty.PointsReward", Syntax.PROTO_2, null, "squareup/franklin/loyalty.proto");
        ADAPTER = pointsReward$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pointsReward$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointsReward(Long l, String str, String str2, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.points_required = l;
        this.display_name = str;
        this.token = str2;
        this.max_discount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PointsReward)) {
            return false;
        }
        PointsReward pointsReward = (PointsReward) obj;
        return Intrinsics.areEqual(unknownFields(), pointsReward.unknownFields()) && Intrinsics.areEqual(this.points_required, pointsReward.points_required) && Intrinsics.areEqual(this.display_name, pointsReward.display_name) && Intrinsics.areEqual(this.token, pointsReward.token) && Intrinsics.areEqual(this.max_discount, pointsReward.max_discount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.points_required;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.display_name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.max_discount;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(5);
        builder.account = this.points_required;
        builder.enabled = this.display_name;
        builder.button = this.token;
        builder.dda_form = this.max_discount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.points_required;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("points_required=", l, arrayList);
        }
        String str = this.display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
        }
        String str2 = this.token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token=", arrayList);
        }
        Money money = this.max_discount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("max_discount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PointsReward{", "}", 0, null, null, 56);
    }
}
