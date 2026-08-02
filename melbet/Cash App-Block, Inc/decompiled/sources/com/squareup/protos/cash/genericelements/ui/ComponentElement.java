package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.transform.TransformationsKt;
import com.squareup.protos.cash.grantly.api.Card;
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
public final class ComponentElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ComponentElement> CREATOR;
    public final AnalyticsData analytics_data;
    public final TransformationsKt element;
    public final List refresh_triggers;
    public final AnalyticsEvent view_event;

    static {
        ComponentElement$Companion$ADAPTER$1 componentElement$Companion$ADAPTER$1 = new ComponentElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ComponentElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.ComponentElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = componentElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(componentElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentElement(TransformationsKt transformationsKt, AnalyticsData analyticsData, AnalyticsEvent analyticsEvent, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.element = transformationsKt;
        this.analytics_data = analyticsData;
        this.view_event = analyticsEvent;
        this.refresh_triggers = TransactorKt.immutableCopyOf("refresh_triggers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComponentElement)) {
            return false;
        }
        ComponentElement componentElement = (ComponentElement) obj;
        return Intrinsics.areEqual(unknownFields(), componentElement.unknownFields()) && Intrinsics.areEqual(this.element, componentElement.element) && Intrinsics.areEqual(this.analytics_data, componentElement.analytics_data) && Intrinsics.areEqual(this.view_event, componentElement.view_event) && Intrinsics.areEqual(this.refresh_triggers, componentElement.refresh_triggers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TransformationsKt transformationsKt = this.element;
        int hashCode2 = (hashCode + (transformationsKt != null ? transformationsKt.hashCode() : 0)) * 37;
        AnalyticsData analyticsData = this.analytics_data;
        int hashCode3 = (hashCode2 + (analyticsData != null ? analyticsData.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.view_event;
        int hashCode4 = this.refresh_triggers.hashCode() + ((hashCode3 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(12, false);
        builder.postal_code = this.element;
        builder.last_four_digits = this.analytics_data;
        builder.expiration = this.view_event;
        builder.ciphertext_ = this.refresh_triggers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TransformationsKt transformationsKt = this.element;
        if (transformationsKt != null) {
            arrayList.add("element=" + transformationsKt);
        }
        AnalyticsData analyticsData = this.analytics_data;
        if (analyticsData != null) {
            arrayList.add("analytics_data=" + analyticsData);
        }
        AnalyticsEvent analyticsEvent = this.view_event;
        if (analyticsEvent != null) {
            arrayList.add("view_event=" + analyticsEvent);
        }
        List list = this.refresh_triggers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("refresh_triggers=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ComponentElement{", "}", 0, null, null, 56);
    }
}
