package squareup.cash.earnings;

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
import squareup.cash.earnings.EarningTool;
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class EarningsHomeUIState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsHomeUIState> CREATOR;
    public final EarningsChartData current_month_chart;
    public final EarningStreamsData current_month_earnings;
    public final EarningsTimeFrame earliest_period;
    public final EarningsHomeConfiguration earnings_home_configuration;
    public final Boolean should_show_chart;

    public final class EarningsHomeConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EarningsHomeConfiguration> CREATOR;
        public final EarningsHomeUi earnings_home_ui;

        static {
            EarningsHomeUIState$EarningsHomeConfiguration$Companion$ADAPTER$1 earningsHomeUIState$EarningsHomeConfiguration$Companion$ADAPTER$1 = new EarningsHomeUIState$EarningsHomeConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsHomeConfiguration.class), "type.googleapis.com/squareup.cash.earnings.EarningsHomeUIState.EarningsHomeConfiguration", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUIState.proto");
            ADAPTER = earningsHomeUIState$EarningsHomeConfiguration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsHomeUIState$EarningsHomeConfiguration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarningsHomeConfiguration(EarningsHomeUi earningsHomeUi, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.earnings_home_ui = earningsHomeUi;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EarningsHomeConfiguration)) {
                return false;
            }
            EarningsHomeConfiguration earningsHomeConfiguration = (EarningsHomeConfiguration) obj;
            return Intrinsics.areEqual(unknownFields(), earningsHomeConfiguration.unknownFields()) && Intrinsics.areEqual(this.earnings_home_ui, earningsHomeConfiguration.earnings_home_ui);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            EarningsHomeUi earningsHomeUi = this.earnings_home_ui;
            int hashCode2 = hashCode + (earningsHomeUi != null ? earningsHomeUi.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(15);
            builder.tool = this.earnings_home_ui;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            EarningsHomeUi earningsHomeUi = this.earnings_home_ui;
            if (earningsHomeUi != null) {
                arrayList.add("earnings_home_ui=" + earningsHomeUi);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsHomeConfiguration{", "}", 0, null, null, 56);
        }
    }

    static {
        EarningsHomeUIState$Companion$ADAPTER$1 earningsHomeUIState$Companion$ADAPTER$1 = new EarningsHomeUIState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsHomeUIState.class), "type.googleapis.com/squareup.cash.earnings.EarningsHomeUIState", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUIState.proto");
        ADAPTER = earningsHomeUIState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsHomeUIState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsHomeUIState(EarningStreamsData earningStreamsData, EarningsTimeFrame earningsTimeFrame, EarningsHomeConfiguration earningsHomeConfiguration, EarningsChartData earningsChartData, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.current_month_earnings = earningStreamsData;
        this.earliest_period = earningsTimeFrame;
        this.earnings_home_configuration = earningsHomeConfiguration;
        this.current_month_chart = earningsChartData;
        this.should_show_chart = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsHomeUIState)) {
            return false;
        }
        EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) obj;
        return Intrinsics.areEqual(unknownFields(), earningsHomeUIState.unknownFields()) && Intrinsics.areEqual(this.current_month_earnings, earningsHomeUIState.current_month_earnings) && Intrinsics.areEqual(this.earliest_period, earningsHomeUIState.earliest_period) && Intrinsics.areEqual(this.earnings_home_configuration, earningsHomeUIState.earnings_home_configuration) && Intrinsics.areEqual(this.current_month_chart, earningsHomeUIState.current_month_chart) && Intrinsics.areEqual(this.should_show_chart, earningsHomeUIState.should_show_chart);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarningStreamsData earningStreamsData = this.current_month_earnings;
        int hashCode2 = (hashCode + (earningStreamsData != null ? earningStreamsData.hashCode() : 0)) * 37;
        EarningsTimeFrame earningsTimeFrame = this.earliest_period;
        int hashCode3 = (hashCode2 + (earningsTimeFrame != null ? earningsTimeFrame.hashCode() : 0)) * 37;
        EarningsHomeConfiguration earningsHomeConfiguration = this.earnings_home_configuration;
        int hashCode4 = (hashCode3 + (earningsHomeConfiguration != null ? earningsHomeConfiguration.hashCode() : 0)) * 37;
        EarningsChartData earningsChartData = this.current_month_chart;
        int hashCode5 = (hashCode4 + (earningsChartData != null ? earningsChartData.hashCode() : 0)) * 37;
        Boolean bool = this.should_show_chart;
        int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(14);
        builder.key_path = this.current_month_earnings;
        builder.get_transform = this.earliest_period;
        builder.set_transform = this.earnings_home_configuration;
        builder.validation = this.current_month_chart;
        builder.on_invalid = this.should_show_chart;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarningStreamsData earningStreamsData = this.current_month_earnings;
        if (earningStreamsData != null) {
            arrayList.add("current_month_earnings=" + earningStreamsData);
        }
        EarningsTimeFrame earningsTimeFrame = this.earliest_period;
        if (earningsTimeFrame != null) {
            arrayList.add("earliest_period=" + earningsTimeFrame);
        }
        EarningsHomeConfiguration earningsHomeConfiguration = this.earnings_home_configuration;
        if (earningsHomeConfiguration != null) {
            arrayList.add("earnings_home_configuration=" + earningsHomeConfiguration);
        }
        EarningsChartData earningsChartData = this.current_month_chart;
        if (earningsChartData != null) {
            arrayList.add("current_month_chart=" + earningsChartData);
        }
        Boolean bool = this.should_show_chart;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_show_chart=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsHomeUIState{", "}", 0, null, null, 56);
    }
}
