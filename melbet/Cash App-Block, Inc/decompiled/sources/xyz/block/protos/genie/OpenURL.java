package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.wire.roster.mds.EmailContactMethod;
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
import squareup.cash.bills.BillsApplet;
import squareup.cash.bills.BillsConfig;
import squareup.cash.earnings.EarningStreamIdentifier;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.wires.WiresAccountInfo;
import squareup.playpen_bff.v1.Service;
import xyz.block.protos.genie.CreateSessionResponse;
import xyz.block.protos.genie.ViewStateValueMapping;

/* loaded from: classes10.dex */
public final class OpenURL extends Message {
    public static final ProtoAdapter ADAPTER = new OpenURL$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenURL.class), "type.googleapis.com/xyz.block.genie.v1.OpenURL", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
    public final String url;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String url;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    String str = this.url;
                    if (str != null) {
                        return new OpenURL(str, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "url");
                    throw null;
                case 1:
                    return new EmailContactMethod(this.url, buildUnknownFields());
                case 2:
                    return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport(this.url, buildUnknownFields());
                case 3:
                    return new BillsApplet.BillsAppletAction.ClientRoute(this.url, buildUnknownFields());
                case 4:
                    return new BillsConfig.ClientRoute(this.url, buildUnknownFields());
                case 5:
                    return new EarningStreamIdentifier(this.url, buildUnknownFields());
                case 6:
                    return new OverdraftStatus.Action.ActivateOverdraftAction(this.url, buildUnknownFields());
                case 7:
                    return new WiresAccountInfo.Action(this.url, buildUnknownFields());
                case 8:
                    return new Service(this.url, buildUnknownFields());
                case 9:
                    return new CreateSessionResponse.Success(this.url, buildUnknownFields());
                case 10:
                    return new DebugInfo(this.url, buildUnknownFields());
                default:
                    String str2 = this.url;
                    if (str2 != null) {
                        return new ViewStateValueMapping.ViewOutputs(str2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str2, "view_slug");
                    throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenURL(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenURL)) {
            return false;
        }
        OpenURL openURL = (OpenURL) obj;
        return Intrinsics.areEqual(unknownFields(), openURL.unknownFields()) && Intrinsics.areEqual(this.url, openURL.url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.url.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.url = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.url, "url=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenURL{", "}", 0, null, null, 56);
    }
}
