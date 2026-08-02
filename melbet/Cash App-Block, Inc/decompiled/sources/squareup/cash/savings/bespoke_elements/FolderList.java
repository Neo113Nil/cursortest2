package squareup.cash.savings.bespoke_elements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.person.Alias;
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
import squareup.cash.analytics.CdfEvent;
import squareup.cash.paychecks.Deduction;
import squareup.cash.savings.action.ClientRouteTemplate;

/* loaded from: classes10.dex */
public final class FolderList extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FolderList> CREATOR;
    public final String general_folder_tap_client_route;
    public final LocalizedString general_savings_body;
    public final LocalizedString general_savings_label;
    public final LocalizedTemplateString goal_folder_body_template;
    public final LocalizedString goal_folder_completed_body;
    public final ClientRouteTemplate goal_folder_tap_client_route_template;
    public final CdfEvent tap_cdf_event;

    public final class LocalizedTemplateString extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalizedTemplateString> CREATOR;

        /* renamed from: android, reason: collision with root package name */
        public final LocalizedString f1645android;
        public final Long argument_count;
        public final LocalizedString ios;
        public final LocalizedString web;

        static {
            FolderList$LocalizedTemplateString$Companion$ADAPTER$1 folderList$LocalizedTemplateString$Companion$ADAPTER$1 = new FolderList$LocalizedTemplateString$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalizedTemplateString.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.FolderList.LocalizedTemplateString", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/FolderList.proto");
            ADAPTER = folderList$LocalizedTemplateString$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(folderList$LocalizedTemplateString$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalizedTemplateString(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1645android = localizedString;
            this.ios = localizedString2;
            this.web = localizedString3;
            this.argument_count = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalizedTemplateString)) {
                return false;
            }
            LocalizedTemplateString localizedTemplateString = (LocalizedTemplateString) obj;
            return Intrinsics.areEqual(unknownFields(), localizedTemplateString.unknownFields()) && Intrinsics.areEqual(this.f1645android, localizedTemplateString.f1645android) && Intrinsics.areEqual(this.ios, localizedTemplateString.ios) && Intrinsics.areEqual(this.web, localizedTemplateString.web) && Intrinsics.areEqual(this.argument_count, localizedTemplateString.argument_count);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.f1645android;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.ios;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.web;
            int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            Long l = this.argument_count;
            int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(21);
            builder.description = this.f1645android;
            builder.note = this.ios;
            builder.amount = this.web;
            builder.tint_color = this.argument_count;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.f1645android;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("android=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.ios;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("ios=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.web;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("web=", localizedString3, arrayList);
            }
            Long l = this.argument_count;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("argument_count=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalizedTemplateString{", "}", 0, null, null, 56);
        }
    }

    static {
        FolderList$Companion$ADAPTER$1 folderList$Companion$ADAPTER$1 = new FolderList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FolderList.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.FolderList", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/FolderList.proto");
        ADAPTER = folderList$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(folderList$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderList(LocalizedString localizedString, LocalizedString localizedString2, LocalizedTemplateString localizedTemplateString, ClientRouteTemplate clientRouteTemplate, String str, LocalizedString localizedString3, CdfEvent cdfEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.general_savings_label = localizedString;
        this.general_savings_body = localizedString2;
        this.goal_folder_body_template = localizedTemplateString;
        this.goal_folder_tap_client_route_template = clientRouteTemplate;
        this.general_folder_tap_client_route = str;
        this.goal_folder_completed_body = localizedString3;
        this.tap_cdf_event = cdfEvent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FolderList)) {
            return false;
        }
        FolderList folderList = (FolderList) obj;
        return Intrinsics.areEqual(unknownFields(), folderList.unknownFields()) && Intrinsics.areEqual(this.general_savings_label, folderList.general_savings_label) && Intrinsics.areEqual(this.general_savings_body, folderList.general_savings_body) && Intrinsics.areEqual(this.goal_folder_body_template, folderList.goal_folder_body_template) && Intrinsics.areEqual(this.goal_folder_tap_client_route_template, folderList.goal_folder_tap_client_route_template) && Intrinsics.areEqual(this.general_folder_tap_client_route, folderList.general_folder_tap_client_route) && Intrinsics.areEqual(this.goal_folder_completed_body, folderList.goal_folder_completed_body) && Intrinsics.areEqual(this.tap_cdf_event, folderList.tap_cdf_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.general_savings_label;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.general_savings_body;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedTemplateString localizedTemplateString = this.goal_folder_body_template;
        int hashCode4 = (hashCode3 + (localizedTemplateString != null ? localizedTemplateString.hashCode() : 0)) * 37;
        ClientRouteTemplate clientRouteTemplate = this.goal_folder_tap_client_route_template;
        int hashCode5 = (hashCode4 + (clientRouteTemplate != null ? clientRouteTemplate.hashCode() : 0)) * 37;
        String str = this.general_folder_tap_client_route;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.goal_folder_completed_body;
        int hashCode7 = (hashCode6 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.tap_cdf_event;
        int hashCode8 = hashCode7 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(29, false);
        builder.f1407type = this.general_savings_label;
        builder.value = this.general_savings_body;
        builder.first_verified_at_ms = this.goal_folder_body_template;
        builder.last_verified_at_ms = this.goal_folder_tap_client_route_template;
        builder.scope = this.general_folder_tap_client_route;
        builder.created_at = this.goal_folder_completed_body;
        builder.updated_at = this.tap_cdf_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.general_savings_label;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("general_savings_label=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.general_savings_body;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("general_savings_body=", localizedString2, arrayList);
        }
        LocalizedTemplateString localizedTemplateString = this.goal_folder_body_template;
        if (localizedTemplateString != null) {
            arrayList.add("goal_folder_body_template=" + localizedTemplateString);
        }
        ClientRouteTemplate clientRouteTemplate = this.goal_folder_tap_client_route_template;
        if (clientRouteTemplate != null) {
            arrayList.add("goal_folder_tap_client_route_template=" + clientRouteTemplate);
        }
        String str = this.general_folder_tap_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "general_folder_tap_client_route=", arrayList);
        }
        LocalizedString localizedString3 = this.goal_folder_completed_body;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("goal_folder_completed_body=", localizedString3, arrayList);
        }
        CdfEvent cdfEvent = this.tap_cdf_event;
        if (cdfEvent != null) {
            arrayList.add("tap_cdf_event=" + cdfEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FolderList{", "}", 0, null, null, 56);
    }
}
