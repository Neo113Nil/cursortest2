package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Action;
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

/* loaded from: classes7.dex */
public final class AnalyticsData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AnalyticsData> CREATOR;
    public final AnalyticsEvent tap;
    public final AnalyticsEvent view;

    static {
        AnalyticsData$Companion$ADAPTER$1 analyticsData$Companion$ADAPTER$1 = new AnalyticsData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AnalyticsData.class), "type.googleapis.com/squareup.cash.genericelements.ui.AnalyticsData", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/Analytics.proto");
        ADAPTER = analyticsData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(analyticsData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsData(AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tap = analyticsEvent;
        this.view = analyticsEvent2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnalyticsData)) {
            return false;
        }
        AnalyticsData analyticsData = (AnalyticsData) obj;
        return Intrinsics.areEqual(unknownFields(), analyticsData.unknownFields()) && Intrinsics.areEqual(this.tap, analyticsData.tap) && Intrinsics.areEqual(this.view, analyticsData.view);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AnalyticsEvent analyticsEvent = this.tap;
        int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.view;
        int hashCode3 = hashCode2 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(17);
        builder.f1268type = this.tap;
        builder.details = this.view;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AnalyticsEvent analyticsEvent = this.tap;
        if (analyticsEvent != null) {
            arrayList.add("tap=" + analyticsEvent);
        }
        AnalyticsEvent analyticsEvent2 = this.view;
        if (analyticsEvent2 != null) {
            arrayList.add("view=" + analyticsEvent2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnalyticsData{", "}", 0, null, null, 56);
    }
}
