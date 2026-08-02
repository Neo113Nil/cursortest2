package com.squareup.protos.cash.fx.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.common.CurrencyCode;
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
public final class CurrencyInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CurrencyInfo> CREATOR;
    public final CurrencyCode code;
    public final String display_name;

    static {
        CurrencyInfo$Companion$ADAPTER$1 currencyInfo$Companion$ADAPTER$1 = new CurrencyInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CurrencyInfo.class), "type.googleapis.com/squareup.cash.fx.app.CurrencyInfo", Syntax.PROTO_2, null, "squareup/cash/fx/app.proto");
        ADAPTER = currencyInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(currencyInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyInfo(CurrencyCode currencyCode, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.code = currencyCode;
        this.display_name = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CurrencyInfo)) {
            return false;
        }
        CurrencyInfo currencyInfo = (CurrencyInfo) obj;
        return Intrinsics.areEqual(unknownFields(), currencyInfo.unknownFields()) && this.code == currencyInfo.code && Intrinsics.areEqual(this.display_name, currencyInfo.display_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CurrencyCode currencyCode = this.code;
        int hashCode2 = (hashCode + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        String str = this.display_name;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(14);
        builder.f1268type = this.code;
        builder.details = this.display_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CurrencyCode currencyCode = this.code;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("code=", currencyCode, arrayList);
        }
        String str = this.display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyInfo{", "}", 0, null, null, 56);
    }
}
