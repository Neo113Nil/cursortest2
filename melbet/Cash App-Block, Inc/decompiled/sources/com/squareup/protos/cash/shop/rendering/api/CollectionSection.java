package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.postcard.CardScheme;
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
public final class CollectionSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CollectionSection> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final CollectionSection$Content$RowSection content;
    public final String section_id;

    static {
        CollectionSection$Companion$ADAPTER$1 collectionSection$Companion$ADAPTER$1 = new CollectionSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CollectionSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.CollectionSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Section.proto");
        ADAPTER = collectionSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(collectionSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSection(AnalyticsEvent analyticsEvent, String str, CollectionSection$Content$RowSection collectionSection$Content$RowSection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.analytics_view_event = analyticsEvent;
        this.section_id = str;
        this.content = collectionSection$Content$RowSection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionSection)) {
            return false;
        }
        CollectionSection collectionSection = (CollectionSection) obj;
        return Intrinsics.areEqual(unknownFields(), collectionSection.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, collectionSection.analytics_view_event) && Intrinsics.areEqual(this.section_id, collectionSection.section_id) && Intrinsics.areEqual(this.content, collectionSection.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        String str = this.section_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        CollectionSection$Content$RowSection collectionSection$Content$RowSection = this.content;
        int hashCode4 = hashCode3 + (collectionSection$Content$RowSection != null ? collectionSection$Content$RowSection.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(19);
        builder.modules = this.analytics_view_event;
        builder.overflow_modules = this.section_id;
        builder.card_home_actions = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        String str = this.section_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "section_id=", arrayList);
        }
        CollectionSection$Content$RowSection collectionSection$Content$RowSection = this.content;
        if (collectionSection$Content$RowSection != null) {
            arrayList.add("content=" + collectionSection$Content$RowSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CollectionSection{", "}", 0, null, null, 56);
    }
}
