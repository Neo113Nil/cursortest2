package com.squareup.protos.franklin.loyalty;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PoolsConfig;
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

/* loaded from: classes.dex */
public final class LoyaltyUnit extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoyaltyUnit> CREATOR;
    public final String many;
    public final String one;
    public final String zero;

    static {
        LoyaltyUnit$Companion$ADAPTER$1 loyaltyUnit$Companion$ADAPTER$1 = new LoyaltyUnit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyUnit.class), "type.googleapis.com/squareup.franklin.loyalty.LoyaltyUnit", Syntax.PROTO_2, null, "squareup/franklin/loyalty.proto");
        ADAPTER = loyaltyUnit$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyUnit$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyUnit(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.zero = str;
        this.one = str2;
        this.many = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyUnit)) {
            return false;
        }
        LoyaltyUnit loyaltyUnit = (LoyaltyUnit) obj;
        return Intrinsics.areEqual(unknownFields(), loyaltyUnit.unknownFields()) && Intrinsics.areEqual(this.zero, loyaltyUnit.zero) && Intrinsics.areEqual(this.one, loyaltyUnit.one) && Intrinsics.areEqual(this.many, loyaltyUnit.many);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.zero;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.one;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.many;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(10);
        builder.nux_details_img_url = this.zero;
        builder.nux_activity_img_url = this.one;
        builder.share_background_img_url = this.many;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.zero;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "zero=", arrayList);
        }
        String str2 = this.one;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "one=", arrayList);
        }
        String str3 = this.many;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "many=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyUnit{", "}", 0, null, null, 56);
    }
}
