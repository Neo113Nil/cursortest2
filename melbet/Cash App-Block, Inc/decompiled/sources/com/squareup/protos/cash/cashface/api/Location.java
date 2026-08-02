package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Banner;
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
public final class Location extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Location> CREATOR;
    public final String display_location;

    static {
        Location$Companion$ADAPTER$1 location$Companion$ADAPTER$1 = new Location$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Location.class), "type.googleapis.com/squareup.cash.cashface.api.Location", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = location$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(location$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Location(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_location = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Intrinsics.areEqual(unknownFields(), location.unknownFields()) && Intrinsics.areEqual(this.display_location, location.display_location);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_location;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(6);
        builder.banner_color = this.display_location;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.display_location != null) {
            arrayList.add("display_location=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Location{", "}", 0, null, null, 56);
    }
}
