package com.squareup.protos.cash.badging.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
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
public final class BadgingData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BadgingData> CREATOR;
    public final List badges;

    static {
        BadgingData$Companion$ADAPTER$1 badgingData$Companion$ADAPTER$1 = new BadgingData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BadgingData.class), "type.googleapis.com/squareup.cash.badging.api.BadgingData", Syntax.PROTO_2, null, "squareup/cash/badging/api/models.proto");
        ADAPTER = badgingData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(badgingData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgingData(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.badges = TransactorKt.immutableCopyOf("badges", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BadgingData)) {
            return false;
        }
        BadgingData badgingData = (BadgingData) obj;
        return Intrinsics.areEqual(unknownFields(), badgingData.unknownFields()) && Intrinsics.areEqual(this.badges, badgingData.badges);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.badges.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(20, false);
        builder.colors = this.badges;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.badges;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("badges=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BadgingData{", "}", 0, null, null, 56);
    }
}
