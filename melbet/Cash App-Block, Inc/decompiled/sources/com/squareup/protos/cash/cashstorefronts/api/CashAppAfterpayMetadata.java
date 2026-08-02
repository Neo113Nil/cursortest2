package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
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
public final class CashAppAfterpayMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppAfterpayMetadata> CREATOR;
    public final String affiliate_url;
    public final List categories;

    static {
        CashAppAfterpayMetadata$Companion$ADAPTER$1 cashAppAfterpayMetadata$Companion$ADAPTER$1 = new CashAppAfterpayMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppAfterpayMetadata.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.CashAppAfterpayMetadata", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/BusinessProfile.proto");
        ADAPTER = cashAppAfterpayMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppAfterpayMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppAfterpayMetadata(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.affiliate_url = str;
        this.categories = TransactorKt.immutableCopyOf("categories", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppAfterpayMetadata)) {
            return false;
        }
        CashAppAfterpayMetadata cashAppAfterpayMetadata = (CashAppAfterpayMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppAfterpayMetadata.unknownFields()) && Intrinsics.areEqual(this.affiliate_url, cashAppAfterpayMetadata.affiliate_url) && Intrinsics.areEqual(this.categories, cashAppAfterpayMetadata.categories);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.affiliate_url;
        int hashCode2 = this.categories.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(11, false);
        builder.toggle_title = this.affiliate_url;
        builder.sections = this.categories;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.affiliate_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "affiliate_url=", arrayList);
        }
        List list = this.categories;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("categories=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppAfterpayMetadata{", "}", 0, null, null, 56);
    }
}
