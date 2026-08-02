package com.squareup.protos.cash.profiles;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
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
public final class DisplayNameDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayNameDetails> CREATOR;
    public final Long remaining_display_name_change_limit;

    static {
        DisplayNameDetails$Companion$ADAPTER$1 displayNameDetails$Companion$ADAPTER$1 = new DisplayNameDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayNameDetails.class), "type.googleapis.com/squareup.cash.profiles.DisplayNameDetails", Syntax.PROTO_2, null, "squareup/cash/profiles/DisplayNameDetails.proto");
        ADAPTER = displayNameDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(displayNameDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayNameDetails(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.remaining_display_name_change_limit = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayNameDetails)) {
            return false;
        }
        DisplayNameDetails displayNameDetails = (DisplayNameDetails) obj;
        return Intrinsics.areEqual(unknownFields(), displayNameDetails.unknownFields()) && Intrinsics.areEqual(this.remaining_display_name_change_limit, displayNameDetails.remaining_display_name_change_limit);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.remaining_display_name_change_limit;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(10);
        builder.cat_count = this.remaining_display_name_change_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.remaining_display_name_change_limit;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("remaining_display_name_change_limit=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayNameDetails{", "}", 0, null, null, 56);
    }
}
