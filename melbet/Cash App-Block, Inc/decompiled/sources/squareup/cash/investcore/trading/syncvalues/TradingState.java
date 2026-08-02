package squareup.cash.investcore.trading.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class TradingState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TradingState> CREATOR;
    public final Instant brokerage_account_transfer_estimated_completion;
    public final DividendSetting dividend_setting;
    public final boolean has_active_brokerage_account;

    public enum DividendSetting implements WireEnum {
        UNDEFINED(0),
        SAVE(1),
        REINVEST(2);

        public static final TradingState$DividendSetting$Companion$ADAPTER$1 ADAPTER;
        public static final KClasses$$Lambda$1 Companion;
        public final int value;

        static {
            DividendSetting dividendSetting = UNDEFINED;
            Companion = new KClasses$$Lambda$1(25);
            ADAPTER = new TradingState$DividendSetting$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DividendSetting.class), Syntax.PROTO_2, dividendSetting);
        }

        DividendSetting(int i) {
            this.value = i;
        }

        public static final DividendSetting fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNDEFINED;
            }
            if (i == 1) {
                return SAVE;
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
        KClasses$$Lambda$1 kClasses$$Lambda$1 = DividendSetting.Companion;
        TradingState$Companion$ADAPTER$1 tradingState$Companion$ADAPTER$1 = new TradingState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TradingState.class), "type.googleapis.com/squareup.cash.investcore.trading.syncvalues.TradingState", Syntax.PROTO_2, null, "squareup/cash/investcore/trading/syncvalues/types.proto");
        ADAPTER = tradingState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tradingState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingState(boolean z, DividendSetting dividendSetting, Instant instant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.has_active_brokerage_account = z;
        this.dividend_setting = dividendSetting;
        this.brokerage_account_transfer_estimated_completion = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TradingState)) {
            return false;
        }
        TradingState tradingState = (TradingState) obj;
        return Intrinsics.areEqual(unknownFields(), tradingState.unknownFields()) && this.has_active_brokerage_account == tradingState.has_active_brokerage_account && this.dividend_setting == tradingState.dividend_setting && Intrinsics.areEqual(this.brokerage_account_transfer_estimated_completion, tradingState.brokerage_account_transfer_estimated_completion);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.has_active_brokerage_account);
        DividendSetting dividendSetting = this.dividend_setting;
        int hashCode = (m + (dividendSetting != null ? dividendSetting.hashCode() : 0)) * 37;
        Instant instant = this.brokerage_account_transfer_estimated_completion;
        int hashCode2 = hashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(17);
        builder.action = Boolean.valueOf(this.has_active_brokerage_account);
        builder.full_applet = this.dividend_setting;
        builder.half_applet = this.brokerage_account_transfer_estimated_completion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("has_active_brokerage_account=" + this.has_active_brokerage_account);
        DividendSetting dividendSetting = this.dividend_setting;
        if (dividendSetting != null) {
            arrayList.add("dividend_setting=" + dividendSetting);
        }
        Instant instant = this.brokerage_account_transfer_estimated_completion;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("brokerage_account_transfer_estimated_completion=", instant, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TradingState{", "}", 0, null, null, 56);
    }
}
