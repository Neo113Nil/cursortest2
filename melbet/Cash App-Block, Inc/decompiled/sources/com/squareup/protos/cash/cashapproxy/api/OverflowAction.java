package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashapproxy.api.Button;
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
public final class OverflowAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OverflowAction> CREATOR;
    public final String client_route_url;
    public final Text title;

    static {
        OverflowAction$Companion$ADAPTER$1 overflowAction$Companion$ADAPTER$1 = new OverflowAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverflowAction.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.OverflowAction", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = overflowAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(overflowAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverflowAction(Text text, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = text;
        this.client_route_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverflowAction)) {
            return false;
        }
        OverflowAction overflowAction = (OverflowAction) obj;
        return Intrinsics.areEqual(unknownFields(), overflowAction.unknownFields()) && Intrinsics.areEqual(this.title, overflowAction.title) && Intrinsics.areEqual(this.client_route_url, overflowAction.client_route_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        String str = this.client_route_url;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Button.Builder builder = new Button.Builder(1);
        builder.title = this.title;
        builder.action_url = this.client_route_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        if (this.client_route_url != null) {
            arrayList.add("client_route_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OverflowAction{", "}", 0, null, null, 56);
    }
}
