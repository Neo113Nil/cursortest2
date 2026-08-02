package squareup.cash.earnings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
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
import squareup.cash.bankingbenefits.ui.GreenBookletV1;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.savings.GeneralFolder;

/* loaded from: classes10.dex */
public final class ActionButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActionButton> CREATOR;
    public final String client_route;
    public final LocalizedString title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String client_route;
        public LocalizedString title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ActionButton(this.title, this.client_route, buildUnknownFields());
                case 1:
                    return new PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction(this.title, this.client_route, buildUnknownFields());
                case 2:
                    return new ToggleEntryPointData.CardTabCta.Button(this.title, this.client_route, buildUnknownFields());
                case 3:
                    return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button(this.title, this.client_route, buildUnknownFields());
                case 4:
                    return new BorrowAppletLinksTile.Data.Button(this.title, this.client_route, buildUnknownFields());
                case 5:
                    return new GreenBookletV1.BookletFooterButton(this.title, this.client_route, buildUnknownFields());
                case 6:
                    return new OverdraftStatus.Button(this.title, this.client_route, buildUnknownFields());
                default:
                    return new GeneralFolder(this.title, this.client_route, buildUnknownFields());
            }
        }
    }

    static {
        ActionButton$Companion$ADAPTER$1 actionButton$Companion$ADAPTER$1 = new ActionButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActionButton.class), "type.googleapis.com/squareup.cash.earnings.ActionButton", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = actionButton$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(actionButton$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButton(LocalizedString localizedString, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.client_route = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return Intrinsics.areEqual(unknownFields(), actionButton.unknownFields()) && Intrinsics.areEqual(this.title, actionButton.title) && Intrinsics.areEqual(this.client_route, actionButton.client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        String str = this.client_route;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.client_route = this.client_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionButton{", "}", 0, null, null, 56);
    }
}
