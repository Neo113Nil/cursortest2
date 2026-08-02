package squareup.cash.bankingbenefits.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
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
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class SpendPathProgress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SpendPathProgress> CREATOR;
    public final Money current_aggregated_amount;
    public final Double percent_complete;
    public final Long period_end_at;
    public final Long period_start_at;
    public final Money remaining_amount;
    public final Money threshold_amount;

    static {
        SpendPathProgress$Companion$ADAPTER$1 spendPathProgress$Companion$ADAPTER$1 = new SpendPathProgress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SpendPathProgress.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.SpendPathProgress", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/CashGreen.proto");
        ADAPTER = spendPathProgress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(spendPathProgress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpendPathProgress(Long l, Long l2, Money money, Money money2, Money money3, Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.period_start_at = l;
        this.period_end_at = l2;
        this.current_aggregated_amount = money;
        this.threshold_amount = money2;
        this.remaining_amount = money3;
        this.percent_complete = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpendPathProgress)) {
            return false;
        }
        SpendPathProgress spendPathProgress = (SpendPathProgress) obj;
        return Intrinsics.areEqual(unknownFields(), spendPathProgress.unknownFields()) && Intrinsics.areEqual(this.period_start_at, spendPathProgress.period_start_at) && Intrinsics.areEqual(this.period_end_at, spendPathProgress.period_end_at) && Intrinsics.areEqual(this.current_aggregated_amount, spendPathProgress.current_aggregated_amount) && Intrinsics.areEqual(this.threshold_amount, spendPathProgress.threshold_amount) && Intrinsics.areEqual(this.remaining_amount, spendPathProgress.remaining_amount) && Intrinsics.areEqual(this.percent_complete, spendPathProgress.percent_complete);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.period_start_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.period_end_at;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Money money = this.current_aggregated_amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.threshold_amount;
        int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.remaining_amount;
        int hashCode6 = (hashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Double d = this.percent_complete;
        int hashCode7 = hashCode6 + (d != null ? Double.hashCode(d.doubleValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(1);
        builder.navigate = this.period_start_at;
        builder.set_view_state_value = this.period_end_at;
        builder.open_url = this.current_aggregated_amount;
        builder.compound_action = this.threshold_amount;
        builder.submit = this.remaining_amount;
        builder.collection_mutation = this.percent_complete;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.period_start_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("period_start_at=", l, arrayList);
        }
        Long l2 = this.period_end_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("period_end_at=", l2, arrayList);
        }
        Money money = this.current_aggregated_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("current_aggregated_amount=", money, arrayList);
        }
        Money money2 = this.threshold_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("threshold_amount=", money2, arrayList);
        }
        Money money3 = this.remaining_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("remaining_amount=", money3, arrayList);
        }
        Double d = this.percent_complete;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("percent_complete=", d, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SpendPathProgress{", "}", 0, null, null, 56);
    }
}
