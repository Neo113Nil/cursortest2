package squareup.cash.earnings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
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
public final class ActivitySection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySection> CREATOR;
    public final LocalizedString load_failure_subtitle;
    public final LocalizedString no_activity_subtitle;
    public final LocalizedString title;
    public final LocalizedString view_all_button_title;
    public final String view_all_client_route;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public LocalizedString load_failure_subtitle;
        public LocalizedString no_activity_subtitle;
        public LocalizedString title;
        public LocalizedString view_all_button_title;
        public String view_all_client_route;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ActivitySection(this.title, this.no_activity_subtitle, this.load_failure_subtitle, this.view_all_button_title, this.view_all_client_route, buildUnknownFields());
                case 1:
                    return new BalanceBasedAddCashPreference.DialogBox(this.title, this.no_activity_subtitle, this.load_failure_subtitle, this.view_all_button_title, this.view_all_client_route, buildUnknownFields());
                default:
                    return new PrepurchaseAfterpayAppletData.AppletRow.Cell.Option(this.title, this.no_activity_subtitle, this.load_failure_subtitle, this.view_all_button_title, this.view_all_client_route, buildUnknownFields());
            }
        }
    }

    static {
        ActivitySection$Companion$ADAPTER$1 activitySection$Companion$ADAPTER$1 = new ActivitySection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySection.class), "type.googleapis.com/squareup.cash.earnings.ActivitySection", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = activitySection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activitySection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySection(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.no_activity_subtitle = localizedString2;
        this.load_failure_subtitle = localizedString3;
        this.view_all_button_title = localizedString4;
        this.view_all_client_route = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySection)) {
            return false;
        }
        ActivitySection activitySection = (ActivitySection) obj;
        return Intrinsics.areEqual(unknownFields(), activitySection.unknownFields()) && Intrinsics.areEqual(this.title, activitySection.title) && Intrinsics.areEqual(this.no_activity_subtitle, activitySection.no_activity_subtitle) && Intrinsics.areEqual(this.load_failure_subtitle, activitySection.load_failure_subtitle) && Intrinsics.areEqual(this.view_all_button_title, activitySection.view_all_button_title) && Intrinsics.areEqual(this.view_all_client_route, activitySection.view_all_client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.no_activity_subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.load_failure_subtitle;
        int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        LocalizedString localizedString4 = this.view_all_button_title;
        int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
        String str = this.view_all_client_route;
        int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.no_activity_subtitle = this.no_activity_subtitle;
        builder.load_failure_subtitle = this.load_failure_subtitle;
        builder.view_all_button_title = this.view_all_button_title;
        builder.view_all_client_route = this.view_all_client_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.no_activity_subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("no_activity_subtitle=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.load_failure_subtitle;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("load_failure_subtitle=", localizedString3, arrayList);
        }
        LocalizedString localizedString4 = this.view_all_button_title;
        if (localizedString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("view_all_button_title=", localizedString4, arrayList);
        }
        String str = this.view_all_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "view_all_client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySection{", "}", 0, null, null, 56);
    }
}
