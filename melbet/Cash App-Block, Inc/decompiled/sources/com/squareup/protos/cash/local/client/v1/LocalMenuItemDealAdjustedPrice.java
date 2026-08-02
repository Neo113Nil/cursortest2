package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
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
public final class LocalMenuItemDealAdjustedPrice extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuItemDealAdjustedPrice> CREATOR;
    public final LocalMoney original_price;

    static {
        LocalMenuItemDealAdjustedPrice$Companion$ADAPTER$1 localMenuItemDealAdjustedPrice$Companion$ADAPTER$1 = new LocalMenuItemDealAdjustedPrice$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuItemDealAdjustedPrice.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemDealAdjustedPrice", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuItemDealAdjustedPrice$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemDealAdjustedPrice$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuItemDealAdjustedPrice(LocalMoney localMoney, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.original_price = localMoney;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuItemDealAdjustedPrice)) {
            return false;
        }
        LocalMenuItemDealAdjustedPrice localMenuItemDealAdjustedPrice = (LocalMenuItemDealAdjustedPrice) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuItemDealAdjustedPrice.unknownFields()) && Intrinsics.areEqual(this.original_price, localMenuItemDealAdjustedPrice.original_price);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalMoney localMoney = this.original_price;
        int hashCode2 = hashCode + (localMoney != null ? localMoney.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(9);
        builder.local_buyer = this.original_price;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalMoney localMoney = this.original_price;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("original_price=", localMoney, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuItemDealAdjustedPrice{", "}", 0, null, null, 56);
    }
}
