package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
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
public final class SponsorTileContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SponsorTileContent> CREATOR;
    public final List avatar_customer_tokens;
    public final Long became_active_sponsor_at;
    public final LocalizedString localized_dependent_names;
    public final LocalizedString localized_pending_requests;

    static {
        SponsorTileContent$Companion$ADAPTER$1 sponsorTileContent$Companion$ADAPTER$1 = new SponsorTileContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SponsorTileContent.class), "type.googleapis.com/squareup.cash.aegis.sync_values.SponsorTileContent", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyTile.proto");
        ADAPTER = sponsorTileContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sponsorTileContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponsorTileContent(List list, LocalizedString localizedString, LocalizedString localizedString2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.localized_dependent_names = localizedString;
        this.localized_pending_requests = localizedString2;
        this.became_active_sponsor_at = l;
        this.avatar_customer_tokens = TransactorKt.immutableCopyOf("avatar_customer_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SponsorTileContent)) {
            return false;
        }
        SponsorTileContent sponsorTileContent = (SponsorTileContent) obj;
        return Intrinsics.areEqual(unknownFields(), sponsorTileContent.unknownFields()) && Intrinsics.areEqual(this.avatar_customer_tokens, sponsorTileContent.avatar_customer_tokens) && Intrinsics.areEqual(this.localized_dependent_names, sponsorTileContent.localized_dependent_names) && Intrinsics.areEqual(this.localized_pending_requests, sponsorTileContent.localized_pending_requests) && Intrinsics.areEqual(this.became_active_sponsor_at, sponsorTileContent.became_active_sponsor_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.avatar_customer_tokens);
        LocalizedString localizedString = this.localized_dependent_names;
        int hashCode = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.localized_pending_requests;
        int hashCode2 = (hashCode + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Long l = this.became_active_sponsor_at;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(24);
        builder.collection = this.avatar_customer_tokens;
        builder.template = this.localized_dependent_names;
        builder.item_variable = this.localized_pending_requests;
        builder.source = this.became_active_sponsor_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.avatar_customer_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("avatar_customer_tokens=", arrayList, list);
        }
        if (this.localized_dependent_names != null) {
            arrayList.add("localized_dependent_names=██");
        }
        LocalizedString localizedString = this.localized_pending_requests;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_pending_requests=", localizedString, arrayList);
        }
        Long l = this.became_active_sponsor_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("became_active_sponsor_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SponsorTileContent{", "}", 0, null, null, 56);
    }
}
