package squareup.cash.overdraft;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import com.squareup.protos.cash.sup.api.v1.AvailableCreditLimit;
import com.squareup.protos.cash.sup.api.v1.RetrievePlanDetailsResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.OverdraftRenderData;
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
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class OverdraftUsage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OverdraftUsage> CREATOR;
    public final Money limit;
    public final Money usage;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money limit;
        public Money usage;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new OverdraftUsage(this.limit, this.usage, buildUnknownFields());
                case 1:
                    return new SetBalanceBasedAddCashPreferenceRequest.Enabled(this.limit, this.usage, buildUnknownFields());
                case 2:
                    return new BalanceBasedAddCashPreference.Enabled(this.limit, this.usage, buildUnknownFields());
                case 3:
                    return new AvailableCreditLimit(this.limit, this.usage, buildUnknownFields());
                case 4:
                    return new RetrievePlanDetailsResponse(this.limit, this.usage, buildUnknownFields());
                case 5:
                    return new OverdraftRenderData(this.limit, this.usage, buildUnknownFields());
                case 6:
                    return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow(this.limit, this.usage, buildUnknownFields());
                default:
                    return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit(this.limit, this.usage, buildUnknownFields());
            }
        }
    }

    static {
        OverdraftUsage$Companion$ADAPTER$1 overdraftUsage$Companion$ADAPTER$1 = new OverdraftUsage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverdraftUsage.class), "type.googleapis.com/squareup.cash.overdraft.OverdraftUsage", Syntax.PROTO_2, null, "squareup/cash/overdraft/OverdraftUsageProto.proto");
        ADAPTER = overdraftUsage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftUsage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftUsage(Money money, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.limit = money;
        this.usage = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverdraftUsage)) {
            return false;
        }
        OverdraftUsage overdraftUsage = (OverdraftUsage) obj;
        return Intrinsics.areEqual(unknownFields(), overdraftUsage.unknownFields()) && Intrinsics.areEqual(this.limit, overdraftUsage.limit) && Intrinsics.areEqual(this.usage, overdraftUsage.usage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.limit;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.usage;
        int hashCode3 = hashCode2 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.limit = this.limit;
        builder.usage = this.usage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.limit;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("limit=", money, arrayList);
        }
        Money money2 = this.usage;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("usage=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OverdraftUsage{", "}", 0, null, null, 56);
    }
}
