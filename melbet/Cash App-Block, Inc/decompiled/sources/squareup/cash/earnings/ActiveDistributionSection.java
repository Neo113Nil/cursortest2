package squareup.cash.earnings;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ActiveDistributionSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActiveDistributionSection> CREATOR;
    public final String client_route;
    public final LocalizedString edit_button_text;
    public final List stream_avatars;
    public final LocalizedString title_text;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String client_route;
        public LocalizedString edit_button_text;
        public List stream_avatars;
        public LocalizedString title_text;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ActiveDistributionSection(this.title_text, this.edit_button_text, this.client_route, this.stream_avatars, buildUnknownFields());
                default:
                    List list = this.stream_avatars;
                    return new PrepurchaseAfterpayAppletData.AppletRow.Cell.Options(this.title_text, this.edit_button_text, this.client_route, list, buildUnknownFields());
            }
        }
    }

    static {
        ActiveDistributionSection$Companion$ADAPTER$1 activeDistributionSection$Companion$ADAPTER$1 = new ActiveDistributionSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActiveDistributionSection.class), "type.googleapis.com/squareup.cash.earnings.ActiveDistributionSection", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = activeDistributionSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activeDistributionSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveDistributionSection(LocalizedString localizedString, LocalizedString localizedString2, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.client_route = str;
        this.title_text = localizedString;
        this.edit_button_text = localizedString2;
        this.stream_avatars = TransactorKt.immutableCopyOf("stream_avatars", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActiveDistributionSection)) {
            return false;
        }
        ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
        return Intrinsics.areEqual(unknownFields(), activeDistributionSection.unknownFields()) && Intrinsics.areEqual(this.client_route, activeDistributionSection.client_route) && Intrinsics.areEqual(this.title_text, activeDistributionSection.title_text) && Intrinsics.areEqual(this.edit_button_text, activeDistributionSection.edit_button_text) && Intrinsics.areEqual(this.stream_avatars, activeDistributionSection.stream_avatars);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.client_route;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.edit_button_text;
        int hashCode4 = this.stream_avatars.hashCode() + ((hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.client_route = this.client_route;
        builder.title_text = this.title_text;
        builder.edit_button_text = this.edit_button_text;
        builder.stream_avatars = this.stream_avatars;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        LocalizedString localizedString = this.title_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.edit_button_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("edit_button_text=", localizedString2, arrayList);
        }
        List list = this.stream_avatars;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("stream_avatars=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActiveDistributionSection{", "}", 0, null, null, 56);
    }
}
