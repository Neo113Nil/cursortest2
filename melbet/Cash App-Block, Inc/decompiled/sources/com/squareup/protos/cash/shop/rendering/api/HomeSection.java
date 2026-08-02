package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.taply.app.v1.Allowed;
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
public final class HomeSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HomeSection> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final zzku content;
    public final SectionHeader section_header;
    public final String section_id;

    static {
        HomeSection$Companion$ADAPTER$1 homeSection$Companion$ADAPTER$1 = new HomeSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HomeSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.HomeSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Section.proto");
        ADAPTER = homeSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(homeSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSection(AnalyticsEvent analyticsEvent, SectionHeader sectionHeader, String str, zzku zzkuVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.analytics_view_event = analyticsEvent;
        this.section_header = sectionHeader;
        this.section_id = str;
        this.content = zzkuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeSection)) {
            return false;
        }
        HomeSection homeSection = (HomeSection) obj;
        return Intrinsics.areEqual(unknownFields(), homeSection.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, homeSection.analytics_view_event) && Intrinsics.areEqual(this.section_header, homeSection.section_header) && Intrinsics.areEqual(this.section_id, homeSection.section_id) && Intrinsics.areEqual(this.content, homeSection.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        SectionHeader sectionHeader = this.section_header;
        int hashCode3 = (hashCode2 + (sectionHeader != null ? sectionHeader.hashCode() : 0)) * 37;
        String str = this.section_id;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        zzku zzkuVar = this.content;
        int hashCode5 = hashCode4 + (zzkuVar != null ? zzkuVar.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(18);
        builder.card_encryption_data = this.analytics_view_event;
        builder.device_metadata = this.section_header;
        builder.customer_token_hash_email = this.section_id;
        builder.success_screen = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        SectionHeader sectionHeader = this.section_header;
        if (sectionHeader != null) {
            arrayList.add("section_header=" + sectionHeader);
        }
        String str = this.section_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "section_id=", arrayList);
        }
        zzku zzkuVar = this.content;
        if (zzkuVar != null) {
            arrayList.add("content=" + zzkuVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HomeSection{", "}", 0, null, null, 56);
    }
}
