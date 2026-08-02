package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
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
public final class MoneyBar extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MoneyBar> CREATOR;
    public final CreditLineType credit_line;

    static {
        MoneyBar$Companion$ADAPTER$1 moneyBar$Companion$ADAPTER$1 = new MoneyBar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyBar.class), "type.googleapis.com/squareup.cash.cashsuggest.api.MoneyBar", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = moneyBar$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(moneyBar$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyBar(CreditLineType creditLineType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.credit_line = creditLineType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneyBar)) {
            return false;
        }
        MoneyBar moneyBar = (MoneyBar) obj;
        return Intrinsics.areEqual(unknownFields(), moneyBar.unknownFields()) && this.credit_line == moneyBar.credit_line;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CreditLineType creditLineType = this.credit_line;
        int hashCode2 = hashCode + (creditLineType != null ? creditLineType.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(29);
        builder.activity = this.credit_line;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CreditLineType creditLineType = this.credit_line;
        if (creditLineType != null) {
            arrayList.add("credit_line=" + creditLineType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyBar{", "}", 0, null, null, 56);
    }
}
