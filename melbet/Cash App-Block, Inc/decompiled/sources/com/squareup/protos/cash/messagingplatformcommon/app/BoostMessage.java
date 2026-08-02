package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
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
public final class BoostMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BoostMessage> CREATOR;
    public final String boost_token;
    public final String ml_boost_identifier;

    static {
        BoostMessage$Companion$ADAPTER$1 boostMessage$Companion$ADAPTER$1 = new BoostMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BoostMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.BoostMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = boostMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(boostMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoostMessage(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.boost_token = str;
        this.ml_boost_identifier = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostMessage)) {
            return false;
        }
        BoostMessage boostMessage = (BoostMessage) obj;
        return Intrinsics.areEqual(unknownFields(), boostMessage.unknownFields()) && Intrinsics.areEqual(this.boost_token, boostMessage.boost_token) && Intrinsics.areEqual(this.ml_boost_identifier, boostMessage.ml_boost_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.boost_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.ml_boost_identifier;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(28);
        builder.given_name = this.boost_token;
        builder.family_name = this.ml_boost_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.boost_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "boost_token=", arrayList);
        }
        String str2 = this.ml_boost_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ml_boost_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BoostMessage{", "}", 0, null, null, 56);
    }
}
