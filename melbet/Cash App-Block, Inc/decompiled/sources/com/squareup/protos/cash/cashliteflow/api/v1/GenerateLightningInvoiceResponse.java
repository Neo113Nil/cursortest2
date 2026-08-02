package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Response;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/api/v1/GenerateLightningInvoiceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GenerateLightningInvoiceResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GenerateLightningInvoiceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenerateLightningInvoiceResponse> CREATOR;
    public final String deposit_address;
    public final Money fiat_amount;
    public final String payment_request;
    public final String qr_code_url;
    public final String share_url;
    public final String unified_address;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String deposit_address;
        public Money fiat_amount;
        public String payment_request;
        public String qr_code_url;
        public String share_url;
        public String unified_address;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GenerateLightningInvoiceResponse(this.payment_request, this.unified_address, this.deposit_address, this.fiat_amount, this.qr_code_url, this.share_url, buildUnknownFields());
                default:
                    return new GenerateLightningInvoice$Response(this.payment_request, this.unified_address, this.deposit_address, this.fiat_amount, this.qr_code_url, this.share_url, buildUnknownFields());
            }
        }
    }

    static {
        GenerateLightningInvoiceResponse$Companion$ADAPTER$1 generateLightningInvoiceResponse$Companion$ADAPTER$1 = new GenerateLightningInvoiceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GenerateLightningInvoiceResponse.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.GenerateLightningInvoiceResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/bitcoin.proto");
        ADAPTER = generateLightningInvoiceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(generateLightningInvoiceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateLightningInvoiceResponse(String str, String str2, String str3, Money money, String str4, String str5, ByteString byteString) {
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
        if (!(obj instanceof GenerateLightningInvoiceResponse)) {
            return false;
        }
        GenerateLightningInvoiceResponse generateLightningInvoiceResponse = (GenerateLightningInvoiceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), generateLightningInvoiceResponse.unknownFields()) && Intrinsics.areEqual(this.payment_request, generateLightningInvoiceResponse.payment_request) && Intrinsics.areEqual(this.unified_address, generateLightningInvoiceResponse.unified_address) && Intrinsics.areEqual(this.deposit_address, generateLightningInvoiceResponse.deposit_address) && Intrinsics.areEqual(this.fiat_amount, generateLightningInvoiceResponse.fiat_amount) && Intrinsics.areEqual(this.qr_code_url, generateLightningInvoiceResponse.qr_code_url) && Intrinsics.areEqual(this.share_url, generateLightningInvoiceResponse.share_url);
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
        Builder builder = new Builder(0);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenerateLightningInvoiceResponse{", "}", 0, null, null, 56);
    }
}
