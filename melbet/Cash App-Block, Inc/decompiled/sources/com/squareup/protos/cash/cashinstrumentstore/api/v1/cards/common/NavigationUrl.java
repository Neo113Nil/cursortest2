package com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
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
public final class NavigationUrl extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NavigationUrl> CREATOR;
    public final Platform platform;
    public final String url;

    static {
        NavigationUrl$Companion$ADAPTER$1 navigationUrl$Companion$ADAPTER$1 = new NavigationUrl$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NavigationUrl.class), "type.googleapis.com/squareup.cash.cashinstrumentstore.api.v1.cards.common.NavigationUrl", Syntax.PROTO_2, null, "squareup/cash/cashinstrumentstore/api/v1/cards/common/navigation_url.proto");
        ADAPTER = navigationUrl$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(navigationUrl$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationUrl(Platform platform, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.platform = platform;
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NavigationUrl)) {
            return false;
        }
        NavigationUrl navigationUrl = (NavigationUrl) obj;
        return Intrinsics.areEqual(unknownFields(), navigationUrl.unknownFields()) && this.platform == navigationUrl.platform && Intrinsics.areEqual(this.url, navigationUrl.url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Platform platform = this.platform;
        int hashCode2 = (hashCode + (platform != null ? platform.hashCode() : 0)) * 37;
        String str = this.url;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(26);
        builder.errors = this.platform;
        builder.result = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Platform platform = this.platform;
        if (platform != null) {
            arrayList.add("platform=" + platform);
        }
        String str = this.url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationUrl{", "}", 0, null, null, 56);
    }
}
