package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Header;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.app.BankingConfig;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/GetBoostConfigResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/BankingConfig$Builder;", "Builder", "BtcBoostUpsell", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetBoostConfigResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBoostConfigResponse> CREATOR;
    public final Long boost_expiration_hint_threshold_basis_points;
    public final BtcBoostUpsell btc_boost_upsell;

    /* loaded from: classes.dex */
    public final class BtcBoostUpsell extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BtcBoostUpsell> CREATOR;
        public final String body_text;
        public final Image image;
        public final String image_url;
        public final Button primary_button;
        public final String title_text;

        /* loaded from: classes8.dex */
        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final String label_text;
            public final String url;

            static {
                GetBoostConfigResponse$BtcBoostUpsell$Button$Companion$ADAPTER$1 getBoostConfigResponse$BtcBoostUpsell$Button$Companion$ADAPTER$1 = new GetBoostConfigResponse$BtcBoostUpsell$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.franklin.app.GetBoostConfigResponse.BtcBoostUpsell.Button", Syntax.PROTO_2, null, "squareup/franklin/app/boost_config.proto");
                ADAPTER = getBoostConfigResponse$BtcBoostUpsell$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getBoostConfigResponse$BtcBoostUpsell$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label_text = str;
                this.url = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.label_text, button.label_text) && Intrinsics.areEqual(this.url, button.url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label_text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.url;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Header.Builder builder = new Header.Builder(25);
                builder.name = this.label_text;
                builder.value = this.url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label_text=", arrayList);
                }
                String str2 = this.url;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        static {
            GetBoostConfigResponse$BtcBoostUpsell$Companion$ADAPTER$1 getBoostConfigResponse$BtcBoostUpsell$Companion$ADAPTER$1 = new GetBoostConfigResponse$BtcBoostUpsell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BtcBoostUpsell.class), "type.googleapis.com/squareup.franklin.app.GetBoostConfigResponse.BtcBoostUpsell", Syntax.PROTO_2, null, "squareup/franklin/app/boost_config.proto");
            ADAPTER = getBoostConfigResponse$BtcBoostUpsell$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getBoostConfigResponse$BtcBoostUpsell$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BtcBoostUpsell(String str, String str2, String str3, Button button, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image_url = str;
            this.title_text = str2;
            this.body_text = str3;
            this.primary_button = button;
            this.image = image;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BtcBoostUpsell)) {
                return false;
            }
            BtcBoostUpsell btcBoostUpsell = (BtcBoostUpsell) obj;
            return Intrinsics.areEqual(unknownFields(), btcBoostUpsell.unknownFields()) && Intrinsics.areEqual(this.image_url, btcBoostUpsell.image_url) && Intrinsics.areEqual(this.title_text, btcBoostUpsell.title_text) && Intrinsics.areEqual(this.body_text, btcBoostUpsell.body_text) && Intrinsics.areEqual(this.primary_button, btcBoostUpsell.primary_button) && Intrinsics.areEqual(this.image, btcBoostUpsell.image);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.image_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.title_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.body_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Button button = this.primary_button;
            int hashCode5 = (hashCode4 + (button != null ? button.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode6 = hashCode5 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DateTime.Builder builder = new DateTime.Builder(28, false);
            builder.posix_tz = this.image_url;
            builder.instant_usec = this.title_text;
            builder.ordinal = this.body_text;
            builder.timezone_offset_min = this.primary_button;
            builder.tz_name = this.image;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.image_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
            }
            String str2 = this.title_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title_text=", arrayList);
            }
            String str3 = this.body_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "body_text=", arrayList);
            }
            Button button = this.primary_button;
            if (button != null) {
                arrayList.add("primary_button=" + button);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BtcBoostUpsell{", "}", 0, null, null, 56);
        }
    }

    static {
        GetBoostConfigResponse$Companion$ADAPTER$1 getBoostConfigResponse$Companion$ADAPTER$1 = new GetBoostConfigResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBoostConfigResponse.class), "type.googleapis.com/squareup.franklin.app.GetBoostConfigResponse", Syntax.PROTO_2, null, "squareup/franklin/app/boost_config.proto");
        ADAPTER = getBoostConfigResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBoostConfigResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBoostConfigResponse(Long l, BtcBoostUpsell btcBoostUpsell, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.boost_expiration_hint_threshold_basis_points = l;
        this.btc_boost_upsell = btcBoostUpsell;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBoostConfigResponse)) {
            return false;
        }
        GetBoostConfigResponse getBoostConfigResponse = (GetBoostConfigResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBoostConfigResponse.unknownFields()) && Intrinsics.areEqual(this.boost_expiration_hint_threshold_basis_points, getBoostConfigResponse.boost_expiration_hint_threshold_basis_points) && Intrinsics.areEqual(this.btc_boost_upsell, getBoostConfigResponse.btc_boost_upsell);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.boost_expiration_hint_threshold_basis_points;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        BtcBoostUpsell btcBoostUpsell = this.btc_boost_upsell;
        int hashCode3 = hashCode2 + (btcBoostUpsell != null ? btcBoostUpsell.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(13);
        builder.strings = this.boost_expiration_hint_threshold_basis_points;
        builder.recurring_deposits_dda_upsell = this.btc_boost_upsell;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.boost_expiration_hint_threshold_basis_points;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("boost_expiration_hint_threshold_basis_points=", l, arrayList);
        }
        BtcBoostUpsell btcBoostUpsell = this.btc_boost_upsell;
        if (btcBoostUpsell != null) {
            arrayList.add("btc_boost_upsell=" + btcBoostUpsell);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBoostConfigResponse{", "}", 0, null, null, 56);
    }
}
