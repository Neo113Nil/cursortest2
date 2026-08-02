package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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
public final class RedirectToWeb extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RedirectToWeb> CREATOR;
    public final String url;

    static {
        RedirectToWeb$Companion$ADAPTER$1 redirectToWeb$Companion$ADAPTER$1 = new RedirectToWeb$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RedirectToWeb.class), "type.googleapis.com/squareup.cash.local.client.v1.RedirectToWeb", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = redirectToWeb$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(redirectToWeb$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectToWeb(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedirectToWeb)) {
            return false;
        }
        RedirectToWeb redirectToWeb = (RedirectToWeb) obj;
        return Intrinsics.areEqual(unknownFields(), redirectToWeb.unknownFields()) && Intrinsics.areEqual(this.url, redirectToWeb.url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.url;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(14);
        builder.token = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RedirectToWeb{", "}", 0, null, null, 56);
    }
}
