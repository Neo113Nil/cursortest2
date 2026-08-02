package squareup.cash.cryptocurrency;

import android.os.Parcelable;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class AutoBtcWithdrawThresholdSyncValue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AutoBtcWithdrawThresholdSyncValue> CREATOR;
    public final Long keep_in_cash_app_sats;
    public final Long threshold_sats;
    public final WithdrawalSpeed withdrawal_speed;

    static {
        AutoBtcWithdrawThresholdSyncValue$Companion$ADAPTER$1 autoBtcWithdrawThresholdSyncValue$Companion$ADAPTER$1 = new AutoBtcWithdrawThresholdSyncValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AutoBtcWithdrawThresholdSyncValue.class), "type.googleapis.com/squareup.cash.cryptocurrency.AutoBtcWithdrawThresholdSyncValue", Syntax.PROTO_2, null, "squareup/cash/cryptocurrency/AutoBtcWithdrawThresholdSyncValue.proto");
        ADAPTER = autoBtcWithdrawThresholdSyncValue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(autoBtcWithdrawThresholdSyncValue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoBtcWithdrawThresholdSyncValue(Long l, Long l2, WithdrawalSpeed withdrawalSpeed, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.threshold_sats = l;
        this.keep_in_cash_app_sats = l2;
        this.withdrawal_speed = withdrawalSpeed;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoBtcWithdrawThresholdSyncValue)) {
            return false;
        }
        AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue = (AutoBtcWithdrawThresholdSyncValue) obj;
        return Intrinsics.areEqual(unknownFields(), autoBtcWithdrawThresholdSyncValue.unknownFields()) && Intrinsics.areEqual(this.threshold_sats, autoBtcWithdrawThresholdSyncValue.threshold_sats) && Intrinsics.areEqual(this.keep_in_cash_app_sats, autoBtcWithdrawThresholdSyncValue.keep_in_cash_app_sats) && this.withdrawal_speed == autoBtcWithdrawThresholdSyncValue.withdrawal_speed;
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
        WithdrawalSpeed withdrawalSpeed = this.withdrawal_speed;
        int hashCode4 = hashCode3 + (withdrawalSpeed != null ? withdrawalSpeed.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(14);
        builder.action = this.threshold_sats;
        builder.full_applet = this.keep_in_cash_app_sats;
        builder.half_applet = this.withdrawal_speed;
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
        WithdrawalSpeed withdrawalSpeed = this.withdrawal_speed;
        if (withdrawalSpeed != null) {
            arrayList.add("withdrawal_speed=" + withdrawalSpeed);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AutoBtcWithdrawThresholdSyncValue{", "}", 0, null, null, 56);
    }
}
