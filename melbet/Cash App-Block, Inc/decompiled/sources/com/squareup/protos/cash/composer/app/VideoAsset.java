package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.protos.cash.cashregistrar.Account;
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
public final class VideoAsset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VideoAsset> CREATOR;
    public final String accessibility_hint;
    public final String asset_url;
    public final String fallback_image_url;
    public final VideoAsset$FormFactor$VideoFill form_factor;
    public final Boolean should_loop;

    public final class VideoFill extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<VideoFill> CREATOR;

        static {
            VideoAsset$VideoFill$Companion$ADAPTER$1 videoAsset$VideoFill$Companion$ADAPTER$1 = new VideoAsset$VideoFill$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VideoFill.class), "type.googleapis.com/squareup.cash.composer.app.VideoAsset.VideoFill", Syntax.PROTO_2, null, "squareup/cash/composer/app/AppService.proto");
            ADAPTER = videoAsset$VideoFill$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(videoAsset$VideoFill$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoFill(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof VideoFill) && Intrinsics.areEqual(unknownFields(), ((VideoFill) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Empty.Builder builder = new Empty.Builder(14);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "VideoFill{}";
        }
    }

    static {
        VideoAsset$Companion$ADAPTER$1 videoAsset$Companion$ADAPTER$1 = new VideoAsset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VideoAsset.class), "type.googleapis.com/squareup.cash.composer.app.VideoAsset", Syntax.PROTO_2, null, "squareup/cash/composer/app/AppService.proto");
        ADAPTER = videoAsset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(videoAsset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoAsset(String str, String str2, String str3, Boolean bool, VideoAsset$FormFactor$VideoFill videoAsset$FormFactor$VideoFill, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.asset_url = str;
        this.accessibility_hint = str2;
        this.fallback_image_url = str3;
        this.should_loop = bool;
        this.form_factor = videoAsset$FormFactor$VideoFill;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoAsset)) {
            return false;
        }
        VideoAsset videoAsset = (VideoAsset) obj;
        return Intrinsics.areEqual(unknownFields(), videoAsset.unknownFields()) && Intrinsics.areEqual(this.asset_url, videoAsset.asset_url) && Intrinsics.areEqual(this.accessibility_hint, videoAsset.accessibility_hint) && Intrinsics.areEqual(this.fallback_image_url, videoAsset.fallback_image_url) && Intrinsics.areEqual(this.should_loop, videoAsset.should_loop) && Intrinsics.areEqual(this.form_factor, videoAsset.form_factor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.asset_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.accessibility_hint;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.fallback_image_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.should_loop;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        VideoAsset$FormFactor$VideoFill videoAsset$FormFactor$VideoFill = this.form_factor;
        int hashCode6 = hashCode5 + (videoAsset$FormFactor$VideoFill != null ? videoAsset$FormFactor$VideoFill.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(27, false);
        builder.customer_token = this.asset_url;
        builder.account_token = this.accessibility_hint;
        builder.display_name = this.fallback_image_url;
        builder.is_sponsored_account = this.should_loop;
        builder.account_type = this.form_factor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "asset_url=", arrayList);
        }
        String str2 = this.accessibility_hint;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "accessibility_hint=", arrayList);
        }
        String str3 = this.fallback_image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "fallback_image_url=", arrayList);
        }
        Boolean bool = this.should_loop;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_loop=", bool, arrayList);
        }
        VideoAsset$FormFactor$VideoFill videoAsset$FormFactor$VideoFill = this.form_factor;
        if (videoAsset$FormFactor$VideoFill != null) {
            arrayList.add("form_factor=" + videoAsset$FormFactor$VideoFill);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VideoAsset{", "}", 0, null, null, 56);
    }
}
