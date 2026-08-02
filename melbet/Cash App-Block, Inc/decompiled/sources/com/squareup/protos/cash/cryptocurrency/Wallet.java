package com.squareup.protos.cash.cryptocurrency;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Banner;
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
public final class Wallet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Wallet> CREATOR;
    public final String address;

    static {
        Wallet$Companion$ADAPTER$1 wallet$Companion$ADAPTER$1 = new Wallet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Wallet.class), "type.googleapis.com/squareup.cash.cryptocurrency.Wallet", Syntax.PROTO_2, null, "squareup/cash/cryptocurrency/Wallet.proto");
        ADAPTER = wallet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(wallet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wallet(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.address = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Wallet)) {
            return false;
        }
        Wallet wallet = (Wallet) obj;
        return Intrinsics.areEqual(unknownFields(), wallet.unknownFields()) && Intrinsics.areEqual(this.address, wallet.address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.address;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(22);
        builder.banner_color = this.address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.address;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "address=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Wallet{", "}", 0, null, null, 56);
    }
}
