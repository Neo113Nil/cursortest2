package com.squareup.protos.cash.disputron.core;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.EncryptedCardData;
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
public final class ListClaimDSL3Data extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListClaimDSL3Data> CREATOR;
    public final ByteString ciphertext_;
    public final String counterparty_name;

    static {
        ListClaimDSL3Data$Companion$ADAPTER$1 listClaimDSL3Data$Companion$ADAPTER$1 = new ListClaimDSL3Data$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListClaimDSL3Data.class), "type.googleapis.com/squareup.cash.disputron.core.ListClaimDSL3Data", Syntax.PROTO_3, null, "squareup/cash/disputron/core/ListClaimResolutionStatuses.proto");
        ADAPTER = listClaimDSL3Data$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listClaimDSL3Data$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListClaimDSL3Data(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.counterparty_name = str;
        this.ciphertext_ = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListClaimDSL3Data)) {
            return false;
        }
        ListClaimDSL3Data listClaimDSL3Data = (ListClaimDSL3Data) obj;
        return Intrinsics.areEqual(unknownFields(), listClaimDSL3Data.unknownFields()) && Intrinsics.areEqual(this.counterparty_name, listClaimDSL3Data.counterparty_name) && Intrinsics.areEqual(this.ciphertext_, listClaimDSL3Data.ciphertext_);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.counterparty_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.ciphertext_;
        int hashCode3 = hashCode2 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EncryptedCardData.Builder builder = new EncryptedCardData.Builder(3);
        builder.encrypted_ephemeral_key = this.counterparty_name;
        builder.encrypted_card_info = this.ciphertext_;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.counterparty_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "counterparty_name=", arrayList);
        }
        ByteString byteString = this.ciphertext_;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("ciphertext_=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListClaimDSL3Data{", "}", 0, null, null, 56);
    }
}
