package com.squareup.protos.checkmate.sync;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
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
public final class UiCheckDeposit extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiCheckDeposit> CREATOR;
    public final String check_deposit_token;
    public final String render_json;
    public final String state_reason;
    public final String transaction_token;

    static {
        UiCheckDeposit$Companion$ADAPTER$1 uiCheckDeposit$Companion$ADAPTER$1 = new UiCheckDeposit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiCheckDeposit.class), "type.googleapis.com/squareup.checkmate.sync.UiCheckDeposit", Syntax.PROTO_2, null, "squareup/checkmate/sync/ui_check_deposit.proto");
        ADAPTER = uiCheckDeposit$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiCheckDeposit$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiCheckDeposit(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.transaction_token = str;
        this.state_reason = str2;
        this.check_deposit_token = str3;
        this.render_json = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiCheckDeposit)) {
            return false;
        }
        UiCheckDeposit uiCheckDeposit = (UiCheckDeposit) obj;
        return Intrinsics.areEqual(unknownFields(), uiCheckDeposit.unknownFields()) && Intrinsics.areEqual(this.transaction_token, uiCheckDeposit.transaction_token) && Intrinsics.areEqual(this.state_reason, uiCheckDeposit.state_reason) && Intrinsics.areEqual(this.check_deposit_token, uiCheckDeposit.check_deposit_token) && Intrinsics.areEqual(this.render_json, uiCheckDeposit.render_json);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.transaction_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.state_reason;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.check_deposit_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.render_json;
        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolOwner.Builder builder = new PoolOwner.Builder(16);
        builder.customer_token = this.transaction_token;
        builder.full_name = this.state_reason;
        builder.profile_photo_url = this.check_deposit_token;
        builder.cashtag = this.render_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.transaction_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "transaction_token=", arrayList);
        }
        String str2 = this.state_reason;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "state_reason=", arrayList);
        }
        String str3 = this.check_deposit_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "check_deposit_token=", arrayList);
        }
        String str4 = this.render_json;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "render_json=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiCheckDeposit{", "}", 0, null, null, 56);
    }
}
