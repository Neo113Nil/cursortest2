package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class CashLiteCardTransactionRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashLiteCardTransactionRenderData> CREATOR;
    public final String merchant_display_name;
    public final String merchant_logo_url;

    static {
        CashLiteCardTransactionRenderData$Companion$ADAPTER$1 cashLiteCardTransactionRenderData$Companion$ADAPTER$1 = new CashLiteCardTransactionRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashLiteCardTransactionRenderData.class), "type.googleapis.com/squareup.franklin.CashLiteCardTransactionRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = cashLiteCardTransactionRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashLiteCardTransactionRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLiteCardTransactionRenderData(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_display_name = str;
        this.merchant_logo_url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashLiteCardTransactionRenderData)) {
            return false;
        }
        CashLiteCardTransactionRenderData cashLiteCardTransactionRenderData = (CashLiteCardTransactionRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashLiteCardTransactionRenderData.unknownFields()) && Intrinsics.areEqual(this.merchant_display_name, cashLiteCardTransactionRenderData.merchant_display_name) && Intrinsics.areEqual(this.merchant_logo_url, cashLiteCardTransactionRenderData.merchant_logo_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_display_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.merchant_logo_url;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(2);
        builder.server = this.merchant_display_name;
        builder.local = this.merchant_logo_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_display_name=", arrayList);
        }
        String str2 = this.merchant_logo_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_logo_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLiteCardTransactionRenderData{", "}", 0, null, null, 56);
    }
}
