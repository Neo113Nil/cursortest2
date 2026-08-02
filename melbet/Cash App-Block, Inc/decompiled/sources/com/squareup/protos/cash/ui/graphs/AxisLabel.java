package com.squareup.protos.cash.ui.graphs;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.SplitButtons;
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

/* loaded from: classes8.dex */
public final class AxisLabel extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AxisLabel> CREATOR;
    public final LocalizedString text;
    public final Long value;

    static {
        AxisLabel$Companion$ADAPTER$1 axisLabel$Companion$ADAPTER$1 = new AxisLabel$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AxisLabel.class), "type.googleapis.com/squareup.cash.ui.graphs.AxisLabel", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
        ADAPTER = axisLabel$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(axisLabel$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AxisLabel(LocalizedString localizedString, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = localizedString;
        this.value = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AxisLabel)) {
            return false;
        }
        AxisLabel axisLabel = (AxisLabel) obj;
        return Intrinsics.areEqual(unknownFields(), axisLabel.unknownFields()) && Intrinsics.areEqual(this.text, axisLabel.text) && Intrinsics.areEqual(this.value, axisLabel.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.text;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Long l = this.value;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(18);
        builder.primary_button = this.text;
        builder.secondary_button = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        Long l = this.value;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("value=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AxisLabel{", "}", 0, null, null, 56);
    }
}
