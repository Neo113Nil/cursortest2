package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashstorefronts.api.ExternalAppLink;
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
public final class AppLinkIOS extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppLinkIOS> CREATOR;
    public final String app_link_url;
    public final String app_store_url;
    public final AppVersion min_app_version;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String app_link_url;
        public String app_store_url;
        public AppVersion min_app_version;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AppLinkIOS(this.app_link_url, this.app_store_url, this.min_app_version, buildUnknownFields());
                case 1:
                    return new ExternalAppLink.AppLinkAndroid(this.app_link_url, this.app_store_url, this.min_app_version, buildUnknownFields());
                case 2:
                    return new ExternalAppLink.AppLinkIOS(this.app_link_url, this.app_store_url, this.min_app_version, buildUnknownFields());
                default:
                    return new AppLinkAndroid(this.app_link_url, this.app_store_url, this.min_app_version, buildUnknownFields());
            }
        }
    }

    static {
        AppLinkIOS$Companion$ADAPTER$1 appLinkIOS$Companion$ADAPTER$1 = new AppLinkIOS$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppLinkIOS.class), "type.googleapis.com/squareup.franklin.common.AppLinkIOS", Syntax.PROTO_2, null, "squareup/franklin/common/app_links.proto");
        ADAPTER = appLinkIOS$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appLinkIOS$Companion$ADAPTER$1);
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
        Builder builder = new Builder(0);
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
