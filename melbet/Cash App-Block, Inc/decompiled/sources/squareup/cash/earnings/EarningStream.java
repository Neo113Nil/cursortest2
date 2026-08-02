package squareup.cash.earnings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
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
public final class EarningStream extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningStream> CREATOR;
    public final UiAvatar avatar;
    public final String client_route;
    public final String display_name;
    public final EarningsTimeFrame earliest_period;
    public final Money earnings;
    public final EarningStreamIdentifier identifier;

    static {
        EarningStream$Companion$ADAPTER$1 earningStream$Companion$ADAPTER$1 = new EarningStream$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningStream.class), "type.googleapis.com/squareup.cash.earnings.EarningStream", Syntax.PROTO_2, null, "squareup/cash/earnings/earnings_common.proto");
        ADAPTER = earningStream$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningStream$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningStream(EarningStreamIdentifier earningStreamIdentifier, String str, UiAvatar uiAvatar, Money money, String str2, EarningsTimeFrame earningsTimeFrame, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.identifier = earningStreamIdentifier;
        this.display_name = str;
        this.avatar = uiAvatar;
        this.earnings = money;
        this.client_route = str2;
        this.earliest_period = earningsTimeFrame;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningStream)) {
            return false;
        }
        EarningStream earningStream = (EarningStream) obj;
        return Intrinsics.areEqual(unknownFields(), earningStream.unknownFields()) && Intrinsics.areEqual(this.identifier, earningStream.identifier) && Intrinsics.areEqual(this.display_name, earningStream.display_name) && Intrinsics.areEqual(this.avatar, earningStream.avatar) && Intrinsics.areEqual(this.earnings, earningStream.earnings) && Intrinsics.areEqual(this.client_route, earningStream.client_route) && Intrinsics.areEqual(this.earliest_period, earningStream.earliest_period);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarningStreamIdentifier earningStreamIdentifier = this.identifier;
        int hashCode2 = (hashCode + (earningStreamIdentifier != null ? earningStreamIdentifier.hashCode() : 0)) * 37;
        String str = this.display_name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        UiAvatar uiAvatar = this.avatar;
        int hashCode4 = (hashCode3 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        Money money = this.earnings;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.client_route;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        EarningsTimeFrame earningsTimeFrame = this.earliest_period;
        int hashCode7 = hashCode6 + (earningsTimeFrame != null ? earningsTimeFrame.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(3);
        builder.navigate = this.identifier;
        builder.set_view_state_value = this.display_name;
        builder.open_url = this.avatar;
        builder.compound_action = this.earnings;
        builder.submit = this.client_route;
        builder.collection_mutation = this.earliest_period;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarningStreamIdentifier earningStreamIdentifier = this.identifier;
        if (earningStreamIdentifier != null) {
            arrayList.add("identifier=" + earningStreamIdentifier);
        }
        String str = this.display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
        }
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        Money money = this.earnings;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("earnings=", money, arrayList);
        }
        String str2 = this.client_route;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_route=", arrayList);
        }
        EarningsTimeFrame earningsTimeFrame = this.earliest_period;
        if (earningsTimeFrame != null) {
            arrayList.add("earliest_period=" + earningsTimeFrame);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningStream{", "}", 0, null, null, 56);
    }
}
