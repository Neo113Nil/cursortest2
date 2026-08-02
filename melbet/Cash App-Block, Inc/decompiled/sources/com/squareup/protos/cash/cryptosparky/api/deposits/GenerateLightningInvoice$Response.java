package com.squareup.protos.cash.cryptosparky.api.deposits;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.GenerateLightningInvoiceResponse;
import com.squareup.protos.common.Money;
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
public final class GenerateLightningInvoice$Response extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenerateLightningInvoice$Response> CREATOR;
    public final String deposit_address;
    public final Money fiat_amount;
    public final String payment_request;
    public final String qr_code_url;
    public final String share_url;
    public final String unified_address;

    static {
        GenerateLightningInvoice$Response$Companion$ADAPTER$1 generateLightningInvoice$Response$Companion$ADAPTER$1 = new GenerateLightningInvoice$Response$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GenerateLightningInvoice$Response.class), "type.googleapis.com/squareup.cash.cryptosparky.api.deposits.GenerateLightningInvoice.Response", Syntax.PROTO_2, null, "squareup/cash/cryptosparky/api/deposits/public.proto");
        ADAPTER = generateLightningInvoice$Response$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(generateLightningInvoice$Response$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateLightningInvoice$Response(String str, String str2, String str3, Money money, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_request = str;
        this.unified_address = str2;
        this.deposit_address = str3;
        this.fiat_amount = money;
        this.qr_code_url = str4;
        this.share_url = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenerateLightningInvoice$Response)) {
            return false;
        }
        GenerateLightningInvoice$Response generateLightningInvoice$Response = (GenerateLightningInvoice$Response) obj;
        return Intrinsics.areEqual(unknownFields(), generateLightningInvoice$Response.unknownFields()) && Intrinsics.areEqual(this.payment_request, generateLightningInvoice$Response.payment_request) && Intrinsics.areEqual(this.unified_address, generateLightningInvoice$Response.unified_address) && Intrinsics.areEqual(this.deposit_address, generateLightningInvoice$Response.deposit_address) && Intrinsics.areEqual(this.fiat_amount, generateLightningInvoice$Response.fiat_amount) && Intrinsics.areEqual(this.qr_code_url, generateLightningInvoice$Response.qr_code_url) && Intrinsics.areEqual(this.share_url, generateLightningInvoice$Response.share_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_request;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.unified_address;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.deposit_address;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money = this.fiat_amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        String str4 = this.qr_code_url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.share_url;
        int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GenerateLightningInvoiceResponse.Builder builder = new GenerateLightningInvoiceResponse.Builder(1);
        builder.payment_request = this.payment_request;
        builder.unified_address = this.unified_address;
        builder.deposit_address = this.deposit_address;
        builder.fiat_amount = this.fiat_amount;
        builder.qr_code_url = this.qr_code_url;
        builder.share_url = this.share_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.payment_request != null) {
            arrayList.add("payment_request=██");
        }
        if (this.unified_address != null) {
            arrayList.add("unified_address=██");
        }
        if (this.deposit_address != null) {
            arrayList.add("deposit_address=██");
        }
        Money money = this.fiat_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("fiat_amount=", money, arrayList);
        }
        if (this.qr_code_url != null) {
            arrayList.add("qr_code_url=██");
        }
        if (this.share_url != null) {
            arrayList.add("share_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Response{", "}", 0, null, null, 56);
    }
}
