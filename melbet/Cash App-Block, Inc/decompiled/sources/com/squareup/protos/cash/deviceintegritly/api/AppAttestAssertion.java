package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.EncryptedCardData;
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
public final class AppAttestAssertion extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppAttestAssertion> CREATOR;
    public final String key_identifier;
    public final ByteString payload;

    static {
        AppAttestAssertion$Companion$ADAPTER$1 appAttestAssertion$Companion$ADAPTER$1 = new AppAttestAssertion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppAttestAssertion.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.AppAttestAssertion", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/app_attest.proto");
        ADAPTER = appAttestAssertion$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appAttestAssertion$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAttestAssertion(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.key_identifier = str;
        this.payload = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppAttestAssertion)) {
            return false;
        }
        AppAttestAssertion appAttestAssertion = (AppAttestAssertion) obj;
        return Intrinsics.areEqual(unknownFields(), appAttestAssertion.unknownFields()) && Intrinsics.areEqual(this.key_identifier, appAttestAssertion.key_identifier) && Intrinsics.areEqual(this.payload, appAttestAssertion.payload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.key_identifier;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.payload;
        int hashCode3 = hashCode2 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EncryptedCardData.Builder builder = new EncryptedCardData.Builder(2);
        builder.encrypted_ephemeral_key = this.key_identifier;
        builder.encrypted_card_info = this.payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.key_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key_identifier=", arrayList);
        }
        ByteString byteString = this.payload;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("payload=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppAttestAssertion{", "}", 0, null, null, 56);
    }
}
