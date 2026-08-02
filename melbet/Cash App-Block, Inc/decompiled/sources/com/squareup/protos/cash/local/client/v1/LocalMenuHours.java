package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
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
public final class LocalMenuHours extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuHours> CREATOR;
    public final String hours_formatted;
    public final String next_available_formatted;
    public final LocalMenuHoursState state;

    static {
        LocalMenuHours$Companion$ADAPTER$1 localMenuHours$Companion$ADAPTER$1 = new LocalMenuHours$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuHours.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuHours", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuHours$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuHours$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuHours(LocalMenuHoursState localMenuHoursState, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.state = localMenuHoursState;
        this.hours_formatted = str;
        this.next_available_formatted = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuHours)) {
            return false;
        }
        LocalMenuHours localMenuHours = (LocalMenuHours) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuHours.unknownFields()) && this.state == localMenuHours.state && Intrinsics.areEqual(this.hours_formatted, localMenuHours.hours_formatted) && Intrinsics.areEqual(this.next_available_formatted, localMenuHours.next_available_formatted);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalMenuHoursState localMenuHoursState = this.state;
        int hashCode2 = (hashCode + (localMenuHoursState != null ? localMenuHoursState.hashCode() : 0)) * 37;
        String str = this.hours_formatted;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.next_available_formatted;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(28);
        builder.group_image = this.state;
        builder.name = this.hours_formatted;
        builder.participants = this.next_available_formatted;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalMenuHoursState localMenuHoursState = this.state;
        if (localMenuHoursState != null) {
            arrayList.add("state=" + localMenuHoursState);
        }
        String str = this.hours_formatted;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "hours_formatted=", arrayList);
        }
        String str2 = this.next_available_formatted;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "next_available_formatted=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuHours{", "}", 0, null, null, 56);
    }
}
