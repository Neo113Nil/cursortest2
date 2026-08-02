package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
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
public final class DetailsPageImageAsset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageImageAsset> CREATOR;
    public final String dark_url;
    public final String light_url;

    static {
        DetailsPageImageAsset$Companion$ADAPTER$1 detailsPageImageAsset$Companion$ADAPTER$1 = new DetailsPageImageAsset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageImageAsset.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageImageAsset", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageImageAsset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageImageAsset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageImageAsset(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.light_url = str;
        this.dark_url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageImageAsset)) {
            return false;
        }
        DetailsPageImageAsset detailsPageImageAsset = (DetailsPageImageAsset) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageImageAsset.unknownFields()) && Intrinsics.areEqual(this.light_url, detailsPageImageAsset.light_url) && Intrinsics.areEqual(this.dark_url, detailsPageImageAsset.dark_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.light_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.dark_url;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(1);
        builder.name = this.light_url;
        builder.value = this.dark_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.light_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "light_url=", arrayList);
        }
        String str2 = this.dark_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dark_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageImageAsset{", "}", 0, null, null, 56);
    }
}
