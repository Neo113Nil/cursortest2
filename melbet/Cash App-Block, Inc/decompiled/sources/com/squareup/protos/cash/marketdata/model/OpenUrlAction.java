package com.squareup.protos.cash.marketdata.model;

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
public final class OpenUrlAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpenUrlAction> CREATOR;
    public final String news_url;

    static {
        OpenUrlAction$Companion$ADAPTER$1 openUrlAction$Companion$ADAPTER$1 = new OpenUrlAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenUrlAction.class), "type.googleapis.com/squareup.cash.marketdata.model.OpenUrlAction", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/news.proto");
        ADAPTER = openUrlAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(openUrlAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenUrlAction(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.news_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenUrlAction)) {
            return false;
        }
        OpenUrlAction openUrlAction = (OpenUrlAction) obj;
        return Intrinsics.areEqual(unknownFields(), openUrlAction.unknownFields()) && Intrinsics.areEqual(this.news_url, openUrlAction.news_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.news_url;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(17);
        builder.token = this.news_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.news_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "news_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenUrlAction{", "}", 0, null, null, 56);
    }
}
