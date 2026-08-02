package squareup.cash.earnings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class EarnerModeTool extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarnerModeTool> CREATOR;
    public final String client_route;
    public final Instant earner_mode_ends_at;
    public final EarnerModeSheetData earner_mode_sheet_data;
    public final Boolean earner_mode_state;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    static {
        EarnerModeTool$Companion$ADAPTER$1 earnerModeTool$Companion$ADAPTER$1 = new EarnerModeTool$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarnerModeTool.class), "type.googleapis.com/squareup.cash.earnings.EarnerModeTool", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = earnerModeTool$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earnerModeTool$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnerModeTool(LocalizedString localizedString, LocalizedString localizedString2, Boolean bool, String str, EarnerModeSheetData earnerModeSheetData, Instant instant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.earner_mode_state = bool;
        this.client_route = str;
        this.earner_mode_sheet_data = earnerModeSheetData;
        this.earner_mode_ends_at = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarnerModeTool)) {
            return false;
        }
        EarnerModeTool earnerModeTool = (EarnerModeTool) obj;
        return Intrinsics.areEqual(unknownFields(), earnerModeTool.unknownFields()) && Intrinsics.areEqual(this.title, earnerModeTool.title) && Intrinsics.areEqual(this.subtitle, earnerModeTool.subtitle) && Intrinsics.areEqual(this.earner_mode_state, earnerModeTool.earner_mode_state) && Intrinsics.areEqual(this.client_route, earnerModeTool.client_route) && Intrinsics.areEqual(this.earner_mode_sheet_data, earnerModeTool.earner_mode_sheet_data) && Intrinsics.areEqual(this.earner_mode_ends_at, earnerModeTool.earner_mode_ends_at);
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
        Boolean bool = this.earner_mode_state;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.client_route;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        EarnerModeSheetData earnerModeSheetData = this.earner_mode_sheet_data;
        int hashCode6 = (hashCode5 + (earnerModeSheetData != null ? earnerModeSheetData.hashCode() : 0)) * 37;
        Instant instant = this.earner_mode_ends_at;
        int hashCode7 = hashCode6 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(2);
        builder.navigate = this.title;
        builder.set_view_state_value = this.subtitle;
        builder.open_url = this.earner_mode_state;
        builder.compound_action = this.client_route;
        builder.submit = this.earner_mode_sheet_data;
        builder.collection_mutation = this.earner_mode_ends_at;
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
        Boolean bool = this.earner_mode_state;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("earner_mode_state=", bool, arrayList);
        }
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        EarnerModeSheetData earnerModeSheetData = this.earner_mode_sheet_data;
        if (earnerModeSheetData != null) {
            arrayList.add("earner_mode_sheet_data=" + earnerModeSheetData);
        }
        Instant instant = this.earner_mode_ends_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("earner_mode_ends_at=", instant, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarnerModeTool{", "}", 0, null, null, 56);
    }
}
