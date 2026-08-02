package squareup.cash.portfolios.syncvalues;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.btcnetwork.external.PaymentMethods;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PortfolioState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PortfolioState> CREATOR;
    public final Boolean has_holdings;
    public final boolean has_portfolio;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Boolean has_holdings;
        public Boolean has_portfolio;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    Boolean bool = this.has_portfolio;
                    if (bool != null) {
                        return new PortfolioState(bool.booleanValue(), this.has_holdings, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(bool, "has_portfolio");
                    throw null;
                case 1:
                    return new PaymentMethods(this.has_portfolio, this.has_holdings, buildUnknownFields());
                case 2:
                    return new GetSearchPrivacySettingsResponse.BooleanSetting(this.has_portfolio, this.has_holdings, buildUnknownFields());
                default:
                    return new ChatMessage.SystemMessageBody.Styling(this.has_portfolio, this.has_holdings, buildUnknownFields());
            }
        }
    }

    static {
        PortfolioState$Companion$ADAPTER$1 portfolioState$Companion$ADAPTER$1 = new PortfolioState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PortfolioState.class), "type.googleapis.com/squareup.cash.portfolios.syncvalues.PortfolioState", Syntax.PROTO_2, null, "squareup/cash/portfolios/syncvalues/types.proto");
        ADAPTER = portfolioState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(portfolioState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioState(boolean z, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.has_portfolio = z;
        this.has_holdings = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PortfolioState)) {
            return false;
        }
        PortfolioState portfolioState = (PortfolioState) obj;
        return Intrinsics.areEqual(unknownFields(), portfolioState.unknownFields()) && this.has_portfolio == portfolioState.has_portfolio && Intrinsics.areEqual(this.has_holdings, portfolioState.has_holdings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.has_portfolio);
        Boolean bool = this.has_holdings;
        int hashCode = m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.has_portfolio = Boolean.valueOf(this.has_portfolio);
        builder.has_holdings = this.has_holdings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("has_portfolio=" + this.has_portfolio);
        Boolean bool = this.has_holdings;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_holdings=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioState{", "}", 0, null, null, 56);
    }
}
