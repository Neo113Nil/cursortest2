package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.Group;
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

/* loaded from: classes7.dex */
public final class LocalComboSlotPriceAdjustment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalComboSlotPriceAdjustment> CREATOR;
    public final LocalMoney price_adjustment;
    public final String token;
    public final String variation_token;

    static {
        LocalComboSlotPriceAdjustment$Companion$ADAPTER$1 localComboSlotPriceAdjustment$Companion$ADAPTER$1 = new LocalComboSlotPriceAdjustment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalComboSlotPriceAdjustment.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalComboSlotPriceAdjustment", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localComboSlotPriceAdjustment$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localComboSlotPriceAdjustment$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalComboSlotPriceAdjustment(String str, String str2, LocalMoney localMoney, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.variation_token = str2;
        this.price_adjustment = localMoney;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalComboSlotPriceAdjustment)) {
            return false;
        }
        LocalComboSlotPriceAdjustment localComboSlotPriceAdjustment = (LocalComboSlotPriceAdjustment) obj;
        return Intrinsics.areEqual(unknownFields(), localComboSlotPriceAdjustment.unknownFields()) && Intrinsics.areEqual(this.token, localComboSlotPriceAdjustment.token) && Intrinsics.areEqual(this.variation_token, localComboSlotPriceAdjustment.variation_token) && Intrinsics.areEqual(this.price_adjustment, localComboSlotPriceAdjustment.price_adjustment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.variation_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalMoney localMoney = this.price_adjustment;
        int hashCode4 = hashCode3 + (localMoney != null ? localMoney.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(26);
        builder.name = this.token;
        builder.group_image = this.variation_token;
        builder.participants = this.price_adjustment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.variation_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "variation_token=", arrayList);
        }
        LocalMoney localMoney = this.price_adjustment;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("price_adjustment=", localMoney, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalComboSlotPriceAdjustment{", "}", 0, null, null, 56);
    }
}
