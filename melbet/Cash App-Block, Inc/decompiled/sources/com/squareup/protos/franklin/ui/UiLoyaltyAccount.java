package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.access.sync_values.Credential;
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
public final class UiLoyaltyAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiLoyaltyAccount> CREATOR;
    public final String account_status_url;
    public final String id;
    public final Long last_time_visited;
    public final String loyalty_program_id;
    public final String phone_number;
    public final Long points_earned;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String account_status_url;
        public String id;
        public Long last_time_visited;
        public String loyalty_program_id;
        public String phone_number;
        public Long points_earned;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiLoyaltyAccount(this.id, this.phone_number, this.points_earned, this.last_time_visited, this.account_status_url, this.loyalty_program_id, buildUnknownFields());
                default:
                    return new Credential(this.id, this.phone_number, this.points_earned, this.last_time_visited, this.account_status_url, this.loyalty_program_id, buildUnknownFields());
            }
        }
    }

    static {
        UiLoyaltyAccount$Companion$ADAPTER$1 uiLoyaltyAccount$Companion$ADAPTER$1 = new UiLoyaltyAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiLoyaltyAccount.class), "type.googleapis.com/squareup.franklin.ui.UiLoyaltyAccount", Syntax.PROTO_2, null, "squareup/franklin/ui/loyalty_account.proto");
        ADAPTER = uiLoyaltyAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiLoyaltyAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiLoyaltyAccount(String str, String str2, Long l, Long l2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.phone_number = str2;
        this.points_earned = l;
        this.last_time_visited = l2;
        this.account_status_url = str3;
        this.loyalty_program_id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiLoyaltyAccount)) {
            return false;
        }
        UiLoyaltyAccount uiLoyaltyAccount = (UiLoyaltyAccount) obj;
        return Intrinsics.areEqual(unknownFields(), uiLoyaltyAccount.unknownFields()) && Intrinsics.areEqual(this.id, uiLoyaltyAccount.id) && Intrinsics.areEqual(this.phone_number, uiLoyaltyAccount.phone_number) && Intrinsics.areEqual(this.points_earned, uiLoyaltyAccount.points_earned) && Intrinsics.areEqual(this.last_time_visited, uiLoyaltyAccount.last_time_visited) && Intrinsics.areEqual(this.account_status_url, uiLoyaltyAccount.account_status_url) && Intrinsics.areEqual(this.loyalty_program_id, uiLoyaltyAccount.loyalty_program_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.phone_number;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.points_earned;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.last_time_visited;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str3 = this.account_status_url;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.loyalty_program_id;
        int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.id = this.id;
        builder.phone_number = this.phone_number;
        builder.points_earned = this.points_earned;
        builder.last_time_visited = this.last_time_visited;
        builder.account_status_url = this.account_status_url;
        builder.loyalty_program_id = this.loyalty_program_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        if (this.phone_number != null) {
            arrayList.add("phone_number=██");
        }
        Long l = this.points_earned;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("points_earned=", l, arrayList);
        }
        Long l2 = this.last_time_visited;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_time_visited=", l2, arrayList);
        }
        String str2 = this.account_status_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_status_url=", arrayList);
        }
        String str3 = this.loyalty_program_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "loyalty_program_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiLoyaltyAccount{", "}", 0, null, null, 56);
    }
}
