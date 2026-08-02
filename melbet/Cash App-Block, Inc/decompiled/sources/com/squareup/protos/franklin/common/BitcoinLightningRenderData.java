package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BitcoinLightningRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinLightningRenderData> CREATOR;
    public final FundingSource funding_source;
    public final String invoice;
    public final String order_token;
    public final String payment_hash;
    public final String preimage;
    public final String token;

    public enum FundingSource implements WireEnum {
        UNKNOWN_FUNDING_SOURCE(0),
        BTC_BALANCE(1),
        FIAT_BALANCE(2),
        PAYMENT_AS_A_SERVICE(3);

        public static final BitcoinLightningRenderData$FundingSource$Companion$ADAPTER$1 ADAPTER;
        public static final ClientDriven.Companion Companion;
        public final int value;

        static {
            FundingSource fundingSource = UNKNOWN_FUNDING_SOURCE;
            Companion = new ClientDriven.Companion();
            ADAPTER = new BitcoinLightningRenderData$FundingSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FundingSource.class), Syntax.PROTO_2, fundingSource);
        }

        FundingSource(int i) {
            this.value = i;
        }

        public static final FundingSource fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN_FUNDING_SOURCE;
            }
            if (i == 1) {
                return BTC_BALANCE;
            }
            if (i == 2) {
                return FIAT_BALANCE;
            }
            if (i != 3) {
                return null;
            }
            return PAYMENT_AS_A_SERVICE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BitcoinLightningRenderData$Companion$ADAPTER$1 bitcoinLightningRenderData$Companion$ADAPTER$1 = new BitcoinLightningRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinLightningRenderData.class), "type.googleapis.com/squareup.franklin.BitcoinLightningRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = bitcoinLightningRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinLightningRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinLightningRenderData(String str, String str2, String str3, FundingSource fundingSource, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.invoice = str2;
        this.order_token = str3;
        this.funding_source = fundingSource;
        this.payment_hash = str4;
        this.preimage = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinLightningRenderData)) {
            return false;
        }
        BitcoinLightningRenderData bitcoinLightningRenderData = (BitcoinLightningRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinLightningRenderData.unknownFields()) && Intrinsics.areEqual(this.token, bitcoinLightningRenderData.token) && Intrinsics.areEqual(this.invoice, bitcoinLightningRenderData.invoice) && Intrinsics.areEqual(this.order_token, bitcoinLightningRenderData.order_token) && this.funding_source == bitcoinLightningRenderData.funding_source && Intrinsics.areEqual(this.payment_hash, bitcoinLightningRenderData.payment_hash) && Intrinsics.areEqual(this.preimage, bitcoinLightningRenderData.preimage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.invoice;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.order_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        FundingSource fundingSource = this.funding_source;
        int hashCode5 = (hashCode4 + (fundingSource != null ? fundingSource.hashCode() : 0)) * 37;
        String str4 = this.payment_hash;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.preimage;
        int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(23, false);
        builder.category = this.token;
        builder.token = this.invoice;
        builder.title = this.order_token;
        builder.document_date = this.funding_source;
        builder.url = this.payment_hash;
        builder.owner_token = this.preimage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        if (this.invoice != null) {
            arrayList.add("invoice=██");
        }
        String str2 = this.order_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "order_token=", arrayList);
        }
        FundingSource fundingSource = this.funding_source;
        if (fundingSource != null) {
            arrayList.add("funding_source=" + fundingSource);
        }
        String str3 = this.payment_hash;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "payment_hash=", arrayList);
        }
        String str4 = this.preimage;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "preimage=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinLightningRenderData{", "}", 0, null, null, 56);
    }
}
