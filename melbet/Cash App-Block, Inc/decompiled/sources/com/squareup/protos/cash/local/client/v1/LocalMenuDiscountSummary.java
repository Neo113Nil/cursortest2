package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.GiftCardCategory;
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
public final class LocalMenuDiscountSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuDiscountSummary> CREATOR;
    public final List details;
    public final String name;
    public final String token;

    static {
        LocalMenuDiscountSummary$Companion$ADAPTER$1 localMenuDiscountSummary$Companion$ADAPTER$1 = new LocalMenuDiscountSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuDiscountSummary.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuDiscountSummary", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuDiscountSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuDiscountSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuDiscountSummary(String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.details = TransactorKt.immutableCopyOf("details", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuDiscountSummary)) {
            return false;
        }
        LocalMenuDiscountSummary localMenuDiscountSummary = (LocalMenuDiscountSummary) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuDiscountSummary.unknownFields()) && Intrinsics.areEqual(this.token, localMenuDiscountSummary.token) && Intrinsics.areEqual(this.name, localMenuDiscountSummary.name) && Intrinsics.areEqual(this.details, localMenuDiscountSummary.details);
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
        int hashCode3 = this.details.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCardCategory.Builder builder = new GiftCardCategory.Builder(3, false);
        builder.token = this.token;
        builder.name = this.name;
        builder.gift_card_type_tokens = this.details;
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
        List list = this.details;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("details=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuDiscountSummary{", "}", 0, null, null, 56);
    }
}
