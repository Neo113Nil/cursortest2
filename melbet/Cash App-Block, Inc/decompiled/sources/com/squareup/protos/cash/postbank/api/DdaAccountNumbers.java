package com.squareup.protos.cash.postbank.api;

import android.os.Parcelable;
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
public final class DdaAccountNumbers extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DdaAccountNumbers> CREATOR;
    public final String account_number;
    public final String routing_number;

    static {
        DdaAccountNumbers$Companion$ADAPTER$1 ddaAccountNumbers$Companion$ADAPTER$1 = new DdaAccountNumbers$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DdaAccountNumbers.class), "type.googleapis.com/squareup.cash.postbank.api.DdaAccountNumbers", Syntax.PROTO_2, null, "squareup/cash/postbank/api/GetCustomerPrimaryDdaDetails.proto");
        ADAPTER = ddaAccountNumbers$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(ddaAccountNumbers$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DdaAccountNumbers(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.account_number = str;
        this.routing_number = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DdaAccountNumbers)) {
            return false;
        }
        DdaAccountNumbers ddaAccountNumbers = (DdaAccountNumbers) obj;
        return Intrinsics.areEqual(unknownFields(), ddaAccountNumbers.unknownFields()) && Intrinsics.areEqual(this.account_number, ddaAccountNumbers.account_number) && Intrinsics.areEqual(this.routing_number, ddaAccountNumbers.routing_number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.account_number;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.routing_number;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(8);
        builder.name = this.account_number;
        builder.value = this.routing_number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.account_number != null) {
            arrayList.add("account_number=██");
        }
        if (this.routing_number != null) {
            arrayList.add("routing_number=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DdaAccountNumbers{", "}", 0, null, null, 56);
    }
}
