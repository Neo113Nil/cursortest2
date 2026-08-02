package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.TrustsData;
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
public final class CreditLineSnapshot extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditLineSnapshot> CREATOR;
    public final List credit_lines;

    static {
        CreditLineSnapshot$Companion$ADAPTER$1 creditLineSnapshot$Companion$ADAPTER$1 = new CreditLineSnapshot$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditLineSnapshot.class), "type.googleapis.com/squareup.cash.cashsuggest.api.CreditLineSnapshot", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/CreditLineSnapshot.proto");
        ADAPTER = creditLineSnapshot$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLineSnapshot$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLineSnapshot(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.credit_lines = TransactorKt.immutableCopyOf("credit_lines", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditLineSnapshot)) {
            return false;
        }
        CreditLineSnapshot creditLineSnapshot = (CreditLineSnapshot) obj;
        return Intrinsics.areEqual(unknownFields(), creditLineSnapshot.unknownFields()) && Intrinsics.areEqual(this.credit_lines, creditLineSnapshot.credit_lines);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.credit_lines.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TrustsData.Builder builder = new TrustsData.Builder(15);
        builder.trust = this.credit_lines;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.credit_lines;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("credit_lines=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditLineSnapshot{", "}", 0, null, null, 56);
    }

    public CreditLineSnapshot(List list) {
        this(list, ByteString.EMPTY);
    }
}
