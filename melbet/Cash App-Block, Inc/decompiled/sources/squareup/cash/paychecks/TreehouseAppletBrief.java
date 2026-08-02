package squareup.cash.paychecks;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class TreehouseAppletBrief extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TreehouseAppletBrief> CREATOR;
    public final Long applet_text_rollover_date;
    public final Employer post_rollover_employer;
    public final LocalizedString post_rollover_markdown_text;
    public final Employer pre_rollover_employer;
    public final LocalizedString pre_rollover_markdown_text;

    static {
        TreehouseAppletBrief$Companion$ADAPTER$1 treehouseAppletBrief$Companion$ADAPTER$1 = new TreehouseAppletBrief$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TreehouseAppletBrief.class), "type.googleapis.com/squareup.cash.paychecks.TreehouseAppletBrief", Syntax.PROTO_2, null, "squareup/cash/paychecks/TreehouseAppletBrief.proto");
        ADAPTER = treehouseAppletBrief$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(treehouseAppletBrief$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreehouseAppletBrief(Long l, LocalizedString localizedString, LocalizedString localizedString2, Employer employer, Employer employer2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.applet_text_rollover_date = l;
        this.pre_rollover_markdown_text = localizedString;
        this.post_rollover_markdown_text = localizedString2;
        this.pre_rollover_employer = employer;
        this.post_rollover_employer = employer2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreehouseAppletBrief)) {
            return false;
        }
        TreehouseAppletBrief treehouseAppletBrief = (TreehouseAppletBrief) obj;
        return Intrinsics.areEqual(unknownFields(), treehouseAppletBrief.unknownFields()) && Intrinsics.areEqual(this.applet_text_rollover_date, treehouseAppletBrief.applet_text_rollover_date) && Intrinsics.areEqual(this.pre_rollover_markdown_text, treehouseAppletBrief.pre_rollover_markdown_text) && Intrinsics.areEqual(this.post_rollover_markdown_text, treehouseAppletBrief.post_rollover_markdown_text) && Intrinsics.areEqual(this.pre_rollover_employer, treehouseAppletBrief.pre_rollover_employer) && Intrinsics.areEqual(this.post_rollover_employer, treehouseAppletBrief.post_rollover_employer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.applet_text_rollover_date;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        LocalizedString localizedString = this.pre_rollover_markdown_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.post_rollover_markdown_text;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Employer employer = this.pre_rollover_employer;
        int hashCode5 = (hashCode4 + (employer != null ? employer.hashCode() : 0)) * 37;
        Employer employer2 = this.post_rollover_employer;
        int hashCode6 = hashCode5 + (employer2 != null ? employer2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(19);
        builder.key_path = this.applet_text_rollover_date;
        builder.get_transform = this.pre_rollover_markdown_text;
        builder.set_transform = this.post_rollover_markdown_text;
        builder.validation = this.pre_rollover_employer;
        builder.on_invalid = this.post_rollover_employer;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.applet_text_rollover_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("applet_text_rollover_date=", l, arrayList);
        }
        LocalizedString localizedString = this.pre_rollover_markdown_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("pre_rollover_markdown_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.post_rollover_markdown_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("post_rollover_markdown_text=", localizedString2, arrayList);
        }
        Employer employer = this.pre_rollover_employer;
        if (employer != null) {
            arrayList.add("pre_rollover_employer=" + employer);
        }
        Employer employer2 = this.post_rollover_employer;
        if (employer2 != null) {
            arrayList.add("post_rollover_employer=" + employer2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TreehouseAppletBrief{", "}", 0, null, null, 56);
    }
}
