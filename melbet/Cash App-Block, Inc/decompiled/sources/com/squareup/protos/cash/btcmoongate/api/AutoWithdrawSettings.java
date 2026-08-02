package com.squareup.protos.cash.btcmoongate.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
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
public final class AutoWithdrawSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AutoWithdrawSettings> CREATOR;
    public final Boolean enabled;
    public final Long keep_in_cash_app_sats;
    public final Long threshold_sats;
    public final String wallet_address;
    public final WithdrawalSpeed withdrawal_speed;

    static {
        AutoWithdrawSettings$Companion$ADAPTER$1 autoWithdrawSettings$Companion$ADAPTER$1 = new AutoWithdrawSettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AutoWithdrawSettings.class), "type.googleapis.com/squareup.cash.btcmoongate.api.AutoWithdrawSettings", Syntax.PROTO_2, null, "squareup/cash/btcmoongate/api/auto_withdraw.proto");
        ADAPTER = autoWithdrawSettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(autoWithdrawSettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoWithdrawSettings(Long l, Long l2, String str, Boolean bool, WithdrawalSpeed withdrawalSpeed, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.threshold_sats = l;
        this.keep_in_cash_app_sats = l2;
        this.wallet_address = str;
        this.enabled = bool;
        this.withdrawal_speed = withdrawalSpeed;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoWithdrawSettings)) {
            return false;
        }
        AutoWithdrawSettings autoWithdrawSettings = (AutoWithdrawSettings) obj;
        return Intrinsics.areEqual(unknownFields(), autoWithdrawSettings.unknownFields()) && Intrinsics.areEqual(this.threshold_sats, autoWithdrawSettings.threshold_sats) && Intrinsics.areEqual(this.keep_in_cash_app_sats, autoWithdrawSettings.keep_in_cash_app_sats) && Intrinsics.areEqual(this.wallet_address, autoWithdrawSettings.wallet_address) && Intrinsics.areEqual(this.enabled, autoWithdrawSettings.enabled) && this.withdrawal_speed == autoWithdrawSettings.withdrawal_speed;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.threshold_sats;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.keep_in_cash_app_sats;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str = this.wallet_address;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        WithdrawalSpeed withdrawalSpeed = this.withdrawal_speed;
        int hashCode6 = hashCode5 + (withdrawalSpeed != null ? withdrawalSpeed.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(20);
        builder.for_each = this.threshold_sats;
        builder.moneybot_scaffold = this.keep_in_cash_app_sats;
        builder.compose_platform = this.wallet_address;
        builder.is_included = this.enabled;
        builder.motion = this.withdrawal_speed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.threshold_sats;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("threshold_sats=", l, arrayList);
        }
        Long l2 = this.keep_in_cash_app_sats;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("keep_in_cash_app_sats=", l2, arrayList);
        }
        if (this.wallet_address != null) {
            arrayList.add("wallet_address=██");
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        WithdrawalSpeed withdrawalSpeed = this.withdrawal_speed;
        if (withdrawalSpeed != null) {
            arrayList.add("withdrawal_speed=" + withdrawalSpeed);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AutoWithdrawSettings{", "}", 0, null, null, 56);
    }
}
