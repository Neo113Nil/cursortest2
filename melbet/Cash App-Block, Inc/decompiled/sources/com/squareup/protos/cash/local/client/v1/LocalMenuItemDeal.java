package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
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
public final class LocalMenuItemDeal extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuItemDeal> CREATOR;
    public final LocalMenuItemDeal$Deal$AdjustedPrice deal;

    static {
        LocalMenuItemDeal$Companion$ADAPTER$1 localMenuItemDeal$Companion$ADAPTER$1 = new LocalMenuItemDeal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuItemDeal.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemDeal", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuItemDeal$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemDeal$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuItemDeal(LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.deal = localMenuItemDeal$Deal$AdjustedPrice;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuItemDeal)) {
            return false;
        }
        LocalMenuItemDeal localMenuItemDeal = (LocalMenuItemDeal) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuItemDeal.unknownFields()) && Intrinsics.areEqual(this.deal, localMenuItemDeal.deal);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice = this.deal;
        int hashCode2 = hashCode + (localMenuItemDeal$Deal$AdjustedPrice != null ? localMenuItemDeal$Deal$AdjustedPrice.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(8);
        builder.local_buyer = this.deal;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice = this.deal;
        if (localMenuItemDeal$Deal$AdjustedPrice != null) {
            arrayList.add("deal=" + localMenuItemDeal$Deal$AdjustedPrice);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuItemDeal{", "}", 0, null, null, 56);
    }
}
