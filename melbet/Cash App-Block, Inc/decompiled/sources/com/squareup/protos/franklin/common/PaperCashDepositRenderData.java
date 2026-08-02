package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.document.DocumentEntity;
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
public final class PaperCashDepositRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaperCashDepositRenderData> CREATOR;
    public final String barcode;
    public final String declined_reason;
    public final LocalizableString localizable_declined_reason;
    public final String retailer_location_token;
    public final String retailer_name;
    public final String retailer_token;
    public final String state;
    public final String token;

    static {
        PaperCashDepositRenderData$Companion$ADAPTER$1 paperCashDepositRenderData$Companion$ADAPTER$1 = new PaperCashDepositRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaperCashDepositRenderData.class), "type.googleapis.com/squareup.franklin.PaperCashDepositRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = paperCashDepositRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paperCashDepositRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperCashDepositRenderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.retailer_name = str2;
        this.barcode = str3;
        this.state = str4;
        this.declined_reason = str5;
        this.retailer_token = str6;
        this.retailer_location_token = str7;
        this.localizable_declined_reason = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaperCashDepositRenderData)) {
            return false;
        }
        PaperCashDepositRenderData paperCashDepositRenderData = (PaperCashDepositRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), paperCashDepositRenderData.unknownFields()) && Intrinsics.areEqual(this.token, paperCashDepositRenderData.token) && Intrinsics.areEqual(this.retailer_name, paperCashDepositRenderData.retailer_name) && Intrinsics.areEqual(this.barcode, paperCashDepositRenderData.barcode) && Intrinsics.areEqual(this.state, paperCashDepositRenderData.state) && Intrinsics.areEqual(this.declined_reason, paperCashDepositRenderData.declined_reason) && Intrinsics.areEqual(this.retailer_token, paperCashDepositRenderData.retailer_token) && Intrinsics.areEqual(this.retailer_location_token, paperCashDepositRenderData.retailer_location_token) && Intrinsics.areEqual(this.localizable_declined_reason, paperCashDepositRenderData.localizable_declined_reason);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.retailer_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.barcode;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.state;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.declined_reason;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.retailer_token;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.retailer_location_token;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_declined_reason;
        int hashCode9 = hashCode8 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(27, false);
        builder.category = this.token;
        builder.token = this.retailer_name;
        builder.title = this.barcode;
        builder.client_route = this.state;
        builder.url = this.declined_reason;
        builder.owner_token = this.retailer_token;
        builder.version_data = this.retailer_location_token;
        builder.localizable_title = this.localizable_declined_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.retailer_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "retailer_name=", arrayList);
        }
        String str3 = this.barcode;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "barcode=", arrayList);
        }
        String str4 = this.state;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "state=", arrayList);
        }
        String str5 = this.declined_reason;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "declined_reason=", arrayList);
        }
        String str6 = this.retailer_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "retailer_token=", arrayList);
        }
        String str7 = this.retailer_location_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "retailer_location_token=", arrayList);
        }
        LocalizableString localizableString = this.localizable_declined_reason;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_declined_reason=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaperCashDepositRenderData{", "}", 0, null, null, 56);
    }
}
