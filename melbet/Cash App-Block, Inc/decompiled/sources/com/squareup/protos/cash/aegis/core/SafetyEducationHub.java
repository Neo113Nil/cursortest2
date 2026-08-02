package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.protos.cash.localization.LocalizedString;
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
public final class SafetyEducationHub extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SafetyEducationHub> CREATOR;
    public final List colored_title_segments;
    public final LocalizedString navigation_title;
    public final List pages;
    public final List tiles;

    static {
        SafetyEducationHub$Companion$ADAPTER$1 safetyEducationHub$Companion$ADAPTER$1 = new SafetyEducationHub$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SafetyEducationHub.class), "type.googleapis.com/squareup.cash.aegis.core.SafetyEducationHub", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = safetyEducationHub$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(safetyEducationHub$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyEducationHub(LocalizedString localizedString, List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.navigation_title = localizedString;
        this.colored_title_segments = TransactorKt.immutableCopyOf("colored_title_segments", list);
        this.tiles = TransactorKt.immutableCopyOf("tiles", list2);
        this.pages = TransactorKt.immutableCopyOf("pages", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafetyEducationHub)) {
            return false;
        }
        SafetyEducationHub safetyEducationHub = (SafetyEducationHub) obj;
        return Intrinsics.areEqual(unknownFields(), safetyEducationHub.unknownFields()) && Intrinsics.areEqual(this.navigation_title, safetyEducationHub.navigation_title) && Intrinsics.areEqual(this.colored_title_segments, safetyEducationHub.colored_title_segments) && Intrinsics.areEqual(this.tiles, safetyEducationHub.tiles) && Intrinsics.areEqual(this.pages, safetyEducationHub.pages);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.navigation_title;
        int hashCode2 = this.pages.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.colored_title_segments), 37, this.tiles);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(23);
        builder.collection = this.navigation_title;
        builder.template = this.colored_title_segments;
        builder.item_variable = this.tiles;
        builder.source = this.pages;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.navigation_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("navigation_title=", localizedString, arrayList);
        }
        List list = this.colored_title_segments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("colored_title_segments=", arrayList, list);
        }
        List list2 = this.tiles;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tiles=", arrayList, list2);
        }
        List list3 = this.pages;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pages=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SafetyEducationHub{", "}", 0, null, null, 56);
    }
}
