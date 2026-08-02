package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.money.elements.BookletTile;
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
public final class SafetyEducationHubTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SafetyEducationHubTile> CREATOR;
    public final String id;
    public final BookletTile tile;

    static {
        SafetyEducationHubTile$Companion$ADAPTER$1 safetyEducationHubTile$Companion$ADAPTER$1 = new SafetyEducationHubTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SafetyEducationHubTile.class), "type.googleapis.com/squareup.cash.aegis.core.SafetyEducationHubTile", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = safetyEducationHubTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(safetyEducationHubTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyEducationHubTile(String str, BookletTile bookletTile, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.tile = bookletTile;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafetyEducationHubTile)) {
            return false;
        }
        SafetyEducationHubTile safetyEducationHubTile = (SafetyEducationHubTile) obj;
        return Intrinsics.areEqual(unknownFields(), safetyEducationHubTile.unknownFields()) && Intrinsics.areEqual(this.id, safetyEducationHubTile.id) && Intrinsics.areEqual(this.tile, safetyEducationHubTile.tile);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        BookletTile bookletTile = this.tile;
        int hashCode3 = hashCode2 + (bookletTile != null ? bookletTile.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(1);
        builder.errors = this.id;
        builder.result = this.tile;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        BookletTile bookletTile = this.tile;
        if (bookletTile != null) {
            arrayList.add("tile=" + bookletTile);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SafetyEducationHubTile{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SafetyEducationHubTile(String str, BookletTile bookletTile) {
        this(str, bookletTile, ByteString.EMPTY);
    }
}
