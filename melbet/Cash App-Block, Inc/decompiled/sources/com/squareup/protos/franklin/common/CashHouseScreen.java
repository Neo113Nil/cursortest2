package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class CashHouseScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashHouseScreen> CREATOR;
    public final String screen_json;

    static {
        CashHouseScreen$Companion$ADAPTER$1 cashHouseScreen$Companion$ADAPTER$1 = new CashHouseScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashHouseScreen.class), "type.googleapis.com/squareup.franklin.CashHouseScreen", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = cashHouseScreen$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashHouseScreen$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashHouseScreen(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.screen_json = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashHouseScreen)) {
            return false;
        }
        CashHouseScreen cashHouseScreen = (CashHouseScreen) obj;
        return Intrinsics.areEqual(unknownFields(), cashHouseScreen.unknownFields()) && Intrinsics.areEqual(this.screen_json, cashHouseScreen.screen_json);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.screen_json;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(17);
        builder.client_route = this.screen_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.screen_json;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "screen_json=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashHouseScreen{", "}", 0, null, null, 56);
    }
}
