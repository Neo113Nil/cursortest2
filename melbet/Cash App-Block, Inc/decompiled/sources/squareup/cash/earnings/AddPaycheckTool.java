package squareup.cash.earnings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
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
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class AddPaycheckTool extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddPaycheckTool> CREATOR;
    public final String client_route;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String client_route;
        public LocalizedString subtitle;
        public LocalizedString title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AddPaycheckTool(this.title, this.subtitle, this.client_route, buildUnknownFields());
                case 1:
                    return new PrepurchaseCashCardAppletData.PaymentPlansData.Option(this.title, this.subtitle, this.client_route, buildUnknownFields());
                case 2:
                    return new EarnerOnboardingTool(this.title, this.subtitle, this.client_route, buildUnknownFields());
                case 3:
                    return new ManageCustomersTool(this.title, this.subtitle, this.client_route, buildUnknownFields());
                default:
                    return new PaychecksHomeUi.ActiveDistributionSection(this.title, this.subtitle, this.client_route, buildUnknownFields());
            }
        }
    }

    static {
        AddPaycheckTool$Companion$ADAPTER$1 addPaycheckTool$Companion$ADAPTER$1 = new AddPaycheckTool$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddPaycheckTool.class), "type.googleapis.com/squareup.cash.earnings.AddPaycheckTool", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = addPaycheckTool$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addPaycheckTool$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaycheckTool(LocalizedString localizedString, LocalizedString localizedString2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.client_route = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddPaycheckTool)) {
            return false;
        }
        AddPaycheckTool addPaycheckTool = (AddPaycheckTool) obj;
        return Intrinsics.areEqual(unknownFields(), addPaycheckTool.unknownFields()) && Intrinsics.areEqual(this.title, addPaycheckTool.title) && Intrinsics.areEqual(this.subtitle, addPaycheckTool.subtitle) && Intrinsics.areEqual(this.client_route, addPaycheckTool.client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        String str = this.client_route;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.subtitle = this.subtitle;
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
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddPaycheckTool{", "}", 0, null, null, 56);
    }
}
