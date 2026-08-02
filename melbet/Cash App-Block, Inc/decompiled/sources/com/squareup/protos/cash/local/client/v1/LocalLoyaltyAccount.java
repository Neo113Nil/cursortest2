package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class LocalLoyaltyAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalLoyaltyAccount> CREATOR;
    public final Integer balance;
    public final String token;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Integer balance;
        public String token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LocalLoyaltyAccount(this.token, this.balance, buildUnknownFields());
                default:
                    return new LocalCashBackOfferPercentage(this.token, this.balance, buildUnknownFields());
            }
        }
    }

    static {
        LocalLoyaltyAccount$Companion$ADAPTER$1 localLoyaltyAccount$Companion$ADAPTER$1 = new LocalLoyaltyAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalLoyaltyAccount.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalLoyaltyAccount", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_loyalty.proto");
        ADAPTER = localLoyaltyAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localLoyaltyAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalLoyaltyAccount(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.balance = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalLoyaltyAccount)) {
            return false;
        }
        LocalLoyaltyAccount localLoyaltyAccount = (LocalLoyaltyAccount) obj;
        return Intrinsics.areEqual(unknownFields(), localLoyaltyAccount.unknownFields()) && Intrinsics.areEqual(this.token, localLoyaltyAccount.token) && Intrinsics.areEqual(this.balance, localLoyaltyAccount.balance);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.balance;
        int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.balance = this.balance;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Integer num = this.balance;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("balance=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalLoyaltyAccount{", "}", 0, null, null, 56);
    }
}
