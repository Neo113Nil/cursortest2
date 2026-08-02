package squareup.cash.earnings;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.DailyData;
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

/* loaded from: classes10.dex */
public final class Earning extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Earning> CREATOR;
    public final Money amount;
    public final Integer day;
    public final Integer month;
    public final Integer year;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money amount;
        public Integer day;
        public Integer month;
        public Integer year;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Earning(this.amount, this.year, this.month, this.day, buildUnknownFields());
                default:
                    return new DailyData(this.amount, this.year, this.month, this.day, buildUnknownFields());
            }
        }
    }

    static {
        Earning$Companion$ADAPTER$1 earning$Companion$ADAPTER$1 = new Earning$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Earning.class), "type.googleapis.com/squareup.cash.earnings.Earning", Syntax.PROTO_2, null, "squareup/cash/earnings/earnings_common.proto");
        ADAPTER = earning$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earning$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Earning(Money money, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.year = num;
        this.month = num2;
        this.day = num3;
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Earning)) {
            return false;
        }
        Earning earning = (Earning) obj;
        return Intrinsics.areEqual(unknownFields(), earning.unknownFields()) && Intrinsics.areEqual(this.year, earning.year) && Intrinsics.areEqual(this.month, earning.month) && Intrinsics.areEqual(this.day, earning.day) && Intrinsics.areEqual(this.amount, earning.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.year;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.month;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.day;
        int hashCode4 = (hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.year = this.year;
        builder.month = this.month;
        builder.day = this.day;
        builder.amount = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.year;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("year=", num, arrayList);
        }
        Integer num2 = this.month;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("month=", num2, arrayList);
        }
        Integer num3 = this.day;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("day=", num3, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Earning{", "}", 0, null, null, 56);
    }
}
