package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.franklin.common.AppLinkIOS;
import com.squareup.protos.franklin.common.AppVersion;
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
public final class ExternalAppLink extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExternalAppLink> CREATOR;

    /* renamed from: android, reason: collision with root package name */
    public final AppLinkAndroid f1256android;
    public final AppLinkIOS ios;

    public final class AppLinkAndroid extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppLinkAndroid> CREATOR;
        public final String app_link_url;
        public final String app_package;
        public final AppVersion min_app_version;

        static {
            ExternalAppLink$AppLinkAndroid$Companion$ADAPTER$1 externalAppLink$AppLinkAndroid$Companion$ADAPTER$1 = new ExternalAppLink$AppLinkAndroid$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppLinkAndroid.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.ExternalAppLink.AppLinkAndroid", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/ExternalAppLink.proto");
            ADAPTER = externalAppLink$AppLinkAndroid$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(externalAppLink$AppLinkAndroid$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppLinkAndroid(String str, String str2, AppVersion appVersion, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.app_link_url = str;
            this.app_package = str2;
            this.min_app_version = appVersion;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppLinkAndroid)) {
                return false;
            }
            AppLinkAndroid appLinkAndroid = (AppLinkAndroid) obj;
            return Intrinsics.areEqual(unknownFields(), appLinkAndroid.unknownFields()) && Intrinsics.areEqual(this.app_link_url, appLinkAndroid.app_link_url) && Intrinsics.areEqual(this.app_package, appLinkAndroid.app_package) && Intrinsics.areEqual(this.min_app_version, appLinkAndroid.min_app_version);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.app_link_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.app_package;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            AppVersion appVersion = this.min_app_version;
            int hashCode4 = hashCode3 + (appVersion != null ? appVersion.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinkIOS.Builder builder = new AppLinkIOS.Builder(1);
            builder.app_link_url = this.app_link_url;
            builder.app_store_url = this.app_package;
            builder.min_app_version = this.min_app_version;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.app_link_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_link_url=", arrayList);
            }
            String str2 = this.app_package;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "app_package=", arrayList);
            }
            AppVersion appVersion = this.min_app_version;
            if (appVersion != null) {
                arrayList.add("min_app_version=" + appVersion);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppLinkAndroid{", "}", 0, null, null, 56);
        }
    }

    public final class AppLinkIOS extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppLinkIOS> CREATOR;
        public final String app_link_url;
        public final String app_store_url;
        public final AppVersion min_app_version;

        static {
            ExternalAppLink$AppLinkIOS$Companion$ADAPTER$1 externalAppLink$AppLinkIOS$Companion$ADAPTER$1 = new ExternalAppLink$AppLinkIOS$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppLinkIOS.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.ExternalAppLink.AppLinkIOS", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/ExternalAppLink.proto");
            ADAPTER = externalAppLink$AppLinkIOS$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(externalAppLink$AppLinkIOS$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppLinkIOS(String str, String str2, AppVersion appVersion, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.app_link_url = str;
            this.app_store_url = str2;
            this.min_app_version = appVersion;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppLinkIOS)) {
                return false;
            }
            AppLinkIOS appLinkIOS = (AppLinkIOS) obj;
            return Intrinsics.areEqual(unknownFields(), appLinkIOS.unknownFields()) && Intrinsics.areEqual(this.app_link_url, appLinkIOS.app_link_url) && Intrinsics.areEqual(this.app_store_url, appLinkIOS.app_store_url) && Intrinsics.areEqual(this.min_app_version, appLinkIOS.min_app_version);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.app_link_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.app_store_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            AppVersion appVersion = this.min_app_version;
            int hashCode4 = hashCode3 + (appVersion != null ? appVersion.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinkIOS.Builder builder = new AppLinkIOS.Builder(2);
            builder.app_link_url = this.app_link_url;
            builder.app_store_url = this.app_store_url;
            builder.min_app_version = this.min_app_version;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.app_link_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_link_url=", arrayList);
            }
            String str2 = this.app_store_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "app_store_url=", arrayList);
            }
            AppVersion appVersion = this.min_app_version;
            if (appVersion != null) {
                arrayList.add("min_app_version=" + appVersion);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppLinkIOS{", "}", 0, null, null, 56);
        }
    }

    static {
        ExternalAppLink$Companion$ADAPTER$1 externalAppLink$Companion$ADAPTER$1 = new ExternalAppLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExternalAppLink.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.ExternalAppLink", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/ExternalAppLink.proto");
        ADAPTER = externalAppLink$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(externalAppLink$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalAppLink(AppLinkAndroid appLinkAndroid, AppLinkIOS appLinkIOS, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1256android = appLinkAndroid;
        this.ios = appLinkIOS;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalAppLink)) {
            return false;
        }
        ExternalAppLink externalAppLink = (ExternalAppLink) obj;
        return Intrinsics.areEqual(unknownFields(), externalAppLink.unknownFields()) && Intrinsics.areEqual(this.f1256android, externalAppLink.f1256android) && Intrinsics.areEqual(this.ios, externalAppLink.ios);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppLinkAndroid appLinkAndroid = this.f1256android;
        int hashCode2 = (hashCode + (appLinkAndroid != null ? appLinkAndroid.hashCode() : 0)) * 37;
        AppLinkIOS appLinkIOS = this.ios;
        int hashCode3 = hashCode2 + (appLinkIOS != null ? appLinkIOS.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(9);
        builder.image_url = this.f1256android;
        builder.asset = this.ios;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppLinkAndroid appLinkAndroid = this.f1256android;
        if (appLinkAndroid != null) {
            arrayList.add("android=" + appLinkAndroid);
        }
        AppLinkIOS appLinkIOS = this.ios;
        if (appLinkIOS != null) {
            arrayList.add("ios=" + appLinkIOS);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExternalAppLink{", "}", 0, null, null, 56);
    }
}
