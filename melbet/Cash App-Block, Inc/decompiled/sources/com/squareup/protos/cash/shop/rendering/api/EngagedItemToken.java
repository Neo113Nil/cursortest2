package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.protos.cash.pools.ListPoolsRequest;
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
public final class EngagedItemToken extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EngagedItemToken> CREATOR;
    public final ErrorEvent.Meta.Companion token;

    static {
        EngagedItemToken$Companion$ADAPTER$1 engagedItemToken$Companion$ADAPTER$1 = new EngagedItemToken$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EngagedItemToken.class), "type.googleapis.com/squareup.cash.shop.rendering.api.EngagedItemToken", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
        ADAPTER = engagedItemToken$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(engagedItemToken$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngagedItemToken(ErrorEvent.Meta.Companion companion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = companion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EngagedItemToken)) {
            return false;
        }
        EngagedItemToken engagedItemToken = (EngagedItemToken) obj;
        return Intrinsics.areEqual(unknownFields(), engagedItemToken.unknownFields()) && Intrinsics.areEqual(this.token, engagedItemToken.token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ErrorEvent.Meta.Companion companion = this.token;
        int hashCode2 = hashCode + (companion != null ? companion.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(18);
        builder.pool_lifecycle_filter = this.token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ErrorEvent.Meta.Companion companion = this.token;
        if (companion != null) {
            arrayList.add("token=" + companion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EngagedItemToken{", "}", 0, null, null, 56);
    }

    public /* synthetic */ EngagedItemToken(ErrorEvent.Meta.Companion companion) {
        this(companion, ByteString.EMPTY);
    }
}
