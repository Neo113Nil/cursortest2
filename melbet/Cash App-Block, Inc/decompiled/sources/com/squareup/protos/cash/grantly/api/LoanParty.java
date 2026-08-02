package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.FullName;
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
public final class LoanParty extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoanParty> CREATOR;
    public final String address;
    public final String name;

    static {
        LoanParty$Companion$ADAPTER$1 loanParty$Companion$ADAPTER$1 = new LoanParty$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanParty.class), "type.googleapis.com/squareup.cash.grantly.api.LoanParty", Syntax.PROTO_2, null, "squareup/cash/grantly/api/preauthorize_payment_response.proto");
        ADAPTER = loanParty$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loanParty$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanParty(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.address = str;
        this.name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoanParty)) {
            return false;
        }
        LoanParty loanParty = (LoanParty) obj;
        return Intrinsics.areEqual(unknownFields(), loanParty.unknownFields()) && Intrinsics.areEqual(this.address, loanParty.address) && Intrinsics.areEqual(this.name, loanParty.name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.address;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(6);
        builder.given_name = this.address;
        builder.family_name = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.address != null) {
            arrayList.add("address=██");
        }
        if (this.name != null) {
            arrayList.add("name=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoanParty{", "}", 0, null, null, 56);
    }
}
