package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.compass.api.WifiScanResult;
import com.squareup.protos.franklin.app.ClaimData;
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
public final class CashDrawerConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashDrawerConfig> CREATOR;
    public final GetCardAsset get_card_asset;

    public final class GetCardAsset extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GetCardAsset> CREATOR;
        public final Integer height;
        public final String image_url;
        public final String video_url;
        public final Integer width;

        static {
            CashDrawerConfig$GetCardAsset$Companion$ADAPTER$1 cashDrawerConfig$GetCardAsset$Companion$ADAPTER$1 = new CashDrawerConfig$GetCardAsset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCardAsset.class), "type.googleapis.com/squareup.franklin.common.CashDrawerConfig.GetCardAsset", Syntax.PROTO_2, null, "squareup/franklin/common/cash_drawer_config.proto");
            ADAPTER = cashDrawerConfig$GetCardAsset$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashDrawerConfig$GetCardAsset$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCardAsset(String str, String str2, Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.video_url = str;
            this.image_url = str2;
            this.width = num;
            this.height = num2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetCardAsset)) {
                return false;
            }
            GetCardAsset getCardAsset = (GetCardAsset) obj;
            return Intrinsics.areEqual(unknownFields(), getCardAsset.unknownFields()) && Intrinsics.areEqual(this.video_url, getCardAsset.video_url) && Intrinsics.areEqual(this.image_url, getCardAsset.image_url) && Intrinsics.areEqual(this.width, getCardAsset.width) && Intrinsics.areEqual(this.height, getCardAsset.height);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.video_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.image_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Integer num = this.width;
            int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.height;
            int hashCode5 = hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WifiScanResult.Builder builder = new WifiScanResult.Builder(1);
            builder.ssid = this.video_url;
            builder.bssid = this.image_url;
            builder.rssi = this.width;
            builder.frequency_mhz = this.height;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.video_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "video_url=", arrayList);
            }
            String str2 = this.image_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "image_url=", arrayList);
            }
            Integer num = this.width;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("width=", num, arrayList);
            }
            Integer num2 = this.height;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("height=", num2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GetCardAsset{", "}", 0, null, null, 56);
        }
    }

    static {
        CashDrawerConfig$Companion$ADAPTER$1 cashDrawerConfig$Companion$ADAPTER$1 = new CashDrawerConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashDrawerConfig.class), "type.googleapis.com/squareup.franklin.common.CashDrawerConfig", Syntax.PROTO_2, null, "squareup/franklin/common/cash_drawer_config.proto");
        ADAPTER = cashDrawerConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashDrawerConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashDrawerConfig(GetCardAsset getCardAsset, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.get_card_asset = getCardAsset;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashDrawerConfig)) {
            return false;
        }
        CashDrawerConfig cashDrawerConfig = (CashDrawerConfig) obj;
        return Intrinsics.areEqual(unknownFields(), cashDrawerConfig.unknownFields()) && Intrinsics.areEqual(this.get_card_asset, cashDrawerConfig.get_card_asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GetCardAsset getCardAsset = this.get_card_asset;
        int hashCode2 = hashCode + (getCardAsset != null ? getCardAsset.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(27);
        builder.claimable_payment = this.get_card_asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GetCardAsset getCardAsset = this.get_card_asset;
        if (getCardAsset != null) {
            arrayList.add("get_card_asset=" + getCardAsset);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashDrawerConfig{", "}", 0, null, null, 56);
    }
}
