package com.squareup.protos.cash.whimsicard.syncentity;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.UiAlias;
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
public final class StatusDisplay extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StatusDisplay> CREATOR;
    public final Action primary_action;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    static {
        StatusDisplay$Companion$ADAPTER$1 statusDisplay$Companion$ADAPTER$1 = new StatusDisplay$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatusDisplay.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.StatusDisplay", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/payment_device_presentation.proto");
        ADAPTER = statusDisplay$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(statusDisplay$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusDisplay(LocalizedString localizedString, LocalizedString localizedString2, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.primary_action = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatusDisplay)) {
            return false;
        }
        StatusDisplay statusDisplay = (StatusDisplay) obj;
        return Intrinsics.areEqual(unknownFields(), statusDisplay.unknownFields()) && Intrinsics.areEqual(this.title, statusDisplay.title) && Intrinsics.areEqual(this.subtitle, statusDisplay.subtitle) && Intrinsics.areEqual(this.primary_action, statusDisplay.primary_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Action action = this.primary_action;
        int hashCode4 = hashCode3 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(5);
        builder.f1364type = this.title;
        builder.canonical_text = this.subtitle;
        builder.formatted = this.primary_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        Action action = this.primary_action;
        if (action != null) {
            arrayList.add("primary_action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StatusDisplay{", "}", 0, null, null, 56);
    }
}
