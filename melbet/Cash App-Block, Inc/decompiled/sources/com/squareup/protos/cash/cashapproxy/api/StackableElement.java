package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import app.cash.local.primitives.MarketingMessageDataKt;
import com.squareup.protos.cash.cashface.api.Activity;
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
public final class StackableElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StackableElement> CREATOR;
    public final MarketingMessageDataKt content;

    static {
        StackableElement$Companion$ADAPTER$1 stackableElement$Companion$ADAPTER$1 = new StackableElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StackableElement.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.StackableElement", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_hub.proto");
        ADAPTER = stackableElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stackableElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackableElement(MarketingMessageDataKt marketingMessageDataKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.content = marketingMessageDataKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StackableElement)) {
            return false;
        }
        StackableElement stackableElement = (StackableElement) obj;
        return Intrinsics.areEqual(unknownFields(), stackableElement.unknownFields()) && Intrinsics.areEqual(this.content, stackableElement.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MarketingMessageDataKt marketingMessageDataKt = this.content;
        int hashCode2 = hashCode + (marketingMessageDataKt != null ? marketingMessageDataKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(4);
        builder.activity = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MarketingMessageDataKt marketingMessageDataKt = this.content;
        if (marketingMessageDataKt != null) {
            arrayList.add("content=" + marketingMessageDataKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StackableElement{", "}", 0, null, null, 56);
    }
}
