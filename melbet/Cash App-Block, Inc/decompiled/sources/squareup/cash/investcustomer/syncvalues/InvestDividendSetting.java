package squareup.cash.investcustomer.syncvalues;

import android.os.Parcelable;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;

/* loaded from: classes10.dex */
public final class InvestDividendSetting extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestDividendSetting> CREATOR;
    public final DividendSetting dividend_setting;

    /* loaded from: classes3.dex */
    public enum DividendSetting implements WireEnum {
        PAYOUT(1),
        REINVEST(2);

        public final int value;
        public static final UiAlias.Type.Companion Companion = new UiAlias.Type.Companion();
        public static final InvestDividendSetting$DividendSetting$Companion$ADAPTER$1 ADAPTER = new InvestDividendSetting$DividendSetting$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DividendSetting.class), Syntax.PROTO_2, null);

        DividendSetting(int i) {
            this.value = i;
        }

        public static final DividendSetting fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PAYOUT;
            }
            if (i != 2) {
                return null;
            }
            return REINVEST;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InvestDividendSetting$Companion$ADAPTER$1 investDividendSetting$Companion$ADAPTER$1 = new InvestDividendSetting$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestDividendSetting.class), "type.googleapis.com/squareup.cash.investcustomer.syncvalues.InvestDividendSetting", Syntax.PROTO_2, null, "squareup/cash/investcustomer/syncvalues/types.proto");
        ADAPTER = investDividendSetting$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investDividendSetting$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestDividendSetting(DividendSetting dividendSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        dividendSetting.getClass();
        byteString.getClass();
        this.dividend_setting = dividendSetting;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestDividendSetting)) {
            return false;
        }
        InvestDividendSetting investDividendSetting = (InvestDividendSetting) obj;
        return Intrinsics.areEqual(unknownFields(), investDividendSetting.unknownFields()) && this.dividend_setting == investDividendSetting.dividend_setting;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.dividend_setting.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(18);
        builder.tool = this.dividend_setting;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dividend_setting=" + this.dividend_setting);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestDividendSetting{", "}", 0, null, null, 56);
    }
}
