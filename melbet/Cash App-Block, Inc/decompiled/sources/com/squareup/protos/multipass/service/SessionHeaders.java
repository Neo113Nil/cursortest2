package com.squareup.protos.multipass.service;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.protos.rewardly.ui.AppLinks;
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

/* loaded from: classes8.dex */
public final class SessionHeaders extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SessionHeaders> CREATOR;
    public final List acceptable_scopes;
    public final Headers headers;

    static {
        SessionHeaders$Companion$ADAPTER$1 sessionHeaders$Companion$ADAPTER$1 = new SessionHeaders$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SessionHeaders.class), "type.googleapis.com/squareup.multipass.service.SessionHeaders", Syntax.PROTO_2, null, "squareup/multipass/service/common.proto");
        ADAPTER = sessionHeaders$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sessionHeaders$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionHeaders(Headers headers, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.headers = headers;
        this.acceptable_scopes = TransactorKt.immutableCopyOf("acceptable_scopes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionHeaders)) {
            return false;
        }
        SessionHeaders sessionHeaders = (SessionHeaders) obj;
        return Intrinsics.areEqual(unknownFields(), sessionHeaders.unknownFields()) && Intrinsics.areEqual(this.headers, sessionHeaders.headers) && Intrinsics.areEqual(this.acceptable_scopes, sessionHeaders.acceptable_scopes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Headers headers = this.headers;
        int hashCode2 = this.acceptable_scopes.hashCode() + ((hashCode + (headers != null ? headers.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(19);
        builder.f1411android = this.headers;
        builder.ios = this.acceptable_scopes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.headers != null) {
            arrayList.add("headers=██");
        }
        List list = this.acceptable_scopes;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("acceptable_scopes=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SessionHeaders{", "}", 0, null, null, 56);
    }
}
