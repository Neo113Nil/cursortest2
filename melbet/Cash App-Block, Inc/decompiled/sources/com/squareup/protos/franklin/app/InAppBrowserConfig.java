package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
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
public final class InAppBrowserConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InAppBrowserConfig> CREATOR;
    public final FillrConfig fillr_config;

    public final class FillrConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FillrConfig> CREATOR;
        public final String dev_key;
        public final String secret_key;
        public final String widget_password;
        public final String widget_username;

        static {
            InAppBrowserConfig$FillrConfig$Companion$ADAPTER$1 inAppBrowserConfig$FillrConfig$Companion$ADAPTER$1 = new InAppBrowserConfig$FillrConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FillrConfig.class), "type.googleapis.com/squareup.franklin.app.InAppBrowserConfig.FillrConfig", Syntax.PROTO_2, null, "squareup/franklin/app/in_app_browser_config.proto");
            ADAPTER = inAppBrowserConfig$FillrConfig$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppBrowserConfig$FillrConfig$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FillrConfig(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.dev_key = str;
            this.secret_key = str2;
            this.widget_username = str3;
            this.widget_password = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FillrConfig)) {
                return false;
            }
            FillrConfig fillrConfig = (FillrConfig) obj;
            return Intrinsics.areEqual(unknownFields(), fillrConfig.unknownFields()) && Intrinsics.areEqual(this.dev_key, fillrConfig.dev_key) && Intrinsics.areEqual(this.secret_key, fillrConfig.secret_key) && Intrinsics.areEqual(this.widget_username, fillrConfig.widget_username) && Intrinsics.areEqual(this.widget_password, fillrConfig.widget_password);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.dev_key;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.secret_key;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.widget_username;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.widget_password;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolOwner.Builder builder = new PoolOwner.Builder(17);
            builder.customer_token = this.dev_key;
            builder.full_name = this.secret_key;
            builder.profile_photo_url = this.widget_username;
            builder.cashtag = this.widget_password;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.dev_key;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "dev_key=", arrayList);
            }
            if (this.secret_key != null) {
                arrayList.add("secret_key=██");
            }
            String str2 = this.widget_username;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "widget_username=", arrayList);
            }
            if (this.widget_password != null) {
                arrayList.add("widget_password=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FillrConfig{", "}", 0, null, null, 56);
        }
    }

    static {
        InAppBrowserConfig$Companion$ADAPTER$1 inAppBrowserConfig$Companion$ADAPTER$1 = new InAppBrowserConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InAppBrowserConfig.class), "type.googleapis.com/squareup.franklin.app.InAppBrowserConfig", Syntax.PROTO_2, null, "squareup/franklin/app/in_app_browser_config.proto");
        ADAPTER = inAppBrowserConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inAppBrowserConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserConfig(FillrConfig fillrConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.fillr_config = fillrConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InAppBrowserConfig)) {
            return false;
        }
        InAppBrowserConfig inAppBrowserConfig = (InAppBrowserConfig) obj;
        return Intrinsics.areEqual(unknownFields(), inAppBrowserConfig.unknownFields()) && Intrinsics.areEqual(this.fillr_config, inAppBrowserConfig.fillr_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FillrConfig fillrConfig = this.fillr_config;
        int hashCode2 = hashCode + (fillrConfig != null ? fillrConfig.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(15);
        builder.claimable_payment = this.fillr_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FillrConfig fillrConfig = this.fillr_config;
        if (fillrConfig != null) {
            arrayList.add("fillr_config=" + fillrConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InAppBrowserConfig{", "}", 0, null, null, 56);
    }
}
