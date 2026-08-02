package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
import com.squareup.protos.franklin.app.BankingConfig;
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
public final class CheckDepositConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CheckDepositConfig> CREATOR;
    public final String description;
    public final Image image;

    public final class Image extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Image> CREATOR;
        public final String dark_image_url;
        public final String light_image_url;

        static {
            CheckDepositConfig$Image$Companion$ADAPTER$1 checkDepositConfig$Image$Companion$ADAPTER$1 = new CheckDepositConfig$Image$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Image.class), "type.googleapis.com/squareup.franklin.app.CheckDepositConfig.Image", Syntax.PROTO_2, null, "squareup/franklin/app/deposit_config.proto");
            ADAPTER = checkDepositConfig$Image$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(checkDepositConfig$Image$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.light_image_url = str;
            this.dark_image_url = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.areEqual(unknownFields(), image.unknownFields()) && Intrinsics.areEqual(this.light_image_url, image.light_image_url) && Intrinsics.areEqual(this.dark_image_url, image.dark_image_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.light_image_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.dark_image_url;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(24);
            builder.name = this.light_image_url;
            builder.value = this.dark_image_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.light_image_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "light_image_url=", arrayList);
            }
            String str2 = this.dark_image_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dark_image_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Image{", "}", 0, null, null, 56);
        }
    }

    static {
        CheckDepositConfig$Companion$ADAPTER$1 checkDepositConfig$Companion$ADAPTER$1 = new CheckDepositConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckDepositConfig.class), "type.googleapis.com/squareup.franklin.app.CheckDepositConfig", Syntax.PROTO_2, null, "squareup/franklin/app/deposit_config.proto");
        ADAPTER = checkDepositConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(checkDepositConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDepositConfig(Image image, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.description = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckDepositConfig)) {
            return false;
        }
        CheckDepositConfig checkDepositConfig = (CheckDepositConfig) obj;
        return Intrinsics.areEqual(unknownFields(), checkDepositConfig.unknownFields()) && Intrinsics.areEqual(this.image, checkDepositConfig.image) && Intrinsics.areEqual(this.description, checkDepositConfig.description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        String str = this.description;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(5);
        builder.strings = this.image;
        builder.recurring_deposits_dda_upsell = this.description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        String str = this.description;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckDepositConfig{", "}", 0, null, null, 56);
    }
}
