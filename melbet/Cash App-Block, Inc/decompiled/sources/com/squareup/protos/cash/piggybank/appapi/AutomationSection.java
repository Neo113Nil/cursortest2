package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SyncContactsRequest;
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

/* loaded from: classes7.dex */
public final class AutomationSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AutomationSection> CREATOR;
    public final List references;
    public final String title;
    public final List ui_specification;

    static {
        AutomationSection$Companion$ADAPTER$1 automationSection$Companion$ADAPTER$1 = new AutomationSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AutomationSection.class), "type.googleapis.com/squareup.cash.piggybank.appapi.AutomationSection", Syntax.PROTO_2, null, "squareup/cash/app/get_savings_overview.proto");
        ADAPTER = automationSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(automationSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomationSection(String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.title = str;
        this.references = TransactorKt.immutableCopyOf("references", list);
        this.ui_specification = TransactorKt.immutableCopyOf("ui_specification", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutomationSection)) {
            return false;
        }
        AutomationSection automationSection = (AutomationSection) obj;
        return Intrinsics.areEqual(unknownFields(), automationSection.unknownFields()) && Intrinsics.areEqual(this.title, automationSection.title) && Intrinsics.areEqual(this.references, automationSection.references) && Intrinsics.areEqual(this.ui_specification, automationSection.ui_specification);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = this.ui_specification.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.references);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(7, false);
        builder.sync_token = this.title;
        builder.add_hashed_aliases = this.references;
        builder.remove_hashed_aliases = this.ui_specification;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        List list = this.references;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("references=", arrayList, list);
        }
        List list2 = this.ui_specification;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("ui_specification=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AutomationSection{", "}", 0, null, null, 56);
    }
}
