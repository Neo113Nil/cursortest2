package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppGenericBusinessMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppGenericBusinessMetadata> CREATOR;
    public final ExternalAppLink external_app_link;
    public final String iab_url;
    public final List post_checkout_url_patterns;

    static {
        CashAppGenericBusinessMetadata$Companion$ADAPTER$1 cashAppGenericBusinessMetadata$Companion$ADAPTER$1 = new CashAppGenericBusinessMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppGenericBusinessMetadata.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.CashAppGenericBusinessMetadata", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/BusinessProfile.proto");
        ADAPTER = cashAppGenericBusinessMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppGenericBusinessMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppGenericBusinessMetadata(List list, ExternalAppLink externalAppLink, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.external_app_link = externalAppLink;
        this.iab_url = str;
        this.post_checkout_url_patterns = TransactorKt.immutableCopyOf("post_checkout_url_patterns", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppGenericBusinessMetadata)) {
            return false;
        }
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata = (CashAppGenericBusinessMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppGenericBusinessMetadata.unknownFields()) && Intrinsics.areEqual(this.post_checkout_url_patterns, cashAppGenericBusinessMetadata.post_checkout_url_patterns) && Intrinsics.areEqual(this.external_app_link, cashAppGenericBusinessMetadata.external_app_link) && Intrinsics.areEqual(this.iab_url, cashAppGenericBusinessMetadata.iab_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.post_checkout_url_patterns);
        ExternalAppLink externalAppLink = this.external_app_link;
        int hashCode = (m + (externalAppLink != null ? externalAppLink.hashCode() : 0)) * 37;
        String str = this.iab_url;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(19);
        builder.subtitle = this.post_checkout_url_patterns;
        builder.action = this.external_app_link;
        builder.title = this.iab_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.post_checkout_url_patterns;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("post_checkout_url_patterns=", arrayList, list);
        }
        ExternalAppLink externalAppLink = this.external_app_link;
        if (externalAppLink != null) {
            arrayList.add("external_app_link=" + externalAppLink);
        }
        String str = this.iab_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "iab_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppGenericBusinessMetadata{", "}", 0, null, null, 56);
    }
}
