package squareup.cash.savings.bespoke_elements;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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
import squareup.cash.bills.BillsApplet;
import squareup.cash.ui.arcade.elements.SectionHeader;

/* loaded from: classes10.dex */
public final class ActivitySection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySection> CREATOR;
    public final SectionHeader activity_section_header;
    public final LocalizedString load_failure_subtitle;
    public final LocalizedString no_activity_subtitle;

    static {
        ActivitySection$Companion$ADAPTER$1 activitySection$Companion$ADAPTER$1 = new ActivitySection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySection.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.ActivitySection", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/ActivitySection.proto");
        ADAPTER = activitySection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activitySection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySection(SectionHeader sectionHeader, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_section_header = sectionHeader;
        this.no_activity_subtitle = localizedString;
        this.load_failure_subtitle = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySection)) {
            return false;
        }
        ActivitySection activitySection = (ActivitySection) obj;
        return Intrinsics.areEqual(unknownFields(), activitySection.unknownFields()) && Intrinsics.areEqual(this.activity_section_header, activitySection.activity_section_header) && Intrinsics.areEqual(this.no_activity_subtitle, activitySection.no_activity_subtitle) && Intrinsics.areEqual(this.load_failure_subtitle, activitySection.load_failure_subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SectionHeader sectionHeader = this.activity_section_header;
        int hashCode2 = (hashCode + (sectionHeader != null ? sectionHeader.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.no_activity_subtitle;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.load_failure_subtitle;
        int hashCode4 = hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(26);
        builder.action = this.activity_section_header;
        builder.full_applet = this.no_activity_subtitle;
        builder.half_applet = this.load_failure_subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SectionHeader sectionHeader = this.activity_section_header;
        if (sectionHeader != null) {
            arrayList.add("activity_section_header=" + sectionHeader);
        }
        LocalizedString localizedString = this.no_activity_subtitle;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("no_activity_subtitle=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.load_failure_subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("load_failure_subtitle=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySection{", "}", 0, null, null, 56);
    }
}
