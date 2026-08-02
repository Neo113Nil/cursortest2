package com.squareup.protos.franklin.investing.resources;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
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

/* loaded from: classes.dex */
public final class EquityDiscoveryAnimationTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EquityDiscoveryAnimationTile> CREATOR;
    public final String accent_color;
    public final String image_url;
    public final String name;
    public final String token;

    static {
        EquityDiscoveryAnimationTile$Companion$ADAPTER$1 equityDiscoveryAnimationTile$Companion$ADAPTER$1 = new EquityDiscoveryAnimationTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EquityDiscoveryAnimationTile.class), "type.googleapis.com/squareup.franklin.investing.resources.EquityDiscoveryAnimationTile", Syntax.PROTO_2, null, "squareup/franklin/investing/resources.proto");
        ADAPTER = equityDiscoveryAnimationTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(equityDiscoveryAnimationTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityDiscoveryAnimationTile(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.image_url = str2;
        this.accent_color = str3;
        this.name = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EquityDiscoveryAnimationTile)) {
            return false;
        }
        EquityDiscoveryAnimationTile equityDiscoveryAnimationTile = (EquityDiscoveryAnimationTile) obj;
        return Intrinsics.areEqual(unknownFields(), equityDiscoveryAnimationTile.unknownFields()) && Intrinsics.areEqual(this.token, equityDiscoveryAnimationTile.token) && Intrinsics.areEqual(this.image_url, equityDiscoveryAnimationTile.image_url) && Intrinsics.areEqual(this.accent_color, equityDiscoveryAnimationTile.accent_color) && Intrinsics.areEqual(this.name, equityDiscoveryAnimationTile.name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.image_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.accent_color;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.name;
        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolOwner.Builder builder = new PoolOwner.Builder(20);
        builder.customer_token = this.token;
        builder.full_name = this.image_url;
        builder.profile_photo_url = this.accent_color;
        builder.cashtag = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.image_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "image_url=", arrayList);
        }
        String str3 = this.accent_color;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accent_color=", arrayList);
        }
        String str4 = this.name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquityDiscoveryAnimationTile{", "}", 0, null, null, 56);
    }
}
